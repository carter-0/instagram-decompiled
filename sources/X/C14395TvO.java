package X;

import android.os.SystemClock;

/* renamed from: X.TvO  reason: case insensitive filesystem */
public final class C14395TvO implements C61110lV {
    public long A00;
    public final /* synthetic */ C14394TvN A01;

    public C14395TvO(C14394TvN tvN) {
        this.A01 = tvN;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-1660027797);
        this.A00 = SystemClock.elapsedRealtime();
        AnonymousClass0fD.A0A(-1837348114, A03);
    }

    public final void onAppForegrounded() {
        int A03 = AnonymousClass0fD.A03(-506824253);
        C14394TvN tvN = this.A01;
        if (C51971G9r.A1b(tvN.A09) && SystemClock.elapsedRealtime() - this.A00 >= 1200000) {
            tvN.A08.invoke();
        }
        AnonymousClass0fD.A0A(95900757, A03);
    }
}
