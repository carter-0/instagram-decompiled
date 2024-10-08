package com.instagram.user.follow.mvvm.data;

import X.0qQ;
import X.0u9;
import X.1HR;
import X.1Ng;
import X.AnonymousClass0r6;
import X.AnonymousClass1Nd;
import X.AnonymousClass2f1;
import X.C249513ju;
import X.C294695ms;
import X.C294705mt;
import X.C333967aR;
import X.C333977aT;
import X.C61960qR;
import com.instagram.common.session.UserSession;

public final class FollowUserDataSourceImpl implements C333977aT {
    public final 1Ng A00;
    public final UserSession A01;
    public final C61960qR A02;
    public final AnonymousClass2f1 A03;
    public final C294705mt A04;
    public final C333967aR A05;
    public final C249513ju A06;
    public final AnonymousClass0r6 A07;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.JZl, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object ClV(com.instagram.user.model.FollowStatus r10, X.EWA r11, com.instagram.user.model.User r12, X.AnonymousClass4D7 r13, X.C62320sa r14) {
        /*
            r9 = this;
            r3 = 6
            boolean r0 = X.C59814JZl.A01(r3, r13)
            if (r0 == 0) goto L_0x00f2
            r5 = r13
            X.JZl r5 = (X.C59814JZl) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f2
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r5.A07
            X.1Hj r4 = X.1Hj.A02
            r8 = r4
            int r0 = r5.A00
            r6 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x0081
            if (r0 != r6) goto L_0x00f9
            java.lang.Object r10 = r5.A03
            com.instagram.user.model.FollowStatus r10 = (com.instagram.user.model.FollowStatus) r10
            java.lang.Object r12 = r5.A02
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            java.lang.Object r3 = r5.A01
            com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl r3 = (com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl) r3
            X.0eS.A00(r1)
        L_0x0034:
            X.1Ng r2 = r3.A00
            java.lang.String r1 = r12.getId()
            X.3KA r0 = new X.3KA
            r0.<init>(r10, r1)
            r2.A00(r0)
            X.0gF r8 = X.C60340gF.A00
        L_0x0044:
            return r8
        L_0x0045:
            X.0eS.A00(r1)
            X.5mt r7 = r9.A04
            r7.A0D(r10, r12, r3)
            r14.invoke()
            boolean r0 = X.C294695ms.A02(r11)
            if (r0 == 0) goto L_0x0064
            X.2f1 r1 = r9.A03
            X.0qR r0 = r9.A02
            android.app.Application r0 = r0.A00
            java.lang.String r0 = X.C61970qY.A09(r0)
            X.4ax r2 = r1.A0L(r11, r12, r0)
        L_0x0064:
            X.1OC r1 = r7.A05(r11, r12)
            r5.A01 = r9
            r5.A02 = r12
            r5.A03 = r10
            r5.A04 = r11
            r5.A05 = r14
            r5.A06 = r2
            r5.A00 = r3
            r0 = 1201781838(0x47a1bc4e, float:82808.61)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 == r4) goto L_0x0044
            r3 = r9
            goto L_0x009c
        L_0x0081:
            java.lang.Object r2 = r5.A06
            X.4ax r2 = (X.C267094ax) r2
            java.lang.Object r14 = r5.A05
            X.0sa r14 = (X.C62320sa) r14
            java.lang.Object r11 = r5.A04
            X.EWA r11 = (X.EWA) r11
            java.lang.Object r10 = r5.A03
            com.instagram.user.model.FollowStatus r10 = (com.instagram.user.model.FollowStatus) r10
            java.lang.Object r12 = r5.A02
            com.instagram.user.model.User r12 = (com.instagram.user.model.User) r12
            java.lang.Object r3 = r5.A01
            com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl r3 = (com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl) r3
            X.0eS.A00(r1)
        L_0x009c:
            X.3Ii r1 = (X.C239803Ii) r1
            r5.A01 = r3
            r5.A02 = r12
            r5.A03 = r10
            r0 = 0
            r5.A04 = r0
            r5.A05 = r0
            r5.A06 = r0
            r5.A00 = r6
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00c0
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.7aR r0 = r3.A05
            X.EC7 r0 = r0.AM5(r2, r11, r12)
            r0.onSuccess(r1)
            goto L_0x0034
        L_0x00c0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0101
            r14.invoke()
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r1 = r1.A00
            boolean r0 = r1 instanceof X.C268674do
            if (r0 == 0) goto L_0x0034
            X.4do r1 = (X.C268674do) r1
            if (r1 == 0) goto L_0x0034
            java.lang.Object r2 = r1.A00
            r0 = r2
            X.1XQ r0 = (X.1XQ) r0
            int r1 = r0.mStatusCode
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0034
            X.DwR r2 = (X.DwR) r2
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0034
            X.3ju r1 = r3.A06
            X.A4V r0 = new X.A4V
            r0.<init>(r2)
            java.lang.Object r0 = r1.ELH(r0, r5)
            if (r0 != r4) goto L_0x0034
            return r8
        L_0x00f2:
            X.JZl r5 = new X.JZl
            r5.<init>(r9, r13, r3)
            goto L_0x0015
        L_0x00f9:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0101:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.follow.mvvm.data.FollowUserDataSourceImpl.ClV(com.instagram.user.model.FollowStatus, X.EWA, com.instagram.user.model.User, X.4D7, X.0sa):java.lang.Object");
    }

    public /* synthetic */ FollowUserDataSourceImpl(UserSession userSession, C61960qR r6, C333967aR r7) {
        AnonymousClass2f1 A002 = AnonymousClass2f1.A00(userSession);
        C294705mt A003 = C294695ms.A00(userSession);
        1Ng A004 = AnonymousClass1Nd.A00(userSession);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(A003, 5);
        0qQ.A0B(A004, 6);
        this.A01 = userSession;
        this.A05 = r7;
        this.A02 = r6;
        this.A03 = A002;
        this.A04 = A003;
        this.A00 = A004;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A06 = r0;
        this.A07 = 0u9.A04(r0);
    }
}
