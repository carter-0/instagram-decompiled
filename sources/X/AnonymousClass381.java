package X;

import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.store.PendingMediaStore;

/* renamed from: X.381  reason: invalid class name */
public final class AnonymousClass381 implements Runnable {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ 1ua A01;

    public AnonymousClass381(UserSession userSession, 1ua r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }

    public final void run() {
        int i;
        PendingMediaStore A002 = 28K.A00(this.A00);
        AnonymousClass3T1 A09 = C242173Sx.A09(AnonymousClass3T2.A00, C242173Sx.A0B(new AnonymousClass9LT(A002, 36), 00k.A0o(00k.A0a(A002.A06.keySet()))));
        1ua r6 = this.A01;
        AnonymousClass3T3 r5 = new AnonymousClass3T3(A09);
        while (r5.hasNext()) {
            AnonymousClass3Q2 r7 = (AnonymousClass3Q2) r5.next();
            C2373737j r4 = (C2373737j) r6.A02;
            0qQ.A0B(r7, 0);
            0xI A003 = C2373737j.A00((AnonymousClass0iw) null, r7, r4, "pending_media_info");
            A003.A0C("step", "pending_media_migrated");
            AnonymousClass3Q4 r2 = r7.A6K;
            if (r2 != null) {
                i = r7.A1h.ordinal() - r2.ordinal();
            } else {
                i = 0;
            }
            A003.A08(Integer.valueOf(i), "render_duration_forecast");
            C2373737j.A06(A003, r7.A6J, r4);
        }
    }
}
