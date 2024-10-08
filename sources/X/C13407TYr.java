package X;

import android.content.Context;
import com.facebookpay.widget.navibar.NavigationBar;

/* renamed from: X.TYr  reason: case insensitive filesystem */
public final class C13407TYr extends 0Yb {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13407TYr(int i, Object obj, Object obj2) {
        super((Object) null);
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r3 == null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r3.setEnabled(r4);
        r2 = X.AnonymousClass2E0.A0A();
        r1 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (r4 == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        r1 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        r0 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r0 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        r3.setTextColor(r2.A03(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r0 = (android.content.Context) r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x018f, code lost:
        r0 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0191, code lost:
        if (r0 != null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
        r0 = (android.content.Context) r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0197, code lost:
        if (r9 == null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0199, code lost:
        X.C9659Red.A00(r0, r1, r9);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019d, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a1, code lost:
        r1.setImageDrawable((android.graphics.drawable.Drawable) null);
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r8, java.lang.Object r9, X.AnonymousClass0YZ r10) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0084;
                case 1: goto L_0x0115;
                case 2: goto L_0x00ef;
                case 3: goto L_0x009e;
                case 4: goto L_0x0058;
                case 5: goto L_0x0044;
                case 6: goto L_0x0033;
                case 7: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.RH3 r9 = (X.RH3) r9
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A04(r0)
            android.widget.ImageView r1 = r0.A05
            if (r1 != 0) goto L_0x018f
            java.lang.String r6 = "rightIconButton"
        L_0x0018:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0020:
            X.RH3 r9 = (X.RH3) r9
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A03(r0)
            android.widget.ImageView r1 = r0.A04
            if (r1 != 0) goto L_0x018f
            java.lang.String r6 = "leftIconButton"
            goto L_0x0018
        L_0x0033:
            X.RH3 r9 = (X.RH3) r9
            java.lang.Object r2 = r7.A02
            com.facebookpay.widget.navibar.NavigationBar r2 = (com.facebookpay.widget.navibar.NavigationBar) r2
            com.facebookpay.widget.navibar.NavigationBar.A02(r2)
            android.widget.LinearLayout r0 = r2.A07
            if (r0 != 0) goto L_0x013b
            java.lang.String r6 = "navbarCenterContainer"
            goto L_0x0018
        L_0x0044:
            boolean r4 = X.AnonymousClass7TE.A1a(r9)
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A04(r0)
            android.widget.TextView r3 = r0.A0C
            java.lang.String r6 = "rightTextButton"
            goto L_0x006a
        L_0x0058:
            boolean r4 = X.AnonymousClass7TE.A1a(r9)
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A03(r0)
            android.widget.TextView r3 = r0.A0B
            java.lang.String r6 = "leftTextButton"
        L_0x006a:
            if (r3 == 0) goto L_0x0018
            r3.setEnabled(r4)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 17
            if (r4 == 0) goto L_0x0078
            r1 = 5
        L_0x0078:
            X.Q6J r0 = r0.A0E
            if (r0 == 0) goto L_0x0099
        L_0x007c:
            int r0 = r2.A03(r0, r1)
            r3.setTextColor(r0)
            return
        L_0x0084:
            android.view.View$OnClickListener r9 = (android.view.View.OnClickListener) r9
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0H
            java.lang.String r6 = "tertiaryTextView"
            if (r3 == 0) goto L_0x0018
            X.AnonymousClass0fU.A00(r9, r3)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 5
        L_0x0099:
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x007c
        L_0x009e:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r7.A02
            X.Q9S r0 = (X.Q9S) r0
            android.widget.ImageView r5 = r0.A00
            java.lang.String r6 = "imageView"
            if (r5 == 0) goto L_0x0018
            r4 = 0
            if (r9 == 0) goto L_0x00db
            X.S0m r2 = X.AnonymousClass2E0.A0G()
            boolean r0 = r2.A00(r9)
            if (r0 == 0) goto L_0x00db
            java.lang.String r1 = "ListCell"
            android.content.Context r0 = r2.A00
            X.QnT r2 = new X.QnT
            r2.<init>(r0, r9, r1)
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165206(0x7f070016, float:1.7944623E38)
            float r0 = r1.getDimension(r0)
            r2.A00 = r0
            r0 = 1
            r2.A07 = r0
            r2.A02(r5)
        L_0x00d7:
            r5.setVisibility(r4)
            return
        L_0x00db:
            X.SPB r3 = X.AnonymousClass2E0.A0A()
            r2 = 34
            r1 = 33
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            android.graphics.drawable.Drawable r0 = r3.A05(r0, r2, r1)
            r5.setImageDrawable(r0)
            goto L_0x00d7
        L_0x00ef:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x0187
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0F
            java.lang.String r6 = "quaternaryTextView"
            if (r3 == 0) goto L_0x0018
            X.SRn.A04(r3, r9)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 5
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            int r0 = r2.A03(r0, r1)
            r3.setLinkTextColor(r0)
            X.DbT.A1H(r3)
            return
        L_0x0115:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            if (r9 == 0) goto L_0x0187
            java.lang.Object r0 = r7.A02
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            android.widget.TextView r3 = r0.A0H
            java.lang.String r6 = "tertiaryTextView"
            if (r3 == 0) goto L_0x0018
            X.SRn.A04(r3, r9)
            X.SPB r2 = X.AnonymousClass2E0.A0A()
            r1 = 5
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            int r0 = r2.A03(r0, r1)
            r3.setLinkTextColor(r0)
            X.DbT.A1H(r3)
            return
        L_0x013b:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            X.SbZ r0 = r2.A0G
            r1.addOnGlobalLayoutListener(r0)
            android.widget.ImageView r1 = r2.A06
            java.lang.String r6 = "titleIconView"
            if (r1 == 0) goto L_0x0018
            X.Q6J r0 = r2.A0E
            if (r0 != 0) goto L_0x0153
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
        L_0x0153:
            if (r9 == 0) goto L_0x0188
            X.C9659Red.A00(r0, r1, r9)
            r0 = 0
        L_0x0159:
            r1.setVisibility(r0)
            java.lang.String r0 = r2.getTitle()
            if (r0 == 0) goto L_0x0187
            if (r9 == 0) goto L_0x0187
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r0 = 6
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.leftMargin = r0
            r0 = 16
            r2.gravity = r0
        L_0x0187:
            return
        L_0x0188:
            r0 = 0
            r1.setImageDrawable(r0)
            r0 = 8
            goto L_0x0159
        L_0x018f:
            X.Q6J r0 = r0.A0E
            if (r0 != 0) goto L_0x0197
            java.lang.Object r0 = r7.A01
            android.content.Context r0 = (android.content.Context) r0
        L_0x0197:
            if (r9 == 0) goto L_0x01a1
            X.C9659Red.A00(r0, r1, r9)
            r0 = 0
        L_0x019d:
            r1.setVisibility(r0)
            return
        L_0x01a1:
            r0 = 0
            r1.setImageDrawable(r0)
            r0 = 8
            goto L_0x019d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13407TYr.A02(java.lang.Object, java.lang.Object, X.0YZ):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13407TYr(Context context, NavigationBar navigationBar, Object obj, int i) {
        super(obj);
        this.A00 = i;
        this.A02 = navigationBar;
        this.A01 = context;
    }
}
