package com.fasterxml.jackson.databind.ser.std;

import X.002;
import X.16L;
import X.17Z;
import X.AnonymousClass00P;
import X.AnonymousClass4iD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10798RyK;
import X.C13901TjO;
import X.C268894eF;
import X.C269504fE;
import X.C269714fZ;
import X.C8208QkH;
import X.C8234Qkh;
import X.C8245Qkz;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public class JsonValueSerializer extends StdSerializer implements C269714fZ {
    public final C13901TjO A00;
    public final JsonSerializer A01;
    public final SPK A02;
    public final boolean A03;
    public final C268894eF A04;
    public final C8208QkH A05;
    public transient SIF A06;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        if (r2 != r0) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r14, X.C269504fE r15) {
        /*
            r13 = this;
            r6 = r13
            X.SPK r5 = r13.A02
            r1 = r5
            r3 = r14
            if (r5 == 0) goto L_0x000b
            X.SPK r5 = r5.A06(r14)
        L_0x000b:
            com.fasterxml.jackson.databind.JsonSerializer r9 = r13.A01
            if (r9 != 0) goto L_0x0068
            X.4ez r2 = X.C269354ez.USE_STATIC_TYPING
            X.4et r0 = r15.A05
            boolean r0 = r0.A09(r2)
            if (r0 != 0) goto L_0x0038
            X.4eF r0 = r13.A04
            java.lang.Class r0 = r0.A00
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L_0x0038
            X.TjO r0 = r13.A00
            if (r14 == r0) goto L_0x0037
            boolean r12 = r13.A03
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r7 = r2
            r8 = r14
            r10 = r5
            r11 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            return r2
        L_0x0037:
            return r13
        L_0x0038:
            X.4eF r0 = r13.A04
            com.fasterxml.jackson.databind.JsonSerializer r4 = r15.A0D(r14, r0)
            java.lang.Class r2 = r0.A00
            boolean r0 = r2.isPrimitive()
            r7 = 0
            if (r0 == 0) goto L_0x0054
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 == r0) goto L_0x0063
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 == r0) goto L_0x0063
            java.lang.Class r0 = java.lang.Double.TYPE
        L_0x0051:
            if (r2 == r0) goto L_0x0063
            goto L_0x0070
        L_0x0054:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 == r0) goto L_0x0063
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 == r0) goto L_0x0063
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 == r0) goto L_0x0063
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            goto L_0x0051
        L_0x0063:
            boolean r7 = X.C269574fL.A0K(r4)
            goto L_0x0070
        L_0x0068:
            boolean r0 = r9 instanceof X.C269714fZ
            com.fasterxml.jackson.databind.JsonSerializer r4 = X.Pxi.A0M(r14, r9, r15, r0)
            boolean r7 = r13.A03
        L_0x0070:
            X.TjO r0 = r13.A00
            if (r0 != r14) goto L_0x007d
            if (r1 != r5) goto L_0x007d
            if (r9 != r4) goto L_0x007d
            boolean r0 = r13.A03
            if (r7 != r0) goto L_0x007d
            return r13
        L_0x007d:
            com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r2 = new com.fasterxml.jackson.databind.ser.std.JsonValueSerializer
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final void A09(17Z r4, C269504fE r5, SPK spk, Object obj) {
        try {
            Object A0A = this.A05.A0A(obj);
            if (A0A == null) {
                r5.A0T(r4);
                return;
            }
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer == null) {
                jsonSerializer = A0E(r5, A0A.getClass());
            } else if (this.A03) {
                C10798RyK A002 = SPK.A00(r4, 16L.A0J, spk, obj);
                jsonSerializer.A0A(r4, r5, A0A);
                spk.A04(r4, A002);
                return;
            }
            jsonSerializer.A09(r4, r5, new C8234Qkh(spk, obj), A0A);
        } catch (Exception e) {
            StdSerializer.A01(r5, obj, 002.A0R(this.A05.A05(), "()"), e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A0A(17Z r4, C269504fE r5, Object obj) {
        try {
            Object A0A = this.A05.A0A(obj);
            if (A0A == null) {
                r5.A0T(r4);
                return;
            }
            JsonSerializer jsonSerializer = this.A01;
            if (jsonSerializer == null) {
                jsonSerializer = A0E(r5, A0A.getClass());
            }
            SPK spk = this.A02;
            if (spk != null) {
                jsonSerializer.A09(r4, r5, spk, A0A);
            } else {
                jsonSerializer.A0A(r4, r5, A0A);
            }
        } catch (Exception e) {
            StdSerializer.A01(r5, obj, 002.A0R(this.A05.A05(), "()"), e);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final boolean A0B(C269504fE r3, Object obj) {
        Object A0A = this.A05.A0A(obj);
        if (A0A == null) {
            return true;
        }
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A0E(r3, A0A.getClass());
            } catch (AnonymousClass4iD e) {
                throw new RuntimeException(e);
            }
        }
        return jsonSerializer.A0B(r3, A0A);
    }

    public final JsonSerializer A0E(C269504fE r5, Class cls) {
        SIF A012;
        JsonSerializer A002 = this.A06.A00(cls);
        if (A002 == null) {
            C268894eF r1 = this.A04;
            if (r1.A0J()) {
                C268894eF A0A = r5.A0A(r1, cls);
                A002 = r5.A0D(this.A00, A0A);
                A012 = this.A06.A01(A002, A0A.A00);
            } else {
                A002 = r5.A0H(this.A00, cls);
                A012 = this.A06.A01(A002, cls);
            }
            this.A06 = A012;
        }
        return A002;
    }

    public JsonValueSerializer(JsonSerializer jsonSerializer, C8208QkH qkH, SPK spk) {
        super(qkH.A03());
        this.A05 = qkH;
        this.A04 = qkH.A03();
        this.A02 = spk;
        this.A01 = jsonSerializer;
        this.A00 = null;
        this.A03 = true;
        this.A06 = C8245Qkz.A00;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("(@JsonValue serializer for method ");
        C8208QkH qkH = this.A05;
        A1A.append(qkH.A09());
        A1A.append("#");
        A1A.append(qkH.A05());
        return AnonymousClass7TF.A0l(")", A1A);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JsonValueSerializer(X.C13901TjO r2, com.fasterxml.jackson.databind.JsonSerializer r3, X.SPK r4, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer r5, boolean r6) {
        /*
            r1 = this;
            java.lang.Class r0 = r5.A00
            if (r0 != 0) goto L_0x0006
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
        L_0x0006:
            r1.<init>((java.lang.Class) r0)
            X.QkH r0 = r5.A05
            r1.A05 = r0
            X.4eF r0 = r5.A04
            r1.A04 = r0
            r1.A02 = r4
            r1.A01 = r3
            r1.A00 = r2
            r1.A03 = r6
            X.Qkz r0 = X.C8245Qkz.A00
            r1.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.JsonValueSerializer.<init>(X.TjO, com.fasterxml.jackson.databind.JsonSerializer, X.SPK, com.fasterxml.jackson.databind.ser.std.JsonValueSerializer, boolean):void");
    }
}
