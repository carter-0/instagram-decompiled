package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.C268964eM;
import X.C269674fV;
import X.C8853RCu;
import java.nio.ByteBuffer;

public class ByteBufferDeserializer extends StdScalarDeserializer {
    public ByteBufferDeserializer() {
        super(ByteBuffer.class);
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r3, C269674fV r4, Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C8853RCu rCu = new C8853RCu(byteBuffer);
        r3.A1F(r4.A02.A01.A00, rCu);
        rCu.close();
        return byteBuffer;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r2, C269674fV r3) {
        return ByteBuffer.wrap(r2.A1S(C268964eM.A01));
    }

    public final Integer A0I() {
        return AnonymousClass05K.A02;
    }
}
