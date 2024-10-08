package com.instagram.urlhandlers.carecsat;

import X.08y;
import X.09i;
import X.0qQ;
import X.1ES;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C229382nI;
import X.C359988do;
import X.C360678ey;
import X.C50128FQl;
import X.DbS;
import X.DbT;
import X.DbX;
import X.DbY;
import X.DbZ;
import X.E84;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import android.util.SparseArray;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONObject;

public final class CareCsatUrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return "care_csat_url_handler_activity";
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.urlhandlers.carecsat.CareCsatUrlHandlerActivity, android.app.Activity] */
    public final void onBackPressed() {
        finish();
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.urlhandlers.carecsat.CareCsatUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, X.0iw, java.lang.Object, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-1392076615);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            08y r7 = 09i.A0A;
            if (r7.A05(this) != null) {
                AnonymousClass0wW A05 = r7.A05(this);
                if (!(A05 instanceof UserSession)) {
                    FFQ.A01(this, A0A, A05);
                    finish();
                    i = -1356109979;
                } else {
                    String A0m = DbS.A0m(A0A);
                    if (A0m == null) {
                        finish();
                        i = -92797707;
                    } else {
                        Uri A09 = DbT.A09(A0m);
                        if (A09.getQueryParameter("survey_id") == null) {
                            finish();
                            i = -193361080;
                        } else {
                            DbZ.A0u(this, getWindow());
                            JSONObject A11 = DbS.A11();
                            JSONObject put = DbS.A11().put("server_params", A11);
                            Set<String> queryParameterNames = A09.getQueryParameterNames();
                            0qQ.A07(queryParameterNames);
                            Iterator<String> it = queryParameterNames.iterator();
                            while (it.hasNext()) {
                                String A18 = AnonymousClass7TE.A18(it);
                                A11.put(A18, A09.getQueryParameter(A18));
                            }
                            HashMap A0m2 = DbY.A0m("params", put.toString());
                            C50128FQl.A00(getSupportFragmentManager(), this, 5);
                            C229382nI A01 = C229382nI.A01((SparseArray) null, this, this, r7.A05(this));
                            C360678ey A052 = C359988do.A05(A05, "com.bloks.www.novi.care.start_survey_action", A0m2);
                            E84.A00(A052, A01, 19);
                            1ES.A03(A052);
                            i = 66159902;
                        }
                    }
                }
                AnonymousClass0fD.A07(i, A00);
            }
        }
        finish();
        i = 1170363246;
        AnonymousClass0fD.A07(i, A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.carecsat.CareCsatUrlHandlerActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onStart() {
        int A00 = AnonymousClass0fD.A00(-302601122);
        overridePendingTransition(0, 0);
        super.onStart();
        AnonymousClass0fD.A07(1660134142, A00);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
