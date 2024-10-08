package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7KJ  reason: invalid class name */
public final class AnonymousClass7KJ extends C329667Jt {
    public final UserSession A00;
    public final AnonymousClass7IK A01;
    public final C62320sa A02;

    public static final boolean A00(AnonymousClass7KJ r5, Integer num) {
        UserSession userSession;
        0Tu r2;
        long j;
        List BRZ;
        User user;
        if (num == null) {
            return false;
        }
        2Er r22 = (2Er) r5.A02.invoke();
        int intValue = num.intValue();
        if (intValue == 1012) {
            if (r22 == null || (BRZ = r22.BRZ()) == null || (user = (User) 00k.A0J(BRZ)) == null || !user.A1X()) {
                return false;
            }
            userSession = r5.A00;
            r2 = 0Tu.A05;
            j = 36325742468281522L;
        } else if (intValue != 1014) {
            return false;
        } else {
            userSession = r5.A00;
            r2 = 0Tu.A05;
            j = 36325742468412596L;
        }
        return 182.A06(r2, userSession, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass7KJ(com.instagram.common.session.UserSession r13, X.C329327Il r14, X.C329317Ik r15, X.C62320sa r16) {
        /*
            r12 = this;
            X.7J1 r0 = X.AnonymousClass7J1.A00
            r2 = r13
            boolean r0 = r0.A01(r13)
            if (r0 == 0) goto L_0x0034
            X.7JU r3 = X.AnonymousClass7JU.RIGHT_INSET
        L_0x000b:
            X.7JT r4 = X.AnonymousClass7JT.CAMERA
            X.7JU r0 = X.AnonymousClass7JU.RIGHT_INSET
            if (r3 != r0) goto L_0x002e
            X.7Jw r5 = new X.7Jw
            r5.<init>(r3, r4, r14)
        L_0x0016:
            r8 = -1
            r6 = 0
            r11 = 64
            r1 = r12
            r7 = r16
            r9 = r8
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r12.A02 = r7
            X.7IK r0 = new X.7IK
            r0.<init>(r13)
            r12.A01 = r0
            return
        L_0x002e:
            X.7KK r5 = new X.7KK
            r5.<init>(r15)
            goto L_0x0016
        L_0x0034:
            X.7JU r3 = X.AnonymousClass7JU.LEFT_INSET
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KJ.<init>(com.instagram.common.session.UserSession, X.7Il, X.7Ik, X.0sa):void");
    }
}
