package X;

/* renamed from: X.6CB  reason: invalid class name */
public final class AnonymousClass6CB extends AnonymousClass0T0 implements AnonymousClass6CC {
    public final long A00;

    public final C304806Fh AE1() {
        return null;
    }

    public final C304826Fj E1Z(AnonymousClass6CD r3) {
        return new C304826Fj(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CB) {
                long j = this.A00;
                long j2 = ((AnonymousClass6CB) obj).A00;
                long j3 = AnonymousClass5RW.A01;
                if (j == j2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = AnonymousClass5RW.A01;
        return (int) (j ^ (j >>> 32));
    }

    public AnonymousClass6CB(long j) {
        this.A00 = j;
    }

    public final AnonymousClass5S2 AD5(C286575Wy r3, AnonymousClass6CD r4, int i) {
        r3.ExS(-1906765004);
        if (0fL.A02()) {
            0fL.A01(-545503996, "com.instagram.compose.igds.components.button.LinkButtonStyle.backgroundShape (IgdsButton.kt:160)");
        }
        AnonymousClass5S2 r1 = AnonymousClass5S0.A00;
        if (0fL.A02()) {
            0fL.A00(771016107);
        }
        C286565Wx.A0L((C286565Wx) r3, false);
        return r1;
    }

    public final float Axc() {
        return 0.3f;
    }

    public final long AD4(boolean z) {
        return AnonymousClass5RW.A07;
    }

    public final long AJf(boolean z) {
        return this.A00;
    }

    public final float CoN(AnonymousClass6CD r2) {
        return Float.NaN;
    }
}
