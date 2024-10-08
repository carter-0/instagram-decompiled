package X;

import com.facebook.locationsharing.core.models.LiveLocationSession;

/* renamed from: X.Wi7  reason: case insensitive filesystem */
public final class C19934Wi7 implements Runnable {
    public final /* synthetic */ UHR A00;

    public C19934Wi7(UHR uhr) {
        this.A00 = uhr;
    }

    public final void run() {
        UHR uhr = this.A00;
        if (uhr.A00) {
            UHS.A04(uhr, C51968G9o.A0u(), "CURRENT_TIME_UPDATED");
            LiveLocationSession liveLocationSession = UHR.A00(uhr).A03;
            if (liveLocationSession != null) {
                long j = liveLocationSession.A00;
                if (j != -1 && j <= System.currentTimeMillis()) {
                    UHR.A03(uhr, liveLocationSession, false);
                }
            }
            uhr.A00.postDelayed(this, 10000);
        }
    }
}
