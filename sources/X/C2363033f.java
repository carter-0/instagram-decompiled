package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.33f  reason: invalid class name and case insensitive filesystem */
public final class C2363033f {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C231332rR A03;
    public final 1Ux A04;
    public final AnonymousClass4DU A05;
    public final String A06;

    public final void A00(1Xj r11, JOG jog) {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            User A2A = r11.A2A(userSession);
            if (A2A != null) {
                AnonymousClass4DU r3 = this.A05;
                Integer num = AnonymousClass05K.A00;
                String A30 = r11.A30();
                if (A30 != null) {
                    C49176Eqh.A00(r3, userSession, A2A, num, A30, "feed");
                    Integer num2 = AnonymousClass05K.A01;
                    String A302 = r11.A30();
                    if (A302 != null) {
                        C49811F7y.A00(activity, r3, userSession, A2A, new C57442Iam(activity, this, jog), num2, A302, "feed");
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A01(1Xj r13, JOG jog, AnonymousClass3W1 r15) {
        long j;
        Long l;
        Long A0n;
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A01;
        IUS ius = new IUS(this, r13, jog, r15);
        C54115Gzk gzk = new C54115Gzk();
        gzk.A00 = ius;
        C331127Pr r5 = new C331127Pr(userSession);
        r5.A0d = requireActivity.getResources().getString(2131963353);
        r5.A1C = false;
        C331137Ps r6 = new C331137Ps((View.OnClickListener) null, (CharSequence) null, "", 0, 0);
        r6.A02 = R.drawable.instagram_arrow_back_24;
        r6.A05 = new IAO(gzk);
        String string = requireActivity.getResources().getString(2131953555);
        0qQ.A07(string);
        r6.A07 = string;
        r5.A06(r6.A00());
        r5.A00().A02(requireActivity, gzk);
        AnonymousClass4DU r3 = this.A05;
        0wc A012 = AnonymousClass0kN.A01(r3, userSession);
        0Aj A002 = A012.A00(A012.A00, "hide_specific_words");
        if (A002.isSampled()) {
            String A30 = r13.A30();
            if (A30 == null || (A0n = 00y.A0n(10, A30)) == null) {
                j = 0;
            } else {
                j = A0n.longValue();
            }
            A002.A9F("ig_media_id", Long.valueOf(j));
            A002.AAJ("media_type", r13.BR7().toString());
            User A2A = r13.A2A(userSession);
            if (A2A != null) {
                l = 00y.A0n(10, A2A.getId());
            } else {
                l = null;
            }
            A002.A9F("author_id_int", l);
            A002.AAJ("inventory_source", r13.A0C.BIl());
            A002.AAJ("ranking_info_token", r13.A0C.getLoggingInfoToken());
            A002.AAJ("module", r3.getModuleName());
            A002.Cgf();
        }
    }

    public final void A02(1Xj r8, C16677UzD uzD, C74489Pvj pvj, String str, String str2) {
        UserSession userSession = this.A01;
        C71093OcF A012 = ORV.A01(this.A00.requireActivity(), this.A05, userSession, C14068TpH.FEED, uzD, str);
        A012.A01 = r8.A2A(userSession);
        A012.A07(pvj);
        A012.A08("shopping_session_id", this.A06);
        A012.A08("inventory_source", r8.A0C.BIl());
        if (str2 == null) {
            str2 = "";
        }
        A012.A08("nua_action", str2);
        A012.A06();
    }

    public C2363033f(Fragment fragment, UserSession userSession, AnonymousClass311 r3, AnonymousClass4DU r4, C231332rR r5, 1Ux r6, String str) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A04 = r6;
        this.A03 = r5;
        this.A05 = r4;
        this.A06 = str;
    }
}
