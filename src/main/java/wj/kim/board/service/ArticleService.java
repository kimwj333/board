package wj.kim.board.service;

import java.util.List;

import wj.kim.board.model.Article;

public interface ArticleService {
	int addArticle(Article article);
	
	Article articleContent(Article article);
	
	List<Article> getArticleList(int page, String word);

	 int getLastPage();
}
