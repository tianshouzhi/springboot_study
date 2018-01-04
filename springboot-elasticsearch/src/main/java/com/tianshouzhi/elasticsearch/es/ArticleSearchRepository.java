package com.tianshouzhi.elasticsearch.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.tianshouzhi.elasticsearch.domain.Article;

/**
 * Created by tianshouzhi on 2018/1/4.
 */
public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}
