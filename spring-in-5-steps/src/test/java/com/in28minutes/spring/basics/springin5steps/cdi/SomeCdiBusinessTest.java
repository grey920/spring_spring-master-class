package com.in28minutes.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/* 테스트 코드 작성
 * : 프로덕션 코드와 반드시 분리해서 테스트 코드를 작성해야 한다. 
 * 운영하는 코드와 섞이면 안되기 때문에 패키지를 분리한 것! (Source test java)
 * -> 디플로이 되는 코드와 절대 섞이지 않는 것을 보장받는다.
 *  */

@RunWith(MockitoJUnitRunner.class) // SpringIn5StepsBasicApplication을 시작(런칭)
public class SomeCdiBusinessTest { // mockito로 테스트할때에는 spring context가 필요없다.

    // Inject Mock
    @InjectMocks
    SomeCdiBusiness business;

    // Create Mock
    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
        // when daoMock.getData() method is called return int[] {2,4}

        assertEquals(4, business.findGreatest());
    }
    
    @Test
    public void testBasicScenario_NoElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] { });
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }
    
    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 2 });
        assertEquals(2, business.findGreatest());
    }


}
