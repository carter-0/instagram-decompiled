package X;

import com.instagram.common.session.UserSession;

public final class KA1 extends C336937fQ {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final AnonymousClass32Q A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.instagram.igds.components.imagebutton.IgMultiImageButton[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: com.instagram.igds.components.imagebutton.IgMultiImageButton[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.L48, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r11v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgImageButton, com.instagram.igds.components.imagebutton.IgMultiImageButton] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r14, android.view.View r15, android.view.ViewGroup r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r13 = this;
            r7 = r17
            r8 = r18
            r0 = 863643740(0x337a285c, float:5.8244368E-8)
            int r6 = X.AnonymousClass0fD.A03(r0)
            android.content.Context r10 = r16.getContext()
            if (r15 != 0) goto L_0x005b
            r9 = 3
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r10)
            X.L48 r5 = new X.L48
            r5.<init>()
            r5.A00 = r15
            com.instagram.igds.components.imagebutton.IgMultiImageButton[] r0 = new com.instagram.igds.components.imagebutton.IgMultiImageButton[r9]
            r5.A01 = r0
            r4 = 0
            r3 = 0
        L_0x0024:
            r12 = 1
        L_0x0025:
            com.instagram.igds.components.imagebutton.IgMultiImageButton r11 = new com.instagram.igds.components.imagebutton.IgMultiImageButton
            r11.<init>(r10)
            r1 = -2
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r4, r1, r0)
            if (r12 == 0) goto L_0x0042
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.setMarginEnd(r0)
        L_0x0042:
            r11.setLayoutParams(r2)
            r11.setEnableTouchOverlay(r4)
            com.instagram.igds.components.imagebutton.IgMultiImageButton[] r0 = r5.A01
            r0[r3] = r11
            r15.addView(r11)
            int r3 = r3 + 1
            if (r3 >= r9) goto L_0x0058
            r0 = 2
            r12 = 0
            if (r3 >= r0) goto L_0x0025
            goto L_0x0024
        L_0x0058:
            r15.setTag(r5)
        L_0x005b:
            com.instagram.common.session.UserSession r5 = r13.A01
            java.lang.Object r4 = X.DbT.A0o(r15)
            X.L48 r4 = (X.L48) r4
            X.71g r7 = (X.C3251571g) r7
            X.6u8 r8 = (X.AnonymousClass6u8) r8
            boolean r0 = r8.A04
            X.0iw r3 = r13.A00
            android.view.View r8 = r4.A00
            r8.getClass()
            r2 = 0
            if (r0 == 0) goto L_0x00e2
            r0 = 0
        L_0x0074:
            X.0nA.A0X(r8, r0)
        L_0x0077:
            com.instagram.igds.components.imagebutton.IgMultiImageButton[] r0 = r4.A01
            r0.getClass()
            int r0 = r0.length
            if (r2 >= r0) goto L_0x0108
            com.instagram.igds.components.imagebutton.IgMultiImageButton[] r0 = r4.A01
            r1 = r0[r2]
            int r0 = r7.A01()
            if (r2 >= r0) goto L_0x00de
            java.lang.Object r9 = r7.A02(r2)
            X.L49 r9 = (X.L49) r9
            r8 = 0
            r1.setColorFilter(r8)
            r10 = 0
            r1.setVisibility(r10)
            r0 = 255(0xff, float:3.57E-43)
            r1.setImageAlpha(r0)
            r1.setClickable(r10)
            com.instagram.common.typedurl.ImageUrl r0 = r9.A01
            r1.setUrl(r0, r3)
            X.3Q2 r0 = r9.A00
            if (r0 == 0) goto L_0x0100
            boolean r0 = r0.A0u()
            if (r0 == 0) goto L_0x00b6
            X.6uM r0 = X.C321546uM.A08
        L_0x00b0:
            r1.setIcon(r0)
        L_0x00b3:
            int r2 = r2 + 1
            goto L_0x0077
        L_0x00b6:
            X.3Q2 r0 = r9.A00
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r0.A12()
            if (r0 == 0) goto L_0x00c3
            X.6uM r0 = X.C321546uM.A0N
            goto L_0x00b0
        L_0x00c3:
            java.lang.String r0 = r3.getModuleName()
            boolean r0 = X.C324476zN.A0U(r5, r0)
            if (r0 != 0) goto L_0x00da
            X.3Q2 r0 = r9.A00
            if (r0 == 0) goto L_0x00f0
            boolean r0 = r0.A0t()
            if (r0 == 0) goto L_0x00da
            X.6uM r0 = X.C321546uM.A0L
            goto L_0x00b0
        L_0x00da:
            r1.A0H()
            goto L_0x00b3
        L_0x00de:
            X.C321466uD.A04(r1)
            goto L_0x00b3
        L_0x00e2:
            android.view.View r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x0074
        L_0x00f0:
            r8.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f8:
            r8.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0100:
            r8.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0108:
            r0 = -1554290233(0xffffffffa35b69c7, float:-1.1894413E-17)
            X.AnonymousClass0fD.A0A(r0, r6)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KA1.getView(int, android.view.View, android.view.ViewGroup, java.lang.Object, java.lang.Object):android.view.View");
    }

    public KA1(AnonymousClass0iw r1, UserSession userSession, AnonymousClass32Q r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = r1;
    }
}
