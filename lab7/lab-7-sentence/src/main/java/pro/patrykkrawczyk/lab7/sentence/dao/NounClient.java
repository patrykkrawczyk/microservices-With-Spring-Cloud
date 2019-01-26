package pro.patrykkrawczyk.lab7.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-7-NOUN")
public interface NounClient extends WordClient {
}
