package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Lg  reason: invalid class name and case insensitive filesystem */
public final class C306206Lg implements C250603lj {
    public final C230332pS A00;
    public final AnonymousClass2pP A01;

    public final void ATF(AnonymousClass30Y r6, C252093oY r7) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r7, 1);
        AnonymousClass2pP r4 = this.A01;
        C254213s7 A002 = r4.A00(r6.A05);
        int intValue = r7.CEk(r6).intValue();
        if (intValue == 0) {
            return;
        }
        if (intValue != 1) {
            A002.A04(r7);
            r4.A01(this.A00, A002, r6.A03, r6.A04);
            return;
        }
        A002.A03(r6, r7);
    }

    public C306206Lg(Context context, C310666bQ r15) {
        UserSession userSession = r15.A01;
        this.A01 = new AnonymousClass2pP(C60510iO.A00(userSession), false);
        1Ua r9 = (1Ua) userSession.A01(C310746bY.class, new AnonymousClass9LV(new 1Ua(context, userSession, "stories_impression_store"), 27));
        AnonymousClass4DU r6 = r15.A02;
        AnonymousClass3BQ r7 = r15.A03;
        0qQ.A0B(r9, 0);
        this.A00 = new C306156La(new C310756bZ(userSession, r6, r7, r15.A06, r9, r15.A08, "instagram_ad_segment_vpvd_imp", r15.A07));
    }
}
