package pro.patrykkrawczyk.lab9.sentence.dao;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("LAB-9-SUBJECT")
public interface SubjectClient extends WordClient {
}
