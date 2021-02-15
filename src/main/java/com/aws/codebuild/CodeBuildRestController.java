package com.aws.codebuild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeBuildRestController {

    @GetMapping("/get/message")
    public String getMessage(){
        return "This is build successfully and deployed to Elastic beanstalk";
    }
}
