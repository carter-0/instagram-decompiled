package com.instagram.video.live.mvvm.model.repository.core;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.10b;
import X.17h;
import X.17i;
import X.1OP;
import X.AnonymousClass0Ud;
import X.C313666go;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi;

public final class IgLiveBroadcastInfoManager {
    public final UserSession A00;
    public final ReelStore A01;
    public final 17i A02;
    public final IgLiveBroadcastInfoApi A03;
    public final C313666go A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Jf, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r1 != r7) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r0 = 0
            r4 = 4
            boolean r1 = X.C376759Jf.A00(r4, r11)
            if (r1 == 0) goto L_0x00da
            r6 = r11
            X.9Jf r6 = (X.C376759Jf) r6
            int r3 = r6.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x00da
            int r3 = r3 - r2
            r6.A00 = r3
        L_0x0016:
            java.lang.Object r1 = r6.A04
            X.1Hj r7 = X.1Hj.A02
            int r2 = r6.A00
            r5 = 3
            r8 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r3) goto L_0x0076
            if (r2 == r8) goto L_0x009f
            if (r2 != r5) goto L_0x00e1
            java.lang.Object r8 = r6.A03
            X.05G r8 = (X.05G) r8
            java.lang.Object r4 = r6.A02
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r3 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r3
            X.0eS.A00(r1)
        L_0x0034:
            r8.Epw(r1)
            X.05G r0 = r3.A05
            java.lang.Object r0 = r0.getValue()
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0042:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x004b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r4 = r1.A00
        L_0x004a:
            return r4
        L_0x004b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x004a
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0055:
            X.0eS.A00(r1)
            com.instagram.reels.store.ReelStore r1 = r9.A01
            com.instagram.model.reels.Reel r1 = r1.A0M(r10)
            if (r1 == 0) goto L_0x008e
            X.4gL r2 = r1.A0H
            if (r2 == 0) goto L_0x008e
            com.instagram.common.session.UserSession r1 = r9.A00
            r6.A01 = r9
            r6.A02 = r10
            r6.A05 = r0
            r6.A00 = r3
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A01(r1, r2, r6)
            if (r1 == r7) goto L_0x009e
            r3 = r9
            goto L_0x0083
        L_0x0076:
            boolean r0 = r6.A05
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r3 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r3
            X.0eS.A00(r1)
        L_0x0083:
            r4 = r1
            if (r1 == 0) goto L_0x0090
            if (r0 != 0) goto L_0x0090
            X.05G r0 = r3.A05
            r0.Epw(r1)
            return r4
        L_0x008e:
            r4 = 0
            r3 = r9
        L_0x0090:
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveBroadcastInfoApi r0 = r3.A03
            r6.A01 = r3
            r6.A02 = r4
            r6.A00 = r8
            java.lang.Object r1 = r0.A00(r10, r6)
            if (r1 != r7) goto L_0x00a8
        L_0x009e:
            return r7
        L_0x009f:
            java.lang.Object r4 = r6.A02
            java.lang.Object r3 = r6.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r3 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r3
            X.0eS.A00(r1)
        L_0x00a8:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00d0
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.4gL r2 = (X.C270194gL) r2
            com.instagram.reels.store.ReelStore r1 = r3.A01
            com.instagram.model.reels.Reel r0 = r1.A0G(r2)
            r1.A0Y(r0)
            X.05G r8 = r3.A05
            com.instagram.common.session.UserSession r0 = r3.A00
            r6.A01 = r3
            r6.A02 = r4
            r6.A03 = r8
            r6.A00 = r5
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A01(r0, r2, r6)
            if (r1 != r7) goto L_0x0034
            return r7
        L_0x00d0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0042
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00da:
            X.9Jf r6 = new X.9Jf
            r6.<init>(r9, r11, r4)
            goto L_0x0016
        L_0x00e1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.9JW] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 4
            boolean r0 = X.AnonymousClass9JW.A00(r3, r7)
            if (r0 == 0) goto L_0x004e
            r4 = r7
            X.9JW r4 = (X.AnonymousClass9JW) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r2) goto L_0x0054
            java.lang.Object r0 = r4.A01
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r0 = (com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager) r0
            X.0eS.A00(r1)
        L_0x0027:
            if (r1 == 0) goto L_0x002e
            X.05G r0 = r0.A05
            r0.Epw(r1)
        L_0x002e:
            X.0gF r3 = X.C60340gF.A00
        L_0x0030:
            return r3
        L_0x0031:
            X.0eS.A00(r1)
            com.instagram.reels.store.ReelStore r0 = r5.A01
            com.instagram.model.reels.Reel r0 = r0.A0M(r6)
            if (r0 == 0) goto L_0x002e
            X.4gL r1 = r0.A0H
            if (r1 == 0) goto L_0x002e
            com.instagram.common.session.UserSession r0 = r5.A00
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveBroadcastInfoKt.A01(r0, r1, r4)
            if (r1 == r3) goto L_0x0030
            r0 = r5
            goto L_0x0027
        L_0x004e:
            X.9JW r4 = new X.9JW
            r4.<init>(r5, r7, r3)
            goto L_0x0015
        L_0x0054:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A02(java.lang.String, X.4D7):java.lang.Object");
    }

    public /* synthetic */ IgLiveBroadcastInfoManager(UserSession userSession, C313666go r6) {
        IgLiveBroadcastInfoApi igLiveBroadcastInfoApi = new IgLiveBroadcastInfoApi(userSession);
        ReelStore A052 = 1OP.A05(userSession);
        17i A002 = 17h.A00(userSession);
        0qQ.A0B(A002, 5);
        this.A00 = userSession;
        this.A04 = r6;
        this.A03 = igLiveBroadcastInfoApi;
        this.A01 = A052;
        this.A02 = A002;
        02z A012 = 106.A01((Object) null);
        this.A05 = A012;
        this.A06 = 10b.A03(A012);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.9Jj] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass3NV r34, java.lang.String r35, java.util.List r36, X.AnonymousClass4D7 r37, boolean r38) {
        /*
            r33 = this;
            r12 = r35
            r11 = r34
            r4 = r38
            r7 = 1
            r3 = r37
            boolean r0 = r3 instanceof X.C376799Jj
            r8 = r33
            if (r0 == 0) goto L_0x00b0
            r6 = r3
            X.9Jj r6 = (X.C376799Jj) r6
            int r0 = r6.A09
            if (r0 != r7) goto L_0x00b0
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b0
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0021:
            java.lang.Object r1 = r6.A06
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            if (r0 == 0) goto L_0x007b
            if (r0 != r7) goto L_0x00b7
            boolean r4 = r6.A08
            java.lang.Object r0 = r6.A05
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r10 = r6.A04
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.Object r3 = r6.A03
            X.05G r3 = (X.05G) r3
            java.lang.Object r11 = r6.A02
            X.3NV r11 = (X.AnonymousClass3NV) r11
            java.lang.Object r12 = r6.A01
            java.lang.String r12 = (java.lang.String) r12
            X.0eS.A00(r1)
        L_0x0044:
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            java.lang.String r13 = "0"
            r24 = 0
            X.0sn r20 = X.0sn.A00
            java.lang.String r18 = ""
            X.JvD r5 = new X.JvD
            r7 = r6
            r8 = r6
            r9 = r6
            r14 = r13
            r15 = r6
            r16 = r6
            r17 = r6
            r19 = r1
            r21 = r20
            r22 = r20
            r23 = r0
            r25 = r24
            r26 = r24
            r27 = r4
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r32 = r24
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r3.Epw(r5)
        L_0x0078:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x007b:
            X.0eS.A00(r1)
            X.05G r3 = r8.A05
            java.lang.Object r0 = r3.getValue()
            if (r0 != 0) goto L_0x0078
            X.17i r2 = r8.A02
            com.instagram.common.session.UserSession r1 = r8.A00
            java.lang.String r0 = r1.A06
            com.instagram.user.model.User r10 = r2.A02(r0)
            if (r10 != 0) goto L_0x0097
            com.instagram.user.model.User r10 = new com.instagram.user.model.User
            r10.<init>()
        L_0x0097:
            X.0sl r0 = X.0sl.A00
            r6.A01 = r12
            r6.A02 = r11
            r6.A03 = r3
            r6.A04 = r10
            r6.A05 = r0
            r6.A08 = r4
            r6.A00 = r7
            r2 = r36
            java.lang.Object r1 = com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt.A00(r1, r2, r6)
            if (r1 != r5) goto L_0x0044
            return r5
        L_0x00b0:
            X.9Jj r6 = new X.9Jj
            r6.<init>(r8, r3)
            goto L_0x0021
        L_0x00b7:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager.A00(X.3NV, java.lang.String, java.util.List, X.4D7, boolean):java.lang.Object");
    }
}
