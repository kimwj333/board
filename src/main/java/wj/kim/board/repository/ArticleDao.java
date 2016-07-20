package wj.kim.board.repository;

import java.util.List;
import java.util.Map;

import wj.kim.board.model.Article;

public interface ArticleDao {
	
	int insertArticle(Article article);
	
	Article articleContent(Article article);
	
	List<Article> selectArticleList(Map<String, Object> map);

	int selectTotalCount();
}
