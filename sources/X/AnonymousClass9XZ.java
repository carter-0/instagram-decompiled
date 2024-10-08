package X;

import android.os.CountDownTimer;

/* renamed from: X.9XZ  reason: invalid class name */
public final class AnonymousClass9XZ extends CountDownTimer {
    public final /* synthetic */ C354898Nu A00;

    public final void onFinish() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9XZ(C354898Nu r1, long j, long j2) {
        super(j, j2);
        this.A00 = r1;
    }

    public final void onTick(long j) {
        05G r1 = this.A00.A04;
        r1.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r1.getValue()) + 2));
    }
}
