package com.instagram.direct.avatar.powerups.repository;

import X.0qQ;
import X.1vm;
import X.25x;
import X.AnonymousClass79Z;
import X.DbW;
import X.L4M;
import X.LD6;
import X.MMO;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi;

public final class AvatarPowerupsRepository {
    public final AvatarStore A00;
    public final UserSession A01;
    public final AvatarPowerupsApi A02;
    public final AnonymousClass79Z A03;
    public final LD6 A04;
    public final L4M A05;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.ME1] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r10 == r7) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r3 = 5
            boolean r0 = X.ME1.A02(r3, r13)
            if (r0 == 0) goto L_0x0145
            r6 = r13
            X.ME1 r6 = (X.ME1) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0145
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r10 = r6.A06
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 2
            r9 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 == r9) goto L_0x00aa
            if (r0 != r5) goto L_0x014c
            java.lang.Object r3 = r6.A05
            java.lang.Object r2 = r6.A04
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r1 = r6.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r9 = r6.A02
            X.MSG r9 = (X.MSG) r9
            java.lang.Object r8 = r6.A01
            X.LMU r8 = (X.LMU) r8
            X.0eS.A00(r10)
        L_0x0038:
            boolean r0 = X.AnonymousClass7TE.A1a(r10)
            if (r0 == 0) goto L_0x0041
            r1.add(r3)
        L_0x0041:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r3 = r2.next()
            r0 = r3
            X.Jv7 r0 = (X.C61008Jv7) r0
            X.ME1.A00(r8, r9, r1, r2, r6)
            r6.A05 = r3
            r6.A00 = r5
            java.lang.Object r10 = r9.AQ5(r0, r6)
            if (r10 != r7) goto L_0x0038
        L_0x005b:
            return r7
        L_0x005c:
            r0 = 14
            java.util.List r7 = X.MAY.A00(r1, r0)
            if (r8 == 0) goto L_0x005b
            java.lang.String r0 = "success"
            X.LMU.A00(r8, r0)
            return r7
        L_0x006a:
            X.0eS.A00(r10)
            com.instagram.avatars.store.AvatarStore r0 = r12.A00
            X.27E r0 = r0.A01
            X.27H r1 = r0.A00
            X.5rf r0 = X.C297385rf.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x015f
            X.LD6 r8 = r12.A04
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            boolean r0 = r8.A00
            if (r0 != 0) goto L_0x0094
            r1 = 0
        L_0x0084:
            com.instagram.direct.avatar.powerups.api.AvatarPowerupsApi r0 = r12.A02
            r6.A01 = r12
            r6.A02 = r1
            r6.A00 = r9
            java.lang.Object r10 = r0.A00(r6)
            if (r10 == r7) goto L_0x005b
            r4 = r12
            goto L_0x00b5
        L_0x0094:
            X.02m r3 = r8.A01
            r2 = 1064965959(0x3f7a1747, float:0.9769177)
            java.lang.String r1 = "artefacts_request"
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.markerPoint(r2, r0)
            X.LMU r1 = new X.LMU
            r1.<init>(r8, r4)
            goto L_0x0084
        L_0x00aa:
            java.lang.Object r1 = r6.A02
            X.LMU r1 = (X.LMU) r1
            java.lang.Object r4 = r6.A01
            com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository r4 = (com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository) r4
            X.0eS.A00(r10)
        L_0x00b5:
            X.3Ii r10 = (X.C239803Ii) r10
            boolean r0 = r10 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0151
            X.3Ih r10 = (X.C239793Ih) r10
            java.lang.Object r10 = r10.A00
            r0 = r10
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0151
            if (r1 == 0) goto L_0x00d1
            java.lang.String r0 = "success"
            X.LMU.A00(r1, r0)
        L_0x00d1:
            X.LD6 r11 = r4.A04
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0125
            r8 = 0
        L_0x00da:
            X.L4M r9 = r4.A05
            X.79Z r0 = r9.A01
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320060226609063(0x8108e700071fa7, double:3.0322905642267755E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 0
            if (r0 == 0) goto L_0x011d
            r0 = 3
            com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader r9 = new com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader
            r9.<init>(r1, r1, r1, r0)
        L_0x00f4:
            X.MSG r9 = (X.MSG) r9
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r10.iterator()
        L_0x0100:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.Jv7 r0 = (X.C61008Jv7) r0
            X.79Z r1 = r4.A03
            java.lang.Object r0 = r0.A04
            X.5FV r0 = (X.AnonymousClass5FV) r0
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0100
            r11.add(r2)
            goto L_0x0100
        L_0x011d:
            com.instagram.common.session.UserSession r0 = r9.A00
            com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader r9 = new com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader
            r9.<init>(r0)
            goto L_0x00f4
        L_0x0125:
            X.02m r3 = r11.A01
            r2 = 1064965959(0x3f7a1747, float:0.9769177)
            java.lang.String r1 = "assets_download"
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0R(r1, r0)
            r3.markerPoint(r2, r0)
            X.LMU r8 = new X.LMU
            r8.<init>(r11, r9)
            goto L_0x00da
        L_0x013b:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r11.iterator()
            goto L_0x0041
        L_0x0145:
            X.ME1 r6 = new X.ME1
            r6.<init>(r12, r13, r3)
            goto L_0x0015
        L_0x014c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0151:
            if (r1 == 0) goto L_0x0158
            java.lang.String r0 = "fail"
            X.LMU.A00(r1, r0)
        L_0x0158:
            X.LD6 r1 = r4.A04
            X.KQC r0 = X.KQC.A00
            r1.A00(r0)
        L_0x015f:
            X.0sn r7 = X.0sn.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsRepository.A00(X.4D7):java.lang.Object");
    }

    public /* synthetic */ AvatarPowerupsRepository(UserSession userSession) {
        AvatarPowerupsApi avatarPowerupsApi = new AvatarPowerupsApi(userSession, 1vm.A01(userSession));
        AnonymousClass79Z r4 = new AnonymousClass79Z(userSession);
        AvatarStore A002 = 25x.A00(userSession);
        L4M l4m = new L4M(userSession);
        0qQ.A0B(userSession, 0);
        LD6 ld6 = (LD6) userSession.A01(LD6.class, new MMO(userSession, 14));
        DbW.A1O(A002, 4, ld6);
        this.A01 = userSession;
        this.A02 = avatarPowerupsApi;
        this.A03 = r4;
        this.A00 = A002;
        this.A05 = l4m;
        this.A04 = ld6;
    }
}
