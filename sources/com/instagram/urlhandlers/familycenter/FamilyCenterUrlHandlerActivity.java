package com.instagram.urlhandlers.familycenter;

import X.1G0;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass06Q;
import X.AnonymousClass0fD;
import X.AnonymousClass0fN;
import X.AnonymousClass0wW;
import X.AnonymousClass16q;
import X.AnonymousClass6ST;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C229382nI;
import X.C250563lf;
import X.C50128FQl;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbZ;
import X.F63;
import X.FBO;
import X.FFQ;
import X.FVS;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import org.json.JSONObject;

public final class FamilyCenterUrlHandlerActivity extends BaseFragmentActivity {
    public boolean A00 = true;
    public final AnonymousClass06Q A01 = new C50128FQl(this, 11);

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity, com.instagram.urlhandlers.familycenter.FamilyCenterUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        Integer num;
        AnonymousClass16q C31;
        Integer num2;
        String A19;
        String A192;
        String A193;
        int i;
        int A002 = AnonymousClass0fD.A00(-1103601008);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -326262922;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = 1460784945;
            } else {
                UserSession A0S = DbS.A0S(this);
                if (!(A0S instanceof UserSession)) {
                    FFQ.A01(this, A0A, A0S);
                } else {
                    DbZ.A0u(this, getWindow());
                    getSupportFragmentManager().A0s(this.A01);
                    Uri A09 = DbT.A09(A0m);
                    UserSession userSession = A0S;
                    if ((DbV.A03(A09) < 1 || (A193 = AnonymousClass7TE.A19(A09.getPathSegments(), 0)) == null || !A193.equalsIgnoreCase("supervision")) && ((C31 = DbV.A0k(userSession).C31()) == null || !AnonymousClass7TF.A1Y(C31.CSM(), true) || DbV.A03(A09) < 1 || (((A19 = AnonymousClass7TE.A19(A09.getPathSegments(), 0)) == null || !A19.equalsIgnoreCase("dashboard")) && ((A192 = AnonymousClass7TE.A19(A09.getPathSegments(), 0)) == null || !A192.equalsIgnoreCase("share_supervision"))))) {
                        try {
                            num2 = F63.A00(String.valueOf(A09.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused) {
                            num2 = AnonymousClass05K.A0u;
                        }
                        AnonymousClass7TF.A1B(userSession, 1, num2);
                        AnonymousClass16q C312 = DbX.A0m(userSession).C31();
                        String str = null;
                        String obj = A09.toString();
                        if (obj == null) {
                            if (C312 != null) {
                                obj = C312.B4n();
                            } else {
                                obj = null;
                            }
                        }
                        if (obj != null) {
                            Uri.Builder A07 = DbW.A07(obj);
                            A07.appendQueryParameter("entrypoint", F63.A01(num2));
                            str = A07.toString();
                        }
                        AnonymousClass6ST r6 = new AnonymousClass6ST(this, true);
                        DbX.A15(r6.getContext(), r6);
                        r6.setCancelable(false);
                        AnonymousClass0fN.A00(r6);
                        C229382nI A012 = C229382nI.A01((SparseArray) null, this, DbS.A0O("guardian_pairing_screen"), userSession);
                        HashMap A1E = AnonymousClass7TE.A1E();
                        HashMap A0v = DbX.A0v();
                        A1E.put("serialized_logging_context", new JSONObject(AnonymousClass7TF.A0w("entrypoint", F63.A01(num2))).toString());
                        A1E.put(AnonymousClass000.A00(806), Long.valueOf(1G0.A00()));
                        A1E.put("weburl", str);
                        FBO.A00(new FVS(1, this, r6), "com.bloks.www.yp.familycenter.async", A1E, A0v).A01(this, A012);
                    } else {
                        try {
                            num = F63.A00(String.valueOf(A09.getQueryParameter("entrypoint")));
                        } catch (IllegalArgumentException unused2) {
                            num = AnonymousClass05K.A0u;
                        }
                        C250563lf.A0b(this, userSession, num);
                    }
                }
                i = 622365274;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.urlhandlers.familycenter.FamilyCenterUrlHandlerActivity] */
    public final void onResume() {
        int A002 = AnonymousClass0fD.A00(-606488147);
        super.onResume();
        if (!this.A00) {
            setResult(0);
            finish();
        }
        this.A00 = false;
        AnonymousClass0fD.A07(-702929793, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
