package com.instagram.fanclub.memberlist.repository;

import X.02z;
import X.05D;
import X.05G;
import X.0V1;
import X.0V2;
import X.0sn;
import X.106;
import X.10D;
import X.10b;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.C262204Co;
import X.C51970G9q;
import X.C61770pa;
import X.DbS;
import X.JTR;
import com.instagram.fanclub.api.FanClubApi;

public final class CreatorMessagingSelectionScreenRepository implements AnonymousClass0lh {
    public final AnonymousClass0Ud A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final FanClubApi A05;
    public final String A06;
    public final 0V2 A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final C61770pa A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;

    public CreatorMessagingSelectionScreenRepository(FanClubApi fanClubApi, String str, boolean z) {
        this.A05 = fanClubApi;
        this.A06 = str;
        this.A0G = z;
        0sn r2 = 0sn.A00;
        02z A012 = 106.A01(r2);
        this.A08 = A012;
        02z A10 = DbS.A10(0);
        this.A0C = A10;
        02z A102 = DbS.A10(0);
        this.A09 = A102;
        02z A013 = 106.A01(r2);
        this.A0D = A013;
        02z A014 = 106.A01((Object) null);
        this.A0B = A014;
        02z A103 = C51970G9q.A10(true);
        this.A0A = A103;
        05D A015 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A07 = A015;
        this.A00 = 10b.A03(A012);
        this.A0F = 10b.A03(A10);
        this.A01 = 10b.A03(A102);
        this.A04 = 10b.A03(A013);
        this.A03 = 10b.A03(A014);
        this.A02 = 10b.A03(A103);
        this.A0E = new 0V1((C262204Co) null, A015);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r9, java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r8 = this;
            r3 = 4
            boolean r0 = X.C66137MDp.A02(r3, r11)
            if (r0 == 0) goto L_0x00af
            r4 = r11
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00af
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 == r2) goto L_0x0045
            if (r0 != r5) goto L_0x00b5
            X.0eS.A00(r1)
        L_0x0026:
            X.0gF r3 = X.C60340gF.A00
        L_0x0028:
            return r3
        L_0x0029:
            X.0eS.A00(r1)
            if (r9 != 0) goto L_0x0035
            X.05G r1 = r8.A0D
            X.0sn r0 = X.0sn.A00
            r1.Epw(r0)
        L_0x0035:
            com.instagram.fanclub.api.FanClubApi r1 = r8.A05
            boolean r0 = r8.A0G
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r1 = r1.A07(r9, r10, r4, r0)
            if (r1 == r3) goto L_0x0028
            r6 = r8
            goto L_0x004c
        L_0x0045:
            java.lang.Object r6 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r6 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r6
            X.0eS.A00(r1)
        L_0x004c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a6
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.371 r7 = (X.AnonymousClass371) r7
            X.05G r2 = r6.A0D
            java.util.Collection r1 = X.JTO.A13(r2)
            java.lang.Object r0 = r7.FH3()
            X.Jth r0 = (X.C60923Jth) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.00k.A0S(r0, r1)
            r2.Epw(r0)
            X.05G r1 = r6.A0B
            java.lang.Object r0 = r7.FH3()
            X.Jth r0 = (X.C60923Jth) r0
            java.lang.String r0 = r0.A00
            r1.Epw(r0)
            X.05G r1 = r6.A0A
            java.lang.Object r0 = r7.FH3()
            X.Jth r0 = (X.C60923Jth) r0
            boolean r0 = r0.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x008c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0026
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ba
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r2 = r1.A00
            X.0V2 r1 = r6.A07
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r3) goto L_0x0026
            return r3
        L_0x00a6:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x008c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00af:
            X.MDp r4 = X.C66137MDp.A00(r8, r11, r3)
            goto L_0x0015
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00ba:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 2
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x0060
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 != r3) goto L_0x0065
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r1 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r1
            X.0eS.A00(r2)
        L_0x0027:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0043
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.371 r0 = (X.AnonymousClass371) r0
            X.05G r1 = r1.A08
            java.lang.Object r0 = r0.FH3()
            X.BAa r0 = (X.C42000BAa) r0
            java.util.List r0 = r0.A00
            r1.Epw(r0)
        L_0x0040:
            X.0gF r4 = X.C60340gF.A00
        L_0x0042:
            return r4
        L_0x0043:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0040
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004c:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r6.A05
            r1 = 0
            boolean r0 = r6.A0G
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r2 = r2.A0T(r5, r1, r0)
            if (r2 == r4) goto L_0x0042
            r1 = r6
            goto L_0x0027
        L_0x0060:
            X.MDp r5 = X.C66137MDp.A00(r6, r7, r3)
            goto L_0x0015
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r3 = 3
            boolean r0 = X.C66137MDp.A02(r3, r13)
            if (r0 == 0) goto L_0x0093
            r4 = r13
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0093
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r2 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r6 = 1
            if (r0 == 0) goto L_0x007a
            if (r0 != r6) goto L_0x0099
            java.lang.Object r5 = r4.A01
            com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository r5 = (com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository) r5
            X.0eS.A00(r2)
        L_0x0027:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0071
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.C7k r0 = (X.C43740C7k) r0
            if (r0 == 0) goto L_0x006f
            X.C7j r0 = r0.A0E()
            if (r0 == 0) goto L_0x006f
            X.C7i r0 = r0.A0E()
            if (r0 == 0) goto L_0x006f
            X.C7h r4 = r0.A0E()
        L_0x0045:
            X.05G r3 = r5.A0C
            r0 = 0
            if (r4 == 0) goto L_0x006d
            X.Bju r2 = r4.A0E()
            if (r2 == 0) goto L_0x006d
            java.lang.String r1 = "count"
            int r1 = r2.getCoercedIntField(r0, r1)
        L_0x0056:
            X.JTQ.A1N(r3, r1)
            X.05G r1 = r5.A09
            if (r4 == 0) goto L_0x0067
            r0 = 4639(0x121f, float:6.5E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r4.A00(r0)
        L_0x0067:
            X.JTQ.A1N(r1, r0)
        L_0x006a:
            X.0gF r1 = X.C60340gF.A00
        L_0x006c:
            return r1
        L_0x006d:
            r1 = 0
            goto L_0x0056
        L_0x006f:
            r4 = 0
            goto L_0x0045
        L_0x0071:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x006a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007a:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r12.A05
            java.lang.String r3 = r12.A06
            r4.A01 = r12
            r4.A00 = r6
            r5 = 0
            r7 = r5
            r8 = r5
            r9 = r5
            r10 = r5
            r11 = r5
            java.lang.Object r2 = r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == r1) goto L_0x006c
            r5 = r12
            goto L_0x0027
        L_0x0093:
            X.MDp r4 = X.C66137MDp.A00(r12, r13, r3)
            goto L_0x0015
        L_0x0099:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.CreatorMessagingSelectionScreenRepository.A02(X.4D7):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        05G r0 = this.A08;
        0sn r1 = 0sn.A00;
        r0.Epw(r1);
        this.A0D.Epw(r1);
        this.A0B.Epw((Object) null);
        JTR.A1W(this.A0A);
    }
}
