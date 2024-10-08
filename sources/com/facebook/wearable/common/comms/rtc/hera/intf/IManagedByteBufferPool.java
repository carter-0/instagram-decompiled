package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.0sP;
import X.AnonymousClass00P;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

public interface IManagedByteBufferPool {
    IBuffer poll(long j);

    IBuffer poll(long j, TimeUnit timeUnit);

    public abstract class IBuffer implements AutoCloseable {
        public abstract void close();

        public abstract Object consume(0sP r1);

        public abstract void dispose();

        public abstract ByteBuffer getBuffer();

        public abstract int getLimit();

        public abstract void setLimit(int i);

        public IBuffer() {
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
