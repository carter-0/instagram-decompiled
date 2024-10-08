package X;

import java.io.Serializable;

/* renamed from: X.4f9  reason: invalid class name and case insensitive filesystem */
public final class C269454f9 extends C269304eu implements Serializable {
    public static final int A09;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final C269264eq A05;
    public final Y1S A06;
    public final C269474fB A07;
    public final C10439RsG A08;

    public C269454f9(C269024eS r9, C269264eq r10, C269184ei r11, C269174eh r12, C269154ef r13, C269164eg r14) {
        super(r9, r11, r12, r13, r14);
        this.A00 = A09;
        this.A08 = null;
        this.A07 = C269474fB.A00;
        this.A06 = null;
        this.A05 = r10;
        this.A03 = 0;
        this.A04 = 0;
        this.A01 = 0;
        this.A02 = 0;
    }

    static {
        int i = 0;
        for (Enum enumR : (Enum[]) C269464fA.class.getEnumConstants()) {
            C269364f0 r1 = (C269364f0) enumR;
            if (r1.ARn()) {
                i |= r1.BP4();
            }
        }
        A09 = i;
    }

    public final C269134ed A0C(C268894eF r3) {
        C269044eU r1 = (C269044eU) this.A01.A03;
        C269134ed A002 = C269044eU.A00(r3, this);
        if (A002 != null) {
            return A002;
        }
        C269134ed A042 = r1.A04(r3, this);
        if (A042 == null) {
            return new C269134ed(r1.A06(r3, this, this, false));
        }
        return A042;
    }

    public final boolean A0D(C269464fA r3) {
        if ((r3.A00 & this.A00) != 0) {
            return true;
        }
        return false;
    }

    public C269454f9(C269454f9 r2, C269024eS r3) {
        super(r3, (C269304eu) r2);
        this.A00 = r2.A00;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A06 = r2.A06;
        this.A03 = r2.A03;
        this.A04 = r2.A04;
        this.A01 = r2.A01;
        this.A02 = r2.A02;
    }

    public C269454f9(C269454f9 r2, int i, int i2, int i3, int i4, int i5, long j) {
        super((C269304eu) r2, j);
        this.A00 = i;
        this.A08 = r2.A08;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A06 = r2.A06;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A02 = i5;
    }
}
