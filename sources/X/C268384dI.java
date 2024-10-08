package X;

import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgTextLayoutView;
import java.util.Arrays;

/* renamed from: X.4dI  reason: invalid class name and case insensitive filesystem */
public abstract class C268384dI {
    public static final int A00(C245833dY r3) {
        Object valueOf;
        0qQ.A0B(r3, 0);
        Object obj = r3.A03.A3b.A00;
        C247733gp r1 = r3.A01;
        if (r1.A03()) {
            valueOf = Integer.valueOf(r3.A00);
        } else {
            valueOf = Boolean.valueOf(r1.A0O);
        }
        return Arrays.hashCode(new Object[]{valueOf, obj});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        if (X.AnonymousClass3VO.A06(r4, r5, r7.A03.A0o, r6.getModuleName()) == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C376639It A01(com.instagram.common.session.UserSession r4, X.1Xj r5, X.AnonymousClass4DU r6, X.C245833dY r7) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 2
            X.0qQ.A0B(r4, r3)
            r0 = 3
            X.0qQ.A0B(r6, r0)
            X.3gp r0 = r7.A01
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x0023
            java.lang.String r1 = r6.getModuleName()
            X.3W1 r0 = r7.A03
            X.1sy r0 = r0.A0o
            boolean r0 = X.AnonymousClass3VO.A06(r4, r5, r0, r1)
            r2 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            java.lang.String r1 = r5.getId()
            if (r1 == 0) goto L_0x0030
            X.9It r0 = new X.9It
            r0.<init>((java.lang.String) r1, (boolean) r2, (int) r3)
            return r0
        L_0x0030:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268384dI.A01(com.instagram.common.session.UserSession, X.1Xj, X.4DU, X.3dY):X.9It");
    }

    public static final void A02(AnonymousClass419 r8) {
        1Xj A01;
        UserSession userSession = r8.A01;
        if (userSession != null) {
            AnonymousClass3W1 r3 = r8.A04;
            C238863Ds r2 = C238863Ds.USER_MESSAGE;
            Integer num = null;
            if (r3 != null && r3.A3e) {
                num = Integer.valueOf(r3.A02);
            }
            C238833Dp A00 = C238833Dp.A00(userSession);
            0qQ.A07(A00);
            IgTextLayoutView igTextLayoutView = r8.A0C;
            A00.A08(igTextLayoutView, new C238873Dt(num, r2, (String) null, (String) null));
            String str = r8.A08;
            AnonymousClass4DU r22 = r8.A03;
            if (str != null && r22 != null && (A01 = 1E8.A03.A01(userSession, "FeedCommentRowViewBinder", str)) != null) {
                A00.A0A(igTextLayoutView, new C246153e7((AnonymousClass4HI) null, userSession, A01, r22));
            }
        }
    }
}
