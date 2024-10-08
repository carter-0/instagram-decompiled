package com.fasterxml.jackson.databind.deser;

import X.16F;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4eE;
import X.AnonymousClass7TE;
import X.C11243SHd;
import X.C13452Taf;
import X.C13901TjO;
import X.C268854eA;
import X.C268894eF;
import X.C269434f7;
import X.C269574fL;
import X.C269674fV;
import X.C269784fg;
import X.C8138QhX;
import X.C8139QhY;
import X.C8208QkH;
import X.C8218QkR;
import X.Pxf;
import X.T9I;
import X.T9X;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.util.Map;

public class AbstractDeserializer extends JsonDeserializer implements C269784fg, Serializable {
    public final C268894eF A00;
    public final T9I A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final Map A06;
    public transient Map A07;

    public AbstractDeserializer(AbstractDeserializer abstractDeserializer, T9I t9i) {
        this.A00 = abstractDeserializer.A00;
        this.A06 = abstractDeserializer.A06;
        this.A05 = abstractDeserializer.A05;
        this.A02 = abstractDeserializer.A02;
        this.A04 = abstractDeserializer.A04;
        this.A03 = abstractDeserializer.A03;
        this.A01 = t9i;
        this.A07 = null;
    }

    public final boolean A0M() {
        return true;
    }

