package pro.patrykkrawczyk.lab8.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-8-NOUN")
public interface NounClient extends WordClient {
}
