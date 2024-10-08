package com.instagram.fanclub.creatorlist;

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
import X.C262204Co;
import X.C60340gF;
import X.C61770pa;
import X.DbS;
import X.EVL;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

public final class SubscribedAndRecommendedCreatorListRepository {
    public EVL A00;
    public EVL A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05 = true;
    public final UserSession A06;
    public final FanClubApi A07;
    public final 0V2 A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final C61770pa A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r8.A01 == X.EVL.IN_PROGRESS) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        if (r3.A00 != X.EVL.IN_PROGRESS) goto L_0x0073;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r5 = 0
            boolean r0 = X.C66137MDp.A02(r5, r9)
            if (r0 == 0) goto L_0x0084
            r6 = r9
            X.MDp r6 = (X.C66137MDp) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r1 = r6.A00
            r7 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r0) goto L_0x0058
            if (r1 != r7) goto L_0x008a
            java.lang.Object r3 = r6.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.0eS.A00(r2)
        L_0x002a:
            X.05G r0 = r3.A0C
            X.AnonymousClass7TF.A1O(r0, r5)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0032:
            X.0eS.A00(r2)
            r6.A01 = r8
            r6.A00 = r0
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0044
            X.EVL r1 = r8.A01
            X.EVL r0 = X.EVL.IN_PROGRESS
            r2 = 1
            if (r1 != r0) goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            X.EVL r1 = r8.A01
            X.EVL r0 = X.EVL.INITIAL_FETCH
            if (r1 == r0) goto L_0x004d
            if (r2 == 0) goto L_0x0056
        L_0x004d:
            java.lang.String r0 = r8.A03
            java.lang.Object r0 = A01(r8, r0, r6)
            if (r0 != r4) goto L_0x0056
            return r4
        L_0x0056:
            r3 = r8
            goto L_0x005f
        L_0x0058:
            java.lang.Object r3 = r6.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r3 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r3
            X.0eS.A00(r2)
        L_0x005f:
            r6.A01 = r3
            r6.A00 = r7
            boolean r0 = r3.A05
            if (r0 != 0) goto L_0x0072
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0072
            X.EVL r1 = r3.A00
            X.EVL r0 = X.EVL.IN_PROGRESS
            r2 = 1
            if (r1 != r0) goto L_0x0073
        L_0x0072:
            r2 = 0
        L_0x0073:
            X.EVL r1 = r3.A00
            X.EVL r0 = X.EVL.INITIAL_FETCH
            if (r1 == r0) goto L_0x007b
            if (r2 == 0) goto L_0x002a
        L_0x007b:
            java.lang.String r0 = r3.A02
            java.lang.Object r0 = A00(r3, r0, r6)
            if (r0 != r4) goto L_0x002a
            return r4
        L_0x0084:
            X.MDp r6 = new X.MDp
            r6.<init>(r8, r9, r5)
            goto L_0x0015
        L_0x008a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A03(X.4D7):java.lang.Object");
    }

    public /* synthetic */ SubscribedAndRecommendedCreatorListRepository(UserSession userSession) {
        FanClubApi fanClubApi = new FanClubApi(userSession);
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A07 = fanClubApi;
        02z A012 = 106.A01((Object) null);
        this.A0A = A012;
        EVL evl = EVL.INITIAL_FETCH;
        this.A01 = evl;
        02z A013 = 106.A01((Object) null);
        this.A09 = A013;
        this.A04 = true;
        this.A00 = evl;
        02z A014 = 106.A01(0sn.A00);
        this.A0B = A014;
        this.A0F = 10b.A03(A012);
        this.A0E = 10b.A03(A013);
        this.A0G = 10b.A03(A014);
        05D A015 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A08 = A015;
        this.A0D = new 0V1((C262204Co) null, A015);
        02z A10 = DbS.A10(false);
        this.A0C = A10;
        this.A0H = 10b.A03(A10);
        A015.FIA(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 47
            boolean r0 = X.C66129MDh.A01(r3, r7)
            if (r0 == 0) goto L_0x00ab
            r4 = r7
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0097
            if (r0 != r2) goto L_0x00b7
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008e
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r4 = r3.A00
            X.371 r4 = (X.AnonymousClass371) r4
            X.05G r3 = r5.A09
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L_0x0040
            X.0sn r1 = X.0sn.A00
        L_0x0040:
            java.lang.Object r0 = r4.FH3()
            X.DrO r0 = (X.C47147DrO) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r3.Epw(r0)
            java.lang.Object r0 = r4.FH3()
            X.DrO r0 = (X.C47147DrO) r0
            java.lang.String r0 = r0.A00
            r5.A02 = r0
            java.lang.Object r0 = r4.FH3()
            X.DrO r0 = (X.C47147DrO) r0
            boolean r0 = r0.A02
            r5.A04 = r0
            X.EVL r0 = X.EVL.IDLE
            r5.A00 = r0
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x006d:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008b
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b2
            X.05G r1 = r5.A09
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x007f
            X.0sn r0 = X.0sn.A00
        L_0x007f:
            r1.Epw(r0)
            X.EVL r0 = X.EVL.ERROR
            r5.A00 = r0
            X.05G r0 = r5.A0C
            X.AnonymousClass7TF.A1O(r0, r2)
        L_0x008b:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x008e:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0097:
            X.0eS.A00(r3)
            X.EVL r0 = X.EVL.IN_PROGRESS
            r5.A00 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A0C(r6, r4)
            if (r3 != r1) goto L_0x0028
            return r1
        L_0x00ab:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A00(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5, java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 48
            boolean r0 = X.C66129MDh.A01(r3, r7)
            if (r0 == 0) goto L_0x00ab
            r4 = r7
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ab
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0097
            if (r0 != r2) goto L_0x00b7
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r5 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r5
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008e
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r4 = r3.A00
            X.371 r4 = (X.AnonymousClass371) r4
            X.05G r3 = r5.A0A
            java.lang.Object r1 = r3.getValue()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 != 0) goto L_0x0040
            X.0sn r1 = X.0sn.A00
        L_0x0040:
            java.lang.Object r0 = r4.FH3()
            X.DrN r0 = (X.C47146DrN) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r3.Epw(r0)
            java.lang.Object r0 = r4.FH3()
            X.DrN r0 = (X.C47146DrN) r0
            java.lang.String r0 = r0.A00
            r5.A03 = r0
            java.lang.Object r0 = r4.FH3()
            X.DrN r0 = (X.C47146DrN) r0
            boolean r0 = r0.A02
            r5.A05 = r0
            X.EVL r0 = X.EVL.IDLE
            r5.A01 = r0
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x006d:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x008b
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b2
            X.05G r1 = r5.A0A
            java.lang.Object r0 = r1.getValue()
            if (r0 != 0) goto L_0x007f
            X.0sn r0 = X.0sn.A00
        L_0x007f:
            r1.Epw(r0)
            X.EVL r0 = X.EVL.ERROR
            r5.A01 = r0
            X.05G r0 = r5.A0C
            X.AnonymousClass7TF.A1O(r0, r2)
        L_0x008b:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x008e:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0097:
            X.0eS.A00(r3)
            X.EVL r0 = X.EVL.IN_PROGRESS
            r5.A01 = r0
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r3 = r0.A0B(r6, r4)
            if (r3 != r1) goto L_0x0028
            return r1
        L_0x00ab:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x00b2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A01(com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 49
            boolean r0 = X.C66129MDh.A01(r3, r6)
            if (r0 == 0) goto L_0x005e
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r1) goto L_0x0064
            java.lang.Object r1 = r4.A01
            com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository r1 = (com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository) r1
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0044
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.371 r0 = (X.AnonymousClass371) r0
            X.05G r1 = r1.A0B
            java.lang.Object r0 = r0.FH3()
            X.BAb r0 = (X.C42001BAb) r0
            java.util.List r0 = r0.A00
            r1.Epw(r0)
        L_0x0041:
            X.0gF r2 = X.C60340gF.A00
        L_0x0043:
            return r2
        L_0x0044:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0041
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004d:
            X.0eS.A00(r3)
            com.instagram.fanclub.api.FanClubApi r0 = r5.A07
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A0Q(r4)
            if (r3 == r2) goto L_0x0043
            r1 = r5
            goto L_0x0028
        L_0x005e:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository.A02(X.4D7):java.lang.Object");
    }
}
