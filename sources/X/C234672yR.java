package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.2yR  reason: invalid class name and case insensitive filesystem */
public final class C234672yR implements C229222n2 {
    public final /* synthetic */ UserSession A00;

    public final String BK2(AnonymousClass30Y r6) {
        String id;
        0qQ.A0B(r6, 0);
        UserSession userSession = this.A00;
        Object obj = r6.A03;
        0qQ.A06(obj);
        1Xj r1 = (1Xj) obj;
        String A0F = C231122qu.A0F(userSession, r1);
        1Xj A1c = r1.A1c(((AnonymousClass4HA) r6.A04).A00);
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("carousel_");
        if (A1c == null) {
            if (A0F != null) {
                i = A0F.hashCode();
            }
            id = Integer.toHexString(i);
        } else {
            if (A0F != null) {
                i = A0F.hashCode();
            }
            sb.append(Integer.toHexString(i));
            id = A1c.getId();
        }
        sb.append(id);
        return sb.toString();
    }

    public C234672yR(UserSession userSession) {
        this.A00 = userSession;
    }
}
