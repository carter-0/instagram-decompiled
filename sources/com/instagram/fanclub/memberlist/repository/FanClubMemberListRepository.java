package com.instagram.fanclub.memberlist.repository;

import X.05G;
import X.0sn;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass7TF;
import X.AnonymousClass9P5;
import X.C14221Ts1;
import X.C50918Fkx;
import X.C61770pa;
import com.instagram.fanclub.api.FanClubApi;

public final class FanClubMemberListRepository {
    public final AnonymousClass0r6 A00;
    public final C61770pa A01;
    public final AnonymousClass0Ud A02;
    public final FanClubApi A03;
    public final C50918Fkx A04;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDo, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 16
            boolean r0 = X.C66136MDo.A01(r3, r6)
            if (r0 == 0) goto L_0x0060
            r4 = r6
            X.MDo r4 = (X.C66136MDo) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r2) goto L_0x0073
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0049
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r0 = r3.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.BAa r0 = (X.C42000BAa) r0
            java.util.List r0 = r0.A00
            if (r0 != 0) goto L_0x003c
            X.0sn r0 = X.0sn.A00
        L_0x003c:
            X.3Ih r3 = X.C41845B3m.A0d(r0)
        L_0x0040:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0068
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r1 = r3.A00
            return r1
        L_0x0049:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0040
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0052:
            X.0eS.A00(r3)
            com.instagram.fanclub.api.FanClubApi r0 = r5.A03
            r4.A00 = r2
            java.lang.Object r3 = r0.A0T(r4, r2, r2)
            if (r3 != r1) goto L_0x0024
            return r1
        L_0x0060:
            r0 = 42
            X.MDo r4 = new X.MDo
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x0068:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006e
            r1 = 0
            return r1
        L_0x006e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.memberlist.repository.FanClubMemberListRepository.A00(X.4D7):java.lang.Object");
    }

    public final void A01(String str) {
        C50918Fkx fkx = this.A04;
        if (str == null) {
            str = "";
        }
        if (!str.equals(fkx.A01)) {
            fkx.A01 = str;
            fkx.A04.Epw(0sn.A00);
            fkx.A00 = null;
        } else if (AnonymousClass7TF.A1Y(fkx.A00, false) || fkx.A02.A04()) {
            return;
        }
        C14221Ts1 ts1 = fkx.A02;
        AnonymousClass9P5 BiX = ts1.A06.BiX(str);
        if (fkx.A00 != null) {
            ts1.A03(fkx.A01);
        } else if (BiX.A01 == AnonymousClass05K.A0C) {
            05G r1 = fkx.A04;
            0sn r0 = BiX.A06;
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            r1.Epw(r0);
        } else {
            ts1.A06(fkx.A01);
        }
    }

    public FanClubMemberListRepository(FanClubApi fanClubApi, C50918Fkx fkx) {
        this.A03 = fanClubApi;
        this.A04 = fkx;
        this.A02 = fkx.A06;
        this.A01 = fkx.A05;
        this.A00 = fkx.A03;
    }
}
