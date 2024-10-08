package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5xz  reason: invalid class name and case insensitive filesystem */
public final class C300835xz implements C252203oj {
    public static final C71392co A04 = C71392co.A04(1.0d, 4.0d);
    public static final C71392co A05 = C71392co.A04(60.0d, 5.0d);
    public static final C71392co A06 = C71392co.A04(40.0d, 1.0d);
    public WeakReference A00;
    public WeakReference A01;
    public final 2cs A02;
    public final 2cs A03;

    public final void DmB(2cs r1) {
    }

    public final void DmC(2cs r5) {
        WeakReference weakReference;
        AnonymousClass3TK r0;
        0qQ.A0B(r5, 0);
        2cs r3 = this.A02;
        if (r5 == r3 && r3.A05 == A05 && r3.A0E(1.0d)) {
            r3.A09(A06);
            r3.A06 = true;
            r3.A05(1.0d);
            r3.A06(0.0d);
        }
        if (r5 == this.A03 && (weakReference = this.A01) != null && (r0 = (AnonymousClass3TK) weakReference.get()) != null) {
            r0.CvC();
        }
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r7) {
        WeakReference weakReference;
        AnonymousClass3TK r3;
        WeakReference weakReference2;
        AnonymousClass3TK r32;
        0qQ.A0B(r7, 0);
        C71392co r5 = r7.A05;
        float f = (float) r7.A09.A00;
        boolean z = true;
        if (!(r7 != this.A02 || (weakReference2 = this.A00) == null || (r32 = (AnonymousClass3TK) weakReference2.get()) == null)) {
            boolean z2 = false;
            if (r5 == A05) {
                z2 = true;
            }
            r32.CvR(z2, f);
        }
        if (r7 == this.A03 && (weakReference = this.A01) != null && (r3 = (AnonymousClass3TK) weakReference.get()) != null) {
            if (r5 == A04) {
                f = (Math.abs(f) * -2.25f) + 1.2f;
            }
            if (r5 != A05) {
                z = false;
            }
            r3.CvR(z, f);
        }
    }

    public final void A00(WeakReference weakReference) {
        this.A00 = weakReference;
        2cs r1 = this.A02;
        if (!r1.A0C()) {
            DmE(r1);
        }
    }

    public final void A01(WeakReference weakReference) {
        this.A01 = weakReference;
        2cs r1 = this.A03;
        if (!r1.A0C()) {
            DmE(r1);
        }
    }

    public final void A02(boolean z, boolean z2, boolean z3) {
        if (!z3 || (!z2 && z)) {
            this.A02.A05(0.0d);
        } else {
            2cs r5 = this.A02;
            r5.A09(A05);
            r5.A06 = false;
            r5.A05(0.0d);
            r5.A06(1.0d);
        }
        if (!z || !z2) {
            2cs r52 = this.A03;
            r52.A09(A05);
            r52.A05(0.0d);
            r52.A06(1.0d);
            return;
        }
        2cs r2 = this.A03;
        r2.A09(A04);
        r2.A05(-0.1d);
        r2.A06(0.1d);
    }

    public C300835xz() {
        2cp A002 = C61340me.A00();
        2cs A022 = A002.A02();
        A022.A0A(this);
        this.A02 = A022;
        2cs A023 = A002.A02();
        A023.A0A(this);
        this.A03 = A023;
    }
}
