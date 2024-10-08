package X;

public final class MJ0 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ0(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0124, code lost:
        if (r6.A05 != false) goto L_0x0126;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 1: goto L_0x0040;
                case 2: goto L_0x0043;
                case 3: goto L_0x0005;
                case 4: goto L_0x0040;
                case 5: goto L_0x0043;
                case 6: goto L_0x0005;
                case 7: goto L_0x004a;
                case 8: goto L_0x005f;
                case 9: goto L_0x0069;
                case 10: goto L_0x007f;
                case 11: goto L_0x008e;
                case 12: goto L_0x0040;
                case 13: goto L_0x0043;
                case 14: goto L_0x0005;
                case 15: goto L_0x0095;
                case 16: goto L_0x009f;
                case 17: goto L_0x00b8;
                case 18: goto L_0x00d3;
                case 19: goto L_0x00da;
                case 20: goto L_0x00e3;
                case 21: goto L_0x00f1;
                case 22: goto L_0x00fb;
                case 23: goto L_0x0105;
                case 24: goto L_0x0117;
                case 25: goto L_0x018d;
                case 26: goto L_0x0197;
                case 27: goto L_0x01a1;
                case 28: goto L_0x01b2;
                case 29: goto L_0x01c3;
                case 30: goto L_0x01d4;
                case 31: goto L_0x01e5;
                case 32: goto L_0x01f0;
                case 33: goto L_0x0209;
                case 34: goto L_0x000c;
                case 35: goto L_0x0040;
                case 36: goto L_0x0043;
                case 37: goto L_0x0005;
                case 38: goto L_0x0277;
                case 39: goto L_0x0283;
                case 40: goto L_0x0293;
                case 41: goto L_0x02af;
                case 42: goto L_0x02b6;
                case 43: goto L_0x02c1;
                case 44: goto L_0x02cf;
                case 45: goto L_0x02cf;
                case 46: goto L_0x02db;
                case 47: goto L_0x02ed;
                case 48: goto L_0x02f9;
                case 49: goto L_0x030b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.07f r4 = X.DbY.A0I(r0)
        L_0x000b:
            return r4
        L_0x000c:
            java.lang.Object r3 = r8.A01
            X.Ll3 r3 = (X.C64964Ll3) r3
            java.util.List r1 = X.C64964Ll3.A00(r3)
            X.2SQ r0 = X.2SP.A00
            java.lang.Object r2 = X.00k.A0H(r1, r0)
            java.lang.String r2 = (java.lang.String) r2
            r4 = 0
            if (r2 == 0) goto L_0x000b
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r3.A0C
            if (r0 == 0) goto L_0x0028
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r0 = r0.A0E
            r0.setText(r2)
        L_0x0028:
            com.instagram.igds.components.search.IgdsInlineSearchBox r1 = r3.A0C
            if (r1 == 0) goto L_0x0033
            int r0 = r2.length()
            r1.setSelection(r0)
        L_0x0033:
            android.view.View r0 = r3.A06
            if (r0 == 0) goto L_0x000b
            boolean r0 = r0.performClick()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0040:
            java.lang.Object r4 = r8.A01
            return r4
        L_0x0043:
            java.lang.Object r0 = r8.A01
            java.lang.Object r4 = X.DbT.A0r(r0)
            return r4
        L_0x004a:
            java.lang.Object r1 = r8.A01
            X.LO2 r1 = (X.LO2) r1
            boolean r0 = X.LO2.A00(r1)
            if (r0 == 0) goto L_0x018b
            android.app.Activity r0 = r1.A01
            int r0 = X.2db.A00(r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            return r4
        L_0x005f:
            java.lang.Object r1 = r8.A01
            X.5xz r1 = (X.C300835xz) r1
            r0 = 0
            r1.A00(r0)
            goto L_0x02f6
        L_0x0069:
            java.lang.Object r2 = r8.A01
            X.5xz r2 = (X.C300835xz) r2
            r1 = 0
            r0 = 1
            r2.A02(r1, r0, r0)
            r1 = 8
            X.MJ0 r0 = new X.MJ0
            r0.<init>(r2, r1)
            X.3dj r4 = new X.3dj
            r4.<init>(r0)
            return r4
        L_0x007f:
            X.5xz r4 = new X.5xz
            r4.<init>()
            java.lang.Object r0 = r8.A01
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r4.A00(r0)
            return r4
        L_0x008e:
            java.lang.Object r0 = r8.A01
            X.C51969G9p.A1M(r0)
            goto L_0x02f6
        L_0x0095:
            java.lang.Object r1 = r8.A01
            X.5xz r1 = (X.C300835xz) r1
            r0 = 0
            r1.A01(r0)
            goto L_0x02f6
        L_0x009f:
            java.lang.Object r0 = r8.A01
            X.GMs r0 = (X.C52302GMs) r0
            X.3fL r4 = r0.A04
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r3 = r0.A03
            java.lang.String r1 = r3.A09
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r1 = X.DbZ.A07(r1)
            int r0 = r3.A00
            r4.DwQ(r1, r0)
            goto L_0x02f6
        L_0x00b8:
            java.lang.Object r0 = r8.A01
            X.GMs r0 = (X.C52302GMs) r0
            X.3fL r5 = r0.A04
            com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState r4 = r0.A03
            java.lang.String r1 = r4.A09
            r0 = 0
            X.0qQ.A0B(r1, r0)
            long r2 = X.DbZ.A07(r1)
            int r1 = r4.A00
            com.instagram.api.schemas.SocialContextType r0 = r4.A02
            r5.Ddz(r0, r1, r2)
            goto L_0x02f6
        L_0x00d3:
            java.lang.Object r0 = r8.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r4 = r0.A03
            return r4
        L_0x00da:
            java.lang.Object r0 = r8.A01
            X.2Wa r0 = (X.2Wa) r0
            r0.A00()
            goto L_0x02f6
        L_0x00e3:
            java.lang.Object r1 = r8.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.3mS r0 = X.C251033mS.A00(r1)
            X.OGi r4 = new X.OGi
            r4.<init>(r1, r0)
            return r4
        L_0x00f1:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Mov r4 = new X.Mov
            r4.<init>(r0)
            return r4
        L_0x00fb:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.Oax r4 = new X.Oax
            r4.<init>(r0)
            return r4
        L_0x0105:
            java.lang.Object r0 = r8.A01
            X.KJf r0 = (X.C61714KJf) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.L7l r0 = r0.A00
            X.8Kd r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            com.instagram.creation.photo.edit.effectfilter.PhotoFilter r4 = new com.instagram.creation.photo.edit.effectfilter.PhotoFilter
            r4.<init>(r2, r1, r0)
            return r4
        L_0x0117:
            java.lang.Object r6 = r8.A01
            X.Jm9 r6 = (X.C60477Jm9) r6
            X.L00 r2 = r6.A0G
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0126
            boolean r0 = r6.A05
            r1 = 1
            if (r0 == 0) goto L_0x0127
        L_0x0126:
            r1 = 0
        L_0x0127:
            X.KB5 r7 = r2.A00
            X.4mi r0 = r7.A0W
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r0.BQ1()
            r5 = 0
            r0.setVisibility(r5)
            X.MVz r4 = r7.A0R
            r4.requestDisallowInterceptTouchEvent(r5)
            r4.setVisibility(r5)
            if (r1 == 0) goto L_0x016d
            int r3 = r7.A04
            int r2 = r7.A01
            android.view.View r0 = r4.AnC(r3)
            if (r0 == 0) goto L_0x0150
            r4.removeView(r0)
            r4.addView(r0, r2)
            r4.requestLayout()
        L_0x0150:
            java.util.List r1 = r7.A0E
            java.lang.Object r0 = r1.remove(r3)
            r1.add(r2, r0)
            X.JX9.A00(r7, r3, r2)
            android.view.ViewTreeObserver r1 = r4.CEp()
            X.LYr r0 = new X.LYr
            r0.<init>(r7, r2, r5)
            r1.addOnGlobalLayoutListener(r0)
            com.instagram.creation.fragment.AlbumEditFragment r0 = r7.A0U
            r0.A0O()
        L_0x016d:
            android.view.ViewGroup r1 = r6.A0C
            android.view.View r0 = r6.A0B
            r1.removeView(r0)
            r6.A04 = r5
            r6.A06 = r5
            r6.A05 = r5
            X.LYc r0 = r6.A02
            if (r0 == 0) goto L_0x018b
            androidx.recyclerview.widget.RecyclerView r1 = r6.A0E
            X.0qQ.A0B(r1, r5)
            java.util.List r0 = r0.A00
            r0.remove(r1)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x018b:
            r4 = 0
            return r4
        L_0x018d:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LRo r4 = new X.LRo
            r4.<init>(r0)
            return r4
        L_0x0197:
            java.lang.Object r0 = r8.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.LBx r4 = new X.LBx
            r4.<init>(r0)
            return r4
        L_0x01a1:
            java.lang.Object r2 = r8.A01
            X.JaT r2 = (X.C59852JaT) r2
            X.JXR r0 = r2.A00
            X.0sP r1 = r0.A03
            X.8gg r0 = r2.A01
            com.instagram.common.gallery.model.GalleryItem$LocalGalleryMedium r0 = r0.A01
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x01b2:
            java.lang.Object r2 = r8.A01
            X.L3h r2 = (X.C63697L3h) r2
            X.JWs r0 = r2.A00
            X.0sP r1 = r0.A03
            X.LiD r0 = r2.A01
            com.instagram.common.gallery.model.GalleryItem r0 = r0.A01
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x01c3:
            java.lang.Object r2 = r8.A01
            X.L3j r2 = (X.C63699L3j) r2
            X.JWt r0 = r2.A00
            X.0sP r1 = r0.A02
            X.LiE r0 = r2.A01
            com.instagram.common.gallery.model.GalleryItem r0 = r0.A01
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x01d4:
            java.lang.Object r2 = r8.A01
            X.L3i r2 = (X.C63698L3i) r2
            X.JWw r0 = r2.A00
            X.0sP r1 = r0.A01
            X.LiF r0 = r2.A01
            com.instagram.common.gallery.model.GalleryItem r0 = r0.A01
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x01e5:
            java.lang.Object r0 = r8.A01
            X.KKB r0 = (X.KKB) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.1Av r4 = X.1Au.A00(r0)
            return r4
        L_0x01f0:
            java.lang.Object r2 = r8.A01
            X.K9K r2 = (X.K9K) r2
            com.instagram.common.session.UserSession r0 = r2.A05
            X.1Av r1 = X.1Au.A00(r0)
            X.0sn r0 = X.0sn.A00
            r1.A18(r0)
            java.util.List r0 = r2.A0F
            r0.clear()
            X.K9K.A01(r2)
            goto L_0x02f6
        L_0x0209:
            java.lang.Object r6 = r8.A01
            X.Ll3 r6 = (X.C64964Ll3) r6
            com.instagram.common.session.UserSession r0 = r6.A0L
            X.27r r2 = X.27p.A01(r0)
            java.lang.String r7 = r6.A0D
            com.instagram.igds.components.search.IgdsInlineSearchBox r0 = r6.A0C
            if (r0 == 0) goto L_0x0275
            java.lang.String r5 = r0.getSearchString()
        L_0x021d:
            X.0wc r1 = r2.A01
            r0 = 303(0x12f, float:4.25E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            X.4yP r3 = r2.A0J()
            X.283 r2 = r2.A04
            java.lang.String r1 = r2.A0L
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0270
            if (r3 == 0) goto L_0x0270
            if (r1 == 0) goto L_0x0270
            java.lang.String r0 = "GEN_AI_STICKER_BROWSER_PROMPT_RETRY"
            X.JTO.A1Q(r4, r0)
            X.28D r0 = r2.A09
            X.JTS.A14(r0, r4)
            X.JTP.A1F(r4)
            X.JTO.A1S(r4, r1)
            X.AnonymousClass7TH.A0U(r4)
            java.lang.String r1 = r2.A0U
            java.lang.String r0 = "sticker_tray_session_id"
            r4.AAJ(r0, r1)
            java.lang.String r0 = "browse_session_id"
            r4.AAJ(r0, r7)
            X.JTP.A1J(r4, r2)
            X.JTS.A19(r4, r2)
            java.lang.String r0 = "camera_destination"
            r4.A8M(r3, r0)
            X.DbY.A1C(r4)
            java.lang.String r0 = "text_prompt"
            r4.AAJ(r0, r5)
            r4.Cgf()
        L_0x0270:
            X.C64964Ll3.A02(r6)
            goto L_0x02f6
        L_0x0275:
            r5 = 0
            goto L_0x021d
        L_0x0277:
            java.lang.Object r0 = r8.A01
            X.Ll8 r0 = (X.C64969Ll8) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.KBR r4 = new X.KBR
            r4.<init>(r0)
            return r4
        L_0x0283:
            java.lang.Object r0 = r8.A01
            X.K3R r0 = (X.K3R) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.KBc r4 = new X.KBc
            r4.<init>(r0)
            return r4
        L_0x0293:
            java.lang.Object r0 = r8.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x02a8
            r0 = 1109(0x455, float:1.554E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r4 = r1.getString(r0)
            if (r4 == 0) goto L_0x02a8
            return r4
        L_0x02a8:
            java.lang.String r0 = "logging session id required"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x02af:
            java.lang.Object r0 = r8.A01
            X.07f r4 = X.C51971G9r.A0U(r0)
            return r4
        L_0x02b6:
            java.lang.Object r0 = r8.A01
            X.Jh5 r0 = (X.C60186Jh5) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.LGV r4 = X.C63061Kqq.A00(r0)
            return r4
        L_0x02c1:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            com.instagram.common.session.UserSession r1 = r0.A0P
            X.0iw r0 = r0.A0O
            X.8aR r4 = new X.8aR
            r4.<init>(r0, r1)
            return r4
        L_0x02cf:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r0.A0C
            if (r0 == 0) goto L_0x02f6
            r0.callOnClick()
            goto L_0x02f6
        L_0x02db:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            com.instagram.common.session.UserSession r3 = r0.A0P
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323728128224688(0x810c3d00002db0, double:3.034610159977951E-306)
            java.lang.Boolean r4 = X.AnonymousClass7TF.A0R(r2, r3, r0)
            return r4
        L_0x02ed:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            X.8MI r0 = r0.A0R
            r0.D7c()
        L_0x02f6:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x02f9:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            android.app.Activity r1 = r0.A0I
            r0 = 420(0x1a4, float:5.89E-43)
            float r0 = X.0nA.A04(r1, r0)
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        L_0x030b:
            java.lang.Object r0 = r8.A01
            X.Ll4 r0 = (X.C64965Ll4) r0
            android.app.Activity r1 = r0.A0I
            r0 = 240(0xf0, float:3.36E-43)
            float r0 = X.0nA.A04(r1, r0)
            long r0 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MJ0.invoke():java.lang.Object");
    }
}
