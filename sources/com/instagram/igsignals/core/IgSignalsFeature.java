package com.instagram.igsignals.core;

import X.AnonymousClass00P;
import X.C20508Wso;
import X.C255463uA;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgSignalsFeature {
    public static final Companion Companion = new Object();
    public final double A00;
    public final int A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20508Wso.A00;
        }
    }

    public IgSignalsFeature(int i, String str, double d) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = d;
    }

    public /* synthetic */ IgSignalsFeature(int i, int i2, String str, double d) {
        if (7 != (i & 7)) {
            VJ6.A00(C20508Wso.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A01 = i2;
        this.A00 = d;
    }
}
