package X;

import android.content.res.Resources;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

public final class PB6 implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C3256673q A02;
    public final AnonymousClass7X0 A03;
    public final C71027OZe A04;
    public final AnonymousClass7ZF A05;
    public final AnonymousClass7DZ A06;
    public final AnonymousClass7DY A07;
    public final boolean A08;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (X.C71050OaS.A03(r9) == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A04(android.view.View r7, X.C252063oV r8, X.C68821NYf r9, int r10) {
        /*
            r6 = this;
            r5 = 0
            r0 = 2
            if (r10 != r0) goto L_0x000b
            boolean r0 = X.C71050OaS.A03(r9)
            r4 = 1
            if (r0 != 0) goto L_0x000c
        L_0x000b:
            r4 = 0
        L_0x000c:
            com.instagram.common.session.UserSession r0 = r6.A01
            boolean r1 = X.C70867OPg.A01(r0)
            if (r1 == 0) goto L_0x001d
            if (r4 != 0) goto L_0x001d
            boolean r0 = r8.CVM()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            android.view.View r3 = r8.getView()
            if (r1 != 0) goto L_0x002d
            r0 = 2131431670(0x7f0b10f6, float:1.8485076E38)
            android.view.View r0 = r7.requireViewById(r0)
            X.2b1.A01(r0, r5, r5)
        L_0x002d:
            android.content.res.Resources r2 = r3.getResources()
            boolean r1 = r6.A08
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            if (r1 == 0) goto L_0x003b
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
        L_0x003b:
            int r0 = r2.getDimensionPixelSize(r0)
            X.C66580MXl.A1C(r3, r0)
            X.C66580MXl.A1B(r3, r0)
            if (r4 != 0) goto L_0x0049
            r5 = 8
        L_0x0049:
            r3.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB6.A04(android.view.View, X.3oV, X.NYf, int):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.direct_multi_media_message_legacy_layout;
        if (A012) {
            i = R.layout.direct_multi_media_message;
        }
        C72573PBe pBe = new C72573PBe(DbU.A0A(layoutInflater, viewGroup, i, false), userSession);
        this.A06.A00(pBe);
        return pBe;
    }

    private final Size A00(View view, boolean z) {
        boolean z2 = this.A08;
        Resources resources = view.getResources();
        int i = R.dimen.direct_multi_media_message_fixed_height;
        if (z2) {
            i = R.dimen.audio_dubbing_gen_ai_gif_size;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        int i2 = (int) (((float) dimensionPixelSize) * 0.75f);
        if (z) {
            dimensionPixelSize = (int) (((float) i2) * 0.75f);
        }
        Size size = new Size(i2, dimensionPixelSize);
        view.getLayoutParams().height = size.getHeight();
        view.getLayoutParams().width = size.getWidth();
        return size;
    }

    private final AnonymousClass77D A01(IgImageView igImageView) {
        C242553Us r3 = new C242553Us();
        Resources resources = igImageView.getResources();
        boolean z = this.A08;
        int i = R.dimen.ab_test_media_thumbnail_preview_item_internal_padding;
        if (z) {
            i = R.dimen.abc_edit_text_inset_top_material;
        }
        float A012 = AnonymousClass7TE.A01(resources, i);
        r3.A07(A012, A012, A012, A012);
        return C3265577g.A04(r3, igImageView);
    }

    private final void A02(View view, IgFrameLayout igFrameLayout, IgImageView igImageView, C252063oV r23, C252063oV r24, C252063oV r25, C72573PBe pBe, C328687Ft r27, int i, int i2) {
        C328687Ft r10 = r27;
        List list = r10.A04;
        int i3 = i;
        C68821NYf nYf = (C68821NYf) list.get(i3);
        boolean A062 = A06(nYf);
        IgFrameLayout igFrameLayout2 = igFrameLayout;
        A04(igFrameLayout2, r23, nYf, r10.A00);
        Size A002 = A00(igFrameLayout2, A062);
        float f = (float) i2;
        float f2 = 0.65f;
        if (A062) {
            f2 = 0.8f;
        }
        0nA.A0e(igFrameLayout2, (int) (f * f2));
        if (i == 0 || i3 == 2) {
            0nA.A0d(igFrameLayout2, (int) (((float) igFrameLayout2.getLayoutParams().width) * 0.35f));
        }
        float f3 = -4.0f;
        if (i % 2 == 0) {
            f3 = 4.0f;
        }
        igFrameLayout2.setRotation(f3);
        AnonymousClass7FE r4 = C68821NYf.A01(list, 0).A0C;
        IgImageView igImageView2 = igImageView;
        AnonymousClass77D A012 = A01(igImageView2);
        0t0 A003 = C73916Plr.A00(igImageView2, r4, 44);
        AnonymousClass0iw r13 = this.A00;
        UserSession userSession = this.A01;
        C71050OaS.A01(A002, r13, userSession, igImageView2, A012, nYf, this.A03.ArY());
        C71050OaS.A02(view, userSession, igImageView2, A012, r24, nYf, r10, A003, C71050OaS.A03(nYf));
        IgImageView igImageView3 = igImageView2;
        this.A04.A02(igImageView3, C3265577g.A04((C242553Us) A003.getValue(), igImageView2), r25, C70043NwL.A00(userSession, nYf), pBe, A003);
        igFrameLayout2.setVisibility(0);
    }

    private final void A03(View view, IgFrameLayout igFrameLayout, IgImageView igImageView, C252063oV r24, C252063oV r25, C252063oV r26, C72573PBe pBe, C328687Ft r28, int i, int i2) {
        C328687Ft r11 = r28;
        List list = r11.A04;
        int i3 = i;
        C68821NYf nYf = (C68821NYf) list.get(i3);
        boolean A062 = A06(nYf);
        IgFrameLayout igFrameLayout2 = igFrameLayout;
        A04(igFrameLayout2, r24, nYf, r11.A00);
        Size A002 = A00(igFrameLayout2, A062);
        float f = (float) i2;
        float f2 = 0.75f;
        if (A062) {
            f2 = 0.8f;
        }
        0nA.A0e(igFrameLayout2, (int) (f * f2));
        if (i3 == 1) {
            0nA.A0d(igFrameLayout2, (int) (((float) igFrameLayout2.getLayoutParams().width) * 0.35f));
        }
        float f3 = 4.0f;
        if (i % 2 == 0) {
            f3 = -4.0f;
        }
        igFrameLayout2.setRotation(f3);
        AnonymousClass7FE r3 = C68821NYf.A01(list, 0).A0C;
        IgImageView igImageView2 = igImageView;
        AnonymousClass77D A012 = A01(igImageView2);
        0t0 A003 = C73916Plr.A00(igImageView2, r3, 45);
        AnonymousClass0iw r14 = this.A00;
        UserSession userSession = this.A01;
        C71050OaS.A01(A002, r14, userSession, igImageView2, A012, nYf, this.A03.ArY());
        C71050OaS.A02(view, userSession, igImageView2, A012, r25, nYf, r11, A003, C71050OaS.A03(nYf));
        IgImageView igImageView3 = igImageView2;
        this.A04.A02(igImageView3, C3265577g.A04((C242553Us) A003.getValue(), igImageView2), r26, C70043NwL.A00(userSession, nYf), pBe, A003);
        igFrameLayout2.setVisibility(0);
    }

    public static final boolean A06(C68821NYf nYf) {
        C300925yB r0;
        Float f;
        float floatValue;
        AnonymousClass777 r3 = nYf.A02.A0F;
        AnonymousClass77B r02 = nYf.A01;
        if (r02 != null) {
            r0 = r02.A0F;
        } else {
            r0 = null;
        }
        if (r0 != null) {
            floatValue = r0.A01();
        } else if (!(r3 instanceof AnonymousClass776) || (f = ((AnonymousClass776) r3).A02) == null) {
            return false;
        } else {
            floatValue = f.floatValue();
        }
        if (floatValue > 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ca, code lost:
        if (java.lang.Boolean.valueOf(r13) == null) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r31, X.AnonymousClass7FW r32) {
        /*
            r30 = this;
            r4 = r32
            r1 = r31
            X.PBe r1 = (X.C72573PBe) r1
            X.7Ft r4 = (X.C328687Ft) r4
            r3 = 0
            boolean r16 = X.AnonymousClass7TF.A1U(r3, r1, r4)
            r0 = r30
            X.7X0 r10 = r0.A03
            r6 = r10
            X.7TJ r6 = (X.AnonymousClass7TJ) r6
            com.instagram.model.direct.messageid.DirectMessageIdentifier r13 = r4.A02
            java.lang.String r5 = r13.A00
            if (r5 != 0) goto L_0x001c
            java.lang.String r5 = ""
        L_0x001c:
            boolean r2 = r4.CU2()
            r6.CjC(r5, r2)
            X.74v r7 = r4.A01
            if (r7 == 0) goto L_0x0049
            X.7DY r6 = r0.A07
            if (r6 == 0) goto L_0x003a
            X.0eM r2 = r1.A06
            java.lang.Object r5 = r2.getValue()
            java.util.List r2 = r4.A04
            X.7Fr r2 = X.C68821NYf.A01(r2, r3)
            r6.Cy2(r5, r2)
        L_0x003a:
            X.73q r5 = r0.A02
            if (r5 == 0) goto L_0x0049
            X.0eM r2 = r1.A06
            java.lang.Object r2 = r2.getValue()
            X.73s r2 = (X.C3256873s) r2
            r5.bind(r2, r7)
        L_0x0049:
            X.OHo r6 = r1.A03
            com.instagram.common.ui.base.IgFrameLayout r2 = r6.A00
            X.0eM r5 = r6.A06
            r17 = r5
            com.instagram.common.ui.widget.imageview.IgImageView r5 = X.C66580MXl.A0R(r17)
            A05(r2, r5)
            X.OHo r7 = r1.A04
            com.instagram.common.ui.base.IgFrameLayout r5 = r7.A00
            X.0eM r8 = r7.A06
            r29 = r8
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.C66580MXl.A0R(r29)
            A05(r5, r8)
            X.OHo r9 = r1.A05
            com.instagram.common.ui.base.IgFrameLayout r8 = r9.A00
            X.0eM r11 = r9.A06
            r28 = r11
            com.instagram.common.ui.widget.imageview.IgImageView r11 = X.C66580MXl.A0R(r28)
            A05(r8, r11)
            boolean r15 = r0.A08
            com.instagram.common.ui.base.IgFrameLayout r12 = r1.A01
            android.content.res.Resources r14 = r12.getResources()
            r11 = 2131165184(0x7f070000, float:1.7944578E38)
            if (r15 == 0) goto L_0x0085
            r11 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x0085:
            float r11 = X.AnonymousClass7TE.A01(r14, r11)
            X.Gdl r15 = new X.Gdl
            r15.<init>(r11)
            int r11 = X.AnonymousClass7TE.A0H(r14)
            float r14 = (float) r11
            r11 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 + r14
            X.0qQ.A0B(r2, r3)
            r2.setElevation(r11)
            r2.setOutlineProvider(r15)
            r11 = 1045220557(0x3e4ccccd, float:0.2)
            float r11 = r11 + r14
            X.0qQ.A0B(r5, r3)
            r5.setElevation(r11)
            r5.setOutlineProvider(r15)
            r11 = 1050253722(0x3e99999a, float:0.3)
            float r14 = r14 + r11
            X.0qQ.A0B(r8, r3)
            r8.setElevation(r14)
            r8.setOutlineProvider(r15)
            java.lang.String r14 = r13.A02
            if (r14 == 0) goto L_0x00cc
            X.7ZF r11 = r0.A05
            if (r11 == 0) goto L_0x00cc
            boolean r13 = r11.A03(r14)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r13)
            if (r11 != 0) goto L_0x00cd
        L_0x00cc:
            r13 = 0
        L_0x00cd:
            X.7ZF r11 = r0.A05
            if (r11 == 0) goto L_0x00d7
            boolean r11 = r11.A02(r14)
            if (r11 == 0) goto L_0x0229
        L_0x00d7:
            if (r13 != 0) goto L_0x0229
            r12.setVisibility(r3)
            java.util.List r11 = r4.A04
            int r13 = r11.size()
            r12 = r16
            if (r13 == r12) goto L_0x01b5
            r10 = 2
            if (r13 == r10) goto L_0x016a
            r10 = 3
            if (r13 != r10) goto L_0x0164
            com.instagram.common.ui.widget.imageview.IgImageView r20 = X.C66580MXl.A0R(r17)
            X.3oV r11 = r6.A02
            X.0eM r10 = r6.A07
            android.view.View r18 = X.AnonymousClass7TE.A0c(r10)
            X.3oV r10 = r6.A05
            X.3oV r6 = r6.A01
            r21 = r11
            r22 = r10
            r23 = r6
            r24 = r1
            r25 = r4
            r26 = r3
            r27 = r3
            r17 = r0
            r19 = r2
            r17.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.instagram.common.ui.widget.imageview.IgImageView r20 = X.C66580MXl.A0R(r29)
            X.3oV r11 = r7.A02
            X.0eM r3 = r7.A07
            android.view.View r18 = X.AnonymousClass7TE.A0c(r3)
            X.3oV r10 = r7.A05
            X.3oV r6 = r7.A01
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            int r3 = r3.height
            r19 = r5
            r21 = r11
            r22 = r10
            r23 = r6
            r26 = r12
            r27 = r3
            r17.A02(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.instagram.common.ui.widget.imageview.IgImageView r13 = X.C66580MXl.A0R(r28)
            X.3oV r7 = r9.A02
            X.0eM r3 = r9.A07
            android.view.View r11 = X.AnonymousClass7TE.A0c(r3)
            X.3oV r6 = r9.A05
            X.3oV r9 = r9.A01
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r3 = r2.height
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r2 = r2.height
            int r3 = r3 + r2
            r19 = 2
            r10 = r0
            r12 = r8
            r14 = r7
            r15 = r6
            r16 = r9
            r17 = r1
            r18 = r4
            r20 = r3
            r10.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x0164:
            X.7DZ r0 = r0.A06
            r0.A02(r1, r4)
            return
        L_0x016a:
            com.instagram.common.ui.widget.imageview.IgImageView r20 = X.C66580MXl.A0R(r17)
            X.3oV r9 = r6.A02
            X.0eM r8 = r6.A07
            android.view.View r18 = X.AnonymousClass7TE.A0c(r8)
            X.3oV r8 = r6.A05
            X.3oV r6 = r6.A01
            r17 = r0
            r19 = r2
            r21 = r9
            r22 = r8
            r23 = r6
            r24 = r1
            r25 = r4
            r26 = r3
            r27 = r3
            r17.A03(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            com.instagram.common.ui.widget.imageview.IgImageView r20 = X.C66580MXl.A0R(r29)
            X.3oV r8 = r7.A02
            X.0eM r2 = r7.A07
            android.view.View r18 = X.AnonymousClass7TE.A0c(r2)
            X.3oV r6 = r7.A05
            X.3oV r3 = r7.A01
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r2 = r2.height
            r19 = r5
            r21 = r8
            r22 = r6
            r23 = r3
            r26 = r12
            r27 = r2
            r17.A03(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0164
        L_0x01b5:
            com.instagram.common.ui.widget.imageview.IgImageView r7 = X.C66580MXl.A0R(r17)
            X.3oV r9 = r6.A05
            X.3oV r12 = r6.A01
            java.lang.Object r8 = r11.get(r3)
            X.NYf r8 = (X.C68821NYf) r8
            boolean r14 = A06(r8)
            X.3oV r13 = r6.A02
            int r5 = r4.A00
            r0.A04(r2, r13, r8, r5)
            android.util.Size r21 = r0.A00(r2, r14)
            X.7Fr r5 = X.C68821NYf.A01(r11, r3)
            X.7FE r11 = r5.A0C
            X.77D r16 = r0.A01(r7)
            r5 = 43
            X.0t0 r20 = X.C73916Plr.A00(r7, r11, r5)
            X.0iw r11 = r0.A00
            com.instagram.common.session.UserSession r5 = r0.A01
            X.4Cq r27 = r10.ArY()
            r22 = r11
            r23 = r5
            r24 = r7
            r25 = r16
            r26 = r8
            X.C71050OaS.A01(r21, r22, r23, r24, r25, r26, r27)
            X.0eM r6 = r6.A07
            android.view.View r13 = X.AnonymousClass7TE.A0c(r6)
            boolean r21 = X.C71050OaS.A03(r8)
            r14 = r5
            r15 = r7
            r17 = r9
            r18 = r8
            r19 = r4
            X.C71050OaS.A02(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.OZe r6 = r0.A04
            X.3Q2 r18 = X.C70043NwL.A00(r5, r8)
            java.lang.Object r5 = r20.getValue()
            X.3Us r5 = (X.C242553Us) r5
            X.77D r16 = X.C3265577g.A04(r5, r7)
            r14 = r6
            r17 = r12
            r19 = r1
            r14.A02(r15, r16, r17, r18, r19, r20)
            r2.setVisibility(r3)
            goto L_0x0164
        L_0x0229:
            r2 = 8
            r12.setVisibility(r2)
            goto L_0x0164
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB6.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r3) {
        C72573PBe pBe = (C72573PBe) r3;
        0qQ.A0B(pBe, 0);
        C70719OHo oHo = pBe.A03;
        A05(oHo.A00, C66580MXl.A0R(oHo.A06));
        C70719OHo oHo2 = pBe.A04;
        A05(oHo2.A00, C66580MXl.A0R(oHo2.A06));
        C70719OHo oHo3 = pBe.A05;
        A05(oHo3.A00, C66580MXl.A0R(oHo3.A06));
        this.A04.A03(pBe);
        this.A06.A01(pBe);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.75A, java.lang.Object] */
    public PB6(AnonymousClass0iw r12, UserSession userSession, C3256673q r14, AnonymousClass7X0 r15, AnonymousClass9HC r16, AnonymousClass7ZF r17, AnonymousClass7DY r18, boolean z) {
        this.A03 = r15;
        this.A00 = r12;
        this.A01 = userSession;
        this.A02 = r14;
        this.A07 = r18;
        this.A05 = r17;
        this.A08 = z;
        C71027OZe oZe = new C71027OZe(userSession, new Object());
        this.A04 = oZe;
        AnonymousClass9HC r8 = r16;
        boolean z2 = r8.A1X;
        C3265877j r1 = new C3265877j(z2);
        P8N p8n = new P8N(r12, userSession, (AnonymousClass7X1) r15, oZe);
        C3265977k A002 = r1.A00((AnonymousClass7XR) r15);
        AnonymousClass7DV r6 = new AnonymousClass7DV((AnonymousClass7XX) r15, z2);
        this.A06 = C66582MXn.A0Y(new C3266077l(new AnonymousClass7DX((AnonymousClass7XN) r15), p8n, A002, r6, (C333107Xr) r15, r8, (C3266177m) null, false), r1);
    }

    public static final void A05(IgFrameLayout igFrameLayout, IgImageView igImageView) {
        igImageView.A09();
        igFrameLayout.getLayoutParams().height = 0;
        C66580MXl.A1C(igFrameLayout, 0);
        0nA.A0e(igFrameLayout, 0);
        0nA.A0d(igFrameLayout, 0);
        igFrameLayout.setRotation(0.0f);
    }
}
