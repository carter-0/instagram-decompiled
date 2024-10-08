package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.HBl  reason: case insensitive filesystem */
public final class C54394HBl extends AnonymousClass2xK {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ HOV A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;

    public final boolean Ds8(AnonymousClass5Gv r6) {
        0qQ.A0B(r6, 0);
        C55208Hdy.A00(this.A00, this.A01, this.A02, this.A03);
        r6.A08(false);
        return true;
    }

    public C54394HBl(Activity activity, HOV hov, UserSession userSession, 1Xj r4) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = hov;
    }

    public final void DsH(AnonymousClass5Gv r6) {
        long currentTimeMillis = System.currentTimeMillis();
        UserSession userSession = this.A02;
        0xY A0N = AnonymousClass7TF.A0N(userSession);
        A0N.E5c("world_pages_tooltip_last_seen_timestamp_ms", currentTimeMillis);
        A0N.apply();
        I40.A00 = currentTimeMillis;
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        AnonymousClass7TG.A1M(A0q, "world_pages_tooltip_impression_count", DbT.A00(A0q, "world_pages_tooltip_impression_count") + 1);
    }
}
