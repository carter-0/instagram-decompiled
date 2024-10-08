package X;

/* renamed from: X.9Lw  reason: invalid class name and case insensitive filesystem */
public final class C377449Lw extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377449Lw(int i, Object obj, Object obj2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0473, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0487, code lost:
        r11.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04eb, code lost:
        r3.A03(r2, r1, r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        if (X.0qQ.A0K(r0, r13) == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05c6, code lost:
        r1 = X.AnonymousClass3WT.SLIDER;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        return X.C60340gF.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
        /*
            r18 = this;
            r1 = r18
            r3 = r20
            r11 = r19
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0036;
                case 1: goto L_0x00e6;
                case 2: goto L_0x0167;
                case 3: goto L_0x04f0;
                case 4: goto L_0x01cd;
                case 5: goto L_0x01e8;
                case 6: goto L_0x0237;
                case 7: goto L_0x026f;
                case 8: goto L_0x02a7;
                case 9: goto L_0x02df;
                case 10: goto L_0x050a;
                case 11: goto L_0x0317;
                case 12: goto L_0x0334;
                case 13: goto L_0x0374;
                case 14: goto L_0x0355;
                case 15: goto L_0x054c;
                case 16: goto L_0x048c;
                case 17: goto L_0x056f;
                case 18: goto L_0x0587;
                case 19: goto L_0x05ad;
                case 20: goto L_0x04a7;
                case 21: goto L_0x04ca;
                default: goto L_0x000b;
            }
        L_0x000b:
            android.view.View r11 = (android.view.View) r11
            X.2n0 r3 = (X.C229202n0) r3
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A02
            X.3YK r0 = (X.AnonymousClass3YK) r0
            X.2el r4 = r0.A01
            if (r4 == 0) goto L_0x0033
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            X.0gF r1 = X.C60340gF.A00
            java.lang.String r0 = r2.getId()
            X.30a r0 = X.AnonymousClass30Y.A00(r2, r1, r0)
            r0.A00(r3)
            X.30Y r0 = r0.A01()
            r4.A05(r11, r0)
        L_0x0033:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0036:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x0049
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x0049:
            boolean r0 = X.0fL.A02()
            r5 = -1
            if (r0 == 0) goto L_0x0058
            r2 = 439830773(0x1a3748f5, float:3.7902447E-23)
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:92)"
            X.0fL.A01(r2, r0)
        L_0x0058:
            java.lang.Object r4 = r1.A01
            X.6I5 r4 = (X.AnonymousClass6I5) r4
            X.0sa r0 = r4.A01
            java.lang.Object r10 = r0.invoke()
            X.6J1 r10 = (X.AnonymousClass6J1) r10
            java.lang.Object r2 = r1.A02
            X.6J7 r2 = (X.AnonymousClass6J7) r2
            int r14 = r2.A00
            int r0 = r10.getItemCount()
            if (r14 >= r0) goto L_0x007c
            java.lang.Object r0 = r10.BK0(r14)
            java.lang.Object r13 = r2.A03
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 != 0) goto L_0x0086
        L_0x007c:
            java.lang.Object r13 = r2.A03
            int r14 = r10.BGq(r13)
            if (r14 == r5) goto L_0x0086
            r2.A00 = r14
        L_0x0086:
            r15 = 0
            r3 = 0
            if (r14 == r5) goto L_0x008b
            r3 = 1
        L_0x008b:
            r1 = 207(0xcf, float:2.9E-43)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r11.ExW(r1, r0)
            boolean r1 = r11.AGv(r3)
            r0 = -869707859(0xffffffffcc294fad, float:-4.4383924E7)
            r11.ExS(r0)
            if (r3 == 0) goto L_0x00e2
            r0 = -2120139493(0xffffffff81a13d1b, float:-5.922974E-38)
            r11.ExS(r0)
            X.6I0 r12 = r4.A00
            X.AnonymousClass6JB.A00(r10, r11, r12, r13, r14, r15)
            r0 = r11
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r15)
        L_0x00b1:
            r0 = r11
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r15)
            r11.ASR()
            boolean r1 = r11.AGw(r2)
            java.lang.Object r0 = r11.ECw()
            if (r1 != 0) goto L_0x00c8
            java.lang.Object r1 = X.AnonymousClass5XT.A00
            if (r0 != r1) goto L_0x00d2
        L_0x00c8:
            r1 = 40
            X.J6G r0 = new X.J6G
            r0.<init>(r2, r1)
            r11.FLL(r0)
        L_0x00d2:
            X.0sP r0 = (X.0sP) r0
            X.C286645Xf.A03(r11, r13, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -874019568(0xffffffffcbe78510, float:-3.034576E7)
            goto L_0x0473
        L_0x00e2:
            r11.ANY(r1)
            goto L_0x00b1
        L_0x00e6:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x00f9
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x00f9:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0107
            r2 = -105431793(0xfffffffff9b73d0f, float:-1.1892859E35)
            java.lang.String r0 = "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)"
            X.0fL.A01(r2, r0)
        L_0x0107:
            java.lang.Object r2 = r1.A02
            X.6Hz r2 = (X.C305436Hz) r2
            r3 = 0
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x011a
            r4 = -554523317(0xffffffffdef2a54b, float:-8.7422318E18)
            java.lang.String r0 = "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:60)"
            X.0fL.A01(r4, r0)
        L_0x011a:
            r0 = -796080049(0xffffffffd08cc84f, float:-1.88955013E10)
            r11.ExS(r0)
            java.lang.Object[] r14 = new java.lang.Object[r3]
            X.5Tp r12 = X.AnonymousClass6I1.A03
            X.6I4 r13 = X.AnonymousClass6I4.A00
            r15 = 3072(0xc00, float:4.305E-42)
            r16 = 4
            java.lang.Object r4 = X.C305136Gr.A00(r11, r12, r13, r14, r15, r16)
            X.6I1 r4 = (X.AnonymousClass6I1) r4
            X.4bM r0 = X.AnonymousClass5YX.A00
            java.lang.Object r0 = r11.AJO(r0)
            X.5Y2 r0 = (X.AnonymousClass5Y2) r0
            r4.A00 = r0
            r0 = r11
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0L(r0, r3)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x014c
            r0 = -571104759(0xffffffffddf5a209, float:-2.21246492E18)
            X.0fL.A00(r0)
        L_0x014c:
            X.5Oz r0 = r2.A00
            r0.Epw(r4)
            java.lang.Object r1 = r1.A01
            X.0sK r1 = (X.0sK) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.invoke(r2, r11, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = 733645921(0x2bba8c61, float:1.3255058E-12)
            goto L_0x0473
        L_0x0167:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x017a
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x017a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0188
            r2 = -1348137361(0xffffffffafa50e6f, float:-3.002358E-10)
            java.lang.String r0 = "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:493)"
            X.0fL.A01(r2, r0)
        L_0x0188:
            java.lang.Object r0 = r1.A02
            X.6JA r0 = (X.AnonymousClass6JA) r0
            X.5Oz r0 = r0.A00
            java.lang.Object r4 = r0.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            java.lang.Object r2 = r1.A01
            X.0sL r2 = (X.0sL) r2
            r0 = 207(0xcf, float:2.9E-43)
            r11.ExW(r0, r4)
            boolean r1 = r11.AGv(r3)
            r0 = -869707859(0xffffffffcc294fad, float:-4.4383924E7)
            r11.ExS(r0)
            if (r3 == 0) goto L_0x01c9
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r11, r0)
        L_0x01b5:
            r0 = r11
            X.5Wx r0 = (X.C286565Wx) r0
            X.C286565Wx.A0I(r0)
            r11.ASR()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = 1410441206(0x54119ff6, float:2.50181583E12)
            goto L_0x0473
        L_0x01c9:
            r11.ANY(r1)
            goto L_0x01b5
        L_0x01cd:
            X.3yu r11 = (X.C258373yu) r11
            X.3rt r3 = (X.C254073rt) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r1 = r1.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            android.view.ViewGroup r0 = r3.A0J
            r11.EBS(r0, r2, r1)
            goto L_0x0033
        L_0x01e8:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x01fb
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x01fb:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0209
            r2 = -1054221595(0xffffffffc129dae5, float:-10.615941)
            java.lang.String r0 = "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.UfiRoot.<anonymous>.<anonymous> (MediaUfiComposeBinder.kt:161)"
            X.0fL.A01(r2, r0)
        L_0x0209:
            java.lang.Object r3 = r1.A01
            X.3gM r3 = (X.C247453gM) r3
            X.3fn r0 = r3.A05
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0235
            boolean r2 = r3.A0N
            boolean r0 = r3.A0J
            if (r2 != 0) goto L_0x0232
            if (r0 != 0) goto L_0x0232
            X.3iV r2 = X.C248733iV.STANDARD
        L_0x021d:
            java.lang.Object r0 = r1.A02
            X.4Fb r0 = (X.C262584Fb) r0
            boolean r1 = r0.A04
            r0 = 0
            X.C287165Zg.A00(r11, r3, r2, r0, r1)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -56662475(0xfffffffffc9f6635, float:-6.6211856E36)
            goto L_0x0473
        L_0x0232:
            X.3iV r2 = X.C248733iV.SANDWICH
            goto L_0x021d
        L_0x0235:
            r2 = 0
            goto L_0x021d
        L_0x0237:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x024a
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x024a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0258
            r2 = -1197116680(0xffffffffb8a572f8, float:-7.889228E-5)
            java.lang.String r0 = "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.bindToPreparable.<anonymous> (MediaUfiComposeBinder.kt:189)"
            X.0fL.A01(r2, r0)
        L_0x0258:
            java.lang.Object r2 = r1.A02
            X.4Fb r2 = (X.C262584Fb) r2
            java.lang.Object r1 = r1.A01
            X.3gM r1 = (X.C247453gM) r1
            r0 = 0
            r2.A06(r11, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -640799022(0xffffffffd9ce2ed2, float:-7.2544156E15)
            goto L_0x0473
        L_0x026f:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x0282
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x0282:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0290
            r2 = -867516370(0xffffffffcc4ac02e, float:-5.314988E7)
            java.lang.String r0 = "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.bindToPreparable.<anonymous> (MediaUfiComposeBinder.kt:193)"
            X.0fL.A01(r2, r0)
        L_0x0290:
            java.lang.Object r2 = r1.A02
            X.4Fb r2 = (X.C262584Fb) r2
            java.lang.Object r1 = r1.A01
            X.3gM r1 = (X.C247453gM) r1
            r0 = 0
            r2.A06(r11, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = 790192088(0x2f195fd8, float:1.394932E-10)
            goto L_0x0473
        L_0x02a7:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x02ba
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x02ba:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x02c8
            r2 = -1438700066(0xffffffffaa3f2dde, float:-1.6980121E-13)
            java.lang.String r0 = "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.bindToPreparable.<anonymous> (MediaUfiComposeBinder.kt:195)"
            X.0fL.A01(r2, r0)
        L_0x02c8:
            java.lang.Object r2 = r1.A02
            X.4Fb r2 = (X.C262584Fb) r2
            java.lang.Object r1 = r1.A01
            X.3gM r1 = (X.C247453gM) r1
            r0 = 0
            r2.A06(r11, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -2130243736(0xffffffff81070f68, float:-2.4806637E-38)
            goto L_0x0473
        L_0x02df:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            if (r2 != r0) goto L_0x02f2
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x02f2:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0300
            r2 = 72089825(0x44c00e1, float:2.3980488E-36)
            java.lang.String r0 = "com.instagram.feed.adapter.row.ufi.MediaUfiComposeBinder.bindToPreparable.<anonymous> (MediaUfiComposeBinder.kt:199)"
            X.0fL.A01(r2, r0)
        L_0x0300:
            java.lang.Object r2 = r1.A02
            X.4Fb r2 = (X.C262584Fb) r2
            java.lang.Object r1 = r1.A01
            X.3gM r1 = (X.C247453gM) r1
            r0 = 0
            r2.A06(r11, r1, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = 1202018595(0x47a55923, float:84658.27)
            goto L_0x0473
        L_0x0317:
            X.2xS r11 = (X.AnonymousClass2xS) r11
            X.3V2 r3 = (X.AnonymousClass3V2) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            X.1Xj r2 = r0.A1b()
            java.lang.Object r0 = r1.A02
            X.3W1 r0 = (X.AnonymousClass3W1) r0
            r11.A07(r2, r3, r0)
            goto L_0x0033
        L_0x0334:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r14 = r3.booleanValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r2 = r1.A01
            X.4Cq r2 = (X.C262224Cq) r2
            java.lang.Object r10 = r1.A02
            r12 = 0
            r13 = 9
            X.MEW r9 = new X.MEW
            r9.<init>(r10, r11, r12, r13, r14)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r9, r2)
            goto L_0x0033
        L_0x0355:
            android.view.View r11 = (android.view.View) r11
            X.1Xj r3 = (X.1Xj) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r1.A01
            X.3fJ r2 = (X.C246833fJ) r2
            java.lang.Object r0 = r1.A02
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x05f7
            r2.EBx(r11, r3, r0)
            goto L_0x0033
        L_0x0374:
            X.5Wy r11 = (X.C286575Wy) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r0 = r3.intValue()
            r2 = r0 & 3
            r0 = 2
            r6 = 1
            if (r2 != r0) goto L_0x0388
            boolean r0 = r11.Bwn()
            if (r0 != 0) goto L_0x0487
        L_0x0388:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0396
            r2 = 82089991(0x4e49807, float:5.3742157E-36)
            java.lang.String r0 = "com.instagram.feed.tifu.ui.Header.<anonymous> (TifuUnit.kt:155)"
            X.0fL.A01(r2, r0)
        L_0x0396:
            X.5Zp r7 = X.C287215Zl.A04
            X.6Fc r3 = X.C287275Zs.A00()
            X.5Qk r5 = androidx.compose.ui.Modifier.A00
            r2 = 0
            java.lang.Object r0 = r1.A01
            X.0sa r0 = (X.C62320sa) r0
            androidx.compose.ui.Modifier r0 = X.C288235ba.A04(r11, r5, r0)
            java.lang.Object r4 = r1.A02
            X.5vX r4 = (X.AnonymousClass5vX) r4
            X.5RD r10 = X.C287395a4.A00(r3, r11, r7)
            int r9 = X.C287425a7.A00(r11)
            r3 = r11
            X.5Wx r3 = (X.C286565Wx) r3
            X.5RM r7 = X.C286565Wx.A04(r3)
            androidx.compose.ui.Modifier r8 = X.C287435a8.A01(r11, r0)
            X.0sa r1 = X.C287485aD.A00
            r11.ExX()
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0482
            r11.AMT(r1)
        L_0x03ca:
            X.0sL r0 = X.C287485aD.A03
            X.C287595aO.A00(r11, r10, r0)
            X.0sL r0 = X.C287485aD.A05
            X.C287595aO.A00(r11, r7, r0)
            X.0sL r7 = X.C287485aD.A02
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x03e8
            java.lang.Object r1 = r11.ECw()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x03f2
        L_0x03e8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r11.FLL(r0)
            r11.ABr(r0, r7)
        L_0x03f2:
            X.0sL r0 = X.C287485aD.A04
            X.C287595aO.A00(r11, r8, r0)
            r0 = -240050627(0xfffffffff1b11e3d, float:-1.7540929E30)
            r11.ExS(r0)
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0453
            r0 = 2131237898(0x7f081c0a, float:1.809206E38)
            X.2DO r13 = X.C287975bA.A00(r11, r0, r2)
            java.lang.Integer r0 = r4.A02
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x0478
            if (r0 != r6) goto L_0x05ff
            r0 = -240033970(0xfffffffff1b15f4e, float:-1.75661E30)
            r11.ExS(r0)
            r0 = 2131975371(0x7f135ccb, float:1.9587832E38)
        L_0x041b:
            java.lang.String r14 = X.C288035bG.A00(r11, r0)
            X.C286565Wx.A0L(r3, r2)
            long r16 = X.AnonymousClass5RW.A09
            r0 = 1107296256(0x42000000, float:32.0)
            androidx.compose.ui.Modifier r0 = X.C287205Zk.A0C(r5, r0)
            X.5ZQ r6 = X.AnonymousClass5ZN.A00
            androidx.compose.ui.Modifier r7 = X.AnonymousClass6FZ.A01(r0, r6)
            long r0 = X.AnonymousClass5RW.A01
            X.5S2 r5 = X.AnonymousClass5S0.A00
            androidx.compose.ui.Modifier r7 = X.C304766Fd.A01(r7, r5, r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r11)
            long r0 = r0.A0d
            X.6Fh r0 = X.AnonymousClass6C9.A00(r5, r0)
            androidx.compose.ui.Modifier r1 = X.C304816Fi.A01(r0, r7, r6)
            r0 = 1086324736(0x40c00000, float:6.0)
            androidx.compose.ui.Modifier r12 = X.C287195Zj.A07(r1, r0)
            r15 = 3072(0xc00, float:4.305E-42)
            X.C288165bT.A07(r11, r12, r13, r14, r15, r16)
        L_0x0453:
            X.C286565Wx.A0L(r3, r2)
            java.lang.String r3 = r4.A04
            X.5ZE r0 = X.AnonymousClass5aQ.A01(r11)
            X.5Z4 r2 = r0.A01
            X.5Yw r0 = X.AnonymousClass5aQ.A00(r11)
            long r0 = r0.A0o
            X.AnonymousClass5ZZ.A0s(r11, r2, r3, r0)
            r11.ASN()
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0033
            r0 = -843967836(0xffffffffcdb212a4, float:-3.7344576E8)
        L_0x0473:
            X.0fL.A00(r0)
            goto L_0x0033
        L_0x0478:
            r0 = -240036915(0xfffffffff1b153cd, float:-1.756165E30)
            r11.ExS(r0)
            r0 = 2131975369(0x7f135cc9, float:1.9587828E38)
            goto L_0x041b
        L_0x0482:
            r11.FMk()
            goto L_0x03ca
        L_0x0487:
            r11.Evl()
            goto L_0x0033
        L_0x048c:
            android.view.View r11 = (android.view.View) r11
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r1.A02
            X.3dW r0 = (X.C245813dW) r0
            X.3Xd r2 = r0.A01
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            r2.DeZ(r11, r0, r3)
            goto L_0x0033
        L_0x04a7:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r3.booleanValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r1.A02
            X.1Xu r0 = (X.1Xu) r0
            X.0sP r0 = r0.A00
            java.lang.Object r3 = r0.invoke(r11)
            X.6EB r3 = (X.AnonymousClass6EB) r3
            java.lang.Object r2 = r1.A01
            X.5HJ r2 = (X.AnonymousClass5HJ) r2
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.lang.String r0 = "notification not in tray"
            goto L_0x04eb
        L_0x04ca:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r3.booleanValue()
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r1.A02
            X.1Xu r0 = (X.1Xu) r0
            X.0sP r0 = r0.A00
            java.lang.Object r3 = r0.invoke(r11)
            X.6EB r3 = (X.AnonymousClass6EB) r3
            java.lang.Object r2 = r1.A01
            X.5HJ r2 = (X.AnonymousClass5HJ) r2
            r0 = 2097(0x831, float:2.939E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 0
        L_0x04eb:
            r3.A03(r2, r1, r0, r4)
            goto L_0x0033
        L_0x04f0:
            android.graphics.Bitmap r11 = (android.graphics.Bitmap) r11
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r2 = r1.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r1.A01
            android.content.Context r0 = (android.content.Context) r0
            X.AnonymousClass7TG.A1N(r2, r0)
            if (r11 == 0) goto L_0x056d
            X.1GK r4 = X.AEI.A01(r0, r11, r2, r3)
            return r4
        L_0x050a:
            X.2rR r11 = (X.C231332rR) r11
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r5 = 1
            X.0qQ.A0B(r3, r5)
            java.lang.Object r4 = r1.A02
            X.33W r4 = (X.AnonymousClass33W) r4
            java.lang.String r3 = r4.A0E
            X.4DU r2 = r4.A08
            int r0 = X.C243393Yp.A00(r2, r3)
            if (r0 != r5) goto L_0x053e
            X.310 r0 = r4.A03
            X.4DV r0 = r0.BqC()
            r0.getScrollingViewProxy()
            java.lang.Object r1 = r1.A01
            X.1Xj r1 = (X.1Xj) r1
            int r0 = X.C243393Yp.A00(r2, r3)
            X.C243393Yp.A01(r1, r0)
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x053e:
            com.instagram.common.session.UserSession r1 = r4.A02
            X.310 r0 = r4.A03
            X.32m r0 = r0.C86()
            X.3Yp r4 = new X.3Yp
            r4.<init>(r2, r1, r0, r11)
            return r4
        L_0x054c:
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r1.A01
            X.1Xj r2 = (X.1Xj) r2
            boolean r0 = r2.A4b()
            if (r0 == 0) goto L_0x056d
            java.lang.Object r0 = r1.A02
            X.3Ws r0 = (X.C242923Ws) r0
            X.0Pl r0 = r0.A02
            android.graphics.drawable.Drawable r4 = r0.A07(r11, r2, r3)
            return r4
        L_0x056d:
            r4 = 0
            return r4
        L_0x056f:
            android.content.Context r11 = (android.content.Context) r11
            X.3v4 r3 = (X.C256003v4) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r1.A02
            X.3dW r0 = (X.C245813dW) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            X.4Jb r4 = new X.4Jb
            r4.<init>(r11, r2, r3, r0)
            return r4
        L_0x0587:
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A02
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r3)
            X.3ey r0 = (X.C246663ey) r0
            com.instagram.feed.widget.IgProgressImageView r2 = r0.A00()
            java.lang.Object r0 = r1.A01
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setContentDescription(r0)
            r1 = 8
            X.Inj r0 = new X.Inj
            r0.<init>(r2, r1)
            X.3eI r4 = new X.3eI
            r4.<init>(r0)
            return r4
        L_0x05ad:
            X.3kD r11 = (X.C249693kD) r11
            android.content.Context r3 = (android.content.Context) r3
            r0 = 0
            X.0qQ.A0B(r11, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r1.A02
            X.4Wj r0 = (X.AnonymousClass4Wj) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            r2 = 0
            if (r0 == 0) goto L_0x05f2
            X.3WT r1 = X.AnonymousClass3WT.SLIDER
            java.util.List r0 = r0.A3o(r1)
            if (r0 == 0) goto L_0x05f2
            java.lang.Object r4 = X.00k.A0J(r0)
            X.3ui r4 = (X.C255783ui) r4
            if (r4 == 0) goto L_0x05f2
            X.3WT r0 = r4.A11
            if (r0 != r1) goto L_0x05f2
            android.content.res.Resources r3 = r3.getResources()
            float r2 = r11.AcY(r5)
            float r1 = r4.A02
            float r0 = r4.A00
            float r1 = r1 / r0
            float r2 = r2 * r1
            r0 = 2131165374(0x7f0700be, float:1.7944963E38)
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
            float r0 = r0 / r2
            int r2 = (int) r0
        L_0x05f2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            return r4
        L_0x05f7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x05ff:
            r0 = -240039156(0xfffffffff1b14b0c, float:-1.7558263E30)
            r11.ExS(r0)
            X.C286565Wx.A0L(r3, r2)
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377449Lw.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
