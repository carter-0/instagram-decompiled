package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.AnonymousClass4eE;
import X.AnonymousClass7TF;
import X.C268894eF;
import X.C269504fE;
import X.Pxi;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class StdArraySerializers$ShortArraySerializer extends StdArraySerializers$TypedPrimitiveArraySerializer {
    public static final C268894eF A00 = AnonymousClass4eE.A0A.A0C(Short.TYPE);

    public StdArraySerializers$ShortArraySerializer() {
        super(short[].class);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r4, C269504fE r5, Object obj) {
        boolean booleanValue;
        short[] sArr = (short[]) obj;
        if (r2 == 1) {
            Boolean bool = this.A01;
            if (bool == null) {
                booleanValue = Pxi.A1U(r5);
            } else {
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                r4.A0g(sArr[0]);
                return;
            }
        }
        r4.A0p(sArr, r2);
        for (short A0g : sArr) {
            r4.A0g(A0g);
        }
        r4.A0Y();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((short[]) obj).length);
    }
}
