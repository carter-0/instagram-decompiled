package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OQs  reason: case insensitive filesystem */
public abstract class C70900OQs {
    public static final ViewGroup A00(ViewGroup viewGroup, UserSession userSession) {
        boolean A1U = AnonymousClass7TF.A1U(0, viewGroup, userSession);
        Context context = viewGroup.getContext();
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.layout_story_interstitial_reel_item, false);
        C51968G9o.A1D(viewGroup2, -1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(context);
        C69061Ndy ndy = new C69061Ndy(context, viewGroup2, userSession);
        ndy.A04.setLayerType(A1U ? 1 : 0, (Paint) null);
        viewGroup2.setTag(ndy);
        return viewGroup2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.PJW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.PJV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v37, resolved type: X.PJV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: X.PJV} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass0iw r28, com.instagram.common.session.UserSession r29, X.C255773uh r30, X.C250973mM r31, X.AnonymousClass3BQ r32, X.C310706bU r33, X.C310646bO r34, X.C317116mk r35, X.C69061Ndy r36, X.C309916a4 r37) {
        /*
            r3 = 0
            r5 = r36
            X.0qQ.A0B(r5, r3)
            r0 = 1
            r14 = 21
            r12 = r29
            X.0qQ.A0B(r12, r0)
            r9 = 2
            r1 = 22
            r6 = r30
            X.0qQ.A0B(r6, r9)
            r20 = 3
            r10 = 23
            r11 = r35
            r4 = r37
            r0 = r20
            X.AnonymousClass7TF.A1D(r4, r0, r11)
            r19 = 8
            r2 = r32
            r0 = r19
            X.0qQ.A0B(r2, r0)
            r8 = 9
            r17 = r28
            r0 = r17
            X.0qQ.A0B(r0, r8)
            r30 = r34
            r0 = r30
            X.6Yf r7 = r0.Bz3(r6)
            android.widget.ImageButton r2 = r5.A01
            r0 = 26
            X.C71396Ojv.A00(r2, r0, r4)
            r2.setVisibility(r3)
            r0 = 27
            X.C71396Ojv.A00(r2, r0, r4)
            r7.A03(r5)
            com.instagram.reels.viewer.common.ReelViewGroup r0 = r5.A09
            r0.A92(r11)
            r2 = 0
            r0.A00 = r2
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = r5.A04
            r7 = 1
            r0.setSegments(r7)
            r0.A06(r3, r3)
            r0.setVisibility(r3)
            r5.A03 = r6
            r0 = r31
            com.instagram.model.reels.Reel r13 = r0.A0H
            java.lang.String r15 = r13.getId()
            r0 = 596(0x254, float:8.35E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0192
            X.3mL r0 = X.C250963mL.ROLL_CALL_EMPTY_STATE
        L_0x007b:
            int r0 = r0.ordinal()
            if (r0 == r14) goto L_0x02e5
            if (r0 == r1) goto L_0x0231
            if (r0 != r10) goto L_0x0226
            r5.A03 = r2
            r0 = r30
            X.6Yf r0 = r0.Bz3(r6)
            r0.A03(r5)
            X.OI9 r10 = r5.A05
            X.0qQ.A0B(r10, r7)
            X.3BK r16 = X.AnonymousClass3BJ.A00(r12)
            java.lang.String r18 = "ROLL_CALL_INTERSTITIAL"
            X.0xG r9 = X.DbS.A0O(r18)
            boolean r0 = r13.A16(r12)
            if (r0 != 0) goto L_0x0185
            X.0eM r0 = r10.A01
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = r31
            com.instagram.common.typedurl.ImageUrl r15 = r0.A07(r12)
            X.0qQ.A0B(r1, r3)
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r1)
            r8 = 4
            X.PqW r0 = new X.PqW
            r0.<init>(r1, r8)
            X.C56337Hwo.A01(r14, r12, r15, r13, r0)
            r0 = 2130970328(0x7f0406d8, float:1.7549363E38)
            int r0 = X.2Yu.A0H(r14, r0)
            r1.setBackgroundResource(r0)
        L_0x00cb:
            X.3oV r0 = r10.A00
            r29 = r0
            android.view.View r0 = r29.getView()
            android.content.Context r8 = r0.getContext()
            boolean r0 = r16.A01()
            if (r0 == 0) goto L_0x017d
            boolean r0 = r8 instanceof X.AnonymousClass07Z
            if (r0 == 0) goto L_0x017d
            X.0eM r0 = r10.A08
            X.DbW.A1R(r0, r3)
            r14 = r8
            X.07Z r14 = (X.AnonymousClass07Z) r14
            X.07U r25 = X.07U.A04
            X.0xx r1 = X.AnonymousClass07a.A00(r14)
            X.MGo r0 = new X.MGo
            r22 = r10
            r23 = r16
            r24 = r14
            r26 = r8
            r27 = r2
            r28 = r7
            r21 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            X.AnonymousClass7TE.A1Z(r0, r1)
        L_0x0105:
            X.0eM r0 = r10.A0A
            android.widget.TextView r14 = X.JTO.A0I(r0)
            java.lang.String r0 = r13.A0r
            if (r0 != 0) goto L_0x011d
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131972420(0x7f135144, float:1.9581847E38)
            java.lang.CharSequence r0 = r1.getText(r0)
            X.0qQ.A07(r0)
        L_0x011d:
            r14.setText(r0)
            X.0eM r1 = r10.A09
            android.widget.TextView r17 = X.JTO.A0I(r1)
            r0 = r16
            java.lang.Long r0 = r0.A01
            if (r0 == 0) goto L_0x017b
            long r14 = r0.longValue()
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            android.content.res.Resources r16 = X.C66580MXl.A0B(r0)
            double r0 = (double) r14
            r14 = r16
            java.lang.String r1 = X.1G0.A09(r14, r0)
        L_0x013f:
            r0 = r17
            r0.setText(r1)
            X.0eM r0 = r10.A02
            android.view.View r14 = X.AnonymousClass7TE.A0c(r0)
            r1 = 31
            X.FP2 r0 = new X.FP2
            r0.<init>((java.lang.Object) r11, (int) r1)
            X.AnonymousClass0fU.A00(r0, r14)
            r0 = r31
            java.util.List r0 = X.C250973mM.A00(r12, r0)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r15 = r0.iterator()
        L_0x0162:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0199
            java.lang.Object r14 = r15.next()
            r0 = r14
            X.3uh r0 = (X.C255773uh) r0
            com.instagram.user.model.User r0 = r0.A0i
            java.lang.Object r0 = X.JTS.A0h(r0, r1)
            java.util.List r0 = (java.util.List) r0
            r0.add(r14)
            goto L_0x0162
        L_0x017b:
            r1 = r2
            goto L_0x013f
        L_0x017d:
            X.0eM r1 = r10.A08
            r0 = r19
            X.DbW.A1R(r1, r0)
            goto L_0x0105
        L_0x0185:
            X.0eM r0 = r10.A01
            java.lang.Object r0 = r0.getValue()
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = (com.instagram.common.ui.widget.imageview.CircularImageView) r0
            X.C70311O1p.A00(r0)
            goto L_0x00cb
        L_0x0192:
            X.3mL r0 = r6.A0e
            X.0qQ.A0A(r0)
            goto L_0x007b
        L_0x0199:
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = X.AnonymousClass7TF.A0s(r1)
        L_0x01a1:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x01ea
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r16)
            java.lang.Object r1 = r0.getKey()
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.Object r15 = r0.getValue()
            java.util.List r15 = (java.util.List) r15
            if (r1 == 0) goto L_0x01a1
            java.lang.String r14 = r1.getId()
            X.1Nr r0 = new X.1Nr
            r0.<init>(r1)
            com.instagram.model.reels.Reel r1 = new com.instagram.model.reels.Reel
            r1.<init>(r0, r14, r3)
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x01cf:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01e1
            java.lang.Object r0 = r15.next()
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r0 = r0.A0b
            r14.add(r0)
            goto L_0x01cf
        L_0x01e1:
            r1.A0X(r14)
            r0 = r17
            r0.add(r1)
            goto L_0x01a1
        L_0x01ea:
            java.util.ArrayList r15 = X.AnonymousClass7TF.A0p(r17)
            java.util.Iterator r16 = r17.iterator()
        L_0x01f2:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0209
            java.lang.Object r14 = r16.next()
            com.instagram.model.reels.Reel r14 = (com.instagram.model.reels.Reel) r14
            X.3BQ r1 = X.AnonymousClass3BQ.IN_VIEWER_TRAY
            X.3BT r0 = new X.3BT
            r0.<init>(r2, r14, r1)
            r15.add(r0)
            goto L_0x01f2
        L_0x0209:
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r15)
            java.util.Iterator r15 = r15.iterator()
        L_0x0211:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0383
            java.lang.Object r1 = r15.next()
            X.3BT r1 = (X.AnonymousClass3BT) r1
            X.Otm r0 = new X.Otm
            r0.<init>(r1)
            r14.add(r0)
            goto L_0x0211
        L_0x0226:
            r0 = 1413(0x585, float:1.98E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0231:
            android.view.View r11 = r5.itemView
            android.content.Context r10 = r5.A00
            r0 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r0 = X.2Yu.A0H(r10, r0)
            X.DbT.A16(r10, r11, r0)
            X.OGP r11 = r5.A07
            java.util.List r10 = r6.A0L
            X.3oV r0 = r11.A04
            r0.setVisibility(r3)
            r5.A03 = r6
            android.widget.TextView r14 = r11.A02
            if (r14 == 0) goto L_0x0256
            android.content.Context r13 = r11.A00
            r0 = 2131974370(0x7f1358e2, float:1.9585802E38)
            X.DbT.A18(r13, r14, r0)
        L_0x0256:
            if (r10 == 0) goto L_0x040f
            int r13 = r10.size()
            r0 = r20
            if (r13 < r0) goto L_0x040f
            android.widget.TextView r13 = r11.A01
            if (r13 == 0) goto L_0x029c
            android.content.Context r0 = r11.A00
            r16 = r0
            r14 = 2131974369(0x7f1358e1, float:1.95858E38)
            java.lang.Object r0 = r10.get(r3)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x02e3
            java.lang.String r15 = r0.getName()
        L_0x0279:
            java.lang.Object r0 = r10.get(r7)
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            X.1Ns r0 = r0.A0W
            if (r0 == 0) goto L_0x02e1
            java.lang.String r0 = r0.getName()
        L_0x0287:
            int r9 = X.DbT.A02(r10, r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r15, r0, r9}
            r0 = r16
            java.lang.String r0 = r0.getString(r14, r9)
            r13.setText(r0)
        L_0x029c:
            int r13 = r10.size()
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView[] r11 = r11.A03
            if (r13 <= r8) goto L_0x02a6
            r13 = 9
        L_0x02a6:
            r14 = 0
        L_0x02a7:
            if (r14 >= r13) goto L_0x040f
            java.lang.Object r9 = r10.get(r14)
            com.instagram.model.reels.Reel r9 = (com.instagram.model.reels.Reel) r9
            r8 = r11[r14]
            if (r8 == 0) goto L_0x02dc
            r8.setVisibility(r3)
            X.1Ns r0 = r9.A0W
            if (r0 == 0) goto L_0x02df
            com.instagram.common.typedurl.ImageUrl r15 = r0.Ary()
        L_0x02be:
            r0 = r17
            r8.A0F(r2, r0, r15)
            r8.setGradientSpinnerVisible(r7)
            com.instagram.api.schemas.RingSpec r0 = X.AnonymousClass3NW.A00(r12, r9)
            r8.setGradientColor(r0)
            boolean r0 = r9.A16(r12)
            r0 = r0 ^ 1
            r8.setGradientSpinnerActivated(r0)
            r8.A07()
            X.C71409Ok8.A01(r8, r1, r9, r4)
        L_0x02dc:
            int r14 = r14 + 1
            goto L_0x02a7
        L_0x02df:
            r15 = r2
            goto L_0x02be
        L_0x02e1:
            r0 = r2
            goto L_0x0287
        L_0x02e3:
            r15 = r2
            goto L_0x0279
        L_0x02e5:
            X.OH7 r8 = r5.A06
            X.2eb r0 = r8.A05
            r0.A03(r3)
            r5.A03 = r6
            java.util.List r0 = r6.A0K
            android.widget.TextView r11 = r8.A03
            if (r11 == 0) goto L_0x02fc
            android.content.Context r10 = r8.A00
            r1 = 2131975996(0x7f135f3c, float:1.95891E38)
            X.DbT.A18(r10, r11, r1)
        L_0x02fc:
            android.widget.TextView r13 = r8.A02
            if (r13 == 0) goto L_0x0320
            android.content.Context r1 = r8.A00
            android.content.res.Resources r14 = r1.getResources()
            r12 = 2131975995(0x7f135f3b, float:1.9589098E38)
            java.lang.CharSequence r11 = X.C70314O1s.A00(r0, r3)
            java.lang.CharSequence r10 = X.C70314O1s.A00(r0, r7)
            java.lang.CharSequence r1 = X.C70314O1s.A00(r0, r9)
            java.lang.Object[] r1 = new java.lang.Object[]{r11, r10, r1}
            android.text.Spanned r1 = X.0bC.A00(r14, r1, r12)
            r13.setText(r1)
        L_0x0320:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r8.A04
            if (r1 == 0) goto L_0x0369
            android.content.Context r11 = r8.A00
            if (r0 != 0) goto L_0x032f
            java.util.List r0 = java.util.Collections.emptyList()
            X.0qQ.A07(r0)
        L_0x032f:
            android.content.res.Resources r10 = r11.getResources()
            r9 = 2131165209(0x7f070019, float:1.7944629E38)
            int r21 = r10.getDimensionPixelSize(r9)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            r9 = 1050253722(0x3e99999a, float:0.3)
            java.lang.Float r13 = java.lang.Float.valueOf(r9)
            android.content.res.Resources r10 = r11.getResources()
            r9 = 2131165293(0x7f07006d, float:1.79448E38)
            java.lang.Integer r16 = X.JTP.A0k(r10, r9)
            java.lang.String r19 = "story_interstitial"
            r15 = r2
            r17 = r2
            r18 = r2
            r20 = r0
            r22 = r7
            r23 = r3
            r24 = r3
            r25 = r7
            r26 = r3
            r12 = r2
            android.graphics.drawable.Drawable r0 = X.C244283aw.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r1.setImageDrawable(r0)
        L_0x0369:
            android.widget.TextView r2 = r8.A01
            if (r2 == 0) goto L_0x040f
            android.content.Context r1 = r8.A00
            r0 = 2131975994(0x7f135f3a, float:1.9589096E38)
            X.DbT.A18(r1, r2, r0)
            android.widget.TextView r2 = r8.A01
            X.0qQ.A0A(r2)
            r0 = 32
            X.Ojy r1 = new X.Ojy
            r1.<init>(r0, r8, r6, r4)
            goto L_0x040c
        L_0x0383:
            boolean r16 = r14.isEmpty()
            X.0eM r0 = r10.A07
            android.widget.TextView r15 = X.JTO.A0I(r0)
            android.content.res.Resources r1 = r8.getResources()
            if (r16 == 0) goto L_0x04e8
            r0 = 2131972412(0x7f13513c, float:1.958183E38)
            X.DbU.A1A(r1, r15, r0)
            X.0eM r0 = r10.A06
            android.widget.TextView r15 = X.JTO.A0I(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131972411(0x7f13513b, float:1.9581829E38)
            X.DbU.A1A(r1, r15, r0)
        L_0x03a9:
            r0 = r18
            X.2kQ r1 = X.C227942kP.A01(r0, r3, r3)
            X.3BQ r0 = X.AnonymousClass3BQ.IN_VIEWER_TRAY
            X.6aJ r8 = new X.6aJ
            r8.<init>(r1, r0)
            r25 = r33
            if (r33 == 0) goto L_0x04e4
            X.PJV r1 = new X.PJV
            r21 = r1
            r22 = r12
            r23 = r31
            r24 = r8
            r26 = r30
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x03c9:
            boolean r8 = r14.isEmpty()
            if (r8 == 0) goto L_0x0415
            X.0eM r7 = r10.A03
            java.lang.Object r8 = r7.getValue()
            X.O9H r8 = (X.O9H) r8
            X.0qQ.A0B(r8, r3)
            com.instagram.user.model.User r7 = X.AnonymousClass7TF.A0Q(r12)
            com.instagram.common.typedurl.ImageUrl r10 = r7.Bh3()
            X.0eM r8 = r8.A00
            com.instagram.common.ui.widget.imageview.IgImageView r7 = X.C66580MXl.A0R(r8)
            r7.setUrl(r10, r9)
            X.3BT r7 = new X.3BT
            r7.<init>(r2, r13, r0)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r8)
            r1.Dyn(r0, r7)
        L_0x03f7:
            android.view.View r1 = r29.getView()
            X.0qQ.A0B(r1, r3)
            r0 = 2131440054(0x7f0b31b6, float:1.850208E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 30
            X.FP2 r1 = new X.FP2
            r1.<init>((java.lang.Object) r11, (int) r0)
        L_0x040c:
            X.AnonymousClass0fU.A00(r1, r2)
        L_0x040f:
            r0 = r31
            r4.Dnq(r6, r0, r5, r3)
            return
        L_0x0415:
            int r8 = r14.size()
            r0 = r20
            if (r8 > r0) goto L_0x0494
            X.0eM r0 = r10.A05
            java.lang.Object r8 = r0.getValue()
            X.Ndx r8 = (X.C69060Ndx) r8
            X.0qQ.A0B(r8, r3)
            int r0 = r14.size()
            if (r0 > r7) goto L_0x048b
            r15 = 1
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r12)
            com.instagram.common.typedurl.ImageUrl r7 = r0.Bh3()
            X.0eM r0 = r8.A00
            com.instagram.common.ui.widget.imageview.IgImageView r0 = X.C66580MXl.A0R(r0)
            r0.setUrl(r7, r9)
        L_0x0440:
            X.0eM r8 = r8.A00
            java.util.List r0 = X.JTO.A15(r8)
            int r0 = r0.size()
            java.util.Iterator r14 = X.C66581MXm.A10(r14, r0)
            r23 = 0
        L_0x0450:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03f7
            java.lang.Object r13 = r14.next()
            int r10 = r23 + 1
            if (r23 >= 0) goto L_0x0466
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0466:
            X.Otm r13 = (X.C71961Otm) r13
            int r7 = r23 + r15
            java.util.List r0 = X.JTO.A15(r8)
            java.lang.Object r7 = r0.get(r7)
            X.Myl r7 = (X.C68019Myl) r7
            X.3BT r0 = r13.A00
            r19 = r2
            r20 = r11
            r21 = r1
            r22 = r7
            r16 = r9
            r17 = r12
            r18 = r0
            X.C70313O1r.A00(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = r0
            r23 = r10
            goto L_0x0450
        L_0x048b:
            r15 = 0
            X.0eM r7 = r8.A01
            r0 = r19
            X.DbW.A1R(r7, r0)
            goto L_0x0440
        L_0x0494:
            X.0eM r0 = r10.A04
            java.lang.Object r0 = r0.getValue()
            X.O9G r0 = (X.O9G) r0
            X.0qQ.A0B(r0, r3)
            X.0eM r7 = r0.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r7)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.2Rw r0 = r0.A0A
            if (r0 != 0) goto L_0x04c9
            java.lang.Object r8 = X.AnonymousClass7TE.A14(r7)
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            android.view.View r0 = X.AnonymousClass7TH.A06(r7)
            android.content.Context r0 = r0.getContext()
            X.2tC r2 = X.AnonymousClass2t9.A00(r0)
            X.NQ2 r0 = new X.NQ2
            r0.<init>(r9, r12, r11, r1)
            X.2t9 r0 = X.DbU.A0U(r2, r0)
            r8.setAdapter(r0)
        L_0x04c9:
            com.instagram.common.recyclerview.ViewModelListUpdate r2 = X.DbS.A0R()
            r2.A01(r14)
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r7)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.2Rw r1 = r0.A0A
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.recyclerview.IgRecyclerViewAdapter"
            X.0qQ.A0C(r1, r0)
            X.2t9 r1 = (X.AnonymousClass2t9) r1
            r1.A05(r2)
            goto L_0x040f
        L_0x04e4:
            X.PJW r1 = X.PJW.A00
            goto L_0x03c9
        L_0x04e8:
            r0 = 2131972419(0x7f135143, float:1.9581845E38)
            X.DbU.A1A(r1, r15, r0)
            X.0eM r0 = r10.A06
            android.widget.TextView r15 = X.JTO.A0I(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131972418(0x7f135142, float:1.9581843E38)
            X.DbU.A1A(r1, r15, r0)
            goto L_0x03a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70900OQs.A01(X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6bU, X.6bO, X.6mk, X.Ndy, X.6a4):void");
    }
}
