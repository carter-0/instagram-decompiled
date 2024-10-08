package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7FZ  reason: invalid class name */
public abstract class AnonymousClass7FZ {
    public static final C328507Fb A00(UserSession userSession, AnonymousClass7LQ r30) {
        String str;
        C282485Dg r2;
        Integer num;
        C272074k3 r14;
        C328497Fa r11;
        AnonymousClass7LQ r1 = r30;
        C254703su r0 = r1.A0e;
        DirectMessageIdentifier A0V = r0.A0V();
        2FW r15 = r0.A10;
        0qQ.A07(r15);
        boolean A1j = r0.A1j(AnonymousClass0t1.A01.A01(userSession));
        C327627Bo A03 = r1.A03();
        0qQ.A07(A03);
        boolean A05 = r1.A05();
        boolean z = r1.A0P;
        boolean z2 = r1.A0R;
        Integer num2 = r1.A0N;
        0qQ.A07(num2);
        boolean z3 = r0.A2O;
        AnonymousClass4UC r4 = r1.A0J;
        boolean z4 = r1.A0U;
        C300625xW r22 = r0.A0W;
        if (r22 != null) {
            str = r22.A00();
        } else {
            str = "UNKNOWN";
        }
        C271374ik r23 = r0.A0e;
        if (r23 != null) {
            r2 = r23.A03;
        } else {
            r2 = null;
        }
        1sw r17 = null;
        if (r2 != null) {
            num = Integer.valueOf(r2.A00);
            r14 = r2.A02;
        } else {
            num = null;
            r14 = null;
        }
        switch (r0.A1F.intValue()) {
            case 0:
            case 1:
            case 2:
                r11 = C328497Fa.SENDING;
                break;
            case 3:
                r11 = C328497Fa.FAILED;
                break;
            case 4:
                r11 = C328497Fa.PERMANENTLY_FAILED;
                break;
            default:
                r11 = C328497Fa.SENT;
                break;
        }
        boolean z5 = r1.A0a;
        1Xj A0S = r0.A0S();
        if (A0S != null) {
            r17 = A0S.A1u();
        }
        return new C328507Fb(r11, A03, r1.A0G, r14, r15, A0V, r17, r4, num2, num, str, r0.A29, A1j, A05, z, z2, z3, z4, z5, r1.A0b);
    }
}
