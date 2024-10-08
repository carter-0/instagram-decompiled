package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Js  reason: invalid class name and case insensitive filesystem */
public final class C329657Js extends C329667Jt {
    public final UserSession A00;
    public final AnonymousClass7IK A01;
    public final C329247Id A02;
    public final C62320sa A03;
    public final boolean A04;

    public static final boolean A00(C329657Js r5, Integer num) {
        UserSession userSession;
        0Tu r2;
        long j;
        List BRZ;
        User user;
        if (num == null) {
            return false;
        }
        2Er r22 = (2Er) r5.A03.invoke();
        int intValue = num.intValue();
        if (intValue == 1012) {
            if (r22 == null || (BRZ = r22.BRZ()) == null || (user = (User) 00k.A0J(BRZ)) == null || !user.A1X()) {
                return false;
            }
            userSession = r5.A00;
            r2 = 0Tu.A05;
            j = 36325742468215985L;
        } else if (intValue != 1014) {
            return false;
        } else {
            userSession = r5.A00;
            r2 = 0Tu.A05;
            j = 36325742468478133L;
        }
        return 182.A06(r2, userSession, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C329657Js(com.instagram.common.session.UserSession r13, X.AnonymousClass7JU r14, X.C329327Il r15, X.C329247Id r16, X.C62320sa r17, boolean r18) {
        /*
            r12 = this;
            r8 = 2131962908(0x7f132c1c, float:1.9562554E38)
            r9 = 2131238638(0x7f081eee, float:1.809356E38)
            X.7JT r4 = X.AnonymousClass7JT.GALLERY
            X.7JU r0 = X.AnonymousClass7JU.RIGHT_INSET
            r3 = r14
            if (r14 != r0) goto L_0x0033
            X.7Jw r5 = new X.7Jw
            r5.<init>(r14, r4, r15)
        L_0x0012:
            X.7Ju r5 = (X.C329677Ju) r5
            r6 = 0
            r11 = 64
            r1 = r12
            r2 = r13
            r7 = r17
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A00 = r13
            r12.A03 = r7
            r0 = r16
            r12.A02 = r0
            r0 = r18
            r12.A04 = r0
            X.7IK r0 = new X.7IK
            r0.<init>(r13)
            r12.A01 = r0
            return
        L_0x0033:
            X.7Jv r5 = new X.7Jv
            r5.<init>()
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329657Js.<init>(com.instagram.common.session.UserSession, X.7JU, X.7Il, X.7Id, X.0sa, boolean):void");
    }
}
