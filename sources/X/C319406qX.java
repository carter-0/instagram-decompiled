package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;

/* renamed from: X.6qX  reason: invalid class name and case insensitive filesystem */
public final class C319406qX implements AnonymousClass0lh, CallerContextable {
    public static final String __redex_internal_original_name = "FxAcProfilePictureEligibility";
    public boolean A00;
    public final UserSession A01;

    public C319406qX(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
    }

    public final boolean A00() {
        UserSession userSession = this.A01;
        boolean A0B = C317816nt.A00(userSession).A0B(userSession, "IG_PROFILE_PHOTO_CHANGE_CHAINING", true);
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36316078791593904L)) {
            return false;
        }
        if (!182.A06(r2, userSession, 36319746693668437L) && 182.A06(r2, userSession, 36316078791528367L)) {
            0Tu r22 = 0Tu.A05;
            if (!182.A06(r22, userSession, 36314403754215962L)) {
                boolean A06 = 182.A06(r22, userSession, 36319746694323807L);
                boolean z = 1Au.A00(userSession).A01.getBoolean("fx_cal_profile_photo_chaining_ac_upsell_seen", false);
                if (A06) {
                    if (z || this.A00) {
                        C46402DeP deP = new C46402DeP(userSession);
                        if (deP.A02("IG_PROFILE_PHOTO_CHANGE_CHAINING")) {
                            return false;
                        }
                        deP.A01("IG_PROFILE_PHOTO_CHANGE_CHAINING");
                        deP.A00("IG_PROFILE_PHOTO_CHANGE_CHAINING");
                        return false;
                    }
                } else if (z) {
                    return false;
                }
            }
        }
        if (2Lv.A00(userSession).A00(CallerContext.A00(C319406qX.class), "ig_android_linking_cache_fx_ac_eligibility_linkage_check") || !A0B) {
            return false;
        }
        return 182.A06(0Tu.A05, userSession, 36316078791462830L);
    }

    public final void onSessionWillEnd() {
        this.A01.A03(C319406qX.class);
    }
}
