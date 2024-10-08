package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.5js  reason: invalid class name and case insensitive filesystem */
public final class C293005js {
    public AnonymousClass0iw A00;
    public UserSession A01;
    public String A02;
    public String A03;
    public boolean A04;
    public User A05;
    public final 0wc A06;

    public C293005js(AnonymousClass0iw r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A06 = AnonymousClass0kN.A01(r2, userSession);
        this.A00 = r2;
        this.A01 = userSession;
    }

    public final void A00(long j, String str, int i, String str2, String str3) {
        String str4 = this.A02;
        if (str4 != null) {
            String str5 = this.A03;
            if (str5 != null) {
                String str6 = str2;
                String str7 = str3;
                A04(str, str4, str5, str6, str7, i, j);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A01(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        0qQ.A0B(str, 0);
        0qQ.A0B(str4, 4);
        0wc r2 = this.A06;
        0Aj A002 = r2.A00(r2.A00, "similar_user_dismiss_tapped");
        A002.AAJ("target_id", str);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("chaining_profile_id", str2);
        A002.AAJ("view_module", str3);
        A002.AAJ("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1L();
        } else {
            z = false;
        }
        A002.A7p("is_auto_expand", Boolean.valueOf(z));
        A002.A9F("text_app_aysf_vertical_type", (Long) null);
        if (str4.length() != 0) {
            A002.AAJ("algorithm", str4);
        }
        if (user != null && C308436Ug.A01(this.A01, user)) {
            A002.AAJ("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A002.AAJ("social_context", str5);
        }
        A002.Cgf();
    }

    public final void A02(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        0qQ.A0B(str, 0);
        0qQ.A0B(str4, 4);
        0wc r2 = this.A06;
        0Aj A002 = r2.A00(r2.A00, "similar_user_follow_button_tapped");
        A002.AAJ("target_id", str);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("chaining_profile_id", str2);
        A002.AAJ("view_module", str3);
        A002.AAJ("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1L();
        } else {
            z = false;
        }
        A002.A7p("is_auto_expand", Boolean.valueOf(z));
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.A9F("text_app_aysf_vertical_type", (Long) null);
        if (str4.length() != 0) {
            A002.AAJ("algorithm", str4);
        }
        if (user != null && C308436Ug.A01(this.A01, user)) {
            A002.AAJ("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A002.AAJ("social_context", str5);
        }
        A002.Cgf();
    }

    public final void A03(String str, String str2, String str3, String str4, String str5, int i) {
        boolean z;
        0qQ.A0B(str, 0);
        0qQ.A0B(str4, 4);
        0wc r2 = this.A06;
        0Aj A002 = r2.A00(r2.A00, "similar_username_tapped");
        A002.AAJ("target_id", str);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("chaining_profile_id", str2);
        A002.AAJ("view_module", str3);
        A002.AAJ("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1L();
        } else {
            z = false;
        }
        A002.A7p("is_auto_expand", Boolean.valueOf(z));
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.A9F("text_app_aysf_vertical_type", (Long) null);
        if (str4.length() != 0) {
            A002.AAJ("algorithm", str4);
        }
        if (user != null && C308436Ug.A01(this.A01, user)) {
            A002.AAJ("badge_type", "trending_professional");
        }
        if (str5 != null) {
            A002.AAJ("social_context", str5);
        }
        A002.Cgf();
    }

    public final void A04(String str, String str2, String str3, String str4, String str5, int i, long j) {
        boolean z;
        0qQ.A0B(str, 0);
        0qQ.A0B(str4, 4);
        0wc r2 = this.A06;
        0Aj A002 = r2.A00(r2.A00, "similar_user_impression");
        A002.AAJ("target_id", str);
        A002.A8k("position", Integer.valueOf(i));
        A002.AAJ("chaining_profile_id", str2);
        A002.AAJ("view_module", str3);
        A002.AAJ("containermodule", this.A00.getModuleName());
        User user = this.A05;
        if (user != null) {
            z = user.A1L();
        } else {
            z = false;
        }
        A002.A7p("is_auto_expand", Boolean.valueOf(z));
        A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
        A002.A9F("text_app_aysf_vertical_type", (Long) null);
        if (str4.length() != 0) {
            A002.AAJ("algorithm", str4);
        }
        if (user != null && C308436Ug.A01(this.A01, user)) {
            A002.AAJ("badge_type", "trending_professional");
        }
        if (j <= 0) {
            int i2 = (int) j;
            if (j == ((long) i2)) {
                A002.A8k("impression_length", Integer.valueOf(i2));
            } else {
                throw new ArithmeticException();
            }
        }
        if (str5 != null) {
            A002.AAJ("social_context", str5);
        }
        A002.Cgf();
    }

    public C293005js(AnonymousClass0iw r2, UserSession userSession, User user, String str, String str2) {
        this.A06 = AnonymousClass0kN.A01(r2, userSession);
        this.A00 = r2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = 2R8.A05(userSession, str);
        this.A05 = user;
        this.A01 = userSession;
    }
}
