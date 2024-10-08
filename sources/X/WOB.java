package X;

public final class WOB implements X3J {
    public final int A00;
    public final Object A01;

    public WOB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012c, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0133, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0149, code lost:
        X.WGT.A00(r5, r4, r1, r0.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x014e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onComplete() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0058;
                case 1: goto L_0x011a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.UZd r0 = (X.C15275UZd) r0
            androidx.fragment.app.FragmentActivity r4 = r0.requireActivity()
            com.instagram.common.session.UserSession r6 = X.C15275UZd.A03(r0)
            java.lang.String r1 = r0.A08
            if (r1 == 0) goto L_0x010f
            java.lang.String r5 = r0.A0B
            if (r5 == 0) goto L_0x0107
            X.0eM r0 = r0.A0G
            X.WGU r0 = X.C13990Tnq.A0M(r0)
            java.lang.String r3 = r0.A03
            r0 = 1
            android.os.Bundle r2 = X.DbV.A0B(r6, r0)
            java.lang.String r0 = "paymentAccountID"
            r2.putString(r0, r1)
            java.lang.String r1 = "wizardName"
            java.lang.String r0 = "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION"
            r2.putString(r1, r0)
            java.lang.String r1 = "placement"
            java.lang.String r0 = "ig_boost"
            r2.putString(r1, r0)
            java.lang.String r0 = "paymentMethodID"
            X.T8B r1 = X.C13991Tnr.A0T(r2, r6, r0, r5, r3)
            r0 = 2131970538(0x7f1349ea, float:1.957803E38)
            java.lang.String r0 = r4.getString(r0)
            r1.A07 = r0
            r1.A00(r2)
            java.lang.String r0 = "BillingWizardIGRoute"
            r1.A01(r0)
            X.6Yo r0 = r1.F08(r4)
            r0.A04()
        L_0x0057:
            return
        L_0x0058:
            java.lang.Object r3 = r8.A01
            X.UaP r3 = (X.C15317UaP) r3
            java.lang.String r1 = r3.A02
            if (r1 != 0) goto L_0x0064
            java.lang.String r0 = "previousStep"
            goto L_0x012c
        L_0x0064:
            X.UzE r0 = X.C16678UzE.PROMOTE_PREVALIDATION_LOADING
            boolean r0 = X.JTQ.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0095
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            com.instagram.common.session.UserSession r4 = r3.A01
            if (r4 == 0) goto L_0x0117
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            X.U8O r0 = (X.U8O) r0
            java.lang.String r2 = "update_account_spend_limit_before_prevalidation"
            X.W1k r1 = r0.A00
            X.UzE r0 = X.C16678UzE.UPDATE_ACCOUNT_SPEND_LIMIT
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.A03(r0, r2)
            X.0qQ.A07(r1)
            X.0eM r0 = r3.A03
            X.WGU r0 = X.C13990Tnq.A0M(r0)
            goto L_0x0149
        L_0x0095:
            X.UzE r0 = X.C16678UzE.SUMMARY
            boolean r0 = X.JTQ.A1Y(r0, r1)
            if (r0 != 0) goto L_0x00a5
            X.UzE r0 = X.C16678UzE.BOOST_PACKAGES
            boolean r0 = X.JTQ.A1Y(r0, r1)
            if (r0 == 0) goto L_0x0057
        L_0x00a5:
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            com.instagram.common.session.UserSession r7 = r3.A01
            if (r7 == 0) goto L_0x0117
            X.0eM r5 = r3.A04
            java.lang.Object r0 = r5.getValue()
            X.U8O r0 = (X.U8O) r0
            java.lang.String r2 = "update_account_spend_limit_before_boost"
            X.W1k r1 = r0.A00
            X.UzE r0 = X.C16678UzE.UPDATE_ACCOUNT_SPEND_LIMIT
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r1.A03(r0, r2)
            X.0qQ.A07(r4)
            X.0eM r0 = r3.A03
            X.WGU r0 = X.C13990Tnq.A0M(r0)
            java.lang.String r3 = r0.A03
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r1 = "entryPoint"
            java.lang.String r0 = "instagram"
            r2.putString(r1, r0)
            java.lang.String r0 = "paymentAccountID"
            X.T8B r1 = X.C13991Tnr.A0T(r2, r7, r0, r4, r3)
            r0 = 2131970259(0x7f1348d3, float:1.9577464E38)
            java.lang.String r0 = r6.getString(r0)
            r1.A07 = r0
            r1.A00(r2)
            java.lang.String r0 = "BillingASLDisplayIGRoute"
            r1.A01(r0)
            X.6Yo r1 = r1.F08(r6)
            r0 = 0
            r1.A0D = r0
            r1.A04()
            java.lang.Object r0 = r5.getValue()
            X.U8O r0 = (X.U8O) r0
            com.instagram.business.promote.model.PromoteData r1 = r0.A01
            r0 = 1
            r1.A2A = r0
            return
        L_0x0107:
            java.lang.String r1 = "payment method ID is non-null for DD flow"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x010f:
            java.lang.String r1 = "ad account ID is non-null for DD flow"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0117:
            java.lang.String r0 = "session"
            goto L_0x012c
        L_0x011a:
            java.lang.Object r3 = r8.A01
            X.UaV r3 = (X.C15323UaV) r3
            androidx.fragment.app.FragmentActivity r5 = r3.requireActivity()
            com.instagram.common.session.UserSession r4 = r3.getSession()
            X.W1k r2 = r3.A04
            if (r2 != 0) goto L_0x0134
            java.lang.String r0 = "promoteDataFetcher"
        L_0x012c:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0134:
            X.UzE r0 = X.C16678UzE.BUDGET_DURATION
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "ad_account_budget_limit_warning"
            java.lang.String r1 = r2.A03(r1, r0)
            X.0qQ.A07(r1)
            X.0eM r0 = r3.A0T
            X.WGU r0 = X.C13990Tnq.A0M(r0)
        L_0x0149:
            java.lang.String r0 = r0.A03
            X.WGT.A00(r5, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WOB.onComplete():void");
    }
}
