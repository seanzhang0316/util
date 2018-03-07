package io.github.seanzhang.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        Assert.assertEquals(MathUtils.add(1, 2), 3D);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(MathUtils.sub(4, 1), 3D);
    }

    @Test
    public void testMul() {
        Assert.assertEquals(MathUtils.mul(4, 1), 4D);
    }

    @Test
    public void testDiv() {
        Assert.assertEquals(MathUtils.div(100, 8), 12.5D);
    }

    @Test
    public void testDiv1() {
        Assert.assertEquals(MathUtils.div(100, 8, 1), 12.5D);
        Assert.assertEquals(MathUtils.div(100, 8, 0), 13D);
    }

    @Test
    public void testRound() {
        Assert.assertEquals(MathUtils.round(12.5D, 1), 12.5D);
        Assert.assertEquals(MathUtils.round(12.5D, 0), 13D);
        Assert.assertEquals(MathUtils.round(12.55D, 1), 12.6D);
        Assert.assertEquals(MathUtils.round(12.54D, 1), 12.5D);
    }
}