package pro.patrykkrawczyk.lab6.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-6-NOUN")
public interface NounClient extends WordClient {
}
