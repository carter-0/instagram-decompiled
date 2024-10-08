package X;

/* renamed from: X.6YC  reason: invalid class name */
public abstract class AnonymousClass6YC {
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r3.A0t() != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.view.ViewGroup r7, X.AnonymousClass0iw r8, X.C255773uh r9, X.C250973mM r10, X.AnonymousClass3BQ r11, X.C316956mU r12, X.C317216mu r13) {
        /*
            java.lang.String r0 = "ReelSuggestedHighlightEndCardViewBinder.bindView"
            X.0lp r6 = X.0lq.A00(r0)
            boolean r0 = r10.A0D     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x010c
            com.instagram.model.reels.Reel r3 = r10.A0H     // Catch:{ all -> 0x013f }
            boolean r0 = r3.A0p()     // Catch:{ all -> 0x013f }
            r2 = 0
            if (r0 != 0) goto L_0x001a
            boolean r0 = r3.A0t()     // Catch:{ all -> 0x013f }
            r1 = 0
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            r0 = 0
            X.02V.A07(r1, r0)     // Catch:{ all -> 0x013f }
            int r0 = r12.A00     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0042
            r12.A00 = r2     // Catch:{ all -> 0x013f }
            X.2eb r0 = r12.A0D     // Catch:{ all -> 0x013f }
            android.view.View r1 = r0.A01()     // Catch:{ all -> 0x013f }
            r0 = 0
            r1.setAlpha(r0)     // Catch:{ all -> 0x013f }
            android.view.ViewPropertyAnimator r4 = r1.animate()     // Catch:{ all -> 0x013f }
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r4.setDuration(r0)     // Catch:{ all -> 0x013f }
            android.view.ViewPropertyAnimator r1 = r0.setListener(r12)     // Catch:{ all -> 0x013f }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.alpha(r0)     // Catch:{ all -> 0x013f }
        L_0x0042:
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r12.A07     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0053
            X.3Hq r0 = r3.A0L     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0053
            X.5ln r0 = r0.A00     // Catch:{ all -> 0x013f }
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C320276s7.A00(r0)     // Catch:{ all -> 0x013f }
            r1.setUrl(r0, r8)     // Catch:{ all -> 0x013f }
        L_0x0053:
            android.widget.TextView r1 = r12.A05     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = r3.A0r     // Catch:{ all -> 0x013f }
            r1.setText(r0)     // Catch:{ all -> 0x013f }
        L_0x005c:
            android.view.ViewGroup r5 = r12.A04     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x008d
            if (r7 == 0) goto L_0x008d
            java.lang.String r1 = "ReelSuggestedHighlightEndCardViewBinder"
            android.view.View[] r0 = new android.view.View[]{r7}     // Catch:{ all -> 0x013f }
            X.Vc0 r4 = new X.Vc0     // Catch:{ all -> 0x013f }
            r4.<init>(r5, r1, r0)     // Catch:{ all -> 0x013f }
            r0 = 15
            r4.A02 = r0     // Catch:{ all -> 0x013f }
            r0 = 6
            r4.A00 = r0     // Catch:{ all -> 0x013f }
            android.view.ViewGroup r0 = r12.A04     // Catch:{ all -> 0x013f }
            android.content.Context r1 = r0.getContext()     // Catch:{ all -> 0x013f }
            r0 = 2131099788(0x7f06008c, float:1.781194E38)
            int r0 = r1.getColor(r0)     // Catch:{ all -> 0x013f }
            r4.A03 = r0     // Catch:{ all -> 0x013f }
            X.U1A r1 = new X.U1A     // Catch:{ all -> 0x013f }
            r1.<init>(r4)     // Catch:{ all -> 0x013f }
            android.view.ViewGroup r0 = r12.A04     // Catch:{ all -> 0x013f }
            r0.setBackground(r1)     // Catch:{ all -> 0x013f }
        L_0x008d:
            boolean r0 = r3.A0t()     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x00d3
            android.view.View r0 = r12.A03     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x00d3
            android.view.View r1 = r12.A02     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x00d3
            android.view.View r0 = r12.A01     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x00d3
            com.instagram.common.ui.base.IgTextView r0 = r12.A06     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x00d3
            X.ANx r0 = new X.ANx     // Catch:{ all -> 0x013f }
            r0.<init>(r11, r12)     // Catch:{ all -> 0x013f }
            X.AnonymousClass0fU.A00(r0, r1)     // Catch:{ all -> 0x013f }
            com.instagram.common.session.UserSession r4 = r10.A0G     // Catch:{ all -> 0x013f }
            X.0Tu r3 = X.0Tu.A05     // Catch:{ all -> 0x013f }
            r0 = 36319424571252116(0x81085300041d94, double:3.0318885732194635E-306)
            boolean r0 = X.182.A06(r3, r4, r0)     // Catch:{ all -> 0x013f }
            r3 = 8
            if (r0 == 0) goto L_0x00d6
            com.instagram.common.ui.base.IgTextView r1 = r12.A06     // Catch:{ all -> 0x013f }
            r0 = 2131974654(0x7f1359fe, float:1.9586378E38)
            r1.setText(r0)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A03     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A02     // Catch:{ all -> 0x013f }
            r0.setVisibility(r2)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A01     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
        L_0x00d3:
            r12.A08 = r13     // Catch:{ all -> 0x013f }
            goto L_0x013b
        L_0x00d6:
            X.3mL r1 = r9.A0e     // Catch:{ all -> 0x013f }
            X.3mL r0 = X.C250963mL.SUPERLATIVE_END_SUMMARY     // Catch:{ all -> 0x013f }
            if (r1 != r0) goto L_0x00f4
            com.instagram.common.ui.base.IgTextView r1 = r12.A06     // Catch:{ all -> 0x013f }
            r0 = 2131974654(0x7f1359fe, float:1.9586378E38)
            r1.setText(r0)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A03     // Catch:{ all -> 0x013f }
            r0.setVisibility(r2)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A02     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A01     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
            goto L_0x00d3
        L_0x00f4:
            com.instagram.common.ui.base.IgTextView r1 = r12.A06     // Catch:{ all -> 0x013f }
            r0 = 2131974656(0x7f135a00, float:1.9586382E38)
            r1.setText(r0)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A03     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A02     // Catch:{ all -> 0x013f }
            r0.setVisibility(r3)     // Catch:{ all -> 0x013f }
            android.view.View r0 = r12.A01     // Catch:{ all -> 0x013f }
            r0.setVisibility(r2)     // Catch:{ all -> 0x013f }
            goto L_0x00d3
        L_0x010c:
            int r0 = r12.A00     // Catch:{ all -> 0x013f }
            r2 = 8
            if (r0 == r2) goto L_0x0134
            X.2eb r1 = r12.A0D     // Catch:{ all -> 0x013f }
            android.view.View r0 = r1.A00     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x0134
            r12.A00 = r2     // Catch:{ all -> 0x013f }
            android.view.View r0 = r1.A01()     // Catch:{ all -> 0x013f }
            android.view.ViewPropertyAnimator r2 = r0.animate()     // Catch:{ all -> 0x013f }
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)     // Catch:{ all -> 0x013f }
            android.view.ViewPropertyAnimator r1 = r0.setListener(r12)     // Catch:{ all -> 0x013f }
            r0 = 0
            android.view.ViewPropertyAnimator r0 = r1.alpha(r0)     // Catch:{ all -> 0x013f }
            r0.start()     // Catch:{ all -> 0x013f }
        L_0x0134:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r12.A07     // Catch:{ all -> 0x013f }
            if (r0 == 0) goto L_0x013b
            r0.A09()     // Catch:{ all -> 0x013f }
        L_0x013b:
            r6.close()
            return
        L_0x013f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0144 }
            throw r1
        L_0x0144:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YC.A00(android.view.ViewGroup, X.0iw, X.3uh, X.3mM, X.3BQ, X.6mU, X.6mu):void");
    }
}
