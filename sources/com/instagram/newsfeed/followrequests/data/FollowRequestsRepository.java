package com.instagram.newsfeed.followrequests.data;

import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.1Ng;
import X.27U;
import X.AnonymousClass000;
import X.AnonymousClass0Ud;
import X.AnonymousClass11O;
import X.AnonymousClass1Nd;
import X.AnonymousClass3KA;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass64X;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C262224Cq;
import X.C47170Drl;
import X.C47289DuI;
import X.C49017Ent;
import X.C49356EuK;
import X.C49358EuM;
import X.C50585Feu;
import X.C51645Fy4;
import X.C51949G8s;
import X.C61860pz;
import X.C66161MFy;
import X.DbS;
import X.DbY;
import X.ENI;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class FollowRequestsRepository extends C252733pa {
    public final UserSession A00;
    public final C51949G8s A01;
    public final SpamFollowRequestsNetworkDataSource A02;
    public final C47289DuI A03;
    public final C49358EuM A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r12) {
        /*
            r11 = this;
            r3 = 5
            boolean r0 = X.C66138MDq.A02(r3, r12)
            if (r0 == 0) goto L_0x006c
            r4 = r12
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 != r2) goto L_0x0077
            java.lang.Object r3 = r4.A01
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r3 = (com.instagram.newsfeed.followrequests.data.FollowRequestsRepository) r3
            X.0eS.A00(r1)
        L_0x0027:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0041
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.ENG r4 = new X.ENG
            r4.<init>(r0)
            X.0sn r9 = X.0sn.A00
            r5 = 0
            r6 = r5
            r7 = r5
            r8 = r5
            r10 = r5
            r3.A05(r4, r5, r6, r7, r8, r9, r10)
        L_0x003c:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
        L_0x0040:
            return r3
        L_0x0041:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0072
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.ENF r0 = new X.ENF
            r0.<init>(r1)
            r3.A04(r0)
            r2 = 0
            goto L_0x003c
        L_0x0051:
            X.0eS.A00(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.ENH r0 = new X.ENH
            r0.<init>(r1)
            r11.A04(r0)
            X.G8s r0 = r11.A01
            r4.A01 = r11
            r4.A00 = r2
            java.lang.Object r1 = r0.AOR(r4)
            if (r1 == r3) goto L_0x0040
            r3 = r11
            goto L_0x0027
        L_0x006c:
            X.MDq r4 = new X.MDq
            r4.<init>(r11, r12, r3)
            goto L_0x0015
        L_0x0072:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0077:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A03(X.4D7):java.lang.Object");
    }

    public final void A04(C49356EuK euK) {
        A05(euK, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (List) null, (List) null);
    }

    public final void A05(C49356EuK euK, Integer num, Integer num2, Integer num3, Integer num4, List list, List list2) {
        int i;
        int i2;
        int i3;
        int i4;
        C49356EuK euK2 = euK;
        List list3 = list2;
        List list4 = list;
        05G r1 = this.A05;
        C47170Drl drl = (C47170Drl) r1.getValue();
        if (list == null) {
            list4 = drl.A05;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = drl.A01;
        }
        if (list2 == null) {
            list3 = drl.A06;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = drl.A00;
        }
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = drl.A03;
        }
        if (euK == null) {
            euK2 = drl.A04;
        }
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = drl.A02;
        }
        DbY.A1S(list4, list3);
        0qQ.A0B(euK2, 4);
        r1.Epw(new C47170Drl(euK2, list4, list3, i, i2, i3, i4));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C47170Drl r7, com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 9
            boolean r0 = X.ME9.A03(r3, r9)
            if (r0 == 0) goto L_0x008c
            r4 = r9
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L_0x0044
            if (r0 != r3) goto L_0x0092
            java.lang.Object r7 = r4.A02
            X.Drl r7 = (X.C47170Drl) r7
            java.lang.Object r8 = r4.A01
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r8 = (com.instagram.newsfeed.followrequests.data.FollowRequestsRepository) r8
            X.0eS.A00(r1)
        L_0x002c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0038
            A01(r7, r8)
        L_0x0033:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0038:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.ENF r0 = new X.ENF
            r0.<init>(r1)
            r8.A04(r0)
            r3 = 0
            goto L_0x0033
        L_0x0044:
            X.0eS.A00(r1)
            java.util.List r0 = r7.A05
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            com.instagram.user.model.FriendshipStatus r0 = r0.B8F()
            if (r0 == 0) goto L_0x006c
            java.lang.Boolean r0 = r0.BGp()
            if (r0 != 0) goto L_0x0051
        L_0x006c:
            r6.add(r1)
            goto L_0x0051
        L_0x0070:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1OC r1 = X.C320126ro.A03(r0, r6)
            r4.A01 = r8
            r4.A02 = r7
            r4.A00 = r3
            r0 = 1884899610(0x7059491a, float:2.6898649E29)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L_0x002c
            return r5
        L_0x008c:
            X.ME9 r4 = new X.ME9
            r4.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A00(X.Drl, com.instagram.newsfeed.followrequests.data.FollowRequestsRepository, X.4D7):java.lang.Object");
    }

    public static final void A01(C47170Drl drl, FollowRequestsRepository followRequestsRepository) {
        List list = drl.A05;
        Integer valueOf = Integer.valueOf(drl.A01);
        List list2 = drl.A06;
        Integer valueOf2 = Integer.valueOf(drl.A00);
        Integer valueOf3 = Integer.valueOf(drl.A03);
        followRequestsRepository.A05(drl.A04, valueOf, valueOf2, valueOf3, Integer.valueOf(drl.A02), list, list2);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.4D7, X.MDm] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r19, X.AnonymousClass4D7 r20, boolean r21) {
        /*
            r18 = this;
            r2 = r19
            r3 = r21
            r6 = 0
            r5 = r20
            boolean r0 = X.C66134MDm.A01(r6, r5)
            r8 = r18
            if (r0 == 0) goto L_0x00e6
            r7 = r5
            X.MDm r7 = (X.C66134MDm) r7
            int r4 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x00e6
            int r4 = r4 - r1
            r7.A00 = r4
        L_0x001d:
            java.lang.Object r0 = r7.A04
            X.1Hj r5 = X.1Hj.A02
            int r1 = r7.A00
            r4 = 1
            if (r1 == 0) goto L_0x0087
            if (r1 != r4) goto L_0x00f5
            boolean r3 = r7.A05
            java.lang.Object r11 = r7.A03
            X.EuK r11 = (X.C49356EuK) r11
            java.lang.Object r2 = r7.A02
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r10 = r7.A01
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r10 = (com.instagram.newsfeed.followrequests.data.FollowRequestsRepository) r10
            X.0eS.A00(r0)
        L_0x0039:
            boolean r0 = r0 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00ed
            if (r3 == 0) goto L_0x0053
            r10.A04(r11)
        L_0x0042:
            X.EuM r1 = r10.A04
            int r0 = r1.A00
            int r0 = r0 + -1
            int r0 = java.lang.Math.max(r6, r0)
            r1.A00 = r0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
        L_0x0052:
            return r5
        L_0x0053:
            X.05G r0 = r10.A05
            java.lang.Object r0 = r0.getValue()
            X.Drl r0 = (X.C47170Drl) r0
            java.util.List r0 = r0.A05
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x0065:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007b
            java.lang.Object r1 = r3.next()
            java.lang.String r0 = X.DbS.A0q(r1)
            boolean r0 = r2.contains(r0)
            X.DbV.A1U(r1, r5, r0)
            goto L_0x0065
        L_0x007b:
            r12 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r17 = r12
            r16 = r5
            r10.A05(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0042
        L_0x0087:
            X.0eS.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.ENH r0 = new X.ENH
            r0.<init>(r1)
            r8.A04(r0)
            X.ENG r11 = new X.ENG
            r11.<init>(r1)
            com.instagram.common.session.UserSession r10 = r8.A00
            X.0qQ.A0B(r2, r4)
            X.1NY r9 = X.AnonymousClass7TG.A0a(r10)
            if (r21 == 0) goto L_0x00e3
            java.lang.String r0 = "friendships/approve_all/"
        L_0x00a6:
            r9.A0E = r0
            java.lang.String r1 = X.C320126ro.A05(r2)
            java.lang.String r0 = "user_ids"
            r9.A9m(r0, r1)
            java.lang.String r1 = "remove_all_spam_followers"
            java.lang.String r0 = "false"
            r9.A9m(r1, r0)
            java.lang.String r1 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            r9.A0G(r0, r1)
            X.FVI r0 = new X.FVI
            r0.<init>(r10, r6)
            X.Dbb.A1K(r9, r0, r10)
            X.1OC r1 = X.DbT.A0U(r9, r4)
            r7.A01 = r8
            r7.A02 = r2
            r7.A03 = r11
            r7.A05 = r3
            r7.A00 = r4
            r0 = 1047046114(0x3e68a7e2, float:0.22720292)
            java.lang.Object r0 = r1.A00(r0, r7)
            if (r0 == r5) goto L_0x0052
            r10 = r8
            goto L_0x0039
        L_0x00e3:
            java.lang.String r0 = "friendships/remove_all/"
            goto L_0x00a6
        L_0x00e6:
            X.MDm r7 = new X.MDm
            r7.<init>(r8, r5, r6)
            goto L_0x001d
        L_0x00ed:
            r10.A04(r11)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L_0x00f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A02(java.util.List, X.4D7, boolean):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequestsRepository(UserSession userSession, C47289DuI duI, boolean z) {
        super(AnonymousClass000.A00(2280), AnonymousClass43D.A01(1396732746, 1));
        C51949G8s feu;
        C49358EuM A002 = C49017Ent.A00(userSession);
        AnonymousClass7TF.A1H(userSession, duI);
        if (z) {
            feu = new SpamFollowRequestsNetworkDataSource(userSession, duI);
        } else {
            feu = new C50585Feu(userSession, duI);
        }
        C51949G8s g8s = feu;
        AnonymousClass7TG.A1R(A002, g8s);
        this.A00 = userSession;
        this.A03 = duI;
        this.A04 = A002;
        this.A01 = g8s;
        this.A02 = new SpamFollowRequestsNetworkDataSource(userSession, duI);
        List list = 0sn.A00;
        02z A10 = DbS.A10(new C47170Drl(ENI.A00, list, list, list.size(), -1, 0, 0));
        this.A05 = A10;
        this.A06 = A10;
        C262224Cq r4 = this.A01;
        C51645Fy4.A01(this, r4, 29);
        1Ng A003 = AnonymousClass1Nd.A00(userSession);
        AnonymousClass11O.A03(r4, new C61860pz(new C66161MFy(this, (AnonymousClass4D7) null, 47), new AnonymousClass64X(A003).A00(AnonymousClass3KA.class)));
        AnonymousClass11O.A03(r4, new C61860pz(new C66161MFy(this, (AnonymousClass4D7) null, 48), new AnonymousClass64X(A003).A00(27U.class)));
    }
}
