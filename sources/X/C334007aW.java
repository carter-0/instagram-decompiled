package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.7aW  reason: invalid class name and case insensitive filesystem */
public final class C334007aW extends C247303g7 {
    public final C333977aT A00;
    public final UserSession A01;
    public final C333997aV A02;

    public C334007aW(UserSession userSession, C333977aT r3, C333997aV r4) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r2 == com.instagram.user.model.FollowStatus.A07) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(com.instagram.user.model.User r22, X.C62320sa r23) {
        /*
            r21 = this;
            r8 = r22
            com.instagram.user.model.FollowStatus r2 = r8.B6o()
            com.instagram.user.model.FollowStatus r1 = com.instagram.user.model.FollowStatus.A06
            if (r2 != r1) goto L_0x0075
            java.lang.Integer r1 = r8.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0069
            com.instagram.user.model.FollowStatus r18 = com.instagram.user.model.FollowStatus.A07
        L_0x0014:
            com.instagram.user.model.FollowStatus r0 = r8.B6o()
            int r1 = r0.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x0066
            r0 = 3
            if (r1 == r0) goto L_0x0063
            r0 = 5
            if (r1 == r0) goto L_0x0060
            r7 = 0
        L_0x0026:
            if (r18 == 0) goto L_0x005f
            if (r7 == 0) goto L_0x005f
            r0 = r21
            com.instagram.common.session.UserSession r2 = r0.A01
            java.lang.Integer r10 = X.GTO.A00(r18)
            r1 = 0
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r9 = r1
            r11 = r1
            r12 = r1
            r13 = r1
            r14 = r1
            r15 = r1
            r16 = r1
            r17 = r1
            X.C294695ms.A01(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.4Cq r2 = r0.A03()
            r20 = 13
            X.9KP r13 = new X.9KP
            r14 = r23
            r15 = r7
            r17 = r8
            r19 = r1
            r16 = r0
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18, (X.AnonymousClass4D7) r19, (int) r20)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r13, r2)
        L_0x005f:
            return
        L_0x0060:
            X.EWA r7 = X.EWA.UserActionCancelRequest
            goto L_0x0026
        L_0x0063:
            X.EWA r7 = X.EWA.UserActionFollow
            goto L_0x0026
        L_0x0066:
            X.EWA r7 = X.EWA.UserActionUnfollow
            goto L_0x0026
        L_0x0069:
            boolean r0 = r8.A28()
            if (r0 == 0) goto L_0x0072
            com.instagram.user.model.FollowStatus r18 = com.instagram.user.model.FollowStatus.A04
            goto L_0x0014
        L_0x0072:
            com.instagram.user.model.FollowStatus r18 = com.instagram.user.model.FollowStatus.A05
            goto L_0x0014
        L_0x0075:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r2 == r0) goto L_0x007f
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            r18 = 0
            if (r2 != r0) goto L_0x0014
        L_0x007f:
            r18 = r1
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C334007aW.A05(com.instagram.user.model.User, X.0sa):void");
    }

    public final void A06(User user, C62320sa r4, 0sP r5, boolean z, boolean z2) {
        Integer B6m;
        int i;
        if (user.CPV()) {
            i = 5;
        } else if (user.B6o() == FollowStatus.A05 && user.A0N() != AnonymousClass05K.A01 && !z) {
            i = 1;
        } else if (user.B6o() != FollowStatus.A06 || (B6m = user.A03.B6m()) == null || B6m.intValue() <= 0 || z2) {
            A05(user, r4);
            return;
        } else {
            i = 2;
        }
        r5.invoke(new C61260Jzs(user, i));
    }
}
