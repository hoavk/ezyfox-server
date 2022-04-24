package com.tvd12.ezyfoxserver.nio.testing.socket;

import java.nio.ByteBuffer;

import org.testng.annotations.Test;

import com.tvd12.ezyfoxserver.nio.socket.EzyNioSocketWriter;
import com.tvd12.test.base.BaseTest;
import com.tvd12.test.reflect.MethodInvoker;

public class EzyNioSocketWriterTest extends BaseTest {

    @Test
    public void test() {
        EzyNioSocketWriter writer = new EzyNioSocketWriter();
        ByteBuffer writeBuffer = MethodInvoker.create()
                .object(writer)
                .method("getWriteBuffer")
                .invoke(ByteBuffer.class);
        assert writeBuffer != null;
    }

}
