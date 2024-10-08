package com.instagram.hallpass.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.C252733pa;
import X.DbS;
import X.EVN;
import com.instagram.common.session.UserSession;

public final class HallPassParticipantsListRepository extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final 05G A03;
    public final 05G A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallPassParticipantsListRepository(UserSession userSession) {
        super("HallPass", AnonymousClass43D.A00(2133572359));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        02z A012 = 106.A01(0sn.A00);
        this.A04 = A012;
        02z A10 = DbS.A10(EVN.Idle);
        this.A03 = A10;
        this.A02 = 10b.A03(A012);
        this.A01 = 10b.A03(A10);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 30
            boolean r0 = X.C66137MDp.A02(r3, r12)
            if (r0 == 0) goto L_0x0090
            r4 = r12
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0090
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0076
            if (r0 != r2) goto L_0x009f
            java.lang.Object r6 = r4.A01
            com.instagram.hallpass.repository.HallPassParticipantsListRepository r6 = (com.instagram.hallpass.repository.HallPassParticipantsListRepository) r6
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0096
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.DRF r0 = (X.DRF) r0
            X.05G r9 = r6.A04
            X.BF1 r0 = (X.BF1) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x0042:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r7.next()
            X.DRE r0 = (X.DRE) r0
            X.Dsn r0 = (X.C47201Dsn) r0
            java.lang.String r5 = r0.A01
            com.instagram.user.model.User r4 = r0.A00
            X.1Nr r3 = new X.1Nr
            r3.<init>(r4)
            com.instagram.common.session.UserSession r2 = r6.A00
            java.lang.String r0 = r2.A06
            boolean r0 = X.DbV.A1Z(r4, r0)
            com.instagram.model.reels.Reel r1 = new com.instagram.model.reels.Reel
            r1.<init>(r3, r5, r0)
            com.instagram.reels.store.ReelStore r0 = com.instagram.reels.store.ReelStore.A03(r2)
            r0.A0X(r1)
            X.DtL r0 = new X.DtL
            r0.<init>(r1, r4)
            r8.add(r0)
            goto L_0x0042
        L_0x0076:
            X.0eS.A00(r1)
            X.05G r1 = r10.A03
            X.EVN r0 = X.EVN.Loading
            r1.Epw(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r10.A00
            r4.A01 = r10
            r4.A00 = r2
            java.lang.Object r1 = r1.A03(r0, r11, r4)
            if (r1 == r3) goto L_0x00c0
            r6 = r10
            goto L_0x0028
        L_0x0090:
            X.MDp r4 = new X.MDp
            r4.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x0096:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00af
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x009f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a4:
            r9.Epw(r8)
            X.05G r1 = r6.A03
            X.EVN r0 = X.EVN.Success
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x00af:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00be
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c1
            X.05G r1 = r6.A03
            X.EVN r0 = X.EVN.Error
            r1.Epw(r0)
        L_0x00be:
            X.0gF r3 = X.C60340gF.A00
        L_0x00c0:
            return r3
        L_0x00c1:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassParticipantsListRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }
}
