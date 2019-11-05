package com.ctsi.upload;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wf156437@sina.com
 * @createTime 2019/11/4 20:18
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/upload")
public class UploadController {

    @RequestMapping("/get")
    String uploadFile(){
        return "upload";
    }

}
