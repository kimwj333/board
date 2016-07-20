package wj.kim.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import wj.kim.board.model.Article;
import wj.kim.board.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	// 1. 회원가입 폼
    @RequestMapping(value="/addArticle", method=RequestMethod.GET)
    public String addArticle() {
        return "addArticle";
    }
    
    // 2. 회원가입
    @RequestMapping(value="/addArticle", method=RequestMethod.POST)
    public String addArticle(Article article) {
    	articleService.addArticle(article);
        return "redirect:/articleList";
    }

    
    // content
    @RequestMapping(value="/articleContent", method=RequestMethod.GET)
    public String contentArticle(int article, Model model) {
    	Article articlep = new Article();
    	articlep.setArticleNo(article);
    	Article articleo = articleService.articleContent(articlep);
    	model.addAttribute("articleo", articleo);
    	return "articleContent";
    }
    
    
	// articleList
    @RequestMapping(value="/articleList", method=RequestMethod.GET)
    public String articleList(Model model,
                @RequestParam(value="page", defaultValue="1") int page,
                @RequestParam(value="word", required=false) String word) {
        List<Article> articleList = articleService.getArticleList(page, word);
        model.addAttribute("articleList", articleList);
        model.addAttribute("page", page);
        model.addAttribute("lastPage", articleService.getLastPage());
        return "articleList";
    }
    
    
}
