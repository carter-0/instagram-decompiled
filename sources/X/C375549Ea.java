package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Ea  reason: invalid class name and case insensitive filesystem */
public final class C375549Ea implements 08F {
    public final /* synthetic */ 2Lk A00;

    public C375549Ea(2Lk r1) {
        this.A00 = r1;
    }

    public final void DfY(int i, Object obj) {
        String str;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 0);
        0wc A02 = AnonymousClass0kN.A02(userSession);
        0Aj A002 = A02.A00(A02.A00, AnonymousClass000.A00(3281));
        try {
            str = String.valueOf(obj);
        } catch (Exception unused) {
            str = null;
        }
        A002.AAJ("step", "profile_write_result");
        A002.A9F("result_code", Long.valueOf((long) i));
        A002.AAJ("extra_result_data", str);
        A002.Cgf();
    }
}
