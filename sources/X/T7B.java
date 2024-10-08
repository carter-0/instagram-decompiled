package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.security.SecureRandom;
import org.json.JSONObject;

public final class T7B implements C61110lV {
    public int A00;
    public final long A01 = new SecureRandom().nextLong();
    public final 0wc A02;
    public final String A03;
    public final String A04;
    public final AnonymousClass0iw A05;

    public static final void A01(T7B t7b, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(t7b.A02, "lead_gen_ctc_app_state_change");
        JSONObject A11 = DbS.A11();
        A11.put("ei", t7b.A04);
        A00(A0e, t7b, DbT.A10(A11));
        A0e.AAJ("app_state", str);
        A0e.Cgf();
    }

    public final void A02(boolean z) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A02, "lead_gen_ctc_app_state_change");
        JSONObject A11 = DbS.A11();
        A11.put("ei", this.A04);
        A00(A0e, this, DbT.A10(A11));
        A0e.AAJ("app_state", "click_to_call_clicked");
        A0e.A7p("granted_permission", Boolean.valueOf(z));
        A0e.Cgf();
    }

    public T7B(UserSession userSession, String str, String str2) {
        this.A04 = str;
        this.A03 = str2;
        0xG r0 = new 0xG("call_ads_confirmation_dialog");
        this.A05 = r0;
        this.A02 = AnonymousClass0kN.A01(r0, userSession);
        this.A00 = 2;
        14i.A05(this);
    }

    public static void A00(0Aj r2, T7B t7b, String str) {
        r2.AAe("tracking_codes", 0sr.A1M(new String[]{str}));
        r2.A9F("click_session_id", Long.valueOf(t7b.A01));
        r2.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 002.A0R("ig_", t7b.A03));
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1532548339);
        A01(this, "app_did_enter_background");
        this.A00--;
        AnonymousClass0fD.A0A(1980649339, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-746197616);
        A01(this, "app_did_become_active");
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            14i.A06(this);
        }
        AnonymousClass0fD.A0A(2101259717, A032);
    }
}
