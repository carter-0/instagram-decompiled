package X;

/* renamed from: X.5SI  reason: invalid class name */
public final class AnonymousClass5SI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04 = AnonymousClass5SF.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public C290225ey A05;
    public Integer A06 = AnonymousClass05K.A0Y;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass5R6 A0I;
    public final AnonymousClass5SJ A0J = new AnonymousClass5SJ(this);
    public final C62320sa A0K = new AnonymousClass9L8(this, 30);

    public final void A00() {
        AnonymousClass5SJ r1 = this.A0J;
        if (!(r1.A0A == null && r1.A0S.A0I.A0W.A04.BaX() == null) && r1.A0J) {
            r1.A0J = false;
            r1.A0A = r1.A0S.A0I.A0W.A04.BaX();
            AnonymousClass5R6 A0B2 = this.A0I.A0B();
            if (A0B2 != null) {
                A0B2.A0a(false, true, true);
            }
        }
        C290225ey r12 = this.A05;
        if (r12 != null) {
            if (r12.A06 == null) {
                AnonymousClass6GP A0Z = r12.A0J.A0I.A0W.A04.A0Z();
                0qQ.A0A(A0Z);
                if (A0Z.BaX() == null) {
                    return;
                }
            }
            if (r12.A0C) {
                r12.A0C = false;
                AnonymousClass6GP A0Z2 = r12.A0J.A0I.A0W.A04.A0Z();
                0qQ.A0A(A0Z2);
                r12.A06 = A0Z2.BaX();
                AnonymousClass5R6 r13 = this.A0I;
                boolean A002 = C289045cv.A00(r13);
                AnonymousClass5R6 A0B3 = r13.A0B();
                if (A002) {
                    if (A0B3 != null) {
                        A0B3.A0a(false, true, true);
                    }
                } else if (A0B3 != null) {
                    A0B3.A0Z(false, true, true);
                }
            }
        }
    }

    public final void A01(int i) {
        AnonymousClass5R6 A0B2;
        AnonymousClass5SI r2;
        int i2 = this.A00;
        this.A00 = i;
        boolean z = false;
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        if (i == 0) {
            z = true;
        }
        if (z2 != z && (A0B2 = this.A0I.A0B()) != null && (r2 = A0B2.A0U) != null) {
            int i3 = r2.A00;
            int i4 = i3 + 1;
            if (i == 0) {
                i4 = i3 - 1;
            }
            r2.A01(i4);
        }
    }

    public final void A02(int i) {
        AnonymousClass5R6 A0B2;
        AnonymousClass5SI r2;
        int i2 = this.A01;
        this.A01 = i;
        boolean z = false;
        boolean z2 = false;
        if (i2 == 0) {
            z2 = true;
        }
        if (i == 0) {
            z = true;
        }
        if (z2 != z && (A0B2 = this.A0I.A0B()) != null && (r2 = A0B2.A0U) != null) {
            int i3 = r2.A01;
            int i4 = i3 + 1;
            if (i == 0) {
                i4 = i3 - 1;
            }
            r2.A02(i4);
        }
    }

    public AnonymousClass5SI(AnonymousClass5R6 r3) {
        this.A0I = r3;
    }
}
