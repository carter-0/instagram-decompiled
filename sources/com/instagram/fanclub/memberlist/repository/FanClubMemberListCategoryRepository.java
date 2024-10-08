package com.instagram.fanclub.memberlist.repository;

import X.02z;
import X.05D;
import X.05G;
import X.0V1;
import X.0V2;
import X.0qQ;
import X.0sn;
import X.106;
import X.10D;
import X.10b;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.C262204Co;
import X.C61770pa;
import X.DbS;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

public final class FanClubMemberListCategoryRepository implements AnonymousClass0lh {
    public final 05G A00;
    public final 05G A01;
    public final C61770pa A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final UserSession A06;
    public final FanClubApi A07;
    public final 0V2 A08;
    public final 05G A09;
    public final 05G A0A;
    public final AnonymousClass0Ud A0B;

    public FanClubMemberListCategoryRepository(UserSession userSession, FanClubApi fanClubApi) {
        0qQ.A0B(userSession, 2);
        this.A07 = fanClubApi;
        this.A06 = userSession;
        02z A10 = DbS.A10("");
        this.A09 = A10;
        02z A012 = 106.A01(0sn.A00);
        this.A00 = A012;
        02z A013 = 106.A01((Object) null);
        this.A01 = A013;
        02z A102 = DbS.A10(0);
        this.A0A = A102;
        05D A014 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A08 = A014;
        this.A03 = 10b.A03(A10);
        this.A04 = 10b.A03(A012);
        this.A05 = 10b.A03(A013);
        this.A0B = 10b.A03(A102);
        this.A02 = new 0V1((C262204Co) null, A014);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.api.schemas.FanClubCategoryType r9, X.AnonymousClass4D7 r10, boolean r11, boolean r12) {
        /*
            r8 = this;
            r3 = 5
            boolean r0 = X.C66137MDp.A02(r3, r10)
            if (r0 == 0) goto L_0x00b1
            r4 = r10
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r2) goto L_0x0029
            if (r0 != r5) goto L_0x00b8
            X.0eS.A00(r1)
        L_0x0026:
            X.0gF r3 = X.C60340gF.A00
        L_0x0028:
            return r3
        L_0x0029:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r6 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r6
            X.0eS.A00(r1)
            goto L_0x0055
        L_0x0031:
            X.0eS.A00(r1)
            X.05G r1 = r8.A01
            r0 = 0
            r1.Epw(r0)
            X.05G r1 = r8.A09
            java.lang.String r0 = ""
            r1.Epw(r0)
            X.05G r1 = r8.A00
            X.0sn r0 = X.0sn.A00
            r1.Epw(r0)
            com.instagram.fanclub.api.FanClubApi r0 = r8.A07
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r1 = r0.A01(r9, r4, r11, r12)
            if (r1 == r3) goto L_0x0028
            r6 = r8
        L_0x0055:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a8
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.371 r7 = (X.AnonymousClass371) r7
            X.05G r1 = r6.A09
            java.lang.Object r0 = r7.FH3()
            X.DrU r0 = (X.C47153DrU) r0
            java.lang.String r0 = r0.A01
            r1.Epw(r0)
            X.05G r1 = r6.A00
            java.lang.Object r0 = r7.FH3()
            X.DrU r0 = (X.C47153DrU) r0
            java.util.List r0 = r0.A02
            r1.Epw(r0)
            X.05G r2 = r6.A0A
            java.lang.Object r0 = r7.FH3()
            X.DrU r0 = (X.C47153DrU) r0
            int r1 = r0.A00
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            X.3Ih r1 = X.Dba.A0S(r0, r2)
        L_0x008e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0026
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bd
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r2 = r1.A00
            X.0V2 r1 = r6.A08
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x00a8:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b1:
            X.MDp r4 = new X.MDp
            r4.<init>(r8, r10, r3)
            goto L_0x0015
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bd:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A00(com.instagram.api.schemas.FanClubCategoryType, X.4D7, boolean, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.user.model.User r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 29
            boolean r0 = X.C66145MDx.A02(r3, r8)
            if (r0 == 0) goto L_0x0085
            r5 = r8
            X.MDx r5 = (X.C66145MDx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0085
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r3) goto L_0x0094
            java.lang.Object r7 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository r1 = (com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository) r1
            X.0eS.A00(r2)
        L_0x002a:
            r4 = r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008b
            X.05G r4 = r1.A00
            java.lang.Object r0 = r4.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.PwM r0 = (X.C74527PwM) r0
            X.JxE r0 = (X.C61103JxE) r0
            com.instagram.user.model.User r0 = r0.A00
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x003f
            r3.add(r1)
            goto L_0x003f
        L_0x005a:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r6.A07
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r6.A06
            X.4Cl r0 = X.DbS.A0h(r0, r1)
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x009e
            java.lang.String r1 = r0.getFanClubId()
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = r7.getId()
            r5.A01 = r6
            r5.A02 = r7
            r5.A00 = r3
            java.lang.Object r2 = r2.A03(r1, r0, r5)
            if (r2 == r4) goto L_0x009d
            r1 = r6
            goto L_0x002a
        L_0x0085:
            X.MDx r5 = new X.MDx
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x008b:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x009d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0094:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0099:
            X.3Ih r4 = X.Dba.A0S(r3, r4)
        L_0x009d:
            return r4
        L_0x009e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListCategoryRepository.A01(com.instagram.user.model.User, X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        this.A09.Epw("");
        this.A00.Epw(0sn.A00);
    }
}
