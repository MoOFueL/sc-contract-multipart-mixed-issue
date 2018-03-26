package com.moofuel.demo.sccontractmultipartissue.contracts;

import com.moofuel.demo.sccontractmultipartissue.controller.TestController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContractBaseClass {

    @Autowired
    private TestController testController;

    @Before
    public void setUp() throws Exception {
        RestAssuredMockMvc.standaloneSetup(testController);
    }
}
