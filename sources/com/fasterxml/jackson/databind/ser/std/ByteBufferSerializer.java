package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.C268964eM;
import X.C269504fE;
import X.C8843RCj;
import java.nio.ByteBuffer;

public class ByteBufferSerializer extends StdScalarSerializer {
    public ByteBufferSerializer() {
        super(ByteBuffer.class);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r5, C269504fE r6, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.hasArray()) {
            int position = byteBuffer.position();
            r5.A0i(C268964eM.A01, byteBuffer.array(), byteBuffer.arrayOffset() + position, byteBuffer.limit() - position);
            return;
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        if (asReadOnlyBuffer.position() > 0) {
            asReadOnlyBuffer.rewind();
        }
        C8843RCj rCj = new C8843RCj(asReadOnlyBuffer);
        r5.A0X(C268964eM.A01, rCj, asReadOnlyBuffer.remaining());
        rCj.close();
    }
}
