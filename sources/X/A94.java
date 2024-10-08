package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

public final class A94 {
    public final AnonymousClass1B0 A00;
    public final UserSession A01;
    public final 1vn A02;
    public final Map A03 = AnonymousClass7TE.A1H();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Map A05 = AnonymousClass7TE.A1H();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.1XU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.1Ef r20, X.2IR r21, X.C3727492g r22, X.1P0 r23, java.lang.String r24, X.0sP r25) {
        /*
            r19 = this;
            r3 = 0
            r5 = r24
            X.0qQ.A0B(r5, r3)
            X.AWX r13 = new X.AWX
            r15 = r19
            r14 = r21
            r16 = r23
            r18 = r25
            r17 = r5
            r13.<init>(r14, r15, r16, r17, r18)
            r7 = r22
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x009a
            long r0 = r7.A00
            java.util.Map r2 = r15.A04
            java.lang.Object r4 = r2.get(r5)
            boolean r2 = r4 instanceof X.AnonymousClass3JC
            r6 = 0
            if (r2 == 0) goto L_0x006d
            X.3JC r4 = (X.AnonymousClass3JC) r4
        L_0x002a:
            java.util.Map r2 = r15.A05
            java.lang.Object r8 = r2.get(r5)
            boolean r2 = r8 instanceof X.1XU
            if (r2 == 0) goto L_0x0037
            r6 = r8
            X.1XU r6 = (X.1XU) r6
        L_0x0037:
            r12 = 1
            if (r6 == 0) goto L_0x006f
            boolean r2 = r13.A02
            if (r2 == 0) goto L_0x006f
            long r10 = android.os.SystemClock.uptimeMillis()
            long r8 = r6.AjP()
            long r10 = r10 - r8
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0051
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x006f
        L_0x0051:
            java.util.List r0 = r13.A01
            java.util.Iterator r1 = r0.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r1.next()
            X.1P0 r0 = (X.1P0) r0
            r0.onSuccessInBackground(r6)
            r0.onFinish()
            r0.onSuccess(r6)
            goto L_0x0057
        L_0x006d:
            r4 = r6
            goto L_0x002a
        L_0x006f:
            if (r4 == 0) goto L_0x009a
            long r10 = android.os.SystemClock.uptimeMillis()
            long r8 = r4.AjP()
            long r10 = r10 - r8
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0084
            r8 = -1
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
        L_0x0084:
            java.util.List r0 = r13.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x008a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r1.next()
            X.2IR r0 = (X.2IR) r0
            r0.onSuccess(r4)
            goto L_0x008a
        L_0x009a:
            r12 = 0
        L_0x009b:
            java.util.Map r4 = r15.A03
            java.lang.Object r6 = r4.get(r5)
            X.AWX r6 = (X.AWX) r6
            if (r6 == 0) goto L_0x00eb
            java.util.List r2 = r6.A00
            java.util.List r1 = r13.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.google.common.util.concurrent.FutureCallback<com.instagram.graphql.network.IGGraphQLResult<T of com.instagram.api.prefetch.graphql.IgGraphQLPrefetchableExecutor.RequestCallbackHandler>>>"
            X.0qQ.A0C(r1, r0)
            java.util.List r0 = X.0u4.A01(r1)
            r2.addAll(r0)
            java.util.List r2 = r6.A01
            java.util.List r1 = r13.A01
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.common.api.base.ApiCallback<U of com.instagram.api.prefetch.graphql.IgGraphQLPrefetchableExecutor.RequestCallbackHandler, U of com.instagram.api.prefetch.graphql.IgGraphQLPrefetchableExecutor.RequestCallbackHandler>>"
            X.0qQ.A0C(r1, r0)
            java.util.List r0 = X.0u4.A01(r1)
            r2.addAll(r0)
            r0 = 1
        L_0x00c6:
            if (r12 != 0) goto L_0x00ea
            if (r0 != 0) goto L_0x00ea
            boolean r0 = r7.A02
            r6 = r20
            r6.setRequestPurpose(r0)
            boolean r0 = r4.containsKey(r5)
            if (r0 != 0) goto L_0x00da
            r4.put(r5, r13)
        L_0x00da:
            X.1vn r2 = r15.A02
            r0 = 2
            X.LbE r1 = new X.LbE
            r1.<init>(r13, r0)
            X.ASf r0 = new X.ASf
            r0.<init>(r13, r3)
            r2.ATL(r0, r1, r6)
        L_0x00ea:
            return
        L_0x00eb:
            r0 = 0
            goto L_0x00c6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A94.A00(X.1Ef, X.2IR, X.92g, X.1P0, java.lang.String, X.0sP):void");
    }

    public A94(AnonymousClass1B0 r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = 1vm.A01(userSession);
    }
}
