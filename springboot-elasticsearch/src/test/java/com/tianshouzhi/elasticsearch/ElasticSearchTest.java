package com.tianshouzhi.elasticsearch;

/**
 * Created by tianshouzhi on 2018/1/4.
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tianshouzhi.elasticsearch.domain.Article;
import com.tianshouzhi.elasticsearch.domain.Author;
import com.tianshouzhi.elasticsearch.domain.Tutorial;
import com.tianshouzhi.elasticsearch.es.ArticleSearchRepository;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Iterator;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ElasticSearchTest {
	@Autowired
	private ArticleSearchRepository articleSearchRepository;

	@Test
	public void testSaveArticleIndex() {
		Author author = new Author();
		author.setId(1L);
		author.setName("tianshouzhi");
		author.setRemark("java developer");
		Tutorial tutorial = new Tutorial();
		tutorial.setId(1L);
		tutorial.setName("elastic search");
		Article article = new Article();
		article.setId(1L);
		article.setTitle("springboot integreate elasticsearch");
		article.setAbstracts("springboot integreate elasticsearch is very easy");
		article.setTutorial(tutorial);
		article.setAuthor(author);
		article.setContent("elasticsearch based on lucene," + "spring-data-elastichsearch based on elaticsearch"
		      + ",this tutorial tell you how to integrete springboot with spring-data-elasticsearch");
		article.setPostTime(new Date());
		article.setClickCount(1L);
		articleSearchRepository.save(article);
	}

	@Test
	public void testSearch() throws JsonProcessingException {
		String queryString = "springboot";// 搜索关键字
		QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
		Iterable<Article> searchResult = articleSearchRepository.search(builder);
		Iterator<Article> iterator = searchResult.iterator();
		System.out.println("=================搜索结果================");
		while (iterator.hasNext()) {
			Article article = iterator.next();
			//格式化为json输出
			System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(article));
		}
	}
}
