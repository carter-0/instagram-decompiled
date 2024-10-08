package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.textureview.MultiListenerTextureView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Map;

/* renamed from: X.8Wv  reason: invalid class name and case insensitive filesystem */
public final class C357178Wv {
    public final MultiListenerTextureView A00;
    public final AnonymousClass8QA A01;
    public final AnonymousClass8K4 A02;
    public final C3499582p A03;
    public final C3509286x A04;
    public final AnonymousClass8FK A05;
    public final AnonymousClass85O A06;
    public final C353788Jb A07;
    public final Map A08;
    public final AnonymousClass0eK A09;
    public final AnonymousClass4DH A0A;
    public final UserSession A0B;
    public final C3510387i A0C;
    public final AnonymousClass8QN A0D;
    public final AnonymousClass8BA A0E;
    public final AnonymousClass80D A0F;
    public final AnonymousClass8WX A0G;
    public final AnonymousClass80U A0H;
    public final C3510287h A0I;
    public final InteractiveDrawableContainer A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a5, code lost:
        if (X.AnonymousClass8QA.A01(r4) == X.AnonymousClass80M.A00) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0244, code lost:
        if (r6 != null) goto L_0x0246;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C357178Wv r22) {
        /*
            r0 = r22
            X.8WX r1 = r0.A0G
            X.8XA r1 = r1.A00()
            X.8hG r2 = r1.A02
            if (r2 == 0) goto L_0x0010
            r1 = 1
            r2.CLL(r1)
        L_0x0010:
            X.0eK r1 = r0.A09
            java.lang.Object r2 = r1.get()
            X.28D r1 = X.28D.A2T
            if (r2 != r1) goto L_0x0098
            java.util.Map r4 = r0.A08
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0098
            X.82p r1 = r0.A03
            X.82o r5 = r1.A02
            java.util.List r1 = r5.A05()
            java.util.Iterator r3 = r1.iterator()
        L_0x002e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r8 = r3.next()
            X.8nh r8 = (X.C365798nh) r8
            java.lang.String r2 = r8.A02()
            boolean r1 = r4.containsKey(r2)
            if (r1 == 0) goto L_0x002e
            X.8QA r6 = r0.A01
            java.lang.Object r7 = r4.get(r2)
            X.8vh r7 = (X.C370018vh) r7
            r11 = 0
            r9 = 0
            r10 = r9
            X.34S r1 = r6.A03(r7, r8, r9, r10, r11)
            java.lang.Object r2 = r1.A00
            if (r2 == 0) goto L_0x002e
            java.lang.String r1 = r8.A06
            X.8pU r2 = (X.C366678pU) r2
            r6.A0C(r2, r1)
            goto L_0x002e
        L_0x005f:
            X.8QA r1 = r0.A01
            r1.A0A()
            r1.A09()
            X.8pU r2 = r1.A05()
            X.8lx r1 = r2.A02
            if (r1 == 0) goto L_0x03c2
            com.instagram.camera.effect.models.CameraAREffect r3 = r1.A01
        L_0x0071:
            if (r3 == 0) goto L_0x0095
            X.8Jb r2 = r0.A07
            X.84B r1 = X.AnonymousClass84B.DEFAULT
            r2.A01(r1, r3)
            X.8nd r2 = r5.A01()
            X.8nd r1 = X.C365758nd.A04
            if (r2 != r1) goto L_0x0095
            X.8K4 r3 = r0.A02
            android.app.Activity r1 = r3.A0A
            boolean r2 = X.C305756Jk.A00(r1)
            X.8KR r1 = r3.A0N
            X.8m6 r1 = r1.A02
            if (r2 == 0) goto L_0x03b4
            if (r1 == 0) goto L_0x0095
            r1.A00()
        L_0x0095:
            r4.clear()
        L_0x0098:
            X.87h r1 = r0.A0I
            X.8Jc r1 = r1.A00()
            r5 = 0
            r1.A0N(r5)
            X.8QN r1 = r0.A0D
            boolean r2 = r1.A09
            if (r2 == 0) goto L_0x0193
            X.8K4 r4 = r1.A0M
            X.82p r2 = r4.A0I
            X.82o r2 = r2.A02
            X.8nd r3 = r2.A01()
            X.8nd r2 = X.C365758nd.A04
            if (r3 == r2) goto L_0x00c1
            X.80G r2 = r4.A0E
            android.view.View r3 = r2.A05()
            r2 = 8
            r3.setVisibility(r2)
        L_0x00c1:
            X.8LU r4 = r1.A0O
            X.82p r2 = r4.A0k
            X.82o r2 = r2.A02
            X.8nd r3 = r2.A01()
            X.8nd r2 = X.C365758nd.A07
            if (r3 == r2) goto L_0x00da
            X.80G r2 = r4.A04
            android.view.View r3 = r2.A05()
            r2 = 8
            r3.setVisibility(r2)
        L_0x00da:
            X.8M8 r2 = r4.A0x
            X.2eb r2 = r2.A01
            r7 = 8
            r2.A03(r7)
            android.view.View r3 = r1.A0C
            java.lang.Runnable r2 = r1.A0h
            r3.removeCallbacks(r2)
            X.8QA r8 = r1.A0K
            java.util.Map r3 = r8.A0K
            X.82p r2 = r8.A0F
            X.82o r2 = r2.A02
            X.8nh r2 = r2.A00()
            java.lang.String r2 = r2.A06
            X.0qQ.A07(r2)
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x03b1
            java.io.File r10 = new java.io.File
            r10.<init>(r3)
        L_0x010c:
            r6 = 0
            if (r10 == 0) goto L_0x03a3
            boolean r2 = r10.exists()
            if (r2 == 0) goto L_0x03a3
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A03
            if (r2 != 0) goto L_0x014f
            android.app.Activity r3 = r1.A0A
            com.instagram.common.ui.widget.imageview.IgImageView r2 = new com.instagram.common.ui.widget.imageview.IgImageView
            r2.<init>(r3)
            r1.A03 = r2
            X.2eb r7 = r1.A0I
            boolean r2 = r7.A04()
            if (r2 == 0) goto L_0x0130
            android.view.View r3 = r7.A01()
            if (r3 != 0) goto L_0x0132
        L_0x0130:
            android.view.ViewStub r3 = r7.A01
        L_0x0132:
            r3.getClass()
            android.view.ViewParent r9 = r3.getParent()
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            r2 = -1
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r2, r2)
            r9.getClass()
            int r2 = r9.indexOfChild(r3)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r1.A03
            int r2 = r2 + 1
            r9.addView(r3, r2, r7)
        L_0x014f:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = r1.A03
            com.instagram.common.typedurl.SimpleImageUrl r3 = X.C253833rU.A01(r10)
            X.0iw r2 = r1.A0F
            r7.setUrl(r3, r2)
            r7.setVisibility(r5)
        L_0x015d:
            X.2eb r3 = r1.A0I
            boolean r2 = r3.A04()
            if (r2 == 0) goto L_0x016f
            android.view.View r3 = r3.A01()
            if (r3 == 0) goto L_0x016f
            r2 = 4
            r3.setVisibility(r2)
        L_0x016f:
            X.8pU r2 = r8.A05()
            X.8pR r2 = r2.A01
            X.8Od r2 = r2.A01
            r2.getClass()
            X.8Oe r2 = r2.A00
            if (r2 != 0) goto L_0x017f
            r6 = 1
        L_0x017f:
            r1.A08 = r6
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r3 = r1.A0f
            r2 = 1
            r3.A0S = r2
            X.6ST r2 = r1.A05
            if (r2 == 0) goto L_0x0193
            X.8Cs r3 = r1.A04
            X.9Pn r2 = r4.A0B
            if (r2 == 0) goto L_0x0193
            r2.A07(r3)
        L_0x0193:
            X.8QA r4 = r0.A01
            X.4yO r3 = X.AnonymousClass8QA.A01(r4)
            X.9QA r2 = X.AnonymousClass9QA.A00
            r14 = 1
            if (r3 == r2) goto L_0x01a7
            X.4yO r3 = X.AnonymousClass8QA.A01(r4)
            X.80M r2 = X.AnonymousClass80M.A00
            r11 = 0
            if (r3 != r2) goto L_0x01a8
        L_0x01a7:
            r11 = 1
        L_0x01a8:
            boolean r2 = r4.A04
            if (r2 != 0) goto L_0x02b6
            if (r11 == 0) goto L_0x01e2
            com.instagram.common.session.UserSession r6 = r4.A08
            X.8nu r7 = X.C365918nt.A00(r6)
            java.lang.String r9 = "user_cancelled"
            java.lang.String r10 = "User exited post-capture before the media could be displayed."
            X.29E r8 = r7.A04
            long r12 = r7.A03
            r11 = 518917368(0x1eee0cf8, float:2.5204594E-20)
            long r2 = r8.A06(r9, r10, r11, r12)
            r7.A03 = r2
            X.82p r2 = r4.A0F
            X.82o r2 = r2.A02
            X.82Y r3 = r2.A01
            java.lang.String r2 = r3.A0G
            if (r2 == 0) goto L_0x02a5
            X.8nu r4 = X.C365918nt.A00(r6)
            java.lang.String r10 = "User exited post-capture before the draft could be restored."
            X.29E r8 = r4.A04
            long r12 = r4.A00
            r11 = 518925558(0x1eee2cf6, float:2.5217826E-20)
            long r2 = r8.A06(r9, r10, r11, r12)
            r4.A00 = r2
        L_0x01e2:
            java.lang.Runnable r2 = r1.A06
            if (r2 == 0) goto L_0x01ec
            r2.run()
            r2 = 0
            r1.A06 = r2
        L_0x01ec:
            X.8BA r4 = r0.A0E
            X.82p r1 = r0.A03
            X.82o r1 = r1.A02
            X.8nd r1 = r1.A01()
            int r1 = r1.ordinal()
            if (r1 == r5) goto L_0x0298
            if (r1 == r14) goto L_0x028b
            r1 = 0
        L_0x01ff:
            X.8BQ r2 = r4.A17
            r2.A04 = r1
            java.util.ArrayList r1 = r2.A06
            r1.clear()
            X.4DH r1 = r0.A0A
            android.content.Context r4 = r1.getContext()
            if (r4 == 0) goto L_0x027b
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r0.A0J
            java.lang.Class<X.9X8> r2 = X.AnonymousClass9X8.class
            java.util.ArrayList r2 = r1.A0V(r2)
            X.0qQ.A0B(r2, r5)
            java.lang.Object r6 = X.00k.A0J(r2)
            X.9X8 r6 = (X.AnonymousClass9X8) r6
            if (r6 != 0) goto L_0x0246
            X.9R5 r2 = new X.9R5
            r2.<init>()
            java.util.ArrayList r3 = r1.A0T(r2)
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x027f
            java.lang.Object r2 = X.00k.A0J(r3)
            X.B1L r2 = (X.B1L) r2
            if (r2 == 0) goto L_0x027f
            android.graphics.drawable.Drawable r6 = r2.Aco()
            boolean r2 = r6 instanceof X.AnonymousClass9X8
            if (r2 == 0) goto L_0x027f
            X.9X8 r6 = (X.AnonymousClass9X8) r6
            if (r6 == 0) goto L_0x027f
        L_0x0246:
            X.87i r3 = r0.A0C
            boolean r0 = r3.A0B()
            if (r0 != 0) goto L_0x027b
            java.lang.Float r2 = r1.A0R(r6)
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.left
            float r7 = (float) r0
            android.graphics.Rect r0 = r6.getBounds()
            int r0 = r0.top
            float r8 = (float) r0
            if (r2 == 0) goto L_0x027c
            float r9 = r2.floatValue()
        L_0x0266:
            float r10 = r1.A0F(r6)
            float r11 = r1.A0G(r6)
            float r12 = r1.A0H(r6)
            r13 = 15000(0x3a98, float:2.102E-41)
            r5 = 0
            r3.A09(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.setPropertyListener(r6, r3)
        L_0x027b:
            return
        L_0x027c:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0266
        L_0x027f:
            X.87i r1 = r0.A0C
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x027b
            r1.A06()
            return
        L_0x028b:
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r3 = r0.A00
            X.0qQ.A0B(r3, r5)
            r1 = 27
            X.MMT r2 = new X.MMT
            r2.<init>(r3, r1)
            goto L_0x029f
        L_0x0298:
            X.8K4 r1 = r0.A02
            X.9SK r2 = new X.9SK
            r2.<init>(r1)
        L_0x029f:
            X.0t0 r1 = X.AnonymousClass0eN.A01(r2)
            goto L_0x01ff
        L_0x02a5:
            java.lang.Integer r3 = r3.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x01e2
            X.8nu r3 = X.C365918nt.A00(r6)
            java.lang.String r2 = "User exited post-capture before the gallery media could be displayed."
            r3.A02(r9, r2)
            goto L_0x01e2
        L_0x02b6:
            X.82p r2 = r4.A0F
            X.82o r9 = r2.A02
            X.8nd r3 = r9.A01()
            X.8nd r2 = X.C365758nd.A04
            if (r3 == r2) goto L_0x02c8
            X.82Y r2 = r9.A01
            java.lang.String r2 = r2.A0G
            if (r2 == 0) goto L_0x02cb
        L_0x02c8:
            r4.A0A()
        L_0x02cb:
            r4.A09()
            X.8BA r10 = r4.A0B
            X.80D r8 = r10.A18
            X.50v r2 = r8.A1d
            if (r2 == 0) goto L_0x0301
            boolean r2 = r2 instanceof com.instagram.reels.musicpick.model.MusicPickStickerModel
            if (r2 == 0) goto L_0x0301
            X.6if r2 = r10.A1g
            java.lang.Object r6 = r2.get()
            X.8ME r6 = (X.AnonymousClass8ME) r6
            java.lang.Class<X.7w6> r2 = X.C346997w6.class
            android.graphics.drawable.Drawable r3 = X.AnonymousClass8ME.A03(r6, r2)
            if (r3 == 0) goto L_0x02ef
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r6.A1m
            r2.A0S(r3)
        L_0x02ef:
            X.80U r7 = r10.A1M
            X.50v r6 = r8.A1d
            com.instagram.reels.musicpick.model.MusicPickStickerModel r6 = (com.instagram.reels.musicpick.model.MusicPickStickerModel) r6
            X.3uj r3 = r8.A1L
            com.instagram.reels.musicpick.model.MusicPickReelTag r3 = (com.instagram.reels.musicpick.model.MusicPickReelTag) r3
            X.8Ul r2 = new X.8Ul
            r2.<init>(r3, r6)
            r7.E3H(r2)
        L_0x0301:
            X.ACq r2 = r8.A1U
            if (r2 == 0) goto L_0x031a
            X.82o r2 = r10.A14
            X.82Y r2 = r2.A01
            r2.A0J = r14
            X.AnonymousClass8BA.A07(r10)
            X.80U r6 = r10.A1M
            X.ACq r3 = r8.A1U
            X.8Ua r2 = new X.8Ua
            r2.<init>(r3, r14)
            r6.E3H(r2)
        L_0x031a:
            r4.A03 = r14
            if (r11 == 0) goto L_0x0350
            boolean r2 = r4.A02
            if (r2 != 0) goto L_0x0337
            r4.A02 = r14
            com.instagram.common.session.UserSession r2 = r4.A08
            X.8nu r8 = X.C365918nt.A00(r2)
            X.29E r7 = r8.A04
            long r2 = r8.A03
            r6 = 518917368(0x1eee0cf8, float:2.5204594E-20)
            long r2 = r7.A02(r6, r2)
            r8.A03 = r2
        L_0x0337:
            X.82Y r3 = r9.A01
            java.lang.String r2 = r3.A0G
            if (r2 == 0) goto L_0x0383
            com.instagram.common.session.UserSession r2 = r4.A08
            X.8nu r8 = X.C365918nt.A00(r2)
            X.29E r7 = r8.A04
            long r2 = r8.A00
            r6 = 518925558(0x1eee2cf6, float:2.5217826E-20)
            long r2 = r7.A02(r6, r2)
            r8.A00 = r2
        L_0x0350:
            com.instagram.common.session.UserSession r2 = r4.A08
            X.JVm r6 = X.AnonymousClass9PJ.A00(r2)
            X.0JA.A01()
            X.29E r15 = r6.A04
            long r2 = r6.A00
            r4 = 585177486(0x22e1198e, float:6.101343E-18)
            boolean r2 = r15.A0E(r4, r2)
            if (r2 == 0) goto L_0x037e
            long r2 = r6.A00
            r19 = 0
            java.lang.String r4 = "post_capture_media_ready"
            r20 = r19
            r21 = r19
            r22 = r19
            r16 = r4
            r17 = r2
            r15.A0D(r16, r17, r19, r20, r21, r22)
            X.04u r2 = r6.A03
            r2.add(r4)
        L_0x037e:
            X.C59728JVm.A00(r6)
            goto L_0x01e2
        L_0x0383:
            boolean r2 = r4.A01
            if (r2 != 0) goto L_0x0350
            java.lang.Integer r3 = r3.A0D
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            if (r3 != r2) goto L_0x0350
            r4.A01 = r14
            com.instagram.common.session.UserSession r2 = r4.A08
            X.8nu r8 = X.C365918nt.A00(r2)
            X.29E r7 = r8.A04
            long r2 = r8.A02
            r6 = 518925448(0x1eee2c88, float:2.5217648E-20)
            long r2 = r7.A02(r6, r2)
            r8.A02 = r2
            goto L_0x0350
        L_0x03a3:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A03
            if (r2 == 0) goto L_0x015d
            r2.A09()
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r1.A03
            r2.setVisibility(r7)
            goto L_0x015d
        L_0x03b1:
            r10 = 0
            goto L_0x010c
        L_0x03b4:
            if (r1 == 0) goto L_0x0095
            r2 = 0
            r1.A09 = r2
            X.8mC r1 = r1.A0K
            r1.A03 = r2
            r1.A00()
            goto L_0x0095
        L_0x03c2:
            X.8pV r1 = r2.A03
            if (r1 == 0) goto L_0x0095
            com.instagram.camera.effect.models.CameraAREffect r3 = r1.A00
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357178Wv.A00(X.8Wv):void");
    }

    public C357178Wv(MultiListenerTextureView multiListenerTextureView, C3510387i r3, AnonymousClass8QA r4, AnonymousClass8QN r5, AnonymousClass8K4 r6, AnonymousClass8BA r7, C3499582p r8, C3509286x r9, AnonymousClass80D r10, AnonymousClass8FK r11, AnonymousClass8WX r12, AnonymousClass85O r13, C353788Jb r14, AnonymousClass80U r15, C3510287h r16, InteractiveDrawableContainer interactiveDrawableContainer, Map map, AnonymousClass0eK r19) {
        this.A0F = r10;
        this.A0B = r10.A0S;
        r10.A0M.getClass();
        this.A0A = r10.A0M;
        this.A0H = r15;
        this.A03 = r8;
        this.A06 = r13;
        this.A05 = r11;
        this.A04 = r9;
        this.A0G = r12;
        this.A0I = r16;
        this.A0D = r5;
        this.A01 = r4;
        this.A0E = r7;
        this.A02 = r6;
        this.A00 = multiListenerTextureView;
        this.A0J = interactiveDrawableContainer;
        this.A07 = r14;
        this.A0C = r3;
        this.A08 = map;
        this.A09 = r19;
    }
}
