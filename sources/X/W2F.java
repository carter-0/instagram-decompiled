package X;

import android.app.Activity;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.HashMap;

public final class W2F {
    public static final void A02(UserSession userSession, FragmentActivity fragmentActivity) {
        C309516Yo A0M = DbV.A0M(C13990Tnq.A0N().A08(ErrorIdentifier.UNKNOWN_ERROR, userSession), fragmentActivity, userSession);
        A0M.A0D = false;
        A0M.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r3 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(android.content.Context r5, com.instagram.business.promote.model.PromoteData r6) {
        /*
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r0 = 2131964765(0x7f13335d, float:1.956632E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r5, r0)
            com.instagram.leadgen.core.api.LeadForm r0 = r6.A16
            r4 = 0
            if (r0 == 0) goto L_0x0034
            java.util.List r0 = r0.A05
            if (r0 == 0) goto L_0x0034
            java.util.Iterator r2 = r0.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r3 = r2.next()
            r1 = r3
            com.instagram.leadgen.core.api.LeadGenInfoFieldData r1 = (com.instagram.leadgen.core.api.LeadGenInfoFieldData) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = r1.A00
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0018
            r2 = 1
            if (r3 != 0) goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r6.A0i
            com.instagram.api.schemas.XIGIGBoostDestination r0 = com.instagram.api.schemas.XIGIGBoostDestination.LEAD_GENERATION
            if (r1 != r0) goto L_0x003e
            if (r2 == 0) goto L_0x003e
            r4 = 1
        L_0x003e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2F.A03(android.content.Context, com.instagram.business.promote.model.PromoteData):boolean");
    }

    public static final HashMap A00(Uri uri) {
        String queryParameter = uri.getQueryParameter("media_id");
        String queryParameter2 = uri.getQueryParameter("channel_id");
        String queryParameter3 = uri.getQueryParameter("tip_id");
        String queryParameter4 = uri.getQueryParameter("is_aymt_tip");
        HashMap A0m = DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, AnonymousClass000.A00(1263));
        if (queryParameter != null) {
            A0m.put("media_id", queryParameter);
        }
        if (queryParameter2 != null) {
            A0m.put("channel_id", queryParameter2);
        }
        if (queryParameter3 != null) {
            A0m.put("tip_id", queryParameter3);
        }
        if (queryParameter4 != null) {
            A0m.put("is_aymt_tip", queryParameter4);
        }
        return A0m;
    }

    public final void A04(Activity activity, PromoteData promoteData, C62320sa r7) {
        if (promoteData.A0i == XIGIGBoostDestination.LEAD_GENERATION) {
            UserSession userSession = promoteData.A0y;
            0qQ.A06(userSession);
            if (182.A06(0Tu.A05, userSession, 36319630729420331L) && activity != null) {
                C358248ab r3 = new C358248ab(activity);
                r3.A09(2131964868);
                r3.A08(2131964866);
                r3.A0i(activity.getDrawable(R.drawable.ig_illustrations_qp_info_refresh));
                r3.A0E(W57.A00);
                r3.A0H(new C50023FJi(r7, 23), 2131964867);
                DbT.A1V(r3);
            }
        }
    }

    public static final void A01(FragmentActivity fragmentActivity, 0lg r3, String str, HashMap hashMap) {
        FragmentActivity fragmentActivity2 = (FragmentActivity) C71172bH.A00();
        if (fragmentActivity2 != null) {
            fragmentActivity.finish();
        }
        AnonymousClass3M3 A02 = C46649DiU.A02(r3, str, hashMap);
        if (fragmentActivity2 != null) {
            fragmentActivity = fragmentActivity2;
        }
        DbY.A14(A02, fragmentActivity, r3);
    }

    public final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        String str3;
        DbY.A1S(str, userSession);
        HashMap A0m = DbY.A0m(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "promotion_manager_view_all_leads");
        int length = str2.length();
        if (length > 0) {
            A0m.put("media_id", str2);
            A0m.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "promotion_manager_view_media_leads");
        }
        User A0Q = AnonymousClass7TF.A0Q(userSession);
        Boolean CS2 = A0Q.A03.CS2();
        if (CS2 == null || !CS2.booleanValue()) {
            str3 = "com.bloks.www.ig.smb.services.lead_gen.all_leads";
        } else {
            String BM3 = A0Q.A03.BM3();
            if (BM3 == null) {
                BM3 = "";
            }
            if (!BM3.equals("com.bloks.www.ig.smb.lead_gen.subpage") || length <= 0) {
                str3 = A0Q.A03.BM3();
                if (str3 == null) {
                    str3 = "";
                }
            } else {
                str3 = "com.bloks.www.ig.smb.lead_gen.all_lead_opportunities";
            }
        }
        AnonymousClass3M3 A02 = C46649DiU.A02(userSession, str3, A0m);
        C309516Yo r0 = new C309516Yo(fragmentActivity, userSession);
        r0.A0A = str;
        r0.A0D(A02);
        r0.A04();
    }
}
