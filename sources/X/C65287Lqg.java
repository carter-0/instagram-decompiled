package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Lqg  reason: case insensitive filesystem */
public final class C65287Lqg implements C66486MTp {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C64821Lih A03;
    public final DirectShareTarget A04;
    public final C381779cJ A05;
    public final String A06;

    public /* synthetic */ C65287Lqg(Context context, AnonymousClass0iw r4, UserSession userSession, DirectShareTarget directShareTarget, C381779cJ r7, String str) {
        C64821Lih lih = (C64821Lih) userSession.A01(C64821Lih.class, C66259MKu.A00);
        C51972G9s.A1D(str, directShareTarget);
        0qQ.A0B(lih, 7);
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = str;
        this.A04 = directShareTarget;
        this.A05 = r7;
        this.A01 = r4;
        this.A03 = lih;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r10.A12() != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AIz(X.AnonymousClass3Q2 r18) {
        /*
            r17 = this;
            r16 = 0
            r10 = r18
            boolean r0 = r10.A0y()
            if (r0 != 0) goto L_0x0011
            boolean r0 = r10.A12()
            r9 = 0
            if (r0 == 0) goto L_0x0012
        L_0x0011:
            r9 = 1
        L_0x0012:
            X.1iA r0 = r10.A1G
            X.1iA r8 = X.1iA.A0a
            if (r0 != r8) goto L_0x002f
            java.lang.Integer r1 = X.AnonymousClass05K.A03
        L_0x001a:
            r4 = r17
            com.instagram.common.session.UserSession r3 = r4.A02
            com.instagram.model.direct.DirectShareTarget r2 = r4.A04
            com.instagram.model.direct.DirectThreadKey r0 = r2.A00()
            r14 = 0
            X.797 r11 = X.AnonymousClass796.A03(r3, r0, r1)
            X.Lih r7 = r4.A03
            java.lang.String r5 = r10.A3t
            monitor-enter(r7)
            goto L_0x0032
        L_0x002f:
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            goto L_0x001a
        L_0x0032:
            r6 = 1
            X.0qQ.A0B(r11, r6)     // Catch:{ all -> 0x0137 }
            r0 = 0
            if (r5 == 0) goto L_0x0047
            java.util.Map r1 = r7.A00     // Catch:{ all -> 0x0137 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0137 }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0137 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r0 = X.DbS.A0r(r11, r1)     // Catch:{ all -> 0x0137 }
        L_0x0047:
            monitor-exit(r7)
            X.3Q2 r12 = X.JTQ.A0M(r3, r0)
            if (r12 == 0) goto L_0x00ba
            if (r0 == 0) goto L_0x00ba
            r12.A5g = r6
        L_0x0052:
            X.7Zi r9 = X.C333527Zh.A00(r3)
            X.9cJ r11 = r4.A05
            X.0iw r0 = r4.A01
            java.lang.String r13 = r0.getModuleName()
            com.instagram.common.session.UserSession r0 = r9.A03
            X.2Dm r0 = X.1bJ.A00(r0)
            X.3U9 r0 = r0.BYf(r2)
            com.instagram.model.direct.DirectThreadKey r10 = X.AnonymousClass48N.A03(r0)
            r15 = r14
            android.util.Pair r5 = r9.A0C(r10, r11, r12, r13, r14, r15, r16)
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r3)
            android.content.Context r4 = r4.A00
            android.content.Context r0 = X.DbT.A05(r4)
            r1.A0B(r0)
            com.instagram.model.direct.DirectThreadKey r1 = r2.A00()
            X.1ua r0 = X.JTO.A0n(r4, r3)
            X.C64008LIv.A00(r3, r1, r12, r0)
            X.3t2 r0 = r2.A01()
            boolean r0 = X.AnonymousClass6W3.A08(r0)
            if (r0 == 0) goto L_0x00b9
            X.3t2 r0 = r2.A01()
            X.3sy r0 = X.AnonymousClass6W3.A06(r0)
            com.instagram.model.direct.DirectThreadKey r4 = X.C66647MaG.A03(r0)
            com.instagram.pendingmedia.model.constants.ShareType r1 = r12.A0E()
            X.1iA r0 = r12.A1G
            java.lang.String r2 = X.C63226KtX.A00(r0, r1)
            java.lang.Object r1 = r5.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r5.second
            X.0qQ.A06(r0)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            X.C3265677h.A0i(r3, r4, r2, r1, r0)
        L_0x00b9:
            return
        L_0x00ba:
            java.lang.String r5 = X.JTQ.A0Z()
            java.lang.String r12 = r10.A3t
            monitor-enter(r7)
            if (r12 == 0) goto L_0x00e6
            java.util.Map r1 = r7.A00     // Catch:{ all -> 0x0137 }
            java.lang.Object r0 = r1.get(r12)     // Catch:{ all -> 0x0137 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r0.get(r11)     // Catch:{ all -> 0x0137 }
            if (r0 != 0) goto L_0x00e6
            java.lang.Object r0 = r1.get(r12)     // Catch:{ all -> 0x0137 }
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00e6
            r0.put(r11, r5)     // Catch:{ all -> 0x0137 }
            goto L_0x00e6
        L_0x00df:
            java.util.HashMap r0 = X.Dba.A0f(r11, r5)     // Catch:{ all -> 0x0137 }
            r1.put(r12, r0)     // Catch:{ all -> 0x0137 }
        L_0x00e6:
            monitor-exit(r7)
            X.3Q2 r12 = X.AnonymousClass9T3.A00(r10, r5)
            r12.A6C = r9
            if (r9 == 0) goto L_0x00fe
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325733878084777(0x810e10000234a9, double:3.035878604265978E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0134
            r12.A53 = r6
        L_0x00fe:
            X.3QD r0 = X.AnonymousClass3QD.NOT_UPLOADED
            r12.A0b(r0)
            r12.A0N()
            r12.A5g = r6
            r12.A3u = r14
            android.content.Context r5 = r4.A00
            X.1iA r0 = r12.A1G
            if (r0 != r8) goto L_0x0131
            java.lang.Integer r1 = X.AnonymousClass05K.A03
        L_0x0112:
            com.instagram.model.direct.DirectThreadKey r0 = r2.A00()
            X.797 r0 = X.AnonymousClass796.A03(r3, r0, r1)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0124
            r12.A5D = r6
            r12.A53 = r6
        L_0x0124:
            boolean r1 = r12.A12()
            X.1ua r0 = X.JTO.A0n(r5, r3)
            X.JTQ.A1J(r12, r0, r1)
            goto L_0x0052
        L_0x0131:
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            goto L_0x0112
        L_0x0134:
            r12.A4x = r6
            goto L_0x00fe
        L_0x0137:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65287Lqg.AIz(X.3Q2):void");
    }

    public final String BbR() {
        return this.A06;
    }
}
