package pro.patrykkrawczyk.lab6.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-6-ADJECTIVE")
public interface AdjectiveClient extends WordClient {
}
