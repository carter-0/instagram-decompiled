package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.text.SimpleDateFormat;
import java.util.Map;

/* renamed from: X.UiY  reason: case insensitive filesystem */
public final class C15789UiY extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C19560Wbk A02;
    public final Map A03;

    /* JADX WARNING: type inference failed for: r9v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0383  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r22, X.C249703kE r23) {
        /*
            r21 = this;
            r10 = r23
            r11 = r22
            X.WRz r11 = (X.C19266WRz) r11
            X.UES r10 = (X.UES) r10
            boolean r9 = X.AnonymousClass7TG.A1Z(r11, r10)
            r0 = r21
            X.Wbk r8 = r0.A02
            X.0iw r3 = r0.A00
            com.instagram.common.session.UserSession r1 = r0.A01
            java.util.Map r13 = r0.A03
            java.text.SimpleDateFormat r0 = X.W20.A01
            X.C51974G9v.A1M(r8, r3, r1)
            X.W0O r7 = r11.A00
            com.instagram.user.model.Product r2 = r7.A03()
            if (r2 == 0) goto L_0x0304
            com.instagram.model.mediasize.ImageInfo r0 = r2.A08
            if (r0 != 0) goto L_0x02f7
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A0F
            r0.A09()
        L_0x002c:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r10.A0F
            android.view.View r0 = r10.itemView
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131967982(0x7f133fee, float:1.9572846E38)
            r6 = 0
            java.lang.String r4 = r2.A0J
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r1, r4, r0)
            r3.setContentDescription(r0)
            r0 = 48
            X.WBD.A00(r3, r0, r2, r8)
            android.widget.TextView r1 = r10.A08
            X.Wnn r0 = new X.Wnn
            r0.<init>(r10, r2)
            r1.post(r0)
            r0 = 49
            X.WBD.A00(r1, r0, r2, r8)
            android.widget.TextView r1 = r10.A0A
            r1.setVisibility(r6)
            r0 = 52
            X.WBD.A00(r1, r0, r8, r7)
            android.widget.ImageView r5 = r10.A05
            android.view.View r0 = r10.itemView
            android.content.res.Resources r3 = r0.getResources()
            r1 = 2131972090(0x7f134ffa, float:1.9581178E38)
            com.instagram.user.model.Product r0 = r7.A03()
            if (r0 == 0) goto L_0x038f
            java.lang.String r0 = r0.A0J
            java.lang.String r0 = X.AnonymousClass7TF.A0e(r3, r0, r1)
            r5.setContentDescription(r0)
            r0 = 51
            X.WBD.A00(r5, r0, r8, r7)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r2.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r0 = r0.A0C
            if (r0 == 0) goto L_0x02be
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r0 = r0.A02
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02be
            boolean r0 = r2.A0P
            if (r0 != 0) goto L_0x014b
            android.view.View r0 = r10.A03
            r0.setVisibility(r6)
            X.W20.A02(r10, r7, r5)
            android.widget.TextView r1 = r10.A0D
            r1.setVisibility(r6)
            r0 = 2131973842(0x7f1356d2, float:1.9584731E38)
            r1.setText(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            android.widget.TextView r0 = r10.A0C
            java.lang.CharSequence r0 = r0.getText()
            r5.append(r0)
            X.W20.A01(r10, r8, r7, r6)
            X.W20.A00(r10, r8, r7)
            r1 = 8
        L_0x00c2:
            android.widget.ImageView r0 = r10.A06
            r0.setVisibility(r1)
            android.widget.TextView r0 = r10.A0B
            r0.setVisibility(r1)
            X.3oV r0 = r10.A0G
            r0.setVisibility(r1)
        L_0x00d1:
            android.view.View r1 = r10.itemView
            java.lang.String r0 = r5.toString()
            r1.setContentDescription(r0)
        L_0x00da:
            android.widget.ImageView r1 = r10.A05
            r0 = 46
            X.WBD.A00(r1, r0, r11, r8)
            android.view.View r1 = r10.itemView
            java.lang.Runnable r0 = r10.A0H
            r1.post(r0)
            android.view.View r1 = r10.A02
            r0 = 8
            r1.setVisibility(r0)
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x014a
            android.view.View r4 = r10.itemView
            X.0qQ.A06(r4)
            android.graphics.drawable.Drawable r3 = r4.getBackground()
            android.content.Context r1 = r4.getContext()
            r0 = 2130970333(0x7f0406dd, float:1.7549373E38)
            int r5 = X.AnonymousClass7TF.A03(r1, r0)
            int r0 = X.2Yu.A0C(r1)
            int r1 = r1.getColor(r0)
            android.animation.ArgbEvaluator r2 = new android.animation.ArgbEvaluator
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r0, r1)
            java.lang.String r0 = "backgroundColor"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r4, r0, r2, r1)
            r0 = 3500(0xdac, double:1.729E-320)
            r2.setDuration(r0)
            r1 = 3
            X.Kb3 r0 = new X.Kb3
            r0.<init>(r1, r3, r4)
            r2.addListener(r0)
            r2.start()
            java.lang.String r2 = r7.A04()
            X.0qQ.A07(r2)
            com.instagram.shopping.fragment.cart.MerchantShoppingCartFragment r0 = r8.A00
            X.VWj r0 = r0.A0D
            if (r0 == 0) goto L_0x014a
            java.util.Map r1 = r0.A00
            X.VTg r0 = new X.VTg
            r0.<init>(r9, r9)
            r1.put(r2, r0)
        L_0x014a:
            return
        L_0x014b:
            com.instagram.user.model.Product r12 = r7.A03()
            java.lang.String r1 = "Required value was null."
            if (r12 == 0) goto L_0x0389
            android.content.Context r20 = X.DbS.A07(r10)
            android.view.View r0 = r10.A03
            r4 = 8
            r0.setVisibility(r4)
            X.W20.A02(r10, r7, r5)
            android.widget.TextView r3 = r10.A0D
            r3.setVisibility(r6)
            r16 = 2
            if (r13 == 0) goto L_0x0278
            java.lang.String r0 = r7.A04()
            boolean r0 = r13.containsKey(r0)
            if (r0 == 0) goto L_0x0278
            java.lang.String r15 = r12.A0L
            android.content.Context r14 = r3.getContext()
            java.lang.String r0 = r7.A04()
            java.lang.String r2 = X.DbT.A11(r0, r13)
            X.0qQ.A0A(r20)
            int r0 = X.C324476zN.A00(r20)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.text.SpannableStringBuilder r0 = X.C324476zN.A03(r14, r0, r15, r2)
            java.lang.String r14 = r12.A0K
            if (r14 == 0) goto L_0x01a9
            int r2 = r14.length()
            if (r2 == 0) goto L_0x01a9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = " ("
            r2.append(r0)
            java.lang.String r0 = X.C51975G9x.A0i(r14, r2)
        L_0x01a9:
            r3.setText(r0)
            android.content.res.Resources r14 = r20.getResources()
            r2 = 2131969813(0x7f134715, float:1.957656E38)
            r0 = r16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r6] = r15
            java.lang.String r15 = r7.A04()
            java.lang.Object r13 = r13.get(r15)
        L_0x01c1:
            r0[r9] = r13
            java.lang.String r0 = r14.getString(r2, r0)
            r3.setContentDescription(r0)
        L_0x01ca:
            java.lang.String r0 = " "
            r5.append(r0)
            com.instagram.user.model.ProductDetailsProductItemDict r2 = r12.A01
            java.lang.String r0 = r2.A0V
            if (r0 != 0) goto L_0x01d7
            java.lang.String r0 = r2.A0T
        L_0x01d7:
            r5.append(r0)
            X.W20.A01(r10, r8, r7, r9)
            X.W20.A00(r10, r8, r7)
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r12.A01
            com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties r3 = r0.A0C
            if (r3 == 0) goto L_0x0383
            android.widget.ImageView r13 = r10.A06
            r13.setVisibility(r4)
            android.widget.TextView r2 = r10.A0B
            r2.setVisibility(r4)
            boolean r0 = r12.A0P
            if (r0 == 0) goto L_0x0246
            com.instagram.model.shopping.productcheckoutproperties.ShippingAndReturnsMetadata r0 = r3.A01
            if (r0 == 0) goto L_0x037d
            com.instagram.model.payments.DeliveryWindowInfo r15 = r0.B2B()
            if (r15 == 0) goto L_0x0246
            android.content.res.Resources r19 = X.DbU.A05(r2)
            r18 = 2131954813(0x7f130c7d, float:1.9546136E38)
            long r0 = r15.BTN()
            int r12 = (int) r0
            long r0 = (long) r12
            java.text.SimpleDateFormat r12 = X.W20.A01
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r16
            java.util.Date r14 = new java.util.Date
            r14.<init>(r0)
            java.lang.String r14 = r12.format(r14)
            X.0qQ.A07(r14)
            long r0 = r15.BPW()
            int r15 = (int) r0
            long r0 = (long) r15
            long r0 = r0 * r16
            java.util.Date r15 = new java.util.Date
            r15.<init>(r0)
            java.lang.String r0 = r12.format(r15)
            X.0qQ.A07(r0)
            java.lang.Object[] r12 = new java.lang.Object[]{r14, r0}
            r1 = r19
            r0 = r18
            java.lang.String r0 = r1.getString(r0, r12)
            r2.setText(r0)
            r13.setVisibility(r6)
            r2.setVisibility(r6)
        L_0x0246:
            X.3oV r2 = r10.A0G
            r2.setVisibility(r4)
            java.lang.Integer r4 = r3.A0B
            java.lang.Boolean r3 = r3.A04
            if (r4 == 0) goto L_0x00d1
            int r1 = r4.intValue()
            r0 = 10
            if (r1 >= r0) goto L_0x00d1
            if (r3 == 0) goto L_0x00d1
            boolean r0 = r3.booleanValue()
            if (r0 == 0) goto L_0x00d1
            r1 = 2131964912(0x7f1333f0, float:1.956662E38)
            r0 = r20
            java.lang.String r1 = X.DbY.A0c(r0, r4, r1)
            android.view.View r0 = r2.getView()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r1)
            r2.setVisibility(r6)
            goto L_0x00d1
        L_0x0278:
            r13 = 0
            X.0qQ.A0A(r20)
            int r0 = X.C324476zN.A00(r20)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = r20
            java.lang.CharSequence r14 = X.C324476zN.A08(r0, r12, r13, r2)
            java.lang.String r13 = r12.A0K
            if (r13 == 0) goto L_0x02a2
            int r0 = r13.length()
            if (r0 == 0) goto L_0x02a2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r14)
            java.lang.String r0 = " ("
            r2.append(r0)
            java.lang.String r14 = X.C51975G9x.A0i(r13, r2)
        L_0x02a2:
            r3.setText(r14)
            boolean r0 = r12.A05()
            if (r0 == 0) goto L_0x01ca
            android.content.res.Resources r14 = X.DbU.A05(r3)
            r2 = 2131969813(0x7f134715, float:1.957656E38)
            r0 = r16
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r13 = r12.A0L
            r0[r6] = r13
            java.lang.String r13 = r12.A0G
            goto L_0x01c1
        L_0x02be:
            android.view.View r0 = r10.A03
            r0.setVisibility(r6)
            android.widget.TextView r0 = r10.A0D
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r3 = r10.A0C
            r3.setVisibility(r6)
            android.content.Context r2 = X.DbS.A07(r10)
            r0 = 2131973758(0x7f13567e, float:1.958456E38)
            X.DbT.A18(r2, r3, r0)
            java.lang.String r0 = " "
            r5.append(r0)
            java.lang.CharSequence r0 = r3.getText()
            r5.append(r0)
            X.W20.A01(r10, r8, r7, r6)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r1)
            android.view.View r0 = r10.A01
            r0.setVisibility(r1)
            r0.setVisibility(r1)
            goto L_0x00c2
        L_0x02f7:
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A03(r0)
            if (r1 == 0) goto L_0x002c
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r10.A0F
            r0.setUrl(r1, r3)
            goto L_0x002c
        L_0x0304:
            X.VjN r0 = r7.A02
            com.instagram.user.model.UnavailableProductImpl r0 = r0.A02
            if (r0 == 0) goto L_0x00da
            android.widget.TextView r5 = r10.A08
            android.content.Context r4 = r5.getContext()
            X.0qQ.A0A(r4)
            r1 = 2131238601(0x7f081ec9, float:1.8093485E38)
            r0 = 2131100272(0x7f060270, float:1.781292E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4Ed.A01(r4, r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r10.A0F
            r2.setImageDrawable(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER
            r2.setScaleType(r0)
            r1 = 0
            r2.setOnClickListener(r1)
            android.view.View r0 = r10.A03
            r3 = 8
            r0.setVisibility(r3)
            r0 = 2131973757(0x7f13567d, float:1.9584559E38)
            r5.setText(r0)
            r5.setOnClickListener(r1)
            android.widget.TextView r0 = r10.A0D
            r0.setVisibility(r3)
            android.widget.TextView r1 = r10.A0C
            r0 = 0
            r1.setVisibility(r0)
            r0 = 2131973758(0x7f13567e, float:1.958456E38)
            X.DbT.A18(r4, r1, r0)
            android.view.ViewGroup r0 = r10.A04
            r0.setVisibility(r3)
            android.widget.TextView r0 = r10.A07
            r0.setVisibility(r3)
            android.view.View r0 = r10.A01
            r0.setVisibility(r3)
            android.widget.TextView r0 = r10.A0A
            r0.setVisibility(r3)
            android.widget.ImageView r2 = r10.A05
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131972124(0x7f13501c, float:1.9581247E38)
            X.DbT.A1A(r1, r2, r0)
            android.widget.ImageView r0 = r10.A06
            r0.setVisibility(r3)
            android.widget.TextView r0 = r10.A0B
            r0.setVisibility(r3)
            X.3oV r0 = r10.A0G
            r0.setVisibility(r3)
            goto L_0x00da
        L_0x037d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0383:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0389:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x038f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15789UiY.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C19266WRz.class;
    }

    public C15789UiY(AnonymousClass0iw r1, UserSession userSession, C19560Wbk wbk, Map map) {
        this.A02 = wbk;
        this.A00 = r1;
        this.A03 = map;
        this.A01 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        SimpleDateFormat simpleDateFormat = W20.A01;
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.shopping_cart_item, false);
        Object A0U = C13988Tno.A0U(A09, new UES(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.merchant.ShoppingCartItemViewBinder.Holder");
        return (C249703kE) A0U;
    }
}
