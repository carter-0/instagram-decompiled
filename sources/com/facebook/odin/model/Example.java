package com.facebook.odin.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass40T;
import X.C255453u9;
import X.C255463uA;
import java.util.HashMap;
import kotlinx.serialization.Serializable;

@Serializable
public final class Example extends AnonymousClass0T0 {
    public static final Example A03 = new Example(ExampleContext.A05, "identity", new HashMap());
    public static final C255463uA[] A04 = {null, null, new AnonymousClass40T(C255453u9.A01, FeatureData$$serializer.INSTANCE)};
    public static final Companion Companion = new Object();
    public final ExampleContext A00;
    public final String A01;
    public final HashMap A02;

    public final class Companion {
        public final C255463uA serializer() {
            return Example$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Example) {
                Example example = (Example) obj;
                if (!0qQ.A0K(this.A01, example.A01) || !0qQ.A0K(this.A00, example.A00) || !0qQ.A0K(this.A02, example.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00.hashCode()) * 31) + this.A02.hashCode();
    }

    public /* synthetic */ Example(ExampleContext exampleContext, String str, HashMap hashMap, int i) {
        this.A01 = (i & 1) == 0 ? "identity" : str;
        if ((i & 2) == 0) {
            this.A00 = ExampleContext.A05;
        } else {
            this.A00 = exampleContext;
        }
        if ((i & 4) == 0) {
            this.A02 = new HashMap();
        } else {
            this.A02 = hashMap;
        }
    }

    public Example(ExampleContext exampleContext, String str, HashMap hashMap) {
        0qQ.A0B(str, 1);
        0qQ.A0B(exampleContext, 2);
        0qQ.A0B(hashMap, 3);
        this.A01 = str;
        this.A00 = exampleContext;
        this.A02 = hashMap;
    }

    public Example() {
        this(ExampleContext.A05, "identity", new HashMap());
    }
}
