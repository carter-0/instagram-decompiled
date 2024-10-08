package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44156CXv {
    public static Map A00(C278064wB r4) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        User Amy = r4.Amy();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (Amy != null) {
            A1H.put("charity_user", Amy.A08());
        }
        if (r4.AqE() != null) {
            C46303DUg AqE = r4.AqE();
            if (AqE != null) {
                treeUpdaterJNI = AqE.FHC();
            }
            A1H.put("consumption_sheet_config", treeUpdaterJNI);
        }
        if (r4.AyY() != null) {
            A1H.put("donations_count", r4.AyY());
        }
        if (r4.AyZ() != null) {
            A1H.put("donations_count_current_session_only", r4.AyZ());
        }
        if (r4.getFormattedAmountRaised() != null) {
            A1H.put("formatted_amount_raised", r4.getFormattedAmountRaised());
        }
        if (r4.B7a() != null) {
            A1H.put("formatted_amount_raised_current_session_only", r4.B7a());
        }
        if (r4.B7b() != null) {
            A1H.put("formatted_amount_raised_during_live_str", r4.B7b());
        }
        if (r4.B7c() != null) {
            A1H.put("formatted_amount_raised_of_goal_amount_str", r4.B7c());
        }
        if (r4.B7e() != null) {
            A1H.put("formatted_donations_count", r4.B7e());
        }
        if (r4.B7f() != null) {
            A1H.put("formatted_donations_count_current_session_only", r4.B7f());
        }
        if (r4.getFormattedGoalAmount() != null) {
            A1H.put("formatted_goal_amount", r4.getFormattedGoalAmount());
        }
        if (r4.getFundraiserTitle() != null) {
            A1H.put("fundraiser_title", r4.getFundraiserTitle());
        }
        if (r4.BNI() != null) {
            A1H.put("live_fundraiser_id", r4.BNI());
        }
        if (r4.ByZ() != null) {
            A1H.put("standalone_fundraiser_id", r4.ByZ());
        }
        return 0Yt.A0B(A1H);
    }
}
