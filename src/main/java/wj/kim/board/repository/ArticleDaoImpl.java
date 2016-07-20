package wj.kim.board.repository;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import wj.kim.board.model.Article;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	private final String NS = "wj.kim.board.repository.ArticleMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int insertArticle(Article article) {
		return sqlSession.insert(
                NS+".insertArticle", article);
	}
	
	@Override
	public Article articleContent(Article article) {
		return sqlSession.selectOne(
				NS+".articleContent", article);
	}
	
	@Override
	public List<Article> selectArticleList(Map<String, Object> map) {
        
		return sqlSession.selectList(NS + ".selectArticleList", map);
    }
	
	@Override
    public int selectTotalCount() {
        return sqlSession.selectOne(NS + ".selectTotalCount");
    }
	
}
