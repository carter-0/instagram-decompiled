package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.json.JSONObject;

public final class IVZ implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVZ(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj3;
        this.A01 = obj4;
        this.A02 = obj2;
    }

    public final void onButtonClick(View view) {
        1eB r1;
        switch (this.A00) {
            case 0:
                C46524DgR dgR = (C46524DgR) this.A04;
                UserSession userSession = dgR.A03;
                AnonymousClass0iw r2 = dgR.A02;
                C3265677h.A0S(r2, userSession, "send_toast_view_button_click", DbS.A0q(this.A03), ((C247733gp) this.A01).A0G, (String) null);
                1pE A012 = 1pE.A01(dgR.A00, r2, userSession, C66579MXk.A00(380));
                A012.A0B(AnonymousClass7TE.A1I(this.A02));
                A012.A06();
                return;
            case 1:
                C56653I6i.A03((JR4) this.A02, (C275524qU) this.A03, (C53278GlQ) this.A01);
                return;
            case 2:
                Fragment fragment = (Fragment) this.A02;
                FragmentActivity activity = fragment.getActivity();
                if (!fragment.isAdded() || activity == null) {
                    0wb.A03(C273654mx.A00(944), "Restrict button was clicked before fragment attached to activity");
                    return;
                }
                User user = (User) this.A01;
                AnonymousClass73V.A0H((0wc) this.A03, "click", "block_toast_upsell_learn_more_button", user.getId());
                UserSession userSession2 = (UserSession) this.A04;
                E66 A002 = C49925FFb.A00(userSession2, user, C48088EVg.PROFILE_BLOCK_UPSELL, new C51099FoT(fragment, 2), (JSONObject) null, false);
                if (A002 != null) {
                    C331127Pr A0W = DbS.A0W(userSession2);
                    A0W.A0U = null;
                    A0W.A00().A03(activity, A002);
                    return;
                }
                return;
            default:
                1Xj r4 = (1Xj) this.A02;
                C52029GCb gCb = (C52029GCb) this.A04;
                AnonymousClass1eD Anw = r4.A0C.Anw();
                if (Anw != null) {
                    C45446CwZ AKC = Anw.AKC();
                    AKC.A03 = gCb.A06.getString(2131966739);
                    r1 = AKC.A00();
                } else {
                    r1 = null;
                }
                r4.A0C.ERo(r1);
                C52029GCb.A07((MediaControlEventSourceEnum) this.A01, r4, (AnonymousClass3W1) this.A03, gCb);
                return;
        }
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        if (2 - this.A00 == 0) {
            0xa A0q = AnonymousClass7TE.A0q((UserSession) this.A04);
            AnonymousClass7TG.A1M(A0q, "restrict_block_upsell_snackbar_shown_count", DbT.A00(A0q, "restrict_block_upsell_snackbar_shown_count") + 1);
            AnonymousClass73V.A0H((0wc) this.A03, "impression", "block_toast_upsell", DbS.A0q(this.A01));
        }
    }
}
