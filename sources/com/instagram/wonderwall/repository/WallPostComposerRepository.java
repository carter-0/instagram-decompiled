package com.instagram.wonderwall.repository;

import X.02z;
import X.05G;
import X.106;
import X.10b;
import X.1Ng;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TF;
import X.DbS;
import X.DbW;
import X.YBO;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.wonderwall.model.WallInfo;

public final class WallPostComposerRepository {
    public final 1Ng A00;
    public final UserSession A01;
    public final User A02;
    public final YBO A03;
    public final WallInfo A04;
    public final WallPendingPostManager A05;
    public final 05G A06;
    public final 05G A07;
    public final AnonymousClass0Ud A08;
    public final AnonymousClass0Ud A09;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.music.common.model.AudioOverlayTrack r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 14
            boolean r0 = X.C66131MDj.A01(r3, r10)
            if (r0 == 0) goto L_0x0076
            r7 = r10
            X.MDj r7 = (X.C66131MDj) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r1 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r1) goto L_0x007c
            java.lang.Object r9 = r7.A02
            com.instagram.music.common.model.AudioOverlayTrack r9 = (com.instagram.music.common.model.AudioOverlayTrack) r9
            java.lang.Object r2 = r7.A01
            com.instagram.wonderwall.repository.WallPostComposerRepository r2 = (com.instagram.wonderwall.repository.WallPostComposerRepository) r2
            X.0eS.A00(r3)
        L_0x002c:
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.String r0 = r9.A0A
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r3 != 0) goto L_0x003c
            X.0sn r3 = X.0sn.A00
        L_0x003c:
            X.GqZ r1 = new X.GqZ
            r1.<init>((com.instagram.music.common.model.AudioOverlayTrack) r9, (java.lang.String) r0, (java.util.List) r3)
            X.05G r0 = r2.A06
            r0.Epw(r1)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0049:
            X.0eS.A00(r3)
            com.instagram.common.session.UserSession r5 = r8.A01
            com.instagram.music.common.model.MusicAssetModel r0 = r9.A08
            if (r0 == 0) goto L_0x0072
            com.instagram.common.typedurl.ImageUrl r0 = r0.A03
            if (r0 == 0) goto L_0x0072
            java.lang.String r4 = r0.getUrl()
        L_0x005a:
            X.C51966G9m.A1P(r8, r9, r7, r1)
            X.12T r0 = X.AnonymousClass12T.A00
            r3 = 0
            X.0nV r2 = X.DbX.A0c(r0)
            r1 = 39
            X.MGy r0 = new X.MGy
            r0.<init>(r5, r4, r3, r1)
            java.lang.Object r3 = X.1Eo.A00(r7, r2, r0)
            if (r3 != r6) goto L_0x0074
            return r6
        L_0x0072:
            r4 = 0
            goto L_0x005a
        L_0x0074:
            r2 = r8
            goto L_0x002c
        L_0x0076:
            X.MDj r7 = new X.MDj
            r7.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallPostComposerRepository.A00(com.instagram.music.common.model.AudioOverlayTrack, X.4D7):java.lang.Object");
    }

    public /* synthetic */ WallPostComposerRepository(UserSession userSession, YBO ybo, WallInfo wallInfo, WallPendingPostManager wallPendingPostManager, String str) {
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        DbW.A1O(wallPendingPostManager, 3, A002);
        this.A04 = wallInfo;
        this.A01 = userSession;
        this.A05 = wallPendingPostManager;
        this.A03 = ybo;
        this.A00 = A002;
        02z A10 = DbS.A10(str);
        this.A07 = A10;
        this.A09 = 10b.A03(A10);
        02z A012 = 106.A01(ybo);
        this.A06 = A012;
        this.A08 = A012;
        this.A02 = AnonymousClass7TF.A0Q(userSession);
    }
}
