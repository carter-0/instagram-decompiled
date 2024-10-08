package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.44a  reason: invalid class name and case insensitive filesystem */
public final class C2600344a implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2600344a(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r5, AnonymousClass653 r6, List list, Map map, 0sL r9, 0sL r10, boolean z) {
        0qQ.A0B(r6, 2);
        if (0qQ.A0K(r6.A00, "replace")) {
            UserSession userSession = this.A00;
            if (2El.A07(userSession)) {
                0c5 r1 = 0c9.A04;
                String str = r6.A02;
                0qQ.A06(str);
                this.A01.A0C.A0T(OQD.parseFromJson(r1.A01(userSession, str)).A00, z);
            }
            return AnonymousClass6BL.A00;
        }
        String A0R = 002.A0R("Unsupported operation: ", r6.A00);
        return new AnonymousClass6BR(new Exception(A0R), "Unsupported operation", A0R);
    }
}
