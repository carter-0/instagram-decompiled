package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.activity.RtcCallIntentHandlerActivity;

/* renamed from: X.PZX  reason: case insensitive filesystem */
public final class C73253PZX implements Runnable {
    public final /* synthetic */ C74496Pvq A00;
    public final /* synthetic */ RtcCallIntentHandlerActivity A01;

    public C73253PZX(C74496Pvq pvq, RtcCallIntentHandlerActivity rtcCallIntentHandlerActivity) {
        this.A01 = rtcCallIntentHandlerActivity;
        this.A00 = pvq;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.rtc.activity.RtcCallIntentHandlerActivity, android.content.Context, android.app.Activity] */
    public final void run() {
        Object obj;
        C72192OyC A002;
        08y r1 = 09i.A0A;
        ? r3 = this.A01;
        Bundle A06 = DbU.A06(r3);
        if (A06 != null) {
            UserSession A07 = r1.A07(A06);
            if (A07 == null || (A002 = C66953Mfm.A00(DbT.A05(r3), A07)) == null) {
                obj = null;
            } else {
                obj = A002.A09.A0K.A00.A00;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("RtcCallIntentHandlerActivity: Intent handler activity timed out. Operation: ");
            A1A.append(this.A00);
            0wb.A03("RtcCallIntentHandlerActivity", AnonymousClass7TG.A0m(obj, " Current call state: ", A1A));
            r3.finish();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
