package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.90d  reason: invalid class name and case insensitive filesystem */
public final class C3722690d implements AnonymousClass11X {
    public 1Wr A00;
    public final /* synthetic */ C3722490b A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;

    public final String getName() {
        return "LocationPlugin";
    }

    public final int getRunnableId() {
        return 150;
    }

    public final void onCancel() {
    }

    public final void onStart() {
    }

    public C3722690d(C3722490b r1, UserSession userSession, String str) {
        this.A01 = r1;
        this.A02 = userSession;
        this.A03 = str;
    }

    public final void onFinish() {
        C3722490b r3 = this.A01;
        if (!r3.isCancelled()) {
            1Wr r2 = this.A00;
            r2.getClass();
            r3.addListener(new C295605oZ(this, r2.prefetchLocation(this.A02, this.A03)), new 0nQ(0nY.A00(), 149, 4, false, true));
        }
    }

    public final void run() {
        this.A00 = 1Wr.A00;
    }
}
