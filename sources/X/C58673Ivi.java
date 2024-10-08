package X;

/* renamed from: X.Ivi  reason: case insensitive filesystem */
public final class C58673Ivi extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58673Ivi(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58673Ivi(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bd, code lost:
        if (r0.A05 != null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d7, code lost:
        if ((java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(java.lang.System.currentTimeMillis()) - ((X.1Xj) r5.A01).A1A()) < 300) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d9, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00de, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00df, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0234, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r32 = this;
            r5 = r32
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02a3;
                case 1: goto L_0x0278;
                case 2: goto L_0x0268;
                case 3: goto L_0x02b7;
                case 4: goto L_0x0261;
                case 5: goto L_0x0007;
                case 6: goto L_0x000e;
                case 7: goto L_0x024b;
                case 8: goto L_0x0235;
                case 9: goto L_0x022b;
                case 10: goto L_0x0217;
                case 11: goto L_0x020b;
                case 12: goto L_0x0201;
                case 13: goto L_0x01f8;
                case 14: goto L_0x02b7;
                case 15: goto L_0x0261;
                case 16: goto L_0x0007;
                case 17: goto L_0x02b7;
                case 18: goto L_0x0261;
                case 19: goto L_0x0007;
                case 20: goto L_0x01ef;
                case 21: goto L_0x01dc;
                case 22: goto L_0x01c8;
                case 23: goto L_0x01b2;
                case 24: goto L_0x019d;
                case 25: goto L_0x0192;
                case 26: goto L_0x0183;
                case 27: goto L_0x0174;
                case 28: goto L_0x016d;
                case 29: goto L_0x02b7;
                case 30: goto L_0x0261;
                case 31: goto L_0x0007;
                case 32: goto L_0x0158;
                case 33: goto L_0x0144;
                case 34: goto L_0x012f;
                case 35: goto L_0x0104;
                case 36: goto L_0x00fa;
                case 37: goto L_0x00f1;
                case 38: goto L_0x00e1;
                case 39: goto L_0x02b7;
                case 40: goto L_0x0261;
                case 41: goto L_0x0007;
                case 42: goto L_0x02b7;
                case 43: goto L_0x0261;
                case 44: goto L_0x0007;
                case 45: goto L_0x00c0;
                case 46: goto L_0x00b3;
                case 47: goto L_0x00a0;
                case 48: goto L_0x005b;
                case 49: goto L_0x0048;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.DbY.A0I(r0)
        L_0x000d:
            return r2
        L_0x000e:
            java.lang.Object r0 = r5.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r6 = r0.mParentFragment
            r2 = 0
            if (r6 == 0) goto L_0x000d
            r0 = 3
            X.Ivi r4 = new X.Ivi
            r4.<init>(r6, r0)
            X.0eO r3 = X.0eO.A02
            r1 = 4
            X.Ivi r0 = new X.Ivi
            r0.<init>(r4, r1)
            X.0eM r5 = X.AnonymousClass0eN.A00(r3, r0)
            java.lang.Class<X.DlD> r0 = X.C46785DlD.class
            X.0Yh r4 = X.DbS.A0z(r0)
            r0 = 5
            X.Ivi r3 = new X.Ivi
            r3.<init>(r5, r0)
            r0 = 6
            X.Ivz r1 = X.C58690Ivz.A00(r2, r5, r0)
            r0 = 7
            X.Ivz r0 = X.C58690Ivz.A00(r5, r6, r0)
            X.2kA r0 = X.DbS.A0I(r3, r0, r1, r4)
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x0048:
            java.lang.Object r0 = r5.A01
            X.K57 r0 = (X.K57) r0
            com.instagram.common.session.UserSession r3 = r0.A05()
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 0
            X.8As r2 = new X.8As
            r2.<init>(r1, r3, r0)
            return r2
        L_0x005b:
            java.lang.Object r0 = r5.A01
            X.K57 r0 = (X.K57) r0
            com.instagram.common.session.UserSession r2 = r0.A05()
            X.28D r1 = r0.A0A
            com.instagram.creation.base.CreationSession r0 = new com.instagram.creation.base.CreationSession
            r0.<init>()
            r4 = 0
            r24 = 0
            r27 = 1
            X.82Y r3 = new X.82Y
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r9 = r4
            r10 = r4
            r11 = r4
            r12 = r4
            r13 = r4
            r14 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r25 = r24
            r26 = r24
            r28 = r24
            r29 = r24
            r30 = r24
            r31 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.82p r2 = X.JWD.A00(r1, r2, r0, r3)
            return r2
        L_0x00a0:
            java.lang.Object r0 = r5.A01
            X.K57 r0 = (X.K57) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            com.instagram.common.session.UserSession r1 = r0.A05()
            r0 = 0
            X.80c r2 = new X.80c
            r2.<init>(r3, r1, r0, r0)
            return r2
        L_0x00b3:
            java.lang.Object r0 = r5.A01
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.8J0 r0 = r0.A12
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x00df
            goto L_0x00d9
        L_0x00c0:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r2.toSeconds(r0)
            java.lang.Object r0 = r5.A01
            X.1Xj r0 = (X.1Xj) r0
            long r0 = r0.A1A()
            long r3 = r3 - r0
            r1 = 300(0x12c, double:1.48E-321)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
        L_0x00d9:
            r0 = 1
        L_0x00da:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x00df:
            r0 = 0
            goto L_0x00da
        L_0x00e1:
            java.lang.Object r0 = r5.A01
            X.H0d r0 = (X.C54134H0d) r0
            X.0eM r0 = r0.A0E
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$Factory r2 = new com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel$Factory
            r2.<init>(r0)
            return r2
        L_0x00f1:
            java.lang.Object r1 = r5.A01
            r0 = 4
            X.GiT r2 = new X.GiT
            r2.<init>(r1, r0)
            return r2
        L_0x00fa:
            java.lang.Object r1 = r5.A01
            r0 = 11
            X.Jlz r2 = new X.Jlz
            r2.<init>(r1, r0)
            return r2
        L_0x0104:
            java.lang.Object r2 = r5.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r0 = r2.requireContext()
            int r1 = X.AnonymousClass0nB.A01(r0)
            android.content.Context r0 = r2.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            int r0 = r0 * 2
            int r1 = r1 - r0
            android.content.Context r0 = r2.requireContext()
            int r0 = X.DbY.A01(r0)
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1066192077(0x3f8ccccd, float:1.1)
            float r1 = r1 / r0
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x012f:
            java.lang.Object r0 = r5.A01
            X.H0d r0 = (X.C54134H0d) r0
            X.0eM r0 = r0.A0A
            int r0 = X.DbX.A07(r0)
            float r1 = (float) r0
            r0 = 1071877689(0x3fe38e39, float:1.7777778)
            float r1 = r1 * r0
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x0144:
            java.lang.Object r2 = r5.A01
            X.H0d r2 = (X.C54134H0d) r2
            X.0eM r0 = r2.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.H6E r2 = new X.H6E
            r2.<init>(r1, r0)
            return r2
        L_0x0158:
            java.lang.Object r2 = r5.A01
            X.H0T r2 = (X.H0T) r2
            X.0eM r0 = r2.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r2.A00
            X.AnonymousClass7TG.A1N(r1, r0)
            X.H6D r2 = new X.H6D
            r2.<init>(r1, r0)
            return r2
        L_0x016d:
            java.lang.Object r0 = r5.A01
            X.07f r2 = X.C51971G9r.A0U(r0)
            return r2
        L_0x0174:
            java.lang.Object r0 = r5.A01
            X.H0T r0 = (X.H0T) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.AYm r2 = X.C394779yg.A00(r0)
            return r2
        L_0x0183:
            java.lang.Object r0 = r5.A01
            X.H0T r0 = (X.H0T) r0
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.8A2 r2 = X.AnonymousClass8A1.A01(r0)
            return r2
        L_0x0192:
            java.lang.Object r0 = r5.A01
            X.H0T r0 = (X.H0T) r0
            X.0eM r0 = r0.A05
            X.27r r2 = X.C51971G9r.A0g(r0)
            return r2
        L_0x019d:
            java.lang.Object r0 = r5.A01
            X.H0T r0 = (X.H0T) r0
            androidx.fragment.app.FragmentActivity r3 = r0.requireActivity()
            X.0eM r0 = r0.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.80c r2 = new X.80c
            r2.<init>(r3, r1, r0, r0)
            return r2
        L_0x01b2:
            java.lang.Object r0 = r5.A01
            X.HFq r0 = (X.C54484HFq) r0
            X.0eM r0 = r0.A04
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329010938003163(0x81110b00003edb, double:3.037951030154026E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x01c8:
            java.lang.Object r0 = r5.A01
            X.Gh6 r0 = (X.C53015Gh6) r0
            com.instagram.common.session.UserSession r3 = r0.A02
            X.0Tu r2 = X.AnonymousClass7TF.A0H(r3)
            r0 = 36323972941753999(0x810c7600062e8f, double:3.034764981039672E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x01dc:
            java.lang.Object r1 = r5.A01
            X.GjI r1 = (X.C53146GjI) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r0 = r1.A00
            android.content.Context r1 = r0.getContext()
            r0 = 0
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r2.<init>(r1, r0, r0)
            return r2
        L_0x01ef:
            java.lang.Object r1 = r5.A01
            r0 = 3
            X.GiT r2 = new X.GiT
            r2.<init>(r1, r0)
            return r2
        L_0x01f8:
            java.lang.Object r1 = r5.A01
            r0 = 2
            X.GiT r2 = new X.GiT
            r2.<init>(r1, r0)
            return r2
        L_0x0201:
            java.lang.Object r0 = r5.A01
            X.H18 r0 = (X.H18) r0
            X.Idg r2 = new X.Idg
            r2.<init>(r0)
            return r2
        L_0x020b:
            java.lang.Object r0 = r5.A01
            X.H18 r0 = (X.H18) r0
            X.Gh6 r0 = X.C51968G9o.A0q(r0)
            r0.A00()
            goto L_0x0232
        L_0x0217:
            java.lang.Object r3 = r5.A01
            X.H18 r3 = (X.H18) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r0 = r3.A0M
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.28D r0 = X.28D.A2B
            X.I4Q.A00(r2, r0, r3, r1)
            goto L_0x0232
        L_0x022b:
            java.lang.Object r0 = r5.A01
            androidx.paging.PagingDataAdapter r0 = (androidx.paging.PagingDataAdapter) r0
            r0.A05()
        L_0x0232:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0235:
            java.lang.Object r0 = r5.A01
            X.H18 r0 = (X.H18) r0
            X.0eM r0 = r0.A0M
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323972941753999(0x810c7600062e8f, double:3.034764981039672E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x024b:
            java.lang.Object r0 = r5.A01
            X.H18 r0 = (X.H18) r0
            X.0eM r0 = r0.A0M
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323972941819536(0x810c7600072e90, double:3.034764981081118E-306)
            java.lang.Boolean r2 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r2
        L_0x0261:
            java.lang.Object r0 = r5.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x0268:
            java.lang.Object r0 = r5.A01
            X.H18 r0 = (X.H18) r0
            X.0eM r0 = r0.A0M
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H6C r2 = new X.H6C
            r2.<init>(r0)
            return r2
        L_0x0278:
            java.lang.Object r2 = r5.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r0 = r2.requireContext()
            int r1 = X.AnonymousClass0nB.A01(r0)
            android.content.Context r0 = r2.requireContext()
            int r0 = X.AnonymousClass7TG.A02(r0)
            int r0 = r0 * 2
            int r1 = r1 - r0
            android.content.Context r0 = r2.requireContext()
            int r0 = X.DbY.A01(r0)
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1070386381(0x3fcccccd, float:1.6)
            float r1 = r1 / r0
            int r0 = (int) r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x02a3:
            java.lang.Object r2 = r5.A01
            X.H18 r2 = (X.H18) r2
            X.0eM r0 = r2.A0M
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            X.H6E r2 = new X.H6E
            r2.<init>(r1, r0)
            return r2
        L_0x02b7:
            java.lang.Object r2 = r5.A01
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58673Ivi.invoke():java.lang.Object");
    }
}
