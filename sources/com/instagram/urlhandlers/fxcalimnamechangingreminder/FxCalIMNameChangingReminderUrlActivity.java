package com.instagram.urlhandlers.fxcalimnamechangingreminder;

import X.0Gl;
import X.0mp;
import X.0qQ;
import X.1WK;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass6W8;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.DbT;
import X.DbW;
import X.DbX;
import X.FFQ;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class FxCalIMNameChangingReminderUrlActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.fxcalimnamechangingreminder.FxCalIMNameChangingReminderUrlActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        int A002 = AnonymousClass0fD.A00(-138697269);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            this.A00 = DbT.A0W(A0A);
        }
        AnonymousClass0wW r1 = this.A00;
        if (!(r1 instanceof UserSession)) {
            1WK A003 = FFQ.A00();
            AnonymousClass0wW r0 = this.A00;
            0qQ.A0A(r0);
            A003.A00(this, A0A, r0);
        } else {
            0qQ.A0A(r1);
            UserSession A004 = 0Gl.A00(r1);
            if (A0A == null || (A0m = DbS.A0m(A0A)) == null) {
                finish();
                i = 1717342604;
                AnonymousClass0fD.A07(i, A002);
            }
            String queryParameter = DbT.A09(A0m).getQueryParameter("central_profile_screen_id");
            if (0mp.A0B(queryParameter)) {
                finish();
                i = 1332879213;
                AnonymousClass0fD.A07(i, A002);
            }
            HashMap A1E = AnonymousClass7TE.A1E();
            JSONObject A11 = DbS.A11();
            JSONObject A112 = DbS.A11();
            try {
                A11.put("account_id", A004.A06);
                A11.put("central_profile_screen_id", queryParameter);
                A11.put("is_account_id_igid", "true");
                A112.put("server_params", A11);
                DbW.A1Q(A112, A1E);
                C46649DiU A04 = C46649DiU.A04("com.bloks.www.fxim.settings.aview", A1E);
                0qQ.A0A(A04);
                IgBloksScreenConfig A0N = DbS.A0N(A004);
                A0N.A0i = true;
                AnonymousClass6W8.A06(getApplicationContext(), C49891FBs.A00(A0N, A04), ModalActivity.class, "bloks");
                finish();
            } catch (JSONException e) {
                RuntimeException runtimeException = new RuntimeException(e);
                AnonymousClass0fD.A07(-345861012, A002);
                throw runtimeException;
            }
        }
        i = 186076966;
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
