package X;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* renamed from: X.6YT  reason: invalid class name */
public abstract class AnonymousClass6YT {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        if (r1.ordinal() != 2) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.view.View.OnClickListener r21, X.C255773uh r22, X.C74500Pvu r23, X.C316146lB r24) {
        /*
            r11 = 0
            r12 = r24
            X.0qQ.A0B(r12, r11)
            r10 = 1
            if (r23 == 0) goto L_0x025c
            r12.A00 = r10
            android.view.View r9 = r12.A04
            android.content.Context r8 = r9.getContext()
            r7 = 0
            r9.setVisibility(r11)
            android.widget.TextView r6 = r12.A08
            X.0qQ.A0A(r8)
            com.instagram.common.session.UserSession r0 = r12.A09
            r20 = r0
            r5 = 0
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r11)
            r13 = r22
            r18 = r5
            r19 = r5
            r16 = r13
            r15 = r0
            r14 = r8
            java.lang.CharSequence r0 = X.AnonymousClass4EQ.A06(r14, r15, r16, r17, r18, r19)
            r6.setText(r0)
            r4 = -2
            X.0nA.A0V(r6, r4)
            X.1Xj r3 = r13.A0b
            r2 = 0
            if (r3 == 0) goto L_0x0256
            X.1Xy r0 = r3.A0C
            java.util.List r0 = r0.BMp()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r1 = X.00k.A0J(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0256
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0256
            r2 = r0
            X.3oV r15 = r12.A0B
            X.3oV r14 = r12.A0C
            android.view.View r1 = r15.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r0.get(r11)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r15.setVisibility(r11)
            r14.setVisibility(r11)
            android.view.View r1 = r12.A05
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
        L_0x0072:
            android.content.res.Resources r14 = r8.getResources()
            X.0qQ.A07(r14)
            int r0 = r14.getDimensionPixelSize(r0)
            int r15 = r1.getPaddingTop()
            int r14 = r1.getPaddingBottom()
            r1.setPadding(r0, r15, r0, r14)
            X.6Yf r1 = r23.Bkh()
            if (r1 == 0) goto L_0x009e
            boolean r0 = r1.A0j
            if (r0 == 0) goto L_0x0095
            r23.Eu9()
        L_0x0095:
            java.lang.Integer r0 = r1.A0V
            if (r0 == 0) goto L_0x009b
            r7 = 8
        L_0x009b:
            r9.setVisibility(r7)
        L_0x009e:
            if (r3 == 0) goto L_0x018a
            X.1Xy r0 = r3.A0C
            java.util.List r0 = r0.C0M()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.feed.media.ReelCTAIntf r0 = (com.instagram.feed.media.ReelCTAIntf) r0
            if (r0 == 0) goto L_0x018a
            com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon r1 = r0.AtJ()
            if (r1 == 0) goto L_0x018a
            com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon r0 = com.instagram.api.schemas.ShoppingSwipeUpCTATextIcon.UNRECOGNIZED
            if (r1 == r0) goto L_0x018a
            int r1 = r1.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0202
        L_0x00c1:
            android.widget.TextView r1 = r12.A07
            r15 = r20
            r14 = r8
            java.lang.CharSequence r0 = X.AnonymousClass4EQ.A06(r14, r15, r16, r17, r18, r19)
            r1.setText(r0)
            X.0nA.A0V(r1, r4)
            if (r2 == 0) goto L_0x0184
            X.3oV r4 = r12.A0E
            X.3oV r3 = r12.A0D
            android.view.View r1 = r4.getView()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.Object r0 = r2.get(r11)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r4.setVisibility(r11)
            r3.setVisibility(r11)
            android.view.View r3 = r12.A06
            r1 = 2131165259(0x7f07004b, float:1.794473E38)
        L_0x00f0:
            android.content.res.Resources r0 = r8.getResources()
            X.0qQ.A07(r0)
            int r2 = r0.getDimensionPixelSize(r1)
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r1, r2, r0)
            X.3aa r0 = X.C244063aa.CTA
            X.C244083ac.A05(r6, r0)
            r2 = r21
            if (r21 == 0) goto L_0x0143
            android.view.View r0 = r12.A01
            X.AnonymousClass0fU.A00(r2, r0)
            boolean r0 = r13.A1S()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r13.A1R()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r13.A1V()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r13.A1E()
            if (r0 != 0) goto L_0x0179
            boolean r0 = r13.A0R
            if (r0 != 0) goto L_0x0179
            X.3mL r1 = r13.A0e
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT
            if (r1 == r0) goto L_0x0179
            android.view.View r0 = r12.A03
            r0.setVisibility(r11)
            X.AnonymousClass0fU.A00(r2, r0)
        L_0x013e:
            android.view.View r0 = r12.A02
            X.AnonymousClass0fU.A00(r2, r0)
        L_0x0143:
            X.3mL r1 = r13.A0e
            X.3mL r0 = X.C250963mL.EMPTY_STORIES_STATE_CONTACT_IMPORT
            if (r1 != r0) goto L_0x0178
            r0 = 2131099953(0x7f060131, float:1.7812274E38)
            android.content.res.ColorStateList r0 = X.02K.A02(r8, r0)
            r6.setTextColor(r0)
            X.3oV r2 = r12.A0A
            android.view.View r1 = r2.getView()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r8.getColor(r0)
            r1.setColorFilter(r0)
            android.view.View r1 = r12.A01
            r0 = 2131240015(0x7f08244f, float:1.8096353E38)
            android.graphics.drawable.Drawable r0 = r8.getDrawable(r0)
            r1.setBackground(r0)
            android.view.View r0 = r2.getView()
            r0.setVisibility(r11)
        L_0x0178:
            return
        L_0x0179:
            android.view.View r1 = r12.A03
            r0 = 8
            r1.setVisibility(r0)
            r1.setOnClickListener(r5)
            goto L_0x013e
        L_0x0184:
            android.view.View r3 = r12.A06
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L_0x00f0
        L_0x018a:
            r0 = r20
            com.instagram.model.androidlink.AndroidLink r3 = X.AnonymousClass4EQ.A04(r8, r0, r13)
            boolean r0 = r13.A0o()
            if (r0 == 0) goto L_0x01d2
            r0 = 2131238646(0x7f081ef6, float:1.8093577E38)
        L_0x0199:
            r3 = 2131100036(0x7f060184, float:1.7812442E38)
            r1 = 2131099826(0x7f0600b2, float:1.7812016E38)
            android.graphics.drawable.StateListDrawable r7 = X.AnonymousClass3JT.A08(r8, r0, r3, r0, r1)
            r3 = 2131099778(0x7f060082, float:1.7811919E38)
            r1 = 2131099794(0x7f060092, float:1.7811951E38)
            android.graphics.drawable.StateListDrawable r3 = X.AnonymousClass3JT.A08(r8, r0, r3, r0, r1)
            android.content.Context r0 = r6.getContext()
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x01ce
            r6.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r7, r5)
        L_0x01ba:
            android.widget.TextView r1 = r12.A07
            X.0qQ.A0B(r1, r11)
            android.content.Context r0 = r1.getContext()
            boolean r0 = X.0mk.A02(r0)
            if (r0 == 0) goto L_0x0251
            r1.setCompoundDrawablesWithIntrinsicBounds(r5, r5, r3, r5)
            goto L_0x00c1
        L_0x01ce:
            r6.setCompoundDrawablesWithIntrinsicBounds(r7, r5, r5, r5)
            goto L_0x01ba
        L_0x01d2:
            boolean r0 = r13.A0y()
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r13.A0w()
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r13.A0x()
            if (r0 != 0) goto L_0x01fc
            boolean r0 = r13.A0t()
            if (r0 != 0) goto L_0x01fc
            if (r3 == 0) goto L_0x0206
            X.47L r1 = X.AnonymousClass47L.IG_DESTINATION_MINI_SHOP_STOREFRONT
            X.47L r0 = X.C271714jT.A01(r3)
            if (r1 == r0) goto L_0x01fc
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_SHOPPING_PDP
            X.47L r0 = X.C271714jT.A01(r3)
            if (r1 != r0) goto L_0x0206
        L_0x01fc:
            boolean r0 = r13.A0g()
            if (r0 != 0) goto L_0x0206
        L_0x0202:
            r0 = 2131238783(0x7f081f7f, float:1.8093854E38)
            goto L_0x0199
        L_0x0206:
            boolean r0 = r13.A0l()
            if (r0 == 0) goto L_0x021e
            java.lang.Boolean r0 = X.C306096Kt.A00(r20)
            boolean r1 = r0.booleanValue()
            r0 = 2131238817(0x7f081fa1, float:1.8093923E38)
            if (r1 == 0) goto L_0x0199
            r0 = 2131238249(0x7f081d69, float:1.8092771E38)
            goto L_0x0199
        L_0x021e:
            if (r3 == 0) goto L_0x0231
            java.lang.String r1 = r3.CHl()
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0231
            r0 = 2131237889(0x7f081c01, float:1.8092041E38)
            goto L_0x0199
        L_0x0231:
            boolean r0 = X.C270804hK.A02(r3)
            if (r0 == 0) goto L_0x023c
            r0 = 2131237899(0x7f081c0b, float:1.8092061E38)
            goto L_0x0199
        L_0x023c:
            if (r3 == 0) goto L_0x00c1
            java.lang.String r1 = r3.Avj()
            if (r1 == 0) goto L_0x00c1
            java.lang.String r0 = "cta_type=try_it"
            boolean r0 = X.00l.A0d(r1, r0, r11)
            if (r0 != r10) goto L_0x00c1
            r0 = 2131238034(0x7f081c92, float:1.8092335E38)
            goto L_0x0199
        L_0x0251:
            r1.setCompoundDrawablesWithIntrinsicBounds(r3, r5, r5, r5)
            goto L_0x00c1
        L_0x0256:
            android.view.View r1 = r12.A05
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            goto L_0x0072
        L_0x025c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YT.A00(android.view.View$OnClickListener, X.3uh, X.Pvu, X.6lB):void");
    }

    public static final void A01(C316146lB r6) {
        0qQ.A0B(r6, 0);
        r6.A04.setVisibility(8);
        r6.A01.setAlpha(1.0f);
        TextView textView = r6.A08;
        textView.setText("");
        textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        r6.A02.setAlpha(0.0f);
        TextView textView2 = r6.A07;
        textView2.setText("");
        textView2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        C252063oV r2 = r6.A0B;
        if (r2.CVM() || r6.A0E.CVM() || r6.A0C.CVM() || r6.A0D.CVM()) {
            ((TextView) r2.getView()).setText("");
            C252063oV r1 = r6.A0E;
            ((TextView) r1.getView()).setText("");
            r2.setVisibility(8);
            r1.setVisibility(8);
            r6.A0C.setVisibility(8);
            r6.A0D.setVisibility(8);
        }
        r6.A00 = false;
    }
}
