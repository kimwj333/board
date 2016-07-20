package wj.kim.board.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wj.kim.board.model.Article;
import wj.kim.board.model.PageHelper;
import wj.kim.board.repository.ArticleDao;

@Service
public class ArticleServiceImpl implements ArticleService {
	private final int LINE_PER_PAGE = 10;
	
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public int addArticle(Article article) {
		return articleDao.insertArticle(article);
	}
	
	@Override
	public Article articleContent(Article article) {
		return articleDao.articleContent(article);
	}
	
	@Override
    public List<Article> getArticleList(int page, String word) {
        PageHelper pageHelper = new PageHelper(page, LINE_PER_PAGE);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pageHelper", pageHelper);
        map.put("word", word);
        return articleDao.selectArticleList(map);
    }
	
	@Override
    public int getLastPage() {
        return (int)(Math.ceil((double)articleDao.selectTotalCount()/LINE_PER_PAGE));
    }
	
}
