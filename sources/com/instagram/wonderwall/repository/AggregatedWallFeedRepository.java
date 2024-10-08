package com.instagram.wonderwall.repository;

import X.02z;
import X.05G;
import X.0sn;
import X.106;
import X.AnonymousClass0Ud;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.C335967dq;
import X.C53359Gmj;
import X.DbS;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;

public final class AggregatedWallFeedRepository {
    public String A00;
    public boolean A01;
    public final AnonymousClass4HW A02;
    public final AnonymousClass4HW A03;
    public final 05G A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final WallApiGraphQLImpl A08;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDs, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.wonderwall.repository.AggregatedWallFeedRepository r7, java.lang.String r8, X.AnonymousClass4D7 r9, boolean r10, boolean r11) {
        /*
            r3 = 13
            boolean r0 = X.C66140MDs.A01(r3, r9)
            if (r0 == 0) goto L_0x00a9
            r6 = r9
            X.MDs r6 = (X.C66140MDs) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a9
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x007e
            if (r0 != r4) goto L_0x00b5
            boolean r10 = r6.A05
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r6.A01
            com.instagram.wonderwall.repository.AggregatedWallFeedRepository r7 = (com.instagram.wonderwall.repository.AggregatedWallFeedRepository) r7
            X.0eS.A00(r1)
        L_0x002e:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0072
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r3 = r1.A00
            X.Hmf r3 = (X.C55744Hmf) r3
            java.util.List r2 = r3.A01
            X.05G r1 = r7.A04
            if (r10 == 0) goto L_0x0064
            r1.Epw(r2)
        L_0x0043:
            boolean r0 = r3.A02
            r7.A01 = r0
            java.lang.String r0 = r3.A00
            r7.A00 = r0
            r0 = 4
            X.Iwl r3 = new X.Iwl
            r3.<init>(r8, r2, r0)
        L_0x0051:
            X.05G r2 = r7.A05
        L_0x0053:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0053
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0064:
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.00k.A0S(r2, r0)
            r1.Epw(r0)
            goto L_0x0043
        L_0x0072:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00b0
            r0 = 35
            X.MPC r3 = new X.MPC
            r3.<init>(r1, r0)
            goto L_0x0051
        L_0x007e:
            X.0eS.A00(r1)
            r0 = 24
            X.GL4 r3 = new X.GL4
            r3.<init>(r11, r0)
            X.05G r2 = r7.A05
        L_0x008a:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x008a
            com.instagram.wonderwall.api.WallApiGraphQLImpl r0 = r7.A08
            r6.A01 = r7
            r6.A02 = r8
            r6.A05 = r10
            r6.A00 = r4
            java.lang.Object r1 = r0.A04(r8, r6)
            if (r1 != r5) goto L_0x002e
            return r5
        L_0x00a9:
            X.MDs r6 = new X.MDs
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x00b0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00b5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.AggregatedWallFeedRepository.A00(com.instagram.wonderwall.repository.AggregatedWallFeedRepository, java.lang.String, X.4D7, boolean, boolean):java.lang.Object");
    }

    public AggregatedWallFeedRepository(WallApiGraphQLImpl wallApiGraphQLImpl) {
        this.A08 = wallApiGraphQLImpl;
        02z A10 = DbS.A10(new C53359Gmj());
        this.A05 = A10;
        this.A07 = A10;
        02z A012 = 106.A01(0sn.A00);
        this.A04 = A012;
        this.A06 = A012;
        AnonymousClass4HU r1 = AnonymousClass4HU.A00;
        this.A03 = C335967dq.A00(r1);
        this.A02 = C335967dq.A00(r1);
    }
}
