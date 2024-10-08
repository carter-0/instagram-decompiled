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
public final class OdinContext extends AnonymousClass0T0 {
    public static final OdinContext A05 = new OdinContext("identity", (Map) null, (Map) null, 30);
    public static final C255463uA[] A06;
    public static final Companion Companion = new Object();
    public final Type A00;
    public final String A01;
    public final Map A02;
    public final Map A03;
    public final Map A04;

    public final class Companion {
        public final C255463uA serializer() {
            return OdinContext$$serializer.INSTANCE;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.odin.model.OdinContext$Companion, java.lang.Object] */
    static {
        C258653zQ A002 = C258643zP.A00("com.facebook.odin.model.Type", Type.values());
        C255453u9 r3 = C255453u9.A01;
        A06 = new C255463uA[]{null, A002, new C258613zM(r3, C258663zR.A00), new C258613zM(r3, C258703zV.A00), new C258613zM(r3, r3)};
    }

    public OdinContext() {
        this((String) null, (Map) null, (Map) null, 31);
    }

    public /* synthetic */ OdinContext(String str, Map map, Map map2, int i) {
        Type type = null;
        LinkedHashMap linkedHashMap = null;
        str = (i & 1) != 0 ? "" : str;
        type = (i & 2) != 0 ? Type.SERVER_CONTEXT : type;
        map = (i & 4) != 0 ? new LinkedHashMap() : map;
        linkedHashMap = (i & 8) != 0 ? new LinkedHashMap() : linkedHashMap;
        map2 = (i & 16) != 0 ? new LinkedHashMap() : map2;
        0qQ.A0B(str, 1);
        0qQ.A0B(type, 2);
        0qQ.A0B(map, 3);
        0qQ.A0B(linkedHashMap, 4);
        0qQ.A0B(map2, 5);
        this.A01 = str;
        this.A00 = type;
        this.A03 = map;
        this.A02 = linkedHashMap;
        this.A04 = map2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OdinContext(id=");
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
        0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.odin.model.OdinContext");
        return 0qQ.A0K(this.A01, ((OdinContext) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public /* synthetic */ OdinContext(Type type, String str, Map map, Map map2, Map map3, int i) {
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
}
