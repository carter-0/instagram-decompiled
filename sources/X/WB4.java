package X;

import android.view.View;

public final class WB4 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WB4(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        AnonymousClass0fU.A00(new WB4(i, obj, obj2, obj3), view);
    }

    /* JADX WARNING: type inference failed for: r0v320, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v364, types: [com.instagram.model.shopping.ProductSource, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0975, code lost:
        if (X.W2F.A03(r4, r3.A00) == false) goto L_0x0977;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0ab3, code lost:
        if (r2 != com.instagram.api.schemas.InstagramMediaProductType.A0k) goto L_0x0ab5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0b21, code lost:
        if (r2 != com.instagram.api.schemas.InstagramMediaProductType.A0k) goto L_0x0b23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0d55, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0d58, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x11d0, code lost:
        X.AnonymousClass0fD.A0C(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x11d3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0036, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x12ed, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x12f4, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01c2, code lost:
        if (r2 <= 0) goto L_0x01c4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x127d  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x12ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r36) {
        /*
            r35 = this;
            r0 = r35
            int r1 = r0.A00
            r4 = r36
            switch(r1) {
                case 0: goto L_0x0c93;
                case 1: goto L_0x119c;
                case 2: goto L_0x0c5c;
                case 3: goto L_0x0c27;
                case 4: goto L_0x0c0c;
                case 5: goto L_0x0bb6;
                case 6: goto L_0x0b91;
                case 7: goto L_0x12d3;
                case 8: goto L_0x0b39;
                case 9: goto L_0x0afd;
                case 10: goto L_0x0a91;
                case 11: goto L_0x0940;
                case 12: goto L_0x08f5;
                case 13: goto L_0x114b;
                case 14: goto L_0x086d;
                case 15: goto L_0x082b;
                case 16: goto L_0x080c;
                case 17: goto L_0x07ed;
                case 18: goto L_0x078a;
                case 19: goto L_0x076d;
                case 20: goto L_0x0750;
                case 21: goto L_0x0724;
                case 22: goto L_0x06f5;
                case 23: goto L_0x06d8;
                case 24: goto L_0x06bb;
                case 25: goto L_0x0698;
                case 26: goto L_0x10d6;
                case 27: goto L_0x0681;
                case 28: goto L_0x0663;
                case 29: goto L_0x0f91;
                case 30: goto L_0x0643;
                case 31: goto L_0x0cc8;
                case 32: goto L_0x0623;
                case 33: goto L_0x0cbc;
                case 34: goto L_0x0608;
                case 35: goto L_0x056d;
                case 36: goto L_0x0548;
                case 37: goto L_0x0531;
                case 38: goto L_0x04a9;
                case 39: goto L_0x0435;
                case 40: goto L_0x0f12;
                case 41: goto L_0x0406;
                case 42: goto L_0x03eb;
                case 43: goto L_0x03d0;
                case 44: goto L_0x03a3;
                case 45: goto L_0x0379;
                case 46: goto L_0x0e74;
                case 47: goto L_0x0ded;
                case 48: goto L_0x0d64;
                case 49: goto L_0x035e;
                case 50: goto L_0x0343;
                case 51: goto L_0x0328;
                case 52: goto L_0x030d;
                case 53: goto L_0x02e3;
                case 54: goto L_0x02c9;
                case 55: goto L_0x02af;
                case 56: goto L_0x0292;
                case 57: goto L_0x0275;
                case 58: goto L_0x025a;
                case 59: goto L_0x0187;
                case 60: goto L_0x0d3a;
                case 61: goto L_0x0cf7;
                case 62: goto L_0x0cd7;
                case 63: goto L_0x011d;
                case 64: goto L_0x00fa;
                case 65: goto L_0x00d7;
                case 66: goto L_0x00b4;
                case 67: goto L_0x0092;
                case 68: goto L_0x0074;
                case 69: goto L_0x003a;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 672269663(0x2812055f, float:8.105793E-15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.UEP r6 = (X.UEP) r6
            X.5xz r5 = r6.A0A
            java.lang.Object r4 = r0.A03
            X.WSh r4 = (X.C19274WSh) r4
            boolean r3 = r4.A0B
            r2 = 0
            r5.A02(r3, r2, r2)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r3 = r6.A09
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r5.A01(r2)
            java.lang.Object r0 = r0.A01
            X.K8J r0 = (X.K8J) r0
            long r2 = r4.A02
            r0.A0E(r2)
            r0 = -744847359(0xffffffffd39a8801, float:-1.32741346E12)
        L_0x0036:
            X.AnonymousClass0fD.A0C(r0, r1)
        L_0x0039:
            return
        L_0x003a:
            r1 = -564541533(0xffffffffde59c7a3, float:-3.92317266E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            X.UEd r8 = (X.C14899UEd) r8
            java.lang.Object r7 = r0.A02
            X.WSZ r7 = (X.WSZ) r7
            java.lang.Object r6 = r0.A01
            X.X9V r6 = (X.X9V) r6
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.widget.TextView r2 = r8.A04
            r5 = 0
            r2.setClickable(r5)
            r0 = 1050253722(0x3e99999a, float:0.3)
            r2.setAlpha(r0)
            if (r6 == 0) goto L_0x0070
            com.instagram.user.model.User r4 = r7.A01
            r0 = 16
            X.KAe r3 = new X.KAe
            r3.<init>(r0, r7, r8)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.KAt r0 = new X.KAt
            r0.<init>(r8, r5)
            r6.E0E(r3, r0, r4, r2)
        L_0x0070:
            r0 = -777449981(0xffffffffd1a90e03, float:-9.0760569E10)
            goto L_0x0036
        L_0x0074:
            r1 = 1595235596(0x5f155d0c, float:1.0762772E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.X9V r3 = (X.X9V) r3
            if (r3 == 0) goto L_0x008e
            java.lang.Object r2 = r0.A03
            X.WSZ r2 = (X.WSZ) r2
            com.instagram.user.model.User r2 = r2.A01
            java.lang.Object r0 = r0.A02
            X.G7P r0 = (X.G7P) r0
            r3.DSL(r0, r2)
        L_0x008e:
            r0 = -410846358(0xffffffffe782fb6a, float:-1.2370908E24)
            goto L_0x0036
        L_0x0092:
            r1 = 1863106636(0x6f0cc04c, float:4.3560374E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.UDu r2 = (X.C14892UDu) r2
            com.instagram.igds.components.button.IgdsButton r3 = r2.A03
            com.instagram.igds.components.button.IgdsButton r4 = r2.A01
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r5 = r0.A03
            X.VjM r5 = (X.C17984VjM) r5
            java.lang.String r6 = "seed_product_appropriateness"
            java.lang.String r7 = "relevant"
            X.C17101VHx.A00(r2, r3, r4, r5, r6, r7)
            r0 = -1072155471(0xffffffffc01834b1, float:-2.378216)
            goto L_0x0036
        L_0x00b4:
            r1 = -1272941423(0xffffffffb4207491, float:-1.4943568E-7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.UDu r2 = (X.C14892UDu) r2
            com.instagram.igds.components.button.IgdsButton r3 = r2.A01
            com.instagram.igds.components.button.IgdsButton r4 = r2.A03
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r5 = r0.A03
            X.VjM r5 = (X.C17984VjM) r5
            java.lang.String r6 = "seed_product_appropriateness"
            java.lang.String r7 = "irrelevant"
            X.C17101VHx.A00(r2, r3, r4, r5, r6, r7)
            r0 = -651675348(0xffffffffd928392c, float:-2.95941608E15)
            goto L_0x0036
        L_0x00d7:
            r1 = 1312012201(0x4e33b7a9, float:7.537895E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.UDu r2 = (X.C14892UDu) r2
            com.instagram.igds.components.button.IgdsButton r3 = r2.A04
            com.instagram.igds.components.button.IgdsButton r4 = r2.A02
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r5 = r0.A03
            X.VjM r5 = (X.C17984VjM) r5
            java.lang.String r6 = "seed_media_product_availability"
            java.lang.String r7 = "relevant"
            X.C17101VHx.A00(r2, r3, r4, r5, r6, r7)
            r0 = 1970570427(0x757484bb, float:3.09964E32)
            goto L_0x0036
        L_0x00fa:
            r1 = -2030415218(0xffffffff86fa528e, float:-9.416085E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.UDu r2 = (X.C14892UDu) r2
            com.instagram.igds.components.button.IgdsButton r3 = r2.A02
            com.instagram.igds.components.button.IgdsButton r4 = r2.A04
            java.lang.Object r2 = r0.A02
            X.1Xj r2 = (X.1Xj) r2
            java.lang.Object r5 = r0.A03
            X.VjM r5 = (X.C17984VjM) r5
            java.lang.String r6 = "seed_media_product_availability"
            java.lang.String r7 = "irrelevant"
            X.C17101VHx.A00(r2, r3, r4, r5, r6, r7)
            r0 = 1711299715(0x66005c83, float:1.5154236E23)
            goto L_0x0036
        L_0x011d:
            r1 = 1578475958(0x5e15a1b6, float:2.69552477E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.2ql r6 = (X.C231032ql) r6
            java.lang.Object r5 = r0.A03
            X.4dH r5 = (X.C268374dH) r5
            java.lang.Object r0 = r0.A02
            X.UDs r0 = (X.C14890UDs) r0
            androidx.recyclerview.widget.RecyclerView r4 = r0.A04
            X.3pI r0 = r4.A0D
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x110e
            int r2 = X.C240113Jq.A01(r0)
            X.3pI r0 = r4.A0D
            if (r0 == 0) goto L_0x1108
            boolean r0 = X.C240113Jq.A06(r0, r4, r2)
            if (r0 != 0) goto L_0x0148
            int r2 = r2 + 1
        L_0x0148:
            X.X9B r0 = r5.Aif()
            if (r0 == 0) goto L_0x0159
            java.lang.Integer r0 = r0.Awk()
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0159;
                case 2: goto L_0x015e;
                case 3: goto L_0x0159;
                case 4: goto L_0x0159;
                case 5: goto L_0x0159;
                case 6: goto L_0x0171;
                case 7: goto L_0x0174;
                case 8: goto L_0x0159;
                case 9: goto L_0x0159;
                case 10: goto L_0x0178;
                case 11: goto L_0x017b;
                case 12: goto L_0x017e;
                case 13: goto L_0x0159;
                case 14: goto L_0x0159;
                case 15: goto L_0x0159;
                case 16: goto L_0x016e;
                case 17: goto L_0x0159;
                case 18: goto L_0x0181;
                default: goto L_0x0159;
            }
        L_0x0159:
            r0 = -1716419720(0xffffffff99b18378, float:-1.8354471E-23)
            goto L_0x0036
        L_0x015e:
            X.X9B r0 = r5.Aif()
            if (r0 == 0) goto L_0x1102
            com.instagram.user.model.User r0 = r0.BRo()
            if (r0 == 0) goto L_0x1102
            r6.DzI(r5, r0)
            goto L_0x0159
        L_0x016e:
            X.UzB r0 = X.C16675UzB.CHECKOUT
            goto L_0x0183
        L_0x0171:
            X.UzB r0 = X.C16675UzB.RECENTLY_VIEWED
            goto L_0x0183
        L_0x0174:
            r6.DzM(r5)
            goto L_0x0159
        L_0x0178:
            X.UzB r0 = X.C16675UzB.PRODUCTS_FROM_LIKED_MEDIA
            goto L_0x0183
        L_0x017b:
            X.UzB r0 = X.C16675UzB.PRODUCTS_FROM_SAVED_MEDIA
            goto L_0x0183
        L_0x017e:
            X.UzB r0 = X.C16675UzB.PRODUCTS_FROM_FOLLOWED_BRANDS
            goto L_0x0183
        L_0x0181:
            X.UzB r0 = X.C16675UzB.INCENTIVE
        L_0x0183:
            r6.DzD(r0, r5, r2)
            goto L_0x0159
        L_0x0187:
            r1 = -899393261(0xffffffffca645913, float:-3741252.8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.Ubt r5 = (X.C15390Ubt) r5
            java.lang.Object r4 = r0.A01
            X.VWp r4 = (X.C17462VWp) r4
            java.lang.Object r0 = r0.A03
            X.VTT r0 = (X.VTT) r0
            java.lang.Integer r6 = r0.A01
            r7 = 1
            X.W35 r9 = r5.A03
            if (r9 != 0) goto L_0x01a5
            java.lang.String r8 = "logger"
            goto L_0x12ed
        L_0x01a5:
            java.lang.String r8 = r4.A01
            X.Uyv r3 = X.C16659Uyv.CATALOG
            java.lang.String r2 = r4.A02
            com.instagram.model.shopping.ProductSource r0 = new com.instagram.model.shopping.ProductSource
            r0.<init>()
            r0.A01 = r8
            r0.A00 = r3
            r0.A04 = r2
            r9.A06(r0)
            java.lang.Integer r0 = r4.A00
            if (r0 == 0) goto L_0x01c4
            int r2 = r0.intValue()
            r0 = 1
            if (r2 > 0) goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            boolean r0 = X.C66581MXm.A1a(r0)
            if (r0 != 0) goto L_0x01e7
            android.content.Context r3 = r5.getContext()
            if (r3 == 0) goto L_0x01e2
            r0 = 2131969831(0x7f134727, float:1.9576596E38)
            java.lang.String r2 = r3.getString(r0)
            r0 = 2131969830(0x7f134726, float:1.9576594E38)
            java.lang.String r0 = r3.getString(r0)
            X.C49952FGh.A05(r3, r0, r2)
        L_0x01e2:
            r0 = -493162949(0xffffffffe29aee3b, float:-1.4289825E21)
            goto L_0x0036
        L_0x01e7:
            boolean r0 = r5.A0B
            java.lang.String r8 = "adapter"
            if (r0 == 0) goto L_0x01fb
            X.UdS r3 = r5.A02
            if (r3 == 0) goto L_0x12ed
            java.lang.String r2 = r4.A01
            X.V3W r0 = r3.A03
            r0.A01 = r2
            X.C15477UdS.A00(r3)
            goto L_0x01e2
        L_0x01fb:
            X.UdS r0 = r5.A02
            if (r0 == 0) goto L_0x12ed
            X.V3W r3 = r0.A03
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L_0x01e2
            X.Vi1 r0 = r5.A05
            if (r0 != 0) goto L_0x020d
            java.lang.String r8 = "networkHelper"
            goto L_0x12ed
        L_0x020d:
            java.lang.Integer r2 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r2 == r0) goto L_0x01e2
            java.lang.String r2 = r4.A01
            java.lang.String r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x01e2
            X.UdS r3 = r5.A02
            if (r3 == 0) goto L_0x12ed
            java.lang.String r2 = r4.A01
            X.V3W r0 = r3.A03
            r0.A00 = r2
            X.C15477UdS.A00(r3)
            X.0eM r0 = r5.A0K
            X.0lg r0 = X.DbT.A0X(r0)
            java.lang.String r3 = r4.A01
            X.0qQ.A07(r3)
            X.1NY r2 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = "commerce/onboard/"
            r2.A0A(r0)
            r0 = 2966(0xb96, float:4.156E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbX.A1M(r2, r0, r3)
            r2.A0R = r7
            X.1OC r3 = r2.A0M()
            r2 = 19
            X.Ufr r0 = new X.Ufr
            r0.<init>(r2, r4, r6, r5)
            r3.A00 = r0
            X.1ES.A03(r3)
            goto L_0x01e2
        L_0x025a:
            r1 = -804620742(0xffffffffd00a763a, float:-9.2920156E9)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.X6v r3 = (X.C20968X6v) r3
            java.lang.Object r2 = r0.A02
            X.Urb r2 = (X.C16274Urb) r2
            java.lang.Object r0 = r0.A03
            X.XC0 r0 = (X.XC0) r0
            r3.Dnj(r0, r2)
            r0 = 260724114(0xf8a5592, float:1.3640811E-29)
            goto L_0x0036
        L_0x0275:
            r1 = -1285383665(0xffffffffb3629a0f, float:-5.275984E-8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XCC r3 = (X.XCC) r3
            java.lang.Object r2 = r0.A03
            X.Vbr r2 = (X.C17661Vbr) r2
            java.lang.String r2 = r2.A06
            java.lang.Object r0 = r0.A02
            X.Vjd r0 = (X.C18001Vjd) r0
            r3.DF0(r0, r2)
            r0 = 1037916195(0x3ddd5823, float:0.10807826)
            goto L_0x0036
        L_0x0292:
            r1 = -395185334(0xffffffffe871f34a, float:-4.5703129E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XCC r3 = (X.XCC) r3
            java.lang.Object r2 = r0.A03
            X.Vbr r2 = (X.C17661Vbr) r2
            java.lang.String r2 = r2.A06
            java.lang.Object r0 = r0.A02
            X.Vjd r0 = (X.C18001Vjd) r0
            r3.DEz(r0, r2)
            r0 = 496447189(0x1d972ed5, float:4.001779E-21)
            goto L_0x0036
        L_0x02af:
            r1 = 618461896(0x24dcfac8, float:9.583463E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.Tqa r4 = (X.C14140Tqa) r4
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0 = 0
            r4.A05(r2, r0, r3)
            r0 = 729862624(0x2b80d1e0, float:9.153199E-13)
            goto L_0x0036
        L_0x02c9:
            r1 = 1443794523(0x560e8e5b, float:3.9185516E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.Tqa r4 = (X.C14140Tqa) r4
            java.lang.Object r3 = r0.A03
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0 = 0
            r4.A05(r2, r0, r3)
            r0 = -710554639(0xffffffffd5a5cbf1, float:-2.27869175E13)
            goto L_0x0036
        L_0x02e3:
            r1 = -344651111(0xffffffffeb750a99, float:-2.9623687E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Tqa r2 = (X.C14140Tqa) r2
            X.8av r3 = r2.A04
            X.X4b r2 = r2.A05
            java.lang.String r2 = r2.E4p()
            r3.CkI(r2)
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r0.A03
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.2EG r2 = X.2EG.A3H
            java.lang.String r0 = "https://help.instagram.com/1102953614443454"
            X.Dbb.A0k(r4, r3, r2, r0)
            r0 = -794732672(0xffffffffd0a15780, float:-2.16549294E10)
            goto L_0x0036
        L_0x030d:
            r1 = 547413526(0x20a0de16, float:2.7252018E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XC4 r3 = (X.XC4) r3
            java.lang.Object r2 = r0.A02
            X.Nfh r2 = (X.C69158Nfh) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DXI(r2, r0)
            r0 = 1506992935(0x59d2e327, float:7.4199377E15)
            goto L_0x0036
        L_0x0328:
            r1 = -536219802(0xffffffffe009ef66, float:-3.97571E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XC3 r3 = (X.XC3) r3
            java.lang.Object r2 = r0.A02
            X.Nff r2 = (X.C69156Nff) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DPY(r2, r0)
            r0 = 1168656759(0x45a84977, float:5385.183)
            goto L_0x0036
        L_0x0343:
            r1 = -1119314756(0xffffffffbd489cbc, float:-0.0489776)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XC2 r3 = (X.XC2) r3
            java.lang.Object r2 = r0.A02
            X.Mn4 r2 = (X.C67387Mn4) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DMv(r2, r0)
            r0 = -287783161(0xffffffffeed8c707, float:-3.3544686E28)
            goto L_0x0036
        L_0x035e:
            r1 = 724461107(0x2b2e6633, float:6.195905E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.XC1 r3 = (X.XC1) r3
            java.lang.Object r2 = r0.A02
            X.Nfj r2 = (X.C69160Nfj) r2
            java.lang.Object r0 = r0.A03
            X.Mg0 r0 = (X.C66967Mg0) r0
            r3.DIe(r2, r0)
            r0 = -1709005523(0xffffffff9a22a52d, float:-3.3634243E-23)
            goto L_0x0036
        L_0x0379:
            r1 = -1103576705(0xffffffffbe38c17f, float:-0.18042563)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Uj6 r2 = (X.C15823Uj6) r2
            X.0sK r5 = r2.A05
            java.lang.Object r2 = r0.A01
            X.UNq r2 = (X.C15073UNq) r2
            X.UKX r2 = r2.A00
            java.lang.String r4 = r2.A03
            java.lang.String r3 = r2.A02
            java.lang.Object r2 = r0.A02
            if (r2 != 0) goto L_0x039b
            java.lang.String r0 = ""
            com.instagram.common.typedurl.SimpleImageUrl r2 = new com.instagram.common.typedurl.SimpleImageUrl
            r2.<init>(r0)
        L_0x039b:
            r5.invoke(r4, r3, r2)
            r0 = -394844887(0xffffffffe8772529, float:-4.66844E24)
            goto L_0x0036
        L_0x03a3:
            r1 = 1733230067(0x674efdf3, float:9.77492E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            X.6rX r3 = X.C319976rX.A00
            X.6rY r5 = X.C319986rY.SELF
            java.lang.String r8 = r4.A06
            java.lang.String r6 = "self_highlights_profile"
            r2 = 298(0x12a, float:4.18E-43)
            java.lang.String r7 = X.C273654mx.A00(r2)
            java.lang.String r9 = "highlights_tab"
            r3.A0E(r4, r5, r6, r7, r8, r9)
            java.lang.Object r3 = r0.A01
            android.app.Activity r3 = (android.app.Activity) r3
            X.Ki3 r2 = X.Ki3.SELF_PROFILE
            r0 = 1
            X.JZV.A07(r3, r2, r4, r0)
            r0 = -386400565(0xffffffffe8f7fecb, float:-9.368997E24)
            goto L_0x0036
        L_0x03d0:
            r1 = 1613250020(0x60283de4, float:4.8492386E19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.2qJ r3 = (X.C230812qJ) r3
            java.lang.Object r2 = r0.A02
            X.4gd r2 = (X.C270374gd) r2
            java.lang.Object r0 = r0.A03
            X.VbP r0 = (X.C17633VbP) r0
            r3.DR1(r0, r2)
            r0 = -325329354(0xffffffffec9bde36, float:-1.5074629E27)
            goto L_0x0036
        L_0x03eb:
            r1 = -1426792502(0xffffffffaaf4dfca, float:-4.3498392E-13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.2qJ r3 = (X.C230812qJ) r3
            java.lang.Object r2 = r0.A02
            X.4gd r2 = (X.C270374gd) r2
            java.lang.Object r0 = r0.A03
            X.VbP r0 = (X.C17633VbP) r0
            r3.DR1(r0, r2)
            r0 = -64298706(0xfffffffffc2ae12e, float:-3.5490306E36)
            goto L_0x0036
        L_0x0406:
            r1 = -1523156409(0xffffffffa5367a47, float:-1.5827413E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.UnG r3 = (X.C16027UnG) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormSliderQuestionView r4 = r3.A00
            java.lang.Object r2 = r0.A02
            X.UKy r2 = (X.C15045UKy) r2
            java.util.List r2 = r2.A08
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r2
            boolean r2 = r4.A0H(r2, r3)
            if (r2 == 0) goto L_0x0430
            java.lang.Object r2 = r0.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            r0 = 1
            r2.A06(r0)
        L_0x0430:
            r0 = 510935248(0x1e7440d0, float:1.2930655E-20)
            goto L_0x0036
        L_0x0435:
            java.lang.Object r1 = r0.A01
            X.UAK r1 = (X.UAK) r1
            java.lang.Object r2 = r0.A02
            X.3kE r2 = (X.C249703kE) r2
            java.lang.Object r4 = r0.A03
            X.Vc5 r4 = (X.C17674Vc5) r4
            int r3 = r2.getBindingAdapterPosition()
            r0 = -1
            if (r3 == r0) goto L_0x0039
            java.util.List r0 = r1.A0C
            java.lang.Object r2 = r0.remove(r3)
            boolean r0 = r2 instanceof X.C17674Vc5
            if (r0 == 0) goto L_0x0461
            X.3UH r0 = r1.A01
            r0.getClass()
            java.util.List r0 = r0.A04()
            r0.getClass()
            r0.remove(r2)
        L_0x0461:
            int r0 = r1.getItemCount()
            if (r0 != 0) goto L_0x04a5
            X.1Ng r2 = r1.A06
            X.3DS r0 = new X.3DS
            r0.<init>()
            r2.A00(r0)
        L_0x0471:
            java.lang.Integer r0 = X.C18214Vne.A00(r4)
            int r2 = X.C13988Tno.A0D(r0)
            r0 = 1
            if (r2 == r0) goto L_0x1114
            r0 = 0
            if (r2 != r0) goto L_0x0039
            X.2p0 r3 = r1.A02
            r3.getClass()
            int r8 = X.UAK.A00(r1, r4)
            X.3UH r0 = r1.A01
            r0.getClass()
            int r9 = r0.A01
            X.3UH r0 = r1.A01
            r0.getClass()
            java.lang.String r5 = r0.A0C
            X.3UH r0 = r1.A01
            r0.getClass()
            java.lang.String r7 = r0.getId()
            java.lang.String r6 = "preview"
            r3.DLE(r4, r5, r6, r7, r8, r9)
            return
        L_0x04a5:
            r1.notifyItemRemoved(r3)
            goto L_0x0471
        L_0x04a9:
            java.lang.Object r2 = r0.A01
            X.UAK r2 = (X.UAK) r2
            java.lang.Object r1 = r0.A02
            X.UEQ r1 = (X.UEQ) r1
            java.lang.Object r4 = r0.A03
            X.Vc5 r4 = (X.C17674Vc5) r4
            int r3 = r1.getBindingAdapterPosition()
            r0 = -1
            if (r3 == r0) goto L_0x0039
            java.lang.Integer r0 = X.C18214Vne.A00(r4)
            int r3 = X.C13988Tno.A0D(r0)
            r0 = 1
            if (r3 == r0) goto L_0x04fe
            r0 = 0
            if (r3 != r0) goto L_0x0039
            X.2p0 r3 = r2.A02
            r3.getClass()
            int r8 = X.UAK.A00(r2, r4)
            X.3UH r0 = r2.A01
            r0.getClass()
            int r9 = r0.A01
            X.3UH r0 = r2.A01
            r0.getClass()
            java.lang.String r5 = r0.A0C
            X.3UH r0 = r2.A01
            r0.getClass()
            java.lang.String r7 = r0.getId()
            java.lang.String r6 = "preview"
            r3.DLG(r4, r5, r6, r7, r8, r9)
            android.view.View r1 = r1.A00
            com.instagram.model.hashtag.Hashtag r0 = r4.A00
            r0.getClass()
            java.lang.String r0 = r0.getName()
        L_0x04fa:
            r1.setContentDescription(r0)
            return
        L_0x04fe:
            X.2p0 r3 = r2.A02
            r3.getClass()
            int r8 = X.UAK.A00(r2, r4)
            X.3UH r0 = r2.A01
            r0.getClass()
            int r9 = r0.A01
            int r10 = r2.A00
            X.3UH r0 = r2.A01
            r0.getClass()
            java.lang.String r5 = r0.A0C
            X.3UH r0 = r2.A01
            r0.getClass()
            java.lang.String r7 = r0.getId()
            java.lang.String r6 = "preview"
            r3.DLN(r4, r5, r6, r7, r8, r9, r10)
            android.view.View r1 = r1.A00
            com.instagram.user.model.User r0 = r4.A02
            r0.getClass()
            java.lang.String r0 = r0.getUsername()
            goto L_0x04fa
        L_0x0531:
            r1 = 1850363161(0x6e4a4d19, float:1.5652294E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.WXf r2 = (X.C19388WXf) r2
            java.lang.Object r0 = r0.A03
            com.instagram.model.hashtag.Hashtag r0 = (com.instagram.model.hashtag.Hashtag) r0
            r2.D3G(r0)
            r0 = -478347524(0xffffffffe37cfefc, float:-4.666953E21)
            goto L_0x0036
        L_0x0548:
            r1 = 1583687620(0x5e6527c4, float:4.12809552E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.VZW r3 = (X.VZW) r3
            r2 = -2
            X.Tol r4 = r3.A01
            r4.A04(r2)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            X.Wax r2 = (X.C19511Wax) r2
            boolean r0 = r4.A0E()
            X.C63280KuP.A00(r3, r2, r0)
            r0 = -1615852777(0xffffffff9fb00b17, float:-7.4557246E-20)
            goto L_0x0036
        L_0x056d:
            r1 = -90771257(0xfffffffffa96f0c7, float:-3.9186404E35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.ToY r3 = (X.C14032ToY) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Tqi r2 = r3.A02
            java.lang.Object r10 = r0.A01
            com.instagram.model.reels.Reel r10 = (com.instagram.model.reels.Reel) r10
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r12 = r3.A03
            int r8 = r3.getBindingAdapterPosition()
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            r7 = 1
            X.0qQ.A0B(r12, r7)
            java.util.List r13 = X.AnonymousClass7TE.A1I(r10)
            X.ToX r6 = r2.A00
            X.32A r9 = r6.A0A
            java.lang.String r0 = r6.A0D
            r9.A0C = r0
            androidx.fragment.app.FragmentActivity r3 = r6.A06
            r2 = 0
            X.Upq r0 = new X.Upq
            r0.<init>((android.app.Activity) r3, (android.view.View) r12, (X.C230222pE) r2)
            r9.A05 = r0
            X.3BQ r11 = r6.A09
            r14 = r13
            r15 = r13
            r9.A09(r10, r11, r12, r13, r14, r15)
            com.instagram.user.model.User r4 = r6.A0B
            if (r4 == 0) goto L_0x0603
            com.instagram.common.session.UserSession r0 = r6.A08
            X.0iw r3 = r6.A07
            X.0wc r2 = X.DbT.A0Q(r3, r0, r7)
            java.lang.String r9 = r4.getId()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r7 = r5.getId()
            boolean r0 = r4.A1L()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.String r5 = r3.getModuleName()
            java.lang.String r4 = "business_profile_chaining_nebula"
            java.lang.String r3 = "user_profile"
            r0 = 6
            X.0qQ.A0B(r5, r0)
            java.lang.String r0 = "similar_user_story_ring_tapped"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = "target_id"
            r2.AAJ(r0, r9)
            java.lang.String r0 = "view_module"
            r2.AAJ(r0, r3)
            java.lang.String r0 = "containermodule"
            r2.AAJ(r0, r5)
            java.lang.String r0 = "position"
            r2.A8k(r0, r8)
            java.lang.String r0 = "chaining_profile_id"
            r2.AAJ(r0, r7)
            java.lang.String r0 = "algorithm"
            r2.AAJ(r0, r4)
            java.lang.String r0 = "is_auto_expand"
            r2.A7p(r0, r6)
            r2.Cgf()
        L_0x0603:
            r0 = 1779101589(0x6a0aef95, float:4.199079E25)
            goto L_0x0036
        L_0x0608:
            r1 = -1644903605(0xffffffff9df4c34b, float:-6.478819E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.2p7 r3 = (X.C230182p7) r3
            java.lang.Object r2 = r0.A02
            X.4g7 r2 = (X.C270054g7) r2
            java.lang.Object r0 = r0.A03
            X.IUl r0 = (X.C57250IUl) r0
            r3.Dkn(r0, r2)
            r0 = 1181171199(0x46673dff, float:14799.499)
            goto L_0x0036
        L_0x0623:
            r1 = 498099925(0x1db066d5, float:4.6693138E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Tv0 r2 = (X.C14371Tv0) r2
            X.WW4 r3 = r2.A03
            java.lang.Object r2 = r0.A02
            X.HAS r2 = (X.HAS) r2
            java.lang.Object r0 = r0.A01
            X.5qz r0 = (X.C296995qz) r0
            X.0qQ.A0A(r4)
            r3.A0G(r4, r0, r2)
            r0 = 1702130902(0x657474d6, float:7.215079E22)
            goto L_0x0036
        L_0x0643:
            r1 = 631215283(0x259f94b3, float:2.7682866E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Tv1 r2 = (X.C14372Tv1) r2
            X.WW4 r3 = r2.A03
            java.lang.Object r2 = r0.A02
            X.HAR r2 = (X.HAR) r2
            java.lang.Object r0 = r0.A01
            X.5qz r0 = (X.C296995qz) r0
            X.0qQ.A0A(r4)
            r3.A0F(r4, r0, r2)
            r0 = 1985461393(0x7657bc91, float:1.09391446E33)
            goto L_0x0036
        L_0x0663:
            r1 = 1487580716(0x58aaae2c, float:1.50132031E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.WGR r2 = (X.WGR) r2
            X.Vzh r4 = r2.A01
            java.lang.Object r3 = r0.A03
            com.instagram.discovery.mediamap.model.LocationPageInformation r3 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r3
            java.lang.Object r2 = r0.A02
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            r0 = 1
            r4.A02(r2, r3, r0)
            r0 = 1050364469(0x3e9b4a35, float:0.30330053)
            goto L_0x0036
        L_0x0681:
            r1 = -1874989464(0xffffffff903dee68, float:-3.745734E-29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = (com.instagram.discovery.mediamap.model.MediaMapPin) r2
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.C18747Vzh.A01(r0, r2)
            r0 = -1237817908(0xffffffffb63865cc, float:-2.747739E-6)
            goto L_0x0036
        L_0x0698:
            r1 = 125553269(0x77bca75, float:1.8942638E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.WPk r5 = (X.C19204WPk) r5
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r4 = r5.A0K
            java.lang.Object r3 = r0.A03
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = (com.instagram.discovery.mediamap.model.MediaMapPin) r3
            java.lang.Object r2 = r0.A02
            X.U0Z r2 = (X.U0Z) r2
            android.widget.ImageView r0 = r5.A0G
            android.graphics.RectF r0 = X.0nA.A0F(r0)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.A05(r0, r4, r3, r2)
            r0 = 1842369943(0x6dd05597, float:8.059544E27)
            goto L_0x0036
        L_0x06bb:
            r1 = -2061932159(0xffffffff85196981, float:-7.2134034E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.Vfk r3 = (X.C17773Vfk) r3
            java.lang.Object r2 = r0.A02
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A01
            X.WVv r0 = (X.C19354WVv) r0
            X.Wat r0 = r0.A0E
            r3.A00(r2, r0)
            r0 = -1507642877(0xffffffffa6233203, float:-5.6619764E-16)
            goto L_0x0036
        L_0x06d8:
            r1 = 598907025(0x23b29891, float:1.9363413E-17)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.Vfk r3 = (X.C17773Vfk) r3
            java.lang.Object r2 = r0.A02
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A01
            X.WVv r0 = (X.C19354WVv) r0
            X.Wat r0 = r0.A0E
            r3.A00(r2, r0)
            r0 = -822938365(0xffffffffcef2f503, float:-2.03807168E9)
            goto L_0x0036
        L_0x06f5:
            r1 = 743379098(0x2c4f109a, float:2.9425685E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.VVg r6 = (X.C17427VVg) r6
            X.VN7 r2 = r6.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r2 = r2.A00
            X.W3Q r5 = X.Dba.A0F(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r4 = r2.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r3 = r2.A02
            java.lang.String r2 = "instagram_map_directions_bottom_sheet_tap_copy_address"
            X.DbZ.A1a(r3, r5, r4, r2)
            X.Vzh r4 = r6.A00
            java.lang.Object r3 = r0.A02
            com.instagram.discovery.mediamap.model.LocationPageInformation r3 = (com.instagram.discovery.mediamap.model.LocationPageInformation) r3
            java.lang.Object r2 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            r0 = 0
            r4.A02(r2, r3, r0)
            r0 = -1083032441(0xffffffffbf723c87, float:-0.9462361)
            goto L_0x0036
        L_0x0724:
            r1 = -500712057(0xffffffffe227bd87, float:-7.735658E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.VVg r2 = (X.C17427VVg) r2
            X.VN7 r2 = r2.A01
            com.instagram.discovery.mediamap.fragment.LocationDetailFragment r2 = r2.A00
            X.W3Q r5 = X.Dba.A0F(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r4 = r2.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r3 = r2.A02
            java.lang.String r2 = "instagram_map_directions_bottom_sheet_tap_open_in_maps"
            X.DbZ.A1a(r3, r5, r4, r2)
            java.lang.Object r2 = r0.A02
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = (com.instagram.discovery.mediamap.model.MediaMapPin) r2
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.C18747Vzh.A01(r0, r2)
            r0 = -2080989878(0xffffffff83f69d4a, float:-1.4494692E-36)
            goto L_0x0036
        L_0x0750:
            r1 = -506683848(0xffffffffe1cc9e38, float:-4.7181708E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.X3v r3 = (X.C20904X3v) r3
            java.lang.Object r2 = r0.A01
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A03
            X.Vks r0 = (X.C18066Vks) r0
            X.Wat r0 = r0.A05
            r3.D3E(r2, r0)
            r0 = -1538541900(0xffffffffa44bb6b4, float:-4.4173364E-17)
            goto L_0x0036
        L_0x076d:
            r1 = -1184911894(0xffffffffb95fadea, float:-2.1331725E-4)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.X3v r3 = (X.C20904X3v) r3
            java.lang.Object r2 = r0.A01
            com.instagram.model.reels.Reel r2 = (com.instagram.model.reels.Reel) r2
            java.lang.Object r0 = r0.A03
            X.Vks r0 = (X.C18066Vks) r0
            X.Wat r0 = r0.A05
            r3.D3E(r2, r0)
            r0 = 1642254144(0x61e2cf40, float:5.2298726E20)
            goto L_0x0036
        L_0x078a:
            r1 = 1365485214(0x5163a69e, float:6.1109559E10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.Ukv r7 = (X.C15930Ukv) r7
            java.lang.Object r6 = r0.A01
            X.Vkf r6 = (X.C18057Vkf) r6
            double r4 = r6.A00
            double r2 = r6.A01
            r7.A04(r4, r2)
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r2 = r5.getId()
            X.0eM r0 = r7.A04
            java.lang.String r0 = X.DbU.A0u(r0)
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x07e8
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r7.A02
            if (r2 == 0) goto L_0x07bc
            r0 = 5
            r2.A0W(r0)
        L_0x07bc:
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r7.A03
            if (r2 == 0) goto L_0x07c4
            r0 = 3
            r2.A0W(r0)
        L_0x07c4:
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r4 = r7.A0A
            if (r4 == 0) goto L_0x07d8
            java.lang.String r3 = r5.getUsername()
            r2 = 0
            r0 = 0
            r4.A08(r3, r0)
            com.instagram.common.typedurl.ImageUrl r0 = r5.Bh3()
            r4.A04(r0, r2)
        L_0x07d8:
            com.instagram.igds.components.button.IgdsButton r2 = r7.A07
            if (r2 == 0) goto L_0x07e0
            r0 = 6
            X.WBG.A01(r2, r0, r7, r5)
        L_0x07e0:
            com.instagram.igds.components.button.IgdsButton r2 = r7.A06
            if (r2 == 0) goto L_0x07e8
            r0 = 7
            X.WBG.A01(r2, r0, r7, r6)
        L_0x07e8:
            r0 = 1119111721(0x42b44a29, float:90.144844)
            goto L_0x0036
        L_0x07ed:
            r1 = 85594916(0x51a1324, float:7.244561E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.VXt r5 = (X.C17490VXt) r5
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = "ig_reels_qa_follow_responder_click_point"
            com.instagram.common.session.UserSession r0 = r5.A03
            X.FH6.A03(r4, r0, r3, r2)
            r0 = 307859124(0x12598eb4, float:6.864902E-28)
            goto L_0x0036
        L_0x080c:
            r1 = -368042420(0xffffffffea101e4c, float:-4.35571E25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.VXt r5 = (X.C17490VXt) r5
            java.lang.Object r4 = r0.A01
            android.app.Activity r4 = (android.app.Activity) r4
            java.lang.Object r3 = r0.A02
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = "ig_reels_qa_unfollow_responder_click_point"
            com.instagram.common.session.UserSession r0 = r5.A03
            X.FH6.A03(r4, r0, r3, r2)
            r0 = -40099301(0xfffffffffd9c221b, float:-2.5942082E37)
            goto L_0x0036
        L_0x082b:
            r1 = 1794848370(0x6afb3672, float:1.5184875E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            X.VXt r8 = (X.C17490VXt) r8
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            X.07i r7 = r8.A00
            java.lang.Object r9 = r0.A02
            X.8ab r3 = new X.8ab
            r3.<init>((android.content.Context) r6)
            r2 = 2131957531(0x7f13171b, float:1.9551649E38)
            r5 = 0
            X.W4z r4 = new X.W4z
            r4.<init>(r5, r6, r7, r8, r9)
            X.8ae r0 = X.C358278ae.RED
            r3.A0Q(r4, r0, r2)
            X.W59 r0 = X.W59.A00
            r3.A0C(r0)
            r0 = 2131971051(0x7f134beb, float:1.957907E38)
            r3.A09(r0)
            r0 = 2131971047(0x7f134be7, float:1.9579062E38)
            r3.A08(r0)
            r3.A04()
            X.DbT.A1V(r3)
            r0 = 302191964(0x1203155c, float:4.136264E-28)
            goto L_0x0036
        L_0x086d:
            r1 = -1841346385(0xffffffff923f48af, float:-6.0358563E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r12 = r0.A02
            X.Uh3 r12 = (X.C15697Uh3) r12
            java.lang.Object r4 = r0.A01
            X.WOx r4 = (X.C19191WOx) r4
            java.lang.Object r2 = r0.A03
            X.VXp r2 = (X.VXp) r2
            java.lang.String r14 = r4.A02
            java.lang.String r0 = "slideshow"
            boolean r0 = r0.equals(r14)
            java.lang.String r6 = "insightProcessor"
            java.lang.String r5 = "impressionItem"
            r11 = 0
            if (r0 == 0) goto L_0x08cc
            if (r2 == 0) goto L_0x08ca
            int r0 = r2.A00
        L_0x0893:
            X.Ucj r2 = r4.A00(r0)
            if (r2 == 0) goto L_0x113a
            X.Ua1 r0 = r12.A0I
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r8 = r12.A0O
            java.util.List r3 = r2.A02
            X.VMf r0 = r4.A00
            if (r0 == 0) goto L_0x08c8
            java.lang.String r15 = r0.A00
        L_0x08a9:
            X.VMf r0 = r2.A00
            java.lang.String r2 = r0.A00
            X.1Nv r10 = r12.A08
            if (r10 == 0) goto L_0x113f
            X.WWU r9 = r12.A04
            if (r9 == 0) goto L_0x1143
            java.util.List r0 = r12.A0S
            java.lang.String r17 = "tap"
            r13 = r11
            r18 = r3
            r19 = r0
            r16 = r2
            X.HWG.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x08c3:
            r0 = -1714306909(0xffffffff99d1c0a3, float:-2.1687899E-23)
            goto L_0x0036
        L_0x08c8:
            r15 = r11
            goto L_0x08a9
        L_0x08ca:
            r0 = 0
            goto L_0x0893
        L_0x08cc:
            X.Ua1 r0 = r12.A0I
            androidx.fragment.app.FragmentActivity r7 = r0.requireActivity()
            com.instagram.common.session.UserSession r8 = r12.A0O
            java.util.List r2 = r4.A03
            X.VMf r0 = r4.A00
            if (r0 == 0) goto L_0x08f3
            java.lang.String r15 = r0.A00
        L_0x08dc:
            X.1Nv r10 = r12.A08
            if (r10 == 0) goto L_0x113f
            X.WWU r9 = r12.A04
            if (r9 == 0) goto L_0x1143
            java.util.List r0 = r12.A0S
            java.lang.String r17 = "tap"
            r13 = r11
            r16 = r11
            r18 = r2
            r19 = r0
            X.HWG.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x08c3
        L_0x08f3:
            r15 = r11
            goto L_0x08dc
        L_0x08f5:
            r1 = -150281786(0xfffffffff70ae1c6, float:-2.81686E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A03
            X.UZK r5 = (X.UZK) r5
            X.WGU r4 = r5.A00
            if (r4 != 0) goto L_0x090c
            X.DbS.A12()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x090c:
            X.UzE r3 = X.C16678UzE.AD_PREVIEW_TEMPLATE_SELECTION
            java.lang.Object r2 = r0.A01
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r2 = r2.A00
            java.lang.String r2 = (java.lang.String) r2
            r4.A0F(r3, r2)
            java.lang.Object r0 = r0.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r4 = r0.A00
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x093b
            X.Vl8 r2 = X.C13990Tnq.A0N()
            X.0eM r3 = r5.A03
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            r5.requireActivity()
            X.R8Q r2 = r2.A00(r0, r4)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dbc.A0S(r2, r0, r3)
        L_0x093b:
            r0 = 1325109539(0x4efb9123, float:2.11029645E9)
            goto L_0x0036
        L_0x0940:
            r1 = 481499930(0x1cb31b1a, float:1.1852232E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.UbT r3 = (X.C15375UbT) r3
            android.content.Context r4 = r3.getContext()
            if (r4 == 0) goto L_0x09e2
            java.lang.Object r9 = r0.A01
            com.instagram.business.promote.model.SpecialRequirementCategory r9 = (com.instagram.business.promote.model.SpecialRequirementCategory) r9
            java.lang.Object r2 = r0.A02
            X.U53 r2 = (X.U53) r2
            X.0eM r0 = r3.A04
            java.lang.Object r3 = r0.getValue()
            X.U8l r3 = (X.C14775U8l) r3
            boolean r0 = r2.getCheckBoxCheckState()
            r14 = r0 ^ 1
            r10 = 1
            r8 = 4
            com.instagram.business.promote.model.SpecialRequirementCategory r0 = com.instagram.business.promote.model.SpecialRequirementCategory.A08
            if (r9 == r0) goto L_0x0977
            com.instagram.business.promote.model.PromoteData r0 = r3.A00
            boolean r0 = X.W2F.A03(r4, r0)
            r23 = 1
            if (r0 != 0) goto L_0x0979
        L_0x0977:
            r23 = 0
        L_0x0979:
            com.instagram.common.session.UserSession r0 = r3.A02
            X.WGU r2 = X.WGU.A00(r0)
            X.UzE r15 = X.C16678UzE.REGULATED_CATEGORY_SELECTION
            if (r23 == 0) goto L_0x0a7e
            java.lang.String r0 = "lead_gen_invalid_hec_option"
            r2.A0F(r15, r0)
        L_0x0988:
            X.05G r13 = r3.A03
            X.JwC r0 = X.JTO.A0P(r13)
            X.Tnz r12 = r0.A03(r9)
            if (r12 == 0) goto L_0x09e2
        L_0x0994:
            java.lang.Object r11 = r13.getValue()
            r5 = r11
            X.JwC r5 = (X.C61074JwC) r5
            int r0 = r9.ordinal()
            if (r0 == r8) goto L_0x0a4c
            r7 = 3
            r21 = 0
            if (r0 == r7) goto L_0x0a19
            r6 = 2
            if (r0 == r6) goto L_0x09e7
            if (r0 != r10) goto L_0x09dc
            if (r23 != 0) goto L_0x09b1
            if (r14 == 0) goto L_0x09b1
            r21 = 1
        L_0x09b1:
            boolean r2 = r12.A01
            boolean r0 = r12.A03
            X.Tnz r4 = new X.Tnz
            r20 = r6
            r22 = r0
            r18 = r4
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.Object r3 = r5.A03
            X.Tnz r3 = (X.C13997Tnz) r3
            java.lang.Object r2 = r5.A02
            X.Tnz r2 = (X.C13997Tnz) r2
            java.lang.Object r0 = r5.A01
            X.Tnz r0 = (X.C13997Tnz) r0
            X.Dba.A0j(r10, r3, r2)
            X.0qQ.A0B(r0, r6)
            X.0qQ.A0B(r4, r7)
            X.JwC r5 = new X.JwC
            r5.<init>((X.C13997Tnz) r3, (X.C13997Tnz) r2, (X.C13997Tnz) r0, (X.C13997Tnz) r4)
        L_0x09dc:
            boolean r0 = r13.AIY(r11, r5)
            if (r0 == 0) goto L_0x0994
        L_0x09e2:
            r0 = 828820078(0x3166ca6e, float:3.3584473E-9)
            goto L_0x0036
        L_0x09e7:
            if (r23 != 0) goto L_0x09ed
            if (r14 == 0) goto L_0x09ed
            r21 = 1
        L_0x09ed:
            boolean r2 = r12.A01
            boolean r0 = r12.A03
            X.Tnz r4 = new X.Tnz
            r20 = r6
            r22 = r0
            r18 = r4
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.Object r3 = r5.A03
            X.Tnz r3 = (X.C13997Tnz) r3
            java.lang.Object r2 = r5.A02
            X.Tnz r2 = (X.C13997Tnz) r2
            java.lang.Object r0 = r5.A00
            X.Tnz r0 = (X.C13997Tnz) r0
            X.Dba.A0j(r10, r3, r2)
            X.0qQ.A0B(r4, r6)
            X.0qQ.A0B(r0, r7)
            X.JwC r5 = new X.JwC
            r5.<init>((X.C13997Tnz) r3, (X.C13997Tnz) r2, (X.C13997Tnz) r4, (X.C13997Tnz) r0)
            goto L_0x09dc
        L_0x0a19:
            if (r23 != 0) goto L_0x0a1f
            if (r14 == 0) goto L_0x0a1f
            r21 = 1
        L_0x0a1f:
            boolean r2 = r12.A01
            boolean r0 = r12.A03
            r6 = 2
            X.Tnz r4 = new X.Tnz
            r20 = r6
            r22 = r0
            r18 = r4
            r19 = r2
            r18.<init>(r19, r20, r21, r22, r23)
            java.lang.Object r3 = r5.A03
            X.Tnz r3 = (X.C13997Tnz) r3
            java.lang.Object r2 = r5.A01
            X.Tnz r2 = (X.C13997Tnz) r2
            java.lang.Object r0 = r5.A00
            X.Tnz r0 = (X.C13997Tnz) r0
            X.Dba.A0j(r10, r3, r4)
            X.0qQ.A0B(r2, r6)
            X.0qQ.A0B(r0, r7)
            X.JwC r5 = new X.JwC
            r5.<init>((X.C13997Tnz) r3, (X.C13997Tnz) r4, (X.C13997Tnz) r2, (X.C13997Tnz) r0)
            goto L_0x09dc
        L_0x0a4c:
            boolean r2 = r12.A01
            boolean r0 = r12.A02
            r7 = 0
            r6 = 2
            X.Tnz r4 = new X.Tnz
            r15 = r4
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r10
            r20 = r0
            r15.<init>(r16, r17, r18, r19, r20)
            java.lang.Object r3 = r5.A02
            X.Tnz r3 = (X.C13997Tnz) r3
            java.lang.Object r2 = r5.A01
            X.Tnz r2 = (X.C13997Tnz) r2
            java.lang.Object r0 = r5.A00
            X.Tnz r0 = (X.C13997Tnz) r0
            X.0qQ.A0B(r4, r7)
            X.0qQ.A0B(r3, r10)
            X.AnonymousClass7TF.A1C(r2, r6, r0)
            X.JwC r5 = new X.JwC
            r5.<init>((X.C13997Tnz) r4, (X.C13997Tnz) r3, (X.C13997Tnz) r2, (X.C13997Tnz) r0)
            goto L_0x09dc
        L_0x0a7e:
            java.lang.String r22 = "regulated_category_selection"
            r18 = 0
            r19 = r18
            r20 = r18
            r21 = r18
            r17 = r9
            r16 = r2
            X.WGU.A02(r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0988
        L_0x0a91:
            r1 = 1987579529(0x76780e89, float:1.2577973E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A03
            X.UZX r6 = (X.UZX) r6
            X.0eM r2 = r6.A0C
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Object r7 = r0.A02
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            java.lang.Object r0 = r0.A01
            X.VMI r0 = (X.VMI) r0
            X.UL2 r0 = r0.A00
            com.instagram.api.schemas.InstagramMediaProductType r2 = r0.A03
            if (r2 == 0) goto L_0x0ab5
            com.instagram.api.schemas.InstagramMediaProductType r0 = com.instagram.api.schemas.InstagramMediaProductType.STORY
            r12 = 1
            if (r2 == r0) goto L_0x0ab6
        L_0x0ab5:
            r12 = 0
        L_0x0ab6:
            android.content.Context r4 = r6.requireContext()
            X.X6L r2 = r6.A05
            r0 = 8
            X.W4v r5 = new X.W4v
            r5.<init>(r0, r2, r6)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131970272(0x7f1348e0, float:1.957749E38)
            java.lang.String r9 = X.AnonymousClass7TF.A0d(r2, r0)
            android.content.res.Resources r2 = r4.getResources()
            r0 = 2131970271(0x7f1348df, float:1.9577488E38)
            java.lang.String r10 = X.AnonymousClass7TF.A0d(r2, r0)
            r11 = 2131970267(0x7f1348db, float:1.957748E38)
            X.8ae r8 = X.C358278ae.RED_BOLD
            X.8ab r0 = X.W3M.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.DbT.A1V(r0)
            X.WGU r4 = X.WGU.A00(r3)
            X.UzE r3 = X.C16678UzE.CAMPAIGN_CONTROLS
            java.lang.String r2 = "promote_edit_delete_dialog"
            java.lang.String r0 = "ads_manager"
            r4.A01 = r0
            r4.A0H(r3, r2)
            r0 = 1166400550(0x4585dc26, float:4283.5186)
            goto L_0x0036
        L_0x0afd:
            r1 = -1044560655(0xffffffffc1bd44f1, float:-23.658663)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.W3M r3 = X.W3M.A00
            java.lang.Object r6 = r0.A03
            X.UZX r6 = (X.UZX) r6
            X.0eM r2 = r6.A0C
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Object r8 = r0.A02
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            java.lang.Object r0 = r0.A01
            X.VMI r0 = (X.VMI) r0
            X.UL2 r0 = r0.A00
            com.instagram.api.schemas.InstagramMediaProductType r2 = r0.A03
            if (r2 == 0) goto L_0x0b23
            com.instagram.api.schemas.InstagramMediaProductType r0 = com.instagram.api.schemas.InstagramMediaProductType.STORY
            r9 = 1
            if (r2 == r0) goto L_0x0b24
        L_0x0b23:
            r9 = 0
        L_0x0b24:
            android.content.Context r4 = r6.requireContext()
            X.X6L r2 = r6.A06
            r0 = 8
            X.W4v r5 = new X.W4v
            r5.<init>(r0, r2, r6)
            r3.A07(r4, r5, r6, r7, r8, r9)
            r0 = -1410922484(0xffffffffabe7080c, float:-1.6415771E-12)
            goto L_0x0036
        L_0x0b39:
            r1 = 1283715552(0x4c83f1e0, float:6.9177088E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A03
            X.UZX r7 = (X.UZX) r7
            X.0eM r2 = r7.A09
            java.lang.Object r6 = r2.getValue()
            X.VwK r6 = (X.C18662VwK) r6
            java.lang.String r5 = r7.A04
            java.lang.String r8 = "mediaId"
            r4 = 0
            if (r5 == 0) goto L_0x12ed
            java.lang.String r3 = "campaign_controls"
            java.lang.String r2 = "promotion_preview"
            r6.A08(r3, r2, r5, r4)
            android.content.Context r3 = r7.requireContext()
            X.0eM r2 = r7.A0C
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r6 = r7.A04
            if (r6 == 0) goto L_0x12ed
            java.lang.Object r2 = r0.A01
            X.VMI r2 = (X.VMI) r2
            X.UL2 r2 = r2.A00
            com.instagram.api.schemas.CallToActionType r2 = r2.A02
            if (r2 != 0) goto L_0x0b74
            com.instagram.api.schemas.CallToActionType r2 = com.instagram.api.schemas.CallToActionType.UNRECOGNIZED
        L_0x0b74:
            java.lang.String r7 = r2.toString()
            java.lang.Object r0 = r0.A02
            X.UL2 r0 = (X.UL2) r0
            java.lang.String r8 = r0.A0H
            java.util.List r9 = r0.A0K
            if (r9 != 0) goto L_0x0b87
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x0b87:
            java.lang.String r5 = "promotion_campaign_controls"
            X.C305796Jo.A02(r3, r4, r5, r6, r7, r8, r9)
            r0 = 483215275(0x1ccd47ab, float:1.3584288E-21)
            goto L_0x0036
        L_0x0b91:
            r1 = 8756380(0x859c9c, float:1.2270302E-38)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.Object r2 = r0.A03
            com.instagram.business.promote.model.PromoteData r2 = (com.instagram.business.promote.model.PromoteData) r2
            com.instagram.common.session.UserSession r3 = r2.A0y
            X.6Yo r2 = new X.6Yo
            r2.<init>(r4, r3)
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r2.A0D(r0)
            r2.A04()
            r0 = -456008467(0xffffffffe4d1dced, float:-3.0970311E22)
            goto L_0x0036
        L_0x0bb6:
            r1 = 1864787010(0x6f266442, float:5.1495716E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r8 = r0.A03
            com.instagram.business.promote.model.PromoteData r8 = (com.instagram.business.promote.model.PromoteData) r8
            com.instagram.common.session.UserSession r7 = r8.A0y
            X.WGU r4 = X.WGU.A00(r7)
            X.UzE r3 = X.C16678UzE.OBJECTIVE
            java.lang.String r2 = "boost_objective_recommendation_pill_pv"
            r4.A0F(r3, r2)
            X.C13990Tnq.A0h()
            java.lang.Object r2 = r0.A02
            r6 = 0
            X.0qQ.A0B(r2, r6)
            X.UbV r5 = new X.UbV
            r5.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "recommended_destination"
            r4.putString(r2, r3)
            r5.setArguments(r4)
            X.0qQ.A06(r7)
            X.7Pr r3 = new X.7Pr
            r3.<init>(r7)
            X.Wdo r2 = new X.Wdo
            r2.<init>((java.lang.Object) r8, (int) r6)
            r3.A0U = r2
            X.7Pu r2 = r3.A00()
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r2.A02(r0, r5)
            r0 = 100895215(0x60389ef, float:2.47397E-35)
            goto L_0x0036
        L_0x0c0c:
            r1 = -1608655896(0xffffffffa01ddbe8, float:-1.3371178E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.X8N r3 = (X.X8N) r3
            java.lang.Object r2 = r0.A03
            X.X9b r2 = (X.C21004X9b) r2
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.PromoteAdsManagerActionType r0 = (com.instagram.business.promote.model.PromoteAdsManagerActionType) r0
            r3.CtF(r0, r2)
            r0 = 822763687(0x310a60a7, float:2.0136584E-9)
            goto L_0x0036
        L_0x0c27:
            r1 = -1689582206(0xffffffff9b4b0582, float:-1.6793546E-22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Dg1 r2 = (X.C46498Dg1) r2
            android.content.Context r4 = r2.A00
            java.lang.Object r2 = r0.A03
            X.W2M r2 = (X.W2M) r2
            com.instagram.common.session.UserSession r8 = r2.A05
            X.0iw r7 = r2.A04
            androidx.fragment.app.Fragment r2 = r2.A03
            X.0gy r6 = X.AnonymousClass07i.A00(r2)
            X.0hq r5 = r2.getParentFragmentManager()
            X.LG3 r3 = new X.LG3
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r2 = r0.A02
            X.XBo r2 = (X.C21047XBo) r2
            X.WNY r0 = new X.WNY
            r0.<init>(r2)
            r3.A02(r0)
            r0 = 1227157876(0x4924f174, float:675607.25)
            goto L_0x0036
        L_0x0c5c:
            r1 = 1390907624(0x52e790e8, float:4.97284284E11)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Dg1 r2 = (X.C46498Dg1) r2
            android.content.Context r5 = r2.A00
            java.lang.Object r3 = r0.A03
            X.W2M r3 = (X.W2M) r3
            com.instagram.common.session.UserSession r9 = r3.A05
            X.0iw r8 = r3.A04
            androidx.fragment.app.Fragment r2 = r3.A03
            X.0gy r7 = X.AnonymousClass07i.A00(r2)
            X.0hq r6 = r2.getParentFragmentManager()
            X.LG3 r4 = new X.LG3
            r4.<init>(r5, r6, r7, r8, r9)
            com.instagram.model.reels.Reel r3 = r3.A06
            java.lang.Object r2 = r0.A02
            X.XBo r2 = (X.C21047XBo) r2
            X.WNW r0 = new X.WNW
            r0.<init>(r2)
            r4.A00(r0, r3)
            r0 = 1331250050(0x4f594382, float:3.64508006E9)
            goto L_0x0036
        L_0x0c93:
            r1 = -270406199(0xffffffffefe1edc9, float:-1.3984318E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A03
            X.Uie r2 = (X.C15795Uie) r2
            X.0sJ r6 = r2.A05
            java.lang.Object r5 = r0.A02
            X.WSd r5 = (X.C19270WSd) r5
            com.instagram.model.reels.Reel r4 = r5.A03
            java.lang.Object r0 = r0.A01
            X.UEB r0 = (X.UEB) r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r3 = r0.A08
            com.instagram.user.model.User r0 = r5.A04
            java.lang.String r2 = r0.getId()
            java.lang.String r0 = r5.A05
            r6.invoke(r4, r3, r2, r0)
            r0 = -704359812(0xffffffffd604527c, float:-3.6372451E13)
            goto L_0x0036
        L_0x0cbc:
            r0 = -560210094(0xffffffffde9bdf52, float:-5.6158931E18)
            int r1 = X.AnonymousClass0fD.A05(r0)
            r0 = -1157420144(0xffffffffbb032b90, float:-0.002001498)
            goto L_0x0036
        L_0x0cc8:
            r0 = 1842369266(0x6dd052f2, float:8.0591446E27)
            int r1 = X.AnonymousClass0fD.A05(r0)
            X.0qQ.A0A(r4)
            r0 = -1068797935(0xffffffffc04b7011, float:-3.178715)
            goto L_0x0036
        L_0x0cd7:
            r1 = -918604603(0xffffffffc93f34c5, float:-783180.3)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.2qm r1 = (X.C231042qm) r1
            X.XC9 r2 = r1.BgB()
            java.lang.Object r1 = r0.A02
            X.4dH r1 = (X.C268374dH) r1
            java.lang.Object r0 = r0.A03
            X.VZd r0 = (X.C17524VZd) r0
            int r0 = r0.A01
            r2.APY(r1, r0)
            r0 = -1279125800(0xffffffffb3c216d8, float:-9.037984E-8)
            goto L_0x0d55
        L_0x0cf7:
            r1 = -727394475(0xffffffffd4a4d755, float:-5.6638985E12)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.VwI r3 = (X.C18661VwI) r3
            androidx.fragment.app.Fragment r1 = r3.A02
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            r1 = 2131969822(0x7f13471e, float:1.9576578E38)
            X.C59689JTv.A07(r2, r1)
            java.lang.Object r1 = r0.A01
            com.instagram.model.shopping.productfeed.ProductFeedItem r1 = (com.instagram.model.shopping.productfeed.ProductFeedItem) r1
            com.instagram.user.model.Product r2 = r1.A02()
            if (r2 == 0) goto L_0x0d32
            com.instagram.common.session.UserSession r1 = r3.A03
            r2.A00(r1)
            X.2qt r4 = r3.A07
            java.lang.Object r3 = r0.A02
            com.instagram.model.shopping.productfeed.ProductTile r3 = (com.instagram.model.shopping.productfeed.ProductTile) r3
            java.lang.String r2 = r4.A0D
            if (r2 == 0) goto L_0x0d2e
            X.0wc r1 = r4.A01
            java.lang.String r0 = r4.A07
            X.C17055VGd.A00(r1, r3, r2, r0)
        L_0x0d2e:
            r0 = 166745478(0x9f05586, float:5.7858324E-33)
            goto L_0x0d55
        L_0x0d32:
            java.lang.String r1 = "productFeedItem product must not be null"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d3a:
            r1 = 439091677(0x1a2c01dd, float:3.557027E-23)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.X4q r2 = (X.C20925X4q) r2
            java.lang.Object r1 = r0.A03
            com.instagram.user.model.ProductCollectionImpl r1 = (com.instagram.user.model.ProductCollectionImpl) r1
            if (r1 == 0) goto L_0x0d59
            java.lang.Object r0 = r0.A02
            X.VkR r0 = (X.C18043VkR) r0
            r2.DZq(r0, r1)
            r0 = -1370797953(0xffffffffae4b487f, float:-4.6221246E-11)
        L_0x0d55:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x0d59:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1852156264(0xffffffff919a5698, float:-2.4350283E-28)
            X.AnonymousClass0fD.A0C(r0, r5)
            throw r1
        L_0x0d64:
            r1 = 374809124(0x16572224, float:1.7378335E-25)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A03
            X.U94 r1 = (X.U94) r1
            X.2xy r12 = r1.A04
            java.lang.Object r2 = r0.A01
            X.Uq6 r2 = (X.C16181Uq6) r2
            com.instagram.music.common.model.MusicDataSource r13 = r2.A02
            java.lang.Integer r5 = r12.C9D(r13)
            r15 = 0
            r3 = 0
            r12.EHu(r3)
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            if (r4 != r5) goto L_0x0dc7
            java.lang.Object r0 = r0.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r14 = r0.getValue()
            X.6k3 r14 = (X.C315536k3) r14
            r17 = -1
            r18 = r17
            r19 = r3
            r20 = r3
            r16 = r3
            r12.ETw(r13, r14, r15, r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r13 = r1.A03
            java.lang.String r0 = r2.A07
            java.lang.Long r14 = X.C51971G9r.A0n(r3, r0)
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = r2.A00
            java.lang.String r3 = r0.A07
            X.0iw r12 = r1.A02
            X.HOL r9 = X.HOL.SONG
            X.6sU r11 = r1.A01
            X.0sP r1 = r1.A08
            java.lang.String r0 = r2.A08
            java.lang.Object r10 = r1.invoke(r0)
            X.8ZN r10 = (X.AnonymousClass8ZN) r10
            r17 = r15
            r18 = r15
            r19 = r0
            r16 = r3
            X.C52086GEg.A0H(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0dc2:
            r0 = -2116167713(0xffffffff81ddd7df, float:-8.149234E-38)
            goto L_0x11d0
        L_0x0dc7:
            X.0iw r12 = r1.A02
            com.instagram.common.session.UserSession r13 = r1.A03
            java.lang.String r0 = r2.A07
            java.lang.Long r14 = X.C51971G9r.A0n(r3, r0)
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = r2.A00
            java.lang.String r3 = r0.A07
            X.HOL r9 = X.HOL.SONG
            X.6sU r11 = r1.A01
            X.0sP r1 = r1.A08
            java.lang.String r0 = r2.A08
            java.lang.Object r10 = r1.invoke(r0)
            X.8ZN r10 = (X.AnonymousClass8ZN) r10
            r17 = r15
            r18 = r0
            r16 = r3
            X.C52086GEg.A0G(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0dc2
        L_0x0ded:
            r1 = 1936462546(0x736c12d2, float:1.8703671E31)
            int r7 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A03
            X.U94 r3 = (X.U94) r3
            X.0iw r10 = r3.A02
            com.instagram.common.session.UserSession r11 = r3.A03
            java.lang.String r18 = X.AnonymousClass7TG.A0j()
            X.HOu r8 = X.C54689HOu.A0X
            java.lang.Object r2 = r0.A01
            X.Uq6 r2 = (X.C16181Uq6) r2
            java.lang.String r6 = r2.A07
            long r24 = java.lang.Long.parseLong(r6)
            java.lang.Object r0 = r0.A02
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0e71
            int r0 = r0.intValue()
            long r0 = (long) r0
        L_0x0e17:
            r12 = 0
            X.0sP r5 = r3.A08
            java.lang.String r4 = r2.A08
            java.lang.Object r9 = r5.invoke(r4)
            X.8ZN r9 = (X.AnonymousClass8ZN) r9
            if (r9 != 0) goto L_0x0e28
            X.6sU r5 = r3.A01
            X.8ZN r9 = r5.A02
        L_0x0e28:
            X.6sU r5 = r3.A01
            java.lang.String r21 = r5.getSessionId()
            com.instagram.search.common.analytics.SearchContext r13 = new com.instagram.search.common.analytics.SearchContext
            r26 = r13
            r27 = r12
            r28 = r12
            r29 = r12
            r30 = r12
            r31 = r12
            r32 = r12
            r33 = r12
            r34 = r12
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r5 = r2.A06
            if (r5 == 0) goto L_0x0e4f
            java.lang.Long r17 = X.AnonymousClass7TE.A10(r5)
            if (r17 != 0) goto L_0x0e54
        L_0x0e4f:
            r5 = 0
            java.lang.Long r17 = X.C51971G9r.A0n(r5, r6)
        L_0x0e54:
            r14 = r12
            r15 = r12
            r16 = r12
            r19 = r12
            r20 = r12
            r22 = r6
            r23 = r4
            r26 = r0
            X.C52086GEg.A0K(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
            X.X7t r0 = r3.A05
            r0.DLx(r2)
            r0 = 942240730(0x382973da, float:4.0400635E-5)
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0e71:
            r0 = -1
            goto L_0x0e17
        L_0x0e74:
            r1 = 2036646189(0x7964c12d, float:7.423511E34)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.UER r1 = (X.UER) r1
            X.3oV r3 = r1.A0A
            android.view.View r2 = r3.getView()
            android.view.View r1 = r3.getView()
            boolean r1 = r1.isSelected()
            r1 = r1 ^ 1
            r2.setSelected(r1)
            android.view.View r1 = r3.getView()
            boolean r2 = r1.isSelected()
            java.lang.Object r1 = r0.A03
            X.U94 r1 = (X.U94) r1
            com.instagram.common.session.UserSession r14 = r1.A03
            if (r2 == 0) goto L_0x0eea
            X.0iw r13 = r1.A02
            java.lang.Object r0 = r0.A02
            X.Uq6 r0 = (X.C16181Uq6) r0
            java.lang.String r2 = r0.A07
            long r21 = java.lang.Long.parseLong(r2)
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r0.A00
            java.lang.String r15 = r2.A07
            r16 = 0
            X.HOL r9 = X.HOL.SONG
            X.HOu r10 = X.C54689HOu.A0X
            X.6sU r12 = r1.A01
            X.0sP r3 = r1.A08
            java.lang.String r2 = r0.A08
            java.lang.Object r11 = r3.invoke(r2)
            X.8ZN r11 = (X.AnonymousClass8ZN) r11
            r17 = r16
            r18 = r16
            r19 = r16
            r20 = r2
            X.C52086GEg.A0E(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r2 = r1.A09
            if (r2 == 0) goto L_0x0ee0
            X.27r r4 = X.27p.A01(r14)
            X.283 r2 = r4.A04
            X.JVj r3 = r2.A0C
            java.lang.String r2 = "AUDIO_SAVED_FROM_TRENDING"
            r4.A1Q(r3, r2)
        L_0x0ee0:
            X.X7t r1 = r1.A05
            r1.Dgd(r0)
            r0 = 979548549(0x3a62b985, float:8.6488604E-4)
            goto L_0x11d0
        L_0x0eea:
            X.0iw r13 = r1.A02
            java.lang.Object r0 = r0.A02
            X.Uq6 r0 = (X.C16181Uq6) r0
            java.lang.String r2 = r0.A07
            long r19 = java.lang.Long.parseLong(r2)
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r0.A00
            java.lang.String r15 = r2.A07
            r16 = 0
            X.HOu r10 = X.C54689HOu.A0X
            X.6sU r12 = r1.A01
            X.0sP r3 = r1.A08
            java.lang.String r2 = r0.A08
            java.lang.Object r11 = r3.invoke(r2)
            X.8ZN r11 = (X.AnonymousClass8ZN) r11
            r17 = r16
            r18 = r2
            X.C52086GEg.A0J(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0ee0
        L_0x0f12:
            r1 = 570049924(0x21fa4584, float:1.695906E-18)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Vl6 r2 = (X.C18077Vl6) r2
            java.lang.Object r3 = r0.A03
            X.UnM r3 = (X.C16033UnM) r3
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView r12 = r3.A01
            java.lang.Object r1 = r0.A02
            X.UKy r1 = (X.C15045UKy) r1
            boolean r0 = r1.A0A
            r14 = 0
            if (r0 == 0) goto L_0x0f3b
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r14)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0f3b
            r14 = 1
        L_0x0f3b:
            r0 = 0
            X.0qQ.A0B(r12, r0)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r3.setTime(r0)
            r1 = 12
            r0 = 60
            r3.add(r1, r0)
            int r0 = r3.get(r1)
            int r0 = r0 % 5
            if (r0 == 0) goto L_0x0f5f
            int r0 = 5 - r0
            r3.add(r1, r0)
        L_0x0f5f:
            X.Umf r2 = r2.A00
            androidx.fragment.app.FragmentActivity r10 = r2.requireActivity()
            X.UnS r0 = X.C13990Tnq.A0R(r2)
            com.instagram.common.session.UserSession r11 = r0.A0H
            android.content.Context r1 = r2.requireContext()
            int r0 = r2.A09
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r0)
            X.L9C r9 = new X.L9C
            r9.<init>(r10, r11, r12, r13, r14)
            java.util.Date r3 = r3.getTime()
            X.0qQ.A07(r3)
            X.OVW r0 = r9.A01
            java.lang.String r2 = r9.A03
            r6 = 1
            r1 = 0
            r4 = r1
            r5 = r1
            r0.A01(r1, r2, r3, r4, r5, r6)
            r0 = 1109816056(0x422672f8, float:41.612274)
            goto L_0x11d0
        L_0x0f91:
            r1 = 1460461506(0x570cdfc2, float:1.5489266E14)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.VOr r1 = (X.C17264VOr) r1
            java.lang.Object r9 = r0.A03
            X.5qt r9 = (X.C296935qt) r9
            java.lang.Object r6 = r0.A02
            X.1Xj r6 = (X.1Xj) r6
            X.0qQ.A0A(r4)
            r2 = 0
            boolean r24 = X.DbW.A1Y(r4)
            X.UZq r5 = r1.A00
            X.N4N r0 = X.C13989Tnp.A0b(r5)
            java.util.List r0 = r0.A0H
            java.util.Iterator r3 = r0.iterator()
        L_0x0fb8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x10ae
            java.lang.Object r1 = r3.next()
            boolean r0 = r1 instanceof X.C70826OMy
            if (r0 == 0) goto L_0x0fb8
            if (r1 == 0) goto L_0x10ae
            X.OMy r1 = (X.C70826OMy) r1
            if (r1 == 0) goto L_0x10ae
            X.0eM r12 = r5.A0m
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r12)
            X.0eM r0 = r1.A0A
            java.lang.String r0 = X.DbS.A0t(r0)
            r13 = 0
            X.AnonymousClass72K.A00(r3, r0, r13, r2)
            X.C15286UZq.A00(r1, r5, r13)
            X.OLm r0 = r1.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x1041
            com.instagram.user.model.User r4 = r0.A04
        L_0x0fe9:
            java.util.List r0 = r1.A08
            if (r0 != 0) goto L_0x0fef
            X.0sn r0 = X.0sn.A00
        L_0x0fef:
            int r7 = r0.indexOf(r6)
            X.5qz r3 = new X.5qz
            r3.<init>(r2, r7)
            r5.A0A(r3, r9, r6)
            java.lang.String r15 = X.C13988Tno.A0a(r5)
            java.lang.String r16 = X.C13988Tno.A0Y(r5)
            java.lang.String r17 = X.C13988Tno.A0X(r5)
            X.N4N r3 = X.C13989Tnp.A0b(r5)
            java.lang.String r3 = r3.A0G
            java.lang.String r19 = X.C13988Tno.A0Z(r5)
            com.instagram.search.common.analytics.SearchContext r7 = new com.instagram.search.common.analytics.SearchContext
            r14 = r7
            r18 = r13
            r20 = r13
            r21 = r3
            r22 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            if (r4 == 0) goto L_0x1097
            X.UZa r3 = r5.A06()
            X.TwL r5 = r3.A02()
            java.lang.String r9 = r1.A04
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x1033:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x1043
            java.lang.String r0 = X.C51971G9r.A0v(r10)
            r3.add(r0)
            goto L_0x1033
        L_0x1041:
            r4 = r13
            goto L_0x0fe9
        L_0x1043:
            java.lang.String r21 = "feed_contextual_account_hcm"
            java.lang.String r18 = "User_Feed"
            java.lang.String r10 = r5.A07
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            r11 = 2131969693(0x7f13469d, float:1.9576316E38)
            java.lang.String r19 = r0.getString(r11)
            java.lang.String r20 = r6.getId()
            java.lang.String r27 = r4.getId()
            java.lang.String r28 = r4.getUsername()
            com.instagram.feed.intf.ContextualFeedNetworkConfig r16 = new com.instagram.feed.intf.ContextualFeedNetworkConfig
            r25 = r16
            r26 = r9
            r29 = r13
            r30 = r13
            r31 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31)
            X.0jB r4 = new X.0jB
            r4.<init>()
            X.0j9 r6 = X.C297695sB.A02
            java.lang.String r2 = r7.A06
            r4.A04(r6, r2)
            X.0jB r15 = new X.0jB
            r15.<init>()
            r15.A06(r4)
            boolean r2 = r5.A0A
            if (r2 == 0) goto L_0x10b3
            com.instagram.common.session.UserSession r2 = r5.A04
            r14 = r13
            r22 = r10
            r23 = r3
            r17 = r7
            android.os.Bundle r4 = X.C46424Del.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r3 = "contextual_feed"
            X.DbY.A0u(r0, r4, r2, r3)
        L_0x1097:
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r12)
            X.ToJ r2 = X.C14025ToR.A00(r0)
            X.OLm r0 = r1.A00()
            X.N2k r0 = r0.A00
            if (r0 == 0) goto L_0x10d1
            com.instagram.user.model.User r0 = r0.A04
            if (r0 == 0) goto L_0x10d1
            r2.A01(r0)
        L_0x10ae:
            r0 = -4438491(0xffffffffffbc4625, float:NaN)
            goto L_0x11d0
        L_0x10b3:
            com.instagram.common.session.UserSession r2 = r5.A04
            X.6Yo r2 = X.DbU.A0Q(r0, r2)
            java.lang.String r0 = "search_result"
            r2.A0B = r0
            instagram.features.feed.fragment.ContextualFeedFragment r0 = new instagram.features.feed.fragment.ContextualFeedFragment
            r0.<init>()
            r14 = r13
            r22 = r10
            r23 = r3
            r17 = r7
            android.os.Bundle r3 = X.C46424Del.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            X.DbW.A0y(r3, r0, r2)
            goto L_0x1097
        L_0x10d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x10d6:
            java.lang.Object r1 = r0.A01
            X.WGR r1 = (X.WGR) r1
            java.lang.Object r2 = r0.A02
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r0 = r0.A03
            com.instagram.model.venue.Venue r0 = (com.instagram.model.venue.Venue) r0
            com.instagram.common.session.UserSession r4 = r1.A00
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = r1.A02
            java.lang.String r7 = r0.A04()
            X.TpH r5 = X.C14068TpH.DISCOVERY_MAP
            X.UzD r6 = X.C16677UzD.LOCATION_PAGE
            X.OcF r2 = X.ORV.A01(r2, r3, r4, r5, r6, r7)
            r0 = 1
            r2.A0H = r0
            X.Uz2 r1 = X.C16666Uz2.REPORT_BUTTON
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r2.A02 = r1
            r0 = 0
            X.C71093OcF.A00(r0, r2)
            return
        L_0x1102:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x110e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x1114:
            X.2p0 r3 = r1.A02
            r3.getClass()
            int r8 = X.UAK.A00(r1, r4)
            X.3UH r0 = r1.A01
            r0.getClass()
            int r9 = r0.A01
            X.3UH r0 = r1.A01
            r0.getClass()
            java.lang.String r5 = r0.A0C
            X.3UH r0 = r1.A01
            r0.getClass()
            java.lang.String r7 = r0.getId()
            java.lang.String r6 = "preview"
            r3.DLL(r4, r5, r6, r7, r8, r9)
            return
        L_0x113a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x113f:
            X.0qQ.A0F(r5)
            goto L_0x1146
        L_0x1143:
            X.0qQ.A0F(r6)
        L_0x1146:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x114b:
            r1 = -1900782164(0xffffffff8eb45dac, float:-4.446363E-30)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r14 = r0.A03
            X.Uh3 r14 = (X.C15697Uh3) r14
            java.lang.Object r3 = r0.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.A01
            X.XBs r0 = (X.C21051XBs) r0
            java.lang.String r2 = r0.getId()
            java.lang.String r1 = ""
            X.0eM r0 = X.0mp.A09
            if (r2 != 0) goto L_0x1169
            r2 = r1
        L_0x1169:
            r0 = 1
            X.0qQ.A0B(r2, r0)
            X.Ua1 r0 = r14.A0I
            androidx.fragment.app.FragmentActivity r9 = r0.requireActivity()
            com.instagram.common.session.UserSession r10 = r14.A0O
            X.1Nv r12 = r14.A08
            if (r12 != 0) goto L_0x117d
            java.lang.String r8 = "impressionItem"
            goto L_0x12ed
        L_0x117d:
            X.WWU r11 = r14.A04
            if (r11 != 0) goto L_0x1185
            java.lang.String r8 = "insightProcessor"
            goto L_0x12ed
        L_0x1185:
            java.util.List r0 = r14.A0S
            r13 = 0
            java.lang.String r16 = "button"
            r15 = r13
            r18 = r13
            r19 = r13
            r20 = r3
            r21 = r0
            r17 = r2
            X.HWG.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = -2077023010(0xffffffff843324de, float:-2.1058277E-36)
            goto L_0x11d0
        L_0x119c:
            r1 = 1598615597(0x5f48f02d, float:1.4479122E19)
            int r8 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.Ubj r2 = (X.C15384Ubj) r2
            java.lang.Object r12 = r0.A02
            X.Waz r12 = (X.C19513Waz) r12
            java.lang.Object r3 = r0.A03
            X.Cvo r3 = (X.C45408Cvo) r3
            X.4gL r0 = r3.A02
            if (r0 == 0) goto L_0x11cd
            java.lang.String r0 = r0.A0i
            if (r0 != 0) goto L_0x11d4
            X.8ab r1 = X.DbW.A0U(r2)
            r0 = 2131965156(0x7f1334e4, float:1.9567114E38)
            r1.A09(r0)
            r0 = 2131965155(0x7f1334e3, float:1.9567112E38)
            r1.A08(r0)
            r1.A06()
            X.DbT.A1V(r1)
        L_0x11cd:
            r0 = 1063181591(0x3f5edd17, float:0.87056106)
        L_0x11d0:
            X.AnonymousClass0fD.A0C(r0, r8)
            return
        L_0x11d4:
            X.32A r0 = r2.A03
            if (r0 != 0) goto L_0x11e6
            com.instagram.common.session.UserSession r4 = r2.A01
            X.328 r1 = new X.328
            r1.<init>(r2)
            X.32A r0 = new X.32A
            r0.<init>(r2, r4, r1)
            r2.A03 = r0
        L_0x11e6:
            X.4gL r4 = r3.A02
            if (r4 == 0) goto L_0x12c5
            com.instagram.common.session.UserSession r0 = r2.A01
            com.instagram.reels.store.ReelStore r1 = com.instagram.reels.store.ReelStore.A03(r0)
            java.lang.String r0 = r4.A0X
            r0.getClass()
            com.instagram.model.reels.Reel r10 = r1.A0M(r0)
            if (r10 == 0) goto L_0x12c5
            X.32A r9 = r2.A03
            java.lang.String r0 = r2.A05
            r9.A0C = r0
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            X.0S7.A00(r2)
            android.widget.ListView r4 = r2.A04
            X.UdI r1 = r2.A00
            X.Upp r0 = new X.Upp
            r0.<init>(r5, r4, r1, r2)
            r9.A05 = r0
            com.instagram.common.session.UserSession r0 = r2.A01
            com.instagram.user.model.User r0 = X.DbT.A0j(r0)
            java.lang.String r0 = r0.getId()
            r9.A0D = r0
            X.32D r1 = new X.32D
            r1.<init>()
            com.instagram.model.reels.ReelViewerConfig r0 = new com.instagram.model.reels.ReelViewerConfig
            r0.<init>((X.AnonymousClass32D) r1)
            r9.A03 = r0
            r15 = 0
            com.instagram.model.reels.Reel[] r0 = new com.instagram.model.reels.Reel[]{r10}
            java.util.List r13 = java.util.Arrays.asList(r0)
            com.instagram.model.reels.Reel[] r0 = new com.instagram.model.reels.Reel[]{r10}
            java.util.List r14 = java.util.Arrays.asList(r0)
            X.3BQ r11 = X.AnonymousClass3BQ.ARCHIVE
            r9.A06(r10, r11, r12, r13, r14, r15)
        L_0x1241:
            com.instagram.common.session.UserSession r5 = r2.A01
            X.4gL r4 = r3.A02
            X.AnonymousClass7TG.A1N(r5, r4)
            X.0wc r1 = X.AnonymousClass0kN.A01(r2, r5)
            java.lang.String r0 = "ig_live_archive_thumbnail_click"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            com.instagram.user.model.User r0 = r4.A03()
            java.lang.String r0 = r0.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "a_pk"
            r3.A9F(r0, r1)
            java.lang.String r0 = r4.A0e
            r0.getClass()
            X.C51965G9l.A1I(r3, r0)
            java.lang.String r0 = r4.A0X
            r0.getClass()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "broadcast_id"
            r3.A9F(r0, r1)
            X.4wK r0 = r4.A07
            if (r0 == 0) goto L_0x12ce
            java.lang.String r0 = r0.A00
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "archive_id"
            r3.A9F(r0, r1)
            X.4wK r0 = r4.A07
            r2 = 0
            if (r0 == 0) goto L_0x12c3
            boolean r0 = r0.A01
        L_0x128f:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 246(0xf6, float:3.45E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.A7p(r0, r1)
            java.lang.String r0 = r4.A05(r5)
            if (r0 == 0) goto L_0x12a3
            r2 = 1
        L_0x12a3:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "is_archived_playback_ready"
            r3.A7p(r0, r1)
            long r0 = r4.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "published_time"
            r3.A9F(r0, r1)
            java.lang.String r0 = "archive_live"
            X.DbS.A1O(r3, r0)
            r3.Cgf()
            goto L_0x11cd
        L_0x12c3:
            r0 = 0
            goto L_0x128f
        L_0x12c5:
            java.lang.String r1 = "archive_live"
            java.lang.String r0 = "Tried to launch live archive viewer without reel in reel store"
            X.0wb.A03(r1, r0)
            goto L_0x1241
        L_0x12ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x12d3:
            r1 = -674576709(0xffffffffd7cac6bb, float:-4.45909779E14)
            int r6 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            android.view.View r2 = (android.view.View) r2
            r1 = 0
            r2.setClickable(r1)
            java.lang.Object r5 = r0.A03
            X.UbW r5 = (X.C15378UbW) r5
            X.WGU r4 = r5.A00
            r1 = 0
            if (r4 != 0) goto L_0x12f5
            java.lang.String r8 = "promoteLogger"
        L_0x12ed:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x12f5:
            X.UzE r3 = X.C16678UzE.OBJECTIVE
            java.lang.String r2 = "use_credit_button"
            r4.A0F(r3, r2)
            X.Vvg r4 = r5.A01
            if (r4 != 0) goto L_0x1303
            java.lang.String r8 = "adsManagerDataFetcher"
            goto L_0x12ed
        L_0x1303:
            r2 = 12
            X.Ufn r3 = new X.Ufn
            r3.<init>(r5, r2)
            com.instagram.business.promote.model.PromoteData r2 = r5.A03
            if (r2 != 0) goto L_0x1311
            java.lang.String r8 = "promoteData"
            goto L_0x12ed
        L_0x1311:
            java.lang.String r2 = r2.A1A
            java.lang.Object r0 = r0.A01
            com.instagram.business.promote.model.PromoteEnrollCouponInfo r0 = (com.instagram.business.promote.model.PromoteEnrollCouponInfo) r0
            if (r0 == 0) goto L_0x131b
            java.lang.String r1 = r0.A06
        L_0x131b:
            r4.A02(r3, r2, r1)
            r0 = -1935178826(0xffffffff8ca783b6, float:-2.5809695E-31)
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB4.onClick(android.view.View):void");
    }
}
