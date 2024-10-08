package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.AnonymousClass4eE;
import X.AnonymousClass7TF;
import X.C268894eF;
import X.C269504fE;
import X.Pxi;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class StdArraySerializers$LongArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    public static final C268894eF A00 = AnonymousClass4eE.A0A.A0C(Long.TYPE);

    public StdArraySerializers$LongArraySerializer() {
        super(long[].class);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r5, C269504fE r6, Object obj) {
        boolean booleanValue;
        long[] jArr = (long[]) obj;
        if (r3 == 1) {
            Boolean bool = this.A01;
            if (bool == null) {
                booleanValue = Pxi.A1U(r6);
            } else {
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                r5.A0h(jArr[0]);
                return;
            }
        }
        17Z.A08(r3, r3);
        r5.A0p(jArr, r3);
        for (long A0h : jArr) {
            r5.A0h(A0h);
        }
        r5.A0Y();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((long[]) obj).length);
    }
}
