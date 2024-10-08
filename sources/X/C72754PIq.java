package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.PIq  reason: case insensitive filesystem */
public final class C72754PIq implements AnonymousClass5IX {
    public final UserSession A00;
    public final 2cX A01;

    public final boolean E1z(AnonymousClass5IY r6) {
        String A002;
        Integer A0l;
        Boolean A0A;
        Boolean A0A2;
        2cX r2 = this.A01;
        if (r2 == null || (A002 = r2.A00("thread_subtype")) == null || (A0l = 00y.A0l(A002)) == null) {
            return false;
        }
        int intValue = A0l.intValue();
        String A003 = r2.A00("thread_is_open");
        if (A003 == null || (A0A = 00l.A0A(A003)) == null) {
            return false;
        }
        boolean booleanValue = A0A.booleanValue();
        String A004 = r2.A00("thread_is_open_or_dm_is_active");
        if (A004 == null || (A0A2 = 00l.A0A(A004)) == null) {
            return false;
        }
        boolean booleanValue2 = A0A2.booleanValue();
        UserSession userSession = this.A00;
        if (!booleanValue || !(!booleanValue2)) {
            return false;
        }
        if ((intValue == 0 || intValue == 1003 || intValue == 1 || intValue == 47) && AnonymousClass9B8.A03(userSession) && AnonymousClass9B8.A07(userSession) && !C331227Qb.A02(userSession)) {
            return true;
        }
        return false;
    }

    public C72754PIq(UserSession userSession, 2cX r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
