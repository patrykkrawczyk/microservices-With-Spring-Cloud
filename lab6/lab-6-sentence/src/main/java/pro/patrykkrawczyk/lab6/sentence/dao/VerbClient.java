package pro.patrykkrawczyk.lab6.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-6-VERB")
public interface VerbClient extends WordClient {
}
