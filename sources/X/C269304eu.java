package X;

import java.io.Serializable;

/* renamed from: X.4eu  reason: invalid class name and case insensitive filesystem */
public abstract class C269304eu extends C269144ee implements Serializable {
    public static final long A07 = ((((C269354ez.AUTO_DETECT_FIELDS.A00 | C269354ez.AUTO_DETECT_GETTERS.A00) | C269354ez.AUTO_DETECT_IS_GETTERS.A00) | C269354ez.AUTO_DETECT_SETTERS.A00) | C269354ez.AUTO_DETECT_CREATORS.A00);
    public static final C269344ey A08 = C269344ey.A00;
    public static final long A09;
    public final C269434f7 A00;
    public final C269184ei A01;
    public final C269444f8 A02;
    public final C269154ef A03;
    public final C269164eg A04;
    public final Class A05;
    public final C269174eh A06;

    static {
        long j = 0;
        for (C269354ez r1 : C269354ez.values()) {
            if (r1.A01) {
                j |= r1.A00;
            }
        }
        A09 = j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.4f9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.4et} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: X.4f9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.4f9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C269304eu A0B(X.AnonymousClass4eE r15) {
        /*
            r14 = this;
            X.4eS r2 = r14.A01
            X.4eE r0 = r2.A07
            r10 = r15
            if (r0 == r15) goto L_0x0020
            X.4eT r6 = r2.A03
            X.4eA r4 = r2.A01
            X.T9E r5 = r2.A02
            X.Tg5 r9 = r2.A06
            java.text.DateFormat r11 = r2.A08
            java.util.Locale r12 = r2.A09
            java.util.TimeZone r13 = r2.A0A
            X.4eN r3 = r2.A00
            X.4eQ r8 = r2.A05
            X.4eR r7 = r2.A04
            X.4eS r2 = new X.4eS
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0020:
            r1 = r14
            boolean r0 = r14 instanceof X.C269294et
            if (r0 == 0) goto L_0x0031
            X.4et r1 = (X.C269294et) r1
            X.4eS r0 = r1.A01
            if (r0 == r2) goto L_0x003d
            X.4et r0 = new X.4et
            r0.<init>(r1, r2)
            return r0
        L_0x0031:
            X.4f9 r1 = (X.C269454f9) r1
            X.4eS r0 = r1.A01
            if (r0 == r2) goto L_0x003d
            X.4f9 r0 = new X.4f9
            r0.<init>(r1, r2)
            return r0
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C269304eu.A0B(X.4eE):X.4eu");
    }

    public C269304eu(C269024eS r2, C269304eu r3) {
        super(r2, (C269144ee) r3);
        this.A06 = r3.A06;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A05 = r3.A05;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
    }

    public final T9o A0A(C269054eV r4) {
        T9o A052;
        C268854eA A012 = A01();
        if (A012 == null) {
            A052 = null;
        } else {
            A052 = A012.A05(r4);
        }
        T9o t9o = T9o.A05;
        if (A052 != null) {
            return A052;
        }
        return null;
    }

    public final Class AVN(Class cls) {
        return null;
    }

    public C269304eu(C269304eu r2, long j) {
        super((C269144ee) r2, j);
        this.A06 = r2.A06;
        this.A03 = r2.A03;
        this.A04 = r2.A04;
        this.A00 = r2.A00;
        this.A05 = r2.A05;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public C269304eu(C269024eS r3, C269184ei r4, C269174eh r5, C269154ef r6, C269164eg r7) {
        super(r3, A09);
        this.A06 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A00 = null;
        this.A05 = null;
        this.A02 = C269444f8.A02;
        this.A01 = r4;
    }
}
