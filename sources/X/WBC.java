package X;

import android.view.View;

public final class WBC implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WBC(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new WBC(obj, i), view);
    }

    public static void A01(C3253572b r1, Object obj, int i) {
        r1.A05 = new WBC(obj, i);
    }

    /* JADX WARNING: type inference failed for: r5v29, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v184, types: [X.07Z, X.UsI] */
    /* JADX WARNING: type inference failed for: r4v14, types: [X.07Z, android.content.Context, com.instagram.base.activity.BaseFragmentActivity] */
    /* JADX WARNING: type inference failed for: r0v401, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x06a6, code lost:
        r7 = "networkHelper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x06a8, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x06af, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x083d, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0840, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0919, code lost:
        if (r3.A0B != false) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0a43, code lost:
        if (r1 != 3) goto L_0x0a45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0a8d, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0a90, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0b04, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0b07, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0b4a, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0b4d, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0a0b  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0a3f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0aa5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r1 = r22
            r5 = r23
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0b17;
                case 1: goto L_0x0009;
                case 2: goto L_0x0b08;
                case 3: goto L_0x0b08;
                case 4: goto L_0x0009;
                case 5: goto L_0x0aef;
                case 6: goto L_0x0ab4;
                case 7: goto L_0x0aac;
                case 8: goto L_0x091c;
                case 9: goto L_0x0b40;
                case 10: goto L_0x0b35;
                case 11: goto L_0x0858;
                case 12: goto L_0x084c;
                case 13: goto L_0x0841;
                case 14: goto L_0x082e;
                case 15: goto L_0x07ac;
                case 16: goto L_0x078d;
                case 17: goto L_0x076e;
                case 18: goto L_0x0759;
                case 19: goto L_0x0746;
                case 20: goto L_0x0716;
                case 21: goto L_0x0703;
                case 22: goto L_0x06b0;
                case 23: goto L_0x0663;
                case 24: goto L_0x060a;
                case 25: goto L_0x05aa;
                case 26: goto L_0x0599;
                case 27: goto L_0x0578;
                case 28: goto L_0x0552;
                case 29: goto L_0x0505;
                case 30: goto L_0x04f2;
                case 31: goto L_0x04db;
                case 32: goto L_0x04c6;
                case 33: goto L_0x0b2a;
                case 34: goto L_0x0b1f;
                case 35: goto L_0x04b1;
                case 36: goto L_0x049c;
                case 37: goto L_0x0485;
                case 38: goto L_0x046e;
                case 39: goto L_0x0457;
                case 40: goto L_0x0440;
                case 41: goto L_0x042d;
                case 42: goto L_0x041a;
                case 43: goto L_0x0407;
                case 44: goto L_0x03f4;
                case 45: goto L_0x03dd;
                case 46: goto L_0x03c6;
                case 47: goto L_0x03af;
                case 48: goto L_0x039a;
                case 49: goto L_0x034e;
                case 50: goto L_0x0335;
                case 51: goto L_0x0319;
                case 52: goto L_0x02fd;
                case 53: goto L_0x02e3;
                case 54: goto L_0x02c9;
                case 55: goto L_0x02b0;
                case 56: goto L_0x0297;
                case 57: goto L_0x0276;
                case 58: goto L_0x0232;
                case 59: goto L_0x0217;
                case 60: goto L_0x0122;
                case 61: goto L_0x010b;
                case 62: goto L_0x00fa;
                case 63: goto L_0x00e5;
                case 64: goto L_0x00d0;
                case 65: goto L_0x009d;
                case 66: goto L_0x0033;
                case 67: goto L_0x007f;
                case 68: goto L_0x0066;
                case 69: goto L_0x0022;
                case 70: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            X.Uc0 r0 = (X.C15397Uc0) r0
            X.C15397Uc0.A02(r0)
            return
        L_0x0011:
            r0 = -1445594174(0xffffffffa9d5fbc2, float:-9.502773E-14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -47698582(0xfffffffffd282d6a, float:-1.3971632E37)
            goto L_0x0b4a
        L_0x0022:
            r0 = 459984288(0x1b6acda0, float:1.9422467E-22)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -1821415631(0xffffffff936f6731, float:-3.0216918E-27)
            goto L_0x0b4a
        L_0x0033:
            r0 = -1641619585(0xffffffff9e26df7f, float:-8.834185E-21)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ubt r2 = (X.C15390Ubt) r2
            X.W35 r1 = r2.A03
            if (r1 != 0) goto L_0x0046
            java.lang.String r7 = "logger"
            goto L_0x06a8
        L_0x0046:
            java.lang.String r0 = "onboarding_use_a_different_catalog_clicked"
            X.0xI r0 = X.W35.A00(r1, r0)
            X.W35.A05(r0, r1)
            android.view.View$OnClickListener r0 = r2.A00
            if (r0 == 0) goto L_0x005b
            r0.onClick(r5)
            r0 = 1158083228(0x4506f29c, float:2159.163)
            goto L_0x083d
        L_0x005b:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 629599092(0x2586eb74, float:2.3404844E-16)
            X.AnonymousClass0fD.A0C(r0, r6)
            throw r1
        L_0x0066:
            r0 = 1038032900(0x3ddf2004, float:0.10894778)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ubt r0 = (X.C15390Ubt) r0
            X.Vi1 r1 = r0.A05
            if (r1 == 0) goto L_0x06a6
            java.lang.String r0 = r0.A08
            r1.A00(r0)
            r0 = -1702093526(0xffffffff9a8c1d2a, float:-5.794976E-23)
            goto L_0x0b4a
        L_0x007f:
            r0 = 1558273747(0x5ce15ed3, float:5.07489041E17)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ubt r2 = (X.C15390Ubt) r2
            X.Vi1 r1 = r2.A05
            if (r1 == 0) goto L_0x06a6
            java.lang.String r0 = r2.A08
            r1.A00(r0)
            X.6rr r0 = X.C320156rr.LOADING
            X.C15390Ubt.A01(r2, r0)
            r0 = -1800834746(0xffffffff94a97146, float:-1.7109318E-26)
            goto L_0x0b4a
        L_0x009d:
            r0 = -2026210582(0xffffffff873a7aea, float:-1.4029206E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ubt r2 = (X.C15390Ubt) r2
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x00b9
            boolean r0 = r2.A0C
            if (r0 == 0) goto L_0x00cc
            r0 = -1
            r1.setResult(r0)
            r1.finish()
        L_0x00b9:
            X.0eM r0 = r2.A0K
            X.1Ng r1 = X.DbX.A0R(r0)
            X.WQ4 r0 = new X.WQ4
            r0.<init>()
            r1.A00(r0)
            r0 = 939244211(0x37fbbab3, float:3.000847E-5)
            goto L_0x0a8d
        L_0x00cc:
            r1.onBackPressed()
            goto L_0x00b9
        L_0x00d0:
            r0 = 1339172554(0x4fd226ca, float:7.0515149E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uar r1 = (X.C15341Uar) r1
            X.Uvu r0 = X.C16498Uvu.COLLECTIONS
            X.C15341Uar.A01(r0, r1)
            r0 = 200500315(0xbf3645b, float:9.3751193E-32)
            goto L_0x0b4a
        L_0x00e5:
            r0 = -878859293(0xffffffffcb9dabe3, float:-2.066631E7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uar r1 = (X.C15341Uar) r1
            X.Uvu r0 = X.C16498Uvu.PRODUCTS
            X.C15341Uar.A01(r0, r1)
            r0 = 1674624957(0x63d0bfbd, float:7.701478E21)
            goto L_0x0b4a
        L_0x00fa:
            r0 = 1667068758(0x635d7356, float:4.0850413E21)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = -1766108122(0xffffffff96bb5426, float:-3.0264585E-25)
            goto L_0x0b4a
        L_0x010b:
            r0 = -1841259532(0xffffffff92409bf4, float:-6.0776745E-28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uae r1 = (X.C15329Uae) r1
            java.lang.String r0 = "close_button"
            r1.A03 = r0
            X.DbT.A1J(r1)
            r0 = -624963444(0xffffffffdabfd08c, float:-2.69955101E16)
            goto L_0x0b4a
        L_0x0122:
            r0 = 1512342855(0x5a248547, float:1.1577109E16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = (com.instagram.shopping.fragment.pdp.AdsProductPageFragment) r0
            X.W1i r4 = r0.A09
            X.1Xj r0 = r4.A01
            r15 = 0
            if (r0 == 0) goto L_0x0137
            r0.BR7()
        L_0x0137:
            X.1Xj r0 = r4.A01
            if (r0 == 0) goto L_0x013f
            java.lang.String r15 = r0.getId()
        L_0x013f:
            X.4DH r11 = r4.A07
            com.instagram.common.session.UserSession r12 = r4.A08
            X.X9C r0 = r4.A0B
            X.Vuf r0 = r0.Bz5()
            com.instagram.user.model.Product r14 = r0.A09
            java.lang.String r3 = r4.A0J
            java.lang.String r1 = r4.A0G
            X.VP6 r13 = r4.A0A
            com.instagram.api.schemas.RankingInfo r10 = r4.A06
            java.lang.String r0 = r4.A0H
            X.VtB r9 = new X.VtB
            r16 = r3
            r17 = r1
            r18 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            r7 = 0
            com.instagram.common.session.UserSession r3 = r9.A02
            X.Dg1 r6 = new X.Dg1
            r6.<init>(r0, r3)
            java.util.List r0 = r9.A08
            java.util.Iterator r8 = r0.iterator()
        L_0x0172:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r5 = r8.next()
            X.UxW r5 = (X.C16577UxW) r5
            int r1 = r5.ordinal()
            if (r1 == r7) goto L_0x0196
            r0 = 1
            if (r1 == r0) goto L_0x0196
            r0 = 6
            if (r1 == r0) goto L_0x0196
            int r4 = r5.A00
            r1 = 3
            X.WBE r0 = new X.WBE
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r9)
            r6.A04(r0, r4)
            goto L_0x0172
        L_0x0196:
            int r4 = r5.A00
            r1 = 2
            X.WBE r0 = new X.WBE
            r0.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r9)
            r6.A02(r0, r4)
            goto L_0x0172
        L_0x01a2:
            X.4DH r5 = r9.A01
            androidx.fragment.app.Fragment r0 = r5.mParentFragment
            boolean r0 = r0 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r0 == 0) goto L_0x020d
            X.FFy r1 = new X.FFy
            r1.<init>(r6)
            android.content.Context r0 = r5.requireContext()
            r1.A04(r0)
        L_0x01b6:
            androidx.fragment.app.FragmentActivity r4 = r5.getActivity()
            com.instagram.user.model.Product r0 = r9.A03
            if (r0 == 0) goto L_0x020a
            java.lang.String r7 = r0.A0H
        L_0x01c0:
            java.lang.String r6 = r9.A04
            java.lang.String r0 = "report_product"
            X.0xI r5 = X.0xI.A00(r5, r0)
            java.lang.String r1 = r3.A06
            java.lang.String r0 = "actor_id"
            r5.A0C(r0, r1)
            java.lang.String r1 = "ACTION_OPEN_PRODUCT_DIALOG"
            java.lang.String r0 = "action"
            r5.A0C(r0, r1)
            java.lang.String r0 = "target_id"
            r5.A0C(r0, r7)
            java.lang.String r0 = "m_pk"
            r5.A0C(r0, r6)
            if (r6 == 0) goto L_0x0202
            X.1Xj r0 = X.DbV.A0U(r3, r6)
            if (r0 == 0) goto L_0x0202
            com.instagram.user.model.User r0 = r0.A2A(r3)
            if (r0 == 0) goto L_0x0205
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r0)
            java.lang.String r0 = "follow_status"
            r5.A0C(r0, r1)
            X.C17119VIp.A00(r4, r5, r3)
        L_0x0202:
            X.DbU.A1R(r5, r3)
        L_0x0205:
            r0 = -1296354357(0xffffffffb2bb33cb, float:-2.1793218E-8)
            goto L_0x0b04
        L_0x020a:
            java.lang.String r7 = r9.A06
            goto L_0x01c0
        L_0x020d:
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x01b6
            X.C13988Tno.A0r(r0, r6)
            goto L_0x01b6
        L_0x0217:
            r0 = 954359648(0x38e25f60, float:1.0794285E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r1 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r1
            X.1Xj r0 = r1.A01
            if (r0 == 0) goto L_0x022d
            java.lang.String r0 = r0.getId()
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment.A04(r1, r0)
        L_0x022d:
            r0 = 1025001405(0x3d1847bd, float:0.03717779)
            goto L_0x0a8d
        L_0x0232:
            r0 = -547276138(0xffffffffdf613a96, float:-1.6229449E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Uak r6 = (X.C15335Uak) r6
            X.0eM r0 = r6.A0B
            java.lang.Object r5 = r0.getValue()
            X.W26 r5 = (X.W26) r5
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0262
            X.V1W r4 = X.V1W.STOREFRONT
            X.V1Z r3 = X.V1Z.BACK_BUTTON
            X.V1X r1 = X.V1X.CONTINUE_SHOPPING
            X.V1Y r0 = X.V1Y.NAVIGATION_BAR
            X.W26.A02(r3, r4, r0, r1, r5)
        L_0x025a:
            X.DbT.A1J(r6)
            r0 = 139557087(0x85178df, float:6.3035733E-34)
            goto L_0x0b04
        L_0x0262:
            java.lang.String r0 = "instagram_shopping_home"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x025a
            X.V1Z r4 = X.V1Z.BACK_BUTTON
            X.V1X r3 = X.V1X.CONTINUE_SHOPPING
            X.V1W r1 = X.V1W.TAB_FEED
            X.V1Y r0 = X.V1Y.NAVIGATION_BAR
            X.W26.A03(r4, r1, r0, r3, r5)
            goto L_0x025a
        L_0x0276:
            r0 = 640576727(0x262e6cd7, float:6.051588E-16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WcX r2 = (X.C19608WcX) r2
            X.Wdw r0 = r2.A01
            java.lang.Object r0 = r0.A01
            X.Uaq r0 = (X.C15340Uaq) r0
            X.Wei r1 = r0.A04
            if (r1 == 0) goto L_0x06a6
            r0 = 1
            X.C19741Wei.A00(r1, r0)
            r2.FKG()
            r0 = -987957255(0xffffffffc51cf7f9, float:-2511.4983)
            goto L_0x0b4a
        L_0x0297:
            r0 = -723218603(0xffffffffd4e48f55, float:-7.853258E12)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WcY r2 = (X.C19609WcY) r2
            X.Wej r1 = r2.A01
            r0 = 1
            r1.A01(r0, r0)
            r2.FKG()
            r0 = -1879165987(0xffffffff8ffe33dd, float:-2.506631E-29)
            goto L_0x0b4a
        L_0x02b0:
            r0 = 934901899(0x37b9788b, float:2.210985E-5)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WcW r2 = (X.C19607WcW) r2
            X.Wej r1 = r2.A01
            r0 = 1
            r1.A01(r0, r0)
            r2.FKG()
            r0 = 1887613675(0x7082b2eb, float:3.235948E29)
            goto L_0x0b4a
        L_0x02c9:
            r0 = 1865707019(0x6f346e0b, float:5.5840336E28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WcZ r2 = (X.C19610WcZ) r2
            X.Vhd r1 = r2.A01
            java.lang.String r0 = r2.A02
            r1.A00(r0)
            r2.FKG()
            r0 = -1510140789(0xffffffffa5fd148b, float:-4.3902424E-16)
            goto L_0x0b4a
        L_0x02e3:
            r0 = -1999280635(0xffffffff88d56605, float:-1.2843456E-33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WcZ r2 = (X.C19610WcZ) r2
            X.Vhd r1 = r2.A01
            java.lang.String r0 = r2.A02
            r1.A00(r0)
            r2.FKG()
            r0 = 785532808(0x2ed24788, float:9.562401E-11)
            goto L_0x0b4a
        L_0x02fd:
            r0 = 788793833(0x2f0409e9, float:1.2008851E-10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Wcc r3 = (X.C19613Wcc) r3
            X.Vjc r2 = r3.A02
            X.0sP r1 = r3.A04
            X.0sP r0 = r3.A03
            r2.A01(r1, r0)
            r3.FKG()
            r0 = 194708507(0xb9b041b, float:5.9710005E-32)
            goto L_0x0b4a
        L_0x0319:
            r0 = -1118674436(0xffffffffbd5261fc, float:-0.051362976)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Wcb r3 = (X.C19612Wcb) r3
            X.Vjc r2 = r3.A02
            X.0sP r1 = r3.A04
            X.0sP r0 = r3.A03
            r2.A00(r1, r0)
            r3.FKG()
            r0 = -1196188034(0xffffffffb8b39e7e, float:-8.5649066E-5)
            goto L_0x0b4a
        L_0x0335:
            r0 = -84046455(0xfffffffffafd8d89, float:-6.582609E35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Wca r2 = (X.C19611Wca) r2
            X.Wej r1 = r2.A03
            r0 = 1
            r1.A01(r0, r0)
            r2.FKG()
            r0 = 1109720345(0x4224fd19, float:41.247166)
            goto L_0x0b4a
        L_0x034e:
            r0 = 259202209(0xf731ca1, float:1.1986339E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Vi2 r5 = (X.C17911Vi2) r5
            X.W26 r6 = r5.A03
            if (r6 == 0) goto L_0x0372
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "instagram_shopping_mini_shop_storefront"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0386
            X.V1W r3 = X.V1W.STOREFRONT
            X.V1Z r2 = X.V1Z.VIEW_WISHLIST_BUTTON
            X.V1X r1 = X.V1X.CONTINUE_SHOPPING
            X.V1Y r0 = X.V1Y.NAVIGATION_BAR
            X.W26.A02(r2, r3, r0, r1, r6)
        L_0x0372:
            X.3kF r6 = X.C249713kF.A00
            androidx.fragment.app.FragmentActivity r7 = r5.A01
            com.instagram.common.session.UserSession r8 = r5.A02
            java.lang.String r9 = r5.A05
            java.lang.String r10 = r5.A04
            java.lang.String r11 = "navigation_bar"
            r6.A1A(r7, r8, r9, r10, r11)
            r0 = -140358691(0xfffffffff7a24bdd, float:-6.583522E33)
            goto L_0x0a8d
        L_0x0386:
            java.lang.String r0 = "instagram_shopping_home"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0372
            X.V1Z r3 = X.V1Z.VIEW_WISHLIST_BUTTON
            X.V1X r2 = X.V1X.CONTINUE_SHOPPING
            X.V1W r1 = X.V1W.TAB_FEED
            X.V1Y r0 = X.V1Y.NAVIGATION_BAR
            X.W26.A03(r3, r1, r0, r2, r6)
            goto L_0x0372
        L_0x039a:
            r0 = -1113882647(0xffffffffbd9b7fe9, float:-0.07592756)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UiK r0 = (X.C15775UiK) r0
            X.X4p r0 = r0.A00
            r0.DU9()
            r0 = -413269987(0xffffffffe75e001d, float:-1.04836745E24)
            goto L_0x0b4a
        L_0x03af:
            r0 = -2001722759(0xffffffff88b02279, float:-1.0600719E-33)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSN r0 = (X.WSN) r0
            X.VTo r0 = r0.A01
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -1487823928(0xffffffffa7519bc8, float:-2.9089026E-15)
            goto L_0x0b4a
        L_0x03c6:
            r0 = 110115250(0x69039b2, float:5.4251555E-35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSN r0 = (X.WSN) r0
            X.VTo r0 = r0.A01
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 642291091(0x26489593, float:6.959165E-16)
            goto L_0x0b4a
        L_0x03dd:
            r0 = -492850628(0xffffffffe29fb23c, float:-1.4729377E21)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSM r0 = (X.WSM) r0
            X.VPU r0 = r0.A01
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 873824953(0x341582b9, float:1.3924263E-7)
            goto L_0x0b4a
        L_0x03f4:
            r0 = 1191818708(0x4709b5d4, float:35253.83)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X4o r0 = (X.C20923X4o) r0
            r0.Dx8()
            r0 = -966568122(0xffffffffc6635746, float:-14549.818)
            goto L_0x0b4a
        L_0x0407:
            r0 = -615471871(0xffffffffdb50a501, float:-5.8728219E16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X7v r0 = (X.X7v) r0
            r0.Dz2()
            r0 = -14386986(0xffffffffff2478d6, float:-2.186208E38)
            goto L_0x0b4a
        L_0x041a:
            r0 = 895008751(0x3558bfef, float:8.074557E-7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X7v r0 = (X.X7v) r0
            r0.Czi()
            r0 = 1769291620(0x69753f64, float:1.8530386E25)
            goto L_0x0b4a
        L_0x042d:
            r0 = 1228131698(0x4933cd72, float:736471.1)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X7v r0 = (X.X7v) r0
            r0.CuK()
            r0 = 450590012(0x1adb753c, float:9.076568E-23)
            goto L_0x0b4a
        L_0x0440:
            r0 = -1743872710(0xffffffff980e9d3a, float:-1.8432449E-24)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSi r0 = (X.C19275WSi) r0
            X.VPT r0 = r0.A01
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 371244732(0x1620bebc, float:1.2984882E-25)
            goto L_0x0b4a
        L_0x0457:
            r0 = 917046243(0x36a903e3, float:5.037045E-6)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UNx r0 = (X.C15080UNx) r0
            X.VPS r0 = r0.A00
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -1366781767(0xffffffffae8890b9, float:-6.210272E-11)
            goto L_0x0b4a
        L_0x046e:
            r0 = 1794276431(0x6af27c4f, float:1.4657354E26)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSK r0 = (X.WSK) r0
            X.VWs r0 = r0.A01
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -233426590(0xfffffffff2163162, float:-2.974877E30)
            goto L_0x0b4a
        L_0x0485:
            r0 = -2059660565(0xffffffff853c12eb, float:-8.843192E-36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSK r0 = (X.WSK) r0
            X.VWs r0 = r0.A01
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = 1563151959(0x5d2bce57, float:7.7374551E17)
            goto L_0x0b4a
        L_0x049c:
            r0 = 1347089990(0x504af646, float:1.36205496E10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UrV r0 = (X.C16268UrV) r0
            X.0sa r0 = r0.A01
            r0.invoke()
            r0 = -465666085(0xffffffffe43e7fdb, float:-1.4056377E22)
            goto L_0x0b4a
        L_0x04b1:
            r0 = -572444430(0xffffffffdde130f2, float:-2.02834194E18)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UKj r0 = (X.C15030UKj) r0
            X.0sa r0 = r0.A05
            r0.invoke()
            r0 = -1097258990(0xffffffffbe992812, float:-0.29913384)
            goto L_0x0b4a
        L_0x04c6:
            r0 = 177033408(0xa8d50c0, float:1.3608181E-32)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UNv r0 = (X.C15078UNv) r0
            X.0sa r0 = r0.A02
            r0.invoke()
            r0 = 1214702015(0x4866e1bf, float:236422.98)
            goto L_0x0b4a
        L_0x04db:
            r0 = 552643033(0x20f0a9d9, float:4.0769977E-19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WSk r0 = (X.C19277WSk) r0
            X.Vbb r0 = r0.A02
            X.0sa r0 = r0.A00
            r0.invoke()
            r0 = -1336835631(0xffffffffb05181d1, float:-7.621824E-10)
            goto L_0x0b4a
        L_0x04f2:
            r0 = -914833554(0xffffffffc978bf6e, float:-1018870.9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Wbk r0 = (X.C19560Wbk) r0
            r0.A04()
            r0 = -813259800(0xffffffffcf86a3e8, float:-4.5177774E9)
            goto L_0x0b4a
        L_0x0505:
            r0 = -1316859455(0xffffffffb18251c1, float:-3.7927923E-9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Wbk r0 = (X.C19560Wbk) r0
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r3 = r0.A00
            com.instagram.model.payments.checkout.CheckoutLaunchParams r1 = r3.A04
            if (r1 != 0) goto L_0x0522
            java.lang.String r1 = "instagram_shopping_merchant_bag"
            java.lang.String r0 = "Attempting to checkout with a cart with no available items to checkout."
            X.0wb.A03(r1, r0)
        L_0x051d:
            r0 = 1443502526(0x560a19be, float:3.7960792E13)
            goto L_0x0b04
        L_0x0522:
            X.X8w r0 = r3.A0B
            r0.CpP(r1)
            X.W1l r4 = r3.A09
            java.lang.String r6 = r3.A0S
            java.lang.String r7 = r3.A0Y
            java.lang.String r8 = r3.A0U
            java.lang.String r9 = r3.A0N
            java.lang.String r10 = r3.A0Q
            r10.getClass()
            java.lang.String r11 = r3.A0T
            r11.getClass()
            com.instagram.common.session.UserSession r0 = r3.A02
            X.6xT r0 = X.C323426xT.A00(r0)
            java.lang.Integer r0 = r0.A06()
            int r12 = X.C13988Tno.A0D(r0)
            X.VvF r5 = r3.A0E
            r5.getClass()
            r4.A04(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x051d
        L_0x0552:
            r0 = 101414701(0x60b772d, float:2.623055E-35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Wbk r0 = (X.C19560Wbk) r0
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r2 = r0.A00
            X.Uw5 r1 = X.C16508Uw5.LOADING
            r2.A0A = r1
            X.VvF r0 = r2.A0E
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment.A00(r1, r2, r0)
            com.instagram.common.session.UserSession r0 = r2.A02
            X.6xT r1 = X.C323426xT.A00(r0)
            java.lang.String r0 = r2.A0U
            r1.A04(r0)
            r0 = 775157317(0x2e33f645, float:4.091862E-11)
            goto L_0x0b4a
        L_0x0578:
            r0 = -1554196972(0xffffffffa35cd614, float:-1.1971557E-17)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.shopping.fragment.cart.ShoppingCartFragment r1 = (com.instagram.shopping.fragment.cart.ShoppingCartFragment) r1
            X.Uw5 r0 = X.C16508Uw5.LOADING
            r1.A09 = r0
            com.instagram.shopping.fragment.cart.ShoppingCartFragment.A01(r1)
            com.instagram.common.session.UserSession r0 = r1.A02
            X.6xT r1 = X.C323426xT.A00(r0)
            r0 = 0
            r1.A07(r0)
            r0 = -452033603(0xffffffffe50e83bd, float:-4.2062886E22)
            goto L_0x0b4a
        L_0x0599:
            r0 = 994814163(0x3b4ba8d3, float:0.003107597)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 310860950(0x12875c96, float:8.542522E-28)
            goto L_0x0b4a
        L_0x05aa:
            r0 = -892113905(0xffffffffcad36c0f, float:-6927879.5)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Vc7 r3 = (X.C17676Vc7) r3
            X.VeS r6 = X.WGP.A00
            X.0wc r7 = r3.A04
            X.Uyr r8 = r3.A00
            java.lang.String r9 = "fulcrum_nexus_tap"
            java.lang.String r10 = "BPAT"
            r11 = 1
            X.1Ln r2 = r6.A00(r7, r8, r9, r10, r11)
            java.lang.String r1 = "fulcrum_nexus"
            java.lang.String r0 = "entry_point"
            r2.A0R(r0, r1)
            java.lang.String r1 = "fulcrum_nexus_main"
            java.lang.String r0 = "flow"
            r2.A0R(r0, r1)
            java.lang.String r0 = "tap"
            r2.A0k(r0)
            java.lang.String r1 = "fulcrum_nexus_open_billing"
            java.lang.String r0 = "component"
            r2.A0R(r0, r1)
            r2.Cgf()
            X.UsI r6 = r3.A06
            X.0eM r2 = r6.A08
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "settings_business_options"
            X.C18707VyY.A01(r1, r0)
            com.instagram.base.activity.BaseFragmentActivity r4 = r6.A01
            java.lang.String r7 = "activity"
            if (r4 == 0) goto L_0x06a8
            X.0gy r3 = X.AnonymousClass07i.A00(r4)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            r1 = 6
            X.WOo r0 = new X.WOo
            r0.<init>((X.C16298UsI) r6, (int) r1)
            X.C18794W2b.A01(r4, r3, r0, r2)
            r0 = 810151137(0x3049ece1, float:7.346E-10)
            goto L_0x0b4a
        L_0x060a:
            r0 = -1996830159(0xffffffff88faca31, float:-1.5093863E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.Vc7 r6 = (X.C17676Vc7) r6
            X.Uyr r10 = r6.A00
            X.Uyr r7 = X.C16655Uyr.INSTAGRAM_BACKED_ADS
            java.lang.String r5 = "fulcrum_nexus_open_billing"
            java.lang.String r4 = "tap"
            java.lang.String r1 = "fulcrum_nexus"
            X.VeS r8 = X.WGP.A00
            X.0wc r9 = r6.A04
            boolean r13 = r6.A02
            java.lang.String r11 = "fulcrum_nexus_tap"
            java.lang.String r12 = "FBAT"
            X.1Ln r3 = r8.A00(r9, r10, r11, r12, r13)
            java.lang.String r0 = "entry_point"
            r3.A0R(r0, r1)
            if (r10 != r7) goto L_0x0660
            java.lang.String r1 = "fulcrum_nexus_igba_graduation"
        L_0x0636:
            java.lang.String r0 = "flow"
            r3.A0R(r0, r1)
            r3.A0k(r4)
            java.lang.String r0 = "component"
            r3.A0R(r0, r5)
            r3.Cgf()
            com.instagram.base.activity.BaseFragmentActivity r5 = r6.A03
            X.UsI r0 = r6.A07
            X.0gy r4 = X.AnonymousClass07i.A00(r0)
            com.instagram.common.session.UserSession r3 = r6.A05
            java.lang.String r1 = r6.A08
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.8ey r0 = X.C18678Vwb.A00(r5, r3, r0, r1)
            X.1ES.A00(r5, r4, r0)
            r0 = -837425663(0xffffffffce15e601, float:-6.2871968E8)
            goto L_0x0b04
        L_0x0660:
            java.lang.String r1 = "fulcrum_nexus_switch_link"
            goto L_0x0636
        L_0x0663:
            r0 = -1237830207(0xffffffffb63835c1, float:-2.7449425E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.VuY r6 = (X.C18582VuY) r6
            com.instagram.model.hashtag.Hashtag r0 = r6.A03
            java.lang.Integer r0 = r0.B6z()
            r1 = 0
            java.lang.String r7 = "hashtagApi"
            java.lang.String r5 = "hashtag_serp_follow_button"
            if (r0 == 0) goto L_0x0697
            int r0 = r0.intValue()
            if (r0 != r1) goto L_0x0697
            X.2oy r3 = r6.A02
            if (r3 == 0) goto L_0x06a8
            com.instagram.common.session.UserSession r2 = r6.A08
            X.2p2 r1 = r6.A09
            com.instagram.model.hashtag.Hashtag r0 = r6.A03
            r3.A05(r2, r1, r0, r5)
            r0 = 1
        L_0x068f:
            X.C18582VuY.A00(r6, r0)
            r0 = -372439123(0xffffffffe9cd07ad, float:-3.0983255E25)
            goto L_0x0a8d
        L_0x0697:
            X.2oy r3 = r6.A02
            if (r3 == 0) goto L_0x06a8
            com.instagram.common.session.UserSession r2 = r6.A08
            X.2p2 r1 = r6.A09
            com.instagram.model.hashtag.Hashtag r0 = r6.A03
            r3.A06(r2, r1, r0, r5)
            r0 = 0
            goto L_0x068f
        L_0x06a6:
            java.lang.String r7 = "networkHelper"
        L_0x06a8:
            X.0qQ.A0F(r7)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x06b0:
            r0 = 1930403882(0x730fa02a, float:1.1379196E31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.VuY r6 = (X.C18582VuY) r6
            java.lang.String r7 = r6.A0A
            com.instagram.common.session.UserSession r1 = r6.A08
            r0 = 0
            X.ExC r5 = X.ORV.A00(r1, r0)
            X.0qQ.A07(r5)
            android.content.Context r0 = r6.A05
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r0, r1)
            r2 = 35
            com.instagram.model.hashtag.Hashtag r0 = r6.A03
            java.lang.String r0 = r0.getName()
            if (r0 != 0) goto L_0x06dd
            r0 = 1
            java.lang.String r0 = X.00R.A02(r7, r0)
        L_0x06dd:
            java.lang.String r0 = X.002.A0D(r0, r2)
            r3.A08(r0)
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            X.WBD r0 = new X.WBD
            r0.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5)
            r3.A02(r0, r1)
            com.instagram.model.hashtag.Hashtag r0 = r6.A03
            r0.getId()
            X.FFy r1 = new X.FFy
            r1.<init>(r3)
            android.app.Activity r0 = r6.A04
            r1.A03(r0)
            r0 = -141771204(0xfffffffff78cbe3c, float:-5.7092185E33)
            goto L_0x0a8d
        L_0x0703:
            r0 = -1314539348(0xffffffffb1a5b8ac, float:-4.823127E-9)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.X4d r0 = (X.C20912X4d) r0
            r0.DiH()
            r0 = -80807329(0xfffffffffb2efa5f, float:-9.085378E35)
            goto L_0x083d
        L_0x0716:
            r0 = -687352252(0xffffffffd707d644, float:-1.49354334E14)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Uq0 r2 = (X.C16175Uq0) r2
            X.6M6 r0 = r2.A07
            int r0 = r0.A0F
            float r5 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r1
            com.instagram.common.ui.base.IgFrameLayout r0 = r2.A05
            float r4 = r0.getTranslationY()
            android.graphics.drawable.Drawable r0 = r2.A04
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r0 = r0 * r1
            float r4 = r4 + r0
            X.6Zv r3 = r2.A08
            X.3ui r2 = r2.A06
            int r1 = (int) r5
            int r0 = (int) r4
            r3.DcE(r2, r1, r0)
            r0 = 1945171837(0x73f0f77d, float:3.8182706E31)
            goto L_0x083d
        L_0x0746:
            r0 = 1934749352(0x7351eea8, float:1.6632546E31)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Tp9 r0 = (X.C14061Tp9) r0
            X.C14061Tp9.A01(r0)
            r0 = 1412723061(0x54347175, float:3.09999043E12)
            goto L_0x083d
        L_0x0759:
            r0 = 1954667422(0x7481db9e, float:8.230721E31)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.6Jt r0 = (X.C305836Jt) r0
            X.6ZZ r0 = r0.A0d
            r0.DIB()
            r0 = 1460415450(0x570c2bda, float:1.54119969E14)
            goto L_0x083d
        L_0x076e:
            r0 = -1228672532(0xffffffffb6c3f1ec, float:-5.8396163E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.6Jt r0 = (X.C305836Jt) r0
            X.3mM r3 = r0.A03
            if (r3 == 0) goto L_0x0788
            X.3uh r2 = r0.A02
            if (r2 == 0) goto L_0x0788
            X.6ZZ r1 = r0.A0d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.Dw4(r2, r3, r0)
        L_0x0788:
            r0 = -998872912(0xffffffffc47668b0, float:-985.63574)
            goto L_0x0a8d
        L_0x078d:
            r0 = 77809777(0x4a34871, float:3.8387643E-36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.6Jt r0 = (X.C305836Jt) r0
            X.3mM r3 = r0.A03
            if (r3 == 0) goto L_0x07a7
            X.3uh r2 = r0.A02
            if (r2 == 0) goto L_0x07a7
            X.6ZZ r1 = r0.A0d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.Dw4(r2, r3, r0)
        L_0x07a7:
            r0 = -499730083(0xffffffffe236b95d, float:-8.4266606E20)
            goto L_0x0a8d
        L_0x07ac:
            r0 = 744978890(0x2c6779ca, float:3.289468E-12)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Jpv r1 = (X.C60710Jpv) r1
            X.Vcd r0 = r1.A02
            r0.getClass()
            X.3N6 r3 = r1.A0C
            java.lang.String r7 = r3.A01
            r7.getClass()
            com.instagram.common.session.UserSession r4 = r0.A03
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            boolean r3 = X.C70349O3b.A00(r4, r13)
            if (r3 != 0) goto L_0x07f1
            X.2pG r3 = r0.A08
            int r10 = r0.A00
            java.util.List r9 = r0.A0B
            X.Jpv r4 = r0.A07
            java.lang.String r8 = r0.A0A
            java.lang.Integer r6 = r0.A09
            X.3O9 r5 = r0.A04
            X.5kP r0 = r0.A06
            boolean r11 = X.AnonymousClass7TF.A1V(r0)
            r3.Dca(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x07e4:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r1.A0A
            r0 = 1060320051(0x3f333333, float:0.7)
            r1.setAlpha(r0)
            r0 = -502577341(0xffffffffe20b4743, float:-6.423081E20)
            goto L_0x0b04
        L_0x07f1:
            X.1Av r15 = X.1Au.A00(r4)
            X.0xa r6 = r15.A01
            r3 = 200(0xc8, float:2.8E-43)
            java.lang.String r5 = X.AnonymousClass000.A00(r3)
            r3 = 0
            int r18 = r6.getInt(r5, r3)
            X.3kW r3 = X.AnonymousClass1Qz.A00(r4)
            X.1R7 r9 = r3.C82()
            r19 = 1
            X.WA2 r8 = new X.WA2
            r14 = r8
            r16 = r0
            r17 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            android.content.Context r7 = r0.A01
            X.0iw r10 = r0.A02
            X.3BT r3 = r0.A05
            com.instagram.model.reels.Reel r0 = r3.A03
            com.instagram.common.typedurl.ImageUrl r11 = r0.A07()
            boolean r0 = r3.A04(r4)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            X.C49256Erz.A00(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x07e4
        L_0x082e:
            r0 = -2013945734(0xffffffff87f5a07a, float:-3.6957822E-34)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1205251273(0x47d6acc9, float:109913.57)
        L_0x083d:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0841:
            java.lang.Object r0 = r1.A01
            X.Ub4 r0 = (X.C15353Ub4) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r0.A03
            r0 = 0
            r1.A0B(r0)
            return
        L_0x084c:
            java.lang.Object r0 = r1.A01
            X.Ub4 r0 = (X.C15353Ub4) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r2 = r0.A03
            r1 = 0
            r0 = 1
            r2.A0C(r1, r0)
            return
        L_0x0858:
            r0 = 32087970(0x1e99fa2, float:8.5819744E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.VzN r3 = (X.C18742VzN) r3
            android.widget.LinearLayout r7 = r3.A05
            if (r5 == r7) goto L_0x08ec
            int r6 = r3.A00
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r3.A05 = r5
            java.util.List r2 = r3.A09
            r2.getClass()
            java.util.List r1 = r3.A0A
            r1.getClass()
            android.widget.LinearLayout r0 = r3.A05
            int r0 = r1.indexOf(r0)
            int r0 = X.C51971G9r.A0I(r2, r0)
            r3.A00 = r0
            r7.getClass()
            r5 = 0
            android.view.View r1 = r7.getChildAt(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3.A0H
            r1.setTextColor(r0)
            android.content.Context r2 = r3.A0I
            r0 = 2130969991(0x7f040587, float:1.754868E38)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbU.A11(r2, r7, r0)
            android.widget.LinearLayout r0 = r3.A05
            r0.getClass()
            android.view.View r1 = r0.getChildAt(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r0 = r3.A0G
            r1.setTextColor(r0)
            android.widget.LinearLayout r1 = r3.A05
            r0 = 2130969990(0x7f040586, float:1.7548677E38)
            int r0 = X.2Yu.A0H(r2, r0)
            X.DbU.A11(r2, r1, r0)
            r7.setSelected(r5)
            android.widget.LinearLayout r0 = r3.A05
            r5 = 1
            r0.setSelected(r5)
            r1 = -1
            if (r6 != r1) goto L_0x08f1
            android.view.inputmethod.InputMethodManager r1 = r3.A0K
            android.widget.EditText r0 = r3.A03
            r0.getClass()
            X.C13989Tnp.A1A(r0, r1)
            android.widget.LinearLayout r0 = r3.A04
            r0.getClass()
            r2 = 8
            r0.setVisibility(r2)
            android.widget.EditText r1 = r3.A03
            android.text.TextWatcher r0 = r3.A01
            r1.removeTextChangedListener(r0)
        L_0x08e1:
            android.widget.TextView r0 = r3.A06
            r0.getClass()
            r0.setVisibility(r2)
        L_0x08e9:
            X.C18742VzN.A01(r3)
        L_0x08ec:
            r0 = 1747056726(0x6821f856, float:3.059528E24)
            goto L_0x0a8d
        L_0x08f1:
            int r0 = r3.A00
            if (r0 != r1) goto L_0x08e9
            android.widget.LinearLayout r0 = r3.A04
            r0.getClass()
            r2 = 0
            r0.setVisibility(r2)
            android.widget.EditText r0 = r3.A03
            r0.getClass()
            r0.requestFocus()
            android.view.inputmethod.InputMethodManager r1 = r3.A0K
            android.widget.EditText r0 = r3.A03
            r1.showSoftInput(r0, r5)
            android.widget.EditText r1 = r3.A03
            android.text.TextWatcher r0 = r3.A01
            r0.getClass()
            r1.addTextChangedListener(r0)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x08e9
            goto L_0x08e1
        L_0x091c:
            r0 = -1131299239(0xffffffffbc91be59, float:-0.01779096)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UZ1 r3 = (X.UZ1) r3
            X.VzN r0 = r3.A08
            r0.getClass()
            r2 = 1
            r0.A0E = r2
            boolean r0 = X.C18742VzN.A01(r0)
            if (r0 == 0) goto L_0x0a8a
            X.Uw2 r0 = r3.A07
            int r1 = r0.ordinal()
            if (r1 == r2) goto L_0x09d7
            r0 = 0
            if (r1 == r0) goto L_0x09b5
            r0 = 2
            if (r1 == r0) goto L_0x097f
            r0 = 3
            if (r1 != r0) goto L_0x0979
            com.instagram.common.session.UserSession r0 = r3.A04
            java.lang.String r5 = r3.A0E
            r5.getClass()
            java.lang.String r2 = "STORY_DONATE_PROMPT_HALF_SHEET"
        L_0x094f:
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "ig_cg_click_to_enter_checkout_flow"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r5)
            r0 = 69
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A9F(r0, r1)
            java.lang.String r0 = "source_name"
            r6.AAJ(r0, r2)
            X.XSG r1 = X.XSG.IG_CHARITY_BUSINESS_PROFILE
        L_0x096d:
            r0 = 151(0x97, float:2.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A8M(r1, r0)
        L_0x0976:
            r6.Cgf()
        L_0x0979:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            goto L_0x09e2
        L_0x097f:
            com.instagram.common.session.UserSession r0 = r3.A04
            java.lang.String r7 = r3.A0E
            r7.getClass()
            java.lang.String r5 = r3.A0A
            r5.getClass()
            java.lang.String r2 = "LIVE_HALF_SHEET"
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "ig_cg_click_to_enter_checkout_flow"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r7)
            r0 = 69
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r5)
            java.lang.String r0 = "broadcast_id"
            r6.A9F(r0, r1)
            java.lang.String r0 = "source_name"
            r6.AAJ(r0, r2)
            X.XSG r1 = X.XSG.IG_LIVE_FOR_CHARITY
            goto L_0x096d
        L_0x09b5:
            com.instagram.common.session.UserSession r0 = r3.A04
            java.lang.String r5 = r3.A0E
            r5.getClass()
            java.lang.String r2 = "STICKER_HALF_SHEET"
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r0)
            java.lang.String r0 = "ig_cg_click_to_enter_checkout_flow"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r5)
            java.lang.String r0 = "sticker_id"
            r6.A9F(r0, r1)
            java.lang.String r0 = "source_name"
            r6.AAJ(r0, r2)
            goto L_0x0976
        L_0x09d7:
            com.instagram.common.session.UserSession r0 = r3.A04
            java.lang.String r5 = r3.A0E
            r5.getClass()
            java.lang.String r2 = "PROFILE_HALF_SHEET"
            goto L_0x094f
        L_0x09e2:
            X.4Hw r0 = r3.A05     // Catch:{ NullPointerException -> 0x09ed }
            r0.getClass()     // Catch:{ NullPointerException -> 0x09ed }
            java.lang.String r0 = r3.A0D     // Catch:{ NullPointerException -> 0x09ed }
            r0.getClass()     // Catch:{ NullPointerException -> 0x09ed }
            goto L_0x09f6
        L_0x09ed:
            r2 = move-exception
            com.instagram.common.session.UserSession r1 = r3.A04
            java.lang.String r0 = r3.A0E
            X.LTM.A00(r3, r1, r2, r0)
            throw r2
        L_0x09f6:
            java.lang.String r0 = r3.A0D
            r7 = 0
            android.net.Uri r0 = X.0cp.A03(r0)
            android.net.Uri$Builder r5 = r0.buildUpon()
            X.VzN r6 = r3.A08
            r6.getClass()
            int r1 = r6.A00
            r0 = -1
            if (r1 != r0) goto L_0x0aa5
            android.widget.EditText r0 = r6.A03
            r0.getClass()
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            java.lang.Long r0 = X.C18237Vo4.A00(r0)
        L_0x0a18:
            long r0 = r0.longValue()
            java.lang.String r1 = java.lang.Long.toString(r0)
            java.lang.String r0 = "amount"
            android.net.Uri$Builder r5 = r5.appendQueryParameter(r0, r1)
            X.4Hw r0 = r3.A05
            java.lang.String r1 = r0.CCj()
            java.lang.String r0 = "currency"
            android.net.Uri$Builder r0 = r5.appendQueryParameter(r0, r1)
            android.net.Uri r6 = r0.build()
            X.Uw2 r0 = r3.A07
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x0a91
            r0 = 0
            if (r1 == r0) goto L_0x0a94
            r0 = 3
            if (r1 == r0) goto L_0x0a91
        L_0x0a45:
            android.content.Context r0 = r3.A00
            android.net.Uri r0 = X.SQU.A00(r0, r6)
            java.lang.String r6 = r0.toString()
            r12 = 1
            r10 = 0
            com.instagram.simplewebview.SimpleWebViewConfig r5 = new com.instagram.simplewebview.SimpleWebViewConfig
            r8 = r7
            r9 = r7
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r12
            r19 = r10
            r20 = r10
            r21 = r10
            r5.<init>((java.lang.String) r6, (java.lang.String) r7, (java.lang.String) r8, (java.lang.String) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16, (boolean) r17, (boolean) r18, (boolean) r19, (boolean) r20, (boolean) r21)
            r0 = 12
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.putParcelable(r0, r5)
            com.instagram.common.session.UserSession r1 = r3.A04
            java.lang.Class<com.instagram.modal.ModalActivity> r9 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            r0 = 709(0x2c5, float:9.94E-43)
            java.lang.String r10 = X.C273654mx.A00(r0)
            X.6W8 r0 = new X.6W8
            r5 = r0
            r7 = r2
            r8 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            r0.A0D(r3, r12)
        L_0x0a8a:
            r0 = 478326113(0x1c82ad61, float:8.647496E-22)
        L_0x0a8d:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0a91:
            java.lang.String r5 = "PROFILE_HALF_SHEET"
            goto L_0x0a96
        L_0x0a94:
            java.lang.String r5 = "STICKER_HALF_SHEET"
        L_0x0a96:
            android.net.Uri$Builder r1 = r6.buildUpon()
            java.lang.String r0 = "source_name"
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r0, r5)
            android.net.Uri r6 = r0.build()
            goto L_0x0a45
        L_0x0aa5:
            long r0 = (long) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x0a18
        L_0x0aac:
            java.lang.Object r0 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment.A05(r5, r0)
            return
        L_0x0ab4:
            java.lang.Object r2 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r2 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            com.instagram.model.reels.Reel r0 = r2.A07
            r0.getClass()
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = "edit_highlights_reel_id"
            r5.putString(r0, r1)
            java.lang.String r1 = "archive_multi_select_mode"
            r0 = 1
            r5.putBoolean(r1, r0)
            X.Ki3 r1 = X.Ki3.STORY_VIEWER_DEFAULT
            java.lang.String r0 = "highlight_management_source"
            r5.putSerializable(r0, r1)
            com.instagram.common.session.UserSession r6 = r2.A06
            java.lang.Class<com.instagram.modal.ModalActivity> r7 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            java.lang.String r8 = "manage_highlights"
            X.6W8 r3 = new X.6W8
            r3.<init>(r4, r5, r6, r7, r8)
            android.content.Context r0 = r2.requireContext()
            r3.A0C(r0)
            return
        L_0x0aef:
            r0 = -1885349589(0xffffffff8f9fd92b, float:-1.576226E-29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.VcU r0 = (X.C17699VcU) r0
            X.X4N r0 = r0.A01
            if (r0 == 0) goto L_0x0b01
            r0.DIp()
        L_0x0b01:
            r0 = -566872484(0xffffffffde36365c, float:-3.28244573E18)
        L_0x0b04:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0b08:
            java.lang.Object r1 = r1.A01
            X.Uc0 r1 = (X.C15397Uc0) r1
            X.UdE r0 = r1.A04
            r0.A0C()
            X.2dZ r0 = r1.A00
            r0.A0T()
            return
        L_0x0b17:
            java.lang.Object r0 = r1.A01
            X.Uc0 r0 = (X.C15397Uc0) r0
            X.C15397Uc0.A01(r0)
            return
        L_0x0b1f:
            r0 = -874873334(0xffffffffcbda7e0a, float:-2.8638228E7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = -1637246975(0xffffffff9e699801, float:-1.2366351E-20)
            goto L_0x0b4a
        L_0x0b2a:
            r0 = 1890010535(0x70a745a7, float:4.141456E29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = -422642426(0xffffffffe6cefd06, float:-4.8873748E23)
            goto L_0x0b4a
        L_0x0b35:
            r0 = -2034358094(0xffffffff86be28b2, float:-7.1529853E-35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = 215493329(0xcd82ad1, float:3.3305839E-31)
            goto L_0x0b4a
        L_0x0b40:
            r0 = -612546651(0xffffffffdb7d47a5, float:-7.1291943E16)
            int r5 = X.AnonymousClass0fD.A05(r0)
            r0 = -1151528233(0xffffffffbb5d12d7, float:-0.0033733153)
        L_0x0b4a:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WBC.onClick(android.view.View):void");
    }
}
