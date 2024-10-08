package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI;
import java.util.Set;

/* renamed from: X.R9l  reason: case insensitive filesystem */
public final class C8784R9l extends 2Cl {
    public final /* synthetic */ S4g A00;
    public final /* synthetic */ IGPaymentMethodsAPI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Set A04;

    public final int getRunnableId() {
        return 239;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        onSuccess(new 0eP("", ""));
    }

    public C8784R9l(S4g s4g, IGPaymentMethodsAPI iGPaymentMethodsAPI, String str, String str2, Set set) {
        this.A01 = iGPaymentMethodsAPI;
        this.A00 = s4g;
        this.A04 = set;
        this.A03 = str;
        this.A02 = str2;
    }

    /* renamed from: A00 */
    public final synchronized void onSuccess(0eP r20) {
        String str;
        synchronized (this) {
            0eP r9 = r20;
            0qQ.A0B(r9, 0);
            IGPaymentMethodsAPI iGPaymentMethodsAPI = this.A01;
            C2818759x r1 = iGPaymentMethodsAPI.A00;
            if (r1 != null) {
                r1.AOY(iGPaymentMethodsAPI.A02);
            }
            S4g s4g = this.A00;
            Set set = this.A04;
            String str2 = this.A03;
            String str3 = this.A02;
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            A042.A04("payment_type", iGPaymentMethodsAPI.A05);
            String str4 = (String) r9.A00;
            A042.A04("legacy_dev_pub_key", str4);
            boolean A1V = AnonymousClass7TF.A1V(str4);
            String str5 = (String) r9.A01;
            A042.A04("shared_dev_pub_key", str5);
            boolean A1V2 = AnonymousClass7TF.A1V(str5);
            19i A012 = 0jh.A04.A01(iGPaymentMethodsAPI.A03).A01(19f.A1o);
            if (A012 != null) {
                str = A012.A01;
            } else {
                str = null;
            }
            A042.A04("family_device_id", str);
            A042.A04("iab_session_id", str2);
            A042.A04("ad_id", str3);
            1vn r12 = iGPaymentMethodsAPI.A04;
            17k.A0E(A1V);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(A1V2), "IgFbPayPaymentMethodsQuery", A042.getParamsCopy(), A043.getParamsCopy(), C43299Bvz.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fbpay_account_extended", AnonymousClass7TE.A1C());
            AnonymousClass2hV r0 = C10125Rn2.A02;
            C8294Qna A002 = C8294Qna.A00(s4g, r12, pandoGraphQLRequest, new DGM(set, 2));
            iGPaymentMethodsAPI.A00 = A002;
            A002.A9U(iGPaymentMethodsAPI.A02);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r3 = X.AnonymousClass7TF.A0q(X.T0B.A00, r5);
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.0KC.A0I("com.fbpay.util.executor.Retry", X.002.A0O("Failed attempt# ", r8), r2);
        r3.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r8 >= r5) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0062, code lost:
        java.lang.Thread.sleep(X.AnonymousClass7TE.A0R(r7.invoke(java.lang.Integer.valueOf(r8))));
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        return X.AnonymousClass7TE.A1L(r4, X.Pxf.A0k("autofill_key"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r3.size() == r5) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
        r0 = (java.lang.Throwable) r3.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r0 = new X.C8984RKa(r3);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085 A[Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r9 = this;
            com.instagram.fbpay.paymentmethods.data.IGPaymentMethodsAPI r0 = r9.A01     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            com.instagram.common.session.UserSession r0 = r0.A03     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.String r8 = r0.A06     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            X.Szv r0 = X.C12611Szv.A00     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            X.0sP r7 = com.fbpay.util.executor.Retry.A00     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r6 = 0
            boolean r5 = X.AnonymousClass7TF.A1U(r6, r0, r7)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r4 = 0
        L_0x0014:
            java.lang.String r4 = X.Pxf.A0k(r8)     // Catch:{ all -> 0x0019 }
            goto L_0x003f
        L_0x0019:
            r2 = move-exception
            java.lang.String r0 = "Failed attempt# "
            java.lang.String r1 = X.002.A0O(r0, r4)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.String r0 = "com.fbpay.util.executor.Retry"
            X.0KC.A0I(r0, r1, r2)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r3.add(r2)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r4 >= r5) goto L_0x0078
            boolean r0 = r2 instanceof java.lang.Error     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r0 != 0) goto L_0x0078
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Object r0 = r7.invoke(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            long r0 = X.AnonymousClass7TE.A0R(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Thread.sleep(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r4 = 1
            goto L_0x0014
        L_0x003f:
            X.T0B r0 = X.T0B.A00     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0q(r0, r5)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r8 = 0
        L_0x0046:
            java.lang.String r0 = "autofill_key"
            java.lang.String r0 = X.Pxf.A0k(r0)     // Catch:{ all -> 0x004d }
            goto L_0x0073
        L_0x004d:
            r2 = move-exception
            java.lang.String r0 = "Failed attempt# "
            java.lang.String r1 = X.002.A0O(r0, r8)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.String r0 = "com.fbpay.util.executor.Retry"
            X.0KC.A0I(r0, r1, r2)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r3.add(r2)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r8 >= r5) goto L_0x008b
            boolean r0 = r2 instanceof java.lang.Error     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r0 != 0) goto L_0x008b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Object r0 = r7.invoke(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            long r0 = X.AnonymousClass7TE.A0R(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Thread.sleep(r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r8 = 1
            goto L_0x0046
        L_0x0073:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r4, r0)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            return r0
        L_0x0078:
            int r0 = r3.size()     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r0 != r5) goto L_0x0085
            java.lang.Object r0 = r3.get(r6)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            goto L_0x0097
        L_0x0085:
            X.RKa r0 = new X.RKa     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            goto L_0x0097
        L_0x008b:
            int r0 = r3.size()     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            if (r0 != r5) goto L_0x0098
            java.lang.Object r0 = r3.get(r6)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
        L_0x0097:
            throw r0     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
        L_0x0098:
            X.RKa r0 = new X.RKa     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            r0.<init>(r3)     // Catch:{ RuntimeException -> 0x00a7, Exception -> 0x00a5, all -> 0x009e }
            goto L_0x0097
        L_0x009e:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            r0 = move-exception
            throw r0
        L_0x00a7:
            r1 = move-exception
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8784R9l.call():java.lang.Object");
    }
}
