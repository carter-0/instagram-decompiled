package X;

import java.util.List;

/* renamed from: X.Hr4  reason: case insensitive filesystem */
public final class C55998Hr4 {
    public AnonymousClass62Z A00;
    public AnonymousClass5Q8 A01;
    public final C286025Tq A02;
    public final AnonymousClass5Z4 A03;
    public final C286305Uu A04;
    public final C268024cd A05;
    public final List A06;
    public final boolean A07;

    public final void A00(AnonymousClass5Q8 r8) {
        AnonymousClass62Z r1 = this.A00;
        if (r1 == null || r8 != this.A01 || r1.BC8()) {
            this.A01 = r8;
            r1 = new AnonymousClass62Z(this.A02, C291695hj.A00(this.A03, r8), this.A04, this.A05, this.A06);
        }
        this.A00 = r1;
    }

    public C55998Hr4(C286025Tq r1, AnonymousClass5Z4 r2, C286305Uu r3, C268024cd r4, List list, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A07 = z;
        this.A05 = r4;
        this.A04 = r3;
        this.A06 = list;
    }
}
