package com.example.yanvydra.testhw;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CalcMockitoTest {

    private ICalc MCalc;
    private ICalc SCalc;

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
    }

    @Test
    public void testSubSpy() {
        assertEquals(SCalc.sub(56, 56), 0.0);
    }

}