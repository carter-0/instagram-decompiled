package com.instagram.direct.avatar.powerups.repository;

import X.1L7;
import X.1LU;
import X.C331887Sv;
import X.MSG;
import com.facebook.stash.core.FileStash;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AvatarPowerupsAssetsStashDownloader implements MSG {
    public final FileStash A00;
    public final C331887Sv A01;

    public AvatarPowerupsAssetsStashDownloader() {
        this((FileStash) null, (C331887Sv) null, (DefaultConstructorMarker) null, 3);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AQ5(X.C61008Jv7 r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r7 = 31
            boolean r0 = X.C66143MDv.A02(r7, r10)
            if (r0 == 0) goto L_0x0023
            r6 = r10
            X.MDv r6 = (X.C66143MDv) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0034
            if (r0 != r3) goto L_0x002f
            goto L_0x002b
        L_0x0023:
            r0 = 42
            X.MDv r6 = new X.MDv
            r6.<init>(r8, r10, r7, r0)
            goto L_0x0016
        L_0x002b:
            X.0eS.A00(r1)     // Catch:{ IOException | URISyntaxException -> 0x004d }
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0034:
            X.0eS.A00(r1)
            X.12T r0 = X.AnonymousClass12T.A00     // Catch:{ IOException | URISyntaxException -> 0x004d }
            r2 = 0
            X.0nV r1 = X.DbX.A0c(r0)     // Catch:{ IOException | URISyntaxException -> 0x004d }
            X.MGi r0 = new X.MGi     // Catch:{ IOException | URISyntaxException -> 0x004d }
            r0.<init>(r8, r9, r2, r7)     // Catch:{ IOException | URISyntaxException -> 0x004d }
            r6.A00 = r3     // Catch:{ IOException | URISyntaxException -> 0x004d }
            java.lang.Object r0 = X.1Eo.A00(r6, r1, r0)     // Catch:{ IOException | URISyntaxException -> 0x004d }
            if (r0 != r5) goto L_0x004c
            return r5
        L_0x004c:
            r4 = 1
        L_0x004d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.powerups.repository.AvatarPowerupsAssetsStashDownloader.AQ5(X.Jv7, X.4D7):java.lang.Object");
    }

    public /* synthetic */ AvatarPowerupsAssetsStashDownloader(FileStash fileStash, C331887Sv r4, DefaultConstructorMarker defaultConstructorMarker, int i) {
        1LU A05 = 1L7.A01().A05(1522475227);
        C331887Sv r0 = new C331887Sv(A05);
        this.A00 = A05;
        this.A01 = r0;
    }
}
