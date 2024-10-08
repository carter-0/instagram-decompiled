package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.payments.checkout.CheckoutLaunchParams;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.VuZ  reason: case insensitive filesystem */
public final class C18583VuZ {
    public Boolean A00;
    public final X9C A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final 1Xj A04;
    public final AnonymousClass4DU A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public C18583VuZ(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, X9C x9c, String str, String str2, String str3, String str4, String str5) {
        0qQ.A0B(str, 1);
        C51972G9s.A1E(str4, userSession);
        this.A06 = str;
        this.A07 = str2;
        this.A02 = fragmentActivity;
        this.A05 = r5;
        this.A09 = str3;
        this.A0A = str4;
        this.A03 = userSession;
        this.A01 = x9c;
        this.A04 = r4;
        this.A08 = str5;
    }

    public static final void A00(CheckoutLaunchParams checkoutLaunchParams, C18583VuZ vuZ, Product product) {
        SFL sfl = (SFL) SFL.A04.getValue();
        List A1I = AnonymousClass7TE.A1I(product);
        sfl.A03 = A1I;
        IgReactPurchaseExperienceBridgeModule igReactPurchaseExperienceBridgeModule = sfl.A01;
        if (igReactPurchaseExperienceBridgeModule != null) {
            igReactPurchaseExperienceBridgeModule.mProducts = A1I;
        }
        1Y5.A01(vuZ.A02, vuZ.A03, checkoutLaunchParams, "pdp");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r23 = this;
            r2 = r23
            X.X9C r4 = r2.A01
            X.Vuf r0 = r4.Bz5()
            com.instagram.user.model.Product r5 = r0.A09
            X.Vuf r0 = r4.Bz5()
            X.Vsx r0 = r0.A02
            boolean r1 = r0.A06
            r0 = 0
            if (r1 == 0) goto L_0x002d
            X.Vuf r1 = r4.Bz5()
            X.Vsx r1 = r1.A02
            X.Uxz r3 = r1.A04
            X.Uxz r1 = X.C16605Uxz.LOADED
            if (r3 == r1) goto L_0x002e
            X.Vuf r1 = r4.Bz5()
            X.Vsx r1 = r1.A02
            X.Uxz r3 = r1.A04
            X.Uxz r1 = X.C16605Uxz.SKIPPED
            if (r3 == r1) goto L_0x002e
        L_0x002d:
            return
        L_0x002e:
            if (r5 == 0) goto L_0x002d
            boolean r1 = r5.A04()
            if (r1 == 0) goto L_0x002d
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r5.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r1 = r1.A0C
            if (r1 == 0) goto L_0x002d
            boolean r1 = r5.A0P
            if (r1 == 0) goto L_0x002d
            X.Vuf r1 = r4.Bz5()
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x002d
            com.instagram.user.model.ProductDetailsProductItemDict r1 = r5.A01
            com.instagram.model.shopping.productlaunchinformation.ProductLaunchInformation r1 = r1.A0F
            if (r1 == 0) goto L_0x005b
            java.lang.Boolean r1 = r1.BBR()
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r0)
            if (r1 == 0) goto L_0x005b
            return
        L_0x005b:
            X.Vuf r1 = r4.Bz5()
            com.instagram.user.model.Product r7 = r1.A09
            if (r7 == 0) goto L_0x002d
            com.instagram.user.model.User r1 = r7.A0B
            if (r1 == 0) goto L_0x00da
            java.lang.String r8 = X.AnonymousClass3ZA.A00(r1)
        L_0x006b:
            X.0qQ.A0A(r8)
            java.lang.String r9 = r2.A06
            X.4DU r1 = r2.A05
            java.lang.String r10 = r1.getModuleName()
            java.lang.String r11 = r2.A09
            java.lang.String r12 = r2.A07
            X.1Xj r3 = r2.A04
            if (r3 == 0) goto L_0x00d4
            com.instagram.common.session.UserSession r1 = r2.A03
            com.instagram.user.model.User r1 = r3.A2A(r1)
            if (r1 == 0) goto L_0x00d4
            java.lang.String r13 = r1.getId()
        L_0x008a:
            java.lang.String r14 = r3.A30()
            com.instagram.common.session.UserSession r1 = r2.A03
            java.lang.String r15 = X.C231122qu.A0F(r1, r3)
        L_0x0094:
            r16 = 0
            java.lang.String r3 = r2.A0A
            X.Vuf r1 = r4.Bz5()
            java.util.Map r1 = r1.A0D
            java.util.Set r21 = r1.keySet()
            X.X9L r1 = r4.BTa()
            com.instagram.user.model.User r1 = r1.BRo()
            if (r1 == 0) goto L_0x00d1
            java.lang.String r19 = X.AnonymousClass3ZA.A00(r1)
        L_0x00b0:
            java.lang.String r1 = r2.A08
            java.lang.String r18 = "pdp"
            r17 = r3
            r20 = r1
            r22 = r0
            com.instagram.model.payments.checkout.CheckoutLaunchParams r6 = X.C18769W0q.A01(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r3 = r2.A00
            r1 = 1
            if (r3 == 0) goto L_0x00dc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002d
            A00(r6, r2, r7)
            return
        L_0x00d1:
            r19 = 0
            goto L_0x00b0
        L_0x00d4:
            r13 = 0
            if (r3 != 0) goto L_0x008a
            r14 = 0
            r15 = 0
            goto L_0x0094
        L_0x00da:
            r8 = 0
            goto L_0x006b
        L_0x00dc:
            com.instagram.common.session.UserSession r5 = r2.A03
            X.VWf r4 = new X.VWf
            r4.<init>(r6, r2, r7)
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r3 = new X.2IS
            r3.<init>()
            java.lang.String r1 = r7.A0H
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1)
            java.lang.String r1 = "product_ids"
            r6.A05(r1, r2)
            X.1vR r8 = X.C41845B3m.A05()
            java.util.Map r10 = r6.getParamsCopy()
            java.util.Map r11 = r3.getParamsCopy()
            java.lang.Class<X.URC> r12 = X.URC.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "ProductDetailsPageUserExperienceQuery"
            java.lang.String r17 = "checkout_pdp_prefetch"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r7 = r3
            r13 = r0
            r14 = r16
            r15 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.1vn r2 = X.1vm.A01(r5)
            r1 = 7
            X.Ufo r0 = new X.Ufo
            r0.<init>(r4, r1)
            r2.A06(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18583VuZ.A01():void");
    }
}
