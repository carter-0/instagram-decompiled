package X;

/* renamed from: X.9LM  reason: invalid class name */
public final class AnonymousClass9LM extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LM(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0437, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        return ((X.C62320sa) r3.A01).invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0194, code lost:
        return java.lang.Boolean.valueOf(X.182.A06(r2, r3, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01ac, code lost:
        r2 = (int) X.182.A01(r2, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01c6, code lost:
        return java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01db, code lost:
        return new X.193(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a0, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a1, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r26 = this;
            r3 = r26
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0171;
                case 1: goto L_0x017f;
                case 2: goto L_0x0195;
                case 3: goto L_0x01a1;
                case 4: goto L_0x01b2;
                case 5: goto L_0x01c7;
                case 6: goto L_0x01cf;
                case 7: goto L_0x01dc;
                case 8: goto L_0x01ed;
                case 9: goto L_0x0010;
                case 10: goto L_0x020f;
                case 11: goto L_0x0023;
                case 12: goto L_0x021b;
                case 13: goto L_0x0233;
                case 14: goto L_0x0249;
                case 15: goto L_0x025f;
                case 16: goto L_0x0288;
                case 17: goto L_0x02a5;
                case 18: goto L_0x02b1;
                case 19: goto L_0x02be;
                case 20: goto L_0x02cf;
                case 21: goto L_0x02d8;
                case 22: goto L_0x02e1;
                case 23: goto L_0x02ea;
                case 24: goto L_0x02f4;
                case 25: goto L_0x031f;
                case 26: goto L_0x0364;
                case 27: goto L_0x0037;
                case 28: goto L_0x0375;
                case 29: goto L_0x039f;
                case 30: goto L_0x03bc;
                case 31: goto L_0x03ef;
                case 32: goto L_0x0407;
                case 33: goto L_0x0089;
                case 34: goto L_0x0417;
                case 35: goto L_0x0421;
                case 36: goto L_0x042c;
                case 37: goto L_0x0438;
                case 38: goto L_0x044b;
                case 39: goto L_0x045e;
                case 40: goto L_0x047c;
                case 41: goto L_0x048f;
                case 42: goto L_0x0007;
                case 43: goto L_0x0492;
                case 44: goto L_0x04a1;
                case 45: goto L_0x04ab;
                case 46: goto L_0x04c4;
                case 47: goto L_0x0007;
                case 48: goto L_0x0007;
                case 49: goto L_0x00a5;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
        L_0x000f:
            return r0
        L_0x0010:
            java.lang.Object r0 = r3.A01
            android.content.Intent r0 = (android.content.Intent) r0
            android.net.Uri r0 = r0.getData()
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x000f
        L_0x0020:
            java.lang.String r0 = ""
            return r0
        L_0x0023:
            java.lang.Thread r1 = X.AnonymousClass1YB.A00
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0007
            java.lang.String r1 = "LazyUi block must be accessed only on UI thread."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0037:
            java.lang.Object r1 = r3.A01
            X.3Vg r1 = (X.C242633Vg) r1
            X.Tnz r0 = r1.A01
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0080
            X.0Ud r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r2 = r0.A00
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r0.A01
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
        L_0x0051:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x04ce
            r0 = 10
            int r1 = X.0Yv.A1E(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r4 = r2.iterator()
        L_0x0069:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x000f
            java.lang.Object r3 = r4.next()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            X.0eP r1 = new X.0eP
            r1.<init>(r3, r2)
            r0.add(r1)
            goto L_0x0069
        L_0x0080:
            java.util.Map r0 = r1.A02
            java.util.Set r2 = r0.keySet()
            java.lang.ref.WeakReference r1 = r1.A00
            goto L_0x0051
        L_0x0089:
            java.lang.Object r2 = r3.A01
            X.3de r2 = (X.C245893de) r2
            boolean r1 = r2.A06
            r0 = 0
            if (r1 == 0) goto L_0x000f
            X.3W1 r1 = r2.A01
            if (r1 == 0) goto L_0x000f
            X.1Xj r2 = r2.A00
            int r1 = r1.A03
            X.1Xj r1 = r2.A1c(r1)
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r1.getId()
            return r0
        L_0x00a5:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            java.lang.Object r8 = r3.A01
            X.7kN r8 = (X.C339917kN) r8
            android.widget.TextView r6 = r8.A09
            android.widget.TextView r7 = r8.A08
            X.0sa r2 = r8.A0D
            X.9R4 r1 = new X.9R4
            r1.<init>(r6, r7, r2)
            java.util.List r20 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r20)
            android.graphics.drawable.Drawable r5 = r8.A06
            float r10 = r8.A03
            float r11 = r8.A02
            float r12 = r8.A01
            r14 = 0
            r9 = 1065353216(0x3f800000, float:1.0)
            r13 = 1
            X.9R3 r4 = new X.9R3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r18 = 0
            r2 = 0
            r23 = 100
            r19 = r4
            r21 = r9
            r25 = r2
            r22 = r18
            android.animation.ValueAnimator r3 = X.C339917kN.A00(r19, r20, r21, r22, r23, r25)
            X.Nh0 r1 = new X.Nh0
            r1.<init>(r7, r2)
            java.util.List r17 = java.util.Collections.singletonList(r1)
            X.0qQ.A07(r17)
            X.9R3 r4 = new X.9R3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r16 = r4
            r19 = r9
            r20 = r23
            r22 = r2
            android.animation.ValueAnimator r2 = X.C339917kN.A00(r16, r17, r18, r19, r20, r22)
            boolean r7 = r8.A0E
            java.util.List r5 = r8.A0A
            android.graphics.drawable.Drawable r6 = r8.A05
            float r4 = r8.A00
            boolean r1 = r8.A0F
            X.9R3 r12 = new X.9R3
            r15 = r14
            r16 = r8
            r17 = r4
            r19 = r18
            r20 = r18
            r21 = r1
            r13 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r7 == 0) goto L_0x011e
            r23 = 500(0x1f4, double:2.47E-321)
        L_0x011e:
            r16 = r12
            r17 = r5
            r19 = r9
            r20 = r23
            r22 = r7
            android.animation.ValueAnimator r5 = X.C339917kN.A00(r16, r17, r18, r19, r20, r22)
            java.util.List r7 = r8.A0B
            X.9R3 r12 = new X.9R3
            r16 = r8
            r17 = r4
            r19 = r18
            r20 = r18
            r21 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r23 = 100
            r19 = r12
            r21 = r9
            r20 = r7
            r22 = r18
            android.animation.ValueAnimator r6 = X.C339917kN.A00(r19, r20, r21, r22, r23, r25)
            android.animation.AnimatorSet$Builder r1 = r0.play(r3)
            long r3 = r8.A04
            android.animation.AnimatorSet$Builder r1 = r1.after(r3)
            r1.before(r5)
            boolean r1 = r8.A0G
            if (r1 == 0) goto L_0x000f
            android.animation.AnimatorSet$Builder r1 = r0.play(r6)
            r3 = 3000(0xbb8, double:1.482E-320)
            android.animation.AnimatorSet$Builder r1 = r1.after(r3)
            r1.after(r5)
            android.animation.AnimatorSet$Builder r1 = r0.play(r2)
            r1.after(r6)
            return r0
        L_0x0171:
            java.lang.Object r0 = r3.A01
            X.1OJ r0 = (X.AnonymousClass1OJ) r0
            X.0lg r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316972144726754(0x810618000112e2, double:3.0303376488096956E-306)
            goto L_0x018c
        L_0x017f:
            java.lang.Object r0 = r3.A01
            X.1OJ r0 = (X.AnonymousClass1OJ) r0
            X.0lg r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316972144661217(0x810618000012e1, double:3.03033764876825E-306)
        L_0x018c:
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0195:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36591948836044869(0x82002f00030045, double:3.204234015641534E-306)
            goto L_0x01ac
        L_0x01a1:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36591948835979332(0x82002f00020044, double:3.204234015600088E-306)
        L_0x01ac:
            long r0 = X.182.A01(r2, r3, r0)
            int r2 = (int) r0
            goto L_0x01c2
        L_0x01b2:
            java.lang.Object r3 = r3.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 37154898789335045(0x84002f00010005, double:3.560245832919755E-306)
            double r0 = X.182.A00(r2, r3, r0)
            int r2 = (int) r0
        L_0x01c2:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x01c7:
            java.lang.Object r0 = r3.A01
            X.12U r0 = (X.AnonymousClass12U) r0
            X.0nO r2 = r0.A00
            r1 = 0
            goto L_0x01d6
        L_0x01cf:
            java.lang.Object r0 = r3.A01
            X.12U r0 = (X.AnonymousClass12U) r0
            X.0nO r2 = r0.A00
            r1 = 1
        L_0x01d6:
            X.193 r0 = new X.193
            r0.<init>(r2, r1)
            return r0
        L_0x01dc:
            java.lang.Object r0 = r3.A01
            android.content.Intent r0 = (android.content.Intent) r0
            java.util.Set r0 = r0.getCategories()
            if (r0 == 0) goto L_0x01eb
            com.google.common.collect.ImmutableSet r0 = com.google.common.collect.ImmutableSet.A03(r0)
            return r0
        L_0x01eb:
            r0 = 0
            return r0
        L_0x01ed:
            r2 = 0
            java.lang.Object r0 = r3.A01     // Catch:{ BadParcelableException -> 0x0202 }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ BadParcelableException -> 0x0202 }
            android.os.Bundle r1 = r0.getExtras()     // Catch:{ BadParcelableException -> 0x0202 }
            if (r1 == 0) goto L_0x0202
            java.lang.String r0 = "InstagramUrlLaunchConstants.EXTRA_IS_ARMADILLO_EXPRESS_MESSAGE"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ BadParcelableException -> 0x0202 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ BadParcelableException -> 0x0202 }
        L_0x0202:
            if (r2 == 0) goto L_0x020d
            boolean r0 = r2.booleanValue()
        L_0x0208:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x020d:
            r0 = 0
            goto L_0x0208
        L_0x020f:
            X.0wj r2 = X.0wj.A01
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1Zn r0 = new X.1Zn
            r0.<init>(r2, r1)
            return r0
        L_0x021b:
            java.lang.Object r3 = r3.A01
            X.2nA r3 = (X.C229302nA) r3
            java.lang.Object r2 = r3.A02
            monitor-enter(r2)
            boolean r0 = r3.A03     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x0230
            android.content.SharedPreferences r1 = r3.A01     // Catch:{ all -> 0x02a2 }
            java.lang.String r0 = "dummy"
            r1.contains(r0)     // Catch:{ all -> 0x02a2 }
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x02a2 }
        L_0x0230:
            monitor-exit(r2)
            goto L_0x0435
        L_0x0233:
            java.lang.Object r0 = r3.A01
            X.3TS r0 = (X.AnonymousClass3TS) r0
            android.widget.FrameLayout r1 = r0.A00()
            r0 = 2131434668(0x7f0b1cac, float:1.8491156E38)
            android.view.View r0 = r1.requireViewById(r0)
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = (com.instagram.ui.widget.slideouticon.SlideInAndOutIconView) r0
            X.3Td r1 = X.C242233Td.END
            r0.A03 = r1
            return r0
        L_0x0249:
            java.lang.Object r0 = r3.A01
            X.2BU r0 = (X.AnonymousClass2BU) r0
            android.content.Context r1 = r0.A02
            java.lang.String r0 = "sensor"
            java.lang.Object r0 = r1.getSystemService(r0)
            r1 = 816(0x330, float:1.143E-42)
            java.lang.String r1 = X.Pxd.A00(r1)
            X.0qQ.A0C(r0, r1)
            return r0
        L_0x025f:
            X.1LZ r2 = X.1LV.A0B
            java.lang.Object r0 = r3.A01
            X.1BJ r0 = (X.AnonymousClass1BJ) r0
            X.1B5 r1 = r0.A01
            monitor-enter(r2)
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x02a2 }
            X.1LV r0 = X.1LV.A0A     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x02a0
            X.1LV r0 = new X.1LV     // Catch:{ all -> 0x02a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a2 }
            X.1LV.A0A = r0     // Catch:{ all -> 0x02a2 }
            X.14i.A05(r0)     // Catch:{ all -> 0x02a2 }
            boolean r1 = X.1Ld.A01()     // Catch:{ all -> 0x02a2 }
            if (r1 == 0) goto L_0x02a0
            X.1Ld r1 = X.1Ld.A00()     // Catch:{ all -> 0x02a2 }
            r1.EBY(r0)     // Catch:{ all -> 0x02a2 }
            goto L_0x02a0
        L_0x0288:
            X.9xI r2 = X.AVQ.A04
            java.lang.Object r0 = r3.A01
            X.1BJ r0 = (X.AnonymousClass1BJ) r0
            X.1B5 r1 = r0.A01
            monitor-enter(r2)
            r0 = 0
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x02a2 }
            X.AVQ r0 = X.AVQ.A03     // Catch:{ all -> 0x02a2 }
            if (r0 != 0) goto L_0x02a0
            X.AVQ r0 = new X.AVQ     // Catch:{ all -> 0x02a2 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a2 }
            X.AVQ.A03 = r0     // Catch:{ all -> 0x02a2 }
        L_0x02a0:
            monitor-exit(r2)
            return r0
        L_0x02a2:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x02a5:
            java.lang.Object r0 = r3.A01
            X.1BJ r0 = (X.AnonymousClass1BJ) r0
            X.1B5 r1 = r0.A01
            X.AVP r0 = new X.AVP
            r0.<init>(r1)
            return r0
        L_0x02b1:
            X.1Ll r1 = X.AnonymousClass1Li.A01
            java.lang.Object r0 = r3.A01
            X.1BJ r0 = (X.AnonymousClass1BJ) r0
            X.1B5 r0 = r0.A01
            X.1Li r0 = r1.A00(r0)
            return r0
        L_0x02be:
            X.0eM r0 = X.11Z.A01
            java.lang.Object r1 = r0.getValue()
            android.os.Handler r1 = (android.os.Handler) r1
            java.lang.Object r0 = r3.A01
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1.post(r0)
            goto L_0x0435
        L_0x02cf:
            java.lang.Object r1 = r3.A01
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 1
            r1.A0N = r0
            goto L_0x0435
        L_0x02d8:
            java.lang.Object r1 = r3.A01
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 1
            r1.A0O = r0
            goto L_0x0435
        L_0x02e1:
            java.lang.Object r1 = r3.A01
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            r0 = 1
            r1.A0L = r0
            goto L_0x0435
        L_0x02ea:
            java.lang.Object r1 = r3.A01
            X.3E5 r1 = (X.AnonymousClass3E5) r1
            X.9jC r0 = new X.9jC
            r0.<init>(r1)
            return r0
        L_0x02f4:
            X.2cp r0 = X.C61340me.A00()
            X.2cs r0 = r0.A02()
            java.lang.Object r3 = r3.A01
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r3
            java.util.Map r2 = r3.A0v
            X.3TE r1 = X.AnonymousClass3TE.A03
            java.lang.Object r1 = r2.get(r1)
            X.2co r1 = (X.C71392co) r1
            r0.A09(r1)
            r1 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            r0.A00 = r1
            r1 = 4572414629676717179(0x3f747ae147ae147b, double:0.005)
            r0.A02 = r1
            r0.A0A(r3)
            return r0
        L_0x031f:
            java.lang.Object r3 = r3.A01
            X.3oU r3 = (X.C252053oU) r3
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0341
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0341
            java.lang.String r1 = "To use ViewStubber from a background thread, you must specify allowBackgroundThread=true."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0341:
            boolean r0 = r3.CVM()
            if (r0 == 0) goto L_0x034f
            android.view.View r0 = r3.A00
            java.lang.String r1 = "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl"
            X.0qQ.A0C(r0, r1)
            return r0
        L_0x034f:
            android.view.ViewStub r0 = r3.A01
            r2 = 0
            if (r0 == 0) goto L_0x0362
            android.view.View r0 = r0.inflate()
        L_0x0358:
            java.lang.String r1 = "null cannot be cast to non-null type T of com.instagram.common.ui.widget.viewstubholder.ViewStubberImpl"
            X.0qQ.A0C(r0, r1)
            r3.A00 = r0
            r3.A01 = r2
            return r0
        L_0x0362:
            r0 = r2
            goto L_0x0358
        L_0x0364:
            java.lang.Object r1 = r3.A01
            X.3Vg r1 = (X.C242633Vg) r1
            java.util.Map r0 = r1.A02
            r0.clear()
            r0 = 0
            r1.A00 = r0
            X.C242633Vg.A01(r1)
            goto L_0x0435
        L_0x0375:
            java.lang.Object r2 = r3.A01
            X.3Vg r2 = (X.C242633Vg) r2
            X.Tnz r0 = r2.A01
            boolean r0 = r0.A03
            r1 = 1
            if (r0 == 0) goto L_0x0398
            X.0Ud r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.isEmpty()
        L_0x0390:
            if (r0 == 0) goto L_0x0393
            r1 = 0
        L_0x0393:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L_0x0398:
            java.util.Map r0 = r2.A02
            boolean r0 = r0.isEmpty()
            goto L_0x0390
        L_0x039f:
            java.lang.Object r4 = r3.A01
            com.instagram.common.uigraph.UiGraph r4 = (com.instagram.common.uigraph.UiGraph) r4
            r0 = r4
            X.1y3 r0 = (X.1y3) r0
            X.0Ud r3 = r0.A01
            r2 = 0
            r1 = 10
            X.MHk r0 = new X.MHk
            r0.<init>((java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r1)
            X.02x r2 = X.10q.A02(r0, r3)
            r1 = -1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.0r6 r0 = X.11M.A00(r0, r2, r1)
            return r0
        L_0x03bc:
            java.lang.Object r4 = r3.A01
            com.instagram.compose.ui.gradientspinner.GradientSpinnerNode r4 = (com.instagram.compose.ui.gradientspinner.GradientSpinnerNode) r4
            X.GRo r0 = r4.A01
            X.5Oz r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            r0 = 0
            X.4Co r1 = r4.A05
            if (r2 == 0) goto L_0x03e9
            if (r1 != 0) goto L_0x0435
            X.4Cq r3 = r4.A05()
            r2 = 34
            X.MG7 r1 = new X.MG7
            r1.<init>(r4, r0, r2)
            X.19B r0 = X.19B.A00
            X.1Er r0 = X.1Eo.A04(r0, r1, r3)
        L_0x03e6:
            r4.A05 = r0
            goto L_0x0435
        L_0x03e9:
            if (r1 == 0) goto L_0x03e6
            r1.AG7(r0)
            goto L_0x03e6
        L_0x03ef:
            java.lang.Object r2 = r3.A01
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.4JL r1 = X.AnonymousClass4JL.A00
            java.lang.Class<X.4JM> r0 = X.AnonymousClass4JM.class
            java.lang.Object r1 = r2.A01(r0, r1)
            X.4JM r1 = (X.AnonymousClass4JM) r1
            X.4JK r0 = new X.4JK
            r0.<init>(r2, r1)
            return r0
        L_0x0407:
            java.lang.Object r0 = r3.A01
            X.4JK r0 = (X.AnonymousClass4JK) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.1vn r1 = X.1vm.A01(r2)
            com.instagram.direct.inbox.notes.NotesApi r0 = new com.instagram.direct.inbox.notes.NotesApi
            r0.<init>(r2, r1)
            return r0
        L_0x0417:
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.3gC r0 = new X.3gC
            r0.<init>(r1)
            return r0
        L_0x0421:
            java.lang.Object r0 = r3.A01
            X.3gC r0 = (X.C247353gC) r0
            com.instagram.common.session.UserSession r0 = r0.A05
            X.1Av r0 = X.1Au.A00(r0)
            return r0
        L_0x042c:
            java.lang.Object r0 = r3.A01
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            java.util.Set r0 = r0.A3d
            r0.clear()
        L_0x0435:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0438:
            com.instagram.contentprovider.FamilyAppsUserValuesProvider r0 = new com.instagram.contentprovider.FamilyAppsUserValuesProvider
            r0.<init>()
            java.lang.Object r1 = r3.A01
            X.MXw r1 = (X.C66590MXw) r1
            android.content.Context r2 = r1.getContext()
            android.content.pm.ProviderInfo r1 = r1.A02
            r0.attachInfo(r2, r1)
            return r0
        L_0x044b:
            X.Dis r0 = new X.Dis
            r0.<init>()
            java.lang.Object r1 = r3.A01
            X.MXw r1 = (X.C66590MXw) r1
            android.content.Context r2 = r1.getContext()
            android.content.pm.ProviderInfo r1 = r1.A02
            r0.attachInfo(r2, r1)
            return r0
        L_0x045e:
            java.lang.Object r5 = r3.A01
            X.8gL r5 = (X.C361508gL) r5
            android.content.Context r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A03
            boolean r2 = r5.A05
            r0 = 1
            X.L3p r1 = new X.L3p
            r1.<init>(r0, r2)
            X.LG7 r0 = new X.LG7
            r0.<init>(r4, r3, r1)
            X.2k4 r2 = r5.A02
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r0.A00 = r2
            return r0
        L_0x047c:
            java.lang.Object r0 = r3.A01
            X.8ZV r0 = (X.AnonymousClass8ZV) r0
            com.instagram.common.session.UserSession r3 = r0.getSession()
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            r1 = 0
            X.8As r0 = new X.8As
            r0.<init>(r2, r3, r1)
            return r0
        L_0x048f:
            java.lang.Object r0 = r3.A01
            return r0
        L_0x0492:
            java.lang.Object r0 = r3.A01
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r0 = r0.getValue()
            X.07g r0 = (X.AnonymousClass07g) r0
            X.07f r0 = r0.getViewModelStore()
            return r0
        L_0x04a1:
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.8gT r0 = new X.8gT
            r0.<init>(r1)
            return r0
        L_0x04ab:
            java.lang.Object r0 = r3.A01
            X.8S5 r0 = (X.AnonymousClass8S5) r0
            android.view.View r1 = r0.A03
            r0 = 2131429474(0x7f0b0862, float:1.8480622E38)
            android.view.View r2 = r1.requireViewById(r0)
            X.0qQ.A07(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r1 = 0
            X.3M8 r0 = new X.3M8
            r0.<init>(r2, r1)
            return r0
        L_0x04c4:
            java.lang.Object r1 = r3.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.8fN r0 = new X.8fN
            r0.<init>(r1)
            return r0
        L_0x04ce:
            if (r1 == 0) goto L_0x04e7
            java.lang.Object r2 = r1.get()
            if (r2 == 0) goto L_0x04e7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r0)
            return r0
        L_0x04e7:
            X.0sn r0 = X.0sn.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9LM.invoke():java.lang.Object");
    }
}
