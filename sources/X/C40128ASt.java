package X;

/* renamed from: X.ASt  reason: case insensitive filesystem */
public final class C40128ASt implements AnonymousClass2Kv {
    public final /* synthetic */ C39745A7l A00;

    public C40128ASt(C39745A7l a7l) {
        this.A00 = a7l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r5 != null) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r5 != null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068 A[Catch:{ JSONException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071 A[Catch:{ JSONException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097 A[Catch:{ JSONException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5 A[Catch:{ JSONException -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r5 = r8.Bny()
            X.3lr r5 = (X.C250663lr) r5
            r4 = 1
            if (r5 == 0) goto L_0x0057
            java.lang.Class<X.9ez> r3 = X.C383079ez.class
            r2 = 0
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.3lr r1 = r5.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "eligible_for_waffle_wfs"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
            if (r0 != r4) goto L_0x0057
            X.9rr r6 = X.C390799rr.FXAccountItemEligibilityEligible
        L_0x0023:
            java.lang.Class<X.9ez> r2 = X.C383079ez.class
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.3lr r1 = r5.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = "eligible_for_waffle_nta"
            boolean r0 = r1.getCoercedBooleanField(r4, r0)
            if (r0 != r4) goto L_0x005c
            X.9rr r3 = X.C390799rr.FXAccountItemEligibilityEligible
        L_0x003a:
            java.lang.Class<X.9ez> r2 = X.C383079ez.class
            java.lang.String r1 = "fx_waffle_wfs_and_nta_eligibility"
            r0 = -435543782(0xffffffffe60a211a, float:-1.630743E23)
            X.3lr r2 = r5.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x0061
            r1 = 2
            java.lang.String r0 = "super_eligible_for_waffle_nta"
            boolean r0 = r2.getCoercedBooleanField(r1, r0)
            if (r0 != r4) goto L_0x0061
            X.9rr r1 = X.C390799rr.FXAccountItemEligibilityEligible
        L_0x0052:
            X.A7l r5 = r7.A00
            java.lang.String r4 = "FXIGAccessLibrarySSOAndRegFlagAppJob"
            goto L_0x0064
        L_0x0057:
            X.9rr r6 = X.C390799rr.FXAccountItemEligibilityIneligible
            if (r5 == 0) goto L_0x005c
            goto L_0x0023
        L_0x005c:
            X.9rr r3 = X.C390799rr.FXAccountItemEligibilityIneligible
            if (r5 == 0) goto L_0x0061
            goto L_0x003a
        L_0x0061:
            X.9rr r1 = X.C390799rr.FXAccountItemEligibilityIneligible
            goto L_0x0052
        L_0x0064:
            boolean r0 = r5.A06     // Catch:{ JSONException -> 0x00b9 }
            if (r0 != 0) goto L_0x006d
            org.json.JSONObject r0 = r5.A04     // Catch:{ JSONException -> 0x00b9 }
            X.C375849Fk.A02(r6, r0)     // Catch:{ JSONException -> 0x00b9 }
        L_0x006d:
            boolean r0 = r5.A05     // Catch:{ JSONException -> 0x00b9 }
            if (r0 != 0) goto L_0x0079
            org.json.JSONObject r0 = r5.A04     // Catch:{ JSONException -> 0x00b9 }
            X.C375849Fk.A00(r3, r0)     // Catch:{ JSONException -> 0x00b9 }
            X.C375849Fk.A01(r1, r0)     // Catch:{ JSONException -> 0x00b9 }
        L_0x0079:
            org.json.JSONObject r3 = r5.A04     // Catch:{ JSONException -> 0x00b9 }
            java.lang.String r2 = "timestamp"
            long r0 = r5.A00     // Catch:{ JSONException -> 0x00b9 }
            r3.put(r2, r0)     // Catch:{ JSONException -> 0x00b9 }
            X.1Uk r0 = r5.A01     // Catch:{ JSONException -> 0x00b9 }
            X.1W3 r2 = r0.AR0()     // Catch:{ JSONException -> 0x00b9 }
            java.lang.String r1 = "sso_settings_v2"
            java.lang.String r0 = r3.toString()     // Catch:{ JSONException -> 0x00b9 }
            r2.A09(r1, r0)     // Catch:{ JSONException -> 0x00b9 }
            boolean r0 = r2.A0B()     // Catch:{ JSONException -> 0x00b9 }
            if (r0 == 0) goto L_0x00b1
            X.9Fk r0 = r5.A02     // Catch:{ JSONException -> 0x00b9 }
            com.instagram.common.session.UserSession r3 = r0.A00     // Catch:{ JSONException -> 0x00b9 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ JSONException -> 0x00b9 }
            r0 = 36324935014101489(0x810d56000131f1, double:3.0353733994661794E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ JSONException -> 0x00b9 }
            if (r0 == 0) goto L_0x00b1
            X.0wX r0 = r3.A03     // Catch:{ JSONException -> 0x00b9 }
            android.content.Context r0 = r0.A06()     // Catch:{ JSONException -> 0x00b9 }
            X.C49963FGw.A05(r0)     // Catch:{ JSONException -> 0x00b9 }
        L_0x00b1:
            X.B2L r0 = r5.A03     // Catch:{ JSONException -> 0x00b9 }
            if (r0 == 0) goto L_0x00bf
            r0.onSuccess()     // Catch:{ JSONException -> 0x00b9 }
            return
        L_0x00b9:
            r1 = move-exception
            java.lang.String r0 = "Failed saving sso settings"
            X.0KC.A0F(r4, r0, r1)
        L_0x00bf:
            return
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40128ASt.invoke(X.3JD):void");
    }
}
