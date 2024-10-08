package X;

import android.os.CountDownTimer;

/* renamed from: X.9Xa  reason: invalid class name and case insensitive filesystem */
public final class C380199Xa extends CountDownTimer {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9QI A01;

    public final void onTick(long j) {
        float f = (float) j;
        float f2 = (float) this.A00;
        float f3 = 0.0f - f2;
        float f4 = 1.0f - 0.0f;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - f2) / f3;
        }
        AnonymousClass9QI r0 = this.A01;
        r0.A02.A00(r0.A01.getInterpolation((f5 * f4) + 0.0f));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380199Xa(AnonymousClass9QI r3, int i, long j) {
        super(j, 100);
        this.A00 = i;
        this.A01 = r3;
    }

    public final void onFinish() {
        this.A01.A02.A00(1.0f);
    }
}
