package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.model.LeadGenBaseFormList;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.user.model.User;

public final class FdA implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }

    public final void onButtonClick(View view) {
        1YZ r0;
        switch (this.A00) {
            case 0:
                1We r5 = 1We.A02;
                if (r5 != null) {
                    UserSession userSession = (UserSession) this.A03;
                    2Ci.A07(userSession, AnonymousClass05K.A0B, Long.valueOf(Dba.A01(userSession)));
                    Dbb.A0o((Bundle) null, 1We.A00(r5).A01(userSession, EWJ.IG_TS_SIMILAR_POSTS_NUDGE), (FragmentActivity) this.A01, (0lg) this.A02);
                    return;
                }
                return;
            case 1:
                DirectShareSheetFragment directShareSheetFragment = (DirectShareSheetFragment) this.A01;
                1pE A012 = 1pE.A01((Activity) this.A02, directShareSheetFragment, directShareSheetFragment.A0G, "direct_forwarding_toast");
                A012.A00 = directShareSheetFragment;
                String A08 = ((DirectShareTarget) this.A03).A08();
                A08.getClass();
                DbZ.A1Z(A012, A08);
                DbV.A1R(A012);
                return;
            case 2:
                UserSession userSession2 = (UserSession) this.A03;
                Context context = (Context) this.A01;
                Bundle A0a = AnonymousClass7TE.A0a();
                Resources resources = context.getResources();
                String A0d = AnonymousClass7TF.A0d(resources, 2131963363);
                String A0d2 = AnonymousClass7TF.A0d(resources, 2131964884);
                String A0e = AnonymousClass7TF.A0e(resources, A0d2, 2131963360);
                0qQ.A07(A0e);
                String A04 = 182.A04(0Tu.A06, userSession2, 36877022995415164L);
                String A0d3 = AnonymousClass7TF.A0d(resources, 2131963356);
                String A0d4 = AnonymousClass7TF.A0d(resources, 2131963357);
                DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData = new DirectWellBeingUpsellBottomSheetData(2EG.A1x, AnonymousClass05K.A00, A0d, A0e, A0d2, A04, A0d3, A0d4, R.drawable.ig_illustrations_qp_messages_refresh, true);
                A0a.putString("bottom_sheet_content_fragment", AnonymousClass000.A00(3017));
                A0a.putParcelable(AnonymousClass000.A00(900), directWellBeingUpsellBottomSheetData);
                DbS.A0b((Activity) context, A0a, userSession2, TransparentModalActivity.class, "bottom_sheet").A0D((Fragment) this.A02, 1);
                1Av A002 = 1Au.A00(userSession2);
                C268194cw r3 = new C268194cw(C269474fB.A00);
                r3.A0C("seen", A002.A01.getInt(C66579MXk.A00(867), 0));
                C49762F5o.A01(userSession2, AnonymousClass05K.A01, (Integer) null, r3.toString());
                C49762F5o.A00(userSession2, AnonymousClass05K.A0N, AnonymousClass05K.A0C, (Integer) null);
                return;
            case 3:
                C49730F3v A0R = DbU.A0R();
                UserSession userSession3 = (UserSession) this.A03;
                Dbb.A0o((Bundle) null, A0R.A03(userSession3, new LeadGenBaseFormList((XIGIGBoostCallToAction) this.A01, (LeadForm) null, (String) null, "", AnonymousClass7TE.A1C(), false), AnonymousClass000.A00(169)), (FragmentActivity) this.A02, userSession3);
                return;
            case 4:
                C46410DeX deX = (C46410DeX) this.A01;
                UserSession userSession4 = (UserSession) this.A03;
                User user = (User) this.A02;
                UserDetailFragment userDetailFragment = deX.A03;
                userDetailFragment.getClass();
                if (userDetailFragment.getActivity() != null) {
                    C46465DfT dfT = deX.A02;
                    DbZ.A1S(dfT.A00, "unfollow_chaining_pill_tap", user.getId());
                    deX.A01();
                    C46410DeX.A00(deX.A03.requireActivity(), userSession4, user, C46443Df5.UNFOLLOW_CHAIN);
                    return;
                }
                return;
            case 5:
                Activity activity = (Activity) this.A01;
                if (activity != null && (r0 = 1YZ.A02) != null && r0.A00.getValue() != null) {
                    0lg r1 = (0lg) this.A03;
                    Bundle A0A = DbV.A0A(r1);
                    C47397E0p e0p = new C47397E0p();
                    C331127Pr A0V = DbV.A0V(A0A, e0p, r1);
                    DbZ.A0z((Context) this.A02, A0V, 2131972343);
                    DbU.A0y(activity, e0p, A0V);
                    return;
                }
                return;
            default:
                1We r02 = 1We.A02;
                if (r02 != null) {
                    DbY.A14(1We.A00(r02).A01((UserSession) this.A03, EWJ.IG_TS_SIMILAR_POSTS_NUDGE), (FragmentActivity) this.A01, (0lg) this.A02);
                    return;
                }
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        switch (this.A00) {
            case 2:
                C49762F5o.A01((UserSession) this.A03, AnonymousClass05K.A0C, (Integer) null, (String) null);
                02m.A0p.markerEnd(190449529, 2);
                return;
            case 4:
                C46465DfT dfT = ((C46410DeX) this.A01).A02;
                DbZ.A1S(dfT.A00, "unfollow_chaining_show_pill", DbS.A0q(this.A02));
                return;
            default:
                return;
        }
    }
}
