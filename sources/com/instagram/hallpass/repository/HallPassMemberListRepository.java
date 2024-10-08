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
import X.EVM;
import com.instagram.common.session.UserSession;

public final class HallPassMemberListRepository extends C252733pa {
    public final 05G A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final UserSession A06;
    public final 05G A07;
    public final 05G A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallPassMemberListRepository(UserSession userSession) {
        super("HallPass", AnonymousClass43D.A00(214706031));
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        02z A012 = 106.A01(0sn.A00);
        this.A00 = A012;
        02z A013 = 106.A01((Object) null);
        this.A08 = A013;
        02z A10 = DbS.A10(EVM.Idle);
        this.A07 = A10;
        02z A102 = DbS.A10("");
        this.A01 = A102;
        this.A04 = 10b.A03(A012);
        this.A03 = 10b.A03(A013);
        this.A02 = 10b.A03(A10);
        this.A05 = 10b.A03(A102);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 29
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x0081
            r4 = r7
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0081
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0067
            if (r0 != r2) goto L_0x008c
            java.lang.Object r3 = r4.A01
            com.instagram.hallpass.repository.HallPassMemberListRepository r3 = (com.instagram.hallpass.repository.HallPassMemberListRepository) r3
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005e
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.MWF r2 = (X.MWF) r2
            X.05G r1 = r3.A00
            X.Dsm r2 = (X.C47200Dsm) r2
            java.util.List r0 = r2.A01
            r1.Epw(r0)
            X.05G r1 = r3.A08
            com.instagram.user.model.User r0 = r2.A00
            r1.Epw(r0)
            X.05G r1 = r3.A07
            X.EVM r0 = X.EVM.Success
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x004c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005b
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0087
            X.05G r1 = r3.A07
            X.EVM r0 = X.EVM.Error
            r1.Epw(r0)
        L_0x005b:
            X.0gF r3 = X.C60340gF.A00
        L_0x005d:
            return r3
        L_0x005e:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0067:
            X.0eS.A00(r1)
            X.05G r1 = r5.A07
            X.EVM r0 = X.EVM.Loading
            r1.Epw(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A06
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A04(r0, r6, r4)
            if (r1 == r3) goto L_0x005d
            r3 = r5
            goto L_0x0028
        L_0x0081:
            X.MDp r4 = new X.MDp
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0087:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassMemberListRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }
}
