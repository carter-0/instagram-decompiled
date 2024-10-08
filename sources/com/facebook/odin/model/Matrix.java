package com.facebook.odin.model;

import X.0Yh;
import X.0qQ;
import X.AnonymousClass00P;
import X.C255463uA;
import X.C2591940t;
import X.C2592440y;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class Matrix {
    public static final C255463uA[] A01 = {new C2592440y(new 0Yh(float[].class), C2591940t.A00)};
    public static final Companion Companion = new Object();
    public final float[][] A00;

    public final class Companion {
        public final C255463uA serializer() {
            return Matrix$$serializer.INSTANCE;
        }
    }

    public Matrix(float[][] fArr) {
        0qQ.A0B(fArr, 1);
        this.A00 = fArr;
    }

    public /* synthetic */ Matrix(float[][] fArr, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(Matrix$$serializer.descriptor, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = fArr;
        }
    }
}
