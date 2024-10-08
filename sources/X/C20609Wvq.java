package X;

/* renamed from: X.Wvq  reason: case insensitive filesystem */
public final class C20609Wvq extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20609Wvq(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029a, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x031e, code lost:
        if (r3.A01 != -1) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018f, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0196, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 1: goto L_0x000c;
                case 2: goto L_0x0013;
                case 3: goto L_0x0023;
                case 4: goto L_0x006e;
                case 5: goto L_0x0185;
                case 6: goto L_0x00c0;
                case 7: goto L_0x0206;
                case 8: goto L_0x021c;
                case 9: goto L_0x022e;
                case 10: goto L_0x0240;
                case 11: goto L_0x024e;
                case 12: goto L_0x025c;
                case 13: goto L_0x026e;
                case 14: goto L_0x0275;
                case 15: goto L_0x0005;
                case 16: goto L_0x000c;
                case 17: goto L_0x0278;
                case 18: goto L_0x0288;
                case 19: goto L_0x00a1;
                case 20: goto L_0x0275;
                case 21: goto L_0x0005;
                case 22: goto L_0x000c;
                case 23: goto L_0x029b;
                case 24: goto L_0x02ab;
                case 25: goto L_0x02bc;
                case 26: goto L_0x02d8;
                case 27: goto L_0x02ec;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0005;
                case 31: goto L_0x0005;
                case 32: goto L_0x0005;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x0005;
                case 36: goto L_0x0005;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x0005;
                case 40: goto L_0x0005;
                case 41: goto L_0x0005;
                case 42: goto L_0x02f6;
                case 43: goto L_0x0300;
                case 44: goto L_0x0326;
                case 45: goto L_0x033b;
                case 46: goto L_0x0342;
                case 47: goto L_0x0349;
                case 48: goto L_0x0353;
                case 49: goto L_0x0360;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            java.lang.Object r3 = X.DbT.A0r(r0)
            return r3
        L_0x000c:
            java.lang.Object r0 = r13.A01
            X.07f r3 = X.DbY.A0I(r0)
            return r3
        L_0x0013:
            java.lang.Object r0 = r13.A01
            X.K4z r0 = (X.C61381K4z) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBZ r3 = new X.KBZ
            r3.<init>(r0)
            return r3
        L_0x0023:
            java.lang.Object r4 = r13.A01
            X.E1T r4 = (X.E1T) r4
            java.lang.Integer r0 = r4.A01
            if (r0 != 0) goto L_0x0032
            java.lang.String r3 = "linkingType"
        L_0x002d:
            X.0qQ.A0F(r3)
            goto L_0x0192
        L_0x0032:
            int r1 = r0.intValue()
            r0 = 0
            java.lang.String r3 = "entryPoint"
            if (r1 == r0) goto L_0x0052
            r0 = 2
            if (r1 == r0) goto L_0x0052
            r0 = 1
            if (r1 != r0) goto L_0x0068
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x002d
            X.JwB r0 = r4.A00
            if (r0 != 0) goto L_0x0062
            java.lang.String r3 = "additionalConfig"
            goto L_0x002d
        L_0x0052:
            X.0eM r0 = r4.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x002d
            X.FTx r3 = new X.FTx
            r3.<init>(r4, r1, r0)
            return r3
        L_0x0062:
            X.FTy r3 = new X.FTy
            r3.<init>(r4, r0, r2, r1)
            return r3
        L_0x0068:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x006e:
            java.lang.Object r0 = r13.A01
            X.DkP r0 = (X.C46736DkP) r0
            X.EtW r0 = r0.A00
            r1 = 10
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.String r0 = "business/account/get_story_highlights/"
            r2.A0A(r0)
            java.lang.String r0 = "item_limit"
            r2.A0C(r0, r1)
            java.lang.Class<X.K0k> r1 = X.C61275K0k.class
            java.lang.Class<X.LH7> r0 = X.LH7.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r0 = 1422754593(0x54cd8321, float:7.0613462E12)
            X.032 r2 = r1.A03(r0)
            r1 = 18
            X.MC9 r0 = new X.MC9
            r0.<init>(r2, r1)
            androidx.lifecycle.CoroutineLiveData r3 = X.DbT.A0G(r0)
            return r3
        L_0x00a1:
            java.lang.Object r3 = r13.A01
            X.Gw5 r3 = (X.C53899Gw5) r3
            boolean r2 = r3.A04
            X.0sP r1 = r3.A01
            if (r2 == 0) goto L_0x00bd
            X.GKd r0 = X.C52236GKd.A0P
        L_0x00ad:
            r1.invoke(r0)
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0298
            X.0sP r1 = r3.A02
            r0 = r2 ^ 1
            X.C51968G9o.A1O(r1, r0)
            goto L_0x0298
        L_0x00bd:
            X.GKd r0 = X.C52236GKd.A0Q
            goto L_0x00ad
        L_0x00c0:
            java.lang.Object r11 = r13.A01
            X.Uh3 r11 = (X.C15697Uh3) r11
            X.VXo r0 = r11.A0L
            r2 = 0
            android.content.Context r0 = r0.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131624413(0x7f0e01dd, float:1.8876005E38)
            android.view.View r3 = X.DbT.A0C(r1, r2, r0)
            X.0qQ.A0A(r3)
            X.VaP r0 = new X.VaP
            r0.<init>(r3)
            r3.setTag(r0)
            r0 = 2131435577(0x7f0b2039, float:1.8493E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbT.A0I(r3, r0)
            r11.A01 = r0
            android.content.Context r8 = r11.A0F
            r0 = 4
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r2.<init>(r8, r0)
            r1 = 2
            X.U9T r0 = new X.U9T
            r0.<init>(r11, r1)
            r2.A01 = r0
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            java.lang.String r6 = "recyclerView"
            if (r0 == 0) goto L_0x0181
            r0.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            if (r0 == 0) goto L_0x0181
            X.UAS r10 = r11.A0M
            r0.setAdapter(r10)
            androidx.recyclerview.widget.RecyclerView r1 = r11.A01
            if (r1 == 0) goto L_0x0181
            r0 = 1
            r1.A0S = r0
            r1.requestFocus()
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            if (r0 == 0) goto L_0x0181
            r0.setOnKeyListener(r11)
            androidx.recyclerview.widget.RecyclerView r9 = r11.A01
            if (r9 == 0) goto L_0x0181
            com.instagram.common.session.UserSession r12 = r11.A0O
            X.Ugx r7 = new X.Ugx
            r7.<init>(r8, r9, r10, r11, r12)
            r11.A06 = r7
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            if (r0 == 0) goto L_0x0181
            X.Ugs r1 = new X.Ugs
            r1.<init>(r8, r0)
            X.2jd r2 = r11.A0G
            X.Ugx r0 = r11.A06
            java.lang.String r5 = "videoModule"
            if (r0 == 0) goto L_0x018f
            r2.A0E(r0)
            r2.A0E(r1)
            X.Ugx r0 = r11.A06
            if (r0 == 0) goto L_0x018f
            r10.A01 = r0
            boolean r1 = r11.A0U
            X.Ugu r0 = new X.Ugu
            r0.<init>(r12, r11, r1)
            r11.A03 = r0
            java.lang.String r5 = "analyticsHelper"
            r2.A0E(r0)
            X.WWs r4 = new X.WWs
            r4.<init>(r10)
            androidx.recyclerview.widget.RecyclerView r2 = r11.A01
            if (r2 == 0) goto L_0x0181
            X.Ugu r1 = r11.A03
            if (r1 == 0) goto L_0x018f
            X.Ulm r0 = new X.Ulm
            r0.<init>(r2, r1, r4)
            X.30d[] r0 = new X.C2355130d[]{r0}
            X.UAp r1 = new X.UAp
            r1.<init>(r2, r4, r0)
            r11.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r11.A01
            if (r0 == 0) goto L_0x0181
            r0.A15(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r11.A01
            if (r1 == 0) goto L_0x0181
            int r0 = r11.A0C
            X.0nA.A0c(r1, r0)
            return r3
        L_0x0181:
            X.0qQ.A0F(r6)
            goto L_0x0192
        L_0x0185:
            java.lang.Object r0 = r13.A01
            X.I09 r0 = (X.I09) r0
            X.SVf r4 = r0.A00
            if (r4 != 0) goto L_0x0197
            java.lang.String r5 = "framesHandler"
        L_0x018f:
            X.0qQ.A0F(r5)
        L_0x0192:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0197:
            X.7v0 r0 = r4.A0A
            r3 = 0
            r0.A01()
            android.view.Surface r0 = r4.A03
            if (r0 != 0) goto L_0x01a4
            java.lang.String r5 = "surface"
            goto L_0x018f
        L_0x01a4:
            r0.release()
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A01 = r0
            r4.A00 = r0
            java.util.List r2 = r4.A0N
            java.util.Iterator r1 = r2.iterator()
        L_0x01b3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r1.next()
            X.8tg r0 = (X.C369008tg) r0
            r0.A01()
            goto L_0x01b3
        L_0x01c3:
            r2.clear()
            android.view.Surface r0 = r4.A05
            if (r0 == 0) goto L_0x01cd
            r0.release()
        L_0x01cd:
            r4.A05 = r3
            X.7uK r0 = r4.A09
            if (r0 == 0) goto L_0x01d6
            r0.A02()
        L_0x01d6:
            r4.A09 = r3
            android.view.Surface r0 = r4.A04
            if (r0 == 0) goto L_0x01df
            r0.release()
        L_0x01df:
            r4.A04 = r3
            X.7uK r0 = r4.A08
            if (r0 == 0) goto L_0x01e8
            r0.A02()
        L_0x01e8:
            r4.A08 = r3
            X.AHA r0 = r4.A0D
            if (r0 != 0) goto L_0x01f1
            java.lang.String r5 = "boomerangFramesGLRenderer"
            goto L_0x018f
        L_0x01f1:
            r0.A02()
            X.7s6 r0 = r4.A06
            if (r0 != 0) goto L_0x01fb
            java.lang.String r5 = "selfEGLCore"
            goto L_0x018f
        L_0x01fb:
            r0.release()
            java.util.concurrent.atomic.AtomicInteger r1 = r4.A0O
            r0 = 5
            r1.set(r0)
            goto L_0x0298
        L_0x0206:
            java.lang.Object r0 = r13.A01
            X.VaP r0 = (X.C17571VaP) r0
            android.view.ViewGroup r4 = r0.A03
            r2 = 0
            android.view.LayoutInflater r1 = X.DbX.A0F(r4, r2)
            r0 = 2131624419(0x7f0e01e3, float:1.8876017E38)
            android.view.View r3 = X.DbT.A0D(r1, r4, r0, r2)
            r4.addView(r3)
            return r3
        L_0x021c:
            java.lang.Object r0 = r13.A01
            X.UB3 r0 = (X.UB3) r0
            X.0eM r0 = r0.A0C
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429892(0x7f0b0a04, float:1.848147E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x022e:
            java.lang.Object r0 = r13.A01
            X.UB3 r0 = (X.UB3) r0
            X.0eM r0 = r0.A0C
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131429895(0x7f0b0a07, float:1.8481476E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x0240:
            java.lang.Object r0 = r13.A01
            X.UB3 r0 = (X.UB3) r0
            android.view.View r1 = r0.A06
            r0 = 2131433074(0x7f0b1672, float:1.8487923E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x024e:
            java.lang.Object r0 = r13.A01
            X.UB3 r0 = (X.UB3) r0
            android.view.View r1 = r0.A06
            r0 = 2131442363(0x7f0b3abb, float:1.8506764E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x025c:
            java.lang.Object r0 = r13.A01
            X.UB3 r0 = (X.UB3) r0
            X.0eM r0 = r0.A0C
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131442364(0x7f0b3abc, float:1.8506766E38)
            android.view.View r3 = X.AnonymousClass7TF.A0G(r1, r0)
            return r3
        L_0x026e:
            java.lang.Object r0 = r13.A01
            X.VsT r0 = (X.C18477VsT) r0
            X.VXq r3 = r0.A00
            return r3
        L_0x0275:
            java.lang.Object r3 = r13.A01
            return r3
        L_0x0278:
            java.lang.Object r0 = r13.A01
            X.E2R r0 = (X.E2R) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEc r3 = new X.EEc
            r3.<init>(r0)
            return r3
        L_0x0288:
            java.lang.Object r2 = r13.A01
            X.Gw5 r2 = (X.C53899Gw5) r2
            X.0sP r1 = r2.A01
            X.GKd r0 = X.C52236GKd.A0O
            r1.invoke(r0)
            X.0sa r0 = r2.A00
            r0.invoke()
        L_0x0298:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x029b:
            java.lang.Object r0 = r13.A01
            X.E1g r0 = (X.C47412E1g) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.EEd r3 = new X.EEd
            r3.<init>(r0)
            return r3
        L_0x02ab:
            java.lang.Object r0 = r13.A01
            X.LsJ r0 = (X.C65378LsJ) r0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1Am r1 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A1y
            X.0xa r3 = r1.A03(r0)
            return r3
        L_0x02bc:
            java.lang.Object r0 = r13.A01
            X.L9W r0 = (X.L9W) r0
            android.content.Context r1 = r0.A01
            if (r1 == 0) goto L_0x02d5
            X.0qg.A01()
            r0 = 1
            long r2 = X.0qg.A00(r1, r0)
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r0
        L_0x02d0:
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            return r3
        L_0x02d5:
            r2 = -1
            goto L_0x02d0
        L_0x02d8:
            java.lang.Object r0 = r13.A01
            X.L9W r0 = (X.L9W) r0
            android.content.Context r0 = r0.A01
            if (r0 == 0) goto L_0x02e9
            int r0 = X.AnonymousClass0Ke.A00(r0)
        L_0x02e4:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x02e9:
            r0 = 2014(0x7de, float:2.822E-42)
            goto L_0x02e4
        L_0x02ec:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.FZ1 r3 = new X.FZ1
            r3.<init>(r0)
            return r3
        L_0x02f6:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.GJG r3 = new X.GJG
            r3.<init>(r0)
            return r3
        L_0x0300:
            java.lang.Object r3 = r13.A01
            X.GLA r3 = (X.GLA) r3
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0320
            java.lang.String r1 = r3.A03
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0320
            int r0 = r3.A00
            r2 = -1
            if (r0 != r2) goto L_0x0320
            java.lang.String r0 = r3.A04
            if (r0 != 0) goto L_0x0320
            int r1 = r3.A01
            r0 = 1
            if (r1 == r2) goto L_0x0321
        L_0x0320:
            r0 = 0
        L_0x0321:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0326:
            java.lang.Object r0 = r13.A01
            com.instagram.clips.audio.model.AudioPageAssetModel r0 = (com.instagram.clips.audio.model.AudioPageAssetModel) r0
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x0339
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0339
            java.lang.String r3 = r0.toString()
            return r3
        L_0x0339:
            r3 = 0
            return r3
        L_0x033b:
            java.lang.Object r0 = r13.A01
            X.07f r3 = X.C51971G9r.A0U(r0)
            return r3
        L_0x0342:
            java.lang.Object r0 = r13.A01
            X.2YM r3 = X.JTR.A0b(r0)
            return r3
        L_0x0349:
            java.lang.Object r0 = r13.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Hpb r3 = new X.Hpb
            r3.<init>(r0)
            return r3
        L_0x0353:
            java.lang.Object r0 = r13.A01
            com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository r0 = (com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository) r0
            android.content.Context r1 = r0.A06
            com.instagram.common.session.UserSession r0 = r0.A07
            X.2Nn r3 = X.AnonymousClass830.A00(r1, r0)
            return r3
        L_0x0360:
            java.lang.Object r0 = r13.A01
            com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource r0 = (com.instagram.clips.audio.soundsync.repository.data.SoundSyncSuggestedAudioNetworkDataSource) r0
            X.LBu r3 = new X.LBu
            r3.<init>(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20609Wvq.invoke():java.lang.Object");
    }
}
