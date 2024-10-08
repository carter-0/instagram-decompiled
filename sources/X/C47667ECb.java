package X;

import android.app.Activity;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* renamed from: X.ECb  reason: case insensitive filesystem */
public final class C47667ECb extends 1P0 {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final ProgressButton A03;
    public final C46634DiE A04;

    public C47667ECb(Activity activity, AnonymousClass0iw r3, UserSession userSession, ProgressButton progressButton, C46634DiE diE) {
        AnonymousClass7TF.A1D(userSession, 2, diE);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = r3;
        this.A04 = diE;
        this.A03 = progressButton;
    }

    public final void onFail(C268654dm r16) {
        int i;
        String str;
        int A032 = AnonymousClass0fD.A03(-1000272034);
        C268654dm r4 = r16;
        0qQ.A0B(r4, 0);
        Activity activity = this.A00;
        if (activity == null || activity.isFinishing()) {
            i = -633206948;
        } else {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            AnonymousClass1XT A0L = DbT.A0L(r4);
            if (A0L != null) {
                str = A0L.getErrorMessage();
            } else {
                str = null;
            }
            UserSession userSession = this.A02;
            C49944FFx.A00(userSession, false, this.A04.A01, "client_reg_register_feo2_service_fail", "register auto conf failed", "registration_flow", "ar_code_sms", (String) null, (String) null, str, (String) null);
            C46413Dea.A06(activity, (Uri) null, this.A01, userSession);
            i = 1420382592;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        ProgressButton progressButton;
        int A032 = AnonymousClass0fD.A03(858092601);
        C47667ECb.super.onStart();
        if (!(this.A00 == null || (progressButton = this.A03) == null)) {
            progressButton.setShowProgressBar(true);
        }
        AnonymousClass0fD.A0A(-1652722847, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(404683185);
        int A033 = AnonymousClass0fD.A03(-1301644236);
        0qQ.A0B(obj, 0);
        Activity activity = this.A00;
        if (activity == null || activity.isFinishing()) {
            i = 1279955873;
        } else {
            ProgressButton progressButton = this.A03;
            if (progressButton != null) {
                progressButton.setShowProgressBar(false);
            }
            UserSession userSession = this.A02;
            C49944FFx.A01(userSession, this.A04.A01, "client_reg_register_feo2_service_success", "registration_flow", "ar_code_sms");
            C46413Dea.A06(activity, (Uri) null, this.A01, userSession);
            i = 449275953;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-1800902221, A032);
    }
}
