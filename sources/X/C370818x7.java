package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.8x7  reason: invalid class name and case insensitive filesystem */
public final class C370818x7 {
    public static C62320sa A03;
    public final UserSession A00;
    public final 1Av A01;
    public final 1Ng A02;

    public C370818x7(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = 1Au.A00(userSession);
        this.A02 = AnonymousClass1Nd.A00(userSession);
    }

    public final void A02(Context context, String str, boolean z) {
        0qQ.A0B(context, 1);
        String A012 = A01(str);
        if (A012.length() != 0) {
            String A002 = A00(str);
            C310336ap r1 = new C310336ap();
            r1.A0D = context.getString(2131952508);
            r1.A0I = A002;
            r1.A0L = true;
            String string = context.getString(2131952507);
            0qQ.A07(string);
            r1.A0G = string;
            r1.A0A = new C40554Ae1(this, z);
            1xC.A01.A00(new AnonymousClass3GP(r1.A00()));
            UserSession userSession = this.A00;
            C69864NtS.A00(userSession).A01(userSession.A06, A012);
            A03(str);
        }
    }

    public final void A04(String str, String str2, String str3, String str4) {
        0qQ.A0B(str2, 1);
        0qQ.A0B(str4, 3);
        if (A01(str4).length() > 0) {
            A03(str4);
        }
        1Av r1 = this.A01;
        r1.A12(002.A0R("ads_event_sharing_notice_type", str4), str);
        r1.A12(002.A0R("ads_event_sharing_notice_content", str4), str2);
        r1.A12(002.A0R("ads_event_sharing_notice_ui_type", str4), str3);
        this.A02.A00(new AY5(str4));
    }

    public final String A00(String str) {
        1Av r3 = this.A01;
        String string = r3.A01.getString(002.A0R("ads_event_sharing_notice_content", str), "");
        if (string != null) {
            return string;
        }
        return "";
    }

    public final String A01(String str) {
        1Av r3 = this.A01;
        String string = r3.A01.getString(002.A0R("ads_event_sharing_notice_type", str), "");
        if (string != null) {
            return string;
        }
        return "";
    }

    public final void A03(String str) {
        1Av r1 = this.A01;
        r1.A0q(002.A0R("ads_event_sharing_notice_type", str));
        r1.A0q(002.A0R("ads_event_sharing_notice_content", str));
        r1.A0q(002.A0R("ads_event_sharing_notice_ui_type", str));
        C62320sa r0 = A03;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final boolean A05(String str) {
        1Av r3 = this.A01;
        String str2 = "";
        String string = r3.A01.getString(002.A0R("ads_event_sharing_notice_ui_type", str), str2);
        if (string != null) {
            str2 = string;
        }
        return str2.equals("TOAST");
    }
}
