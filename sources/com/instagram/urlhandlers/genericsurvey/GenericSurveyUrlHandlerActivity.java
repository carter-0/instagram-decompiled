package com.instagram.urlhandlers.genericsurvey;

import X.0cp;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C71172bH;
import X.DbS;
import X.DbT;
import X.Dbb;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class GenericSurveyUrlHandlerActivity extends IgFragmentActivity implements AnonymousClass0iw {
    public AnonymousClass0wW A00;

    public final String getModuleName() {
        return "generic_survey_handler_action";
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.urlhandlers.genericsurvey.GenericSurveyUrlHandlerActivity, java.lang.Object, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = AnonymousClass0fD.A00(-1793311573);
        super.onCreate(bundle);
        AnonymousClass0wW A0S = DbS.A0S(this);
        this.A00 = A0S;
        if (A0S == null) {
            finish();
            i = 640759073;
        } else {
            Intent intent = getIntent();
            Bundle A0A = DbT.A0A(intent);
            if (A0A == null) {
                finish();
                i = 1151253336;
            } else {
                if (this.A00 instanceof UserSession) {
                    String stringExtra = intent.getStringExtra(AnonymousClass000.A00(2994));
                    if (stringExtra == null) {
                        finish();
                        i = -2028361865;
                    } else {
                        String A0m = DbS.A0m(A0A);
                        if (A0m != null) {
                            Uri A03 = 0cp.A03(A0m);
                            if (!TextUtils.isEmpty(A0m)) {
                                JSONObject A11 = DbS.A11();
                                try {
                                    Iterator<String> it = A03.getQueryParameterNames().iterator();
                                    while (it.hasNext()) {
                                        String A18 = AnonymousClass7TE.A18(it);
                                        A11.put(A18, A03.getQueryParameter(A18));
                                    }
                                    str = A11.toString();
                                    GenericSurveyFragment A02 = IgFragmentFactoryImpl.A00().A02(stringExtra, str);
                                    FragmentActivity A003 = C71172bH.A00();
                                    A003.getClass();
                                    Dbb.A12(A02, A003, this.A00);
                                    finish();
                                } catch (JSONException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                        finish();
                        str = null;
                        GenericSurveyFragment A022 = IgFragmentFactoryImpl.A00().A02(stringExtra, str);
                        FragmentActivity A0032 = C71172bH.A00();
                        A0032.getClass();
                        Dbb.A12(A022, A0032, this.A00);
                        finish();
                    }
                } else {
                    FFQ.A00().A00(this, A0A, this.A00);
                }
                i = -1636532472;
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
