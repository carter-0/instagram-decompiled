package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.GiT  reason: case insensitive filesystem */
public final class C53095GiT extends C249403jg {
    public final int A00;
    public final Object A01;

    public C53095GiT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int i2;
        int i3;
        switch (this.A00) {
            case 1:
                i2 = AnonymousClass7TG.A0D(recyclerView, -1746607992);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 1) {
                    ((C53901Gw7) this.A01).A03.A0C.Epw(C57159IQy.A00);
                }
                i3 = 233393898;
                break;
            case 7:
                i2 = AnonymousClass0fD.A03(-903918574);
                0qQ.A0B(recyclerView, 0);
                super.onScrollStateChanged(recyclerView, i);
                if (recyclerView.getScrollState() == 1) {
                    GFO gfo = (GFO) this.A01;
                    C51967G9n.A1B(gfo.A0C, true);
                    if (!AnonymousClass7TE.A1a(gfo.A0B.A00)) {
                        gfo.A08();
                    }
                } else if (i == 0) {
                    GFO gfo2 = (GFO) this.A01;
                    if (gfo2.A01 == 2) {
                        2V5 r1 = gfo2.A0C;
                        if (AnonymousClass7TE.A1a(r1.A00)) {
                            C51967G9n.A1B(r1, false);
                            gfo2.A04().Ckt(gfo2.A0D.A0E);
                        }
                    }
                }
                ((GFO) this.A01).A01 = i;
                i3 = 1464580449;
                break;
            default:
                super.onScrollStateChanged(recyclerView, i);
                return;
        }
        AnonymousClass0fD.A0A(i3, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0215, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0218, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x033d, code lost:
        X.AnonymousClass0fD.A0A(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0340, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(androidx.recyclerview.widget.RecyclerView r19, int r20, int r21) {
        /*
            r18 = this;
            r2 = r18
            int r0 = r2.A00
            r3 = r20
            r1 = r21
            r5 = r19
            switch(r0) {
                case 0: goto L_0x02cb;
                case 1: goto L_0x000d;
                case 2: goto L_0x0285;
                case 3: goto L_0x0268;
                case 4: goto L_0x01b4;
                case 5: goto L_0x0154;
                case 6: goto L_0x013e;
                case 7: goto L_0x000d;
                case 8: goto L_0x0011;
                default: goto L_0x000d;
            }
        L_0x000d:
            super.onScrolled(r5, r3, r1)
            return
        L_0x0011:
            r0 = 1304244312(0x4dbd3058, float:3.9675776E8)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r5, r3)
            java.lang.Object r7 = r2.A01
            X.GE5 r7 = (X.GE5) r7
            r9 = 1
            boolean r0 = X.AnonymousClass7TF.A1R(r1)
            r7.A0J = r0
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0030
            r0 = -575979640(0xffffffffddab3f88, float:-1.54246638E18)
            goto L_0x033d
        L_0x0030:
            X.0sa r8 = r7.A0U
            int r4 = X.C52012GBj.A01(r8)
            X.4bN r10 = X.GE5.A00(r7)
            if (r10 != 0) goto L_0x0041
            r0 = 1234179746(0x499016a2, float:1180372.2)
            goto L_0x033d
        L_0x0041:
            X.0sa r0 = r7.A0V
            X.GBg r0 = X.GD6.A01(r0)
            X.GDe r0 = r0.BzC(r10)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x005e
            X.3W8 r0 = r0.A3U
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != r9) goto L_0x005e
        L_0x0059:
            r0 = -1070838836(0xffffffffc02c4bcc, float:-2.6921263)
            goto L_0x033d
        L_0x005e:
            int r2 = r7.A02
            if (r4 != r2) goto L_0x0059
            boolean r0 = r7.A0G
            if (r0 == 0) goto L_0x006b
            int r0 = r7.A03
            if (r2 == r0) goto L_0x006b
            goto L_0x0059
        L_0x006b:
            float r4 = X.AnonymousClass7TE.A03(r5)
            float r0 = r7.A0K
            float r4 = r4 * r0
            int r2 = r7.A02
            java.lang.ref.WeakReference r0 = r7.A0B
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L_0x008e
        L_0x007e:
            X.3pI r0 = r5.A0D
            if (r0 == 0) goto L_0x008e
            android.view.View r0 = r0.A1D(r2)
            if (r0 == 0) goto L_0x008e
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r7.A0B = r0
        L_0x008e:
            java.lang.ref.WeakReference r0 = r7.A0B
            if (r0 == 0) goto L_0x013b
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x013b
            float r15 = r0.getY()
        L_0x009e:
            int r11 = X.C52012GBj.A01(r8)
            if (r21 <= 0) goto L_0x0132
            r14 = 0
            int r0 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0132
            int r0 = X.C52012GBj.A01(r8)
            int r2 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r8.invoke()
            X.GBj r0 = (X.C52012GBj) r0
            X.GD6 r0 = r0.A09
            int r0 = X.GD6.A00(r0)
            if (r0 <= r2) goto L_0x00fc
            java.lang.Object r0 = r8.invoke()
            X.GBj r0 = (X.C52012GBj) r0
            android.view.View r0 = r0.A0A(r2)
            if (r0 == 0) goto L_0x00fc
            android.view.View r2 = r0.getRootView()
            if (r2 == 0) goto L_0x00fc
            java.lang.String r0 = "clips_delayed_skip_ads_watch_in_timer_background"
            android.view.View r12 = r2.findViewWithTag(r0)
            if (r12 == 0) goto L_0x00fc
            r13 = 1065353216(0x3f800000, float:1.0)
            r8 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0137
            float r0 = java.lang.Math.abs(r15)
            float r2 = java.lang.Math.min(r0, r4)
            float r2 = r2 / r4
            r0 = 1058642330(0x3f19999a, float:0.6)
            float r2 = r2 * r0
            float r0 = r13 - r2
        L_0x00f5:
            float r0 = X.C229632nm.A02(r0, r8, r13)
            r12.setAlpha(r0)
        L_0x00fc:
            X.JwK r8 = r7.A0O
            java.lang.Object r2 = r8.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r2 != r0) goto L_0x0126
            boolean r0 = r8.A01
            if (r0 != 0) goto L_0x0126
            int r0 = r7.A02
            if (r0 != r11) goto L_0x0126
            X.JRO r0 = r7.A0Q
            r0.EaB(r10, r9)
            boolean r0 = r7.A0X
            if (r0 != 0) goto L_0x0119
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L_0x011e
        L_0x0119:
            X.2S0 r0 = X.AnonymousClass2S0.A01
            r0.A03()
        L_0x011e:
            r8.A01 = r9
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
        L_0x0126:
            float r0 = java.lang.Math.abs(r15)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0132
            int r0 = -r1
            r5.scrollBy(r3, r0)
        L_0x0132:
            r0 = 1362753767(0x5139f8e7, float:4.9921552E10)
            goto L_0x033d
        L_0x0137:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x00f5
        L_0x013b:
            r15 = 0
            goto L_0x009e
        L_0x013e:
            r0 = 794084554(0x2f54c4ca, float:1.9351201E-10)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrolled(r5, r3, r1)
            java.lang.Object r0 = r2.A01
            X.HJb r0 = (X.C54566HJb) r0
            r0.A00()
            r0 = 1793308965(0x6ae3b925, float:1.3765024E26)
            goto L_0x0215
        L_0x0154:
            r0 = -901693083(0xffffffffca414165, float:-3166297.2)
            int r4 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrolled(r5, r3, r1)
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x01b0
            java.lang.Object r6 = r2.A01
            X.H1I r6 = (X.H1I) r6
            X.0eM r0 = r6.A0B
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1c()
            r0 = -1
            if (r1 == r0) goto L_0x01b0
            X.3kE r3 = r5.A0W(r1)
            boolean r0 = r3 instanceof X.C54566HJb
            if (r0 == 0) goto L_0x01b0
            r2 = r3
            X.HJb r2 = (X.C54566HJb) r2
            java.lang.String r1 = r2.A00
            java.lang.String r0 = "saved"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01a4
            X.0eM r0 = r2.A09
            java.lang.Object r0 = r0.getValue()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1c()
            androidx.recyclerview.widget.RecyclerView r0 = r2.A02
            X.3kE r0 = r0.A0W(r1)
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r0 instanceof X.C53152GjO
            if (r0 == 0) goto L_0x01b0
        L_0x01a4:
            X.GhE r0 = X.C51969G9p.A0o(r6)
            X.05G r0 = r0.A07
            r0.Epw(r3)
            r2.A00()
        L_0x01b0:
            r0 = -1165391177(0xffffffffba898ab7, float:-0.0010493611)
            goto L_0x0215
        L_0x01b4:
            r0 = -1743479813(0xffffffff98149bfb, float:-1.9207302E-24)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r13 = 0
            X.0qQ.A0B(r5, r13)
            super.onScrolled(r5, r3, r1)
            X.3pI r0 = r5.A0D
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r12 = 0
            if (r0 == 0) goto L_0x0212
            int r6 = r0.A1c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            if (r0 == 0) goto L_0x0212
            r0 = -1
            if (r6 == r0) goto L_0x0212
            X.3kE r8 = r5.A0W(r6)
            boolean r0 = r8 instanceof X.C53152GjO
            if (r0 == 0) goto L_0x0219
            X.GjO r8 = (X.C53152GjO) r8
            X.1Xj r0 = r8.A00
            if (r0 == 0) goto L_0x01e8
            java.lang.String r12 = r0.A2n()
        L_0x01e8:
            java.lang.Object r5 = r2.A01
            X.H0d r5 = (X.C54134H0d) r5
            X.0eM r0 = r5.A08
            java.lang.Object r0 = r0.getValue()
            X.GgK r0 = (X.C52967GgK) r0
            r0.A0H(r8)
        L_0x01f7:
            if (r12 == 0) goto L_0x020c
            X.0eM r1 = r5.A0D
            java.lang.Object r0 = r1.getValue()
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel) r0
            r0.currentRecommendationId = r12
            java.lang.Object r0 = r1.getValue()
            com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel r0 = (com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundRecommendationsViewModel) r0
            r0.updateCurrentFeedback()
        L_0x020c:
            java.lang.Object r0 = r2.A01
            X.H0d r0 = (X.C54134H0d) r0
            r0.A00 = r6
        L_0x0212:
            r0 = -249684929(0xfffffffff11e1c3f, float:-7.829245E29)
        L_0x0215:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0219:
            boolean r0 = r8 instanceof com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder
            if (r0 == 0) goto L_0x020c
            com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder r8 = (com.instagram.debug.devoptions.signalsplayground.view.CreatorInspirationSignalsPlaygroundAudioRecommendationsViewHolder) r8
            X.Uq6 r7 = r8.audioTrackItem
            if (r7 == 0) goto L_0x020c
            java.lang.Object r5 = r2.A01
            X.H0d r5 = (X.C54134H0d) r5
            java.lang.String r3 = r7.A07
            X.2xy r1 = r5.A04
            if (r1 == 0) goto L_0x025b
            com.instagram.music.common.model.MusicDataSource r0 = r7.A02
            java.lang.Integer r1 = r1.C9D(r0)
        L_0x0233:
            X.2xy r0 = r5.A04
            if (r0 == 0) goto L_0x023a
            r0.EHu(r13)
        L_0x023a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0253
            X.2xy r9 = r5.A04
            if (r9 == 0) goto L_0x0251
            com.instagram.music.common.model.MusicDataSource r10 = r7.A02
            X.6k3 r11 = r8.trackListener
            if (r11 == 0) goto L_0x025d
            r14 = -1
            r15 = r14
            r16 = r13
            r17 = r13
            r9.ETw(r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0251:
            r12 = r3
            goto L_0x01f7
        L_0x0253:
            X.2xy r0 = r5.A04
            if (r0 == 0) goto L_0x0251
            r0.E2p()
            goto L_0x0251
        L_0x025b:
            r1 = r12
            goto L_0x0233
        L_0x025d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -888128193(0xffffffffcb103d3f, float:-9452863.0)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0268:
            r0 = -1164884014(0xffffffffba9147d2, float:-0.0011084026)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrolled(r5, r3, r1)
            java.lang.Object r2 = r2.A01
            X.GjI r2 = (X.C53146GjI) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A01
            X.Ig4 r0 = new X.Ig4
            r0.<init>(r2)
            r1.post(r0)
            r0 = -1050946171(0xffffffffc15bd585, float:-13.739629)
            goto L_0x033d
        L_0x0285:
            r0 = -1734380122(0xffffffff989f75a6, float:-4.121933E-24)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrolled(r5, r3, r1)
            int r0 = r5.getVisibility()
            if (r0 != 0) goto L_0x02c7
            java.lang.Object r3 = r2.A01
            X.H18 r3 = (X.H18) r3
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.A00
            if (r0 == 0) goto L_0x02c7
            int r1 = r0.A1c()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x02c7
            r0 = -1
            if (r1 == r0) goto L_0x02c7
            X.3kE r2 = r5.A0W(r1)
            boolean r0 = r2 instanceof X.C53146GjI
            if (r0 == 0) goto L_0x02c7
            X.Gh6 r0 = X.C51968G9o.A0q(r3)
            X.05G r0 = r0.A08
            r0.Epw(r2)
            X.GjI r2 = (X.C53146GjI) r2
            androidx.recyclerview.widget.RecyclerView r1 = r2.A01
            X.Ig4 r0 = new X.Ig4
            r0.<init>(r2)
            r1.post(r0)
        L_0x02c7:
            r0 = -514642984(0xffffffffe1532bd8, float:-2.434639E20)
            goto L_0x033d
        L_0x02cb:
            r0 = -1676887805(0xffffffff9c0cb903, float:-4.6561236E-22)
            int r6 = X.AnonymousClass7TG.A0D(r5, r0)
            super.onScrolled(r5, r3, r1)
            X.3pI r1 = r5.A0D
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            java.lang.Object r5 = r2.A01
            X.UaC r5 = (X.C15305UaC) r5
            boolean r0 = r5.A09
            if (r0 != 0) goto L_0x033a
            if (r1 == 0) goto L_0x033a
            int r1 = r1.A1d()
            com.instagram.business.promote.model.PromoteData r0 = r5.A03
            if (r0 != 0) goto L_0x02f5
            java.lang.String r0 = "promoteData"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x02f5:
            java.util.List r0 = r0.A1u
            int r0 = r0.size()
            r4 = 1
            int r0 = r0 - r4
            if (r1 != r0) goto L_0x033a
            java.lang.Boolean r0 = r5.A05
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r4)
            if (r0 == 0) goto L_0x0338
            X.0eM r0 = r5.A0C
            java.lang.Object r0 = r0.getValue()
            X.Ggh r0 = (X.C52990Ggh) r0
            X.Vki r3 = r0.A02
            java.lang.String r2 = r0.A00
            java.lang.String r1 = r0.A03
            com.instagram.api.schemas.LeadGenEntryPoint r0 = com.instagram.api.schemas.LeadGenEntryPoint.PROMOTE
            X.MCA r2 = r3.A00(r0, r1, r2)
            r0 = 16
            X.MC9 r1 = new X.MC9
            r1.<init>(r2, r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r3 = X.C226292g8.A00(r0, r1)
            X.07Z r2 = r5.getViewLifecycleOwner()
            r0 = 48
            X.Iwb r1 = new X.Iwb
            r1.<init>(r5, r0)
            r0 = 11
            X.C51969G9p.A15(r2, r3, r1, r0)
        L_0x0338:
            r5.A09 = r4
        L_0x033a:
            r0 = 890879135(0x3519bc9f, float:5.727142E-7)
        L_0x033d:
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53095GiT.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
