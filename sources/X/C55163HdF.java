package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.HdF  reason: case insensitive filesystem */
public abstract class C55163HdF {
    public static final void A00(Activity activity, UserSession userSession, C270594gz r7, 1Xj r8, AnonymousClass4DU r9, String str, String str2, String str3, String str4) {
        boolean z;
        String str5;
        int i;
        0qQ.A0B(str4, 6);
        if (str2 != null) {
            z = true;
        } else if (str3 == null) {
            C60510iO.A00(userSession);
            C254523sc A01 = C233822wX.A01(r7, r8, r9, 002.A0R("instagram_ad_", "disclaimer_ad_unit_action"));
            A01.A56 = str;
            A01.A55 = null;
            A01.A57 = null;
            A01.A53 = "disclaimer_click_failure";
            C233822wX.A0H(userSession, A01, r9);
            return;
        } else {
            z = false;
        }
        String A00 = C270804hK.A00(activity, str, false);
        if (z) {
            str5 = "open_iab_url";
        } else {
            str5 = "open_disclaimer_fragment";
        }
        C60510iO.A00(userSession);
        C254523sc A012 = C233822wX.A01(r7, r8, r9, 002.A0R("instagram_ad_", "disclaimer_ad_unit_action"));
        A012.A56 = A00;
        A012.A55 = str3;
        A012.A57 = str2;
        A012.A53 = str5;
        C233822wX.A0H(userSession, A012, r9);
        AnonymousClass1Z7 r0 = AnonymousClass1Z7.A01;
        if (r0 != null) {
            r0.A00.getValue();
            if (str2 != null) {
                str3 = str2;
            } else if (str3 == null) {
                str3 = "";
            }
            Bundle A0B = DbV.A0B(A00, 2);
            A0B.putString(AnonymousClass000.A00(2241), A00);
            if (z) {
                i = 2242;
            } else {
                i = 2240;
            }
            A0B.putString(AnonymousClass000.A00(i), str3);
            A0B.putString("DisclaimerPageFragment.USERNAME", str4);
            AnonymousClass0Dg.A00(A0B, userSession);
            DbY.A0u(activity, A0B, userSession, C273654mx.A00(674));
            return;
        }
        0qQ.A0F("instance");
        throw AnonymousClass00P.createAndThrow();
    }
}
