package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.PAv  reason: case insensitive filesystem */
public final class C72564PAv implements AnonymousClass7D2 {
    public final P8O A00;
    public final AnonymousClass7DZ A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        if (r1 == 0) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r1 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.C328667Fr r20, X.C68065MzW r21) {
        /*
            r19 = this;
            r9 = 0
            r8 = r20
            r7 = r21
            boolean r6 = X.AnonymousClass7TF.A1U(r9, r7, r8)
            android.view.View r2 = X.JTO.A0F(r7)
            r1 = 19
            r16 = r19
            r0 = r16
            X.C71399Ojy.A00(r2, r8, r0, r7, r1)
            java.util.List r5 = r7.A0B
            java.util.Iterator r1 = r5.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002a
            java.lang.Object r0 = r1.next()
            X.C51969G9p.A1M(r0)
            goto L_0x001c
        L_0x002a:
            java.util.List r10 = r8.A0b
            if (r10 == 0) goto L_0x0086
            java.util.Iterator r12 = r10.iterator()
            r1 = 0
        L_0x0033:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r4 = r12.next()
            int r11 = r1 + 1
            if (r1 >= 0) goto L_0x0049
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0049:
            X.9JN r4 = (X.AnonymousClass9JN) r4
            java.lang.Object r3 = r5.get(r1)
            com.instagram.igds.components.button.IgdsButton r3 = (com.instagram.igds.components.button.IgdsButton) r3
            r3.setVisibility(r9)
            java.lang.String r0 = r4.A04
            r3.setText((java.lang.String) r0)
            java.lang.Object r0 = r4.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = 4
            r1 = 0
            if (r0 == 0) goto L_0x0080
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x0080
            r1 = 2131238074(0x7f081cba, float:1.8092416E38)
            X.4lx r0 = X.C273084lx.END
            r3.A02(r0, r1)
        L_0x006f:
            r14 = 9
            X.Ojz r13 = new X.Ojz
            r15 = r7
            r17 = r8
            r18 = r4
            r13.<init>((int) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (java.lang.Object) r18)
            X.AnonymousClass0fU.A00(r13, r3)
            r1 = r11
            goto L_0x0033
        L_0x0080:
            X.4lx r0 = X.C273084lx.END
            r3.setIcon(r1, r0)
            goto L_0x006f
        L_0x0086:
            com.instagram.common.ui.base.IgTextView r12 = r7.A05
            java.lang.String r0 = r8.A0a
            r12.setText(r0)
            X.74T r11 = r8.A0D
            r2 = 0
            if (r11 == 0) goto L_0x009d
            java.lang.CharSequence r0 = r11.A05
            if (r0 == 0) goto L_0x009d
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x009e
        L_0x009d:
            r0 = 1
        L_0x009e:
            r5 = 8
            com.instagram.common.ui.base.IgTextView r4 = r7.A03
            if (r0 == 0) goto L_0x01ea
            r4.setVisibility(r5)
        L_0x00a7:
            if (r11 == 0) goto L_0x00b4
            java.lang.CharSequence r0 = r11.A08
            if (r0 == 0) goto L_0x00b4
            boolean r1 = X.00l.A0W(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            java.lang.String r13 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            com.instagram.common.ui.base.IgTextView r3 = r7.A04
            if (r0 == 0) goto L_0x01aa
            r3.setVisibility(r5)
        L_0x00be:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r7.A07
            r0.setVisibility(r5)
            if (r11 == 0) goto L_0x01a3
            com.instagram.common.typedurl.ImageUrl r1 = r11.A01
            if (r1 == 0) goto L_0x01a3
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r7.A06
            r2.setVisibility(r9)
            X.0iw r0 = r7.A02
            r2.setUrl(r1, r0)
            r0 = 5
            r12.setTextAlignment(r0)
            r4.setTextAlignment(r0)
            r3.setTextAlignment(r0)
            android.content.Context r1 = r7.A00
            float r0 = X.JTR.A02(r1)
            int r15 = (int) r0
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
            int r14 = X.DbS.A03(r1, r0)
            int r1 = r12.getPaddingTop()
            int r0 = r12.getPaddingBottom()
            r12.setPadding(r15, r1, r14, r0)
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingBottom()
            r4.setPadding(r15, r1, r14, r0)
            int r1 = r3.getPaddingTop()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r15, r1, r14, r0)
        L_0x010f:
            X.777 r1 = r8.A0F
            boolean r0 = r1 instanceof X.AnonymousClass776
            if (r0 == 0) goto L_0x01a0
            X.776 r1 = (X.AnonymousClass776) r1
            if (r1 == 0) goto L_0x01a0
            com.instagram.common.typedurl.ImageUrl r4 = r1.A00
        L_0x011b:
            boolean r0 = X.C253833rU.A02(r4)
            if (r0 == 0) goto L_0x0182
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r0 = r7.A0A
            r0.setVisibility(r5)
        L_0x0126:
            if (r10 == 0) goto L_0x0148
            int r0 = r10.size()
            if (r0 <= r6) goto L_0x0148
            com.instagram.igds.components.button.IgdsButton r0 = r7.A09
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            X.0qQ.A0C(r4, r13)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            android.content.Context r0 = r7.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165195(0x7f07000b, float:1.79446E38)
            int r0 = X.DbS.A03(r1, r0)
            r4.bottomMargin = r0
        L_0x0148:
            android.widget.Space r0 = r7.A01
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.0qQ.A0C(r1, r13)
            X.2dQ r1 = (X.C71492dQ) r1
            if (r11 == 0) goto L_0x0169
            java.lang.CharSequence r0 = r11.A05
            if (r0 == 0) goto L_0x015f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x017d
        L_0x015f:
            java.lang.CharSequence r0 = r11.A08
            if (r0 == 0) goto L_0x0169
            int r0 = r0.length()
            if (r0 != 0) goto L_0x017d
        L_0x0169:
            int r0 = r2.getVisibility()
            if (r0 != 0) goto L_0x017d
            int r0 = r2.getId()
        L_0x0173:
            r1.A0t = r0
            r0 = r16
            X.7DZ r0 = r0.A01
            r0.A02(r7, r8)
            return
        L_0x017d:
            int r0 = r3.getId()
            goto L_0x0173
        L_0x0182:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r5 = r7.A0A
            r5.setVisibility(r9)
            r0 = 1073741824(0x40000000, float:2.0)
            r5.A00 = r0
            android.content.Context r0 = r7.A00
            int r0 = X.AnonymousClass7TG.A05(r0)
            float r1 = (float) r0
            r0 = 0
            r5.A01(r1, r1, r0, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r7.A08
            if (r4 == 0) goto L_0x01f8
            X.0iw r0 = r7.A02
            r1.setUrl(r4, r0)
            goto L_0x0126
        L_0x01a0:
            r4 = 0
            goto L_0x011b
        L_0x01a3:
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r7.A06
            r2.setVisibility(r5)
            goto L_0x010f
        L_0x01aa:
            if (r11 == 0) goto L_0x01ae
            java.lang.CharSequence r2 = r11.A08
        L_0x01ae:
            r3.setText(r2)
            r3.setVisibility(r9)
            if (r11 == 0) goto L_0x01e8
            java.lang.Integer r0 = r11.A0D
            if (r0 == 0) goto L_0x01e8
            int r1 = r0.intValue()
        L_0x01be:
            int r0 = r3.getMaxLines()
            if (r1 >= r0) goto L_0x01c5
            r1 = r0
        L_0x01c5:
            r3.setMaxLines(r1)
            int r0 = r4.getVisibility()
            if (r0 != r5) goto L_0x00be
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            X.0qQ.A0C(r2, r13)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.Context r0 = r7.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = X.DbS.A03(r1, r0)
            r2.topMargin = r0
            goto L_0x00be
        L_0x01e8:
            r1 = 0
            goto L_0x01be
        L_0x01ea:
            if (r11 == 0) goto L_0x01f6
            java.lang.CharSequence r0 = r11.A05
        L_0x01ee:
            r4.setText(r0)
            r4.setVisibility(r9)
            goto L_0x00a7
        L_0x01f6:
            r0 = r2
            goto L_0x01ee
        L_0x01f8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72564PAv.ADp(X.7Fr, X.MzW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A01.A01(r2);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw AnonymousClass7TE.A0z("should not be called");
    }

    public C72564PAv(P8O p8o, AnonymousClass7DZ r2) {
        this.A01 = r2;
        this.A00 = p8o;
    }
}
