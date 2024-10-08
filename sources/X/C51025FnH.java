package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FnH  reason: case insensitive filesystem */
public final class C51025FnH implements C330317Mh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C51025FnH(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = str;
    }

    public final void onFail(C268654dm r3) {
        C307896Rx r1;
        Object obj;
        if (this.A00 != 0) {
            r1 = (C307896Rx) this.A01;
            obj = this.A02;
        } else {
            r1 = (C307896Rx) this.A02;
            obj = this.A03;
        }
        DbZ.A1V(r1, obj);
    }

    public final void onSuccess(User user) {
        User user2 = user;
        if (this.A00 != 0) {
            C307896Rx r1 = (C307896Rx) this.A01;
            FragmentActivity A042 = C308206Td.A04(r1);
            C48088EVg eVg = C48088EVg.COMMENT_REPORTING;
            C49960FGs.A05(A042, r1, (C277014uI) this.A03, (C277014uI) this.A02, (UserSession) this.A04, FH9.A07(r1), user2, eVg, this.A05);
            return;
        }
        0qQ.A0B(user, 0);
        C307896Rx r0 = (C307896Rx) this.A02;
        FragmentActivity A043 = C308206Td.A04(r0);
        String str = this.A05;
        C49960FGs.A06(A043, (UserSession) this.A04, FH9.A07(r0), user2, (C51036FnS) this.A01, str);
    }
}
