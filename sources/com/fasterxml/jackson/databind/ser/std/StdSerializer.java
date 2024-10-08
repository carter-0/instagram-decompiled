package com.fasterxml.jackson.databind.ser.std;

import X.AnonymousClass00P;
import X.C13782Tgx;
import X.C13901TjO;
import X.C268854eA;
import X.C268894eF;
import X.C269294et;
import X.C269314ev;
import X.C269444f8;
import X.C269504fE;
import X.C8208QkH;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public abstract class StdSerializer extends JsonSerializer implements Serializable {
    public static final Object A01 = new Object();
    public final Class A00;

    public static final C269314ev A00(C13901TjO tjO, C269504fE r2, Class cls) {
        C269294et r0 = r2.A05;
        if (tjO != null) {
            return tjO.AVO(r0, cls);
        }
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((r5 instanceof X.C65181bG) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2.A05.A0D(X.C269424f6.WRAP_EXCEPTIONS) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C269504fE r2, java.lang.Object r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
        L_0x0000:
            boolean r0 = r5 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r5 = r5.getCause()
            goto L_0x0000
        L_0x000f:
            X.4fM[] r0 = X.C269574fL.A01
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0022
            X.4f6 r1 = X.C269424f6.WRAP_EXCEPTIONS
            X.4et r0 = r2.A05
            boolean r0 = r0.A0D(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002d
            boolean r0 = r5 instanceof X.C65181bG
            if (r0 != 0) goto L_0x0033
        L_0x002d:
            throw r5
        L_0x002e:
            if (r1 != 0) goto L_0x0033
            X.C269574fL.A0F(r5)
        L_0x0033:
            X.4iD r0 = X.AnonymousClass4iD.A02(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A01(X.4fE, java.lang.Object, java.lang.String, java.lang.Throwable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if ((r4 instanceof X.C65181bG) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2.A05.A0D(X.C269424f6.WRAP_EXCEPTIONS) != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C269504fE r2, java.lang.Object r3, java.lang.Throwable r4, int r5) {
        /*
        L_0x0000:
            boolean r0 = r4 instanceof java.lang.reflect.InvocationTargetException
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0000
        L_0x000f:
            X.4fM[] r0 = X.C269574fL.A01
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L_0x002d
            if (r2 == 0) goto L_0x0022
            X.4f6 r1 = X.C269424f6.WRAP_EXCEPTIONS
            X.4et r0 = r2.A05
            boolean r0 = r0.A0D(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002d
            boolean r0 = r4 instanceof X.C65181bG
            if (r0 != 0) goto L_0x0033
        L_0x002d:
            throw r4
        L_0x002e:
            if (r1 != 0) goto L_0x0033
            X.C269574fL.A0F(r4)
        L_0x0033:
            X.4iD r0 = X.AnonymousClass4iD.A03(r3, r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.StdSerializer.A02(X.4fE, java.lang.Object, java.lang.Throwable, int):void");
    }

    public final JsonSerializer A0C(C13901TjO tjO, JsonSerializer jsonSerializer, C269504fE r8) {
        C8208QkH BRS;
        Object A0g;
        Object obj = A01;
        Map map = (Map) r8.A0S(obj);
        if (map == null) {
            map = new IdentityHashMap();
            C269444f8 r0 = r8.A0B;
            Map map2 = r0.A01;
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                hashMap.put(obj, map);
                r0 = new C269444f8(r0.A00, hashMap);
            } else {
                map2.put(obj, map);
            }
            r8.A0B = r0;
        } else if (map.get(tjO) != null) {
            return jsonSerializer;
        }
        map.put(tjO, Boolean.TRUE);
        try {
            C268854eA A012 = r8.A05.A01();
            if (A012 != null && tjO != null && (BRS = tjO.BRS()) != null && (A0g = A012.A0g(BRS)) != null) {
                C13782Tgx A06 = r8.A06(A0g);
                C268894eF BZZ = A06.BZZ(r8.A05());
                if (jsonSerializer == null && BZZ.A00 != Object.class) {
                    jsonSerializer = r8.A0K(BZZ);
                }
                jsonSerializer = new StdDelegatingSerializer(BZZ, jsonSerializer, A06);
            } else if (jsonSerializer == null) {
                map.remove(tjO);
                return jsonSerializer;
            }
            return r8.A0F(tjO, jsonSerializer);
        } finally {
            map.remove(tjO);
        }
    }

    public final void A0D(C269504fE r4, Object obj) {
        int i = C269294et.A06;
        Class cls = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot resolve PropertyFilter with id '");
        sb.append(obj);
        sb.append("'; no FilterProvider configured");
        r4.A09(sb.toString(), cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public StdSerializer(C268894eF r2) {
        this.A00 = r2.A00;
    }

    public StdSerializer(StdSerializer stdSerializer) {
        this.A00 = stdSerializer.A00;
    }

    public StdSerializer(Class cls, boolean z) {
        this.A00 = cls;
    }

    public StdSerializer(Class cls) {
        this.A00 = cls;
    }
}
