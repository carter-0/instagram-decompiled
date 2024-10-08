package X;

/* renamed from: X.VBq  reason: case insensitive filesystem */
public abstract class C16938VBq {
    /* JADX WARNING: type inference failed for: r10v5, types: [com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: type inference failed for: r10v7, types: [com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass0iw r25, com.instagram.common.session.UserSession r26, X.OJ1 r27, X.VNA r28, X.VNB r29, X.VNC r30, int r31) {
        /*
            r0 = r29
            android.view.ViewGroup r1 = r0.A00
            r15 = 0
            X.0nA.A0X(r1, r15)
            r13 = 0
        L_0x0009:
            r0 = r30
            X.71g r2 = r0.A00
            int r0 = r2.A01()
            if (r13 >= r0) goto L_0x00d5
            java.lang.Object r3 = r2.A02(r13)
            X.5ov r3 = (X.C295795ov) r3
        L_0x0019:
            android.view.View r10 = r1.getChildAt(r13)
            boolean r0 = r10 instanceof com.instagram.igds.components.imagebutton.IgImageButton
            if (r0 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x0026
            r1.removeView(r10)
        L_0x0026:
            r0 = r28
            java.util.LinkedList r0 = r0.A00
            java.lang.Object r10 = r0.poll()
            com.instagram.igds.components.imagebutton.IgImageButton r10 = (com.instagram.igds.components.imagebutton.IgImageButton) r10
            if (r10 != 0) goto L_0x003b
            android.content.Context r0 = r1.getContext()
            com.instagram.igds.components.imagebutton.IgImageButton r10 = new com.instagram.igds.components.imagebutton.IgImageButton
            r10.<init>(r0)
        L_0x003b:
            r1.addView(r10, r13)
        L_0x003e:
            r0 = -1
            r11 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r15, r0, r11)
            r0 = 2
            if (r13 >= r0) goto L_0x0057
            android.content.res.Resources r2 = X.DbU.A05(r10)
            r0 = 2131165672(0x7f0701e8, float:1.7945568E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r4.setMargins(r15, r15, r0, r15)
        L_0x0057:
            r10.setLayoutParams(r4)
            if (r3 == 0) goto L_0x00cf
            r14 = 1
            X.5qq r23 = X.C296895qp.A02(r14, r14)
            X.5qz r0 = new X.5qz
            r12 = r31
            r0.<init>(r12, r13)
            X.5ow r2 = r3.A00
            int r2 = r2.ordinal()
            if (r2 != r14) goto L_0x00cf
            java.lang.Object r9 = r3.A0F
            X.0qQ.A0A(r9)
            X.1Xj r9 = (X.1Xj) r9
            boolean r24 = r9.CeS()
            X.OjW r5 = new X.OjW
            r7 = r25
            r8 = r26
            r2 = r27
            r16 = r5
            r17 = r14
            r18 = r0
            r19 = r7
            r20 = r2
            r21 = r8
            r22 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 6
            X.WBt r6 = new X.WBt
            r6.<init>(r3, r9, r0, r2)
            r4 = 33
            X.WB4 r3 = new X.WB4
            r3.<init>(r4, r2, r0, r9)
            java.lang.String r0 = r9.getId()
            r10.setTransitionName(r0)
            X.1se r0 = X.1sd.A00(r8)
            boolean r0 = r0.A05(r9)
            com.instagram.igds.components.imagebutton.IgImageButton r10 = (com.instagram.igds.components.imagebutton.IgImageButton) r10
            if (r0 == 0) goto L_0x00c5
            r2 = r3
            r3 = r7
            r4 = r9
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r15
            r9 = r15
            X.OSK.A00(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x00bf:
            int r13 = r13 + 1
            r0 = 3
            if (r13 < r0) goto L_0x0009
            return
        L_0x00c5:
            X.0qQ.A0B(r8, r15)
            X.C13988Tno.A1O(r10, r14, r7)
            X.C321466uD.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x00bf
        L_0x00cf:
            com.instagram.igds.components.imagebutton.IgImageButton r10 = (com.instagram.igds.components.imagebutton.IgImageButton) r10
            X.C321466uD.A04(r10)
            goto L_0x00bf
        L_0x00d5:
            r3 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16938VBq.A00(X.0iw, com.instagram.common.session.UserSession, X.OJ1, X.VNA, X.VNB, X.VNC, int):void");
    }
}
