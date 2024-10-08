package X;

import java.io.Serializable;

/* renamed from: X.4et  reason: invalid class name and case insensitive filesystem */
public final class C269294et extends C269304eu implements Serializable {
    public static final int A06;
    public static final AnonymousClass15w A07 = new 15v();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final AnonymousClass15w A05;

    static {
        int i = 0;
        for (Enum enumR : (Enum[]) C269424f6.class.getEnumConstants()) {
            C269364f0 r1 = (C269364f0) enumR;
            if (r1.ARn()) {
                i |= r1.BP4();
            }
        }
        A06 = i;
    }

    public final void A0C(17Z r5) {
        C269424f6 r0 = C269424f6.INDENT_OUTPUT;
        int i = this.A04;
        if ((r0.A00 & i) != 0 && r5.A00 == null) {
            15v r1 = this.A05;
            if (r1 instanceof C638815x) {
                r1 = ((C638815x) r1).AMF();
            }
            if (r1 != null) {
                r5.A00 = r1;
            }
        }
        boolean z = false;
        if ((i & C269424f6.WRITE_BIGDECIMAL_AS_PLAIN.A00) != 0) {
            z = true;
        }
        int i2 = this.A03;
        if (i2 != 0 || z) {
            int i3 = this.A02;
            if (z) {
                int i4 = 15u.A0A.A00;
                i3 |= i4;
                i2 |= i4;
            }
            17Y r52 = (17Y) r5;
            int i5 = r52.A00;
            int i6 = (i3 & i2) | ((i2 ^ -1) & i5);
            int i7 = i5 ^ i6;
            if (i7 != 0) {
                r52.A00 = i6;
                r52.A11(i6, i7);
            }
        }
    }

    public final boolean A0D(C269424f6 r3) {
        if ((r3.A00 & this.A04) != 0) {
            return true;
        }
        return false;
    }

    public C269294et(C269294et r2, int i, int i2, int i3, int i4, int i5, long j) {
        super((C269304eu) r2, j);
        this.A04 = i;
        this.A05 = r2.A05;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A01 = i5;
    }

    public C269294et(C269294et r2, C269024eS r3) {
        super(r3, (C269304eu) r2);
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
    }

    public C269294et(C269024eS r2, C269184ei r3, C269174eh r4, C269154ef r5, C269164eg r6) {
        super(r2, r3, r4, r5, r6);
        this.A04 = A06;
        this.A05 = A07;
        this.A02 = 0;
        this.A03 = 0;
        this.A00 = 0;
        this.A01 = 0;
    }
}
