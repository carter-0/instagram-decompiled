package X;

/* renamed from: X.PhZ  reason: case insensitive filesystem */
public final class C73660PhZ extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73660PhZ(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v8, types: [X.0g9, com.instagram.leadads.activity.LeadAdsActivity, android.app.Activity] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011d, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0183, code lost:
        if (r1.A01() != 0) goto L_0x0185;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r3 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r3 != null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        return "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0212;
                case 1: goto L_0x020b;
                case 2: goto L_0x0005;
                case 3: goto L_0x01fe;
                case 4: goto L_0x0212;
                case 5: goto L_0x020b;
                case 6: goto L_0x0005;
                case 7: goto L_0x01ee;
                case 8: goto L_0x01e1;
                case 9: goto L_0x01d4;
                case 10: goto L_0x0026;
                case 11: goto L_0x01c4;
                case 12: goto L_0x01af;
                case 13: goto L_0x0212;
                case 14: goto L_0x020b;
                case 15: goto L_0x0005;
                case 16: goto L_0x0015;
                case 17: goto L_0x019f;
                case 18: goto L_0x000c;
                case 19: goto L_0x0195;
                case 20: goto L_0x018b;
                case 21: goto L_0x0174;
                case 22: goto L_0x0212;
                case 23: goto L_0x020b;
                case 24: goto L_0x0005;
                case 25: goto L_0x014d;
                case 26: goto L_0x0143;
                case 27: goto L_0x0136;
                case 28: goto L_0x011e;
                case 29: goto L_0x0114;
                case 30: goto L_0x010c;
                case 31: goto L_0x00f6;
                case 32: goto L_0x00ed;
                case 33: goto L_0x00ca;
                case 34: goto L_0x00c1;
                case 35: goto L_0x009a;
                case 36: goto L_0x0084;
                case 37: goto L_0x007b;
                case 38: goto L_0x0067;
                case 39: goto L_0x0212;
                case 40: goto L_0x020b;
                case 41: goto L_0x0005;
                case 42: goto L_0x0212;
                case 43: goto L_0x020b;
                case 44: goto L_0x0005;
                case 45: goto L_0x0051;
                case 46: goto L_0x003f;
                case 47: goto L_0x0212;
                case 48: goto L_0x020b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.A01
            X.07f r3 = X.DbY.A0I(r0)
        L_0x000b:
            return r3
        L_0x000c:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "viewer_session_id"
            goto L_0x001d
        L_0x0015:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "tray_session_id"
        L_0x001d:
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L_0x000b
            java.lang.String r3 = ""
            return r3
        L_0x0026:
            java.lang.Object r0 = r10.A01
            android.os.Bundle r1 = X.DbS.A0B(r0)
            java.lang.String r0 = "entry_point"
            java.lang.String r1 = r1.getString(r0)
            if (r1 == 0) goto L_0x0215
            java.util.Map r0 = X.C69406Nkk.A01
            java.lang.Object r3 = r0.get(r1)
            if (r3 != 0) goto L_0x000b
            X.Nkk r3 = X.C69406Nkk.NOTIFICATION
            return r3
        L_0x003f:
            java.lang.Object r2 = r10.A01
            X.4DH r2 = (X.AnonymousClass4DH) r2
            android.os.Bundle r1 = r2.requireArguments()
            android.content.Context r0 = r2.requireContext()
            X.U8K r3 = new X.U8K
            r3.<init>(r0, r1, r2, r2)
            return r3
        L_0x0051:
            java.lang.Object r0 = r10.A01
            X.Ume r0 = (X.C15997Ume) r0
            java.lang.String r1 = "lead_ad_question_page"
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.UnQ r0 = (X.C16037UnQ) r0
            X.WYW r0 = r0.A05
            X.UhB r3 = new X.UhB
            r3.<init>(r0, r1)
            return r3
        L_0x0067:
            java.lang.Object r2 = r10.A01
            com.instagram.leadads.activity.LeadAdsActivity r2 = (com.instagram.leadads.activity.LeadAdsActivity) r2
            X.0eM r0 = r2.A0A
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            android.os.Bundle r0 = X.DbU.A06(r2)
            X.JfR r3 = new X.JfR
            r3.<init>(r0, r2, r1)
            return r3
        L_0x007b:
            java.lang.Object r0 = r10.A01
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.07f r3 = r0.getViewModelStore()
            return r3
        L_0x0084:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r10.A01
            android.app.Activity r0 = (android.app.Activity) r0
            android.os.Bundle r0 = X.DbU.A06(r0)
            if (r0 == 0) goto L_0x0095
            com.instagram.common.session.UserSession r3 = r1.A06(r0)
            return r3
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x009a:
            java.lang.Object r5 = r10.A01
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.0wc r4 = X.AnonymousClass0kN.A02(r5)
            X.0wX r0 = X.C61170le.A00
            X.0xm r7 = X.AnonymousClass0xl.A00(r0)
            X.1Av r8 = X.1Au.A00(r5)
            X.2JA r1 = X.2J9.A04
            java.lang.String r0 = r5.A06
            X.2J9 r6 = r1.A00(r0)
            r0 = 34
            X.PhZ r9 = new X.PhZ
            r9.<init>(r5, r0)
            X.4qG r3 = new X.4qG
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00c1:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            android.content.Context r3 = X.C51966G9m.A0P(r0)
            return r3
        L_0x00ca:
            java.lang.Object r4 = r10.A01
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            r0 = 30
            X.PhZ r5 = new X.PhZ
            r5.<init>(r4, r0)
            X.2Ic r6 = X.C70032Ic.A00
            X.2Id r7 = X.C70042Id.A00
            r0 = 31
            X.PhZ r8 = new X.PhZ
            r8.<init>(r4, r0)
            r0 = 32
            X.PhZ r9 = new X.PhZ
            r9.<init>(r4, r0)
            X.2Ia r3 = new X.2Ia
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x00ed:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3EA r3 = X.AnonymousClass3E9.A00(r0)
            return r3
        L_0x00f6:
            java.lang.Object r2 = r10.A01
            X.0lg r2 = (X.0lg) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 35
            X.PhZ r1 = new X.PhZ
            r1.<init>(r2, r0)
            java.lang.Class<X.4qG> r0 = X.C275424qG.class
            java.lang.Object r3 = r2.A01(r0, r1)
            return r3
        L_0x010c:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1ZL.A00(r0)
            goto L_0x011b
        L_0x0114:
            java.lang.Object r0 = r10.A01
            android.app.Service r0 = (android.app.Service) r0
            r0.stopSelf()
        L_0x011b:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x011e:
            java.lang.Object r0 = r10.A01
            X.OCW r0 = (X.OCW) r0
            android.content.Context r2 = r0.A00
            java.lang.String r1 = "IgBgFetchMetadataStorage"
            r0 = 0
            android.content.SharedPreferences r1 = r2.getSharedPreferences(r1, r0)
            X.0qQ.A0A(r1)
            java.lang.String r0 = "IgBgFetchMetadataStorageImpl"
            X.0tX r3 = new X.0tX
            r3.<init>(r1, r0)
            return r3
        L_0x0136:
            java.lang.Object r0 = r10.A01
            X.OEJ r0 = (X.OEJ) r0
            android.content.Context r1 = r0.A00
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r3 = r1.getSystemService(r0)
            return r3
        L_0x0143:
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            X.OEJ r3 = new X.OEJ
            r3.<init>(r0)
            return r3
        L_0x014d:
            java.lang.Object r2 = r10.A01
            X.E5S r2 = (X.E5S) r2
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto L_0x0172
            android.content.Context r1 = r0.getApplicationContext()
        L_0x015b:
            r0 = 29
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            android.app.Application r1 = (android.app.Application) r1
            X.0eM r0 = r2.A01
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEz r3 = new X.EEz
            r3.<init>(r1, r0)
            return r3
        L_0x0172:
            r1 = 0
            goto L_0x015b
        L_0x0174:
            java.lang.Object r1 = r10.A01
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            int r0 = r1.A00()
            if (r0 != 0) goto L_0x0185
            int r1 = r1.A01()
            r0 = 1
            if (r1 == 0) goto L_0x0186
        L_0x0185:
            r0 = 0
        L_0x0186:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x018b:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyE r3 = new X.OyE
            r3.<init>(r0)
            return r3
        L_0x0195:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oy7 r3 = new X.Oy7
            r3.<init>(r0)
            return r3
        L_0x019f:
            java.lang.Object r0 = r10.A01
            X.NJ9 r0 = (X.NJ9) r0
            X.0eM r0 = r0.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.NMo r3 = new X.NMo
            r3.<init>(r0)
            return r3
        L_0x01af:
            java.lang.Object r2 = r10.A01
            X.NJ9 r2 = (X.NJ9) r2
            X.0eM r0 = r2.A09
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.328 r0 = new X.328
            r0.<init>(r2)
            X.32A r3 = new X.32A
            r3.<init>(r2, r1, r0)
            return r3
        L_0x01c4:
            java.lang.Object r1 = r10.A01
            X.NJ9 r1 = (X.NJ9) r1
            X.0eM r0 = r1.A09
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.OKs r3 = new X.OKs
            r3.<init>(r1, r0)
            return r3
        L_0x01d4:
            java.lang.Object r0 = r10.A01
            X.OTK r0 = (X.OTK) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r1)
            return r3
        L_0x01e1:
            java.lang.Object r0 = r10.A01
            X.OKs r0 = (X.C70772OKs) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            X.0iw r0 = r0.A00
            X.0wc r3 = X.AnonymousClass0kN.A01(r0, r1)
            return r3
        L_0x01ee:
            java.lang.Object r0 = r10.A01
            X.K7T r0 = (X.K7T) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KCr r3 = new X.KCr
            r3.<init>(r0)
            return r3
        L_0x01fe:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r10.A01
            com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository r0 = (com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            com.instagram.user.model.User r3 = r1.A01(r0)
            return r3
        L_0x020b:
            java.lang.Object r0 = r10.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x0212:
            java.lang.Object r3 = r10.A01
            return r3
        L_0x0215:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73660PhZ.invoke():java.lang.Object");
    }
}
