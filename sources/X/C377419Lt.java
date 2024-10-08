package X;

/* renamed from: X.9Lt  reason: invalid class name and case insensitive filesystem */
public final class C377419Lt extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377419Lt(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [X.RVp, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0689, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0168, code lost:
        r0 = X.182.A06(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x016c, code lost:
        if (r0 == false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0173, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0174, code lost:
        r0 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x06b0;
                case 1: goto L_0x004e;
                case 2: goto L_0x005f;
                case 3: goto L_0x006d;
                case 4: goto L_0x0082;
                case 5: goto L_0x0094;
                case 6: goto L_0x00a9;
                case 7: goto L_0x00eb;
                case 8: goto L_0x0101;
                case 9: goto L_0x0117;
                case 10: goto L_0x0135;
                case 11: goto L_0x0153;
                case 12: goto L_0x0176;
                case 13: goto L_0x01df;
                case 14: goto L_0x023b;
                case 15: goto L_0x024c;
                case 16: goto L_0x0282;
                case 17: goto L_0x0291;
                case 18: goto L_0x02a1;
                case 19: goto L_0x02b1;
                case 20: goto L_0x02c1;
                case 21: goto L_0x02d1;
                case 22: goto L_0x02e1;
                case 23: goto L_0x02f1;
                case 24: goto L_0x0300;
                case 25: goto L_0x0311;
                case 26: goto L_0x0351;
                case 27: goto L_0x0364;
                case 28: goto L_0x038d;
                case 29: goto L_0x039d;
                case 30: goto L_0x0005;
                case 31: goto L_0x0005;
                case 32: goto L_0x03ac;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x043a;
                case 36: goto L_0x0459;
                case 37: goto L_0x046f;
                case 38: goto L_0x049d;
                case 39: goto L_0x04b3;
                case 40: goto L_0x04d7;
                case 41: goto L_0x0521;
                case 42: goto L_0x0554;
                case 43: goto L_0x05cc;
                case 44: goto L_0x0626;
                case 45: goto L_0x063b;
                case 46: goto L_0x0669;
                case 47: goto L_0x067e;
                case 48: goto L_0x067e;
                case 49: goto L_0x068a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            java.util.List r2 = (java.util.List) r2
            r0 = 10
            int r0 = X.0Yv.A1E(r2, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x0019
            r1 = 16
        L_0x0019:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r1)
            java.util.Iterator r5 = r2.iterator()
        L_0x0022:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x06cd
            java.lang.Object r4 = r5.next()
            X.9Ir r4 = (X.C376619Ir) r4
            java.lang.String r1 = r4.A02
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r1.toUpperCase(r0)
            X.0qQ.A07(r3)
            X.3ll r2 = new X.3ll
            r2.<init>()
            int r0 = r4.A01
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "badge_value"
            r2.A05(r0, r1)
            r6.put(r3, r2)
            goto L_0x0022
        L_0x004e:
            java.lang.Object r8 = r12.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.Object r7 = r12.A01
            X.0iw r7 = (X.AnonymousClass0iw) r7
            r9 = 0
            X.326 r6 = new X.326
            r10 = r9
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x005f:
            java.lang.Object r1 = r12.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            X.2I2 r6 = new X.2I2
            r6.<init>(r1, r0)
            return r6
        L_0x006d:
            java.lang.Object r0 = r12.A02
            X.4Jm r0 = (X.C263194Jm) r0
            X.0eM r0 = r0.A01
            java.lang.Object r1 = r0.getValue()
            X.4Wj r1 = (X.AnonymousClass4Wj) r1
            java.lang.Object r0 = r12.A01
            X.1Xj r0 = (X.1Xj) r0
            X.9JD r6 = r1.A00(r0)
            return r6
        L_0x0082:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            com.facebook.litho.LithoView r6 = new com.facebook.litho.LithoView
            r6.<init>(r1, r0)
            java.lang.Object r0 = r12.A02
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r6)
            return r6
        L_0x0094:
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.7nv r6 = new X.7nv
            r6.<init>(r1, r0)
            return r6
        L_0x00a9:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r0 = "com.samsung.dressroom.intent.action.SHOW_LOCK_SHORTCUT_PICKER"
            r2.setAction(r0)
            android.content.Context r0 = r1.getApplicationContext()
            android.content.pm.PackageManager r1 = r0.getPackageManager()
            r0 = 131072(0x20000, float:1.83671E-40)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r2, r0)
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r12.A02
            X.7nv r1 = (X.C342027nv) r1
            X.0eM r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x016e
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x016c
        L_0x00eb:
            java.lang.Object r0 = r12.A02
            X.7nv r0 = (X.C342027nv) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r3 = r12.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321748148430510(0x810a70000226ae, double:3.033358012783374E-306)
            goto L_0x0168
        L_0x0101:
            java.lang.Object r0 = r12.A02
            X.7nv r0 = (X.C342027nv) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r3 = r12.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321748148561583(0x810a70000426af, double:3.033358012866265E-306)
            goto L_0x0168
        L_0x0117:
            java.lang.Object r0 = r12.A02
            X.7nv r0 = (X.C342027nv) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r3 = r12.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321748148299436(0x810a70000026ac, double:3.0333580127004825E-306)
            goto L_0x0168
        L_0x0135:
            java.lang.Object r0 = r12.A02
            X.7nv r0 = (X.C342027nv) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r3 = r12.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321748148364973(0x810a70000126ad, double:3.0333580127419283E-306)
            goto L_0x0168
        L_0x0153:
            java.lang.Object r0 = r12.A02
            X.7nv r0 = (X.C342027nv) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r3 = r12.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321748148627120(0x810a70000526b0, double:3.033358012907711E-306)
        L_0x0168:
            boolean r0 = X.182.A06(r2, r3, r0)
        L_0x016c:
            if (r0 == 0) goto L_0x0174
        L_0x016e:
            r0 = 1
        L_0x016f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x0174:
            r0 = 0
            goto L_0x016f
        L_0x0176:
            java.lang.Object r4 = r12.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            boolean r0 = r4 instanceof X.C227802jw
            if (r0 == 0) goto L_0x0687
            X.VeX r5 = X.AD2.A02
            X.AD2 r1 = r5.A00()
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0192
            X.02m r2 = r1.A01
            r1 = 77666176(0x4a11780, float:3.78725E-36)
            java.lang.String r0 = "background_work_start"
            r2.markerPoint(r1, r0)
        L_0x0192:
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.fragment.initialize.BackgroundInitializable"
            X.0qQ.A0C(r4, r0)     // Catch:{ all -> 0x01d0 }
            X.2jw r4 = (X.C227802jw) r4     // Catch:{ all -> 0x01d0 }
            java.lang.Object r0 = r12.A02     // Catch:{ all -> 0x01d0 }
            X.2jU r0 = (X.C227532jU) r0     // Catch:{ all -> 0x01d0 }
            r0.requireContext()     // Catch:{ all -> 0x01d0 }
            X.0eM r0 = r0.A05     // Catch:{ all -> 0x01d0 }
            java.lang.Object r3 = r0.getValue()     // Catch:{ all -> 0x01d0 }
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3     // Catch:{ all -> 0x01d0 }
            r0 = 1
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x01d0 }
            X.0Tu r2 = X.0Tu.A05     // Catch:{ all -> 0x01d0 }
            r0 = 36327829822126820(0x810ff800023ae4, double:3.037204087717855E-306)
            boolean r0 = X.182.A06(r2, r3, r0)     // Catch:{ all -> 0x01d0 }
            if (r0 == 0) goto L_0x01bc
            X.C227802jw.A04(r4)     // Catch:{ all -> 0x01d0 }
        L_0x01bc:
            X.AD2 r1 = r5.A00()
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0687
            X.02m r2 = r1.A01
            r1 = 77666176(0x4a11780, float:3.78725E-36)
            java.lang.String r0 = "background_work_end"
            r2.markerPoint(r1, r0)
            goto L_0x0687
        L_0x01d0:
            X.AD2 r3 = r5.A00()
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0687
            X.02m r2 = r3.A01
            r1 = 77666176(0x4a11780, float:3.78725E-36)
            r0 = 3
            goto L_0x0233
        L_0x01df:
            java.lang.Object r5 = r12.A02
            X.2jU r5 = (X.C227532jU) r5
            X.0hq r4 = r5.getChildFragmentManager()
            X.0qQ.A07(r4)
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x01f6
            X.2ju r0 = X.C227782ju.READY_TO_LOAD_ON_RESUME
            r5.A00 = r0
            goto L_0x0687
        L_0x01f6:
            X.0s1 r3 = new X.0s1
            r3.<init>(r4)
            r2 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            java.lang.Object r1 = r12.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            java.lang.String r0 = r5.A01
            r3.A0C(r1, r0, r2)
            r3.A00()
            r4.A0a()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            if (r1 == 0) goto L_0x0223
            X.0hq r0 = r5.getChildFragmentManager()
            X.C227672jj.A02(r1, r0)
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0223
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            r1.A0e()
        L_0x0223:
            X.VeX r0 = X.AD2.A02
            X.AD2 r3 = r0.A00()
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0687
            X.02m r2 = r3.A01
            r1 = 77666176(0x4a11780, float:3.78725E-36)
            r0 = 2
        L_0x0233:
            r2.markerEnd(r1, r0)
            r0 = 0
            r3.A00 = r0
            goto L_0x0687
        L_0x023b:
            java.lang.Object r1 = r12.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r12.A01
            X.02m r0 = (X.02m) r0
            X.0qQ.A0A(r0)
            X.2ln r6 = new X.2ln
            r6.<init>(r0, r1)
            return r6
        L_0x024c:
            java.lang.Object r3 = r12.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r1 = r12.A01
            X.4DU r1 = (X.AnonymousClass4DU) r1
            r0 = 0
            X.0qQ.A0B(r3, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.3KZ r0 = X.AnonymousClass3KY.A00
            boolean r0 = X.AnonymousClass3KZ.A00(r3)
            if (r0 != 0) goto L_0x0270
            boolean r0 = X.AnonymousClass3KZ.A01(r3)
            if (r0 != 0) goto L_0x0270
            X.5lZ r6 = new X.5lZ
            r6.<init>()
            return r6
        L_0x0270:
            X.5pn r2 = new X.5pn
            r2.<init>(r3, r1)
            X.2pc r1 = X.C230432pc.FEED
            X.5pp r0 = new X.5pp
            r0.<init>(r3, r2, r1)
            X.GMB r6 = new X.GMB
            r6.<init>(r3, r0)
            return r6
        L_0x0282:
            java.lang.Object r2 = r12.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r12.A01
            X.1L5 r1 = (X.1L5) r1
            r0 = 3
            X.IXy r6 = new X.IXy
            r6.<init>(r2, r1, r0)
            return r6
        L_0x0291:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2sJ r6 = new X.2sJ
            r6.<init>(r1, r0)
            return r6
        L_0x02a1:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            X.4DU r0 = r0.A01
            X.2s6 r6 = new X.2s6
            r6.<init>(r1, r0)
            return r6
        L_0x02b1:
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Object r0 = r12.A01
            X.2oC r0 = (X.C229782oC) r0
            com.instagram.mainfeed.unconnectedcontent.GroupSetBinderGroup r6 = new com.instagram.mainfeed.unconnectedcontent.GroupSetBinderGroup
            r6.<init>(r1, r0)
            return r6
        L_0x02c1:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2sV r6 = new X.2sV
            r6.<init>(r1, r0)
            return r6
        L_0x02d1:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2sW r6 = new X.2sW
            r6.<init>(r1, r0)
            return r6
        L_0x02e1:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            X.2rB r0 = (X.AnonymousClass2rB) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.2sX r6 = new X.2sX
            r6.<init>(r1, r0)
            return r6
        L_0x02f1:
            X.1V1 r2 = X.1V0.A06
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.io.File r6 = r2.A00(r1, r0)
            return r6
        L_0x0300:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            X.0qQ.A0A(r1)
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.84L r6 = new X.84L
            r6.<init>(r1, r0)
            return r6
        L_0x0311:
            java.lang.Object r4 = r12.A02
            X.2KI r4 = (X.2KI) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            boolean r0 = r3.A07()
            if (r0 != 0) goto L_0x0687
            java.lang.Object r2 = r12.A01
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r0 = 31
            X.MMW r1 = new X.MMW
            r1.<init>(r0, r2, r3)
            java.lang.Class<com.instagram.ml.remotepresence.RpModelDownloadManager> r0 = com.instagram.ml.remotepresence.RpModelDownloadManager.class
            java.lang.Object r0 = r3.A01(r0, r1)
            com.instagram.ml.remotepresence.RpModelDownloadManager r0 = (com.instagram.ml.remotepresence.RpModelDownloadManager) r0
            r4.A00 = r0
            X.12T r2 = X.AnonymousClass12T.A00
            r3 = 0
            r1 = 1599875106(0x5f5c2822, float:1.5863967E19)
            r0 = 3
            X.0nV r0 = r2.CO6(r1, r0)
            X.19S r2 = X.19E.A02(r0)
            r0 = 9
            X.Fy4 r1 = new X.Fy4
            r1.<init>(r4, r3, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r2)
            goto L_0x0687
        L_0x0351:
            java.lang.Object r3 = r12.A01
            X.1Ng r3 = (X.1Ng) r3
            java.lang.Object r2 = r12.A02
            r1 = 44
            X.MIy r0 = new X.MIy
            r0.<init>(r2, r1)
            X.2aj r6 = new X.2aj
            r6.<init>(r3, r0)
            return r6
        L_0x0364:
            java.lang.Object r7 = r12.A02
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.0Tu r2 = X.0Tu.A05
            r0 = 36604382766175277(0x820b7e0000142d, double:3.212097283123422E-306)
            long r0 = X.182.A01(r2, r7, r0)
            java.lang.Object r10 = r12.A01
            X.4HN r10 = (X.AnonymousClass4HN) r10
            r2 = 20
            X.3lq r11 = new X.3lq
            r11.<init>(r2, r0)
            X.4HS r8 = X.AnonymousClass4HR.A00(r7)
            X.4HT r9 = new X.4HT
            r9.<init>(r7)
            com.instagram.newsfeed.data.ActivityFeedRepository r6 = new com.instagram.newsfeed.data.ActivityFeedRepository
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x038d:
            java.lang.Object r0 = r12.A01
            X.2aX r0 = (X.2aX) r0
            java.util.List r1 = r0.A04
            r6 = 0
            if (r1 == 0) goto L_0x06cd
            X.5m8 r0 = X.C294245m8.A00
            java.util.LinkedHashMap r6 = X.2aV.A00(r1, r0)
            return r6
        L_0x039d:
            java.lang.Object r0 = r12.A01
            X.2aX r0 = (X.2aX) r0
            java.util.List r1 = r0.A04
            if (r1 == 0) goto L_0x0438
            X.GVz r0 = X.C52522GVz.A00
            java.util.LinkedHashMap r6 = X.2aV.A00(r1, r0)
            return r6
        L_0x03ac:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.Object r0 = r12.A01
            X.2aX r0 = (X.2aX) r0
            java.util.List r6 = r0.A04
            if (r6 == 0) goto L_0x0408
            X.0jq r1 = new X.0jq
            r1.<init>(r6)
            X.9Ut r0 = X.C379649Ut.A00
            X.3T1 r3 = X.C242173Sx.A09(r0, r1)
            X.9Uu r2 = X.C379659Uu.A00
            r0 = 7
            X.ArV r1 = new X.ArV
            r1.<init>((X.0sL) r2, (int) r0)
            X.9Us r0 = new X.9Us
            r0.<init>(r1, r3)
            r5 = 0
            java.util.Iterator r3 = r0.iterator()
        L_0x03d6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0408
            java.lang.Object r0 = r3.next()
            int r2 = r5 + 1
            if (r5 >= 0) goto L_0x03ec
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x03ec:
            X.2aX r0 = (X.2aX) r0
            X.2aE r1 = r0.A03
            if (r5 == 0) goto L_0x0405
            r0 = 1
            if (r5 == r0) goto L_0x0402
            r0 = 2
            if (r5 == r0) goto L_0x03ff
            X.5m6 r0 = X.C294225m6.NOT_SHOWN
        L_0x03fa:
            r4.put(r1, r0)
            r5 = r2
            goto L_0x03d6
        L_0x03ff:
            X.5m6 r0 = X.C294225m6.INDIVIDUAL_ORDERING_2
            goto L_0x03fa
        L_0x0402:
            X.5m6 r0 = X.C294225m6.INDIVIDUAL_ORDERING_1
            goto L_0x03fa
        L_0x0405:
            X.5m6 r0 = X.C294225m6.INDIVIDUAL_ORDERING_0
            goto L_0x03fa
        L_0x0408:
            if (r6 == 0) goto L_0x0438
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x0413:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x042c
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2aX r0 = (X.2aX) r0
            X.2aE r0 = r0.A03
            boolean r0 = r0.Akm()
            if (r0 == 0) goto L_0x0413
            r3.add(r1)
            goto L_0x0413
        L_0x042c:
            r1 = 16
            X.G4U r0 = new X.G4U
            r0.<init>(r4, r1)
            java.util.LinkedHashMap r6 = X.2aV.A00(r3, r0)
            return r6
        L_0x0438:
            r6 = 0
            return r6
        L_0x043a:
            X.2aD r3 = X.2aD.A0I
            java.lang.Object r0 = r12.A01
            X.2aX r0 = (X.2aX) r0
            int r2 = r0.A01
            int r0 = r0.A00
            int r2 = r2 + r0
            r1 = 0
            X.2aX r0 = new X.2aX
            r0.<init>(r3, r1, r2, r2)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r1)
            X.InA r0 = X.C58144InA.A00
            java.util.LinkedHashMap r6 = X.2aV.A00(r1, r0)
            return r6
        L_0x0459:
            java.lang.Object r0 = r12.A02
            X.9EU r0 = (X.AnonymousClass9EU) r0
            X.9ET r3 = r0.A04
            com.instagram.common.session.UserSession r2 = r0.A03
            java.lang.Object r1 = r12.A01
            X.0sP r1 = (X.0sP) r1
            X.AeR r0 = new X.AeR
            r0.<init>(r1)
            r3.A00(r2, r0)
            goto L_0x0687
        L_0x046f:
            java.lang.Object r4 = r12.A01
            X.0lg r4 = (X.0lg) r4
            java.lang.Object r1 = r12.A02
            X.94m r1 = (X.C3732194m) r1
            X.0eM r0 = r1.A05
            java.lang.Object r3 = r0.getValue()
            X.0eM r0 = r1.A02
            java.lang.Object r2 = r0.getValue()
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r0 = 2
            X.0qQ.A0B(r2, r0)
            r0 = 37
            X.Iw4 r1 = new X.Iw4
            r1.<init>((int) r0, (java.lang.Object) r2, (java.lang.Object) r4, (java.lang.Object) r3)
            java.lang.Class<X.LB6> r0 = X.LB6.class
            java.lang.Object r6 = r4.A01(r0, r1)
            return r6
        L_0x049d:
            java.lang.Object r1 = r12.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r12.A02
            X.94m r0 = (X.C3732194m) r0
            X.0eM r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.94O r0 = (X.AnonymousClass94O) r0
            X.A7I r6 = new X.A7I
            r6.<init>(r0, r1)
            return r6
        L_0x04b3:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.94d r0 = X.C3731294c.A00(r0)
            X.94X r3 = r0.A00
            java.lang.Object r2 = r12.A02
            X.94m r2 = (X.C3732194m) r2
            X.0eM r0 = r2.A04
            java.lang.Object r1 = r0.getValue()
            X.94O r1 = (X.AnonymousClass94O) r1
            X.0eM r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.AT7 r0 = (X.AT7) r0
            X.A6P r6 = new X.A6P
            r6.<init>(r0, r3, r1)
            return r6
        L_0x04d7:
            X.1L7 r1 = X.1L7.A01()
            X.0qQ.A07(r1)
            X.3zl r0 = new X.3zl
            r0.<init>(r1)
            X.2jB r0 = r0.A00()
            X.3zm r2 = new X.3zm
            r2.<init>(r0)
            java.lang.Object r0 = r12.A02
            X.94q r0 = (X.C3732594q) r0
            X.0eM r1 = r0.A00
            java.lang.Object r7 = r1.getValue()
            X.0qQ.A07(r7)
            X.0JP r7 = (X.AnonymousClass0JP) r7
            X.0eM r0 = r0.A01
            java.lang.Object r11 = r0.getValue()
            X.5kn r11 = (X.C293475kn) r11
            java.lang.Object r10 = r12.A01
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.94d r0 = X.C3731294c.A00(r10)
            X.94X r9 = r0.A00
            java.lang.Object r0 = r1.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            X.3zp r8 = new X.3zp
            r8.<init>(r0, r2)
            X.AD6 r6 = new X.AD6
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L_0x0521:
            java.lang.Object r5 = r12.A02
            X.94o r5 = (X.C3732394o) r5
            X.0eM r1 = r5.A04
            java.lang.Object r0 = r1.getValue()
            X.94P r0 = (X.AnonymousClass94P) r0
            X.AT5 r4 = new X.AT5
            r4.<init>(r0)
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zc r3 = X.C258763zb.A00(r0)
            java.lang.Object r2 = r1.getValue()
            X.94P r2 = (X.AnonymousClass94P) r2
            X.0eM r0 = r5.A02
            java.lang.Object r1 = r0.getValue()
            X.3zi r1 = (X.C258833zi) r1
            java.util.List r0 = java.util.Collections.singletonList(r4)
            X.0qQ.A07(r0)
            X.407 r6 = r3.A00(r1, r2, r0)
            return r6
        L_0x0554:
            java.lang.Object r0 = r12.A02
            X.94o r0 = (X.C3732394o) r0
            X.0eM r1 = r0.A04
            java.lang.Object r0 = r1.getValue()
            X.94P r0 = (X.AnonymousClass94P) r0
            boolean r0 = r0.CaD()
            if (r0 == 0) goto L_0x057f
            java.lang.Object r2 = r1.getValue()
            X.94P r2 = (X.AnonymousClass94P) r2
            X.RVp r1 = new X.RVp
            r1.<init>()
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.S4A r0 = X.C9265RVq.A00(r0)
            X.So9 r6 = new X.So9
            r6.<init>(r1, r0, r2)
            return r6
        L_0x057f:
            X.FAX r3 = new X.FAX
            r3.<init>()
            java.lang.Object r0 = r1.getValue()
            X.94P r0 = (X.AnonymousClass94P) r0
            long r4 = r0.BTh()
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x059c
            X.0sP r0 = r3.A01
        L_0x0596:
            X.ATA r6 = new X.ATA
            r6.<init>(r0)
            return r6
        L_0x059c:
            r1 = 2
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05a5
            X.0sP r0 = r3.A02
            goto L_0x0596
        L_0x05a5:
            r1 = 3
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05ae
            X.0sP r0 = r3.A03
            goto L_0x0596
        L_0x05ae:
            r1 = 4
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05b7
            X.0sP r0 = r3.A04
            goto L_0x0596
        L_0x05b7:
            r1 = 5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05c0
            X.0sP r0 = r3.A05
            goto L_0x0596
        L_0x05c0:
            r1 = 6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x05c9
            X.0sP r0 = r3.A06
            goto L_0x0596
        L_0x05c9:
            X.0sP r0 = r3.A00
            goto L_0x0596
        L_0x05cc:
            X.1L7 r1 = X.1L7.A01()
            X.0qQ.A07(r1)
            X.3zl r0 = new X.3zl
            r0.<init>(r1)
            X.2jB r0 = r0.A00()
            X.3zm r3 = new X.3zm
            r3.<init>(r0)
            java.lang.Object r2 = r12.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r12.A02
            X.94o r0 = (X.C3732394o) r0
            X.0eM r1 = r0.A00
            java.lang.Object r5 = r1.getValue()
            X.0qQ.A07(r5)
            X.0eM r0 = r0.A04
            java.lang.Object r7 = r0.getValue()
            X.94d r0 = X.C3731294c.A00(r2)
            X.94X r8 = r0.A00
            java.lang.Object r0 = r1.getValue()
            X.0qQ.A07(r0)
            X.0JP r0 = (X.AnonymousClass0JP) r0
            X.3zp r6 = new X.3zp
            r6.<init>(r0, r3)
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            r0 = 3
            X.0qQ.A0B(r8, r0)
            r4 = 12
            X.Iw8 r3 = new X.Iw8
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Class<X.A6s> r0 = X.C39727A6s.class
            java.lang.Object r6 = r2.A01(r0, r3)
            return r6
        L_0x0626:
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.37j r6 = new X.37j
            r6.<init>(r1, r0)
            return r6
        L_0x063b:
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            X.0qQ.A0A(r1)
            java.lang.Object r2 = r12.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.12T r0 = X.AnonymousClass12T.A00
            X.1ua r6 = new X.1ua
            r6.<init>(r1, r0, r2)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r1 = X.28E.A00(r2)
            X.381 r0 = new X.381
            r0.<init>(r2, r6)
            r1.A06(r0)
            X.4Cq r3 = r6.A0A
            r2 = 0
            r0 = 31
            X.9Jr r1 = new X.9Jr
            r1.<init>(r6, r2, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r3)
            return r6
        L_0x0669:
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r12.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2Nn r6 = new X.2Nn
            r6.<init>(r1, r0)
            return r6
        L_0x067e:
            java.lang.Object r1 = r12.A01
            X.70J r1 = (X.AnonymousClass70J) r1
            X.Df5 r0 = X.C46443Df5.FOLLOWERS
            r1.A05(r0)
        L_0x0687:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x068a:
            java.lang.Object r0 = r12.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0696
            java.lang.Object r6 = r0.invoke()
            if (r6 != 0) goto L_0x06cd
        L_0x0696:
            java.lang.Object r0 = r12.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x06ad
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x06ad
            X.2YQ r6 = r1.getDefaultViewModelCreationExtras()
            return r6
        L_0x06ad:
            X.2YP r6 = X.AnonymousClass2YP.A00
            return r6
        L_0x06b0:
            java.lang.Object r0 = r12.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.2n4 r0 = X.C229232n3.A00(r0)
            X.1Bk r1 = r0.A00()
            java.lang.Object r0 = r12.A02
            X.2zF r0 = (X.C235082zF) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.326 r0 = (X.AnonymousClass326) r0
            X.H8T r6 = new X.H8T
            r6.<init>(r1, r0)
        L_0x06cd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377419Lt.invoke():java.lang.Object");
    }
}
