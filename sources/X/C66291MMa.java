package X;

/* renamed from: X.MMa  reason: case insensitive filesystem */
public final class C66291MMa extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66291MMa(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static C66291MMa A00(Object obj, Object obj2, int i) {
        return new C66291MMa(i, obj, obj2);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.Ksf, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02fd, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010c, code lost:
        r1.invoke(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012f, code lost:
        if (r0 == null) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0131, code lost:
        r0.invoke();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r2 = r21
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x02f0;
                case 1: goto L_0x02e2;
                case 2: goto L_0x0037;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x0037;
                case 6: goto L_0x029c;
                case 7: goto L_0x0007;
                case 8: goto L_0x0007;
                case 9: goto L_0x0037;
                case 10: goto L_0x0037;
                case 11: goto L_0x0249;
                case 12: goto L_0x0234;
                case 13: goto L_0x0227;
                case 14: goto L_0x0037;
                case 15: goto L_0x001a;
                case 16: goto L_0x020d;
                case 17: goto L_0x01e4;
                case 18: goto L_0x01c3;
                case 19: goto L_0x01af;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x0007;
                case 23: goto L_0x0007;
                case 24: goto L_0x0152;
                case 25: goto L_0x0007;
                case 26: goto L_0x0037;
                case 27: goto L_0x0007;
                case 28: goto L_0x0007;
                case 29: goto L_0x0007;
                case 30: goto L_0x0007;
                case 31: goto L_0x0007;
                case 32: goto L_0x0136;
                case 33: goto L_0x0007;
                case 34: goto L_0x0124;
                case 35: goto L_0x0111;
                case 36: goto L_0x0007;
                case 37: goto L_0x0037;
                case 38: goto L_0x0037;
                case 39: goto L_0x0007;
                case 40: goto L_0x0007;
                case 41: goto L_0x0007;
                case 42: goto L_0x0102;
                case 43: goto L_0x0037;
                case 44: goto L_0x0037;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x00fb;
                case 48: goto L_0x0056;
                case 49: goto L_0x0037;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0013
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0019
        L_0x0013:
            java.lang.Object r0 = r2.A02
            X.2YQ r5 = X.JTU.A08(r0)
        L_0x0019:
            return r5
        L_0x001a:
            java.lang.Object r0 = r2.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x002e
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x002e
            X.2YM r5 = r1.getDefaultViewModelProviderFactory()
            if (r5 != 0) goto L_0x0019
        L_0x002e:
            java.lang.Object r0 = r2.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r5 = r0.getDefaultViewModelProviderFactory()
            return r5
        L_0x0037:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0043
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0019
        L_0x0043:
            java.lang.Object r0 = r2.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x02fe
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x02fe
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
            return r5
        L_0x0056:
            java.lang.Object r5 = r2.A02
            X.H0n r5 = (X.C54143H0n) r5
            java.lang.Object r0 = r2.A01
            X.4gU r0 = (X.C270284gU) r0
            r0.getValue()
            X.0eM r0 = r5.A02
            java.lang.Object r3 = r0.getValue()
            com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel r3 = (com.instagram.creation.genai.contextualbackground.domain.ContextualBackgroundViewModel) r3
            X.Hpx r2 = r3.A00
            X.0Ud r0 = r3.A0A
            java.lang.Object r0 = r0.getValue()
            X.Jvo r0 = (X.C61050Jvo) r0
            java.lang.Object r0 = r0.A05
            X.IQK r0 = (X.IQK) r0
            r8 = 0
            if (r0 == 0) goto L_0x00f9
            X.Ja7 r0 = r0.A01
            java.lang.String r1 = r0.A02
        L_0x007e:
            r11 = 0
            java.lang.String r0 = "AI_CONTEXTUAL_BACKGROUND_DONE"
            r2.A00(r0, r1)
            X.05G r0 = r3.A07
            java.lang.Object r0 = r0.getValue()
            X.L4A r0 = (X.L4A) r0
            if (r0 == 0) goto L_0x0090
            X.IQK r8 = r0.A01
        L_0x0090:
            com.instagram.common.session.UserSession r1 = r3.A01
            X.8ZA r0 = new X.8ZA
            r0.<init>(r1)
            X.8WA r4 = new X.8WA
            r4.<init>(r1)
            X.8Z0 r0 = r0.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.8WC> r2 = X.AnonymousClass8WC.class
            r1 = 41
            X.MIz r0 = new X.MIz
            r0.<init>(r4, r1)
            X.3pa r7 = r3.A00(r2, r0)
            X.8WC r7 = (X.AnonymousClass8WC) r7
            if (r8 != 0) goto L_0x00c0
            X.0V2 r1 = r7.A00
            X.LLJ r0 = X.LLJ.A00
            r1.FIA(r0)
        L_0x00ba:
            r0 = 1
            X.C54143H0n.A00(r5, r0)
            goto L_0x02fb
        L_0x00c0:
            X.Kgo r6 = X.C62498Kgo.LAUNCHED_FROM_CAMERA
            android.graphics.Bitmap r4 = r8.A00
            com.instagram.api.schemas.CameraTool r9 = com.instagram.api.schemas.CameraTool.AI_CONTEXTUAL_BACKGROUND
            X.Ja7 r8 = r8.A01
            java.lang.Object r0 = r8.A01
            X.Jw8 r0 = (X.C61070Jw8) r0
            java.lang.String r13 = r0.A03
            java.lang.Object r10 = r0.A01
            X.LFv r10 = (X.C63968LFv) r10
            java.lang.String r3 = r8.A02
            java.lang.String r2 = r8.A03
            java.lang.String r1 = r8.A04
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            java.lang.String r0 = r8.A05
            java.lang.String r15 = "contextual_background"
            X.JuX r8 = new X.JuX
            r14 = r11
            r16 = r11
            r18 = r2
            r19 = r1
            r20 = r0
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.JwM r1 = new X.JwM
            r1.<init>((android.graphics.Bitmap) r4, (X.C60975JuX) r8, (X.C62498Kgo) r6)
            X.05G r0 = r7.A01
            r0.Epw(r1)
            goto L_0x00ba
        L_0x00f9:
            r1 = r8
            goto L_0x007e
        L_0x00fb:
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A01
            goto L_0x010c
        L_0x0102:
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r2.A02
            X.Glg r0 = (X.C53294Glg) r0
            java.lang.String r0 = r0.A02
        L_0x010c:
            r1.invoke(r0)
            goto L_0x02fb
        L_0x0111:
            java.lang.Object r1 = r2.A02
            X.8gR r1 = (X.C361568gR) r1
            monitor-enter(r1)
            X.0sn r0 = X.0sn.A00     // Catch:{ all -> 0x0121 }
            r1.A00 = r0     // Catch:{ all -> 0x0121 }
            r0 = 0
            r1.A01 = r0     // Catch:{ all -> 0x0121 }
            monitor-exit(r1)
            java.lang.Object r0 = r2.A01
            goto L_0x012d
        L_0x0121:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0124:
            java.lang.Object r0 = r2.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            java.lang.Object r0 = r2.A02
        L_0x012d:
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x02fb
            r0.invoke()
            goto L_0x02fb
        L_0x0136:
            java.lang.Object r3 = r2.A02
            java.lang.Object r2 = r2.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 370(0x172, float:5.18E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r2, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r2
            r1 = 4
            X.LYi r0 = new X.LYi
            r0.<init>(r1, r3, r2)
            r2.CNi(r0)
            goto L_0x02fb
        L_0x0152:
            java.lang.Object r6 = r2.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r2.A02
            com.instagram.common.session.UserSession r7 = (com.instagram.common.session.UserSession) r7
            X.2MY r2 = com.instagram.creation.persistence.CreationDatabase.A00
            java.lang.Class<com.instagram.creation.persistence.CreationDatabase> r0 = com.instagram.creation.persistence.CreationDatabase.class
            java.lang.Object r1 = r7.A00(r0)
            com.instagram.roomdb.IgRoomDatabase r1 = (com.instagram.roomdb.IgRoomDatabase) r1
            if (r1 != 0) goto L_0x0170
            monitor-enter(r2)
            com.instagram.roomdb.IgRoomDatabase r1 = X.JTT.A0h(r7, r2)     // Catch:{ all -> 0x016c }
            goto L_0x016f
        L_0x016c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x016f:
            monitor-exit(r2)
        L_0x0170:
            com.instagram.creation.persistence.CreationDatabase r1 = (com.instagram.creation.persistence.CreationDatabase) r1
            com.instagram.creation.persistence.CreationDatabase_Impl r1 = (com.instagram.creation.persistence.CreationDatabase_Impl) r1
            X.2NS r0 = r1.A03
            if (r0 == 0) goto L_0x019c
            X.2NS r9 = r1.A03
        L_0x017a:
            X.Ksf r8 = new X.Ksf
            r8.<init>()
            X.12T r1 = X.AnonymousClass12T.A00
            X.4CZ r11 = r1.A04
            X.454 r10 = X.AnonymousClass454.A00(r6)
            X.0qQ.A07(r10)
            com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository r5 = new com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 645279623(0x26762f87, float:8.5412807E-16)
            X.19S r1 = X.DbY.A0r(r1, r0)
            r0 = 43
            X.AnonymousClass7TF.A1K(r5, r1, r0)
            return r5
        L_0x019c:
            monitor-enter(r1)
            X.2NS r0 = r1.A03     // Catch:{ all -> 0x01ac }
            if (r0 != 0) goto L_0x01a8
            X.2NS r0 = new X.2NS     // Catch:{ all -> 0x01ac }
            r0.<init>(r1)     // Catch:{ all -> 0x01ac }
            r1.A03 = r0     // Catch:{ all -> 0x01ac }
        L_0x01a8:
            X.2NS r9 = r1.A03     // Catch:{ all -> 0x01ac }
            monitor-exit(r1)     // Catch:{ all -> 0x01ac }
            goto L_0x017a
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01ac }
            throw r0
        L_0x01af:
            java.lang.Object r1 = r2.A02
            X.9Yt r1 = (X.C380589Yt) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r3 = r1.A05
            java.lang.Object r2 = r2.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 1
            r0 = 0
            X.86t r5 = new X.86t
            r5.<init>(r2, r3, r1, r0)
            return r5
        L_0x01c3:
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r0)
            X.LeA r3 = new X.LeA
            r3.<init>()
            java.lang.Object r2 = r2.A02
            X.9Yt r2 = (X.C380589Yt) r2
            r0 = 1
            X.AZz r1 = new X.AZz
            r1.<init>(r2, r0)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r0 = r2.A05
            X.876 r5 = new X.876
            r5.<init>(r4, r3, r0, r1)
            return r5
        L_0x01e4:
            java.lang.Object r0 = r2.A02
            X.Lgk r0 = (X.C64711Lgk) r0
            X.Jkr r3 = r0.A0M
            java.lang.Object r0 = r2.A01
            X.8RH r0 = (X.AnonymousClass8RH) r0
            X.8RS r0 = (X.AnonymousClass8RS) r0
            int r1 = r0.getSegmentIndex()
            r3.A03(r1)
            X.KM0 r3 = (X.KM0) r3
            int r0 = r3.A00
            r3.A00 = r1
            int r0 = r0 * 2
            int r0 = r0 + 1
            r3.notifyItemChanged(r0)
            int r0 = r1 * 2
            int r0 = r0 + 1
            r3.notifyItemChanged(r0)
            goto L_0x02fb
        L_0x020d:
            java.lang.Object r3 = r2.A02
            X.Lgk r3 = (X.C64711Lgk) r3
            X.Jkr r1 = r3.A0M
            X.KM0 r1 = (X.KM0) r1
            if (r1 == 0) goto L_0x021e
            java.lang.Object r0 = r2.A01
            X.8RH r0 = (X.AnonymousClass8RH) r0
            r1.A08(r0)
        L_0x021e:
            java.lang.Object r0 = r2.A01
            X.8RH r0 = (X.AnonymousClass8RH) r0
            X.C64711Lgk.A00(r3, r0)
            goto L_0x02fb
        L_0x0227:
            java.lang.Object r1 = r2.A02
            X.KMS r1 = (X.KMS) r1
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            r1.A0P(r0)
            goto L_0x02fb
        L_0x0234:
            java.lang.Object r0 = r2.A01
            X.DbS.A1U(r0)
            java.lang.Object r0 = r2.A02
            X.KMS r0 = (X.KMS) r0
            r1 = 1
            r0.A02 = r1
            X.LaF r0 = r0.A0F
            android.view.GestureDetector r0 = r0.A02
            r0.setIsLongpressEnabled(r1)
            goto L_0x02fb
        L_0x0249:
            java.lang.Object r4 = r2.A02
            X.KMT r4 = (X.KMT) r4
            X.8RF r0 = r4.A0H
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.AnonymousClass8Rc
            r6 = 0
            if (r0 == 0) goto L_0x0297
            X.JlR r7 = r4.A0C
            X.KMu r8 = r4.A0J
            X.LTY r0 = r8.A01
            int r5 = X.JTS.A03(r0)
            X.LRe r0 = r4.A0B
            java.lang.Integer[] r3 = r0.A02
            int r1 = X.JTO.A0A(r3, r6)
            r12 = 1
            int r0 = X.JTO.A0A(r3, r12)
            r7.A01(r5, r1, r0)
            int r9 = r4.A01
            int r10 = X.JTO.A0A(r3, r6)
            int r11 = X.JTO.A0A(r3, r12)
            java.lang.Object r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r13 = X.AnonymousClass7TF.A1W(r1, r0)
            r8.A0Y(r9, r10, r11, r12, r13)
            int r1 = X.JTO.A0A(r3, r6)
            int r0 = X.JTO.A0A(r3, r12)
            X.KMT.A03(r4, r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)
            return r5
        L_0x0297:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L_0x029c:
            java.lang.Object r3 = r2.A02
            X.KMU r3 = (X.KMU) r3
            X.JlQ r6 = r3.A0D
            X.KMt r7 = r3.A0H
            X.LTY r0 = r7.A01
            int r5 = X.JTS.A03(r0)
            X.LRe r0 = r3.A0B
            java.lang.Integer[] r4 = r0.A02
            r0 = 0
            int r1 = X.JTO.A0A(r4, r0)
            r0 = 1
            int r0 = X.JTO.A0A(r4, r0)
            r6.A01(r5, r1, r0)
            int r8 = r3.A05
            r13 = 0
            int r9 = X.JTO.A0A(r4, r13)
            r11 = 1
            int r10 = X.JTO.A0A(r4, r11)
            java.lang.Object r1 = r2.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r12 = X.AnonymousClass7TF.A1W(r1, r0)
            r7.A0U(r8, r9, r10, r11, r12, r13)
            int r1 = X.JTO.A0A(r4, r13)
            int r0 = X.JTO.A0A(r4, r11)
            X.KMU.A04(r3, r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)
            return r5
        L_0x02e2:
            java.lang.Object r1 = r2.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r2.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8w4 r5 = new X.8w4
            r5.<init>(r1, r0)
            return r5
        L_0x02f0:
            java.lang.Object r0 = r2.A02
            com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore r0 = (com.instagram.creation.capture.quickcapture.storydrafts.model.StoryDraftsStore) r0
            java.util.List r1 = r0.A04
            java.lang.Object r0 = r2.A01
            r1.remove(r0)
        L_0x02fb:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x02fe:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66291MMa.invoke():java.lang.Object");
    }
}
