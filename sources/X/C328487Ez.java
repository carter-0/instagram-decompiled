package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ez  reason: invalid class name and case insensitive filesystem */
public abstract class C328487Ez {
    public static final int A00(MessagingUser messagingUser, C254713sv r6, C254713sv r7, C327687Bu r8, boolean z, boolean z2) {
        0qQ.A0B(r8, 4);
        if (!z2) {
            return 8;
        }
        if (!r8.CPF() || messagingUser.A03(r6.BsI())) {
            return 4;
        }
        if (r8.ABE() || r7 == null) {
            return 0;
        }
        if ((!r8.CdO() || AnonymousClass7F2.A00(r7.C7c(), r6.C7c())) && r7.CAa() != 2FW.A0G && AnonymousClass7F3.A00(r6, r7) && !z) {
            return 4;
        }
        return 0;
    }

    public static final int A01(MessagingUser messagingUser, C254713sv r5, C327687Bu r6, String str, boolean z, boolean z2) {
        0qQ.A0B(r6, 3);
        if (!z2) {
            return 8;
        }
        boolean z3 = !AnonymousClass7F2.A00(r5.C7c(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        if (!r6.CPF() || messagingUser.A03(r5.BsI())) {
            return 4;
        }
        if (r6.ABE() || z || z3 || !str.equals(r5.BsI())) {
            return 0;
        }
        return 4;
    }
}
