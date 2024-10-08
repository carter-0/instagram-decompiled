package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlz  reason: case insensitive filesystem */
public final class C60467Jlz extends AnonymousClass3B3 {
    public final int A00;
    public final Object A01;

    public C60467Jlz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(RecyclerView recyclerView, Object obj, int i) {
        recyclerView.A11(new C60467Jlz(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        r13.bottom = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0071, code lost:
        if (r5.A0G().size() > 4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0110, code lost:
        if (r1 == r2) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0112, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014c, code lost:
        if (r1 == r2) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0150, code lost:
        if (r10 == r11) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0156, code lost:
        if (r10 >= (r7 - 2)) goto L_0x0158;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0160, code lost:
        if (r9.A02(r10, r8) != r9.A02(r11, r8)) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01d3, code lost:
        r4 = r3 / r2;
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d6, code lost:
        if (r1 != 0) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d8, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01d9, code lost:
        r13.left = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01db, code lost:
        if (r1 != r2) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01dd, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x020c, code lost:
        r4 = r3 / r2;
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x020f, code lost:
        if (r1 != 0) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0211, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0212, code lost:
        r13.left = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0214, code lost:
        if (r1 != r2) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0216, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0217, code lost:
        r13.right = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004d, code lost:
        if (r0 != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0237, code lost:
        r13.right = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r13, android.view.View r14, androidx.recyclerview.widget.RecyclerView r15, X.AnonymousClass3AW r16) {
        /*
            r12 = this;
            int r0 = r12.A00
            r4 = r16
            switch(r0) {
                case 0: goto L_0x02ad;
                case 1: goto L_0x021b;
                case 2: goto L_0x01f6;
                case 3: goto L_0x023a;
                case 4: goto L_0x01df;
                case 5: goto L_0x01bd;
                case 6: goto L_0x01a6;
                case 7: goto L_0x0115;
                case 8: goto L_0x0166;
                case 9: goto L_0x00e4;
                case 10: goto L_0x00b2;
                case 11: goto L_0x0074;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r3 = X.C51973G9u.A1b(r13, r14, r15)
            int r2 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            X.3pI r1 = r15.A0D
            r0 = 21
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r1, r0)
            androidx.recyclerview.widget.GridLayoutManager r1 = (androidx.recyclerview.widget.GridLayoutManager) r1
            int r0 = r1.A00
            int r2 = r2 / r0
            int r0 = r0 - r3
            if (r2 != r0) goto L_0x004f
            java.lang.Object r5 = r12.A01
            X.HK1 r5 = (X.HK1) r5
            com.instagram.common.session.UserSession r4 = r5.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321761033266875(0x810a73000126bb, double:3.0333661612057745E-306)
            boolean r3 = X.182.A06(r2, r4, r0)
            r0 = 36321761033987782(0x810a73000c26c6, double:3.033366161661679E-306)
            boolean r2 = X.182.A06(r2, r4, r0)
            java.util.List r0 = r5.A0G()
            int r1 = r0.size()
            r0 = 6
            boolean r0 = X.C51970G9q.A1W(r1, r0)
            if (r3 == 0) goto L_0x005b
            if (r2 == 0) goto L_0x0068
            if (r0 == 0) goto L_0x0068
        L_0x004f:
            r1 = 12
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r14)
            int r0 = X.C61380mr.A01(r0, r1)
            r13.right = r0
        L_0x005b:
            r1 = 24
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r14)
            int r3 = X.C61380mr.A01(r0, r1)
        L_0x0065:
            r13.bottom = r3
        L_0x0067:
            return
        L_0x0068:
            java.util.List r0 = r5.A0G()
            int r1 = r0.size()
            r0 = 4
            if (r1 <= r0) goto L_0x005b
            goto L_0x004f
        L_0x0074:
            X.C51974G9v.A1O(r13, r14, r15, r4)
            super.getItemOffsets(r13, r14, r15, r4)
            android.content.Context r0 = r14.getContext()
            int r3 = X.DbY.A01(r0)
            java.lang.Object r1 = r12.A01
            X.H0d r1 = (X.C54134H0d) r1
            android.content.Context r0 = r1.requireContext()
            int r2 = X.AnonymousClass0nB.A01(r0)
            X.0eM r0 = r1.A0A
            int r0 = X.DbX.A07(r0)
            int r2 = r2 - r0
            int r1 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            if (r1 != 0) goto L_0x00ab
            int r0 = r2 / 2
        L_0x009d:
            r13.left = r0
            int r0 = r4.A00()
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x00ae
            int r4 = r2 / 2
            goto L_0x0237
        L_0x00ab:
            int r0 = r3 / 2
            goto L_0x009d
        L_0x00ae:
            int r4 = r3 / 2
            goto L_0x0237
        L_0x00b2:
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.lang.Object r2 = r12.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.res.Resources r0 = X.DbV.A05(r2)
            r1 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r0.getDimensionPixelOffset(r1)
            r13.left = r0
            android.content.res.Resources r0 = X.DbV.A05(r2)
            int r0 = r0.getDimensionPixelOffset(r1)
            r13.right = r0
            android.content.res.Resources r0 = X.DbV.A05(r2)
            int r0 = r0.getDimensionPixelOffset(r1)
            r13.top = r0
            android.content.res.Resources r0 = X.DbV.A05(r2)
            int r3 = r0.getDimensionPixelOffset(r1)
            goto L_0x0065
        L_0x00e4:
            X.AnonymousClass7TG.A1T(r13, r14, r15)
            java.lang.Object r1 = r12.A01
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView r1 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.GalleryMediaGridView) r1
            androidx.recyclerview.widget.GridLayoutManager r5 = r1.A01
            X.2Rw r0 = r1.A0A
            if (r0 == 0) goto L_0x02e4
            int r0 = r0.getItemCount()
            int r4 = r1.A00
            r3 = 0
            boolean r2 = X.DbW.A1Z(r5)
            int r10 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            X.6sz r9 = r5.A01
            if (r10 < 0) goto L_0x0112
            int r1 = r9.A00(r10)
            int r8 = r5.A00
            int r11 = r0 + -1
            int r0 = r11 - r8
            if (r10 < r0) goto L_0x0112
            if (r1 == r2) goto L_0x0158
        L_0x0112:
            r3 = r4
            goto L_0x0217
        L_0x0115:
            X.AnonymousClass7TG.A1T(r13, r14, r15)
            java.lang.Object r1 = r12.A01
            X.JW8 r1 = (X.JW8) r1
            androidx.recyclerview.widget.GridLayoutManager r8 = r1.A0A
            X.JWk r0 = r1.A0I
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            X.2Rw r0 = r0.A0A
            if (r0 == 0) goto L_0x0164
            int r7 = r0.getItemCount()
        L_0x012a:
            int r4 = r1.A06
            X.JWM r0 = r1.A0F
            int r3 = r0.A00
            boolean r6 = r0.A09
            boolean r5 = r0.A08
            boolean r2 = X.DbW.A1Z(r8)
            int r10 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            X.6sz r9 = r8.A01
            if (r10 < 0) goto L_0x0112
            int r1 = r9.A00(r10)
            int r8 = r8.A00
            int r11 = r7 + -1
            int r0 = r11 - r8
            if (r10 < r0) goto L_0x014e
            if (r1 == r2) goto L_0x0158
        L_0x014e:
            if (r6 == 0) goto L_0x0152
            if (r10 == r11) goto L_0x0158
        L_0x0152:
            if (r5 == 0) goto L_0x0112
            int r0 = r7 + -2
            if (r10 < r0) goto L_0x0112
        L_0x0158:
            int r1 = r9.A02(r11, r8)
            int r0 = r9.A02(r10, r8)
            if (r0 != r1) goto L_0x0112
            goto L_0x0217
        L_0x0164:
            r7 = 0
            goto L_0x012a
        L_0x0166:
            int r5 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            r0 = -1
            if (r5 <= r0) goto L_0x0067
            android.content.Context r0 = r14.getContext()
            r3 = 2
            r2 = 0
            X.0qQ.A0B(r0, r2)
            int r4 = X.JTU.A02(r0, r3)
            int r0 = r5 / 2
            if (r0 > 0) goto L_0x0186
            java.lang.Object r0 = r12.A01
            X.JlM r0 = (X.C60429JlM) r0
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0188
        L_0x0186:
            r13.top = r4
        L_0x0188:
            r13.bottom = r2
            java.lang.Object r0 = r12.A01
            X.2Rw r0 = (X.2Rw) r0
            int r1 = r0.getItemViewType(r5)
            r0 = 1
            if (r1 != r0) goto L_0x019a
            r13.left = r2
        L_0x0197:
            r13.right = r2
            return
        L_0x019a:
            int r5 = r5 % r3
            if (r5 != 0) goto L_0x01a2
            r13.left = r2
            int r4 = r4 / r3
            goto L_0x0237
        L_0x01a2:
            int r4 = r4 / r3
            r13.left = r4
            goto L_0x0197
        L_0x01a6:
            X.AnonymousClass7TG.A1N(r13, r14)
            r2 = 2
            X.AnonymousClass7TF.A1C(r15, r2, r4)
            super.getItemOffsets(r13, r14, r15, r4)
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            int r1 = r0 % 3
            java.lang.Object r0 = r12.A01
            X.Ll5 r0 = (X.C64966Ll5) r0
            int r3 = r0.A00
            goto L_0x01d3
        L_0x01bd:
            X.AnonymousClass7TG.A1N(r13, r14)
            r2 = 2
            X.AnonymousClass7TF.A1C(r15, r2, r4)
            super.getItemOffsets(r13, r14, r15, r4)
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            int r1 = r0 % 3
            java.lang.Object r0 = r12.A01
            X.Ll6 r0 = (X.C64967Ll6) r0
            int r3 = r0.A02
        L_0x01d3:
            int r4 = r3 / r2
            r0 = r4
            if (r1 != 0) goto L_0x01d9
            r0 = r3
        L_0x01d9:
            r13.left = r0
            if (r1 != r2) goto L_0x0217
            r4 = r3
            goto L_0x0217
        L_0x01df:
            X.AnonymousClass7TG.A1N(r13, r14)
            r2 = 2
            X.AnonymousClass7TF.A1C(r15, r2, r4)
            super.getItemOffsets(r13, r14, r15, r4)
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            int r1 = r0 % 3
            java.lang.Object r0 = r12.A01
            X.Ll7 r0 = (X.C64968Ll7) r0
            int r3 = r0.A0B
            goto L_0x020c
        L_0x01f6:
            X.AnonymousClass7TG.A1N(r13, r14)
            r2 = 2
            X.AnonymousClass7TF.A1C(r15, r2, r4)
            super.getItemOffsets(r13, r14, r15, r4)
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            int r1 = r0 % 3
            java.lang.Object r0 = r12.A01
            X.Lnj r0 = (X.C65121Lnj) r0
            int r3 = r0.A0A
        L_0x020c:
            int r4 = r3 / r2
            r0 = r4
            if (r1 != 0) goto L_0x0212
            r0 = 0
        L_0x0212:
            r13.left = r0
            if (r1 != r2) goto L_0x0217
            r4 = 0
        L_0x0217:
            r13.right = r4
            goto L_0x0065
        L_0x021b:
            X.AnonymousClass7TG.A1T(r13, r14, r15)
            int r0 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            r3 = 3
            int r0 = r0 % r3
            int r2 = r0 + 1
            java.lang.Object r0 = r12.A01
            android.content.Context r1 = X.DbT.A07(r0)
            r0 = 2130970634(0x7f04080a, float:1.7549984E38)
            int r4 = X.2Yu.A0G(r1, r0)
            r13.bottom = r4
            if (r2 == r3) goto L_0x0067
        L_0x0237:
            r13.right = r4
            return
        L_0x023a:
            X.AnonymousClass7TG.A1T(r13, r14, r15)
            int r3 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            int r0 = r15.getHeight()
            int r2 = r0 / 2
            java.lang.Object r0 = r12.A01
            X.Jm9 r0 = (X.C60477Jm9) r0
            X.JlG r4 = r0.A03
            java.lang.String r0 = "adapter"
            if (r4 != 0) goto L_0x0259
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0259:
            int r0 = r4.A00()
            int r0 = r0 / 2
            int r2 = r2 - r0
            if (r3 != 0) goto L_0x028f
            android.content.res.Resources r0 = r14.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r1 = r0 / 3
            int r0 = r4.A01()
            int r0 = r0 / 3
            int r1 = r1 - r0
            r13.left = r1
        L_0x0277:
            int r0 = r4.getItemCount()
            int r0 = r0 + -1
            if (r3 == r0) goto L_0x028c
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r13.right = r0
        L_0x028c:
            r13.top = r2
            return
        L_0x028f:
            int r0 = r4.getItemCount()
            int r0 = r0 + -1
            if (r3 != r0) goto L_0x0277
            android.content.res.Resources r0 = r14.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r1 = r0 / 3
            int r0 = r4.A01()
            int r0 = r0 / 3
            int r1 = r1 - r0
            r13.right = r1
            goto L_0x0277
        L_0x02ad:
            r6 = 0
            boolean r5 = X.C51973G9u.A1b(r13, r14, r15)
            int r4 = androidx.recyclerview.widget.RecyclerView.A03(r14)
            java.lang.Object r3 = r12.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.content.Context r1 = r3.requireContext()
            r0 = 8
            int r2 = X.DbS.A02(r1, r0)
            android.content.Context r0 = r3.requireContext()
            int r1 = X.AnonymousClass7TG.A02(r0)
            if (r4 != 0) goto L_0x02d2
            r13.set(r6, r6, r6, r6)
            return
        L_0x02d2:
            int r0 = r4 % 3
            if (r0 != r5) goto L_0x02da
            r13.set(r1, r6, r6, r2)
            return
        L_0x02da:
            if (r0 != 0) goto L_0x02e0
            r13.set(r6, r6, r1, r2)
            return
        L_0x02e0:
            r13.set(r6, r6, r6, r2)
            return
        L_0x02e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60467Jlz.getItemOffsets(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.3AW):void");
    }
}
