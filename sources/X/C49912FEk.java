package X;

import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository;
import java.util.HashMap;

/* renamed from: X.FEk  reason: case insensitive filesystem */
public final class C49912FEk {
    public static boolean A00;
    public static final C49912FEk A01 = new Object();

    public final boolean A01(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (new CXPNoticeStateRepository(userSession, AnonymousClass05K.A00).A00(2DQ.A0K).A00 > 0 || 2D5.A00(userSession).A04.getInt("PREFERENCE_REELS_XAR_CCP_MIGRATION_UPSELL_SEEN_COUNT", 0) <= 0 || !182.A06(0Tu.A05, userSession, 2342161394402596965L)) {
            return false;
        }
        return true;
    }

    public static final void A00(AnonymousClass818 r4, AnonymousClass4DH r5, UserSession userSession, Integer num, String str) {
        String str2;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r5);
        if (A00) {
            0KC.A0C("ShareToFacebookMigrationUpsellUtil", 002.A0g("launchMigrationUpsell(bloksAppId=", str, ") has pending"));
            return;
        }
        A00 = A1Z;
        if (str != null && str.length() != 0) {
            0eP A1L = AnonymousClass7TE.A1L("entrypoint", r4.A00);
            if (num != null) {
                str2 = num.toString();
            } else {
                str2 = null;
            }
            HashMap A0e = Dbb.A0e("qpl_instance_key", str2, A1L);
            C229382nI A03 = C229382nI.A03(r5, userSession, (2el) null);
            C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, userSession, str, A0e);
            A02.A00(new E86(r5, A03, 20));
            r5.registerLifecycleListener(new C50297FXc(r5, r5.scheduleAndGetLoaderId(A02)));
        }
    }
}
