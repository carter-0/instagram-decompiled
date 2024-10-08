package X;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import java.util.HashMap;

/* renamed from: X.En9  reason: case insensitive filesystem */
public abstract class C48971En9 {
    public static final void A00(Context context, Fragment fragment, FragmentActivity fragmentActivity, C229382nI r19, AnonymousClass0aP r20, DwI dwI, boolean z) {
        C358248ab A0g;
        int i;
        int i2;
        0gy A00;
        C360678ey A02;
        int i3;
        Handler A0D;
        Runnable fvK;
        DwI dwI2 = dwI;
        0qQ.A0B(dwI2, 0);
        Fragment fragment2 = fragment;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        AnonymousClass0aP r3 = r20;
        AnonymousClass7TG.A0w(2, fragmentActivity2, fragment2, r3);
        C229382nI r7 = r19;
        0qQ.A0B(r7, 5);
        String str = dwI2.A00;
        boolean z2 = z;
        if ("show_login_support_form".equals(str)) {
            A0D = AnonymousClass7TF.A0D();
            fvK = new C51511FvJ(fragmentActivity2, r3, dwI2, z2);
        } else {
            Context context2 = context;
            if ("show_help_center_link".equals(str)) {
                String A01 = SQU.A01(context2, dwI2.A08);
                0qQ.A07(A01);
                SimpleWebViewActivity.A02.A02(context2, r3, new SimpleWebViewConfig((String) null, (String) null, false, false, false, false, false, true, false, z2, true, false, false, false, context2.getString(2131963313), A01));
                C49938FFr.A01(r3, "account_assistance_impression");
                return;
            }
            if ("show_recovery_challenge".equals(str)) {
                HashMap A0f = Dba.A0f("get_challenge", "true");
                A0f.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dwI2.A07);
                A0f.put("nonce_code", dwI2.A06);
                A0f.put("cni", dwI2.A03);
                String str2 = dwI2.A02;
                if (str2 != null) {
                    A0f.put("challenge_context", str2);
                }
                A00 = AnonymousClass07i.A00(fragment2);
                String str3 = dwI2.A01;
                0qQ.A07(str3);
                A02 = C359988do.A05(r3, str3, A0f);
                i3 = 7;
            } else if ("show_recovery_accounts_list".equals(str)) {
                A0D = AnonymousClass7TF.A0D();
                fvK = new C51512FvK(fragmentActivity2, r3, dwI2, z2);
            } else {
                if ("show_vettedness_dialog".equals(str)) {
                    String str4 = dwI2.A05;
                    String str5 = dwI2.A04;
                    if (str4 != null && str5 != null) {
                        A0g = DbX.A0g(context2, str5, str4);
                        A0g.A06();
                        i = 2131963110;
                        i2 = 25;
                    } else {
                        return;
                    }
                } else if ("show_two_factor_support_challenge".equals(str)) {
                    HashMap A0f2 = Dba.A0f("get_challenge", "true");
                    A0f2.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, dwI2.A07);
                    A0f2.put("nonce_code", dwI2.A06);
                    A0f2.put("cni", dwI2.A03);
                    String str6 = dwI2.A02;
                    if (str6 != null) {
                        A0f2.put("challenge_context", str6);
                    }
                    A00 = AnonymousClass07i.A00(fragment2);
                    String str7 = dwI2.A01;
                    0qQ.A07(str7);
                    A02 = C359988do.A02((AnonymousClass1O9) null, r3, str7, A0f2);
                    i3 = 8;
                } else if ("show_error_dialog".equals(str)) {
                    String str8 = dwI2.A05;
                    String str9 = dwI2.A04;
                    String str10 = dwI2.A08;
                    0qQ.A07(str10);
                    if (str8 != null && str9 != null) {
                        A0g = DbX.A0g(context2, str9, str8);
                        A0g.A06();
                        if (str10.length() > 0) {
                            i = 2131963110;
                            i2 = 26;
                        }
                        DbT.A1V(A0g);
                        return;
                    }
                    return;
                } else {
                    C49952FGh.A01(context2);
                    return;
                }
                A0g.A0G(new C50026FJl(i2, (Object) context2, (Object) dwI2, (Object) r3), i);
                DbT.A1V(A0g);
                return;
            }
            E85.A00(A02, context2, r7, r3, i3);
            1ES.A00(context2, A00, A02);
            return;
        }
        A0D.post(fvK);
    }
}
