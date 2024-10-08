package com.instagram.urlhandlers.resolveadaccount;

import X.08y;
import X.09i;
import X.0bY;
import X.0cp;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C18079Vl8;
import X.C322576w3;
import X.C55068Hbd;
import X.C55347HgF;
import X.DbS;
import X.DbW;
import X.DbX;
import X.Dba;
import X.HWE;
import X.VF9;
import android.net.Uri;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class ResolveAdAccountNotificationUrlHandlerActivity extends BaseFragmentActivity {
    public final 0bY A00 = DbW.A0G();

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, com.instagram.urlhandlers.resolveadaccount.ResolveAdAccountNotificationUrlHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A002 = AnonymousClass0fD.A00(786940199);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = -1801966060;
        } else {
            String A0m = DbS.A0m(A0A);
            if (A0m == null) {
                finish();
                i = -1150885713;
            } else {
                Uri A01 = 0cp.A01(this.A00, A0m);
                if (A01 == null) {
                    finish();
                    i = -1672312694;
                } else {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A01.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE));
                    A0A.putAll(A0a);
                    08y r5 = 09i.A0A;
                    if (r5.A05(this) instanceof UserSession) {
                        UserSession A06 = r5.A06(A0A);
                        String string = A0A.getString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        Integer num = AnonymousClass05K.A15;
                        if (string != null) {
                            Set set = C55347HgF.A00;
                            num = C55068Hbd.A00(string);
                        }
                        if (num == AnonymousClass05K.A01) {
                            str = "instagram_push_notification_for_business";
                        } else if (num == AnonymousClass05K.A0u) {
                            str = "instagram_push_notification_for_ad_account";
                        } else {
                            C18079Vl8 A012 = C322576w3.A00().A01();
                            ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(VF9.A00(num));
                            if (errorIdentifier == null) {
                                errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
                            }
                            Dba.A12(A012.A08(errorIdentifier, A06), DbS.A0M(this, r5.A05(this)));
                            i = -1097208829;
                        }
                        HWE.A00(this, A06, str);
                    }
                    finish();
                    i = -1097208829;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0S(this);
    }
}