    public final Object A0D(16F r4, C269674fV r5) {
        Class cls = this.A00.A00;
        if (r5.A02.A08 != null) {
            throw AnonymousClass7TE.A11("handleMissingInstantiator");
        }
        r5.A09(String.format("Cannot construct instance of %s (no Creators, like default constructor, exist): %s", new Object[]{C269574fL.A06(cls), "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information"}), cls);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C8218QkR A0E(String str) {
        Map map = this.A06;
        if (map == null) {
            return null;
        }
        return (C8218QkR) map.get(str);
    }

    public final T9I A0F() {
        return this.A01;
    }

    public final Class A0H() {
        return this.A00.A00;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0N;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Throwable, X.1bF, X.4iD, java.io.IOException, X.Qi1] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r0 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0J(X.16F r6, X.C269674fV r7, X.C11287SJg r8) {
        /*
            r5 = this;
            X.T9I r3 = r5.A01
            if (r3 == 0) goto L_0x005b
            X.16L r1 = r6.A10()
            if (r1 == 0) goto L_0x005b
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0054
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A03
            java.lang.Object r2 = r0.A0D(r6, r7)
            X.T9X r1 = r3.A00
            X.Taf r0 = r3.A01
            X.S6M r4 = r7.A0I(r1, r0, r2)
            X.Taf r0 = r4.A00
            X.T9Z r1 = r4.A03
            X.SuR r0 = (X.C12436SuR) r0
            java.util.Map r0 = r0.A00
            if (r0 != 0) goto L_0x004e
            r0 = 0
        L_0x0027:
            r4.A01 = r0
            if (r0 != 0) goto L_0x0053
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Could not resolve Object Id ["
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "] -- unresolved forward-reference?"
            java.lang.String r3 = X.AnonymousClass7TF.A0l(r0, r1)
            X.T9j r2 = r6.A1H()
            r1 = 0
            X.Qi1 r0 = new X.Qi1
            r0.<init>(r3, r1)
            r0.A00 = r2
            r0.A01 = r6
            r0.A00 = r4
            throw r0
        L_0x004e:
            java.lang.Object r0 = r0.get(r1)
            goto L_0x0027
        L_0x0053:
            return r0
        L_0x0054:
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x005b
            r6.A1J()
        L_0x005b:
            int r0 = r6.A0x()
            switch(r0) {
                case 6: goto L_0x0067;
                case 7: goto L_0x0070;
                case 8: goto L_0x007d;
                case 9: goto L_0x008c;
                case 10: goto L_0x0093;
                default: goto L_0x0062;
            }
        L_0x0062:
            java.lang.Object r0 = r8.A05(r6, r7)
            return r0
        L_0x0067:
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0062
            java.lang.String r0 = r6.A1P()
            goto L_0x0089
        L_0x0070:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0062
            int r0 = r6.A0i()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0089
        L_0x007d:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0062
            double r0 = r6.A0g()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x0089:
            if (r0 == 0) goto L_0x0062
            return r0
        L_0x008c:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0062
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0093:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0062
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.A0J(X.16F, X.4fV, X.SJg):java.lang.Object");
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r13) {
        T9I t9i;
        C8208QkH BRS;
        C11243SHd A0H;
        C268894eF r7;
        T9X A022;
        String A08;
        C268854eA A012 = r13.A02.A01();
        C8218QkR qkR = null;
        if (tjO != null && A012 != null && (BRS = tjO.BRS()) != null && (A0H = A012.A0H(BRS)) != null) {
            Class cls = A0H.A02;
            boolean A062 = r13.A03().A06();
            C13452Taf taf = (C13452Taf) C269574fL.A03(cls, A062);
            C11243SHd A0I = A012.A0I(BRS, A0H);
            Class<C8138QhX> cls2 = A0I.A01;
            if (cls2 == C8138QhX.class) {
                C269434f7 r3 = A0I.A00;
                Map map = this.A07;
                if (map == null || (qkR = (C8218QkR) map.get(r3.A02)) == null) {
                    C268894eF r2 = this.A00;
                    String A063 = C269574fL.A06(r2.A00);
                    if (r3 == null) {
                        A08 = "[null]";
                    } else {
                        A08 = C269574fL.A08(r3.A02);
                    }
                    Pxf.A1H(r13, r2, "Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{A063, A08});
                    throw AnonymousClass00P.createAndThrow();
                }
                r7 = qkR.A04;
                A022 = new C8139QhY(A0I.A03);
            } else {
                taf = (C13452Taf) C269574fL.A03(A0I.A02, A062);
                r7 = AnonymousClass4eE.A03(r13.A0A(cls2), T9X.class)[0];
                A022 = r13.A02(A0I);
            }
            t9i = new T9I(A022, taf, r7, r13.A0E(r7), A0I.A00, qkR);
        } else if (this.A07 == null) {
            return this;
        } else {
            t9i = this.A01;
        }
        return new AbstractDeserializer(this, t9i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r3.isAssignableFrom(java.lang.Boolean.class) != false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.isAssignableFrom(java.lang.Integer.class) != false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractDeserializer(X.S7U r5, X.C269134ed r6, java.util.Map r7, java.util.Map r8) {
        /*
            r4 = this;
            r4.<init>()
            X.4eF r1 = r6.A05
            r4.A00 = r1
            X.T9I r0 = r5.A03
            r4.A01 = r0
            r4.A06 = r7
            r4.A07 = r8
            java.lang.Class r3 = r1.A00
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4.A05 = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L_0x0027
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            r0 = 1
        L_0x0028:
            r4.A02 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L_0x0037
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0038
        L_0x0037:
            r0 = 1
        L_0x0038:
            r4.A04 = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L_0x0046
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0047
        L_0x0046:
            r2 = 1
        L_0x0047:
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.S7U, X.4ed, java.util.Map, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        if (r3.isAssignableFrom(java.lang.Boolean.class) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r3.isAssignableFrom(java.lang.Integer.class) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AbstractDeserializer(X.C269134ed r5) {
        /*
            r4 = this;
            r4.<init>()
            X.4eF r1 = r5.A05
            r4.A00 = r1
            r0 = 0
            r4.A01 = r0
            r4.A06 = r0
            java.lang.Class r3 = r1.A00
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r3.isAssignableFrom(r0)
            r4.A05 = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r2 = 0
            if (r3 == r0) goto L_0x0024
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0025
        L_0x0024:
            r0 = 1
        L_0x0025:
            r4.A02 = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r3 == r0) goto L_0x0034
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            boolean r1 = r3.isAssignableFrom(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            r4.A04 = r0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r3 == r0) goto L_0x0043
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r2 = 1
        L_0x0044:
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.AbstractDeserializer.<init>(X.4ed):void");
    }
}
