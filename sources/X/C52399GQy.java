package X;

/* renamed from: X.GQy  reason: case insensitive filesystem */
public final class C52399GQy extends AnonymousClass0T0 implements AnonymousClass6CC {
    public final float A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C304806Fh A04;

    public final AnonymousClass5S2 AD5(C286575Wy r4, AnonymousClass6CD r5, int i) {
        AnonymousClass5S2 r1;
        0qQ.A0B(r5, 0);
        if (C51967G9n.A1U(r4, -482811412)) {
            0fL.A01(-1242197997, "com.instagram.compose.igds.components.button.LabelButtonStyle.backgroundShape (IgdsButton.kt:175)");
        }
        int ordinal = r5.ordinal();
        if (ordinal == 0) {
            r4.ExS(630152624);
            if (Float.compare(E1Z(r5).A03, 0.0f) > 0) {
                AnonymousClass5aQ.A02(r4);
                r1 = AnonymousClass5ZM.A01;
            }
            r1 = AnonymousClass5S0.A00;
        } else if (ordinal == 1) {
            r4.ExS(630317234);
            if (Float.compare(E1Z(r5).A03, 0.0f) > 0) {
                if (1QE.A0E() == 1QG.A03) {
                    r4.ExS(-2057871274);
                    AnonymousClass5aQ.A02(r4);
                    r1 = AnonymousClass5ZM.A01;
                } else {
                    r4.ExS(-2057869611);
                    AnonymousClass5aQ.A02(r4);
                    r1 = AnonymousClass5ZM.A00;
                }
                C51965G9l.A1X(r4, false);
            }
            r1 = AnonymousClass5S0.A00;
        } else {
            throw C51973G9u.A0n(r4, -2057883517);
        }
        C286565Wx r42 = (C286565Wx) r4;
        if (C51967G9n.A1b(r42, false)) {
            0fL.A00(-284460782);
        }
        C286565Wx.A0L(r42, false);
        return r1;
    }

    public final float CoN(AnonymousClass6CD r3) {
        int A022 = DbU.A02(r3, 0);
        if (A022 == 0) {
            return 32.0f;
        }
        if (A022 == 1) {
            return 44.0f;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final C304826Fj E1Z(AnonymousClass6CD r4) {
        float f;
        float f2;
        int A022 = DbU.A02(r4, 0);
        if (A022 == 0) {
            f = 16.0f;
            f2 = 5.0f;
        } else if (A022 == 1) {
            f = 20.0f;
            f2 = 13.0f;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return new C304826Fj(f, f2, f, f2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52399GQy) {
                C52399GQy gQy = (C52399GQy) obj;
                long j = this.A01;
                long j2 = gQy.A01;
                long j3 = AnonymousClass5RW.A01;
                if (!(j == j2 && this.A02 == gQy.A02 && Float.compare(this.A00, gQy.A00) == 0 && this.A03 == gQy.A03 && 0qQ.A0K(this.A04, gQy.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final long AD4(boolean z) {
        long j = this.A01;
        if (!z) {
            return j;
        }
        return C285595Rx.A02(AnonymousClass5RX.A0K[(int) (j & 63)], AnonymousClass5RW.A03(j), AnonymousClass5RW.A02(j), AnonymousClass5RW.A01(j), this.A00 * AnonymousClass5RW.A00(j));
    }

    public final C304806Fh AE1() {
        return this.A04;
    }

    public final long AJf(boolean z) {
        if (z) {
            return this.A02;
        }
        return this.A03;
    }

    public final float Axc() {
        return this.A00;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = AnonymousClass5RW.A01;
        return AnonymousClass7TF.A01(this.A03, AnonymousClass7TF.A00(AnonymousClass7TF.A01(this.A02, C51967G9n.A02(j)), this.A00)) + AnonymousClass7TG.A0C(this.A04);
    }

    public C52399GQy(C304806Fh r1, float f, long j, long j2, long j3) {
        this.A01 = j;
        this.A02 = j2;
        this.A00 = f;
        this.A03 = j3;
        this.A04 = r1;
    }
}
