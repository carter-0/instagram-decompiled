package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;
import com.instagram.api.schemas.UserRoleOnFundraiser;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cdq  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44370Cdq {
    public static Map A00(C46322DUz dUz) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dUz.getCanViewerDonate();
        A1H.put("can_viewer_donate", Boolean.valueOf(dUz.getCanViewerDonate()));
        if (dUz.Amv() != null) {
            A1H.put("charity_ig_username", dUz.Amv());
        }
        dUz.getEndTime();
        A1H.put("end_time", Long.valueOf(dUz.getEndTime()));
        if (dUz.getFormattedFundraiserProgressInfoText() != null) {
            A1H.put("formatted_fundraiser_progress_info_text", dUz.getFormattedFundraiserProgressInfoText());
        }
        if (dUz.getFormattedGoalAmount() != null) {
            A1H.put("formatted_goal_amount", dUz.getFormattedGoalAmount());
        }
        if (dUz.getFundraiserId() != null) {
            A1H.put("fundraiser_id", dUz.getFundraiserId());
        }
        if (dUz.getFundraiserTitle() != null) {
            A1H.put("fundraiser_title", dUz.getFundraiserTitle());
        }
        if (dUz.B8g() != null) {
            FundraiserVisibilityOnProfileStatus B8g = dUz.B8g();
            0qQ.A0B(B8g, 0);
            A1H.put("fundraiser_visibility_status_on_user_profile", B8g.A00);
        }
        if (dUz.getOwnerUsername() != null) {
            A1H.put("owner_username", dUz.getOwnerUsername());
        }
        dUz.Bbb();
        A1H.put("percent_raised", Integer.valueOf(dUz.Bbb()));
        if (dUz.CCw() != null) {
            UserRoleOnFundraiser CCw = dUz.CCw();
            0qQ.A0B(CCw, 0);
            A1H.put("user_role", CCw.A00);
        }
        return 0Yt.A0B(A1H);
    }
}
