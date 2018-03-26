package com.moofuel.demo.sccontractmultipartissue.controller;

import com.moofuel.demo.sccontractmultipartissue.dto.Test;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class TestController {

    @PostMapping("/tests")
    public Test createNew(@RequestPart MultipartFile file1,
                          @RequestPart MultipartFile file2,
                          @RequestPart Test test) {
        return new Test("ok");
    }
}
