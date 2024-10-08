package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.VaJ  reason: case insensitive filesystem */
public final class C17565VaJ {
    public WQT A00;
    public User A01;
    public String A02;
    public final C307786Rm A03;
    public final C276544tV A04;
    public final UserSession A05;

    public C17565VaJ(C307786Rm r4, C276544tV r5) {
        User A022;
        this.A03 = r4;
        this.A04 = r5;
        UserSession A0A = C308206Td.A0A(r4);
        DbS.A1Z(A0A);
        UserSession userSession = A0A;
        this.A05 = userSession;
        EtL etL = (EtL) C276544tV.A00(r5, 38);
        this.A02 = r5.A0I();
        if (etL != null) {
            A022 = etL.A00;
        } else {
            A022 = 17h.A00(userSession).A02(this.A02);
        }
        this.A01 = A022;
        if (A022 != null) {
            this.A02 = A022.getId();
        }
    }
}
