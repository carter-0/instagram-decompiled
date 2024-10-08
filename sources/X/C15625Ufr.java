package X;

import android.content.Context;
import com.instagram.discovery.mediamap.intf.MediaMapQuery;
import com.instagram.model.shopping.ProductSource;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Set;

/* renamed from: X.Ufr  reason: case insensitive filesystem */
public final class C15625Ufr extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public static void A00(C268654dm r3, C15625Ufr ufr) {
        0qQ.A0B(r3, 0);
        String A032 = C319126q5.A03(r3, ((Context) ufr.A01).getString(2131972232));
        0qQ.A07(A032);
        ((0sP) ufr.A02).invoke(A032);
    }

    public C15625Ufr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public static void A01(C15625Ufr ufr) {
        ((0sP) ufr.A02).invoke("Publish GraphQL call succeeded, but had response with success=false");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x033c, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x033f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x034a, code lost:
        X.AnonymousClass0fD.A0A(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x034d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r20) {
        /*
            r19 = this;
            r6 = r19
            int r0 = r6.A00
            r2 = r20
            switch(r0) {
                case 1: goto L_0x031e;
                case 2: goto L_0x02f7;
                case 3: goto L_0x02a0;
                case 4: goto L_0x0291;
                case 5: goto L_0x0282;
                case 6: goto L_0x0273;
                case 7: goto L_0x0264;
                case 8: goto L_0x0255;
                case 9: goto L_0x0246;
                case 10: goto L_0x0230;
                case 11: goto L_0x0009;
                case 12: goto L_0x0219;
                case 13: goto L_0x0009;
                case 14: goto L_0x0009;
                case 15: goto L_0x0208;
                case 16: goto L_0x01ef;
                case 17: goto L_0x01d6;
                case 18: goto L_0x0198;
                case 19: goto L_0x011f;
                case 20: goto L_0x0029;
                case 21: goto L_0x0340;
                case 22: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.C15625Ufr.super.onFail(r2)
            return
        L_0x000d:
            r0 = -2008561920(0xffffffff8847c700, float:-6.0118308E-34)
            int r8 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r6.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r2 = r0.getContext()
            r1 = 2131972131(0x7f135023, float:1.958126E38)
            java.lang.String r0 = "remove_videos_from_highlight_failed"
            X.C59689JTv.A0F(r2, r0, r1)
            r0 = 1370781558(0x51b47776, float:9.6887292E10)
            goto L_0x034a
        L_0x0029:
            r0 = 1735242758(0x676db406, float:1.1225217E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r2, r1)
            java.lang.Object r3 = r6.A01
            X.VPP r3 = (X.VPP) r3
            java.lang.Object r5 = r6.A02
            X.UKt r5 = (X.C15040UKt) r5
            X.0qQ.A0B(r5, r1)
            X.VYi r4 = r3.A00
            java.util.HashSet r3 = r4.A03
            r3.remove(r5)
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r14 = r4.A00
            X.Vuf r3 = r14.A0O
            X.W2j r4 = new X.W2j
            r4.<init>(r3)
            X.Vuf r3 = r14.A0O
            X.Vsx r3 = r3.A02
            boolean r13 = r3.A06
            X.Uxz r7 = r3.A00
            X.Uxz r11 = r3.A04
            X.Uxz r12 = r3.A05
            X.Uxz r8 = r3.A01
            X.Uxz r9 = r3.A02
            X.Uxz r10 = X.C16605Uxz.FAILED
            X.Vsx r6 = new X.Vsx
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r4.A02 = r6
            X.Vuf r3 = new X.Vuf
            r3.<init>(r4)
            r14.Elq(r3)
            boolean r3 = r5.A0A
            if (r3 == 0) goto L_0x00af
            X.W03 r8 = r14.A06
            com.instagram.user.model.Product r5 = r14.A0T
            r3 = 0
            if (r5 == 0) goto L_0x011c
            com.instagram.common.session.UserSession r4 = r8.A03
            X.ULx r7 = X.C294165ly.A03(r4, r5)
        L_0x0081:
            X.0wc r5 = r8.A02
            java.lang.String r4 = "instagram_ads_app_load_failure"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r4)
            boolean r4 = r6.isSampled()
            if (r4 == 0) goto L_0x00af
            X.UKi r4 = r8.A01
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0099
            java.lang.String r4 = r4.A05
            if (r4 != 0) goto L_0x009a
        L_0x0099:
            r4 = r5
        L_0x009a:
            java.lang.String r4 = X.W03.A00(r6, r8, r4)
            X.C51965G9l.A1L(r6, r4)
            if (r7 == 0) goto L_0x00a5
            X.4Ny r3 = r7.A01
        L_0x00a5:
            java.lang.Long r3 = X.C13992Tns.A0E(r3, r6, r7)
            X.W03.A01(r6, r8, r3)
            r6.Cgf()
        L_0x00af:
            androidx.fragment.app.FragmentActivity r12 = r14.requireActivity()
            com.instagram.common.session.UserSession r13 = r14.A01
            com.instagram.shopping.intf.ProductDetailsPageArguments r3 = r14.A0M
            java.lang.String r5 = r3.A0Q
            com.instagram.user.model.Product r15 = r14.A0T
            java.lang.String r4 = r14.A0V
            java.lang.String r3 = r14.A0X
            X.VbY r11 = new X.VbY
            r17 = r4
            r18 = r3
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r2 = r2.A00()
            if (r2 == 0) goto L_0x0117
            X.1XQ r2 = (X.1XQ) r2
            int r2 = r2.mStatusCode
            boolean r2 = X.C370788x4.A00(r2)
            if (r2 == 0) goto L_0x0117
            androidx.fragment.app.FragmentActivity r3 = r11.A00
            X.8ab r4 = new X.8ab
            r4.<init>((android.app.Activity) r3)
            r2 = 2131969879(0x7f134757, float:1.9576693E38)
            r4.A09(r2)
            r2 = 2131969878(0x7f134756, float:1.9576691E38)
            r4.A08(r2)
            r4.A0r(r1)
            r4.A0s(r1)
            r2 = 45
            X.W5U r1 = new X.W5U
            r1.<init>(r11, r2)
            r4.A0E(r1)
            com.instagram.user.model.Product r1 = r11.A03
            if (r1 == 0) goto L_0x0114
            r2 = 2131973740(0x7f13566c, float:1.9584524E38)
            java.lang.String r1 = r11.A04
            java.lang.String r3 = X.DbW.A0h(r3, r1, r2)
            r2 = 46
            X.W5U r1 = new X.W5U
            r1.<init>(r11, r2)
            r4.A0a(r1, r3)
        L_0x0114:
            X.DbT.A1V(r4)
        L_0x0117:
            r1 = -242209244(0xfffffffff1902e24, float:-1.4278919E30)
            goto L_0x033c
        L_0x011c:
            r7 = r3
            goto L_0x0081
        L_0x011f:
            r0 = 1455555902(0x56c2053e, float:1.06663885E14)
            int r8 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r2, r5)
            X.C15625Ufr.super.onFail(r2)
            java.lang.Object r4 = r6.A03
            X.Ubt r4 = (X.C15390Ubt) r4
            X.UdS r3 = r4.A02
            r1 = 0
            if (r3 != 0) goto L_0x0140
            java.lang.String r0 = "adapter"
        L_0x0138:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0140:
            X.V3W r0 = r3.A03
            r0.A00 = r1
            X.C15477UdS.A00(r3)
            android.content.Context r3 = r4.getContext()
            java.lang.String r1 = "select_catalog_failed"
            r0 = 2131969835(0x7f13472b, float:1.9576604E38)
            X.C59689JTv.A01(r3, r1, r0, r5)
            X.W35 r7 = r4.A03
            if (r7 != 0) goto L_0x015a
            java.lang.String r0 = "logger"
            goto L_0x0138
        L_0x015a:
            java.lang.Object r0 = r6.A01
            X.VWp r0 = (X.C17462VWp) r0
            java.lang.String r5 = r0.A01
            java.lang.String r4 = r0.A02
            java.lang.Object r1 = r6.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Throwable r3 = r2.A01()
            java.lang.String r0 = "catalog_selection_failure"
            X.0xI r2 = X.W35.A00(r7, r0)
            java.lang.String r0 = "catalog_id"
            r2.A0C(r0, r5)
            java.lang.String r0 = "products_source_name"
            r2.A0C(r0, r4)
            java.lang.String r1 = X.VHW.A00(r1)
            java.lang.String r0 = "products_source_type"
            r2.A0C(r0, r1)
            if (r3 == 0) goto L_0x0190
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "error_message"
            if (r1 == 0) goto L_0x0190
            r2.A0C(r0, r1)
        L_0x0190:
            X.W35.A05(r2, r7)
            r0 = -747269912(0xffffffffd37590e8, float:-1.05469811E12)
            goto L_0x034a
        L_0x0198:
            r0 = -736446600(0xffffffffd41ab778, float:-2.65801223E12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.C15625Ufr.super.onFail(r2)
            java.lang.Object r4 = r6.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r4 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r4
            X.VjM r3 = r4.A05
            if (r3 == 0) goto L_0x01b2
            X.1Xj r2 = r4.A01
            if (r2 == 0) goto L_0x01b2
            r1 = 0
            r3.A01(r2, r1)
        L_0x01b2:
            java.lang.Object r3 = r6.A03
            X.UxB r3 = (X.C16559UxB) r3
            X.UAP r2 = r4.A03
            r1 = 0
            r2.A04(r3, r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            X.37E r1 = X.AnonymousClass37D.A00
            X.DbX.A10(r2, r1)
            android.content.Context r3 = r4.requireContext()
            r2 = 2131976708(0x7f136204, float:1.9590544E38)
            java.lang.String r1 = "visualSearch_empty_response"
            X.C59689JTv.A0F(r3, r1, r2)
            r1 = 1136941283(0x43c458e3, float:392.69443)
            goto L_0x033c
        L_0x01d6:
            r0 = 1845145824(0x6dfab0e0, float:9.698135E27)
            int r0 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r3 = r6.A03
            X.Vjc r3 = (X.C18000Vjc) r3
            X.Uw5 r1 = X.C16508Uw5.FAILED
            r3.A00 = r1
            java.lang.Object r1 = r6.A01
            X.C51965G9l.A1W(r1, r2)
            r1 = 745107439(0x2c696fef, float:3.3173427E-12)
            goto L_0x033c
        L_0x01ef:
            r0 = -1813464063(0xffffffff93e8bc01, float:-5.875042E-27)
            int r0 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r3 = r6.A03
            X.Vjc r3 = (X.C18000Vjc) r3
            X.Uw5 r1 = X.C16508Uw5.FAILED
            r3.A00 = r1
            java.lang.Object r1 = r6.A01
            X.C51965G9l.A1W(r1, r2)
            r1 = 269858388(0x1015b654, float:2.952553E-29)
            goto L_0x033c
        L_0x0208:
            r0 = -2113426715(0xffffffff8207aae5, float:-9.967278E-38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r6.A01
            X.DbS.A1U(r1)
            r1 = 114900942(0x6d93fce, float:8.172008E-35)
            goto L_0x033c
        L_0x0219:
            r0 = -2042636409(0xffffffff863fd787, float:-3.6081452E-35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r6.A01
            X.VwC r2 = (X.C18657VwC) r2
            java.lang.Object r1 = r6.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r1
            X.C18657VwC.A00(r2, r1)
            r1 = 636947344(0x25f70b90, float:4.2855505E-16)
            goto L_0x033c
        L_0x0230:
            r0 = -271276892(0xffffffffefd4a4a4, float:-1.3161972E29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r6.A02
            X.X7i r3 = (X.X7i) r3
            r2 = 0
            java.lang.String r1 = "failed to update budget and duration"
            r3.DEI(r2, r1)
            r1 = 2030672610(0x79099ae2, float:4.465538E34)
            goto L_0x033c
        L_0x0246:
            r0 = -1666352871(0xffffffff9cad7919, float:-1.1479483E-21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = 468712488(0x1beffc28, float:3.9702185E-22)
            goto L_0x033c
        L_0x0255:
            r0 = -1568011024(0xffffffffa28a0cf0, float:-3.7418673E-18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = 2142591970(0x7fb55be2, float:NaN)
            goto L_0x033c
        L_0x0264:
            r0 = -867676398(0xffffffffcc484f12, float:-5.2509768E7)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = 807018223(0x301a1eef, float:5.6068833E-10)
            goto L_0x033c
        L_0x0273:
            r0 = 1898973692(0x713009fc, float:8.717029E29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = -63008730(0xfffffffffc3e9026, float:-3.9578403E36)
            goto L_0x033c
        L_0x0282:
            r0 = -484899298(0xffffffffe319061e, float:-2.8227926E21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = 1453680294(0x56a566a6, float:9.0930145E13)
            goto L_0x033c
        L_0x0291:
            r0 = 2128551298(0x7edf1d82, float:1.4828553E38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            A00(r2, r6)
            r1 = 1412101165(0x542af42d, float:2.93696412E12)
            goto L_0x033c
        L_0x02a0:
            r0 = -1705649824(0xffffffff9a55d960, float:-4.4222962E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.Throwable r4 = r2.A01()
            if (r4 == 0) goto L_0x02f3
            java.lang.Object r3 = r6.A03
            X.Vh6 r3 = (X.C17853Vh6) r3
            java.lang.Object r2 = r6.A02
            X.N49 r2 = (X.N49) r2
            X.0eM r1 = r3.A03
            java.lang.Object r6 = r1.getValue()
            X.Vrg r6 = (X.C18437Vrg) r6
            java.lang.String r11 = r4.getMessage()
            X.0qQ.A0B(r2, r5)
            java.lang.String r9 = r2.A00
            java.lang.String r10 = r2.A01
            java.lang.String r7 = "client_fetch_cached_info_failure"
            java.lang.String r8 = "client_fetch_cached_info"
            X.C18437Vrg.A00(r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r1.getValue()
            X.Vrg r4 = (X.C18437Vrg) r4
            java.lang.String r7 = r2.A00
            java.lang.String r8 = r2.A01
            java.lang.String r5 = "client_clear_local_cache"
            java.lang.String r6 = "client_local_cache"
            r9 = 0
            X.C18437Vrg.A00(r4, r5, r6, r7, r8, r9)
            X.VMH r4 = r3.A00
            X.0xa r3 = r4.A00
            r2 = 41
            X.Iwb r1 = new X.Iwb
            r1.<init>(r4, r2)
            X.0xW.A09(r3, r1)
        L_0x02f3:
            r1 = -1582313666(0xffffffffa1afcf3e, float:-1.1913318E-18)
            goto L_0x033c
        L_0x02f7:
            r0 = 845151070(0x325ffb5e, float:1.3037463E-8)
            int r0 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Throwable r5 = r2.A01()
            if (r5 == 0) goto L_0x031a
            java.lang.Object r1 = r6.A03
            X.Tr1 r1 = (X.C14163Tr1) r1
            java.lang.Object r4 = r6.A01
            X.9FE r4 = (X.AnonymousClass9FE) r4
            X.9F5 r3 = r1.A00
            X.9F1 r2 = X.AnonymousClass9F1.A00
            java.lang.String r1 = r5.getMessage()
            r3.A01(r2, r1)
            r4.onError(r5)
        L_0x031a:
            r1 = -602468353(0xffffffffdc170fff, float:-1.70081237E17)
            goto L_0x033c
        L_0x031e:
            r0 = -1433876963(0xffffffffaa88c61d, float:-2.4295922E-13)
            int r0 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r3 = r6.A02
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r1 = r6.A03
            X.Vsg r1 = (X.C18485Vsg) r1
            java.lang.String r1 = r1.A03
            r3.remove(r1)
            java.lang.Object r1 = r6.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onFail(r2)
            r1 = -878602826(0xffffffffcba195b6, float:-2.1179244E7)
        L_0x033c:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0340:
            r0 = 1065800253(0x3f86d23d, float:1.053291)
            int r8 = X.AnonymousClass0fD.A03(r0)
            r0 = 1573047496(0x5dc2ccc8, float:1.75460176E18)
        L_0x034a:
            X.AnonymousClass0fD.A0A(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15625Ufr.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 10:
                i = AnonymousClass0fD.A03(-147498758);
                i2 = 1162091320;
                break;
            case 22:
                i = AnonymousClass0fD.A03(927110328);
                ((F3H) this.A02).A00();
                i2 = -2044335552;
                break;
            default:
                C15625Ufr.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 10:
                i = AnonymousClass0fD.A03(-714329527);
                C15625Ufr.super.onStart();
                ((X7i) this.A02).onStart();
                i2 = 75398315;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = AnonymousClass0fD.A03(1613856840);
                C18657VwC vwC = (C18657VwC) this.A01;
                Set set = vwC.A05;
                MediaMapQuery mediaMapQuery = (MediaMapQuery) this.A03;
                set.add(mediaMapQuery);
                for (C20975X7o DmZ : vwC.A06) {
                    DmZ.DmZ(vwC, mediaMapQuery);
                }
                i2 = -1193694778;
                break;
            case 16:
                i = AnonymousClass0fD.A03(-1501175350);
                C15625Ufr.super.onStart();
                ((C18000Vjc) this.A03).A00 = C16508Uw5.LOADING;
                i2 = -1402704223;
                break;
            case 17:
                i = AnonymousClass0fD.A03(-1380591316);
                C15625Ufr.super.onStart();
                ((C18000Vjc) this.A03).A00 = C16508Uw5.LOADING;
                i2 = -1465000171;
                break;
            case 19:
                i = AnonymousClass0fD.A03(1462052437);
                C15625Ufr.super.onStart();
                W35 w35 = ((C15390Ubt) this.A03).A03;
                if (w35 != null) {
                    C17462VWp vWp = (C17462VWp) this.A01;
                    String str = vWp.A01;
                    String str2 = vWp.A02;
                    Integer num = (Integer) this.A02;
                    0Aj A0e = AnonymousClass7TE.A0e((0wc) w35.A07.getValue(), "instagram_shopping_catalog_selection_start");
                    if (str == null) {
                        str = "";
                    }
                    A0e.AAJ("catalog_id", str);
                    String str3 = w35.A05;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C13988Tno.A1C(A0e, str3);
                    if (str2 == null) {
                        str2 = "";
                    }
                    A0e.AAJ("products_source_name", str2);
                    A0e.AAJ("products_source_type", VHW.A00(num));
                    W35.A03(A0e, w35);
                    W35.A02(A0e, w35);
                    ProductSource productSource = w35.A00;
                    String str4 = null;
                    if (productSource != null) {
                        str4 = productSource.A01;
                    }
                    A0e.AAJ("selected_source_type", W35.A01(A0e, w35, str4));
                    A0e.AAJ("waterfall_id", w35.A06);
                    A0e.Cgf();
                    i2 = -1076679512;
                    break;
                } else {
                    DbS.A12();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 20:
                i = AnonymousClass0fD.A03(-1726298965);
                i2 = -42261936;
                break;
            case 22:
                i = AnonymousClass0fD.A03(1389852342);
                ((F3H) this.A02).A01();
                i2 = -486682638;
                break;
            default:
                C15625Ufr.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r2v55, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v74, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x006e, code lost:
        if (r1 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x07da, code lost:
        if (r1 != r7) goto L_0x07dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0971, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0974, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0250, code lost:
        X.0qQ.A0F(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0257, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x07b8  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x07d6  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x07ed  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0845  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0847  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x08ed;
                case 1: goto L_0x08c0;
                case 2: goto L_0x084e;
                case 3: goto L_0x06ea;
                case 4: goto L_0x06ad;
                case 5: goto L_0x0670;
                case 6: goto L_0x0633;
                case 7: goto L_0x05f6;
                case 8: goto L_0x05b9;
                case 9: goto L_0x057c;
                case 10: goto L_0x0525;
                case 11: goto L_0x04da;
                case 12: goto L_0x03e2;
                case 13: goto L_0x038e;
                case 14: goto L_0x0340;
                case 15: goto L_0x01c3;
                case 16: goto L_0x019d;
                case 17: goto L_0x0177;
                case 18: goto L_0x022b;
                case 19: goto L_0x00ac;
                case 20: goto L_0x0038;
                case 21: goto L_0x02f5;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 644353947(0x26680f9b, float:8.051232E-16)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.K14 r2 = (X.K14) r2
            r0 = -132801453(0xfffffffff8159c53, float:-1.2137857E34)
            int r6 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r1.A01
            instagram.features.stories.dashboard.fragment.ReelDashboardFragment r0 = (instagram.features.stories.dashboard.fragment.ReelDashboardFragment) r0
            com.instagram.common.session.UserSession r5 = r0.A06
            com.instagram.model.reels.Reel r3 = r0.A07
            r3.getClass()
            java.lang.Object r0 = r1.A03
            java.util.List r0 = (java.util.List) r0
            X.C64022LJj.A01(r2, r5, r3, r0)
            r0 = -1154450531(0xffffffffbb307b9d, float:-0.0026929148)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1064611948(0x3f74b06c, float:0.955817)
        L_0x0034:
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0038:
            r0 = 831260340(0x318c06b4, float:4.0752983E-9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CGR r2 = (X.CGR) r2
            r0 = -1358255612(0xffffffffaf0aaa04, float:-1.2611429E-10)
            int r7 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r2, r3)
            java.lang.Object r0 = r1.A01
            X.VPP r0 = (X.VPP) r0
            java.lang.Object r8 = r1.A02
            X.UKt r8 = (X.C15040UKt) r8
            X.0qQ.A0B(r8, r3)
            X.VYi r9 = r0.A00
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            if (r0 == 0) goto L_0x09bb
            com.instagram.user.model.Product r5 = X.C14502TxO.A00(r0)
            boolean r3 = r5.A04()
            java.util.List r0 = r5.A0O
            if (r0 == 0) goto L_0x0070
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0071
        L_0x0070:
            r0 = 1
        L_0x0071:
            r1 = r0 ^ 1
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r5.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r0 = r0.A0F
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r3 == 0) goto L_0x007f
            if (r1 == 0) goto L_0x0098
        L_0x007f:
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = r8.A03
            if (r0 != 0) goto L_0x0098
            X.WQh r1 = r9.A01
            android.util.LruCache r0 = r1.A01
            r0.put(r8, r2)
            java.util.HashMap r3 = r1.A03
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r1.A00
            long r5 = r5 + r0
            X.Pxe.A1X(r8, r3, r5)
        L_0x0098:
            java.util.HashSet r0 = r9.A03
            r0.remove(r8)
            com.instagram.shopping.fragment.pdp.AdsProductPageFragment r0 = r9.A00
            r0.A02(r2, r8)
            r0 = -1448658287(0xffffffffa9a73a91, float:-7.4264495E-14)
            X.AnonymousClass0fD.A0A(r0, r7)
            r0 = -855587098(0xffffffffcd00c6e6, float:-1.35032416E8)
            goto L_0x0034
        L_0x00ac:
            r0 = 1633539914(0x615dd74a, float:2.5576523E20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = -169406695(0xfffffffff5e70f19, float:-5.858041E32)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r11 = 0
            X.0qQ.A0B(r2, r11)
            X.C15625Ufr.super.onSuccess(r2)
            java.lang.Object r2 = r1.A03
            X.Ubt r2 = (X.C15390Ubt) r2
            X.UdS r9 = r2.A02
            java.lang.String r7 = "adapter"
            r6 = 0
            if (r9 == 0) goto L_0x0250
            java.lang.Object r8 = r1.A01
            X.VWp r8 = (X.C17462VWp) r8
            java.lang.String r5 = r8.A01
            X.V3W r0 = r9.A03
            r0.A01 = r5
            X.C15477UdS.A00(r9)
            X.UdS r5 = r2.A02
            if (r5 == 0) goto L_0x0250
            X.V3W r0 = r5.A03
            r0.A00 = r6
            X.C15477UdS.A00(r5)
            X.0eM r7 = r2.A0K
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r9 = r8.A01
            X.0qQ.A0B(r10, r11)
            X.W3U r0 = X.W3U.A00
            X.Uyv r11 = X.C16659Uyv.CATALOG
            X.0xa r0 = X.W3U.A02(r10, r0)
            X.0xY r6 = r0.AR4()
            java.lang.String r5 = r11.toString()
            java.lang.String r0 = "last_selected_product_source_type"
            r6.E5g(r0, r5)
            r6.apply()
            X.0eE r6 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r10)
            if (r9 == 0) goto L_0x0114
            X.4Cl r0 = r0.A03
            r0.ETT(r9)
        L_0x0114:
            X.W35 r9 = r2.A03
            if (r9 != 0) goto L_0x011c
            java.lang.String r7 = "logger"
            goto L_0x0250
        L_0x011c:
            java.lang.String r10 = r8.A01
            java.lang.String r8 = r8.A02
            java.lang.Object r1 = r1.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.instagram.model.shopping.ProductSource r0 = new com.instagram.model.shopping.ProductSource
            r0.<init>(r11, r10)
            r9.A00 = r0
            java.lang.String r0 = "catalog_selection_success"
            X.0xI r5 = X.W35.A00(r9, r0)
            java.lang.String r0 = "catalog_id"
            r5.A0C(r0, r10)
            java.lang.String r0 = "products_source_name"
            r5.A0C(r0, r8)
            java.lang.String r1 = X.VHW.A00(r1)
            java.lang.String r0 = "products_source_type"
            r5.A0C(r0, r1)
            X.W35.A05(r5, r9)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            boolean r0 = X.VH4.A00(r0)
            if (r0 != 0) goto L_0x015c
            com.instagram.user.model.User r0 = X.DbX.A0l(r6, r7)
            com.instagram.api.schemas.ShoppingOnboardingState r1 = com.instagram.api.schemas.ShoppingOnboardingState.ONBOARDED
            X.4Cl r0 = r0.A03
            r0.EkP(r1)
        L_0x015c:
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            X.2dZ r1 = r1.A03(r0)
            r0 = 1
            r1.ARJ(r0)
            r2.A09 = r0
            r0 = -1007720542(0xffffffffc3ef67a2, float:-478.80963)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -908026717(0xffffffffc9e09ca3, float:-1840020.4)
            goto L_0x0034
        L_0x0177:
            r0 = -1869216526(0xffffffff909604f2, float:-5.917219E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 65419583(0x3e6393f, float:1.3531328E-36)
            int r5 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r3 = r1.A03
            X.Vjc r3 = (X.C18000Vjc) r3
            X.Uw5 r0 = X.C16508Uw5.LOADED
            r3.A00 = r0
            java.lang.Object r0 = r1.A02
            X.C51965G9l.A1W(r0, r2)
            r0 = -323000272(0xffffffffecbf6830, float:-1.8511747E27)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1565539931(0x5d503e5b, float:9.3784569E17)
            goto L_0x0034
        L_0x019d:
            r0 = -243398535(0xfffffffff17e0879, float:-1.257911E30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 1459279472(0x56fad670, float:1.37899454E14)
            int r5 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r3 = r1.A03
            X.Vjc r3 = (X.C18000Vjc) r3
            X.Uw5 r0 = X.C16508Uw5.LOADED
            r3.A00 = r0
            java.lang.Object r0 = r1.A02
            X.C51965G9l.A1W(r0, r2)
            r0 = -823855941(0xffffffffcee4f4bb, float:-1.92062195E9)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1636378841(0xffffffff9e76d727, float:-1.3067624E-20)
            goto L_0x0034
        L_0x01c3:
            r0 = 618342678(0x24db2916, float:9.504571E-17)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CFy r2 = (X.C43858CFy) r2
            r0 = -2055301652(0xffffffff857e95ec, float:-1.1970559E-35)
            int r6 = X.AnonymousClass7TG.A0D(r2, r0)
            java.lang.Object r5 = r1.A02
            X.0sL r5 = (X.0sL) r5
            X.1Xj r3 = r2.A00
            if (r3 == 0) goto L_0x0228
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x0225
            r5.invoke(r3, r0)
            long r7 = X.C19226WQh.A04
            java.lang.Object r5 = r1.A03
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            X.WQh r0 = X.C17088VHk.A00(r5)
            r0.A00()
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x0225
            java.util.Iterator r3 = r0.iterator()
        L_0x01f7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x021a
            java.lang.Object r0 = r3.next()
            X.N8v r0 = (X.C68282N8v) r0
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r5)
            java.lang.Long r0 = r0.A02
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.WPy r0 = new X.WPy
            r0.<init>()
            r2.A00(r0)
            goto L_0x01f7
        L_0x021a:
            r0 = 1140278929(0x43f74691, float:494.5513)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1185872018(0x46aef892, float:22396.285)
            goto L_0x0034
        L_0x0225:
            java.lang.String r7 = "permissions"
            goto L_0x0250
        L_0x0228:
            java.lang.String r7 = "media"
            goto L_0x0250
        L_0x022b:
            r0 = -452124221(0xffffffffe50d21c3, float:-4.165478E22)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.CE1 r2 = (X.CE1) r2
            r0 = -1422777233(0xffffffffab32246f, float:-6.3288865E-13)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.C15625Ufr.super.onSuccess(r2)
            java.lang.Object r6 = r1.A01
            com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment r6 = (com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment) r6
            java.lang.Object r7 = r1.A03
            X.UxB r7 = (X.C16559UxB) r7
            java.lang.Object r8 = r1.A02
            X.1Xj r8 = (X.1Xj) r8
            X.DRR r0 = r2.A01
            if (r0 != 0) goto L_0x0258
            java.lang.String r7 = "response"
        L_0x0250:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0258:
            X.BGJ r0 = (X.BGJ) r0
            java.util.List r0 = r0.A00
            r10 = 0
            r5 = 1
            if (r0 == 0) goto L_0x02c6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r12 = r0.iterator()
            r1 = r10
        L_0x026a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x02c0
            java.lang.Object r0 = r12.next()
            X.DR7 r0 = (X.DR7) r0
            X.BEb r0 = (X.C42026BEb) r0
            X.DRN r0 = r0.A00
            if (r0 == 0) goto L_0x026a
            X.BFy r0 = (X.C42070BFy) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x026a
            java.util.Iterator r11 = r0.iterator()
        L_0x0286:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r0 = r11.next()
            X.DRM r0 = (X.DRM) r0
            X.BFx r0 = (X.C42069BFx) r0
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r0.A00
            if (r2 == 0) goto L_0x0286
            X.1hu r0 = new X.1hu
            r0.<init>(r10)
            X.1E9 r0 = X.C41846B3n.A0S(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r5 = r2.FGq(r0)
            com.instagram.user.model.Product r2 = new com.instagram.user.model.Product
            r2.<init>(r10, r5)
            com.instagram.model.shopping.productfeed.ProductFeedItem r0 = new com.instagram.model.shopping.productfeed.ProductFeedItem
            r0.<init>(r2)
            r9.add(r0)
            if (r1 != 0) goto L_0x02b9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x02b9:
            java.lang.String r0 = r5.A0h
            r1.add(r0)
            r5 = 0
            goto L_0x0286
        L_0x02c0:
            X.UAP r0 = r6.A03
            r0.A03(r7, r9)
            r10 = r1
        L_0x02c6:
            X.VjM r0 = r6.A05
            if (r0 == 0) goto L_0x02cd
            r0.A01(r8, r10)
        L_0x02cd:
            if (r5 == 0) goto L_0x02ea
            X.UAP r1 = r6.A03
            r0 = 0
            r1.A04(r7, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r1, r0)
            android.content.Context r2 = r6.requireContext()
            r1 = 2131976708(0x7f136204, float:1.9590544E38)
            java.lang.String r0 = "visualSearch_empty_response"
            X.C59689JTv.A0F(r2, r0, r1)
        L_0x02ea:
            r0 = -1421867273(0xffffffffab4006f7, float:-6.822177E-13)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1682350040(0xffffffff9bb96028, float:-3.0667822E-22)
            goto L_0x0034
        L_0x02f5:
            r0 = -674230405(0xffffffffd7d00f7b, float:-4.57529813E14)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r2 = -1727811527(0xffffffff9903b039, float:-6.808129E-24)
            int r6 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r1.A02
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r7 = r2.A00
            if (r7 == 0) goto L_0x031c
            java.lang.Object r2 = r1.A03
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.1Av r5 = X.1Au.A00(r2)
            X.0s0 r4 = r5.A6Y
            X.0YZ[] r3 = X.1Av.A8a
            r2 = 344(0x158, float:4.82E-43)
            X.DbS.A1a(r5, r7, r4, r3, r2)
        L_0x031c:
            java.lang.Object r2 = r1.A01
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r5 = r2.A00
            if (r5 == 0) goto L_0x0335
            java.lang.Object r1 = r1.A03
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1Av r4 = X.1Au.A00(r1)
            X.0s0 r3 = r4.A87
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 345(0x159, float:4.83E-43)
            X.DbS.A1a(r4, r5, r3, r2, r1)
        L_0x0335:
            r1 = -1852360411(0xffffffff91973925, float:-2.3858817E-28)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -565388717(0xffffffffde4cda53, float:-3.6903005E18)
            goto L_0x0971
        L_0x0340:
            r0 = -1709614038(0xffffffff9a195c2a, float:-3.1714108E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXr r2 = (X.C15257UXr) r2
            r3 = -2103070618(0xffffffff82a5b066, float:-2.4345819E-37)
            int r8 = X.AnonymousClass0fD.A03(r3)
            r7 = 0
            X.0qQ.A0B(r2, r7)
            X.C15625Ufr.super.onSuccess(r2)
            java.lang.Object r3 = r1.A03
            X.SUL r3 = (X.SUL) r3
            android.app.Activity r6 = r3.A1H
            if (r6 == 0) goto L_0x0383
            com.instagram.common.session.UserSession r5 = r3.A1K
            java.lang.Object r3 = r1.A01
            java.util.HashMap r3 = (java.util.HashMap) r3
            X.3IJ r1 = r2.A02
            if (r1 == 0) goto L_0x0383
            X.UbP r4 = X.C15371UbP.A00(r5, r2, r3, r7)
            X.7Pr r3 = new X.7Pr
            r3.<init>(r5)
            java.lang.String r1 = r2.A03
            r3.A0d = r1
            r3.A1C = r7
            r3.A0T = r4
            X.7Pu r1 = r3.A00()
            r4.A04 = r1
            r1.A03(r6, r4)
        L_0x0383:
            r1 = -1035857413(0xffffffffc24211fb, float:-48.51756)
            X.AnonymousClass0fD.A0A(r1, r8)
            r1 = 198633407(0xbd6e7bf, float:8.2778494E-32)
            goto L_0x0971
        L_0x038e:
            r0 = 248315219(0xeccfd53, float:5.0533825E-30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXH r2 = (X.UXH) r2
            r3 = -1997363289(0xffffffff88f2a7a7, float:-1.460426E-33)
            int r6 = X.AnonymousClass0fD.A03(r3)
            java.util.List r4 = r2.A00
            if (r4 != 0) goto L_0x03a6
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x03a6:
            int r3 = r4.size()
            r2 = 1
            if (r3 == r2) goto L_0x03b8
            r1 = 1848435806(0x6e2ce45e, float:1.3376875E28)
        L_0x03b0:
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1020741167(0xffffffffc328b9d1, float:-168.72585)
            goto L_0x0971
        L_0x03b8:
            r5 = 0
            java.lang.Object r2 = r4.get(r5)
            X.V39 r2 = (X.V39) r2
            com.instagram.discovery.mediamap.model.LocationPageInformation r4 = r2.A00
            if (r4 != 0) goto L_0x03c7
            r1 = -784861767(0xffffffffd137f5b9, float:-4.9381347E10)
            goto L_0x03b0
        L_0x03c7:
            java.lang.Object r2 = r1.A03
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = (com.instagram.discovery.mediamap.model.MediaMapPin) r2
            com.instagram.discovery.mediamap.model.MediaMapPin r3 = r2.clone()
            r3.A0F = r5
            r3.A06 = r4
            java.lang.Object r2 = r1.A02
            X.Vko r2 = (X.C18062Vko) r2
            java.lang.Object r1 = r1.A01
            X.Vhn r1 = (X.C17896Vhn) r1
            r2.A02(r1, r3)
            r1 = 994646052(0x3b491824, float:0.0030684555)
            goto L_0x03b0
        L_0x03e2:
            r0 = 730126207(0x2b84d77f, float:9.438976E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.NHS r2 = (X.NHS) r2
            r3 = 2076394444(0x7bc343cc, float:2.027746E36)
            int r4 = X.AnonymousClass0fD.A03(r3)
            java.util.List r12 = r2.A04
            java.lang.Object r9 = r1.A03
            com.instagram.discovery.mediamap.intf.MediaMapQuery r9 = (com.instagram.discovery.mediamap.intf.MediaMapQuery) r9
            java.lang.String r3 = r2.A02
            r9.A02 = r3
            r5 = 1
            r9.A05 = r5
            java.lang.String r8 = r2.A01
            if (r8 == 0) goto L_0x0432
            java.lang.String r3 = r8.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0432
            java.lang.String r3 = r9.A00()
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0432
            r9.A00 = r8
            java.util.List r3 = r9.A03
            java.util.Iterator r7 = r3.iterator()
        L_0x041f:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0432
            java.lang.Object r3 = r7.next()
            com.instagram.discovery.mediamap.fragment.LocationListFragment r3 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r3
            X.Vks r6 = r3.mActionBarHelper
            r3 = 0
            r6.A00(r3, r3, r8)
            goto L_0x041f
        L_0x0432:
            java.util.Iterator r7 = r12.iterator()
        L_0x0436:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0447
            java.lang.Object r6 = r7.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r6 = (com.instagram.discovery.mediamap.model.MediaMapPin) r6
            boolean r3 = r2.A06
            r6.A0F = r3
            goto L_0x0436
        L_0x0447:
            java.lang.Object r8 = r1.A01
            X.VwC r8 = (X.C18657VwC) r8
            java.util.List r13 = r2.A05
            java.lang.Object r10 = r1.A02
            X.VZc r10 = (X.C17523VZc) r10
            java.lang.Integer r11 = r2.A00
            r8.A05(r9, r10, r11, r12, r13)
            X.W3Q r3 = r8.A04
            java.util.List r1 = r2.A04
            r3.A0A(r9, r10, r1)
            r8.A04(r9)
            X.C18657VwC.A00(r8, r9)
            boolean r1 = r2.A07
            if (r1 == 0) goto L_0x04a7
            X.Vhn r7 = r8.A02
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x04a7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r12.iterator()
        L_0x0478:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x048c
            java.lang.Object r1 = r2.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
            java.lang.String r1 = X.C18231Vnv.A01(r1)
            r8.add(r1)
            goto L_0x0478
        L_0x048c:
            com.instagram.common.session.UserSession r1 = r7.A02
            java.lang.String r6 = X.VBY.A00(r8)
            if (r6 != 0) goto L_0x04b2
            X.0wb r3 = X.0wb.A01
            java.lang.String r2 = "location ids: "
            java.lang.String r1 = ","
            java.lang.String r1 = X.0mp.A05(r1, r8)
            java.lang.String r2 = X.002.A0R(r2, r1)
            java.lang.String r1 = "fetchStoriesForLocationIdsFailed"
            r3.Ew0(r1, r2)
        L_0x04a7:
            r1 = -784180868(0xffffffffd142597c, float:-5.217031E10)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -720108262(0xffffffffd514051a, float:-1.0171852E13)
            goto L_0x0971
        L_0x04b2:
            X.1NY r3 = X.DbU.A0N(r1)
            java.lang.String r1 = "map/location_stories/"
            r3.A0A(r1)
            java.lang.Class<X.UXG> r2 = X.UXG.class
            java.lang.Class<X.VnE> r1 = X.C18196VnE.class
            r3.A0R(r2, r1)
            java.lang.String r1 = "location_ids"
            r3.A9m(r1, r6)
            r3.A0R = r5
            X.1OC r3 = r3.A0M()
            r1 = 28
            X.C15621Ufn.A00(r3, r7, r1)
            android.content.Context r2 = r7.A00
            X.07i r1 = r7.A01
            X.1ES.A00(r2, r1, r3)
            goto L_0x04a7
        L_0x04da:
            r0 = 1571541062(0x5dabd046, float:1.54755904E18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.7ax r2 = (X.C334247ax) r2
            r3 = 1667612261(0x6365be65, float:4.2380238E21)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r7 = r1.A02
            com.instagram.user.model.User r7 = (com.instagram.user.model.User) r7
            java.util.List r2 = r2.getItems()
            r7.A0w(r2)
            X.GSl r3 = X.C52433GSl.A00
            java.lang.Object r5 = r1.A03
            X.IU7 r5 = (X.IU7) r5
            com.instagram.common.session.UserSession r2 = r5.A00
            java.util.ArrayList r4 = r3.A01(r2, r7)
            X.IOg r2 = X.C55171HdN.A00(r2)
            java.lang.String r3 = r7.getId()
            java.util.Map r2 = r2.A00
            r2.put(r3, r4)
            java.lang.Object r2 = r1.A01
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r1 = 1
            r2.A2v = r1
            X.GUc r1 = r5.A01
            X.C52476GUc.A00(r1)
            r1 = 2027472589(0x78d8c6cd, float:3.5174009E34)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1558096727(0xffffffffa32154a9, float:-8.745755E-18)
            goto L_0x0971
        L_0x0525:
            r0 = 702642552(0x29e17978, float:1.0013079E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.UXC r2 = (X.UXC) r2
            r3 = -1242632993(0xffffffffb5eeecdf, float:-1.780132E-6)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            X.UKM r4 = r2.A00
            if (r4 == 0) goto L_0x054f
            java.lang.Object r3 = r1.A02
            X.X7i r3 = (X.X7i) r3
            java.lang.String r2 = r4.A02
            java.lang.String r1 = r4.A03
            r3.DEI(r2, r1)
        L_0x0544:
            r1 = -90092154(0xfffffffffaa14d86, float:-4.1876608E35)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1226399660(0xffffffffb6e6a054, float:-6.873199E-6)
            goto L_0x0971
        L_0x054f:
            java.lang.Object r2 = r1.A03
            X.0lg r2 = (X.0lg) r2
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r2)
            X.WQ1 r2 = new X.WQ1
            r2.<init>()
            r3.A00(r2)
            java.lang.Object r2 = r1.A01
            android.content.Context r2 = (android.content.Context) r2
            X.C13991Tnr.A0r(r2)
            X.07t r4 = X.AnonymousClass07t.A00(r2)
            java.lang.String r3 = "IGBoostPostRefreshPromotionInsights"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3)
            r4.A02(r2)
            java.lang.Object r1 = r1.A02
            X.X7i r1 = (X.X7i) r1
            r1.onSuccess()
            goto L_0x0544
        L_0x057c:
            r0 = -599902675(0xffffffffdc3e362d, float:-2.1415925E17)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1103554965(0xffffffffbe39166b, float:-0.18074958)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x05b5
            java.lang.Class<X.UJN> r3 = X.UJN.class
            java.lang.String r2 = "xfb_unpublished_content_reschedule"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x05b5
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x05b5
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x05aa:
            r1 = 2083253221(0x7c2bebe5, float:3.570669E36)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -377586808(0xffffffffe97e7b88, float:-1.9228157E25)
            goto L_0x0971
        L_0x05b5:
            A01(r1)
            goto L_0x05aa
        L_0x05b9:
            r0 = 1751276330(0x68625b2a, float:4.275746E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = 560489027(0x21686243, float:7.8734706E-19)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x05f2
            java.lang.Class<X.UJO> r3 = X.UJO.class
            java.lang.String r2 = "xfb_unpublished_content_reschedule"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x05f2
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x05f2
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x05e7:
            r1 = -992801179(0xffffffffc4d30e65, float:-1688.4498)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 463368583(0x1b9e7187, float:2.6212273E-22)
            goto L_0x0971
        L_0x05f2:
            A01(r1)
            goto L_0x05e7
        L_0x05f6:
            r0 = -90743513(0xfffffffffa975d27, float:-3.929631E35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1055863013(0xffffffffc110cf1b, float:-9.050563)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x062f
            java.lang.Class<X.UJL> r3 = X.UJL.class
            java.lang.String r2 = "xfb_unpublished_content_publish"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x062f
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x062f
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x0624:
            r1 = -1920722892(0xffffffff8d841834, float:-8.140955E-31)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 594351452(0x236d155c, float:1.2852319E-17)
            goto L_0x0971
        L_0x062f:
            A01(r1)
            goto L_0x0624
        L_0x0633:
            r0 = -1807582644(0xffffffff94427a4c, float:-9.818616E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1384813888(0xffffffffad756ac0, float:-1.3950341E-11)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x066c
            java.lang.Class<X.UJM> r3 = X.UJM.class
            java.lang.String r2 = "xfb_unpublished_content_publish"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x066c
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x066c
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x0661:
            r1 = 108407410(0x6762a72, float:4.6298642E-35)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 797457508(0x2f883c64, float:2.4781166E-10)
            goto L_0x0971
        L_0x066c:
            A01(r1)
            goto L_0x0661
        L_0x0670:
            r0 = -1045485042(0xffffffffc1af2a0e, float:-21.895535)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1930310482(0xffffffff8cf1ccae, float:-3.7255116E-31)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x06a9
            java.lang.Class<X.UJJ> r3 = X.UJJ.class
            java.lang.String r2 = "xfb_unpublished_content_delete"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x06a9
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x06a9
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x069e:
            r1 = -2116799486(0xffffffff81d43402, float:-7.795113E-38)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1683642851(0xffffffff9ba5a61d, float:-2.7404308E-22)
            goto L_0x0971
        L_0x06a9:
            A01(r1)
            goto L_0x069e
        L_0x06ad:
            r0 = 728087032(0x2b65b9f8, float:8.1615227E-13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = 1186401524(0x46b70cf4, float:23430.477)
            int r6 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r5 = r2.A01
            X.3FZ r5 = (X.AnonymousClass3FZ) r5
            r4 = 1
            if (r5 == 0) goto L_0x06e6
            java.lang.Class<X.UJK> r3 = X.UJK.class
            java.lang.String r2 = "xfb_unpublished_content_delete"
            X.3FZ r3 = r5.A00(r3, r2)
            if (r3 == 0) goto L_0x06e6
            java.lang.String r2 = "success"
            boolean r2 = r3.A06(r2)
            if (r2 != r4) goto L_0x06e6
            java.lang.Object r1 = r1.A03
            X.DbS.A1U(r1)
        L_0x06db:
            r1 = -1451088491(0xffffffffa9822595, float:-5.779679E-14)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1568680525(0xffffffffa27fd5b3, float:-3.4672076E-18)
            goto L_0x0971
        L_0x06e6:
            A01(r1)
            goto L_0x06db
        L_0x06ea:
            r0 = -1415996306(0xffffffffab999c6e, float:-1.0914722E-12)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -428751607(0xffffffffe671c509, float:-2.8543124E23)
            int r13 = X.AnonymousClass0fD.A03(r3)
            r8 = 0
            X.0qQ.A0B(r2, r8)
            java.lang.Object r3 = r1.A03
            X.Vh6 r3 = (X.C17853Vh6) r3
            X.0eM r14 = r3.A03
            java.lang.Object r15 = r14.getValue()
            X.Vrg r15 = (X.C18437Vrg) r15
            java.lang.Object r11 = r1.A02
            X.N49 r11 = (X.N49) r11
            X.0qQ.A0B(r11, r8)
            java.lang.String r6 = r11.A00
            java.lang.String r5 = r11.A01
            java.lang.String r16 = "client_fetch_cached_info_success"
            java.lang.String r17 = "client_fetch_cached_info"
            r4 = 0
            r18 = r6
            r19 = r5
            r20 = r4
            X.C18437Vrg.A00(r15, r16, r17, r18, r19, r20)
            java.lang.Object r10 = r1.A01
            X.VRc r10 = (X.C17323VRc) r10
            r1 = 0
            java.lang.Object r12 = r2.Bny()
            X.3lr r12 = (X.C250663lr) r12
            if (r12 == 0) goto L_0x084a
            java.lang.Class<X.UPj> r9 = X.UPj.class
            java.lang.String r7 = "ig_professional_cache(cache_id:$cache_id,entrypoint:$entrypoint)"
            r6 = -349973035(0xffffffffeb23d5d5, float:-1.980647E26)
            X.3lr r5 = r12.getOptionalTreeField(r8, r7, r9, r6)
            if (r5 == 0) goto L_0x0778
            java.lang.String r2 = "id"
            java.lang.String r5 = r5.getOptionalStringField(r8, r2)
            if (r5 == 0) goto L_0x0778
            X.VMH r3 = r3.A00
            X.0xa r2 = r3.A00
            r15 = 133(0x85, float:1.86E-43)
            java.lang.String r15 = X.C66579MXk.A00(r15)
            java.lang.String r15 = r2.getString(r15, r4)
            boolean r15 = X.0qQ.A0K(r15, r5)
            if (r15 != 0) goto L_0x0778
            java.lang.Object r15 = r14.getValue()
            X.Vrg r15 = (X.C18437Vrg) r15
            java.lang.String r14 = r11.A00
            java.lang.String r11 = r11.A01
            java.lang.String r16 = "client_update_local_cache"
            java.lang.String r17 = "client_local_cache"
            r18 = r14
            r19 = r11
            X.C18437Vrg.A00(r15, r16, r17, r18, r19, r20)
            r14 = 24
            X.PmN r11 = new X.PmN
            r11.<init>(r5, r3, r14)
            X.0xW.A09(r2, r11)
        L_0x0778:
            X.3lr r7 = r12.getOptionalTreeField(r8, r7, r9, r6)
            if (r7 == 0) goto L_0x084a
            java.lang.Class<X.UPi> r5 = X.UPi.class
            r6 = 1
            java.lang.String r3 = "pro2pro_info"
            r2 = 798431994(0x2f971afa, float:2.7485908E-10)
            X.3lr r5 = r7.getOptionalTreeField(r6, r3, r5, r2)
            if (r5 == 0) goto L_0x084a
            X.Uyi r3 = X.C16646Uyi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "can_boost_with_business_person"
            java.lang.Enum r11 = r5.getOptionalEnumField(r8, r2, r3)
            X.Uys r3 = X.C16656Uys.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r2 = "ad_account_preference"
            java.lang.Enum r5 = r5.getOptionalEnumField(r6, r2, r3)
        L_0x079c:
            if (r12 == 0) goto L_0x0847
            java.lang.Class<X.UPj> r6 = X.UPj.class
            java.lang.String r3 = "ig_professional_cache(cache_id:$cache_id,entrypoint:$entrypoint)"
            r2 = -349973035(0xffffffffeb23d5d5, float:-1.980647E26)
            X.3lr r7 = r12.getOptionalTreeField(r8, r3, r6, r2)
            if (r7 == 0) goto L_0x0847
            java.lang.Class<X.UPh> r6 = X.UPh.class
            java.lang.String r3 = "boost_prevalidation_info"
            r2 = 1420790226(0x54af89d2, float:6.0314521E12)
            X.3lr r6 = r7.A04(r6, r3, r2)
            if (r6 == 0) goto L_0x0847
            X.Uyi r3 = X.C16646Uyi.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "asset_checks_pass"
            java.lang.Enum r9 = r6.getOptionalEnumField(r8, r1, r3)
            r2 = 1
            java.lang.String r1 = "integrity_checks_pass"
            java.lang.Enum r1 = r6.getOptionalEnumField(r2, r1, r3)
        L_0x07c7:
            com.instagram.business.promote.activity.PromoteActivity r3 = r10.A01
            X.Uyi r7 = X.C16646Uyi.YES
            r6 = 1
            if (r11 != r7) goto L_0x0845
            X.Uys r2 = X.C16656Uys.INSTAGRAM_BACKED_ADS
            if (r5 == r2) goto L_0x07d6
            X.Uys r2 = X.C16656Uys.HARD_LINKED_AD_ACCOUNT
            if (r5 != r2) goto L_0x0845
        L_0x07d6:
            r5 = 1
        L_0x07d7:
            if (r9 != r7) goto L_0x07dc
            r2 = 1
            if (r1 == r7) goto L_0x07dd
        L_0x07dc:
            r2 = 0
        L_0x07dd:
            if (r5 == 0) goto L_0x0843
            if (r2 == 0) goto L_0x0843
        L_0x07e1:
            X.0eM r1 = r3.A09
            java.lang.Object r5 = r1.getValue()
            X.Vrg r5 = (X.C18437Vrg) r5
            X.N49 r1 = r10.A00
            if (r6 == 0) goto L_0x082e
            X.0qQ.A0B(r1, r8)
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r1.A01
            java.lang.String r6 = "client_should_skip_boost_onboarding"
            java.lang.String r7 = "client_skip_boost_onboarding"
            r8 = r2
            r9 = r1
            r10 = r4
            X.C18437Vrg.A00(r5, r6, r7, r8, r9, r10)
            X.0eM r1 = r3.A08
            java.lang.Object r4 = r1.getValue()
            X.VsS r4 = (X.C18476VsS) r4
            X.02m r2 = X.C18476VsS.A00(r4)
            r5 = 409679146(0x186b352a, float:3.039988E-24)
            java.lang.String r1 = "pro_identity_cache_skip_bloks_onboarding_launch"
            r2.markerPoint(r5, r1)
            X.02m r4 = X.C18476VsS.A00(r4)
            r1 = 1404(0x57c, float:1.967E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 1
            r4.markerAnnotate(r5, r2, r1)
            r3.AUr()
        L_0x0823:
            r1 = 3296169(0x324ba9, float:4.618917E-39)
            X.AnonymousClass0fD.A0A(r1, r13)
            r1 = 27088427(0x19d562b, float:5.7796337E-38)
            goto L_0x0971
        L_0x082e:
            X.0qQ.A0B(r1, r8)
            java.lang.String r6 = "client_should_not_skip_boost_onboarding_on_cache_fetch_success"
            java.lang.String r2 = r1.A00
            java.lang.String r1 = r1.A01
            java.lang.String r7 = "client_skip_boost_onboarding"
            r8 = r2
            r9 = r1
            r10 = r4
            X.C18437Vrg.A00(r5, r6, r7, r8, r9, r10)
            com.instagram.business.promote.activity.PromoteActivity.A05(r3)
            goto L_0x0823
        L_0x0843:
            r6 = 0
            goto L_0x07e1
        L_0x0845:
            r5 = 0
            goto L_0x07d7
        L_0x0847:
            r9 = r4
            goto L_0x07c7
        L_0x084a:
            r11 = r4
            r5 = r4
            goto L_0x079c
        L_0x084e:
            r0 = 1810398676(0x6be87dd4, float:5.6213E26)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.3JC r2 = (X.AnonymousClass3JC) r2
            r3 = -1834856259(0xffffffff92a250bd, float:-1.0243541E-27)
            int r3 = X.AnonymousClass0fD.A03(r3)
            r10 = 0
            X.0qQ.A0B(r2, r10)
            java.lang.Object r9 = r1.A03
            X.Tr1 r9 = (X.C14163Tr1) r9
            java.lang.Object r8 = r1.A02
            X.9JK r8 = (X.AnonymousClass9JK) r8
            java.lang.Object r4 = r1.A01
            X.9FE r4 = (X.AnonymousClass9FE) r4
            r7 = 0
            java.lang.Object r6 = r2.Bny()
            X.3lr r6 = (X.C250663lr) r6
            if (r6 == 0) goto L_0x08aa
            java.lang.Class<X.TrK> r5 = X.C14180TrK.class
            java.lang.String r2 = "xfb_one_link_logged_out_whatsapp_info_monoschema(input:$input)"
            r1 = -930722671(0xffffffffc8864c91, float:-275044.53)
            X.3lr r2 = r6.getOptionalTreeField(r10, r2, r5, r1)
            if (r2 == 0) goto L_0x08aa
            java.lang.String r1 = "linked_whatsapp_phone_number"
            java.lang.String r2 = r2.getOptionalStringField(r10, r1)
            if (r2 == 0) goto L_0x0897
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0897
            X.9Gd r7 = new X.9Gd
            r7.<init>(r2)
        L_0x0897:
            X.TrJ r1 = new X.TrJ
            r1.<init>(r7)
            r4.onSuccess(r1)
        L_0x089f:
            r1 = 874719988(0x34232af4, float:1.5196184E-7)
            X.AnonymousClass0fD.A0A(r1, r3)
            r1 = 1631764759(0x6142c117, float:2.2453637E20)
            goto L_0x0971
        L_0x08aa:
            X.9F5 r2 = r9.A00
            X.9F1 r1 = X.AnonymousClass9F1.A00
            r2.A00(r8, r1)
            r1 = 2540(0x9ec, float:3.559E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.Throwable r1 = new java.lang.Throwable
            r1.<init>(r2)
            r4.onError(r1)
            goto L_0x089f
        L_0x08c0:
            r0 = -616775000(0xffffffffdb3cc2a8, float:-5.3131322E16)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r3 = -250640889(0xfffffffff10f8607, float:-7.106942E29)
            int r5 = X.AnonymousClass7TG.A0D(r2, r3)
            java.lang.Object r4 = r1.A02
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r3 = r1.A03
            X.Vsg r3 = (X.C18485Vsg) r3
            java.lang.String r3 = r3.A03
            r4.remove(r3)
            java.lang.Object r1 = r1.A01
            X.1P0 r1 = (X.1P0) r1
            r1.onSuccess(r2)
            r1 = -1437230521(0xffffffffaa559a47, float:-1.8971726E-13)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 499442328(0x1dc4e298, float:5.211506E-21)
            goto L_0x0971
        L_0x08ed:
            r0 = -645492255(0xffffffffd98691e1, float:-4.7347553E15)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.CEq r2 = (X.C43824CEq) r2
            r3 = 1003128250(0x3bca85ba, float:0.006180492)
            int r5 = X.AnonymousClass0fD.A03(r3)
            java.lang.Object r7 = r1.A01
            com.instagram.archive.fragment.ArchiveReelCalendarFragment r7 = (com.instagram.archive.fragment.ArchiveReelCalendarFragment) r7
            r8 = 1
            r7.A07 = r8
            java.lang.Object r3 = r1.A02
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            java.util.List r3 = r2.A06
            if (r3 == 0) goto L_0x0914
            r6.addAll(r3)
        L_0x0914:
            java.lang.String r3 = r2.A05
            if (r3 != 0) goto L_0x09a9
            r9 = 0
        L_0x0919:
            java.util.Map r1 = r7.A06
            boolean r10 = r1.isEmpty()
            com.instagram.common.session.UserSession r1 = r7.getSession()
            com.instagram.reels.store.ReelStore r4 = com.instagram.reels.store.ReelStore.A03(r1)
            com.instagram.common.session.UserSession r1 = r7.getSession()
            com.instagram.user.model.User r3 = X.DbT.A0j(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.util.LinkedHashMap r1 = X.LHI.A00(r4, r3, r1, r9, r6)
            r7.A06 = r1
            java.lang.Long r1 = r2.A03
            if (r1 == 0) goto L_0x09a6
            long r3 = r1.longValue()
            java.util.Date r1 = X.C13989Tnp.A0t(r3)
        L_0x0943:
            r7.A05 = r1
            java.lang.String r1 = r7.A04
            r4 = 8
            if (r1 != 0) goto L_0x0961
            android.view.View r1 = r7.mLoadingSpinner
            r1.setVisibility(r4)
            com.instagram.archive.fragment.ArchiveReelCalendarFragment.A03(r7)
            if (r10 == 0) goto L_0x0961
            com.instagram.common.ui.widget.calendar.CalendarRecyclerView r3 = r7.mCalendar
            X.UjZ r1 = r7.A00
            int r1 = r1.getItemCount()
            int r1 = r1 - r8
            r3.A0o(r1)
        L_0x0961:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0975
            com.instagram.archive.fragment.ArchiveReelCalendarFragment.A04(r7, r9, r1, r6)
        L_0x0968:
            r1 = 1717072086(0x665870d6, float:2.5552815E23)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1127641079(0xffffffffbcc99009, float:-0.024604814)
        L_0x0971:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0975:
            java.lang.String r1 = r7.A04
            if (r1 == 0) goto L_0x0968
            java.lang.Long r1 = r7.A02
            if (r1 == 0) goto L_0x0968
            android.view.View r1 = r7.mLoadingSpinner
            r1.setVisibility(r4)
            com.instagram.archive.fragment.ArchiveReelCalendarFragment.A03(r7)
            com.instagram.common.ui.widget.calendar.CalendarRecyclerView r6 = r7.mCalendar
            X.UjZ r4 = r7.A00
            java.lang.Long r1 = r7.A02
            long r2 = r1.longValue()
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            java.lang.String r2 = r4.A01(r1)
            java.util.Map r1 = r4.A03
            java.lang.Number r1 = X.C51966G9m.A14(r2, r1)
            int r1 = X.DbX.A02(r1)
            r6.A0o(r1)
            goto L_0x0968
        L_0x09a6:
            java.util.Date r1 = r7.A05
            goto L_0x0943
        L_0x09a9:
            java.lang.Long r3 = r2.A04
            if (r3 != 0) goto L_0x09b1
            java.lang.Object r3 = r1.A03
            java.lang.Number r3 = (java.lang.Number) r3
        L_0x09b1:
            int r1 = r3.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto L_0x0919
        L_0x09bb:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15625Ufr.onSuccess(java.lang.Object):void");
    }
}
