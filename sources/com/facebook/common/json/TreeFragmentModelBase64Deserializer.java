package com.facebook.common.json;

import X.16F;
import X.AnonymousClass00P;
import X.C269674fV;
import X.RV2;
import X.S8P;
import X.SN1;
import X.SS5;
import android.util.Base64;
import java.nio.ByteBuffer;

public class TreeFragmentModelBase64Deserializer extends FbJsonDeserializer {
    public Class A00;

    public final Object A0D(16F r5, C269674fV r6) {
        try {
            String A1Q = r5.A1Q();
            if (A1Q == null) {
                return null;
            }
            int A002 = RV2.A00(A1Q);
            if (A1Q.startsWith("type_tag:")) {
                A1Q = A1Q.substring(18);
            }
            return SN1.A00().deserializeTreeFromByteBuffer(ByteBuffer.wrap(Base64.decode(A1Q, 2)), this.A00, A002);
        } catch (Exception e) {
            SS5.A03(e);
            S8P.A00(r5, this.A00, e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
