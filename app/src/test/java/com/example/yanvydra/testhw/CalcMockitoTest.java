package com.example.yanvydra.testhw;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CalcMockitoTest {

    private ICalc MCalc;
    private ICalc SCalc;

    @Captor
    ArgumentCaptor<Double> argumentCaptor;

    @Before
    public void setUp() {
        MCalc = mock(Calc.class);
        SCalc = spy(Calc.class);
    }

    @Test
    public void testAddMockito() {
        when(MCalc.add(1, 5)).thenReturn(6.0);
        assertEquals(MCalc.add(1, 5), 6.0);
    }

    @Test
    public void testSubMockito() {
        when(MCalc.sub(1, 5)).thenReturn(-4.0);
        assertEquals(MCalc.sub(1, 5), -4.0);
    }

    @Test
    public void testAddSpy() {
        assertEquals(SCalc.add(4, 5), 9.0);

        verify(SCalc).add(argumentCaptor.capture(),argumentCaptor.capture());

        List<Double> value = argumentCaptor.getAllValues();
        assertEquals(Double.valueOf(4), value.get(0));
        assertEquals(Double.valueOf(5), value.get(1));
    }

    @Test
    public void doRet(){
        doReturn(null).when(MCalc).sub(0,1);
    }

    @Test
    public void testSubSpy() {
        assertEquals(SCalc.sub(56, 56), 0.0);
    }




}