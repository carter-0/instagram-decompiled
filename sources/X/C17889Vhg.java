package X;

import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;

/* renamed from: X.Vhg  reason: case insensitive filesystem */
public final class C17889Vhg {
    public C63671L2h A00;
    public U4R A01;
    public final SlideContentLayout A02;
    public final C19833WgE A03 = new C19833WgE(this);
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0215, code lost:
        if (r10 != r14) goto L_0x019b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass0iw r18, X.C17650Vbg r19) {
        /*
            r17 = this;
            r5 = 1
            r7 = r19
            X.Uva r4 = r7.A03
            boolean r0 = r4 instanceof X.C16377Utu
            r6 = r17
            if (r0 != 0) goto L_0x000f
            boolean r0 = r4 instanceof X.C16378Utv
            if (r0 == 0) goto L_0x0062
        L_0x000f:
            boolean r0 = r4 instanceof X.C16379Utw
            if (r0 != 0) goto L_0x0024
            boolean r0 = r4 instanceof X.C16378Utv
            if (r0 != 0) goto L_0x0024
            X.U4R r1 = r6.A01
            if (r1 == 0) goto L_0x0024
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r0 = r6.A02
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            r1.A00(r0)
        L_0x0024:
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r8 = r6.A02
            int r0 = r8.getVisibility()
            if (r0 == 0) goto L_0x0062
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r1 = 0
            r0.height = r1
            r8.setLayoutParams(r0)
            r8.setVisibility(r1)
            int r0 = r8.getChildCount()
            if (r0 == 0) goto L_0x0062
            android.view.View r0 = r8.getChildAt(r1)
            int r2 = com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A00(r0, r8)
            X.2cp r0 = r8.A00
            X.2cs r3 = r0.A02()
            r0 = 0
            r3.A08(r0, r5)
            float r2 = (float) r2
            r1 = 0
            X.UtD r0 = new X.UtD
            r0.<init>(r8, r8, r1, r2)
            r3.A0A(r0)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r3, r8, r5)
            r3.A03()
        L_0x0062:
            boolean r0 = r4 instanceof X.C16379Utw
            if (r0 != 0) goto L_0x006a
            boolean r0 = r4 instanceof X.C16378Utv
            if (r0 == 0) goto L_0x00ca
        L_0x006a:
            X.Uw8 r1 = r7.A02
            boolean r0 = r1 instanceof X.C16374Utr
            if (r0 == 0) goto L_0x021d
            java.lang.String r3 = r7.A05
            if (r3 == 0) goto L_0x00ca
            X.U4R r1 = r6.A01
            if (r1 == 0) goto L_0x007b
            r0 = 0
            r1.A00 = r0
        L_0x007b:
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r12 = r6.A02
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r12)
            X.U4R r1 = new X.U4R
            r1.<init>(r2)
            boolean r0 = r6.A04
            r1.setCloseButtonVisibility(r0)
            X.WgE r0 = r6.A03
            r1.A00 = r0
            r6.A01 = r1
            java.lang.Integer r0 = r7.A04
            int r0 = r0.intValue()
            if (r0 != r5) goto L_0x0218
            com.instagram.common.typedurl.ImageUrl r0 = r7.A00
            if (r0 == 0) goto L_0x00ab
            r8 = r18
            r1.setAvatar(r0, r8)
            X.U4R r1 = r6.A01
            if (r1 == 0) goto L_0x00ab
            java.lang.String r0 = r7.A06
            r1.setQuestionBodyWithUser(r3, r0)
        L_0x00ab:
            X.U4R r13 = r6.A01
            if (r13 == 0) goto L_0x00ca
            r13.A00(r2)
            r0 = 4
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r12, r0)
            r0 = 2
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r12, r0)
            int r0 = r12.getVisibility()
            r11 = 3
            if (r0 == 0) goto L_0x015c
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r12, r11)
            r12.removeAllViews()
            r12.addView(r13)
        L_0x00ca:
            boolean r0 = r4 instanceof X.C16375Uts
            if (r0 == 0) goto L_0x00f2
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r7 = r6.A02
            X.2cp r0 = r7.A00
            X.2cs r3 = r0.A02()
            r0 = 0
            r3.A08(r0, r5)
            r3.A06 = r5
            int r0 = r7.getHeight()
            float r2 = (float) r0
            r1 = 0
            X.UtC r0 = new X.UtC
            r0.<init>(r7, r7, r2, r1)
            r3.A0A(r0)
            r0 = 2
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r3, r7, r0)
            r3.A03()
        L_0x00f2:
            boolean r0 = r4 instanceof X.C16376Utt
            if (r0 == 0) goto L_0x0101
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout r7 = r6.A02
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x0102
            r7.removeAllViews()
        L_0x0101:
            return
        L_0x0102:
            int r2 = r7.getChildCount()
            r1 = 0
            if (r2 == r5) goto L_0x0114
            r0 = 2
            if (r2 != r0) goto L_0x0101
            r0 = 4
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r7, r0)
            r0 = 3
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r7, r0)
        L_0x0114:
            android.view.View r9 = r7.getChildAt(r1)
            X.2cp r8 = r7.A00
            X.2cs r2 = r8.A02()
            r3 = 0
            r2.A08(r3, r5)
            int r0 = r7.getWidth()
            int r0 = -r0
            float r1 = (float) r0
            r0 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r0
            r6 = 0
            X.UtE r0 = new X.UtE
            r0.<init>(r9, r7, r6, r1)
            r2.A0A(r0)
            r0 = 4
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r2, r7, r0)
            r2.A03()
            X.2cs r2 = r8.A02()
            r2.A08(r3, r5)
            r2.A06 = r5
            int r0 = r7.getHeight()
            float r1 = (float) r0
            X.UtC r0 = new X.UtC
            r0.<init>(r7, r7, r1, r6)
            r2.A0A(r0)
            r0 = 2
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r2, r7, r0)
            r2.A06 = r5
            r2.A03()
            return
        L_0x015c:
            int r1 = r12.getChildCount()
            r0 = 0
            if (r1 != 0) goto L_0x01b4
            r12.setVisibility(r0)
            int r0 = r12.getWidth()
            float r0 = (float) r0
            r13.setTranslationX(r0)
            r12.addView(r13)
            int r10 = com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A00(r13, r12)
            X.2cp r0 = r12.A00
            r16 = r0
            X.2cs r8 = r16.A02()
            r2 = 0
            r8.A08(r2, r5)
            int r0 = r12.getWidth()
            float r7 = (float) r0
            r0 = 1067450368(0x3fa00000, float:1.25)
            float r7 = r7 * r0
            r1 = 0
            X.UtF r0 = new X.UtF
            r0.<init>(r13, r12, r7, r1)
            r8.A0A(r0)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r8, r12, r11)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8.A03()
        L_0x019b:
            X.2cs r8 = r16.A02()
            r8.A08(r2, r5)
            float r7 = (float) r10
            r3 = 0
            X.UtD r2 = new X.UtD
            r2.<init>(r12, r12, r3, r7)
            r8.A0A(r2)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r8, r12, r5)
            r8.A06(r0)
            goto L_0x00ca
        L_0x01b4:
            if (r1 == r5) goto L_0x01b9
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A02(r12, r11)
        L_0x01b9:
            android.view.View r1 = r12.getChildAt(r0)
            int r0 = r12.getWidth()
            float r0 = (float) r0
            r13.setTranslationX(r0)
            r12.addView(r13)
            int r14 = r1.getHeight()
            int r10 = com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A00(r13, r12)
            X.2cp r0 = r12.A00
            r16 = r0
            X.2cs r7 = r16.A02()
            r2 = 0
            r7.A08(r2, r5)
            int r0 = r12.getWidth()
            int r0 = -r0
            float r8 = (float) r0
            r0 = 1071644672(0x3fe00000, float:1.75)
            float r8 = r8 * r0
            r15 = 0
            X.UtE r0 = new X.UtE
            r0.<init>(r1, r12, r15, r8)
            r7.A0A(r0)
            r0 = 4
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r7, r12, r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r7.A03()
            X.2cs r9 = r16.A02()
            r9.A08(r2, r5)
            int r7 = r12.getWidth()
            float r8 = (float) r7
            r7 = 1067450368(0x3fa00000, float:1.25)
            float r8 = r8 * r7
            X.UtF r7 = new X.UtF
            r7.<init>(r13, r12, r8, r15)
            r9.A0A(r7)
            com.instagram.ui.widget.slidecontentlayout.SlideContentLayout.A01(r9, r12, r11)
            r9.A03()
            if (r10 == r14) goto L_0x00ca
            goto L_0x019b
        L_0x0218:
            r1.setQuestionBody(r3)
            goto L_0x00ab
        L_0x021d:
            boolean r0 = r1 instanceof X.C16373Utq
            if (r0 == 0) goto L_0x00ca
            X.U4R r0 = r6.A01
            if (r0 == 0) goto L_0x00ca
            X.3NM r0 = r0.A01
            r0.A00 = r5
            r0.A01()
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17889Vhg.A00(X.0iw, X.Vbg):void");
    }

    public C17889Vhg(SlideContentLayout slideContentLayout, boolean z) {
        this.A02 = slideContentLayout;
        this.A04 = z;
    }
}
