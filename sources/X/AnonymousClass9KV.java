package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.sdk.IGSlotFetcher;
import java.util.List;

/* renamed from: X.9KV  reason: invalid class name */
public final class AnonymousClass9KV extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06 = 0;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KV(Activity activity, 0wc r3, UserSession userSession, C247733gp r5, 1Xj r6, C342997pV r7, C40698AhI ahI, Integer num, List list, AnonymousClass4D7 r11, boolean z) {
        super(2, r11);
        this.A03 = r6;
        this.A09 = r5;
        this.A01 = list;
        this.A04 = num;
        this.A0A = userSession;
        this.A0B = z;
        this.A05 = r3;
        this.A02 = r7;
        this.A07 = activity;
        this.A08 = ahI;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9KV, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.9KV, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r16) {
        AnonymousClass4D7 r12 = r16;
        if (this.A06 != 0) {
            C247733gp r6 = (C247733gp) this.A09;
            Integer num = (Integer) this.A04;
            UserSession userSession = (UserSession) this.A0A;
            boolean z = this.A0B;
            0wc r4 = (0wc) this.A05;
            C342997pV r8 = (C342997pV) this.A02;
            return new AnonymousClass9KV((Activity) this.A07, r4, userSession, r6, (1Xj) this.A03, r8, (C40698AhI) this.A08, num, (List) this.A01, r12, z);
        }
        return new AnonymousClass9KV((AnonymousClass9J8) this.A08, (IGSlotFetcher) this.A0A, (AnonymousClass42R) this.A09, r12, (0sP) this.A07, this.A0B);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KV) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: X.1Hj} */
    /* JADX WARNING: type inference failed for: r13v0, types: [X.9KV, X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0150 A[Catch:{ all -> 0x0178 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r13 = r16
            r1 = r17
            int r0 = r13.A06
            X.1Hj r3 = X.1Hj.A02
            if (r0 == 0) goto L_0x00cb
            int r2 = r13.A00
            r4 = 1
            r0 = 0
            if (r2 == 0) goto L_0x0087
            if (r2 != r4) goto L_0x00c3
            X.0eS.A00(r1)
        L_0x0015:
            X.7dS r1 = (X.C335737dS) r1
            boolean r2 = X.C335747dT.A03(r1)
            if (r2 == 0) goto L_0x004b
            java.lang.Integer r7 = X.C335747dT.A00(r1)
            if (r7 == 0) goto L_0x003d
            java.lang.Object r6 = r13.A03
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r4 = r13.A09
            X.3gp r4 = (X.C247733gp) r4
            boolean r3 = r13.A0B
            java.lang.Object r5 = r13.A05
            X.0wc r5 = (X.0wc) r5
            if (r4 == 0) goto L_0x0049
            java.lang.String r2 = r4.A0G
            java.lang.String r0 = r4.A0F
        L_0x0037:
            r8 = r2
            r9 = r0
            r10 = r3
            X.1Yp.A01(r5, r6, r7, r8, r9, r10)
        L_0x003d:
            java.lang.Object r0 = r13.A02
            X.7pV r0 = (X.C342997pV) r0
            if (r0 == 0) goto L_0x0046
            r0.EuW(r1)
        L_0x0046:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0049:
            r2 = r0
            goto L_0x0037
        L_0x004b:
            java.lang.Object r8 = r13.A07
            android.app.Activity r8 = (android.app.Activity) r8
            if (r8 == 0) goto L_0x0046
            java.lang.Object r6 = r13.A03
            X.1Xj r6 = (X.1Xj) r6
            java.lang.Object r5 = r13.A09
            X.3gp r5 = (X.C247733gp) r5
            java.lang.Object r4 = r13.A0A
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r9 = r13.A05
            X.0wc r9 = (X.0wc) r9
            java.lang.Object r3 = r13.A08
            X.AhI r3 = (X.C40698AhI) r3
            boolean r2 = r8.isFinishing()
            if (r2 != 0) goto L_0x0046
            boolean r2 = r8.isDestroyed()
            if (r2 != 0) goto L_0x0046
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r7 = X.C335077cL.A00()
            if (r5 == 0) goto L_0x0085
            java.lang.String r2 = r5.A0G
            java.lang.String r0 = r5.A0F
        L_0x007b:
            r10 = r4
            r11 = r6
            r12 = r3
            r13 = r1
            r14 = r2
            r15 = r0
            r7.A03(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0046
        L_0x0085:
            r2 = r0
            goto L_0x007b
        L_0x0087:
            X.0eS.A00(r1)
            com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl r5 = X.C335077cL.A00()
            java.lang.Object r8 = r13.A03
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r1 = r13.A09
            X.3gp r1 = (X.C247733gp) r1
            if (r1 == 0) goto L_0x00c1
            java.lang.String r10 = r1.A0G
        L_0x009a:
            if (r1 == 0) goto L_0x00bf
            java.lang.String r11 = r1.A0F
        L_0x009e:
            java.lang.Object r2 = r13.A01
            java.util.List r2 = (java.util.List) r2
            r1 = 100
            java.util.List r12 = X.00k.A0h(r2, r1)
            java.lang.Object r9 = r13.A04
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.Object r7 = r13.A0A
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            boolean r14 = r13.A0B
            java.lang.Object r6 = r13.A05
            X.0wc r6 = (X.0wc) r6
            r13.A00 = r4
            java.lang.Enum r1 = r5.A01(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r1 != r3) goto L_0x0015
            return r3
        L_0x00bf:
            r11 = r0
            goto L_0x009e
        L_0x00c1:
            r10 = r0
            goto L_0x009a
        L_0x00c3:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00cb:
            int r0 = r13.A00
            r6 = 0
            r9 = 2
            r4 = 1
            if (r0 == 0) goto L_0x00ec
            if (r0 == r4) goto L_0x0114
            java.lang.Object r4 = r13.A05
            X.0sP r4 = (X.0sP) r4
            java.lang.Object r2 = r13.A04
            X.42R r2 = (X.AnonymousClass42R) r2
            java.lang.Object r5 = r13.A03
            com.instagram.quickpromotion.sdk.IGSlotFetcher r5 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r5
            java.lang.Object r8 = r13.A02
            X.9J8 r8 = (X.AnonymousClass9J8) r8
            java.lang.Object r7 = r13.A01
            X.136 r7 = (X.136) r7
            X.0eS.A00(r1)
            goto L_0x013c
        L_0x00ec:
            X.0eS.A00(r1)
            java.lang.Object r2 = r13.A08
            X.9J8 r2 = (X.AnonymousClass9J8) r2
            java.lang.String r0 = "coroutine_start"
            X.4Vt r1 = new X.4Vt
            r1.<init>(r2, r0)
            java.lang.Object r0 = r13.A07
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            java.lang.Object r2 = r13.A0A
            com.instagram.quickpromotion.sdk.IGSlotFetcher r2 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r2
            java.lang.Object r1 = r13.A09
            X.42R r1 = (X.AnonymousClass42R) r1
            boolean r0 = r13.A0B
            r13.A00 = r4
            java.lang.Object r0 = com.instagram.quickpromotion.sdk.IGSlotFetcher.A01(r2, r1, r13, r0)
            if (r0 != r3) goto L_0x0117
            return r3
        L_0x0114:
            X.0eS.A00(r1)
        L_0x0117:
            java.lang.Object r5 = r13.A0A
            com.instagram.quickpromotion.sdk.IGSlotFetcher r5 = (com.instagram.quickpromotion.sdk.IGSlotFetcher) r5
            X.136 r7 = r5.A06
            java.lang.Object r8 = r13.A08
            X.9J8 r8 = (X.AnonymousClass9J8) r8
            java.lang.Object r2 = r13.A09
            X.42R r2 = (X.AnonymousClass42R) r2
            java.lang.Object r4 = r13.A07
            X.0sP r4 = (X.0sP) r4
            r13.A01 = r7
            r13.A02 = r8
            r13.A03 = r5
            r13.A04 = r2
            r13.A05 = r4
            r13.A00 = r9
            java.lang.Object r0 = X.136.A00(r13, r7)
            if (r0 != r3) goto L_0x013c
            return r3
        L_0x013c:
            java.lang.String r1 = "inside_lock"
            X.4Vt r0 = new X.4Vt     // Catch:{ all -> 0x0178 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0178 }
            r4.invoke(r0)     // Catch:{ all -> 0x0178 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0178 }
            r5.A00 = r0     // Catch:{ all -> 0x0178 }
            java.util.Set r1 = r5.A05     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0178 }
            if (r0 != 0) goto L_0x0152
            java.lang.String r0 = "empty_trigger_context"
        L_0x0152:
            r1.add(r0)     // Catch:{ all -> 0x0178 }
            X.4Vy r2 = r5.A02     // Catch:{ all -> 0x0178 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0178 }
            r2.A00 = r0     // Catch:{ all -> 0x0178 }
            com.instagram.quickpromotion.sdk.IGSlotFetcher.A02(r8, r5, r4)     // Catch:{ all -> 0x0178 }
            X.0gF r3 = X.C60340gF.A00     // Catch:{ all -> 0x0178 }
            r7.A05(r6)
            java.lang.Object r2 = r13.A08
            X.9J8 r2 = (X.AnonymousClass9J8) r2
            java.lang.String r0 = "lock_complete"
            X.4Vt r1 = new X.4Vt
            r1.<init>(r2, r0)
            java.lang.Object r0 = r13.A07
            X.0sP r0 = (X.0sP) r0
            r0.invoke(r1)
            return r3
        L_0x0178:
            r0 = move-exception
            r7.A05(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KV(AnonymousClass9J8 r2, IGSlotFetcher iGSlotFetcher, AnonymousClass42R r4, AnonymousClass4D7 r5, 0sP r6, boolean z) {
        super(2, r5);
        this.A08 = r2;
        this.A0A = iGSlotFetcher;
        this.A09 = r4;
        this.A0B = z;
        this.A07 = r6;
    }
}
