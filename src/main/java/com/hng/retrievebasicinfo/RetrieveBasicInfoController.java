package com.hng.retrievebasicinfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class RetrieveBasicInfoController {

    @GetMapping("/basicinfo")
    public ResponseEntity<Map<String, String>> getBasicInfo() {
        Map<String, String> basicInfo = new HashMap<>();

        String email = "aniebietafia87@gmail.com";
        String currentDateTime = Instant.now().toString();
        currentDateTime = DateTimeFormatter.ISO_INSTANT.format(Instant.now()).replaceAll("\\.\\d{3,}Z$", "Z");
        String gitHubRepo = "https://github.com/HNG-12/retrieve-basic-info";

        basicInfo.put("email", email);
        basicInfo.put("current_datetime", currentDateTime);
        basicInfo.put("github_url", gitHubRepo);

        return ResponseEntity.ok(basicInfo);
    }
}
