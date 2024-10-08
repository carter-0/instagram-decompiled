package com.fasterxml.jackson.databind.ser.std;

import X.17Z;
import X.AnonymousClass4eE;
import X.AnonymousClass7TF;
import X.C268894eF;
import X.C269504fE;
import X.Pxi;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class StdArraySerializers$DoubleArraySerializer extends ArraySerializerBase {
    public static final C268894eF A00 = AnonymousClass4eE.A0A.A0C(Double.TYPE);

    public StdArraySerializers$DoubleArraySerializer() {
        super(double[].class);
    }

    public final /* bridge */ /* synthetic */ void A0A(17Z r5, C269504fE r6, Object obj) {
        boolean booleanValue;
        double[] dArr = (double[]) obj;
        if (r3 == 1) {
            Boolean bool = this.A01;
            if (bool == null) {
                booleanValue = Pxi.A1U(r6);
            } else {
                booleanValue = bool.booleanValue();
            }
            if (booleanValue) {
                r5.A0e(dArr[0]);
                return;
            }
        }
        17Z.A08(r3, r3);
        r5.A0p(dArr, r3);
        for (double A0e : dArr) {
            r5.A0e(A0e);
        }
        r5.A0Y();
    }

    public final /* bridge */ /* synthetic */ boolean A0B(C269504fE r2, Object obj) {
        return AnonymousClass7TF.A1Q(((double[]) obj).length);
    }
}
