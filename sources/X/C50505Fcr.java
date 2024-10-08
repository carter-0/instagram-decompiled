package X;

import android.content.Context;
import android.view.WindowManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fcr  reason: case insensitive filesystem */
public final class C50505Fcr implements C66491MTu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ AnonymousClass3FW A03;

    public final void D1x(Context context) {
        Context context2 = context;
        0qQ.A0B(context2, 0);
        UserSession userSession = this.A01;
        AnonymousClass0iw r5 = C46359DdX.A00;
        AnonymousClass7TG.A1N(userSession, r5);
        DcM.A03(new DcM(r5, userSession), this.A03.A03(0), "ig_quiet_mode_in_app_upsell_tap", "in_app_upsell");
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass3FW r4 = new AnonymousClass3FW(userSession);
        C51078Fo8 fo8 = new C51078Fo8(userSession, r4);
        C358248ab A0X = DbS.A0X(fragmentActivity);
        DbU.A16(context2, A0X, R.drawable.ig_illustrations_qp_moon_refresh);
        DbT.A19(context2, A0X, 2131971183);
        DbU.A17(context2, A0X, 2131971182);
        A0X.A0c(new FIh(8, context2, userSession, fragmentActivity, fo8, r4), AnonymousClass7TE.A16(context2, 2131975588));
        C50025FJk.A02(A0X, userSession, r4, 61, 2131968513);
        try {
            DbT.A1V(A0X);
            AnonymousClass7TG.A1N(userSession, r5);
            DcM.A03(new DcM(r5, userSession), r4.A03(0), "ig_quiet_mode_upsell_dialog_shown", "in_app_upsell");
        } catch (WindowManager.BadTokenException e) {
            AnonymousClass7TG.A1N(userSession, r5);
            new DcM(r5, userSession).A05(r4.A03(0), "in_app_upsell", e.toString(), "In app upsell dialog could not render", 0, 0, false);
            0wb.A03("QuietModeViewHelper#showQuietModeInAppUpsellDialog()", "BadTokenException when trying to call .show() on a dialog after the activity has stopped.");
        }
    }

    public final void onDismiss() {
    }

    public C50505Fcr(FragmentActivity fragmentActivity, UserSession userSession, User user, AnonymousClass3FW r4) {
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = fragmentActivity;
        this.A02 = user;
    }
}
