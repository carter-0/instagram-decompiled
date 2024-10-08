package X;

import android.app.Activity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GTq  reason: case insensitive filesystem */
public final class C52464GTq {
    public long A00;
    public long A01;
    public long A02;
    public C249763kK A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public final AnonymousClass0JR A08 = new Object();
    public final UserSession A09;

    public final void A00(Activity activity) {
        Long l = this.A06;
        if (l != null) {
            long now = this.A08.now() - l.longValue();
            if (1Wj.A00 != null && now >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                HashMap A1E = AnonymousClass7TE.A1E();
                UserSession userSession = this.A09;
                if (182.A06(0Tu.A05, userSession, 36326313699063497L)) {
                    A1E.put("saved", String.valueOf(C52478GUg.A00(userSession).A02));
                    A1E.put("reshared_to_message", String.valueOf(C52478GUg.A00(userSession).A00));
                    A1E.put("reshared_to_story", String.valueOf(C52478GUg.A00(userSession).A01));
                    A1E.put("time_spent_by_session", String.valueOf(now));
                    A1E.put("time_spent_on_grid", String.valueOf(this.A01));
                    A1E.put("time_spent_on_reels", String.valueOf(this.A02));
                    A1E.put("time_spent_on_chain", String.valueOf(this.A00));
                }
                C249763kK r0 = this.A03;
                if (r0 != null) {
                    A1E.put(Py2.A00(), r0.getSessionId());
                }
                C52478GUg.A00(userSession).A02 = false;
                C52478GUg.A00(userSession).A00 = false;
                C52478GUg.A00(userSession).A01 = false;
                this.A00 = 0;
                this.A01 = 0;
                this.A02 = 0;
                DcL.A00().A00(activity, userSession, "651322380127796", A1E);
            }
            this.A06 = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0JR] */
    public C52464GTq(UserSession userSession) {
        this.A09 = userSession;
    }
}
