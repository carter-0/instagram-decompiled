package com.fasterxml.jackson.databind.ser.std;

import X.AnonymousClass4iD;
import X.AnonymousClass4iM;
import X.AnonymousClass7TF;
import X.C13901TjO;
import X.C257443xP;
import X.C268894eF;
import X.C269204ek;
import X.C269504fE;
import X.C269714fZ;
import X.C8245Qkz;
import X.C8254Qm3;
import X.SGT;
import X.SIF;
import X.SPK;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ReferenceTypeSerializer extends StdSerializer implements C269714fZ {
    public static final Object A08 = C269204ek.NON_EMPTY;
    public final C13901TjO A00;
    public final JsonSerializer A01;
    public final SPK A02;
    public final SGT A03;
    public final Object A04;
    public final boolean A05;
    public final C268894eF A06;
    public transient SIF A07;

    public final ReferenceTypeSerializer A0E(C13901TjO tjO, JsonSerializer jsonSerializer, SPK spk, SGT sgt) {
        C13901TjO tjO2 = tjO;
        JsonSerializer jsonSerializer2 = jsonSerializer;
        SPK spk2 = spk;
        SGT sgt2 = sgt;
        if (!(this instanceof GuavaOptionalSerializer)) {
            return new ReferenceTypeSerializer(tjO2, jsonSerializer2, spk2, this, sgt2, this.A04, this.A05);
        }
        if (this.A00 == tjO && this.A02 == spk && this.A01 == jsonSerializer && this.A03 == sgt) {
            return this;
        }
        return new ReferenceTypeSerializer(tjO2, jsonSerializer2, spk2, this, sgt2, this.A04, this.A05);
    }

    public final ReferenceTypeSerializer A0F(Object obj, boolean z) {
        boolean z2 = this instanceof GuavaOptionalSerializer;
        C13901TjO tjO = this.A00;
        SPK spk = this.A02;
        JsonSerializer jsonSerializer = this.A01;
        SGT sgt = this.A03;
        Object obj2 = obj;
        boolean z3 = z;
        if (z2) {
            return new ReferenceTypeSerializer(tjO, jsonSerializer, spk, this, sgt, obj2, z3);
        }
        return new ReferenceTypeSerializer(tjO, jsonSerializer, spk, this, sgt, obj2, z3);
    }

    private final JsonSerializer A03(C269504fE r3, Class cls) {
        JsonSerializer A002 = this.A07.A00(cls);
        if (A002 == null) {
            C268894eF r1 = this.A06;
            if (r1.A0J()) {
                A002 = r3.A0D(this.A00, r3.A0A(r1, cls));
            } else {
                A002 = r3.A0H(this.A00, cls);
            }
            SGT sgt = this.A03;
            if (sgt != null) {
                A002 = A002.A07(sgt);
            }
            this.A07 = this.A07.A01(A002, cls);
        }
        return A002;
    }

    public final JsonSerializer A07(SGT sgt) {
        JsonSerializer jsonSerializer = this.A01;
        JsonSerializer jsonSerializer2 = jsonSerializer;
        if (jsonSerializer != null && (jsonSerializer = jsonSerializer.A07(sgt)) == jsonSerializer2) {
            return this;
        }
        SGT sgt2 = this.A03;
        if (sgt2 != null) {
            sgt = new C8254Qm3(sgt, sgt2);
        }
        if (jsonSerializer2 == jsonSerializer && sgt2 == sgt) {
            return this;
        }
        return A0E(this.A00, jsonSerializer, this.A02, sgt);
    }

    public final boolean A08() {
        return AnonymousClass7TF.A1V(this.A03);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.17Z r3, X.C269504fE r4, X.SPK r5, java.lang.Object r6) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            if (r0 == 0) goto L_0x002a
            X.3xP r6 = (X.C257443xP) r6
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r6.A03()
        L_0x0010:
            if (r1 == 0) goto L_0x0022
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A01
            if (r0 != 0) goto L_0x001e
            java.lang.Class r0 = r1.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r0 = r2.A03(r4, r0)
        L_0x001e:
            r0.A09(r3, r4, r5, r1)
        L_0x0021:
            return
        L_0x0022:
            X.SGT r0 = r2.A03
            if (r0 != 0) goto L_0x0021
            r4.A0T(r3)
            return
        L_0x002a:
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r1 = r6.get()
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A09(X.17Z, X.4fE, X.SPK, java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(X.17Z r4, X.C269504fE r5, java.lang.Object r6) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.fasterxml.jackson.datatype.guava.ser.GuavaOptionalSerializer
            if (r0 == 0) goto L_0x002e
            X.3xP r6 = (X.C257443xP) r6
            boolean r0 = r6.A06()
            if (r0 == 0) goto L_0x0026
            java.lang.Object r2 = r6.A03()
        L_0x0010:
            if (r2 == 0) goto L_0x0026
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A01
            if (r1 != 0) goto L_0x001e
            java.lang.Class r0 = r2.getClass()
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A03(r5, r0)
        L_0x001e:
            X.SPK r0 = r3.A02
            if (r0 == 0) goto L_0x0035
            r1.A09(r4, r5, r0, r2)
        L_0x0025:
            return
        L_0x0026:
            X.SGT r0 = r3.A03
            if (r0 != 0) goto L_0x0025
            r5.A0T(r4)
            return
        L_0x002e:
            java.util.concurrent.atomic.AtomicReference r6 = (java.util.concurrent.atomic.AtomicReference) r6
            java.lang.Object r2 = r6.get()
            goto L_0x0010
        L_0x0035:
            r1.A0A(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.A0A(X.17Z, X.4fE, java.lang.Object):void");
    }

    public final boolean A0B(C269504fE r5, Object obj) {
        boolean A1V;
        Object obj2;
        boolean z = this instanceof GuavaOptionalSerializer;
        if (z) {
            A1V = ((C257443xP) obj).A06();
        } else {
            A1V = AnonymousClass7TF.A1V(((AtomicReference) obj).get());
        }
        if (!A1V) {
            return true;
        }
        if (z) {
            obj2 = ((C257443xP) obj).A03();
        } else {
            obj2 = ((AtomicReference) obj).get();
        }
        if (obj2 == null) {
            return this.A05;
        }
        Object obj3 = this.A04;
        if (obj3 == null) {
            return false;
        }
        JsonSerializer jsonSerializer = this.A01;
        if (jsonSerializer == null) {
            try {
                jsonSerializer = A03(r5, obj2.getClass());
            } catch (AnonymousClass4iD e) {
                throw new RuntimeException(e);
            }
        }
        if (obj3 == A08) {
            return jsonSerializer.A0B(r5, obj2);
        }
        return obj3.equals(obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r1 == X.RDB.DYNAMIC) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0066, code lost:
        r5 = r8.AVP(r9.A05, r7.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a9, code lost:
        if (r7.A06.A02() != false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c2, code lost:
        if (r2.A09(X.C269354ez.USE_STATIC_TYPING) != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fasterxml.jackson.databind.JsonSerializer ALi(X.C13901TjO r8, X.C269504fE r9) {
        /*
            r7 = this;
            X.SPK r5 = r7.A02
            r4 = r5
            if (r5 == 0) goto L_0x0009
            X.SPK r5 = r5.A06(r8)
        L_0x0009:
            if (r8 == 0) goto L_0x0023
            X.QkH r1 = r8.BRS()
            X.4et r0 = r9.A05
            X.4eA r0 = r0.A01()
            if (r1 == 0) goto L_0x0023
            java.lang.Object r0 = r0.A0X(r1)
            if (r0 == 0) goto L_0x0023
            com.fasterxml.jackson.databind.JsonSerializer r3 = r9.A0M(r1, r0)
            if (r3 != 0) goto L_0x0059
        L_0x0023:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r7.A01
            if (r3 != 0) goto L_0x00c9
            X.4eF r6 = r7.A06
            java.lang.Class r1 = r6.A00
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 == r0) goto L_0x0059
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 != 0) goto L_0x00c4
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x00c4
            X.4et r2 = r9.A05
            X.4eA r1 = r2.A01()
            if (r1 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00bc
            X.QkH r0 = r8.BRS()
            if (r0 == 0) goto L_0x00bc
            X.RDB r1 = r1.A0F(r0)
            X.RDB r0 = X.RDB.STATIC
            if (r1 == r0) goto L_0x00c4
            X.RDB r0 = X.RDB.DYNAMIC
            if (r1 != r0) goto L_0x00bc
        L_0x0059:
            X.TjO r0 = r7.A00
            if (r0 != r8) goto L_0x00b5
            if (r4 != r5) goto L_0x00b5
            com.fasterxml.jackson.databind.JsonSerializer r0 = r7.A01
            if (r0 != r3) goto L_0x00b5
            r3 = r7
        L_0x0064:
            if (r8 == 0) goto L_0x0095
            X.4et r1 = r9.A05
            java.lang.Class r0 = r7.A00
            X.4ej r5 = r8.AVP(r1, r0)
            X.4ek r1 = r5.A00
            X.4ek r0 = X.C269204ek.USE_DEFAULTS
            if (r1 == r0) goto L_0x0095
            int r4 = r1.ordinal()
            r2 = 0
            r1 = 1
            r0 = 4
            if (r4 == r0) goto L_0x00ae
            r0 = 2
            if (r4 == r0) goto L_0x00a3
            r0 = 3
            if (r4 == r0) goto L_0x00ab
            r0 = 5
            if (r4 == r0) goto L_0x0096
            if (r4 == r1) goto L_0x0089
            r1 = 0
        L_0x0089:
            java.lang.Object r0 = r7.A04
            if (r0 != r2) goto L_0x0091
            boolean r0 = r7.A05
            if (r0 == r1) goto L_0x0095
        L_0x0091:
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r3 = r3.A0F(r2, r1)
        L_0x0095:
            return r3
        L_0x0096:
            java.lang.Class r0 = r5.A02
            java.lang.Object r2 = r9.A0R(r0)
            if (r2 == 0) goto L_0x0089
            boolean r1 = r9.A0V(r2)
            goto L_0x0089
        L_0x00a3:
            X.4eF r0 = r7.A06
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0089
        L_0x00ab:
            java.lang.Object r2 = A08
            goto L_0x0089
        L_0x00ae:
            X.4eF r0 = r7.A06
            java.lang.Object r2 = X.SQ6.A00(r0)
            goto L_0x0089
        L_0x00b5:
            X.SGT r0 = r7.A03
            com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer r3 = r7.A0E(r8, r3, r5, r0)
            goto L_0x0064
        L_0x00bc:
            X.4ez r0 = X.C269354ez.USE_STATIC_TYPING
            boolean r0 = r2.A09(r0)
            if (r0 == 0) goto L_0x0059
        L_0x00c4:
            com.fasterxml.jackson.databind.JsonSerializer r3 = r9.A0D(r8, r6)
            goto L_0x0059
        L_0x00c9:
            boolean r0 = r3 instanceof X.C269714fZ
            com.fasterxml.jackson.databind.JsonSerializer r3 = X.Pxi.A0M(r8, r3, r9, r0)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer.ALi(X.TjO, X.4fE):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public ReferenceTypeSerializer(JsonSerializer jsonSerializer, SPK spk, AnonymousClass4iM r4) {
        super((C268894eF) r4);
        this.A06 = r4.A01;
        this.A00 = null;
        this.A02 = spk;
        this.A01 = jsonSerializer;
        this.A03 = null;
        this.A04 = null;
        this.A05 = false;
        this.A07 = C8245Qkz.A00;
    }

    public ReferenceTypeSerializer(C13901TjO tjO, JsonSerializer jsonSerializer, SPK spk, ReferenceTypeSerializer referenceTypeSerializer, SGT sgt, Object obj, boolean z) {
        super((StdSerializer) referenceTypeSerializer);
        this.A06 = referenceTypeSerializer.A06;
        this.A07 = C8245Qkz.A00;
        this.A00 = tjO;
        this.A02 = spk;
        this.A01 = jsonSerializer;
        this.A03 = sgt;
        this.A04 = obj;
        this.A05 = z;
    }
}
