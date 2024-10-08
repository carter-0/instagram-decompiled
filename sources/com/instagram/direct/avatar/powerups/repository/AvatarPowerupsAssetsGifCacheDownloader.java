package com.instagram.direct.avatar.powerups.repository;

import X.0qQ;
import X.C331897Sw;
import X.C331917Sy;
import X.C51966G9m;
import X.MSG;
import com.instagram.common.session.UserSession;

public final class AvatarPowerupsAssetsGifCacheDownloader implements MSG {
    public final UserSession A00;
    public final C331897Sw A01;

    public /* synthetic */ AvatarPowerupsAssetsGifCacheDownloader(UserSession userSession) {
        C331897Sw r0 = C331897Sw.A0A;
        C331897Sw A002 = C331917Sy.A00(C51966G9m.A0P(userSession));
        0qQ.A0B(A002, 2);
        this.A00 = userSession;
        this.A01 = A002;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r0 == r6) goto L_0x006a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088 A[Catch:{ MCw -> 0x00a1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0 A[Catch:{ MCw -> 0x00a1 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AQ5(X.C61008Jv7 r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 8
            boolean r0 = X.C66145MDx.A02(r3, r11)
            if (r0 == 0) goto L_0x0025
            r7 = r11
            X.MDx r7 = (X.C66145MDx) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L_0x003d
            if (r0 == r5) goto L_0x0034
            if (r0 != r8) goto L_0x002f
            goto L_0x002b
        L_0x0025:
            X.MDx r7 = new X.MDx
            r7.<init>(r9, r11, r3)
            goto L_0x0016
        L_0x002b:
            X.0eS.A00(r2)     // Catch:{ MCw -> 0x00a1 }
            goto L_0x00a2
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0034:
            java.lang.Object r10 = r7.A02
            X.Jv7 r10 = (X.C61008Jv7) r10
            java.lang.Object r1 = r7.A01
            com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader r1 = (com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader) r1
            goto L_0x006e
        L_0x003d:
            X.0eS.A00(r2)
            java.lang.Object r0 = r10.A02     // Catch:{ MCw -> 0x00a1 }
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch:{ MCw -> 0x00a1 }
            java.lang.String r4 = X.JTP.A0o(r0)     // Catch:{ MCw -> 0x00a1 }
            X.C66145MDx.A00(r9, r10, r7, r5)     // Catch:{ MCw -> 0x00a1 }
            X.7Sw r3 = r9.A01     // Catch:{ MCw -> 0x00a1 }
            boolean r0 = r3.A07(r4)     // Catch:{ MCw -> 0x00a1 }
            if (r0 != 0) goto L_0x0065
            X.3Pl r2 = X.JTQ.A0m(r7)     // Catch:{ MCw -> 0x00a1 }
            r1 = 0
            X.Lrg r0 = new X.Lrg     // Catch:{ MCw -> 0x00a1 }
            r0.<init>(r1, r2)     // Catch:{ MCw -> 0x00a1 }
            r3.A05(r0, r4)     // Catch:{ MCw -> 0x00a1 }
            java.lang.Object r0 = r2.A00()     // Catch:{ MCw -> 0x00a1 }
            goto L_0x0068
        L_0x0065:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ MCw -> 0x00a1 }
            goto L_0x006a
        L_0x0068:
            if (r0 != r6) goto L_0x0065
        L_0x006a:
            if (r0 == r6) goto L_0x00a6
            r1 = r9
            goto L_0x0071
        L_0x006e:
            X.0eS.A00(r2)     // Catch:{ MCw -> 0x00a1 }
        L_0x0071:
            java.lang.Object r0 = r10.A03     // Catch:{ MCw -> 0x00a1 }
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0     // Catch:{ MCw -> 0x00a1 }
            java.lang.String r4 = X.JTP.A0o(r0)     // Catch:{ MCw -> 0x00a1 }
            r0 = 0
            r7.A01 = r0     // Catch:{ MCw -> 0x00a1 }
            r7.A02 = r0     // Catch:{ MCw -> 0x00a1 }
            r7.A00 = r8     // Catch:{ MCw -> 0x00a1 }
            X.7Sw r3 = r1.A01     // Catch:{ MCw -> 0x00a1 }
            boolean r0 = r3.A07(r4)     // Catch:{ MCw -> 0x00a1 }
            if (r0 != 0) goto L_0x009c
            X.3Pl r2 = X.JTQ.A0m(r7)     // Catch:{ MCw -> 0x00a1 }
            r1 = 0
            X.Lrg r0 = new X.Lrg     // Catch:{ MCw -> 0x00a1 }
            r0.<init>(r1, r2)     // Catch:{ MCw -> 0x00a1 }
            r3.A05(r0, r4)     // Catch:{ MCw -> 0x00a1 }
            java.lang.Object r0 = r2.A00()     // Catch:{ MCw -> 0x00a1 }
            if (r0 != r6) goto L_0x009c
            goto L_0x009e
        L_0x009c:
            X.0gF r0 = X.C60340gF.A00     // Catch:{ MCw -> 0x00a1 }
        L_0x009e:
            if (r0 != r6) goto L_0x00a2
            return r6
        L_0x00a1:
            r5 = 0
        L_0x00a2:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
        L_0x00a6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsGifCacheDownloader.AQ5(X.Jv7, X.4D7):java.lang.Object");
    }
}
