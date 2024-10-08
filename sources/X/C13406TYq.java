package X;

/* renamed from: X.TYq  reason: case insensitive filesystem */
public final class C13406TYq extends 0Yb {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13406TYq(int i, Object obj, Object obj2) {
        super(obj2);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012d, code lost:
        if (r2 == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012f, code lost:
        X.C11409SSh.A05(r2, com.instagram.android.R.style.FBPayUINavigationBarProfileIcon, false);
        com.facebookpay.widget.navibar.NavigationBar.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0151, code lost:
        if (r2 == null) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        X.AnonymousClass0fU.A00(r12, r2);
        X.C18674VwX.A01(r2, X.AnonymousClass05K.A01, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016e, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Object r11, java.lang.Object r12, X.AnonymousClass0YZ r13) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x0119;
                case 1: goto L_0x0146;
                case 2: goto L_0x015c;
                case 3: goto L_0x0103;
                case 4: goto L_0x013a;
                case 5: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r1 = X.AnonymousClass7TE.A1a(r12)
            boolean r0 = X.AnonymousClass7TE.A1a(r11)
            if (r0 == r1) goto L_0x0016
            java.lang.Object r0 = r10.A01
            X.Vzq r0 = (X.C18755Vzq) r0
            X.C18755Vzq.A00(r0, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r10.A01
            com.facebookpay.widget.pricetable.PriceTable r5 = (com.facebookpay.widget.pricetable.PriceTable) r5
            r5.removeAllViews()
            java.util.List r0 = r5.getPriceTableRowDataList()
            if (r0 == 0) goto L_0x0016
            java.util.Iterator r9 = r0.iterator()
        L_0x0028:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0016
            java.lang.Object r8 = r9.next()
            X.S6W r8 = (X.S6W) r8
            android.content.Context r7 = r5.getContext()
            android.widget.TableRow r4 = new android.widget.TableRow
            r4.<init>(r7)
            r0 = 1
            r4.setImportantForAccessibility(r0)
            r1 = -1
            r6 = -2
            android.widget.TableLayout$LayoutParams r0 = new android.widget.TableLayout$LayoutParams
            r0.<init>(r1, r6)
            r4.setLayoutParams(r0)
            int r1 = r5.A04
            r0 = 0
            r4.setPadding(r0, r1, r0, r1)
            r5.addView(r4)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x006e
            android.widget.Space r2 = new android.widget.Space
            r2.<init>(r7)
            int r0 = r5.A02
            android.widget.TableRow$LayoutParams r1 = new android.widget.TableRow$LayoutParams
            r1.<init>(r0, r6)
            int r0 = r5.A03
            r1.rightMargin = r0
            r2.setLayoutParams(r1)
            r4.addView(r2)
        L_0x006e:
            boolean r0 = r8.A04
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x00fb
            X.RH2 r2 = X.RH2.A0m
        L_0x0078:
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r7)
            java.lang.String r0 = r8.A01
            r1.setText(r0)
            r1.setSingleLine()
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r0)
            android.widget.TableRow$LayoutParams r0 = new android.widget.TableRow$LayoutParams
            r0.<init>(r6, r6)
            int r3 = r5.A03
            r0.rightMargin = r3
            r1.setLayoutParams(r0)
            X.SRn.A02(r1, r2)
            r4.addView(r1)
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00b4
            android.widget.Space r2 = new android.widget.Space
            r2.<init>(r7)
            int r1 = r5.A02
            android.widget.TableRow$LayoutParams r0 = new android.widget.TableRow$LayoutParams
            r0.<init>(r1, r6)
            r0.rightMargin = r3
            r2.setLayoutParams(r0)
            r4.addView(r2)
        L_0x00b4:
            boolean r1 = r8.A02
            if (r1 == 0) goto L_0x00de
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00de
            X.RH2 r3 = X.RH2.A0J
        L_0x00be:
            android.widget.TextView r2 = new android.widget.TextView
            r2.<init>(r7)
            java.lang.String r0 = r8.A00
            r2.setText(r0)
            r2.setSingleLine()
            android.widget.TableRow$LayoutParams r1 = new android.widget.TableRow$LayoutParams
            r1.<init>(r6, r6)
            r0 = 5
            r1.gravity = r0
            r2.setLayoutParams(r1)
            X.SRn.A02(r2, r3)
            r4.addView(r2)
            goto L_0x0028
        L_0x00de:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x00e5
            X.RH2 r3 = X.RH2.A0K
            goto L_0x00be
        L_0x00e5:
            if (r1 == 0) goto L_0x00f1
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x00ee
            X.RH2 r3 = X.RH2.A0m
            goto L_0x00be
        L_0x00ee:
            X.RH2 r3 = X.RH2.A0k
            goto L_0x00be
        L_0x00f1:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x00f8
            X.RH2 r3 = X.RH2.A0n
            goto L_0x00be
        L_0x00f8:
            X.RH2 r3 = X.RH2.A0l
            goto L_0x00be
        L_0x00fb:
            X.RH2 r2 = X.RH2.A0k
            goto L_0x0078
        L_0x00ff:
            X.RH2 r2 = X.RH2.A0l
            goto L_0x0078
        L_0x0103:
            boolean r0 = X.AnonymousClass7TE.A1a(r12)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r10.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A04(r0)
            android.widget.ImageView r2 = r0.A05
            java.lang.String r0 = "rightIconButton"
            goto L_0x012d
        L_0x0119:
            boolean r0 = X.AnonymousClass7TE.A1a(r12)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r0 = r10.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A03(r0)
            android.widget.ImageView r2 = r0.A04
            java.lang.String r0 = "leftIconButton"
        L_0x012d:
            if (r2 == 0) goto L_0x016e
            r1 = 2132017619(0x7f1401d3, float:1.9673522E38)
            r0 = 0
            X.C11409SSh.A05(r2, r1, r0)
            com.facebookpay.widget.navibar.NavigationBar.A00(r2)
            return
        L_0x013a:
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            java.lang.Object r0 = r10.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            android.widget.ImageView r2 = r0.A05
            java.lang.String r0 = "rightIconButton"
            goto L_0x0150
        L_0x0146:
            android.view.View$OnClickListener r12 = (android.view.View.OnClickListener) r12
            java.lang.Object r0 = r10.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            android.widget.ImageView r2 = r0.A04
            java.lang.String r0 = "leftIconButton"
        L_0x0150:
            r1 = 0
            if (r2 == 0) goto L_0x016e
            X.AnonymousClass0fU.A00(r12, r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.C18674VwX.A01(r2, r0, r1)
            return
        L_0x015c:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r0 = r10.A01
            com.facebookpay.widget.navibar.NavigationBar r0 = (com.facebookpay.widget.navibar.NavigationBar) r0
            com.facebookpay.widget.navibar.NavigationBar.A02(r0)
            com.facebookpay.widget.navibar.NavigationBar.A03(r0)
            android.widget.TextView r0 = r0.A0B
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "leftTextButton"
        L_0x016e:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0176:
            X.SRn.A04(r0, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13406TYq.A02(java.lang.Object, java.lang.Object, X.0YZ):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13406TYq(Object obj, int i) {
        super((Object) null);
        this.A00 = i;
        this.A01 = obj;
    }
}
