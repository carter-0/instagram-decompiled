package X;

/* renamed from: X.9KI  reason: invalid class name */
public final class AnonymousClass9KI extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KI(Object obj, Object obj2, Object obj3, AnonymousClass4D7 r5, int i, boolean z) {
        super(2, r5);
        this.A01 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A05 = z;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9KI, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        Object obj2;
        Object obj3;
        boolean z;
        Object obj4;
        int i;
        AnonymousClass4D7 r4 = r9;
        switch (this.A01) {
            case 0:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 0;
                break;
            case 1:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 1;
                break;
            case 2:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 2;
                break;
            case 3:
                obj3 = this.A03;
                obj4 = this.A04;
                obj2 = this.A02;
                z = this.A05;
                i = 3;
                break;
            case 4:
                obj4 = this.A04;
                obj3 = this.A03;
                obj2 = this.A02;
                z = this.A05;
                i = 4;
                break;
            case 5:
                obj2 = this.A02;
                obj3 = this.A03;
                z = this.A05;
                obj4 = this.A04;
                i = 5;
                break;
            default:
                obj4 = this.A04;
                z = this.A05;
                obj2 = this.A02;
                obj3 = this.A03;
                i = 6;
                break;
        }
        return new AnonymousClass9KI(obj4, obj3, obj2, r4, i, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KI) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9KI, X.4D7] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0129 A[LOOP:0: B:20:0x010f->B:27:0x0129, LOOP_END] */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r2 = r19
            r5 = r20
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x0205;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x0050;
                case 4: goto L_0x02d4;
                case 5: goto L_0x0028;
                case 6: goto L_0x0223;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r6 = 1
            if (r0 != 0) goto L_0x03b6
            X.0eS.A00(r5)
            java.lang.Object r5 = r2.A04
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r5 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r5
            java.lang.Object r4 = r2.A03
            java.lang.Object r3 = r2.A02
            X.42S r3 = (X.AnonymousClass42S) r3
            boolean r0 = r2.A05
            r2.A00 = r6
            java.lang.Object r0 = com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A00(r3, r5, r4, r2, r0)
        L_0x0025:
            if (r0 != r1) goto L_0x03b9
            return r1
        L_0x0028:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r4 = 1
            if (r0 != 0) goto L_0x03b6
            X.0eS.A00(r5)
            r3 = 742(0x2e6, float:1.04E-42)
            X.0nL r0 = new X.0nL
            r0.<init>(r3)
            java.lang.Object r6 = r2.A02
            java.lang.Object r7 = r2.A03
            boolean r11 = r2.A05
            java.lang.Object r8 = r2.A04
            r9 = 0
            r10 = 13
            X.JTf r5 = new X.JTf
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.A00 = r4
            java.lang.Object r0 = X.1Eo.A00(r2, r0, r5)
            goto L_0x0025
        L_0x0050:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r11 = 1
            if (r0 != 0) goto L_0x03b6
            X.0eS.A00(r5)
            java.lang.Object r0 = r2.A03
            X.0r1 r0 = (X.0r1) r0
            r0.A00 = r11
            java.lang.Object r7 = r2.A04
            X.8BQ r7 = (X.AnonymousClass8BQ) r7
            java.lang.Object r8 = r2.A02
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            boolean r0 = r2.A05
            r18 = r0
            r2.A00 = r11
            r9 = 0
            X.0qQ.A0B(r8, r9)
            X.TqF r3 = new X.TqF
            r3.<init>(r8)
            r0 = 32
            r3.A00 = r0
            X.TqI r5 = r3.A00()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r5.A02
            java.util.List r4 = java.util.Collections.unmodifiableList(r0)
            X.0qQ.A07(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.VsL r14 = X.C18469VsL.A06
            java.util.Map r13 = r5.A04
            java.lang.Object r15 = r13.get(r14)
            r17 = 0
            X.TqH r15 = (X.C14122TqH) r15
            X.VsL r12 = X.C18469VsL.A04
            java.lang.Object r10 = r13.get(r12)
            X.TqH r10 = (X.C14122TqH) r10
            X.VsL r5 = X.C18469VsL.A08
            java.lang.Object r0 = r13.get(r5)
            r16 = 2
            X.TqH r0 = (X.C14122TqH) r0
            X.TqH[] r0 = new X.C14122TqH[]{r15, r10, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r3.addAll(r0)
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0138
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0138
        L_0x00c5:
            int r3 = r4.size()
            r0 = 7
            if (r3 < r0) goto L_0x017d
            if (r17 == 0) goto L_0x017d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r3.addAll(r4)
            X.MPI r10 = X.MPI.A00
            r4 = 5
            X.ArV r0 = new X.ArV
            r0.<init>((X.0sL) r10, (int) r4)
            X.01V.A1D(r3, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r13.get(r12)
            r12 = 0
            X.TqH r0 = (X.C14122TqH) r0
            java.lang.Object r15 = r13.get(r5)
            X.TqH r15 = (X.C14122TqH) r15
            java.lang.Object r14 = r13.get(r14)
            X.TqH r14 = (X.C14122TqH) r14
            r5 = 3
            r13 = 0
            X.TqH[] r0 = new X.C14122TqH[]{r0, r15, r14, r13}
            java.util.List r13 = X.0sr.A1P(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r13)
            java.util.Iterator r14 = r0.iterator()
            X.0qQ.A07(r14)
        L_0x010f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r0 = r14.next()
            X.TqH r0 = (X.C14122TqH) r0
            if (r0 == 0) goto L_0x012d
            int r0 = r0.A05
        L_0x011f:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.contains(r13)
            if (r0 != 0) goto L_0x012d
            r10.add(r13)
            goto L_0x010f
        L_0x012d:
            java.lang.Object r0 = r3.get(r12)
            X.TqH r0 = (X.C14122TqH) r0
            int r0 = r0.A05
            int r12 = r12 + 1
            goto L_0x011f
        L_0x0138:
            java.util.Iterator r3 = r3.iterator()
        L_0x013c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c5
            java.lang.Object r0 = r3.next()
            if (r0 == 0) goto L_0x013c
            r17 = 1
            goto L_0x00c5
        L_0x014c:
            java.util.Iterator r15 = r10.iterator()
        L_0x0150:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r0 = r15.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float[] r3 = new float[r5]
            android.graphics.Color.colorToHSV(r0, r3)
            r0 = r3[r11]
            r14 = r3[r16]
            double r3 = (double) r0
            r12 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x017d
            double r3 = (double) r14
            r12 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0150
        L_0x017d:
            r8.recycle()
            X.12T r0 = X.AnonymousClass12T.A00
            X.4CZ r5 = r0.A04
            r4 = 0
            X.9K8 r3 = new X.9K8
            r0 = r18
            r3.<init>(r7, r6, r4, r0)
            java.lang.Object r0 = X.1Eo.A00(r2, r5, r3)
            if (r0 == r1) goto L_0x0025
            X.0gF r0 = X.C60340gF.A00
            goto L_0x0025
        L_0x0196:
            X.Azv r3 = X.C41766Azv.A00
            X.ArV r0 = new X.ArV
            r0.<init>((X.0sL) r3, (int) r4)
            X.01V.A1D(r10, r0)
            boolean r0 = r10 instanceof java.util.Collection
            if (r0 == 0) goto L_0x014c
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x014c
        L_0x01aa:
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r3, r3, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            r6.addAll(r0)
            r6.addAll(r10)
            java.util.List r0 = r10.subList(r9, r5)
            java.util.Iterator r11 = r0.iterator()
        L_0x01cb:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r11.next()
            X.0qQ.A07(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float[] r10 = new float[r5]
            int r4 = android.graphics.Color.red(r0)
            int r3 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            android.graphics.Color.RGBToHSV(r4, r3, r0, r10)
            r3 = r10[r9]
            r0 = 1127481344(0x43340000, float:180.0)
            float r3 = r3 + r0
            r0 = 1135869952(0x43b40000, float:360.0)
            float r3 = r3 % r0
            r10[r9] = r3
            int r0 = android.graphics.Color.HSVToColor(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.add(r0)
            goto L_0x01cb
        L_0x0205:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r6 = 1
            if (r0 != 0) goto L_0x03b6
            X.0eS.A00(r5)
            java.lang.Object r5 = r2.A04
            com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache r5 = (com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache) r5
            java.lang.Object r4 = r2.A03
            java.lang.Object r3 = r2.A02
            X.42S r3 = (X.AnonymousClass42S) r3
            boolean r0 = r2.A05
            r2.A00 = r6
            java.lang.Object r0 = com.facebook.quickpromotion.sdk.fetcher.ondemand.OnDemandSurfaceTriggerCache.A01(r3, r5, r4, r2, r0)
            goto L_0x0025
        L_0x0223:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r6 = 1
            if (r0 == 0) goto L_0x02b3
            X.0eS.A00(r5)
        L_0x022d:
            java.lang.Object r5 = r2.A04
            X.6we r5 = (X.C322936we) r5
            java.lang.Object r3 = r2.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r2.A03
            X.3Ia r0 = (X.C239753Ia) r0
            com.instagram.api.schemas.IGUserHighlightsTrayType r1 = r0.A01
            com.instagram.api.schemas.IGUserHighlightsTrayType r0 = com.instagram.api.schemas.IGUserHighlightsTrayType.DEFAULT
            if (r1 == r0) goto L_0x0240
            r6 = 0
        L_0x0240:
            com.instagram.common.session.UserSession r7 = r5.A0A
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324110380379961(0x810c9600012f39, double:3.0348518977801516E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x03a7
            r0 = 36324110380445498(0x810c9600022f3a, double:3.0348518978215974E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x03a7
            X.1Av r0 = X.1Au.A00(r7)
            X.0xa r1 = r0.A01
            r0 = 1401(0x579, float:1.963E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 != 0) goto L_0x03a7
            if (r6 == 0) goto L_0x03a7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r3.iterator()
        L_0x027b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0301
            java.lang.Object r7 = r8.next()
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            int r1 = r6.size()
            r0 = 3
            if (r1 >= r0) goto L_0x0301
            boolean r0 = r7.A0l()
            if (r0 != 0) goto L_0x027b
            java.lang.String r0 = r7.A0r
            if (r0 == 0) goto L_0x027b
            com.instagram.common.typedurl.SimpleImageUrl r0 = r7.A08()
            if (r0 == 0) goto L_0x027b
            java.lang.String r3 = r7.A0r
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x02ce
            com.instagram.common.typedurl.SimpleImageUrl r1 = r7.A08()
            if (r1 == 0) goto L_0x02c8
            X.0eP r0 = new X.0eP
            r0.<init>(r3, r1)
            r6.add(r0)
            goto L_0x027b
        L_0x02b3:
            X.0eS.A00(r5)
            java.lang.Object r0 = r2.A04
            X.6we r0 = (X.C322936we) r0
            com.instagram.archive.data.HighlightsSettingsRepository r4 = r0.A08
            boolean r3 = r2.A05
            r2.A00 = r6
            r0 = 0
            java.lang.Object r0 = r4.A03(r2, r3, r6, r0)
            if (r0 != r1) goto L_0x022d
            return r1
        L_0x02c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x02ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r2)
            throw r0
        L_0x02d4:
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x02df
            X.0eS.A00(r5)
            return r5
        L_0x02df:
            X.0eS.A00(r5)
            java.lang.Object r0 = r2.A04
            X.1bC r0 = (X.1bC) r0
            X.2E4 r4 = r0.A05
            java.lang.Object r5 = r2.A03
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r6 = r2.A02
            java.util.List r6 = (java.util.List) r6
            boolean r8 = r2.A05
            r2.A00 = r3
            r7 = 0
            X.9KN r3 = new X.9KN
            r3.<init>((X.2E4) r4, (java.util.List) r5, (java.util.List) r6, (X.AnonymousClass4D7) r7, (boolean) r8)
            java.lang.Object r5 = X.19E.A00(r2, r3)
            if (r5 != r1) goto L_0x03a9
            return r1
        L_0x0301:
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03a7
            com.instagram.profile.fragment.UserDetailFragment r3 = r5.A0C
            android.content.Context r1 = r3.requireContext()
            r0 = 0
            androidx.compose.ui.platform.ComposeView r7 = new androidx.compose.ui.platform.ComposeView
            r7.<init>(r1, r0, r4)
            X.GTZ r0 = X.GTZ.A00
            r7.setViewCompositionStrategy(r0)
            r2 = -255826723(0xfffffffff0c064dd, float:-4.7634446E29)
            r1 = 43
            X.JG2 r0 = new X.JG2
            r0.<init>(r1, r6, r5)
            X.5PJ r0 = X.AnonymousClass5PI.A03(r0, r2)
            r7.setContent(r0)
            android.app.Activity r0 = r5.A05
            X.8ab r6 = new X.8ab
            r6.<init>((android.app.Activity) r0)
            r0 = 2131963409(0x7f132e11, float:1.956357E38)
            java.lang.String r0 = r3.getString(r0)
            r6.A05 = r0
            r6.A0k(r7)
            android.view.View r1 = r6.A02
            X.C71362ch.A01(r1, r3)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.A01(r1, r3)
            X.C71372cj.A01(r1, r3)
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            if (r0 == 0) goto L_0x03b0
            r2 = -1
            r0.width = r2
            r1.setLayoutParams(r0)
            android.view.ViewGroup r1 = r6.A0V
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            if (r0 == 0) goto L_0x03aa
            r0.width = r2
            r1.setLayoutParams(r0)
            r0 = 2131963410(0x7f132e12, float:1.9563573E38)
            java.lang.String r2 = r3.getString(r0)
            X.0qQ.A07(r2)
            r1 = 11
            X.FJg r0 = new X.FJg
            r0.<init>(r5, r1)
            r6.A0c(r0, r2)
            r0 = 2131963408(0x7f132e10, float:1.9563569E38)
            java.lang.String r2 = r3.getString(r0)
            X.0qQ.A07(r2)
            r1 = 12
            X.FJg r0 = new X.FJg
            r0.<init>(r5, r1)
            r6.A0a(r0, r2)
            r0 = 2131963407(0x7f132e0f, float:1.9563567E38)
            java.lang.String r0 = r3.getString(r0)
            r6.A0q(r0)
            r6.A0r(r4)
            android.view.View r3 = r3.requireView()
            X.Akx r2 = new X.Akx
            r2.<init>(r6)
            r0 = 100
            r3.postDelayed(r2, r0)
        L_0x03a7:
            X.0gF r5 = X.C60340gF.A00
        L_0x03a9:
            return r5
        L_0x03aa:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x03b0:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r7)
            throw r0
        L_0x03b6:
            X.0eS.A00(r5)
        L_0x03b9:
            X.0gF r1 = X.C60340gF.A00
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KI.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
