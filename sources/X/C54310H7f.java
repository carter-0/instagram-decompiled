package X;

/* renamed from: X.H7f  reason: case insensitive filesystem */
public final class C54310H7f extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;

    public C54310H7f(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f2, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x019a, code lost:
        X.C51965G9l.A1W(r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dqe(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x01a1;
                case 1: goto L_0x0194;
                case 2: goto L_0x0102;
                case 3: goto L_0x00de;
                case 4: goto L_0x00c0;
                case 5: goto L_0x00b5;
                case 6: goto L_0x007a;
                case 7: goto L_0x0048;
                case 8: goto L_0x002d;
                case 9: goto L_0x0021;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r3 = r10.A01
            X.GwT r3 = (X.C53923GwT) r3
            com.instagram.clips.intf.ClipsViewerConfig r1 = r3.A02
            X.4bN r0 = r3.A03
            boolean r0 = X.AnonymousClass3ZC.A07(r1, r0)
            if (r0 == 0) goto L_0x019f
            com.instagram.user.model.User r2 = r3.A08
            r1 = 0
            java.lang.String r0 = "center_profile_icon"
            X.C53923GwT.A04(r11, r2, r3, r0, r1)
        L_0x001f:
            r2 = 1
        L_0x0020:
            return r2
        L_0x0021:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
            X.JwL r0 = (X.C61083JwL) r0
            java.lang.Object r0 = r0.A00
            goto L_0x019a
        L_0x002d:
            java.lang.Object r1 = r10.A01
            X.H1B r1 = (X.H1B) r1
            X.1Xj r5 = r1.A01
            if (r5 == 0) goto L_0x001f
            X.0eM r0 = r1.A06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            X.28D r2 = X.28D.A1X
            r3 = 0
            r7 = 1
            r6 = r3
            X.C55274Hf3.A00(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x001f
        L_0x0048:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            X.GOp r1 = X.C52345GOp.A00
            java.lang.Object r2 = r10.A01
            X.H1D r2 = (X.H1D) r2
            X.0eM r0 = r2.A0G
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.1Xj r7 = r2.A06
            if (r7 != 0) goto L_0x0060
            java.lang.String r0 = "media"
            goto L_0x00f2
        L_0x0060:
            X.9cM r0 = r2.A03
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "arguments"
            goto L_0x00f2
        L_0x0068:
            int r0 = r0.A01
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r9 = 0
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.28D r4 = X.28D.A1O
            r5 = r2
            r1.A0I(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x001f
        L_0x007a:
            java.lang.Object r4 = r10.A01
            X.H1E r4 = (X.H1E) r4
            X.0eM r3 = r4.A0I
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r8 = 0
            X.0qQ.A0B(r2, r8)
            java.lang.String r1 = "horizon_worlds_cross_screen_tap"
            r0 = 0
            X.AnonymousClass9PQ.A08(r4, r2, r1, r0, r0)
            androidx.fragment.app.FragmentActivity r4 = r4.requireActivity()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            X.0lg r3 = X.DbT.A0X(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36882902805447124(0x8308ce000101d4, double:3.388234477469117E-306)
            java.lang.String r7 = X.182.A04(r2, r3, r0)
            X.2EG r6 = X.2EG.A1V
            X.SUL r3 = new X.SUL
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = "horizon_worlds_pivot_page"
            r3.A0S = r0
            r3.A0A()
            goto L_0x001f
        L_0x00b5:
            java.lang.Object r0 = r10.A01
            X.IO9 r0 = (X.IO9) r0
            X.Htl r0 = r0.A0Y
            r0.A02()
            goto L_0x001f
        L_0x00c0:
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r3 = r10.A01
            X.GCd r3 = (X.C52031GCd) r3
            android.app.Activity r0 = r3.A06
            X.37D r2 = r1.A01(r0)
            if (r2 == 0) goto L_0x001f
            r0 = 4
            X.IZz r1 = new X.IZz
            r1.<init>(r3, r0)
            r0 = r2
            X.37F r0 = (X.AnonymousClass37F) r0
            r0.A0H = r1
            r2.A0B()
            goto L_0x001f
        L_0x00de:
            java.lang.Object r2 = r10.A01
            X.H1C r2 = (X.H1C) r2
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A0E
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.reels.prompt.model.PromptStickerModel r6 = r2.A06
            if (r6 != 0) goto L_0x00fa
            java.lang.String r0 = "promptStickerModel"
        L_0x00f2:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00fa:
            X.28D r3 = X.28D.A0m
            r5 = 0
            X.I3M.A02(r1, r2, r3, r4, r5, r6)
            goto L_0x001f
        L_0x0102:
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.lang.Object r3 = r10.A01
            X.GMF r3 = (X.GMF) r3
            android.view.View$OnClickListener r0 = r3.A01
            if (r0 == 0) goto L_0x0020
            java.util.Set r1 = r3.A0N
            java.lang.String r0 = r3.A0A
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 != 0) goto L_0x0020
            android.view.View$OnClickListener r0 = r3.A01
            if (r0 == 0) goto L_0x011f
            r0.onClick(r11)
        L_0x011f:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.GMF.A01(r3, r0)
            java.lang.String r8 = r3.A0A
            if (r8 == 0) goto L_0x001f
            r1.add(r8)
            com.instagram.common.session.UserSession r0 = r3.A0I
            X.4nx r4 = X.AnonymousClass50b.A00(r0)
            java.lang.String r7 = r3.A0M
            java.lang.String r6 = r3.A0K
            X.0iw r2 = r3.A0H
            java.lang.String r1 = r3.A0L
            java.lang.Integer r5 = r3.A0J
            java.lang.Integer r3 = r3.A09
            java.lang.String r0 = "direct_feed_reshare_chaining"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r2.getModuleName()
        L_0x0149:
            X.0xG r1 = X.DbS.A0O(r0)
            r0 = 663(0x297, float:9.29E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xI r2 = X.0xI.A00(r1, r0)
            java.lang.String r0 = "media_id"
            r2.A0C(r0, r8)
            r1 = 0
            java.lang.String r0 = "direct_reshare_hub_session_id"
            r2.A0C(r0, r1)
            java.lang.String r1 = "send_type"
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r2.A0C(r1, r0)
            java.lang.String r0 = "thread_id"
            r2.A0C(r0, r7)
            java.lang.String r0 = "chaining_session_id"
            r2.A0C(r0, r6)
            java.lang.String r0 = "direct_reshare_hub_media_position"
            r2.A08(r5, r0)
            java.lang.String r0 = "m_t"
            if (r3 == 0) goto L_0x0183
            r2.A08(r3, r0)
        L_0x0183:
            java.lang.String r0 = "media_type"
            if (r3 == 0) goto L_0x018a
            r2.A08(r3, r0)
        L_0x018a:
            com.instagram.common.session.UserSession r0 = r4.A00
            X.DbU.A1R(r2, r0)
            goto L_0x001f
        L_0x0191:
            java.lang.String r0 = "direct_thread_reshare_hub_feed"
            goto L_0x0149
        L_0x0194:
            r0 = 0
            X.0qQ.A0B(r11, r0)
            java.lang.Object r0 = r10.A01
        L_0x019a:
            X.C51965G9l.A1W(r0, r11)
            goto L_0x001f
        L_0x019f:
            r2 = 0
            return r2
        L_0x01a1:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r0.performClick()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54310H7f.Dqe(android.view.View):boolean");
    }
}
