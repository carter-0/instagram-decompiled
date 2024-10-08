package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yM  reason: invalid class name and case insensitive filesystem */
public final class C234632yM implements C229222n2 {
    public final /* synthetic */ UserSession A00;

    public C234632yM(UserSession userSession) {
        this.A00 = userSession;
    }

    public final String BK2(AnonymousClass30Y r4) {
        int i;
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A00;
        Object obj = r4.A03;
        0qQ.A06(obj);
        1Xj r2 = (1Xj) obj;
        String A0F = C231122qu.A0F(userSession, r2);
        if (A0F != null) {
            i = A0F.hashCode();
        } else {
            i = 0;
        }
        return 002.A0R(Integer.toHexString(i), r2.getId());
    }
}
