package X;

/* renamed from: X.Phb  reason: case insensitive filesystem */
public final class C73662Phb extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73662Phb(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.NdD} */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.Object, X.KSB] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01ba, code lost:
        r3.A0B(r4, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (X.1Av.A07(r5, "friend_map_create_note_tooltip_shown_timestamp", 3) != false) goto L_0x0035;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x008f;
                case 1: goto L_0x009f;
                case 2: goto L_0x0005;
                case 3: goto L_0x00b2;
                case 4: goto L_0x00f0;
                case 5: goto L_0x0005;
                case 6: goto L_0x00fc;
                case 7: goto L_0x0111;
                case 8: goto L_0x0005;
                case 9: goto L_0x011a;
                case 10: goto L_0x0131;
                case 11: goto L_0x0143;
                case 12: goto L_0x01f5;
                case 13: goto L_0x0202;
                case 14: goto L_0x020c;
                case 15: goto L_0x0216;
                case 16: goto L_0x0220;
                case 17: goto L_0x022a;
                case 18: goto L_0x0234;
                case 19: goto L_0x023e;
                case 20: goto L_0x0248;
                case 21: goto L_0x0252;
                case 22: goto L_0x025c;
                case 23: goto L_0x0266;
                case 24: goto L_0x0270;
                case 25: goto L_0x027a;
                case 26: goto L_0x0284;
                case 27: goto L_0x028e;
                case 28: goto L_0x0298;
                case 29: goto L_0x02a2;
                case 30: goto L_0x02ac;
                case 31: goto L_0x014e;
                case 32: goto L_0x015d;
                case 33: goto L_0x019b;
                case 34: goto L_0x02b6;
                case 35: goto L_0x01ef;
                case 36: goto L_0x02c1;
                case 37: goto L_0x02e6;
                case 38: goto L_0x01bf;
                case 39: goto L_0x02f4;
                case 40: goto L_0x0304;
                case 41: goto L_0x0313;
                case 42: goto L_0x034d;
                case 43: goto L_0x0357;
                case 44: goto L_0x0361;
                case 45: goto L_0x0361;
                case 46: goto L_0x01e6;
                case 47: goto L_0x0370;
                case 48: goto L_0x037f;
                case 49: goto L_0x01f2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r9 = r10.A01
            X.NdD r9 = (X.C69028NdD) r9
            com.instagram.common.session.UserSession r7 = r9.A02
            X.1Av r5 = X.1Au.A00(r7)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321769624708838(0x810a75001826e6, double:3.033371594468267E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 != 0) goto L_0x0035
            X.0s0 r1 = r5.A1K
            X.0YZ[] r6 = X.1Av.A8a
            r0 = 501(0x1f5, float:7.02E-43)
            int r0 = X.DbY.A03(r5, r1, r6, r0)
            long r2 = (long) r0
            r0 = 3
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0056
            java.lang.String r2 = "friend_map_create_note_tooltip_shown_timestamp"
            boolean r0 = X.1Av.A07(r5, r2, r0)
            if (r0 == 0) goto L_0x0056
        L_0x0035:
            X.PH5 r2 = X.PH5.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.A0Q(r2, r0)
            X.0s0 r1 = r5.A1K
            X.0YZ[] r6 = X.1Av.A8a
            r0 = 501(0x1f5, float:7.02E-43)
            X.DbZ.A1b(r5, r1, r6, r0)
            long r3 = java.lang.System.currentTimeMillis()
            X.0s0 r2 = r5.A1J
            r0 = 502(0x1f6, float:7.03E-43)
            r1 = r6[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
        L_0x0056:
            X.1Av r5 = X.1Au.A00(r7)
            X.0s0 r8 = r5.A1S
            r7 = 503(0x1f7, float:7.05E-43)
            int r0 = X.DbY.A03(r5, r8, r6, r7)
            long r3 = (long) r0
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            java.lang.String r0 = "friend_map_settings_tooltip_shown_timestamp"
            boolean r0 = X.1Av.A07(r5, r0, r1)
            if (r0 == 0) goto L_0x008c
            X.PH6 r2 = X.PH6.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            r9.A0Q(r2, r0)
            X.DbZ.A1b(r5, r8, r6, r7)
            long r3 = java.lang.System.currentTimeMillis()
            X.0s0 r2 = r5.A1T
            r0 = 504(0x1f8, float:7.06E-43)
            r1 = r6[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r2.Epx(r5, r0, r1)
        L_0x008c:
            X.0gF r3 = X.C60340gF.A00
        L_0x008e:
            return r3
        L_0x008f:
            java.lang.Object r0 = r10.A01
            X.NdD r0 = (X.C69028NdD) r0
            X.Ody r3 = r0.A03
            X.HOc r2 = X.C54671HOc.FINAL_REMINDER_NUX
            java.lang.String r1 = "NUX_PROCEED"
            java.lang.String r0 = "TAP"
            X.C71144Ody.A02(r2, r3, r1, r0)
            goto L_0x008c
        L_0x009f:
            java.lang.Object r1 = r10.A01
            X.NdD r1 = (X.C69028NdD) r1
            r3 = 0
            r5 = 1
            android.location.Location r0 = X.C69028NdD.A03(r1)
            r2 = 1097859072(0x41700000, float:15.0)
            r6 = 0
            r7 = r5
            X.C69028NdD.A08(r0, r1, r2, r3, r5, r6, r7)
            goto L_0x008c
        L_0x00b2:
            java.lang.Object r4 = r10.A01
            X.NdD r4 = (X.C69028NdD) r4
            com.instagram.common.session.UserSession r5 = r4.A02
            boolean r0 = X.AnonymousClass3HF.A03(r5)
            X.Ody r3 = r4.A03
            if (r0 == 0) goto L_0x00dd
            X.HOc r2 = X.C54671HOc.MAP_INTRO_NUX
            java.lang.String r1 = "NUX_PROCEED"
            java.lang.String r0 = "TAP"
            X.C71144Ody.A02(r2, r3, r1, r0)
        L_0x00c9:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321769623987931(0x810a75000d26db, double:3.0333715940123624E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00e3
            r1 = 1
            X.NmU r0 = X.C69486NmU.NUX_SCREEN
            r4.A0W(r0, r1)
            goto L_0x008c
        L_0x00dd:
            java.lang.String r0 = "NUX_FRIEND_MAP_NOTE"
            X.C71144Ody.A07(r3, r0)
            goto L_0x00c9
        L_0x00e3:
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r2 = 0
            r1 = 2
            X.Phb r0 = new X.Phb
            r0.<init>(r4, r1)
            X.C69028NdD.A09(r2, r4, r3, r0)
            goto L_0x008c
        L_0x00f0:
            java.lang.Object r0 = r10.A01
            X.NdD r0 = (X.C69028NdD) r0
            X.Ody r1 = r0.A03
            X.HOc r0 = X.C54671HOc.MAP_INTRO_NUX
            r1.A0A(r0)
            goto L_0x008c
        L_0x00fc:
            java.lang.Object r2 = r10.A01
            X.NdD r2 = (X.C69028NdD) r2
            android.location.Location r1 = X.C69028NdD.A03(r2)
            if (r1 == 0) goto L_0x008c
            r0 = 0
            X.OIR r1 = X.C69028NdD.A05(r1, r0)
            X.PGj r0 = new X.PGj
            r0.<init>(r1)
            goto L_0x0149
        L_0x0111:
            java.lang.Object r0 = r10.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            goto L_0x008c
        L_0x011a:
            java.lang.Object r2 = r10.A01
            X.NdD r2 = (X.C69028NdD) r2
            android.location.Location r0 = X.C69028NdD.A03(r2)
            r2.A0V(r0)
            r1 = 8
            X.Phb r0 = new X.Phb
            r0.<init>(r2, r1)
            X.C69028NdD.A0K(r2, r0)
            goto L_0x008c
        L_0x0131:
            java.lang.Object r2 = r10.A01
            X.NdD r2 = (X.C69028NdD) r2
            X.Ody r1 = r2.A03
            java.lang.String r0 = "LOCATION_SHARE_PERMISSION"
            X.C71144Ody.A07(r1, r0)
            X.OZw r0 = r2.A06
            r0.A03()
            goto L_0x008c
        L_0x0143:
            java.lang.Object r2 = r10.A01
            X.MYL r2 = (X.MYL) r2
            X.PH4 r0 = X.PH4.A00
        L_0x0149:
            r2.A0P(r0)
            goto L_0x008c
        L_0x014e:
            java.lang.Object r0 = r10.A01
            X.A6K r0 = (X.A6K) r0
            X.29E r3 = r0.A01
            long r1 = r0.A00
            java.lang.String r0 = "start_processing"
            r3.A0C(r0, r1)
            goto L_0x008c
        L_0x015d:
            java.lang.Object r1 = r10.A01
            X.GVG r1 = (X.GVG) r1
            X.29E r3 = r1.A01
            r4 = -1
            java.lang.String r0 = "filtering_complete"
            r3.A0C(r0, r4)
            X.GmP r2 = r1.A00
            r0 = 0
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "initial_media"
            r8 = 0
            r3.A09(r4, r0, r1)
            java.lang.String r0 = "has_date_taken"
            r3.A09(r4, r0, r1)
            int r0 = r2.A01
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "location_filter"
            r3.A09(r4, r0, r1)
            int r0 = r2.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "media_with_ml"
            r3.A09(r4, r0, r1)
            int r0 = r2.A00
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r6 = "after_ml_filter"
            goto L_0x01ba
        L_0x019b:
            java.lang.Object r0 = r10.A01
            X.GVG r0 = (X.GVG) r0
            X.29E r3 = r0.A01
            r4 = -1
            java.lang.String r0 = "grouping_complete"
            r3.A0C(r0, r4)
            r0 = 0
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "after_grouping"
            r8 = 0
            r3.A09(r4, r0, r7)
            java.lang.String r0 = "after_min_group_filter"
            r3.A09(r4, r0, r7)
            java.lang.String r6 = "after_deduping"
        L_0x01ba:
            r3.A0B(r4, r6, r7, r8)
            goto L_0x008c
        L_0x01bf:
            java.lang.Object r0 = r10.A01
            X.VjZ r0 = (X.C17997VjZ) r0
            X.UNc r0 = r0.A03
            java.util.List r0 = r0.A08
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            if (r0 == 0) goto L_0x008e
            java.util.Iterator r2 = r0.iterator()
        L_0x01d1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r1 = r2.next()
            X.XAm r1 = (X.C21033XAm) r1
            X.VSD r0 = new X.VSD
            r0.<init>(r1)
            r3.add(r0)
            goto L_0x01d1
        L_0x01e6:
            java.lang.Object r0 = r10.A01
            X.1EO r0 = (X.AnonymousClass1EO) r0
            r0.cancel()
            goto L_0x008c
        L_0x01ef:
            X.02m r3 = X.02m.A0p
            return r3
        L_0x01f2:
            java.lang.Object r3 = r10.A01
            return r3
        L_0x01f5:
            X.08y r1 = X.09i.A0A
            java.lang.Object r0 = r10.A01
            android.os.Bundle r0 = X.DbS.A0B(r0)
            X.0aP r3 = r1.A02(r0)
            return r3
        L_0x0202:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.G4l r3 = new X.G4l
            r3.<init>(r0)
            return r3
        L_0x020c:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8jg r3 = new X.8jg
            r3.<init>(r0)
            return r3
        L_0x0216:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FBL r3 = new X.FBL
            r3.<init>(r0)
            return r3
        L_0x0220:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYe r3 = new X.FYe
            r3.<init>(r0)
            return r3
        L_0x022a:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.280 r3 = new X.280
            r3.<init>(r0)
            return r3
        L_0x0234:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyV r3 = new X.OyV
            r3.<init>(r0)
            return r3
        L_0x023e:
            java.lang.Object r0 = r10.A01
            X.0lg r0 = (X.0lg) r0
            X.FYz r3 = new X.FYz
            r3.<init>(r0)
            return r3
        L_0x0248:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OyW r3 = new X.OyW
            r3.<init>(r0)
            return r3
        L_0x0252:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.M1M r3 = new X.M1M
            r3.<init>(r0)
            return r3
        L_0x025c:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.M1N r3 = new X.M1N
            r3.<init>(r0)
            return r3
        L_0x0266:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.M1L r3 = new X.M1L
            r3.<init>(r0)
            return r3
        L_0x0270:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYf r3 = new X.FYf
            r3.<init>(r0)
            return r3
        L_0x027a:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Liv r3 = new X.Liv
            r3.<init>(r0)
            return r3
        L_0x0284:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYg r3 = new X.FYg
            r3.<init>(r0)
            return r3
        L_0x028e:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYx r3 = new X.FYx
            r3.<init>(r0)
            return r3
        L_0x0298:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6qX r3 = new X.6qX
            r3.<init>(r0)
            return r3
        L_0x02a2:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.FYr r3 = new X.FYr
            r3.<init>(r0)
            return r3
        L_0x02ac:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8ij r3 = new X.8ij
            r3.<init>(r0)
            return r3
        L_0x02b6:
            java.lang.Object r0 = r10.A01
            X.JY2 r0 = (X.JY2) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Am r3 = X.1Al.A01(r0)
            return r3
        L_0x02c1:
            java.lang.Object r0 = r10.A01
            X.LG0 r0 = (X.LG0) r0
            java.lang.Integer r0 = r0.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x02d6;
                case 1: goto L_0x02da;
                case 2: goto L_0x02de;
                case 3: goto L_0x02e2;
                default: goto L_0x02ce;
            }
        L_0x02ce:
            r0 = 850998445(0x32b934ad, float:2.1560789E-8)
        L_0x02d1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x02d6:
            r0 = 850996053(0x32b92b55, float:2.155654E-8)
            goto L_0x02d1
        L_0x02da:
            r0 = 850993291(0x32b9208b, float:2.1551633E-8)
            goto L_0x02d1
        L_0x02de:
            r0 = 850993602(0x32b921c2, float:2.1552186E-8)
            goto L_0x02d1
        L_0x02e2:
            r0 = 850985978(0x32b903fa, float:2.1538643E-8)
            goto L_0x02d1
        L_0x02e6:
            java.lang.Object r0 = r10.A01
            X.HAg r0 = (X.C54365HAg) r0
            X.3fJ r0 = X.C73662Phb.super.B5P()
            X.AdR r3 = new X.AdR
            r3.<init>(r0)
            return r3
        L_0x02f4:
            java.lang.Object r0 = r10.A01
            X.F0J r0 = (X.F0J) r0
            android.view.ViewStub r0 = r0.A00
            android.view.View r3 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView"
            X.0qQ.A0C(r3, r0)
            return r3
        L_0x0304:
            java.lang.Object r0 = r10.A01
            X.WXU r0 = (X.WXU) r0
            int r2 = r0.A04
            int r1 = r0.A03
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            return r3
        L_0x0313:
            java.lang.Object r2 = r10.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.KSB r3 = new X.KSB
            r3.<init>()
            java.lang.String r0 = "com.instagram.gpslocation.impl.GPSLocationLibraryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0344 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ all -> 0x0344 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x0344 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0344 }
            java.lang.Object r1 = r1.newInstance(r0)     // Catch:{ all -> 0x0344 }
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.gpslocation.intf.GPSLocationLibrary"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0344 }
            X.LBm r1 = (X.C63905LBm) r1     // Catch:{ all -> 0x0344 }
            r3.A00 = r1     // Catch:{ all -> 0x0344 }
            return r3
        L_0x0344:
            r2 = move-exception
            java.lang.String r1 = "GPSLocationLibraryWrapper"
            java.lang.String r0 = "Failed to initialize GPSLocationLibrary"
            X.0wb.A06(r1, r0, r2)
            return r3
        L_0x034d:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Rq4 r3 = new X.Rq4
            r3.<init>(r0)
            return r3
        L_0x0357:
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Rq5 r3 = new X.Rq5
            r3.<init>(r0)
            return r3
        L_0x0361:
            X.1Dn r1 = X.1Dm.A01
            java.lang.Object r0 = r10.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.1Dm r0 = r1.A00(r0)
            com.facebook.pando.PandoGraphQLConsistencyJNI r3 = r0.A00()
            return r3
        L_0x0370:
            java.lang.Object r1 = r10.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.3qk r0 = new X.3qk
            r0.<init>(r1)
            X.3qj r3 = new X.3qj
            r3.<init>(r0)
            return r3
        L_0x037f:
            java.lang.Object r0 = r10.A01
            X.E7S r0 = (X.E7S) r0
            com.instagram.common.session.UserSession r0 = r0.A0C()
            X.EEk r3 = new X.EEk
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73662Phb.invoke():java.lang.Object");
    }
}
