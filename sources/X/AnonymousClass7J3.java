package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7J3  reason: invalid class name */
public final class AnonymousClass7J3 implements C329317Ik {
    public Integer A00;
    public final View A01;
    public final ViewGroup A02;
    public final FrameLayout A03;
    public final UserSession A04;
    public final C329357Io A05;
    public final C329377Iq A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C377229La(this, 29));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C377229La(this, 30));
    public final AnonymousClass0eM A09;
    public final C62320sa A0A;
    public final AnonymousClass7IM A0B;
    public final C62320sa A0C;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cmd(java.lang.Integer r11, boolean r12) {
        /*
            r10 = this;
            r4 = 0
            X.0qQ.A0B(r11, r4)
            java.lang.Integer r2 = r10.A00
            if (r11 == r2) goto L_0x001d
            int r6 = r11.intValue()
            r5 = 1
            r0 = 3
            if (r6 != r0) goto L_0x0026
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r2 != r0) goto L_0x001e
            android.view.ViewGroup r1 = r10.A02
            r0 = 8
            r1.setVisibility(r0)
        L_0x001b:
            r10.A00 = r11
        L_0x001d:
            return
        L_0x001e:
            android.view.View r1 = r10.A01
            android.view.ViewGroup r0 = r10.A02
            X.AnonymousClass7OT.A01(r1, r0, r4)
            goto L_0x001b
        L_0x0026:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 != r0) goto L_0x0031
            android.view.View r1 = r10.A01
            android.view.ViewGroup r0 = r10.A02
            X.AnonymousClass7OT.A01(r1, r0, r5)
        L_0x0031:
            com.instagram.common.session.UserSession r9 = r10.A04
            android.view.View r3 = r10.A00(r11)
            android.view.View r2 = r10.A00(r2)
            android.view.ViewGroup r8 = r10.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36320511197716997(0x81095000002205, double:3.032575760171348E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x00a7
            r0 = 36320511198175755(0x8109500007220b, double:3.032575760461468E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x00a7
            if (r8 == 0) goto L_0x0088
            X.5nL r7 = X.C294975nL.A01(r8, r5)
            r7.A0G()
            r0 = 140(0x8c, double:6.9E-322)
            X.5nL r8 = r7.A0C(r0)
            r7 = 1064849900(0x3f7851ec, float:0.97)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.A0U(r7, r1, r0)
            r8.A0V(r7, r1, r0)
            r8.A03 = r4
            r1 = 1092616192(0x41200000, float:10.0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>(r1)
            X.5nL r1 = r8.A0D(r0)
            X.78p r0 = new X.78p
            r0.<init>(r3, r2)
            r1.A06 = r0
        L_0x0085:
            r1.A0H()
        L_0x0088:
            X.7IM r2 = r10.A0B
            switch(r6) {
                case 0: goto L_0x0095;
                case 1: goto L_0x00a4;
                case 2: goto L_0x009b;
                case 3: goto L_0x008d;
                case 4: goto L_0x008d;
                case 5: goto L_0x009e;
                case 6: goto L_0x0098;
                case 7: goto L_0x00a1;
                default: goto L_0x008d;
            }
        L_0x008d:
            X.7JT r1 = X.AnonymousClass7JT.NONE
        L_0x008f:
            X.7JU r0 = X.AnonymousClass7JU.LEFT_INSET
            r2.A00(r0, r1, r5)
            goto L_0x001b
        L_0x0095:
            X.7JT r1 = X.AnonymousClass7JT.CAMERA
            goto L_0x008f
        L_0x0098:
            X.7JT r1 = X.AnonymousClass7JT.MORE
            goto L_0x008f
        L_0x009b:
            X.7JT r1 = X.AnonymousClass7JT.STICKER_SUGGESTIONS
            goto L_0x008f
        L_0x009e:
            X.7JT r1 = X.AnonymousClass7JT.WRITE_WITH_AI
            goto L_0x008f
        L_0x00a1:
            X.7JT r1 = X.AnonymousClass7JT.IMAGINE
            goto L_0x008f
        L_0x00a4:
            X.7JT r1 = X.AnonymousClass7JT.STICKER_SEARCH
            goto L_0x008f
        L_0x00a7:
            boolean r0 = X.0qQ.A0K(r3, r2)
            if (r0 != 0) goto L_0x00db
            if (r3 == 0) goto L_0x00b2
            X.AnonymousClass7OT.A00(r3)
        L_0x00b2:
            if (r2 == 0) goto L_0x0088
            X.5nL r4 = X.C294975nL.A01(r2, r4)
            r4.A0G()
            r1 = 1062836634(0x3f59999a, float:0.85)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A0P(r1, r0)
            r4.A0Q(r1, r0)
            r0 = 8
            r4.A03 = r0
            r2 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            X.5nL r0 = r4.A0E(r0)
            X.5nL r1 = r0.A0F(r5)
            goto L_0x0085
        L_0x00db:
            if (r3 == 0) goto L_0x0088
            X.AnonymousClass7OT.A00(r3)
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J3.Cmd(java.lang.Integer, boolean):void");
    }

    public final void FLX(Boolean bool, String str, C62320sa r12, boolean z) {
        AnonymousClass0eM r2 = this.A09;
        C252063oV r1 = (C252063oV) r2.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        0qQ.A0B(r1, 0);
        ImageView imageView = (ImageView) r1.getView();
        AnonymousClass7BG.A02(imageView, R.drawable.instagram_photo_gen_ai_pano_outline_24, true);
        AnonymousClass7BG.A01(frameLayout, imageView, (AnonymousClass7L0) null, intValue, false, true);
        AnonymousClass0fU.A00(new C39988AMu(r12), ((C252063oV) r2.getValue()).getView());
    }

    public final void FLY(AnonymousClass7I3 r12, Boolean bool, String str, C62320sa r15, boolean z) {
        boolean z2;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        AnonymousClass0eM r2 = this.A09;
        C252063oV r1 = (C252063oV) r2.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        0qQ.A0B(r1, 0);
        ImageView imageView = (ImageView) r1.getView();
        AnonymousClass7BG.A02(imageView, R.drawable.instagram_edit_ai_pano_outline_24, true);
        AnonymousClass7BG.A01(frameLayout, imageView, (AnonymousClass7L0) null, intValue, false, true);
        AnonymousClass0fU.A00(new C66895Med(r12, str, r15, z2, z), ((C252063oV) r2.getValue()).getView());
    }

    public final void FLZ(boolean z, C62320sa r14) {
        C262364Dk r3;
        int[] iArr;
        UserSession userSession = this.A04;
        AnonymousClass0eM r2 = this.A09;
        C252063oV r1 = (C252063oV) r2.getValue();
        FrameLayout frameLayout = this.A03;
        int intValue = ((Number) this.A0A.invoke()).intValue();
        AnonymousClass7L0 r8 = (AnonymousClass7L0) this.A0C.invoke();
        0qQ.A0B(r1, 1);
        ImageView imageView = (ImageView) r1.getView();
        0Tu r32 = 0Tu.A05;
        boolean A062 = 182.A06(r32, userSession, 36320060226543526L);
        int i = R.drawable.direct_search_sticker_icon;
        if (A062) {
            i = R.drawable.direct_bolt_sticker_icon;
        }
        if (!182.A06(r32, userSession, 36320511197716997L) || !182.A06(r32, userSession, 36320511198044681L)) {
            AnonymousClass7BG.A02(imageView, i, false);
        } else {
            0qQ.A0B(imageView, 0);
            Context context = imageView.getContext();
            Drawable drawable = context.getDrawable(i);
            if (drawable != null) {
                if (r8 != null && (iArr = r8.A0K) != null && iArr.length == 0) {
                    drawable.setColorFilter(2Yu.A0F(context, R.attr.cyanBubbleBackground), PorterDuff.Mode.SRC_IN);
                    imageView.setImageDrawable(drawable);
                } else if ((drawable instanceof C262364Dk) && (r3 = (C262364Dk) drawable) != null) {
                    r3.A01(new WTQ(imageView));
                }
            }
        }
        AnonymousClass7BG.A01(frameLayout, imageView, r8, intValue, false, false);
        AnonymousClass0fU.A00(new C39989AMv(r14), ((C252063oV) r2.getValue()).getView());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0085: MOVE  (r3v10 com.instagram.common.ui.widget.imageview.IgImageView) = (r5v1 com.instagram.common.ui.widget.imageview.IgImageView)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ed  */
    public final void FLa(X.AnonymousClass9JF r37, X.C317966o8 r38, com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r39, X.C62320sa r40) {
        /*
            r36 = this;
            r22 = 2
            r2 = r36
            com.instagram.common.session.UserSession r4 = r2.A04
            X.0eM r0 = r2.A09
            r35 = r0
            java.lang.Object r1 = r35.getValue()
            X.3oV r1 = (X.C252063oV) r1
            X.0sa r0 = r2.A0C
            java.lang.Object r10 = r0.invoke()
            r21 = 0
            r12 = 1
            X.0qQ.A0B(r1, r12)
            android.view.View r5 = r1.getView()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r14 = r5.getContext()
            r0 = r38
            com.instagram.common.typedurl.ImageUrl r7 = r0.A0H
            X.0qQ.A07(r7)
            X.0qQ.A0A(r14)
            android.graphics.drawable.Drawable r13 = r5.getDrawable()
            X.0qQ.A0B(r14, r12)
            r2 = r37
            java.lang.Object r3 = r2.A02
            X.6o8 r3 = (X.C317966o8) r3
            r6 = 0
            if (r3 == 0) goto L_0x007f
            java.lang.Integer r0 = r3.A04()
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            if (r0 != r8) goto L_0x0225
            X.0Tu r9 = X.0Tu.A05
            r0 = 36322096040978366(0x810ac1000527be, double:3.033578021431489E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 == 0) goto L_0x0225
            r0 = 36322096041109440(0x810ac1000727c0, double:3.033578021514381E-306)
            boolean r0 = X.182.A06(r9, r4, r0)
            if (r0 == 0) goto L_0x0225
            r0 = 2131237286(0x7f0819a6, float:1.8090818E38)
            android.graphics.drawable.Drawable r15 = r14.getDrawable(r0)
            if (r15 == 0) goto L_0x007f
            boolean r0 = r13 instanceof X.C59999Jd8
            if (r0 == 0) goto L_0x0208
            r0 = r13
            X.Jd8 r0 = (X.C59999Jd8) r0
            java.lang.String r1 = r0.A00
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0H
            java.lang.String r0 = r0.getUrl()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0208
        L_0x007e:
            r6 = r13
        L_0x007f:
            boolean r0 = r5 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            r4 = 0
            if (r0 == 0) goto L_0x008e
            r3 = r5
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            if (r3 == 0) goto L_0x008e
            if (r6 == 0) goto L_0x01f9
            r3.setImageDrawable(r6)
        L_0x008e:
            if (r10 == 0) goto L_0x0093
            r5.setBackground(r4)
        L_0x0093:
            java.lang.Object r10 = r2.A02
            X.6o8 r10 = (X.C317966o8) r10
            r11 = r39
            if (r10 == 0) goto L_0x01c7
            X.9JF r0 = r11.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x01c7
            X.OL5 r0 = r11.A02
            r15 = 1
            if (r0 == 0) goto L_0x01f6
            X.OLe r9 = r0.A01
            if (r9 == 0) goto L_0x01f6
            boolean r0 = r9.A00()
            if (r0 != 0) goto L_0x00e4
            int r0 = r9.A00
            int r1 = r0 + 1
            r9.A00 = r1
            int r0 = r9.A05
            if (r1 < r0) goto L_0x01f6
            X.0sa r0 = r9.A06
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            long r7 = r0.longValue()
            int r0 = r9.A01
            int r1 = r0 + 1
            r9.A01 = r1
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            int r0 = r9.A04
            long r5 = (long) r0
            int r0 = r9.A03
            double r3 = (double) r0
            double r0 = (double) r1
            double r3 = java.lang.Math.pow(r3, r0)
            long r0 = (long) r3
            long r5 = r5 * r0
            long r0 = r13.toMillis(r5)
            long r7 = r7 + r0
            r9.A02 = r7
        L_0x00e4:
            r0 = 1
        L_0x00e5:
            r11.A08 = r0
            X.LeP r1 = r11.A0C
            java.lang.String r14 = r2.A04
            java.lang.String r13 = r11.A04
            java.lang.String r9 = r2.A05
            java.lang.String r0 = r10.A0a
            X.0qQ.A07(r0)
            r3 = 10
            java.lang.Long r0 = X.00y.A0n(r3, r0)
            if (r0 != 0) goto L_0x01f0
            java.lang.String r0 = r10.A0S
            X.0qQ.A07(r0)
            java.lang.Long r0 = X.00y.A0n(r3, r0)
            if (r0 != 0) goto L_0x01f0
            r19 = 0
        L_0x0109:
            java.lang.String r0 = r10.A0a
            X.0qQ.A07(r0)
            java.lang.Long r8 = X.00y.A0n(r3, r0)
            java.lang.String r7 = r10.A0b
            int r0 = r10.A0C
            if (r0 <= 0) goto L_0x01ed
            java.lang.Integer r3 = r10.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r3 == r0) goto L_0x0121
            r15 = 0
        L_0x0121:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r15)
        L_0x0125:
            java.lang.Object r3 = r2.A00
            java.util.List r3 = (java.util.List) r3
            int r0 = r3.size()
            long r15 = (long) r0
            int r0 = r3.size()
            long r3 = (long) r0
            r17 = 0
            r0 = r21
            X.0qQ.A0B(r14, r0)
            X.0qQ.A0B(r13, r12)
            r0 = r22
            X.0qQ.A0B(r9, r0)
            X.0wc r5 = r1.A00
            java.lang.String r1 = "avatar_stickers_measurement_typeahead_impression"
            X.0kJ r0 = r5.A00
            X.0Aj r6 = r5.A00(r0, r1)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x01c7
            X.9ZH r5 = new X.9ZH
            r5.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r19)
            java.lang.String r0 = "non_avatar_sticker_id"
            r5.A05(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r17)
            java.lang.String r0 = "sticker_rank"
            r5.A05(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r15)
            java.lang.String r0 = "total_avatar_stickers"
            r5.A05(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "result_size"
            r5.A05(r0, r1)
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            java.lang.String r0 = "referrer_surface"
            r5.A06(r0, r1)
            java.lang.String r0 = "composer_text_input_session_id"
            r5.A06(r0, r9)
            r0 = 8
            java.lang.String r0 = X.Pxd.A00(r0)
            r5.A06(r0, r13)
            r0 = 193(0xc1, float:2.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.A05(r0, r8)
            java.lang.String r0 = "sticker_template_name"
            r5.A06(r0, r7)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x01de
            java.lang.String r1 = "animated_sticker"
        L_0x01ae:
            java.lang.String r0 = "sticker_type"
            r5.A06(r0, r1)
            java.lang.String r0 = "event_data"
            r6.AAK(r5, r0)
            java.lang.String r0 = "avatar_session_id"
            r6.AAJ(r0, r14)
            java.lang.String r1 = "typeahead"
            java.lang.String r0 = "product"
            r6.AAJ(r0, r1)
            r6.Cgf()
        L_0x01c7:
            r11.A00 = r2
            java.lang.Object r0 = r35.getValue()
            X.3oV r0 = (X.C252063oV) r0
            android.view.View r1 = r0.getView()
            X.AMw r0 = new X.AMw
            r2 = r40
            r0.<init>(r2)
            X.AnonymousClass0fU.A00(r0, r1)
            return
        L_0x01de:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x01eb
            java.lang.String r1 = "static"
            goto L_0x01ae
        L_0x01eb:
            r1 = 0
            goto L_0x01ae
        L_0x01ed:
            r10 = 0
            goto L_0x0125
        L_0x01f0:
            long r19 = r0.longValue()
            goto L_0x0109
        L_0x01f6:
            r0 = 0
            goto L_0x00e5
        L_0x01f9:
            r3.setImageDrawable(r4)
            java.lang.String r1 = "DIRECT_COMPOSER_IMAGE_DRAWABLE_ANALYTICS_MODULE"
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            r3.setUrl(r7, r0)
            goto L_0x008e
        L_0x0208:
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0H
            java.lang.String r17 = r0.getUrl()
            X.0qQ.A07(r17)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r18 = r1.getDimensionPixelSize(r0)
            X.Jd8 r13 = new X.Jd8
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            goto L_0x007e
        L_0x0225:
            java.lang.Integer r0 = r3.A04()
            if (r0 != r8) goto L_0x0242
            X.0Tu r8 = X.0Tu.A05
            r0 = 36322096040978366(0x810ac1000527be, double:3.033578021431489E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x0242
            boolean r0 = X.C63282KuR.A00(r4)
            android.graphics.drawable.Drawable r6 = X.C320996tP.A00(r14, r4, r3, r12, r0)
            goto L_0x007f
        L_0x0242:
            X.0Tu r8 = X.0Tu.A05
            r0 = 36322096041109440(0x810ac1000727c0, double:3.033578021514381E-306)
            boolean r0 = X.182.A06(r8, r4, r0)
            if (r0 == 0) goto L_0x007f
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165344(0x7f0700a0, float:1.7944902E38)
            int r31 = r1.getDimensionPixelSize(r0)
            r0 = 2131237286(0x7f0819a6, float:1.8090818E38)
            android.graphics.drawable.Drawable r25 = r14.getDrawable(r0)
            if (r25 != 0) goto L_0x0269
            r23 = 0
        L_0x0265:
            r6 = r23
            goto L_0x007f
        L_0x0269:
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0H
            java.lang.String r27 = r0.getUrl()
            r29 = 2131165230(0x7f07002e, float:1.7944671E38)
            r30 = 2131238286(0x7f081d8e, float:1.8092846E38)
            X.Jbk r23 = new X.Jbk
            r24 = r14
            r26 = r6
            r28 = r6
            r32 = r31
            r33 = r21
            r34 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0265
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7J3.FLa(X.9JF, X.6o8, com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.0sa):void");
    }

    public AnonymousClass7J3(View view, View view2, FrameLayout frameLayout, UserSession userSession, C329357Io r7, C329377Iq r8, AnonymousClass7IM r9, C62320sa r10, C62320sa r11) {
        this.A04 = userSession;
        this.A01 = view;
        this.A03 = frameLayout;
        this.A0A = r10;
        this.A0C = r11;
        this.A0B = r9;
        this.A06 = r8;
        this.A05 = r7;
        View requireViewById = view2.requireViewById(R.id.row_thread_composer_shortcut_viewgroup);
        0qQ.A07(requireViewById);
        this.A02 = (ViewGroup) requireViewById;
        this.A09 = AnonymousClass1YB.A00(new C377229La(view2, 31));
        this.A00 = AnonymousClass05K.A0Y;
    }

    private final View A00(Integer num) {
        AnonymousClass0eM r0;
        switch (num.intValue()) {
            case 0:
                r0 = this.A07;
                break;
            case 1:
            case 2:
            case 5:
            case 7:
                return ((C252063oV) this.A09.getValue()).getView();
            case 6:
                r0 = this.A08;
                break;
            default:
                return null;
        }
        return (View) r0.getValue();
    }
}
