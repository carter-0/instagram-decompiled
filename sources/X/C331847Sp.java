package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Sp  reason: invalid class name and case insensitive filesystem */
public final class C331847Sp {
    public final 0xa A00;

    public final void A00(String str, String str2) {
        0qQ.A0B(str, 0);
        0xa r3 = this.A00;
        if (!0qQ.A0K(r3.getString(002.A0R("thread_id_", str), (String) null), str2)) {
            String A0R = 002.A0R("thread_id_", str);
            0xY AR4 = r3.AR4();
            AR4.E5g(A0R, str2);
            AR4.apply();
        }
    }

    public final void A01(String str, String str2) {
        0qQ.A0B(str, 0);
        String A0R = 002.A0R("thread_id_feedback_", str);
        0xY AR4 = this.A00.AR4();
        AR4.E5g(A0R, str2);
        AR4.apply();
    }

    public final boolean A02(String str, String str2) {
        0qQ.A0B(str, 0);
        return 0qQ.A0K(this.A00.getString(002.A0R("thread_id_imagine_", str), (String) null), str2);
    }

    public C331847Sp(UserSession userSession) {
        this.A00 = 1Al.A01(userSession).A04(1An.A09, getClass());
    }
}
