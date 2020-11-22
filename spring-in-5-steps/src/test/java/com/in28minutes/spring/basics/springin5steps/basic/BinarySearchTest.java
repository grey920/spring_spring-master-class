package com.in28minutes.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

/* 테스트 코드 작성
 * : 프로덕션 코드와 반드시 분리해서 테스트 코드를 작성해야 한다. 
 * 운영하는 코드와 섞이면 안되기 때문에 패키지를 분리한 것! (Source test java)
 * -> 디플로이 되는 코드와 절대 섞이지 않는 것을 보장받는다.
 *  */

// Load the context -> how?? 
@RunWith(SpringRunner.class) // SpringIn5StepsBasicApplication을 시작(런칭)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class) // configuration(SpringIn5StepsBasicApplication)을
                                                                      // 실행하는 것을 돕는다.
public class BinarySearchTest {

    // Get this bean from the context -> @Autowired
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        // call method on BinarySearch
        int actualResult = binarySearch.binarySearch(new int[] {}, 5);
        
        // BinarySearchImpl에서 리턴값을 하드코딩으로 3을 줬기 때문에 3을 리턴받는다. 
        
        // check if the value is correct
        assertEquals(3, actualResult);
        assertNotEquals(4, actualResult);
    }

}
