package pro.patrykkrawczyk.lab6.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-6-ARTICLE")
public interface ArticleClient extends WordClient {
}
