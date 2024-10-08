package X;

import java.io.Serializable;
import java.util.Collections;

/* renamed from: X.4ee  reason: invalid class name and case insensitive filesystem */
public abstract class C269144ee implements C269124ec, Serializable {
    public static final C269314ev A02 = C269314ev.A07;
    public static final C269194ej A03 = C269194ej.A04;
    public final long A00;
    public final C269024eS A01;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        if (r12 == r0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C269244eo A04(X.C269054eV r14, java.lang.Class r15) {
        /*
            r13 = this;
            r0 = r13
            X.4eu r0 = (X.C269304eu) r0
            boolean r1 = X.C269574fL.A0J(r15)
            if (r1 == 0) goto L_0x005b
            X.4en r7 = X.C269234en.A05
        L_0x000b:
            X.4eA r0 = r0.A01()
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0 instanceof X.C268844e9
            if (r0 == 0) goto L_0x005a
            java.lang.Class<com.fasterxml.jackson.annotation.JsonAutoDetect> r0 = com.fasterxml.jackson.annotation.JsonAutoDetect.class
            java.lang.annotation.Annotation r6 = r14.A06(r0)
            com.fasterxml.jackson.annotation.JsonAutoDetect r6 = (com.fasterxml.jackson.annotation.JsonAutoDetect) r6
            if (r6 == 0) goto L_0x005a
            X.4en r7 = (X.C269234en) r7
            X.4ep r5 = r7.A02
            X.4ep r8 = r6.getterVisibility()
            X.4ep r4 = X.C269254ep.DEFAULT
            if (r8 != r4) goto L_0x002c
            r8 = r5
        L_0x002c:
            X.4ep r3 = r7.A03
            X.4ep r9 = r6.isGetterVisibility()
            if (r9 != r4) goto L_0x0035
            r9 = r3
        L_0x0035:
            X.4ep r2 = r7.A04
            X.4ep r10 = r6.setterVisibility()
            if (r10 != r4) goto L_0x003e
            r10 = r2
        L_0x003e:
            X.4ep r1 = r7.A00
            X.4ep r11 = r6.creatorVisibility()
            if (r11 != r4) goto L_0x0047
            r11 = r1
        L_0x0047:
            X.4ep r0 = r7.A01
            X.4ep r12 = r6.fieldVisibility()
            if (r12 != r4) goto L_0x0050
            r12 = r0
        L_0x0050:
            if (r8 != r5) goto L_0x00fb
            if (r9 != r3) goto L_0x00fb
            if (r10 != r2) goto L_0x00fb
            if (r11 != r1) goto L_0x00fb
            if (r12 != r0) goto L_0x00fb
        L_0x005a:
            return r7
        L_0x005b:
            X.4ei r1 = r0.A01
            X.4eo r7 = r1.A02
            long r2 = r0.A00
            long r4 = X.C269304eu.A07
            long r2 = r2 & r4
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x000b
            X.4ez r1 = X.C269354ez.AUTO_DETECT_FIELDS
            boolean r1 = r0.A09(r1)
            if (r1 != 0) goto L_0x0085
            X.4ep r12 = X.C269254ep.NONE
            X.4en r7 = (X.C269234en) r7
            X.4ep r1 = r7.A01
            if (r1 == r12) goto L_0x0085
            X.4ep r8 = r7.A02
            X.4ep r9 = r7.A03
            X.4ep r10 = r7.A04
            X.4ep r11 = r7.A00
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0085:
            X.4ez r1 = X.C269354ez.AUTO_DETECT_GETTERS
            boolean r1 = r0.A09(r1)
            if (r1 != 0) goto L_0x00a2
            X.4ep r8 = X.C269254ep.NONE
            X.4en r7 = (X.C269234en) r7
            X.4ep r1 = r7.A02
            if (r1 == r8) goto L_0x00a2
            X.4ep r9 = r7.A03
            X.4ep r10 = r7.A04
            X.4ep r11 = r7.A00
            X.4ep r12 = r7.A01
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00a2:
            X.4ez r1 = X.C269354ez.AUTO_DETECT_IS_GETTERS
            boolean r1 = r0.A09(r1)
            if (r1 != 0) goto L_0x00bf
            X.4ep r9 = X.C269254ep.NONE
            X.4en r7 = (X.C269234en) r7
            X.4ep r1 = r7.A03
            if (r1 == r9) goto L_0x00bf
            X.4ep r8 = r7.A02
            X.4ep r10 = r7.A04
            X.4ep r11 = r7.A00
            X.4ep r12 = r7.A01
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00bf:
            X.4ez r1 = X.C269354ez.AUTO_DETECT_SETTERS
            boolean r1 = r0.A09(r1)
            if (r1 != 0) goto L_0x00dc
            X.4ep r10 = X.C269254ep.NONE
            X.4en r7 = (X.C269234en) r7
            X.4ep r1 = r7.A04
            if (r1 == r10) goto L_0x00dc
            X.4ep r8 = r7.A02
            X.4ep r9 = r7.A03
            X.4ep r11 = r7.A00
            X.4ep r12 = r7.A01
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x00dc:
            X.4ez r1 = X.C269354ez.AUTO_DETECT_CREATORS
            boolean r1 = r0.A09(r1)
            if (r1 != 0) goto L_0x000b
            X.4ep r11 = X.C269254ep.NONE
            X.4en r7 = (X.C269234en) r7
            X.4ep r1 = r7.A00
            if (r1 == r11) goto L_0x000b
            X.4ep r8 = r7.A02
            X.4ep r9 = r7.A03
            X.4ep r10 = r7.A04
            X.4ep r12 = r7.A01
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x000b
        L_0x00fb:
            X.4en r7 = new X.4en
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269144ee.A04(X.4eV, java.lang.Class):X.4eo");
    }

    public final C269314ev A00() {
        return C269314ev.A07;
    }

    public final C268854eA A01() {
        if ((this.A00 & C269354ez.USE_ANNOTATIONS.A00) != 0) {
            return this.A01.A01;
        }
        return C8156Qhp.A00;
    }

    public final C269134ed A03(Class cls) {
        return A02(this.A01.A07.A09(cls));
    }

    public final void A05() {
        C269344ey r0 = C269304eu.A08;
    }

    public final boolean A06() {
        if ((this.A00 & C269354ez.CAN_OVERRIDE_ACCESS_MODIFIERS.A00) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if ((this.A00 & C269354ez.USE_ANNOTATIONS.A00) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        return A09(C269354ez.OVERRIDE_PUBLIC_ACCESS_MODIFIERS);
    }

    public final boolean A09(C269354ez r7) {
        if ((this.A00 & r7.A00) != 0) {
            return true;
        }
        return false;
    }

    public C269144ee(C269024eS r3, C269144ee r4) {
        this.A01 = r3;
        this.A00 = r4.A00;
    }

    public final C269134ed A02(C268894eF r4) {
        C269134ed A002 = C269044eU.A00(r4, this);
        if (A002 == null) {
            return new C269134ed(r4, this, STz.A00(r4, this, this), Collections.emptyList());
        }
        return A002;
    }

    public C269144ee(C269144ee r2, long j) {
        this.A01 = r2.A01;
        this.A00 = j;
    }

    public C269144ee(C269024eS r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }
}
