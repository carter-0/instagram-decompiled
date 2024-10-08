package X;

/* renamed from: X.Wms  reason: case insensitive filesystem */
public final class C20194Wms implements Runnable {
    public final /* synthetic */ C15295Ua1 A00;
    public final /* synthetic */ C17918Vi9 A01;

    public C20194Wms(C15295Ua1 ua1, C17918Vi9 vi9) {
        this.A00 = ua1;
        this.A01 = vi9;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0117, code lost:
        if (r9 != null) goto L_0x0119;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0580  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x076f  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x05b2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r32 = this;
            r0 = r32
            X.Ua1 r8 = r0.A00
            X.Vi9 r1 = r0.A01
            r7 = 0
            java.lang.String r0 = r1.A04
            r31 = r0
            java.lang.String r3 = r1.A03
            X.VzD r0 = X.C18734VzD.A04
            android.util.LruCache r0 = r0.A01
            r30 = r0
            r1 = r0
            r0 = r31
            java.lang.Object r11 = r1.get(r0)
            X.6L1 r11 = (X.AnonymousClass6L1) r11
            if (r11 == 0) goto L_0x079c
            X.Uh3 r6 = r8.A01
            if (r6 != 0) goto L_0x002c
            java.lang.String r0 = "controller"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002c:
            com.instagram.model.reels.Reel r2 = r8.A04
            if (r2 == 0) goto L_0x06ed
            X.0eM r0 = r8.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            int r0 = r8.A00
            X.3uh r0 = r2.A0A(r1, r0)
            if (r0 == 0) goto L_0x06ff
            X.1Xj r1 = r0.A0b
        L_0x0040:
            if (r1 == 0) goto L_0x06ff
        L_0x0042:
            X.1Nv r1 = (X.1Nv) r1
            X.0qQ.A0B(r1, r7)
            r5 = 1
            r6.A08 = r1
            android.view.View r1 = r6.A00
            java.lang.String r18 = "canvasContainer"
            if (r1 == 0) goto L_0x0794
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.0eM r3 = r6.A0T
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            r1.addView(r0)
            X.Ugu r0 = r6.A03
            java.lang.String r21 = "analyticsHelper"
            if (r0 == 0) goto L_0x078c
            r0.A01()
            X.Ugx r0 = r6.A06
            if (r0 != 0) goto L_0x0072
            java.lang.String r13 = "videoModule"
        L_0x006a:
            X.0qQ.A0F(r13)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            r0.onResume()
            X.VZX r0 = r11.A00
            if (r0 == 0) goto L_0x0195
            java.util.List r1 = r0.A03
            if (r1 == 0) goto L_0x0195
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != r5) goto L_0x0195
            java.util.Iterator r2 = r1.iterator()
        L_0x0087:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0195
            java.lang.Object r1 = r2.next()
            X.XRL r0 = X.XRL.ENABLE_SWIPE_TO_OPEN
            if (r0 != r1) goto L_0x0087
            r20 = 1
        L_0x0097:
            X.VZX r0 = r11.A00
            if (r0 == 0) goto L_0x0192
            X.VNQ r0 = r0.A01
            if (r0 == 0) goto L_0x0192
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x0192
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != r5) goto L_0x0192
            int r0 = X.DbT.A02(r1, r5)
            java.lang.Object r0 = r1.get(r0)
            X.VNP r0 = (X.VNP) r0
            X.Vd1 r0 = r0.A00
            if (r0 == 0) goto L_0x0787
            X.Uz4 r1 = r0.A08
            X.Uz4 r0 = X.C16668Uz4.FOOTER
            if (r1 != r0) goto L_0x0192
            X.VZX r0 = r11.A00
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0781
            X.VNQ r0 = r0.A01
            if (r0 == 0) goto L_0x077b
            java.util.List r0 = r0.A00
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.C66582MXn.A0r(r0)
            X.VNP r0 = (X.VNP) r0
            X.Vd1 r1 = r0.A00
            if (r1 == 0) goto L_0x0775
            X.Ucg r0 = new X.Ucg
            r0.<init>(r1)
            X.Ucp r9 = new X.Ucp
            r9.<init>(r0)
        L_0x00e0:
            X.VXo r4 = r6.A0L
            android.view.View r19 = X.AnonymousClass7TE.A0c(r3)
            boolean r0 = r6.A0U
            r17 = r0
            r0 = r19
            X.0qQ.A0B(r0, r7)
            java.lang.Object r3 = r19.getTag()
            java.lang.String r2 = "Required value was null."
            if (r3 == 0) goto L_0x076f
            X.VaP r3 = (X.C17571VaP) r3
            X.6L1 r0 = r3.A00
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02db
            r3.A00 = r11
            X.VZX r10 = r11.A00
            if (r10 == 0) goto L_0x0716
            X.UAS r0 = r4.A02
            r29 = r0
            X.VNQ r0 = r10.A01
            if (r0 == 0) goto L_0x070e
            java.util.List r12 = r0.A00
            X.0qQ.A07(r12)
            if (r20 == 0) goto L_0x0119
            r14 = 1
            if (r9 == 0) goto L_0x011a
        L_0x0119:
            r14 = 0
        L_0x011a:
            r0 = r29
            X.VRl r0 = r0.A02
            java.util.List r1 = r0.A00
            r1.clear()
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0218
            java.util.Iterator r13 = r12.iterator()
        L_0x012d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r0 = r13.next()
            X.VNP r0 = (X.VNP) r0
            X.Vd1 r12 = r0.A00
            if (r12 == 0) goto L_0x0708
            X.Uz4 r0 = r12.A08
            if (r0 == 0) goto L_0x012d
            int r0 = r0.ordinal()
            switch(r0) {
                case 5: goto L_0x0154;
                case 23: goto L_0x0175;
                case 29: goto L_0x016a;
                case 38: goto L_0x015f;
                case 43: goto L_0x0149;
                case 50: goto L_0x0180;
                default: goto L_0x0148;
            }
        L_0x0148:
            goto L_0x012d
        L_0x0149:
            X.Ucc r0 = new X.Ucc
            r0.<init>(r12)
            X.Ucl r12 = new X.Ucl
            r12.<init>(r0)
            goto L_0x018e
        L_0x0154:
            X.Ucd r0 = new X.Ucd
            r0.<init>(r12)
            X.Uco r12 = new X.Uco
            r12.<init>(r0)
            goto L_0x018e
        L_0x015f:
            X.Uch r0 = new X.Uch
            r0.<init>(r12)
            X.Ucn r12 = new X.Ucn
            r12.<init>(r0)
            goto L_0x018e
        L_0x016a:
            X.Uci r0 = new X.Uci
            r0.<init>((X.C17732Vd1) r12)
            X.Ucj r12 = new X.Ucj
            r12.<init>(r0)
            goto L_0x018e
        L_0x0175:
            X.Uce r0 = new X.Uce
            r0.<init>(r12)
            X.Uck r12 = new X.Uck
            r12.<init>(r0)
            goto L_0x018e
        L_0x0180:
            X.VY4 r0 = r12.A02
            if (r0 == 0) goto L_0x012d
            X.Ucf r0 = new X.Ucf
            r0.<init>(r12)
            X.Ucm r12 = new X.Ucm
            r12.<init>(r0)
        L_0x018e:
            r1.add(r12)
            goto L_0x012d
        L_0x0192:
            r9 = 0
            goto L_0x00e0
        L_0x0195:
            r20 = 0
            goto L_0x0097
        L_0x0199:
            if (r14 == 0) goto L_0x0218
            int r12 = r1.size()
            r0 = 0
            if (r12 <= 0) goto L_0x01db
            int r12 = r12 + -1
            java.lang.Object r12 = r1.get(r12)
            X.XBs r12 = (X.C21051XBs) r12
        L_0x01aa:
            boolean r13 = r12 instanceof X.C15435Ucl
            if (r13 == 0) goto L_0x01dd
            X.Ucl r12 = (X.C15435Ucl) r12
            X.VRl r0 = r12.A00
            r23 = r0
            java.util.List r0 = r0.A00
            java.util.Iterator r16 = X.DbY.A0o(r0)
        L_0x01ba:
            boolean r13 = r16.hasNext()
            r0 = 0
            if (r13 == 0) goto L_0x01ef
            java.lang.Object r14 = r16.next()
            r15 = r14
            X.XBs r15 = (X.C21051XBs) r15
            boolean r13 = r15 instanceof X.X3U
            if (r13 == 0) goto L_0x01ba
            X.X3U r15 = (X.X3U) r15
            java.util.List r13 = r15.AYc()
            if (r13 == 0) goto L_0x01ba
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x01f0
            goto L_0x01ba
        L_0x01db:
            r12 = r0
            goto L_0x01aa
        L_0x01dd:
            boolean r13 = r12 instanceof X.C21050XBr
            if (r13 == 0) goto L_0x01e8
            java.lang.String r0 = "button"
        L_0x01e3:
            X.WOx r0 = X.C16912VAp.A00(r12, r0)
            goto L_0x020f
        L_0x01e8:
            boolean r13 = r12 instanceof X.C15433Ucj
            if (r13 == 0) goto L_0x020f
            java.lang.String r0 = "image"
            goto L_0x01e3
        L_0x01ef:
            r14 = r0
        L_0x01f0:
            X.XBs r14 = (X.C21051XBs) r14
            if (r14 == 0) goto L_0x020f
            r25 = 0
            X.X3U r14 = (X.X3U) r14
            java.util.List r28 = r14.AYc()
            if (r28 == 0) goto L_0x0769
            java.lang.String r26 = r12.getId()
            X.VMf r12 = r12.A01
            java.lang.String r27 = "slideshow"
            X.WOx r0 = new X.WOx
            r22 = r0
            r24 = r12
            r22.<init>(r23, r24, r25, r26, r27, r28)
        L_0x020f:
            r12 = r29
            r12.A00 = r0
            if (r0 == 0) goto L_0x0218
            r1.add(r0)
        L_0x0218:
            if (r17 == 0) goto L_0x0465
            r0 = r19
            r0.setBackgroundColor(r7)
        L_0x021f:
            if (r9 == 0) goto L_0x02d8
            android.view.View r10 = r3.A01
            r10.setVisibility(r7)
            r0 = 2131433069(0x7f0b166d, float:1.8487913E38)
            android.view.View r1 = X.AnonymousClass7TF.A0F(r10, r0)
            r0 = 2131433072(0x7f0b1670, float:1.848792E38)
            android.view.View r12 = X.AnonymousClass7TF.A0F(r10, r0)
            com.instagram.canvas.view.widget.RichTextView r12 = (com.instagram.canvas.view.widget.RichTextView) r12
            android.content.Context r15 = X.AnonymousClass7TE.A0S(r10)
            X.Uh3 r11 = r4.A01
            X.X1F r0 = r9.A00
            r12.setText(r0)
            X.X1G r0 = r9.A01
            if (r0 == 0) goto L_0x0739
            r12.setTextDescriptor(r0)
            java.util.List r0 = r9.A03
            if (r0 == 0) goto L_0x045f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x045f
            r0 = 67
            X.WBH.A01(r1, r0, r9, r11)
        L_0x0257:
            X.VXq r12 = r9.C25()
            if (r12 == 0) goto L_0x0733
            X.Uca r12 = (X.C15424Uca) r12
            java.util.List r14 = r12.A03
            int r13 = r12.A00
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            int r0 = X.AnonymousClass7TG.A04(r15)
            float r0 = (float) r0
            r4.setCornerRadius(r0)
            X.XR5 r0 = X.XR5.BUTTON_OUTLINE
            boolean r0 = r14.contains(r0)
            if (r0 != r5) goto L_0x045a
            int r0 = X.JTR.A08(r15)
            r4.setStroke(r0, r13)
            r4.setColor(r7)
        L_0x0282:
            android.graphics.RectF r0 = X.0nA.A01
            X.0qQ.A0B(r1, r7)
            r1.setBackground(r4)
            int r0 = r12.A00
            r10.setBackgroundColor(r0)
            if (r20 == 0) goto L_0x02d8
            X.0eM r4 = r3.A05
            android.view.View r0 = X.AnonymousClass7TE.A0c(r4)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            r0 = 329(0x149, float:4.61E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r3, r0)
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r1 = 12
            r0 = 2131442363(0x7f0b3abb, float:1.8506764E38)
            r3.addRule(r1, r0)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.view.View r0 = X.AnonymousClass7TE.A0c(r4)
            X.UBn r1 = new X.UBn
            r1.<init>(r0)
            java.lang.String r0 = "footer"
            X.WOx r4 = X.C16912VAp.A00(r9, r0)
            if (r4 == 0) goto L_0x072d
            r3 = 0
            X.0qQ.A0B(r1, r7)
            android.view.View r1 = r1.A00
            r0 = 14
            X.WB4.A00(r1, r4, r11, r3, r0)
            X.VXq r0 = r4.A01
            if (r0 == 0) goto L_0x02d5
            int r0 = r0.A00
            r1.setBackgroundColor(r0)
        L_0x02d5:
            r10.bringToFront()
        L_0x02d8:
            r29.notifyDataSetChanged()
        L_0x02db:
            java.lang.String r13 = "recyclerView"
            if (r20 == 0) goto L_0x0318
            java.lang.String r11 = "rootView"
            if (r9 == 0) goto L_0x0433
            android.content.Context r10 = r6.A0F
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = r6.A07
            if (r4 == 0) goto L_0x062c
            androidx.recyclerview.widget.RecyclerView r3 = r6.A01
            if (r3 == 0) goto L_0x006a
            java.lang.String r0 = "footer"
            X.WOx r27 = X.C16912VAp.A00(r9, r0)
            X.UB3 r1 = new X.UB3
            r22 = r1
            r23 = r10
            r24 = r4
            r25 = r3
            r26 = r6
            r28 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.A02 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r6.A01
            if (r0 == 0) goto L_0x006a
            r0.A15(r1)
        L_0x030d:
            X.UB3 r1 = r6.A02
            if (r1 == 0) goto L_0x0318
            X.WGq r0 = r6.A0H
            java.util.List r0 = r0.A07
            r0.add(r1)
        L_0x0318:
            r6.A0A = r5
            X.Ugu r9 = r6.A03
            if (r9 == 0) goto L_0x078c
            X.UAS r3 = r6.A0M
            X.Uy2 r10 = X.C16606Uy2.SWIPE_TO_OPEN
            X.VRl r0 = r3.A02
            java.util.List r4 = r0.A00
            int r0 = r4.size()
            r11 = 0
            X.2HY r1 = X.C229632nm.A0C(r7, r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0413
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0413
        L_0x033c:
            int r1 = r3.getItemCount()
            if (r11 == 0) goto L_0x0343
            int r1 = r1 - r5
        L_0x0343:
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0349
            int r1 = r1 + 1
        L_0x0349:
            r9.A00 = r1
            r10 = 0
            int r9 = r3.getItemCount()
        L_0x0350:
            if (r10 >= r9) goto L_0x05cb
            X.6aT r11 = r6.A0K
            java.lang.Object r12 = r4.get(r10)
            X.XBs r12 = (X.C21051XBs) r12
            X.0qQ.A0B(r12, r7)
            X.Uy2 r0 = r12.CAU()
            int r3 = r0.ordinal()
            r5 = 4
            if (r3 == r5) goto L_0x071e
            r1 = 2
            r0 = 3
            if (r3 == r0) goto L_0x03be
            if (r3 == r1) goto L_0x03f8
            r0 = 7
            if (r3 != r0) goto L_0x040f
            X.Ucl r12 = (X.C15435Ucl) r12
            X.VRl r0 = r12.A00
            java.util.List r3 = r0.A00
            int r1 = r3.size()
            int[] r0 = new int[]{r5, r1}
            r0 = r0[r7]
            if (r1 >= r0) goto L_0x0384
            r0 = r1
        L_0x0384:
            X.2HY r0 = X.C229632nm.A0C(r7, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x038c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x040f
            r0 = r5
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            java.lang.Object r1 = r3.get(r0)
            X.XBs r1 = (X.C21051XBs) r1
            r0 = 332(0x14c, float:4.65E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.Ucj r1 = (X.C15433Ucj) r1
            com.instagram.model.mediasize.ImageInfo r1 = r1.A01
            android.content.Context r0 = r11.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A01(r0, r1)
            if (r1 == 0) goto L_0x038c
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x038c
            X.C310126aT.A00(r11, r1)
            goto L_0x038c
        L_0x03be:
            X.Ucm r12 = (X.C15436Ucm) r12
            com.instagram.model.mediasize.ImageInfo r1 = r12.A00
            if (r1 == 0) goto L_0x03e1
            android.content.Context r0 = r11.A00
            com.instagram.model.mediasize.ExtendedImageUrl r5 = X.1iI.A01(r0, r1)
            if (r5 == 0) goto L_0x03e1
            boolean r0 = X.C253833rU.A02(r5)
            if (r0 != 0) goto L_0x03e1
            X.1NK r3 = X.1NK.A00()
            com.instagram.common.session.UserSession r1 = r11.A02
            X.0iw r0 = r11.A01
            java.lang.String r0 = r0.getModuleName()
            r3.A0O(r1, r5, r0)
        L_0x03e1:
            com.instagram.common.session.UserSession r0 = r11.A02
            X.3uP r5 = X.C255593uO.A00(r0)
            X.3WR r3 = r12.A01
            X.0iw r0 = r11.A01
            java.lang.String r1 = r0.getModuleName()
            X.3vO r0 = new X.3vO
            r0.<init>(r3, r1)
            r5.A01(r0)
            goto L_0x040f
        L_0x03f8:
            X.Ucj r12 = (X.C15433Ucj) r12
            com.instagram.model.mediasize.ImageInfo r1 = r12.A01
            if (r1 == 0) goto L_0x040f
            android.content.Context r0 = r11.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A01(r0, r1)
            if (r1 == 0) goto L_0x040f
            boolean r0 = X.C253833rU.A02(r1)
            if (r0 != 0) goto L_0x040f
            X.C310126aT.A00(r11, r1)
        L_0x040f:
            int r10 = r10 + 1
            goto L_0x0350
        L_0x0413:
            java.util.Iterator r1 = r1.iterator()
        L_0x0417:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x033c
            r0 = r1
            X.0sh r0 = (X.0sh) r0
            int r0 = r0.A00()
            java.lang.Object r0 = r4.get(r0)
            X.XBs r0 = (X.C21051XBs) r0
            X.Uy2 r0 = r0.CAU()
            if (r0 != r10) goto L_0x0417
            r11 = 1
            goto L_0x033c
        L_0x0433:
            X.UAS r0 = r6.A0M
            X.WOx r9 = r0.A00
            if (r9 == 0) goto L_0x030d
            android.content.Context r4 = r6.A0F
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r3 = r6.A07
            if (r3 == 0) goto L_0x062c
            androidx.recyclerview.widget.RecyclerView r1 = r6.A01
            if (r1 == 0) goto L_0x006a
            X.UB3 r0 = new X.UB3
            r22 = r0
            r23 = r4
            r24 = r3
            r25 = r1
            r26 = r6
            r27 = r9
            r28 = r7
            r22.<init>(r23, r24, r25, r26, r27, r28)
            r6.A02 = r0
            goto L_0x030d
        L_0x045a:
            r4.setColor(r13)
            goto L_0x0282
        L_0x045f:
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x0257
        L_0x0465:
            java.lang.String r0 = r10.A02
            int r1 = X.C18679Vwc.A00(r0)
            r0 = r19
            r0.setBackgroundColor(r1)
            r17 = 0
            r10 = 0
            X.Uz4 r1 = X.C16668Uz4.HEADER
            X.VZX r0 = r11.A00
            if (r0 == 0) goto L_0x05c7
            X.VNQ r0 = r0.A01
            if (r0 == 0) goto L_0x05c7
            java.util.List r12 = r0.A00
            if (r12 == 0) goto L_0x05c7
            boolean r0 = X.AnonymousClass7TE.A1b(r12)
            if (r0 != r5) goto L_0x05c7
            java.util.Iterator r12 = r12.iterator()
        L_0x048b:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x05c7
            java.lang.Object r0 = r12.next()
            X.VNP r0 = (X.VNP) r0
            X.Vd1 r0 = r0.A00
            if (r0 == 0) goto L_0x0763
            X.Uz4 r0 = r0.A08
            if (r0 != r1) goto L_0x048b
            X.VZX r0 = r11.A00
            if (r0 == 0) goto L_0x075b
            X.VNQ r0 = r0.A01
            if (r0 == 0) goto L_0x0753
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r7)
            X.VNP r0 = (X.VNP) r0
            X.Vd1 r0 = r0.A00
            if (r0 == 0) goto L_0x074b
            X.Ucb r1 = new X.Ucb
            r1.<init>(r0)
            X.Wwc r0 = X.C20644Wwc.A00
            X.AnonymousClass0eN.A01(r0)
            r0 = 13
            X.0t0 r17 = X.C51970G9q.A0o(r1, r0)
            com.instagram.model.mediasize.ImageInfo r10 = r1.A00
            r16 = 1
        L_0x04c7:
            android.view.View r13 = r3.A02
            r13.setVisibility(r7)
            r0 = 329(0x149, float:4.61E-43)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            if (r16 == 0) goto L_0x05b4
            java.lang.Object r0 = r17.getValue()
            X.VXq r0 = (X.C17487VXq) r0
            if (r0 == 0) goto L_0x0745
            int r0 = r0.A00
            int r1 = android.graphics.Color.alpha(r0)
            r0 = 255(0xff, float:3.57E-43)
            if (r1 != r0) goto L_0x05b4
            androidx.recyclerview.widget.RecyclerView r14 = r3.A04
            android.view.ViewGroup$LayoutParams r12 = r14.getLayoutParams()
            X.0qQ.A0C(r12, r15)
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            r1 = 3
            r0 = 2131433821(0x7f0b195d, float:1.8489439E38)
            r12.addRule(r1, r0)
        L_0x04f8:
            r14.setLayoutParams(r12)
            X.VXr r12 = new X.VXr
            r12.<init>(r13)
            X.VZX r0 = r11.A00
            if (r0 == 0) goto L_0x05b2
            X.VNQ r0 = r0.A01
            if (r0 == 0) goto L_0x05b2
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x05b2
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 != r5) goto L_0x05b2
            java.util.Iterator r13 = r1.iterator()
        L_0x0516:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x05b2
            java.lang.Object r0 = r13.next()
            X.VNP r0 = (X.VNP) r0
            X.Uz4 r11 = X.C16668Uz4.VIDEO
            X.Vd1 r1 = r0.A00
            if (r1 == 0) goto L_0x0516
            X.Uz4 r0 = r1.A08
            if (r11 != r0) goto L_0x0516
            X.VY4 r0 = r1.A02
            if (r0 == 0) goto L_0x0516
            boolean r0 = r0.A03
            if (r0 != r5) goto L_0x0516
            r14 = 1
        L_0x0535:
            X.VMg r13 = r4.A03
            X.Uh3 r15 = r4.A01
            r0 = 2
            X.0qQ.A0B(r13, r0)
            r11 = 3
            android.widget.ImageView r1 = r12.A02
            r0 = 16
            X.WB8.A00(r1, r0, r15)
            if (r14 == 0) goto L_0x05ac
            android.widget.ImageView r14 = r12.A01
            r14.setVisibility(r7)
            boolean r1 = r13.A00
            r0 = 2131239949(0x7f08240d, float:1.809622E38)
            if (r1 == 0) goto L_0x0556
            r0 = 2131239950(0x7f08240e, float:1.8096221E38)
        L_0x0556:
            r14.setImageResource(r0)
            r0 = 68
            X.WBH.A01(r14, r0, r15, r12)
            com.instagram.common.session.UserSession r0 = r15.A0O
            X.1Av r1 = X.1Au.A00(r0)
            X.0xa r13 = r1.A01
            java.lang.String r0 = "canvas_show_audio_button_tooltip"
            int r0 = r13.getInt(r0, r7)
            if (r0 >= r11) goto L_0x057e
            X.Ua1 r0 = r15.A0I
            android.view.View r13 = r0.requireView()
            X.Woj r11 = new X.Woj
            r11.<init>(r14, r15, r1)
            r0 = 5000(0x1388, double:2.4703E-320)
            r13.postDelayed(r11, r0)
        L_0x057e:
            if (r16 == 0) goto L_0x021f
            android.view.ViewGroup r0 = r3.A03
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.model.mediasize.ExtendedImageUrl r1 = X.1iI.A01(r0, r10)
            if (r1 == 0) goto L_0x0591
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A03
            r0.setUrl(r1, r6)
        L_0x0591:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r12.A03
            r0.setAdjustViewBounds(r5)
            java.lang.Object r10 = r17.getValue()
            X.VXq r10 = (X.C17487VXq) r10
            if (r10 == 0) goto L_0x073f
            android.view.View r1 = r12.A00
            X.VuF r0 = r10.A01
            X.C18179Vmt.A01(r1, r0)
            int r0 = r10.A00
            r1.setBackgroundColor(r0)
            goto L_0x021f
        L_0x05ac:
            android.widget.ImageView r0 = r12.A01
            X.0nA.A0O(r0)
            goto L_0x057e
        L_0x05b2:
            r14 = 0
            goto L_0x0535
        L_0x05b4:
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            X.0qQ.A0C(r12, r15)
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            r1 = 6
            r0 = 2131435577(0x7f0b2039, float:1.8493E38)
            r12.addRule(r1, r0)
            r14 = r13
            goto L_0x04f8
        L_0x05c7:
            r16 = 0
            goto L_0x04c7
        L_0x05cb:
            X.4gz r3 = r6.A0P
            X.WWU r1 = new X.WWU
            r0 = r31
            r1.<init>(r3, r0)
            r6.A04 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r6.A01
            if (r0 == 0) goto L_0x006a
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r1 = 7
            X.WC9 r0 = new X.WC9
            r0.<init>(r6, r1)
            r3.addOnGlobalLayoutListener(r0)
            X.1Xj r5 = r6.A0Q
            if (r5 == 0) goto L_0x0601
            com.instagram.common.session.UserSession r4 = r6.A0O
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320579917390479(0x8109600003228f, double:3.03261921876957E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x0601
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0794
            X.C267154b3.A01(r0, r4, r5, r6, r7)
        L_0x0601:
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x0626
            X.Uh2 r3 = r8.A03
            if (r3 == 0) goto L_0x0626
            android.view.View r1 = r3.A02
            if (r1 == 0) goto L_0x0626
            r0 = 2131435577(0x7f0b2039, float:1.8493E38)
            androidx.recyclerview.widget.RecyclerView r1 = X.DbT.A0I(r1, r0)
            r3.A04 = r1
            if (r1 == 0) goto L_0x061d
            X.3jg r0 = r3.A0D
            r1.A15(r0)
        L_0x061d:
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04
            if (r1 == 0) goto L_0x0626
            android.view.View$OnTouchListener r0 = r3.A0C
            r1.setOnTouchListener(r0)
        L_0x0626:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r8.A05
            if (r0 != 0) goto L_0x0634
            java.lang.String r11 = "spinnerImageView"
        L_0x062c:
            X.0qQ.A0F(r11)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0634:
            X.JTO.A1X(r0)
            X.SQo r0 = r8.A02
            if (r0 == 0) goto L_0x072c
            android.view.View r0 = r8.mView
            if (r0 == 0) goto L_0x072c
            r1 = r30
            r0 = r31
            java.lang.Object r0 = r1.get(r0)
            X.6L1 r0 = (X.AnonymousClass6L1) r0
            if (r0 == 0) goto L_0x06ea
            X.VZX r0 = r0.A00
            if (r0 == 0) goto L_0x06ea
            X.VVk r0 = r0.A00
        L_0x0651:
            java.lang.String r11 = "trackerHandler"
            if (r0 == 0) goto L_0x0671
            java.lang.String r5 = r0.A00
            if (r5 != 0) goto L_0x065b
            java.lang.String r5 = "CanvasFragment.BASE_URL_NOT_AVAILABLE"
        L_0x065b:
            java.lang.String r4 = r0.A01
            if (r4 != 0) goto L_0x0661
            java.lang.String r4 = "CanvasFragment.LOGGING_TOKEN_NOT_AVAILABLE"
        L_0x0661:
            X.SQo r3 = r8.A02
            if (r3 == 0) goto L_0x062c
            java.lang.String r0 = r0.A02
            X.VjI r1 = new X.VjI
            r1.<init>(r5, r0, r4)
            java.util.Set r0 = r3.A06
            r0.add(r1)
        L_0x0671:
            X.SQo r3 = r8.A02
            if (r3 == 0) goto L_0x062c
            android.view.View r1 = r8.mView
            if (r1 == 0) goto L_0x0726
            r0 = 2131433157(0x7f0b16c5, float:1.8488092E38)
            android.view.ViewGroup r0 = X.DbX.A0I(r1, r0)
            X.0qQ.A0B(r0, r7)
            r3.A01 = r0
            X.0JR r0 = r3.A04
            long r0 = r0.now()
            r3.A00 = r0
            java.util.Set r0 = r3.A06
            java.util.Iterator r4 = r0.iterator()
        L_0x0693:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x072c
            java.lang.Object r2 = r4.next()
            X.VjI r2 = (X.C17980VjI) r2
            java.lang.String r7 = r2.A01
            if (r7 != 0) goto L_0x06a5
            java.lang.String r7 = ""
        L_0x06a5:
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x06d2
            java.lang.String r6 = r2.A02
            java.lang.String r2 = r2.A00
            android.view.ViewGroup r0 = r3.A01
            if (r0 == 0) goto L_0x06c7
            boolean r0 = X.C11377SQo.A02(r3, r2)
            if (r0 != 0) goto L_0x06c7
            com.facebook.secure.securewebview.SecureWebView r5 = X.C11377SQo.A00(r3, r2)
            if (r5 == 0) goto L_0x06c7
            r10 = 0
            java.lang.String r8 = "text/html"
            java.lang.String r9 = "utf-8"
            r5.loadDataWithBaseURL(r6, r7, r8, r9, r10)
        L_0x06c7:
            java.util.Map r1 = r3.A05
            X.VRk r0 = new X.VRk
            r0.<init>(r3)
            r1.put(r2, r0)
            goto L_0x0693
        L_0x06d2:
            java.lang.String r1 = r2.A02
            java.lang.String r2 = r2.A00
            android.view.ViewGroup r0 = r3.A01
            if (r0 == 0) goto L_0x06c7
            boolean r0 = X.C11377SQo.A02(r3, r2)
            if (r0 != 0) goto L_0x06c7
            com.facebook.secure.securewebview.SecureWebView r0 = X.C11377SQo.A00(r3, r2)
            if (r0 == 0) goto L_0x06c7
            r0.loadUrl(r1)
            goto L_0x06c7
        L_0x06ea:
            r0 = 0
            goto L_0x0651
        L_0x06ed:
            java.lang.String r0 = r8.A07
            if (r0 == 0) goto L_0x06ff
            X.0eM r0 = r8.A0H
            X.1E8 r1 = X.DbX.A0d(r0)
            java.lang.String r0 = r8.A07
            X.1Xj r1 = r1.A02(r0)
            goto L_0x0040
        L_0x06ff:
            java.lang.String r0 = r8.A07
            X.WWX r1 = new X.WWX
            r1.<init>(r0)
            goto L_0x0042
        L_0x0708:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x070e:
            java.lang.String r1 = "documentBodyElements"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0716:
            java.lang.String r1 = "document"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x071e:
            java.lang.String r1 = "getPhoto"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0726:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x072c:
            return
        L_0x072d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0733:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0739:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x073f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0745:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x074b:
            java.lang.String r1 = "node"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0753:
            java.lang.String r1 = "documentBodyElements"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x075b:
            java.lang.String r1 = "document"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0763:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0769:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x076f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0775:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x077b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0781:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0787:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x078c:
            X.0qQ.A0F(r21)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0794:
            X.0qQ.A0F(r18)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x079c:
            java.lang.String r2 = "Do not call bindCanvas without making sure Canvas data is ready. Canvas Id: "
            java.lang.String r1 = " || Ad Id: "
            java.lang.String r1 = X.002.A0u(r2, r0, r1, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20194Wms.run():void");
    }
}
