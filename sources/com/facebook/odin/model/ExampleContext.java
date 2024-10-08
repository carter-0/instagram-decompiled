package com.facebook.odin.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C255453u9;
import X.C255463uA;
import X.C258613zM;
import X.C258643zP;
import X.C258653zQ;
import X.C258663zR;
import X.C258703zV;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class ExampleContext extends AnonymousClass0T0 {
    public static final ExampleContext A05 = new ExampleContext(Type.CLIENT_CONTEXT, "identity", 28);
    public static final C255463uA[] A06;
    public static final Companion Companion = new Object();
    public final Type A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final class Companion {
        public final C255463uA serializer() {
            return ExampleContext$$serializer.INSTANCE;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.odin.model.ExampleContext$Companion, java.lang.Object] */
    static {
        C258653zQ A002 = C258643zP.A00("com.facebook.odin.model.Type", Type.values());
        C255453u9 r3 = C255453u9.A01;
        A06 = new C255463uA[]{null, A002, new C258613zM(r3, C258663zR.A00), new C258613zM(r3, C258703zV.A00), new C258613zM(r3, r3)};
    }

    public ExampleContext() {
        this((Type) null, (String) null, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExampleContext(id=");
        sb.append(this.A01);
        sb.append(", type=");
        sb.append(this.A00);
        sb.append(", longMap=");
        sb.append(this.A03);
        sb.append(", doubleMap=");
        sb.append(this.A02);
        sb.append(", stringMap=");
        sb.append(this.A04);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!0qQ.A0K(cls, getClass())) {
            return false;
        }
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.odin.model.ExampleContext");
        return 0qQ.A0K(this.A01, ((ExampleContext) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public /* synthetic */ ExampleContext(Type type, String str, Map map, Map map2, Map map3, int i) {
        this.A01 = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.A00 = Type.SERVER_CONTEXT;
        } else {
            this.A00 = type;
        }
        if ((i & 4) == 0) {
            this.A03 = new LinkedHashMap();
        } else {
            this.A03 = map;
        }
        if ((i & 8) == 0) {
            this.A02 = new LinkedHashMap();
        } else {
            this.A02 = map2;
        }
        if ((i & 16) == 0) {
            this.A04 = new LinkedHashMap();
        } else {
            this.A04 = map3;
        }
    }

    public /* synthetic */ ExampleContext(Type type, String str, int i) {
        LinkedHashMap linkedHashMap = null;
        LinkedHashMap linkedHashMap2 = null;
        LinkedHashMap linkedHashMap3 = null;
        str = (i & 1) != 0 ? "" : str;
        type = (i & 2) != 0 ? Type.SERVER_CONTEXT : type;
        linkedHashMap = (i & 4) != 0 ? new LinkedHashMap() : linkedHashMap;
        linkedHashMap2 = (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap2;
        linkedHashMap3 = (i & 16) != 0 ? new LinkedHashMap() : linkedHashMap3;
        0qQ.A0B(str, 1);
        0qQ.A0B(type, 2);
        0qQ.A0B(linkedHashMap, 3);
        0qQ.A0B(linkedHashMap2, 4);
        0qQ.A0B(linkedHashMap3, 5);
        this.A01 = str;
        this.A00 = type;
        this.A03 = linkedHashMap;
        this.A02 = linkedHashMap2;
        this.A04 = linkedHashMap3;
    }
}
