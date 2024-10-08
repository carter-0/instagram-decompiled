package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.3pR  reason: invalid class name and case insensitive filesystem */
public final class C252643pR extends C252633pQ {
    public 0xF A00;
    public final Context A01;
    public final FragmentActivity A02;
    public final UserSession A03;
    public final C242813Wa A04;
    public final String A05;
    public final C249763kK A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252643pR(Context context, FragmentActivity fragmentActivity, UserSession userSession, C242813Wa r5, C249763kK r6, String str, boolean z, boolean z2) {
        super(context);
        0qQ.A0B(context, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r5, 7);
        this.A02 = fragmentActivity;
        this.A01 = context;
        this.A03 = userSession;
        this.A06 = r6;
        this.A08 = z;
        this.A07 = z2;
        this.A04 = r5;
        this.A05 = str;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.U22, android.text.method.LinkMovementMethod] */
    public static final void A00(UserSession userSession, AnonymousClass4DU r15, C243613Zn r16, C252643pR r17, C253993rl r18, C243503Za r19, AnonymousClass3W1 r20, int i) {
        AnonymousClass9IU r4;
        Context context;
        C243503Za r7 = r19;
        AnonymousClass3ZE r42 = r7.A0C;
        if (AnonymousClass9IU.A00(0, r42) && (r4 = (AnonymousClass9IU) r42) != null) {
            C53281GlT glT = (C53281GlT) r4.A02;
            UserSession userSession2 = userSession;
            C243613Zn r6 = r16;
            C252643pR r3 = r17;
            C253993rl r10 = r18;
            AnonymousClass3W1 r12 = r20;
            int i2 = i;
            AnonymousClass4DU r2 = r15;
            if (r7.A0P) {
                context = r3.A01;
                C2806953a.A00(((C56153Htf) r6.A07.getValue()).A00(context, glT, r2.getModuleName(), r12.A02), (C376689Iy) r4.A01, userSession2, r10, (AnonymousClass53Y) r6.A04.getValue(), r12, r2.getModuleName(), i2);
            } else {
                context = r3.A01;
                AnonymousClass9J2 r162 = (AnonymousClass9J2) ((0sJ) r7.A02.A0G).invoke(r12, r3.A05, r2, Integer.valueOf(i2));
                C273104lz.A00(context, r162, userSession2, r2, r10, r20, i);
            }
            AnonymousClass0eM r43 = r6.A07;
            SpannableStringBuilder A012 = ((C56153Htf) r43.getValue()).A01(context, glT, i2, r12.A02);
            TextView textView = r10.A0F;
            int i3 = glT.A00;
            textView.setMaxLines(i3);
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            textView.setSingleLine(z);
            C56153Htf htf = (C56153Htf) r43.getValue();
            0qQ.A0B(A012, 0);
            0qQ.A0B(htf, 4);
            C244083ac.A05(textView, C244063aa.TITLE);
            textView.setText(A012);
            U22 u22 = U22.A00;
            U22 u222 = u22;
            if (u22 == null) {
                ? linkMovementMethod = new LinkMovementMethod();
                U22.A00 = linkMovementMethod;
                u222 = linkMovementMethod;
            }
            textView.setMovementMethod(u222);
            AnonymousClass0fU.A00(new C244023aW(userSession2, (String) null, new C377409Ls(40, r12, glT), new AnonymousClass9MM(i2, 4, glT, r10, htf), true), textView);
            textView.setOnTouchListener(new IDV(r2, htf, glT));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r26v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r0v259, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0768, code lost:
        if (r1 != null) goto L_0x076a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x08d8, code lost:
        if (r0.CVs() != true) goto L_0x08da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x08fb, code lost:
        if (r0.CVs() != true) goto L_0x08fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0add, code lost:
        if ((java.lang.System.currentTimeMillis() - X.1Au.A00(r11).A01.getLong("close_friends_badge_last_timestamp", 0)) <= java.util.concurrent.TimeUnit.DAYS.toMillis(1)) goto L_0x0adf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0caa, code lost:
        if ("feed_timeline".equals(r52.getModuleName()) != false) goto L_0x0cac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0d50, code lost:
        if (r20 != false) goto L_0x0d52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0db7, code lost:
        if ((!r16.isEmpty()) != true) goto L_0x0db9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass4DU r54, X.C243613Zn r55, X.C253993rl r56, X.C243513Zb r57, X.AnonymousClass3W1 r58, int r59) {
        /*
            r53 = this;
            r4 = r57
            r3 = 0
            r5 = r56
            X.0qQ.A0B(r5, r3)
            r13 = 1
            r24 = 2
            r0 = r24
            X.0qQ.A0B(r4, r0)
            r1 = 3
            r51 = r55
            r0 = r51
            X.0qQ.A0B(r0, r1)
            r21 = 5
            r52 = r54
            r1 = r52
            r0 = r21
            X.0qQ.A0B(r1, r0)
            boolean r0 = r4 instanceof X.AnonymousClass3Zm
            r6 = 8
            if (r0 == 0) goto L_0x002f
            android.view.ViewGroup r0 = r5.A00
            r0.setVisibility(r6)
            return
        L_0x002f:
            X.3Za r4 = (X.C243503Za) r4
            X.3YB r0 = r4.A0A
            r50 = r0
            r10 = r53
            X.3Wa r0 = r10.A04
            r49 = r0
            X.3ZH r0 = r4.A09
            r22 = r0
            r37 = r58
            r2 = r0
            r1 = r49
            r0 = r37
            r1.Cy5(r2, r0)
            X.2kQ r23 = X.C227942kP.A00(r52)
            r0 = r50
            X.3Zu r0 = r0.A01
            r19 = r0
            if (r0 != 0) goto L_0x005d
            X.3Zv r1 = X.C243683Zu.A0E
            android.content.Context r0 = r10.A01
            X.3Zu r19 = r1.A01(r0)
        L_0x005d:
            X.9IT r12 = r4.A02
            java.lang.Object r2 = r12.A05
            X.0sL r2 = (X.0sL) r2
            android.view.ViewGroup r0 = r5.A00
            r48 = r0
            r1 = r0
            r0 = r23
            r2.invoke(r1, r0)
            boolean r2 = r4.A0N
            X.3oV r0 = r5.A0W
            r47 = r0
            android.view.View r1 = r47.getView()
            if (r2 == 0) goto L_0x016b
            r0 = 2131434096(0x7f0b1a70, float:1.8489996E38)
            android.view.View r7 = r1.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00b2
            android.content.Context r1 = r10.A01
            android.content.res.Resources r2 = r1.getResources()
            r0 = 2131954020(0x7f130964, float:1.9544527E38)
            java.lang.String r2 = r2.getString(r0)
            X.0qQ.A07(r2)
            android.content.res.Resources r1 = r1.getResources()
            r0 = 2131954019(0x7f130963, float:1.9544525E38)
            java.lang.String r1 = r1.getString(r0)
            X.0qQ.A07(r1)
            r0 = 3254(0xcb6, float:4.56E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            X.0qQ.A0A(r0)
            X.AnonymousClass7AV.A01(r0, r7, r1, r2)
        L_0x00b2:
            android.view.View r0 = r47.getView()
            r0.setVisibility(r3)
        L_0x00b9:
            r0 = r48
            r0.setVisibility(r3)
            android.widget.TextView r2 = r5.A0F
            r0 = r24
            r2.setMaxLines(r0)
            r2.setSingleLine(r3)
            android.widget.TextView r0 = r5.A0G
            r46 = r0
            r8 = 0
            r0.setCompoundDrawables(r8, r8, r8, r8)
            android.widget.TextView r0 = r5.A0H
            r45 = r0
            r0.setCompoundDrawables(r8, r8, r8, r8)
            r0 = r46
            r0.setCompoundDrawablePadding(r3)
            r0 = r45
            r0.setCompoundDrawablePadding(r3)
            r5.A06 = r4
            X.3W1 r0 = r5.A08
            if (r0 == 0) goto L_0x00ea
            r0.A0M(r5, r8, r3)
        L_0x00ea:
            r0 = r50
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x00f8
            X.3ZE r0 = r4.A0C
            boolean r0 = X.AnonymousClass9IU.A00(r3, r0)
            if (r0 == 0) goto L_0x00fd
        L_0x00f8:
            r0 = r37
            r0.A0L(r5, r8, r3)
        L_0x00fd:
            r0 = r37
            r5.A08 = r0
            r0 = r50
            r5.A05 = r0
            boolean r0 = r0.A06
            r20 = r0
            android.view.View r0 = r5.A0D
            r44 = r0
            if (r20 == 0) goto L_0x0167
            r0.setVisibility(r6)
        L_0x0112:
            int r0 = r48.getHeight()
            if (r0 != 0) goto L_0x012c
            android.view.ViewGroup$LayoutParams r0 = r48.getLayoutParams()
            if (r0 == 0) goto L_0x012c
            android.view.ViewGroup$LayoutParams r1 = r48.getLayoutParams()
            if (r1 == 0) goto L_0x0ee4
            r0 = -2
            r1.height = r0
            r0 = r48
            r0.setLayoutParams(r1)
        L_0x012c:
            r5.A07 = r8
            X.4lj r0 = new X.4lj
            r7 = r37
            r1 = r51
            r0.<init>(r1, r10, r4, r7)
            X.9IP r9 = r4.A01
            X.0eM r1 = r1.A06
            java.lang.Object r7 = r1.getValue()
            X.3am r7 = (X.C244183am) r7
            X.0qQ.A0B(r9, r13)
            r1 = r24
            X.0qQ.A0B(r7, r1)
            r1 = 4
            r11 = r19
            X.0qQ.A0B(r11, r1)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = r5.A04
            if (r1 != 0) goto L_0x0170
            X.3oV r1 = r5.A0M
            android.view.View r1 = r1.getView()
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r1 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r1
            r5.A04 = r1
            if (r1 != 0) goto L_0x0170
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0167:
            r0.setVisibility(r3)
            goto L_0x0112
        L_0x016b:
            r1.setVisibility(r6)
            goto L_0x00b9
        L_0x0170:
            X.AnonymousClass0fU.A00(r0, r1)
            r1.setVisibility(r3)
            r0 = r11
            int r11 = r11.A03
            r1.setNormalColor(r11)
            int r0 = r0.A02
            r1.setActiveColor(r0)
            X.3ZB r0 = r7.A00
            X.3Wa r0 = r0.A00
            java.lang.Object r7 = r9.A01
            X.1Xj r7 = (X.1Xj) r7
            r0.DQd(r1, r7)
            X.9IZ r0 = r4.A03
            r9 = 0
            X.0qQ.A0B(r0, r13)
            r25 = 3
            java.lang.Object r1 = r0.A00
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 == r3) goto L_0x037b
            if (r1 != r13) goto L_0x0ede
            X.0eM r1 = r5.A0g
        L_0x01a2:
            java.lang.Object r7 = r1.getValue()
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0377
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r11, r1)
            r7.setColorFilter(r0)
        L_0x01b6:
            r7.setVisibility(r9)
            X.4lk r9 = new X.4lk
            r9.<init>(r10, r4)
            com.instagram.common.session.UserSession r11 = r10.A03
            X.4lm r7 = X.C272994ll.A00(r11)
            r0 = r25
            X.0qQ.A0B(r7, r0)
            com.instagram.igds.components.button.IgdsButton r15 = r5.A00()
            X.Jvg r1 = r4.A07
            boolean r0 = r1.A00
            r14 = 8
            if (r0 == 0) goto L_0x01d6
            r14 = 0
        L_0x01d6:
            r15.setVisibility(r14)
            com.instagram.igds.components.button.IgdsButton r14 = r5.A00()
            X.4ly r0 = new X.4ly
            r0.<init>(r9, r7, r5, r4)
            X.AnonymousClass0fU.A00(r0, r14)
            com.instagram.igds.components.button.IgdsButton r0 = r5.A00()
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x0373
            X.4lo r1 = X.C273014lo.LABEL_INVERTED_ON_MEDIA
        L_0x01ef:
            r0.setStyle(r1)
            com.instagram.igds.components.button.IgdsButton r0 = r5.A00()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0211
            java.lang.Integer r9 = X.AnonymousClass05K.A07
            com.instagram.user.model.User r0 = r4.A0F
            java.lang.String r1 = r0.getId()
            r0 = r22
            X.1Xj r0 = r0.A01
            java.lang.String r0 = r0.A2n()
            if (r0 == 0) goto L_0x0ed6
            r7.A09(r1, r9, r0)
        L_0x0211:
            X.9cQ r1 = r4.A08
            r38 = r59
            if (r1 == 0) goto L_0x037f
            android.content.Context r14 = r10.A01
            r7 = 4
            X.3oV r9 = r5.A0V
            r9.setVisibility(r3)
            android.view.View r4 = r9.getView()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r4 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r4
            X.3Nl r0 = X.C240993Nl.HASHTAG
            r4.A03(r0)
            android.view.View r4 = r9.getView()
            com.instagram.ui.widget.badgeicon.BadgeIconView r4 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.setBorderWidth(r0)
            java.lang.Object r12 = r1.A01
            com.instagram.model.hashtag.Hashtag r12 = (com.instagram.model.hashtag.Hashtag) r12
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = r5.Bkt()
            r0 = r24
            X.0qQ.A0B(r4, r0)
            r4.setVisibility(r7)
            com.instagram.common.ui.widget.imageview.CircularImageView r10 = r5.A0I
            r0 = r23
            X.C18767W0m.A03(r0, r10, r12)
            X.ICE r0 = new X.ICE
            r24 = r0
            r25 = r1
            r26 = r49
            r27 = r37
            r28 = r12
            r29 = r38
            r24.<init>(r25, r26, r27, r28, r29)
            X.AnonymousClass0fU.A00(r0, r10)
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>()
            if (r12 == 0) goto L_0x0281
            java.lang.String r0 = "#"
            r9.append(r0)
            java.lang.String r0 = r12.getName()
            r9.append(r0)
            X.3a9 r7 = new X.3a9
            r7.<init>()
            int r4 = r9.length()
            r0 = 33
            r9.setSpan(r7, r3, r4, r0)
        L_0x0281:
            r2.setText(r9)
            X.ICF r0 = new X.ICF
            r24 = r0
            r24.<init>(r25, r26, r27, r28, r29)
            X.AnonymousClass0fU.A00(r0, r2)
            r4 = 2131973002(0x7f13538a, float:1.9583027E38)
            java.lang.String r0 = r12.getName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r14.getString(r4, r0)
            r10.setContentDescription(r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.String r0 = r1.A04
            r4.append(r0)
            X.GdM r9 = new X.GdM
            r16 = r9
            r17 = r1
            r18 = r11
            r20 = r49
            r21 = r37
            r22 = r38
            r16.<init>(r17, r18, r19, r20, r21, r22)
            int r7 = r4.length()
            r0 = 17
            r4.setSpan(r9, r3, r7, r0)
            java.lang.Object r9 = r1.A02
            X.DQT r9 = (X.DQT) r9
            boolean r0 = r9 instanceof X.BIU
            if (r0 == 0) goto L_0x033b
            java.lang.String r0 = " • "
            r4.append(r0)
            X.BIU r9 = (X.BIU) r9
            java.util.List r7 = r9.A00
            boolean r0 = r9.A01
            android.text.SpannableStringBuilder r0 = X.C49946FGa.A01(r14, r7, r0)
            r4.append(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            java.lang.Object r0 = r1.A03
            X.3ZT r0 = (X.AnonymousClass3ZT) r0
            X.1Xj r7 = r0.A00
            r0 = r23
            X.JVF.A00(r0, r11, r7, r9)
            X.LSV.A01(r46)
        L_0x02ee:
            r0 = r46
            r0.setText(r4)
            r0.setVisibility(r3)
            android.text.method.MovementMethod r3 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r3)
            r0.setSingleLine(r13)
            r0.setOnClickListener(r8)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r4 = r5.Bkt()
            boolean r3 = r1.A06
            r0 = 6
            X.0qQ.A0B(r4, r0)
            android.view.ViewTreeObserver r1 = r48.getViewTreeObserver()
            X.4m3 r0 = new X.4m3
            r12 = r0
            r13 = r10
            r14 = r4
            r15 = r48
            r16 = r2
            r17 = r46
            r18 = r11
            r19 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.addOnPreDrawListener(r0)
            X.3oV r0 = r5.A0X
            r0.setVisibility(r6)
            X.3oV r0 = r5.A0Y
            r0.setVisibility(r6)
            r5.A0A = r8
            X.0nA.A0O(r45)
            r0 = r46
            X.03v.A0B(r0, r8)
            return
        L_0x033b:
            boolean r0 = r9 instanceof X.BIV
            if (r0 == 0) goto L_0x0365
            X.BIV r9 = (X.BIV) r9
            boolean r12 = r9.A02
            java.lang.Integer r7 = r9.A00
            java.lang.String r9 = r9.A01
            r0 = r19
            int r14 = r0.A08
            int r15 = r0.A04
            java.lang.Object r0 = r1.A03
            X.3ZT r0 = (X.AnonymousClass3ZT) r0
            r16 = r4
            r17 = r49
            r18 = r0
            r19 = r7
            r20 = r9
            r21 = r14
            r22 = r15
            r23 = r12
            X.C253153qI.A0B(r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x02ee
        L_0x0365:
            X.DHO r0 = X.DHO.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x02ee
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0373:
            X.4lo r1 = X.C273014lo.SECONDARY
            goto L_0x01ef
        L_0x0377:
            r9 = 8
            goto L_0x01b6
        L_0x037b:
            X.0eM r1 = r5.A0f
            goto L_0x01a2
        L_0x037f:
            X.3oV r0 = r5.A0V
            r43 = r0
            r0.setVisibility(r6)
            com.instagram.user.model.User r0 = r4.A0F
            r42 = r0
            boolean r0 = r4.A0O
            r17 = r0
            java.lang.Object r7 = r12.A08
            X.0sK r7 = (X.0sK) r7
            r1 = r50
            r0 = r52
            java.lang.Object r0 = r7.invoke(r1, r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r18 = r0.booleanValue()
            com.instagram.model.reels.Reel r9 = r4.A0E
            java.lang.Object r1 = r12.A0D
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r10.A05
            r16 = r0
            java.lang.Object r7 = r1.invoke(r0)
            com.instagram.model.reels.Reel r7 = (com.instagram.model.reels.Reel) r7
            boolean r0 = r4.A0P
            if (r0 == 0) goto L_0x0865
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x03bb
            r0.setVisibility(r6)
        L_0x03bb:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r1 = r5.Bkt()
            r0 = r24
            X.0qQ.A0B(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
        L_0x03c8:
            java.lang.Object r7 = r12.A0H
            X.0sK r7 = (X.0sK) r7
            r1 = r50
            r0 = r52
            java.lang.Object r27 = r7.invoke(r1, r4, r0)
            r0 = r27
            X.3a0 r0 = (X.C243733a0) r0
            r27 = r0
            r0 = r19
            int r0 = r0.A09
            r14 = r0
            r2.setTextColor(r0)
            X.3ZE r1 = r4.A0C
            boolean r0 = X.AnonymousClass9IU.A00(r13, r1)
            if (r0 == 0) goto L_0x0687
            android.content.Context r0 = r10.A01
            r15 = r0
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.mediaheader.domain.uistate.MediaHeaderUiState.ClipsSpinsHeaderType"
            X.0qQ.A0C(r1, r0)
            X.9IU r1 = (X.AnonymousClass9IU) r1
            java.lang.Object r7 = r1.A01
            X.N4R r7 = (X.N4R) r7
            r0 = r51
            X.0eM r0 = r0.A01
            java.lang.Object r9 = r0.getValue()
            X.Him r9 = (X.C55504Him) r9
            r0 = r22
            X.1Xj r0 = r0.A01
            int r35 = r37.getPosition()
            r28 = r15
            r29 = r7
            r30 = r11
            r31 = r0
            r32 = r9
            r33 = r37
            r34 = r14
            android.text.SpannableStringBuilder r0 = X.C253153qI.A00(r28, r29, r30, r31, r32, r33, r34, r35)
            r2.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r0)
            java.lang.Object r9 = r1.A02
            X.9Iy r9 = (X.C376689Iy) r9
            r0 = r51
            X.0eM r0 = r0.A04
            java.lang.Object r7 = r0.getValue()
            X.53Y r7 = (X.AnonymousClass53Y) r7
            int r35 = r37.getPosition()
            java.lang.Object r1 = r12.A01
            X.0sL r1 = (X.0sL) r1
            r0 = r23
            java.lang.String r14 = r0.A00
            java.lang.Object r0 = r1.invoke(r15, r14)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r28 = r0
            r29 = r9
            r31 = r5
            r32 = r7
            r34 = r14
            X.C2806953a.A00(r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x0453:
            r0 = r27
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0650
            java.lang.CharSequence r0 = r2.getText()
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>(r0)
            android.content.Context r9 = r10.A01
            r0 = r27
            long r0 = r0.A00
            r7 = r19
            X.C253153qI.A07(r9, r14, r7, r0)
            r2.setText(r14)
        L_0x0470:
            X.3ZU r1 = r4.A0B
            r0 = r51
            X.0eM r0 = r0.A09
            java.lang.Object r26 = r0.getValue()
            r0 = r26
            X.3aU r0 = (X.C244003aU) r0
            r26 = r0
            r0 = r24
            X.0qQ.A0B(r1, r0)
            r7 = r25
            r0 = r26
            X.0qQ.A0B(r0, r7)
            X.0nA.A0O(r46)
            X.0nA.A0O(r45)
            X.3oV r0 = r5.A0L
            r41 = r0
            boolean r0 = r41.CVM()
            if (r0 == 0) goto L_0x04be
            X.0eM r0 = r5.A0b
            r14 = r0
            java.lang.Object r7 = r0.getValue()
            com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout r7 = (com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout) r7
            android.view.View$OnAttachStateChangeListener r0 = r7.A02
            if (r0 == 0) goto L_0x04ac
            r7.removeOnAttachStateChangeListener(r0)
        L_0x04ac:
            java.lang.Object r0 = r14.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            java.lang.Object r0 = r14.getValue()
            android.view.View r0 = (android.view.View) r0
            X.0nA.A0O(r0)
        L_0x04be:
            X.3ZS r0 = r1.A03
            r40 = r0
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x05d5
            java.util.List r7 = r1.A0A
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04ed
            java.lang.Object r0 = r7.get(r3)
            X.3py r0 = (X.C252953py) r0
            r27 = r9
            r28 = r46
            r29 = r52
            r30 = r11
            r31 = r19
            r32 = r26
            r33 = r0
            r34 = r50
            r35 = r49
            r36 = r1
            X.AnonymousClass50U.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x04ed:
            int r0 = r7.size()
            if (r0 <= r13) goto L_0x0510
            java.lang.Object r0 = r7.get(r13)
            X.3py r0 = (X.C252953py) r0
            r27 = r9
            r28 = r45
            r29 = r52
            r30 = r11
            r31 = r19
            r32 = r26
            r33 = r0
            r34 = r50
            r35 = r49
            r36 = r1
            X.AnonymousClass50U.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0510:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r5.A0I
            r35 = r0
            com.instagram.ui.widget.gradientspinner.GradientSpinner r14 = r5.Bkt()
            boolean r7 = r4.A0K
            r1 = r0
            r0 = r21
            X.0qQ.A0B(r1, r0)
            r0 = 6
            X.0qQ.A0B(r14, r0)
            android.view.ViewTreeObserver r1 = r48.getViewTreeObserver()
            X.4m3 r0 = new X.4m3
            r25 = r0
            r26 = r35
            r27 = r14
            r28 = r48
            r29 = r2
            r30 = r46
            r31 = r11
            r32 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r1.addOnPreDrawListener(r0)
            X.3oV r0 = r5.A0J
            r34 = r0
            java.lang.Object r1 = r12.A07
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r52.getModuleName()
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r14 = r0.booleanValue()
            java.lang.Object r1 = r12.A09
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = r52.getModuleName()
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r0 = r34
            X.0qQ.A0B(r0, r3)
            if (r14 == 0) goto L_0x05d1
            r0.setVisibility(r3)
            android.view.View r0 = r34.getView()
            X.0nA.A0c(r0, r3)
            android.view.View r0 = r34.getView()
            X.0nA.A0X(r0, r3)
            android.view.View r1 = r34.getView()
            X.AN1 r0 = new X.AN1
            r0.<init>(r4)
            X.AnonymousClass0fU.A00(r0, r1)
            if (r7 == 0) goto L_0x05af
            android.view.View r7 = r34.getView()
            r0 = 50
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r7, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            android.view.View r0 = r34.getView()
            android.content.Context r1 = r0.getContext()
            r0 = 2131962349(0x7f1329ed, float:1.956142E38)
            java.lang.String r0 = r1.getString(r0)
            r7.setText(r0)
        L_0x05af:
            java.lang.Object r1 = r12.A0E
            X.0sP r1 = (X.0sP) r1
            r0 = r52
            java.lang.Object r14 = r1.invoke(r0)
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r7 = r5.A04
            if (r7 != 0) goto L_0x094c
            X.3oV r0 = r5.A0M
            android.view.View r7 = r0.getView()
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r7 = (com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView) r7
            r5.A04 = r7
            if (r7 != 0) goto L_0x094c
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x05d1:
            r0.setVisibility(r6)
            goto L_0x05af
        L_0x05d5:
            java.util.List r0 = r1.A0A
            java.util.Iterator r25 = r0.iterator()
        L_0x05db:
            boolean r0 = r25.hasNext()
            if (r0 == 0) goto L_0x0628
            java.lang.Object r16 = r25.next()
            r0 = r16
            X.3py r0 = (X.C252953py) r0
            r16 = r0
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r9)
            r15 = 2131629101(0x7f0e142d, float:1.8885513E38)
            X.0eM r0 = r5.A0b
            r39 = r0
            java.lang.Object r14 = r39.getValue()
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            android.view.View r7 = r7.inflate(r15, r14, r3)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r7, r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r27 = r9
            r28 = r7
            r29 = r52
            r30 = r11
            r31 = r19
            r32 = r26
            r33 = r16
            r34 = r50
            r35 = r49
            r36 = r1
            X.AnonymousClass50U.A00(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            java.lang.Object r0 = r39.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r7)
            goto L_0x05db
        L_0x0628:
            X.0eM r0 = r5.A0b
            java.lang.Object r7 = r0.getValue()
            com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout r7 = (com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout) r7
            r7.setVisibility(r3)
            r7.setVisibleIndex(r3)
            X.9Vk r0 = new X.9Vk
            r0.<init>(r1)
            X.AnonymousClass0fU.A00(r0, r7)
            r0 = r40
            long r0 = r0.A00
            r7.A01 = r0
            X.Mf4 r0 = new X.Mf4
            r0.<init>(r7)
            r7.addOnAttachStateChangeListener(r0)
            r7.A02 = r0
            goto L_0x0510
        L_0x0650:
            android.content.Context r9 = r10.A01
            r0 = r27
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x065f
            X.3oV r0 = r5.A0R
            r0.setVisibility(r6)
            goto L_0x0470
        L_0x065f:
            X.3oV r0 = r5.A0R
            android.view.View r7 = r0.getView()
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setVisibility(r3)
            android.content.res.Resources r14 = r9.getResources()
            X.0qQ.A07(r14)
            r0 = r27
            long r0 = r0.A00
            double r15 = (double) r0
            r0 = r15
            java.lang.String r0 = X.1G0.A09(r14, r0)
            r7.setText(r0)
            r0 = r19
            int r0 = r0.A05
            r7.setTextColor(r0)
            goto L_0x0470
        L_0x0687:
            r0 = r24
            boolean r0 = X.AnonymousClass9IU.A00(r0, r1)
            if (r0 == 0) goto L_0x073a
            X.9IU r1 = (X.AnonymousClass9IU) r1
            java.lang.Object r7 = r1.A01
            X.9bp r7 = (X.C381479bp) r7
            java.lang.Object r0 = r1.A02
            r16 = r0
            r0 = r16
            X.9Iy r0 = (X.C376689Iy) r0
            r16 = r0
            r0 = r51
            X.0eM r0 = r0.A04
            java.lang.Object r9 = r0.getValue()
            X.53Y r9 = (X.AnonymousClass53Y) r9
            r0 = r51
            X.0eM r0 = r0.A02
            java.lang.Object r15 = r0.getValue()
            r0 = r15
            X.53Z r0 = (X.AnonymousClass53Z) r0
            r15 = r0
            r0 = r23
            java.lang.String r0 = r0.A00
            r26 = r0
            java.lang.Object r14 = r12.A02
            X.0sL r14 = (X.0sL) r14
            android.content.Context r0 = r10.A01
            r1 = r0
            r0 = r26
            java.lang.Object r0 = r14.invoke(r1, r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r28 = r0
            r29 = r16
            r30 = r11
            r31 = r5
            r32 = r9
            r33 = r37
            r34 = r26
            r35 = r38
            X.C2806953a.A00(r28, r29, r30, r31, r32, r33, r34, r35)
            int r33 = r37.getPosition()
            r28 = r1
            r29 = r11
            r30 = r19
            r31 = r15
            r32 = r7
            android.text.SpannableStringBuilder r0 = X.C253153qI.A01(r28, r29, r30, r31, r32, r33)
            r2.setText(r0)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r2.setMovementMethod(r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36325987281286593(0x810e4b000435c1, double:3.036038857471179E-306)
            boolean r0 = X.182.A06(r9, r11, r0)
            if (r0 == 0) goto L_0x072c
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r1, r0)
            X.2dQ r1 = (X.C71492dQ) r1
            r0 = 2131440423(0x7f0b3327, float:1.8502829E38)
            r1.A0N = r0
            r2.setLayoutParams(r1)
            int r0 = r2.getPaddingLeft()
            int r14 = r2.getPaddingTop()
            int r9 = r2.getPaddingLeft()
            int r1 = r2.getPaddingBottom()
            r2.setPadding(r0, r14, r9, r1)
        L_0x072c:
            int r1 = r7.A00
            r2.setMaxLines(r1)
            r0 = 1
            if (r1 == r13) goto L_0x0735
            r0 = 0
        L_0x0735:
            r2.setSingleLine(r0)
            goto L_0x0453
        L_0x073a:
            boolean r0 = X.AnonymousClass9IU.A00(r3, r1)
            if (r0 == 0) goto L_0x0760
            r28 = r11
            r29 = r23
            r30 = r51
            r31 = r10
            r32 = r5
            r33 = r4
            r34 = r37
            r35 = r38
            A00(r28, r29, r30, r31, r32, r33, r34, r35)
            X.IUd r0 = new X.IUd
            r28 = r0
            r34 = r38
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r5.A07 = r0
            goto L_0x0453
        L_0x0760:
            boolean r0 = r1 instanceof X.C243793a7
            if (r0 == 0) goto L_0x0803
            X.3a7 r1 = (X.C243793a7) r1
            X.9J2 r1 = r1.A00
            if (r1 == 0) goto L_0x0453
        L_0x076a:
            android.content.Context r0 = r10.A01
            r35 = r0
            java.lang.Object r15 = r12.A0G
            X.0sJ r15 = (X.0sJ) r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r38)
            r14 = r37
            r9 = r23
            r7 = r0
            r0 = r16
            java.lang.Object r0 = r15.invoke(r14, r0, r9, r7)
            X.9J2 r0 = (X.AnonymousClass9J2) r0
            r28 = r35
            r29 = r0
            r30 = r11
            r31 = r9
            r32 = r5
            r33 = r14
            r34 = r38
            X.C273104lz.A00(r28, r29, r30, r31, r32, r33, r34)
            r0 = r50
            java.lang.Integer r0 = r0.A03
            r28 = r0
            r0 = r25
            X.0qQ.A0B(r1, r0)
            r26 = 6
            r7 = r42
            r0 = r26
            X.0qQ.A0B(r7, r0)
            X.3aa r0 = X.C244063aa.TITLE
            X.C244083ac.A05(r2, r0)
            boolean r0 = r42.A2Q()
            if (r0 == 0) goto L_0x080d
            java.lang.String r0 = r1.A04
            if (r0 == 0) goto L_0x07ba
            r2.setText(r0)
        L_0x07ba:
            java.lang.CharSequence r0 = r2.getText()
            android.text.SpannableStringBuilder r16 = new android.text.SpannableStringBuilder
            r7 = r0
            r0 = r16
            r0.<init>(r7)
            boolean r0 = r42.isVerified()
            r15 = r35
            r14 = r19
            r9 = r0
            r7 = r28
            r0 = r16
            X.AnonymousClass3ZI.A02(r15, r0, r14, r7, r9)
            r2.setText(r0)
            r7 = 41
            X.9Ls r14 = new X.9Ls
            r0 = r37
            r14.<init>(r7, r0, r1)
            X.9M6 r15 = new X.9M6
            r9 = r38
            r7 = r26
            r0 = r51
            r15.<init>((X.AnonymousClass9J2) r1, (X.C243613Zn) r0, (int) r9, (int) r7)
            X.3aW r0 = new X.3aW
            r28 = r0
            r29 = r11
            r30 = r8
            r31 = r14
            r32 = r15
            r33 = r13
            r28.<init>(r29, r30, r31, r32, r33)
            X.AnonymousClass0fU.A00(r0, r2)
            goto L_0x0453
        L_0x0803:
            boolean r0 = r1 instanceof X.AnonymousClass3ZD
            if (r0 == 0) goto L_0x0ebe
            X.3ZD r1 = (X.AnonymousClass3ZD) r1
            X.9J2 r1 = r1.A00
            goto L_0x076a
        L_0x080d:
            java.lang.Object r14 = r1.A03
            android.text.SpannableStringBuilder r14 = (android.text.SpannableStringBuilder) r14
            boolean r0 = r42.isVerified()
            r15 = r35
            r9 = r19
            r7 = r28
            X.AnonymousClass3ZI.A02(r15, r14, r9, r7, r0)
            X.3a9 r0 = new X.3a9
            r0.<init>()
            int r9 = r14.length()
            r7 = 33
            r14.setSpan(r0, r3, r9, r7)
            r2.setText(r14)
            r7 = 39
            X.9Ls r14 = new X.9Ls
            r0 = r37
            r14.<init>(r7, r0, r1)
            X.9M6 r15 = new X.9M6
            r9 = r38
            r7 = r21
            r0 = r51
            r15.<init>((X.AnonymousClass9J2) r1, (X.C243613Zn) r0, (int) r9, (int) r7)
            X.3aW r0 = new X.3aW
            r28 = r0
            r29 = r11
            r30 = r8
            r31 = r14
            r32 = r15
            r33 = r13
            r28.<init>(r29, r30, r31, r32, r33)
            X.AnonymousClass0fU.A00(r0, r2)
            X.4m2 r9 = new X.4m2
            r7 = r52
            r0 = r51
            r9.<init>(r1, r7, r0)
            r2.setOnTouchListener(r9)
            goto L_0x0453
        L_0x0865:
            if (r7 == 0) goto L_0x091a
            android.view.View r1 = r5.A00
            if (r1 != 0) goto L_0x0873
            X.3oV r0 = r5.A0Q
            android.view.View r1 = r0.getView()
            r5.A00 = r1
        L_0x0873:
            android.view.View r0 = r5.A01
            java.lang.String r9 = "Required value was null."
            if (r0 != 0) goto L_0x0884
            if (r1 == 0) goto L_0x0ed0
            r0 = 2131428564(0x7f0b04d4, float:1.8478776E38)
            android.view.View r0 = r1.requireViewById(r0)
            r5.A01 = r0
        L_0x0884:
            android.widget.ImageView r0 = r5.A02
            if (r0 != 0) goto L_0x0897
            android.view.View r1 = r5.A00
            if (r1 == 0) goto L_0x0eca
            r0 = 2131428569(0x7f0b04d9, float:1.8478786E38)
            android.view.View r0 = r1.requireViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A02 = r0
        L_0x0897:
            android.widget.TextView r0 = r5.A03
            if (r0 != 0) goto L_0x08aa
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0ec4
            r1 = 2131428571(0x7f0b04db, float:1.847879E38)
            android.view.View r0 = r0.requireViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A03 = r0
        L_0x08aa:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x08b1
            r0.setVisibility(r3)
        L_0x08b1:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r5.Bkt()
            r0.setVisibility(r3)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r5.Bkt()
            r0.A02()
            com.instagram.ui.widget.gradientspinner.GradientSpinner r14 = r5.Bkt()
            X.3NV r9 = r7.A0E()
            X.4gL r0 = r7.A0H
            if (r0 == 0) goto L_0x08da
            X.4w0 r0 = r0.A02
            if (r0 == 0) goto L_0x08da
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x08da
            boolean r0 = r0.CVs()
            r1 = 1
            if (r0 == r13) goto L_0x08db
        L_0x08da:
            r1 = 0
        L_0x08db:
            X.AnonymousClass3NW.A03(r14, r9, r1)
            X.3NV r29 = r7.A0E()
            boolean r0 = r7.A0j()
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r0)
            X.4gL r0 = r7.A0H
            if (r0 == 0) goto L_0x08fd
            X.4w0 r0 = r0.A02
            if (r0 == 0) goto L_0x08fd
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x08fd
            boolean r0 = r0.CVs()
            r1 = 1
            if (r0 == r13) goto L_0x08fe
        L_0x08fd:
            r1 = 0
        L_0x08fe:
            java.lang.Boolean r31 = java.lang.Boolean.valueOf(r1)
            android.view.View r7 = r5.A01
            android.widget.ImageView r1 = r5.A02
            android.widget.TextView r0 = r5.A03
            r26 = r7
            r27 = r1
            r28 = r0
            X.C278194wQ.A00(r26, r27, r28, r29, r30, r31)
            java.lang.Object r0 = r12.A0J
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            goto L_0x03c8
        L_0x091a:
            android.view.View r0 = r5.A00
            if (r0 == 0) goto L_0x0921
            r0.setVisibility(r6)
        L_0x0921:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r5.Bkt()
            boolean r1 = r10.A08
            r0 = r24
            X.0qQ.A0B(r7, r0)
            if (r9 == 0) goto L_0x0946
            if (r1 != 0) goto L_0x0946
            r7.setVisibility(r3)
            X.AnonymousClass3NW.A02(r11, r9, r7)
            boolean r0 = r9.A16(r11)
            if (r0 == 0) goto L_0x0941
            r7.A04()
            goto L_0x03c8
        L_0x0941:
            r7.A02()
            goto L_0x03c8
        L_0x0946:
            r0 = 4
            r7.setVisibility(r0)
            goto L_0x03c8
        L_0x094c:
            java.lang.Object r1 = r12.A0B
            X.0sK r1 = (X.0sK) r1
            androidx.fragment.app.FragmentActivity r0 = r10.A02
            r30 = r0
            r1.invoke(r14, r0, r7)
            X.9IP r7 = r4.A00
            r0 = r51
            X.0eM r0 = r0.A05
            java.lang.Object r14 = r0.getValue()
            X.4m5 r14 = (X.C273164m5) r14
            r0 = r50
            boolean r0 = r0.A07
            r31 = r0
            r0 = r24
            X.0qQ.A0B(r7, r0)
            r25 = 3
            r0 = r25
            X.0qQ.A0B(r14, r0)
            X.0eM r0 = r5.A0d
            java.lang.Object r1 = r0.getValue()
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x09e5
            if (r31 == 0) goto L_0x09cc
            r15 = 2131238844(0x7f081fbc, float:1.8093978E38)
            r0 = -1
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3JT.A05(r9, r15, r0)
        L_0x098b:
            r1.setVisibility(r3)
            r1.setImageDrawable(r0)
            X.AOC r0 = new X.AOC
            r15 = r37
            r0.<init>(r7, r14, r15)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x099b:
            X.9IZ r1 = r4.A04
            if (r22 == 0) goto L_0x09c9
            r0 = r22
            X.3ZG r0 = r0.A00
            java.lang.String r33 = r0.getId()
        L_0x09a7:
            r0 = r21
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r1.A03
            r32 = r0
            r0 = r32
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r32 = r0
            if (r0 == 0) goto L_0x0c07
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0be6;
                case 1: goto L_0x0bcb;
                case 2: goto L_0x0bac;
                case 3: goto L_0x0a7c;
                case 4: goto L_0x0a67;
                case 5: goto L_0x09e9;
                default: goto L_0x09c3;
            }
        L_0x09c3:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x09c9:
            r33 = r8
            goto L_0x09a7
        L_0x09cc:
            r16 = 2131238834(0x7f081fb2, float:1.8093958E38)
            r0 = r21
            int[] r0 = new int[r0]
            r26 = r0
            r0 = 2132017754(0x7f14025a, float:1.9673795E38)
            r15 = r0
            r0 = r26
            X.C267014am.A03(r9, r8, r0, r15)
            r15 = r16
            android.graphics.drawable.BitmapDrawable r0 = X.AnonymousClass3JT.A04(r9, r0, r15)
            goto L_0x098b
        L_0x09e5:
            r1.setVisibility(r6)
            goto L_0x099b
        L_0x09e9:
            X.0eM r0 = r5.A0e
            java.lang.Object r7 = r0.getValue()
            android.view.View r7 = (android.view.View) r7
            r7.setVisibility(r3)
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x0a5a
            r0 = 2131437285(0x7f0b26e5, float:1.8496464E38)
            android.view.View r1 = r7.requireViewById(r0)
            X.0qQ.A07(r1)
            X.1q7 r0 = X.C318996ps.A00()
            r0.A03()
            r0 = 2131968843(0x7f13434b, float:1.9574592E38)
            java.lang.String r0 = r9.getString(r0)
            X.0qQ.A07(r0)
            r1.setContentDescription(r0)
            X.U79 r0 = new X.U79
            r0.<init>()
            X.03v.A0B(r1, r0)
            java.lang.String r1 = r32.getId()
            java.lang.String r0 = r11.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0a49
            X.1q7 r0 = X.C318996ps.A00()
            boolean r0 = r0.A04(r11)
            if (r0 == 0) goto L_0x0a49
            if (r30 == 0) goto L_0x0a49
            X.1q7 r0 = X.C318996ps.A00()
            X.FBp r14 = r0.A01()
            java.lang.String r1 = r32.getUsername()
            r0 = r30
            r14.A01(r0, r7, r11, r1)
        L_0x0a49:
            X.1q7 r0 = X.C318996ps.A00()
            X.F1V r14 = r0.A02()
            java.lang.String r1 = r32.getId()
            r0 = r33
            r14.A00(r11, r1, r0)
        L_0x0a5a:
            X.IBG r14 = new X.IBG
            r15 = r49
            r1 = r33
            r0 = r30
            r14.<init>(r0, r15, r1)
            goto L_0x0ba1
        L_0x0a67:
            X.0eM r0 = r5.A0c
            java.lang.Object r1 = r0.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r3)
            r0 = r31
            X.FC9.A01(r9, r1, r11, r0)
            r1.setOnClickListener(r8)
            goto L_0x0c07
        L_0x0a7c:
            X.0eM r0 = r5.A0a
            java.lang.Object r7 = r0.getValue()
            android.view.View r7 = (android.view.View) r7
            r7.setVisibility(r3)
            r0 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r29 = r7.requireViewById(r0)
            X.0qQ.A07(r29)
            r0 = 2131430331(0x7f0b0bbb, float:1.848236E38)
            android.view.View r21 = r7.requireViewById(r0)
            X.0qQ.A07(r21)
            r0 = r21
            android.widget.TextView r0 = (android.widget.TextView) r0
            r21 = r0
            float r1 = r21.getAlpha()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0adf
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r0 = r0.A01
            java.lang.String r1 = "close_friends_badge_animation_count"
            int r1 = r0.getInt(r1, r3)
            r0 = r25
            if (r1 >= r0) goto L_0x0adf
            long r27 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r0 = r0.A01
            java.lang.String r14 = "close_friends_badge_last_timestamp"
            r25 = 0
            r15 = r0
            r0 = r25
            long r0 = r15.getLong(r14, r0)
            long r27 = r27 - r0
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r15 = 1
            r0 = r15
            long r14 = r14.toMillis(r0)
            int r0 = (r27 > r14 ? 1 : (r27 == r14 ? 0 : -1))
            r14 = 1
            if (r0 > 0) goto L_0x0ae0
        L_0x0adf:
            r14 = 0
        L_0x0ae0:
            r0 = 2131956168(0x7f1311c8, float:1.9548884E38)
            java.lang.String r1 = r9.getString(r0)
            r0 = r29
            r0.setContentDescription(r1)
            X.U78 r1 = new X.U78
            r1.<init>()
            X.03v.A0B(r0, r1)
            if (r14 == 0) goto L_0x0ba5
            r0 = r24
            float[] r0 = new float[r0]
            r0 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r14 = android.animation.ValueAnimator.ofFloat(r0)
            r15 = 300(0x12c, double:1.48E-321)
            r0 = r15
            r14.setDuration(r0)
            r15 = 3000(0xbb8, double:1.482E-320)
            r0 = r15
            r14.setStartDelay(r0)
            X.Oec r1 = new X.Oec
            r0 = r21
            r1.<init>(r0)
            r14.addUpdateListener(r1)
            X.I7W r0 = new X.I7W
            r0.<init>(r11)
            r14.addListener(r0)
            r14.start()
        L_0x0b22:
            java.lang.String r1 = r32.getId()
            java.lang.String r0 = r11.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0b96
            X.1Av r0 = X.1Au.A00(r11)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_feed_close_friends_indicator_tooltip"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0b96
            X.0Tu r0 = X.0Tu.A05
            r15 = 36316087383035842(0x81054a00190fc2, double:3.0297781219537135E-306)
            r14 = r0
            r0 = r15
            boolean r0 = X.182.A06(r14, r11, r0)
            if (r0 == 0) goto L_0x0b96
            boolean r0 = X.JU9.A01(r11)
            if (r0 == 0) goto L_0x0b96
            if (r30 == 0) goto L_0x0b96
            android.content.res.Resources r14 = r7.getResources()
            r1 = 2131956184(0x7f1311d8, float:1.9548917E38)
            java.lang.String r0 = r32.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r14.getString(r1, r0)
            X.0qQ.A07(r0)
            X.6jx r14 = new X.6jx
            r14.<init>((java.lang.CharSequence) r0)
            X.5Gt r1 = new X.5Gt
            r0 = r30
            r1.<init>(r0, r14)
            r1.A03(r7)
            r1.A01()
            r0 = 5000(0x1388, float:7.006E-42)
            r1.A00 = r0
            r1.A0A = r13
            X.9p7 r0 = new X.9p7
            r0.<init>(r11)
            r1.A04 = r0
            X.5Gv r0 = r1.A00()
            X.FqH r14 = new X.FqH
            r14.<init>(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r7.postDelayed(r14, r0)
        L_0x0b96:
            X.IBF r14 = new X.IBF
            r15 = r49
            r1 = r33
            r0 = r30
            r14.<init>(r0, r15, r1)
        L_0x0ba1:
            X.AnonymousClass0fU.A00(r14, r7)
            goto L_0x0c07
        L_0x0ba5:
            r0 = r21
            r0.setVisibility(r6)
            goto L_0x0b22
        L_0x0bac:
            X.0eM r0 = r5.A0c
            java.lang.Object r15 = r0.getValue()
            android.view.View r15 = (android.view.View) r15
            r15.setVisibility(r3)
            r0 = r31
            X.FC9.A01(r9, r15, r11, r0)
            X.IBs r14 = new X.IBs
            r7 = r52
            r1 = r32
            r0 = r30
            r14.<init>(r0, r7, r11, r1)
            X.AnonymousClass0fU.A00(r14, r15)
            goto L_0x0c07
        L_0x0bcb:
            X.0eM r0 = r5.A0c
            java.lang.Object r14 = r0.getValue()
            android.view.View r14 = (android.view.View) r14
            r14.setVisibility(r3)
            r0 = r31
            X.FC9.A01(r9, r14, r11, r0)
            X.IBr r7 = new X.IBr
            r0 = r32
            r7.<init>(r9, r1, r11, r0)
            X.AnonymousClass0fU.A00(r7, r14)
            goto L_0x0c07
        L_0x0be6:
            X.0eM r0 = r5.A0c
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            X.0eM r0 = r5.A0a
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            X.0eM r0 = r5.A0e
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
        L_0x0c07:
            java.lang.Object r1 = r12.A0A
            X.0sP r1 = (X.0sP) r1
            r0 = r50
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0d40
            X.3oV r14 = r5.A0X
            r14.setVisibility(r6)
            X.3oV r7 = r5.A0Y
            r7.setVisibility(r6)
            r5.A0A = r8
            X.0eM r0 = r5.A0h
            java.lang.Object r11 = r0.getValue()
            android.widget.TextView r11 = (android.widget.TextView) r11
            com.instagram.user.model.User r6 = r4.A0G
            if (r6 == 0) goto L_0x0eae
            java.lang.String r1 = r6.getId()
            java.lang.String r0 = r42.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0d2f
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131976671(0x7f1361df, float:1.959047E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0c4a:
            r11.setText(r0)
            r11.setVisibility(r3)
            X.IAq r0 = new X.IAq
            r0.<init>(r10, r6)
            X.AnonymousClass0fU.A00(r0, r11)
        L_0x0c58:
            java.lang.Object r6 = r12.A0I
            X.0sL r6 = (X.0sL) r6
            r1 = r48
            r0 = r52
            r6.invoke(r1, r0)
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline_older"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0cac
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline_favorites_older"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0cac
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline_following"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0cac
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline_favorites"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0cac
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline_fan_club"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0cac
            java.lang.String r1 = r52.getModuleName()
            java.lang.String r0 = "feed_timeline"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0cad
        L_0x0cac:
            r1 = 1
        L_0x0cad:
            boolean r0 = r4.A0M
            if (r1 == 0) goto L_0x0d22
            if (r0 == 0) goto L_0x0d22
            r0 = r43
            r0.setVisibility(r3)
            android.view.View r4 = r43.getView()
            com.instagram.reels.ui.badge.ReelBrandingBadgeView r4 = (com.instagram.reels.ui.badge.ReelBrandingBadgeView) r4
            X.0qQ.A0B(r4, r13)
            X.OCf r1 = r5.A09
            if (r1 != 0) goto L_0x0cce
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.OCf r1 = new X.OCf
            r1.<init>(r8, r4, r0)
            r5.A09 = r1
        L_0x0cce:
            r6 = 1077936128(0x40400000, float:3.0)
            if (r1 == 0) goto L_0x0cec
            X.PEo r1 = r1.A01
            X.TtN r4 = r1.A00
            float r0 = r4.A00
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0cde
            r4.A00 = r6
        L_0x0cde:
            r1.A00()
            r1 = 1076258406(0x40266666, float:2.6)
            float r0 = r4.A00
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0cec
            r4.A00 = r1
        L_0x0cec:
            android.view.View r0 = r43.getView()
            com.instagram.ui.widget.badgeicon.BadgeIconView r0 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r0
            r0.setTranslationXFactor(r6)
            android.view.View r1 = r43.getView()
            com.instagram.ui.widget.badgeicon.BadgeIconView r1 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r1
            r0 = 1099956224(0x41900000, float:18.0)
            r1.setRadius(r0)
            android.view.View r1 = r43.getView()
            com.instagram.ui.widget.badgeicon.BadgeIconView r1 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r1
            r0 = 1068708659(0x3fb33333, float:1.4)
            r1.setIconSizeFactor(r0)
            android.view.View r4 = r43.getView()
            com.instagram.ui.widget.badgeicon.BadgeIconView r4 = (com.instagram.ui.widget.badgeicon.BadgeIconView) r4
            r1 = 2130970269(0x7f04069d, float:1.7549243E38)
            r0 = r30
            int r0 = X.2Yu.A0H(r0, r1)
            int r0 = r9.getColor(r0)
            r4.setBackgroundBorderColor(r0)
        L_0x0d22:
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x0e5a
            r3 = 4
            if (r31 != 0) goto L_0x0deb
            r0 = r48
            X.2eQ.A04(r0, r3)
            return
        L_0x0d2f:
            r1 = 2131973740(0x7f13566c, float:1.9584524E38)
            java.lang.String r0 = r6.getUsername()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r9.getString(r1, r0)
            goto L_0x0c4a
        L_0x0d40:
            if (r18 == 0) goto L_0x0ddd
            X.0eM r0 = r5.A0h
            java.lang.Object r0 = r0.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r6)
            if (r31 != 0) goto L_0x0d52
            r0 = 0
            if (r20 == 0) goto L_0x0d53
        L_0x0d52:
            r0 = 1
        L_0x0d53:
            X.3oV r14 = r5.A0X
            if (r0 == 0) goto L_0x0dd3
            r14.setVisibility(r6)
            X.3oV r0 = r5.A0Y
            r7 = r0
            r0.setVisibility(r3)
        L_0x0d60:
            android.view.View r1 = r0.getView()
            com.instagram.user.follow.FollowButtonBase r1 = (com.instagram.user.follow.FollowButtonBase) r1
            r5.A0A = r1
            if (r1 == 0) goto L_0x0eb6
            boolean r0 = r1 instanceof com.instagram.user.follow.FollowButton
            if (r0 == 0) goto L_0x0dcf
            r0 = r19
            int r0 = r0.A00
            r1.A04(r0, r3)
        L_0x0d75:
            r1.setVisibility(r3)
            if (r31 == 0) goto L_0x0d80
            r0 = 2132018629(0x7f1405c5, float:1.967557E38)
            r1.setTextAppearance(r0)
        L_0x0d80:
            r0 = r19
            int r0 = r0.A01
            r1.setCustomForegroundColor(r0)
            X.4at r15 = r1.A0J
            r0 = r22
            X.3ZG r0 = r0.A00
            java.util.List r16 = r0.getCoauthorProducers()
            if (r16 == 0) goto L_0x0dcc
            boolean r0 = r16.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r13) goto L_0x0dcc
            java.lang.String r0 = "feed_header_collab_post"
        L_0x0d9d:
            r15.A0H = r0
            java.lang.Object r6 = r12.A04
            X.0sK r6 = (X.0sK) r6
            X.0xF r0 = r10.A00
            r1 = r37
            r6.invoke(r15, r1, r0)
            X.3kK r0 = r10.A06
            r15.A0E = r0
            if (r16 == 0) goto L_0x0db9
            boolean r0 = r16.isEmpty()
            r1 = r0 ^ 1
            r0 = 1
            if (r1 == r13) goto L_0x0dba
        L_0x0db9:
            r0 = 0
        L_0x0dba:
            r15.A0M = r0
            X.533 r0 = new X.533
            r0.<init>(r10, r4)
            r15.A08 = r0
            r0 = r42
            r1 = r23
            r15.A03(r1, r11, r0)
            goto L_0x0c58
        L_0x0dcc:
            java.lang.String r0 = r4.A0I
            goto L_0x0d9d
        L_0x0dcf:
            r1.A02()
            goto L_0x0d75
        L_0x0dd3:
            r0 = r14
            r14.setVisibility(r3)
            X.3oV r7 = r5.A0Y
            r7.setVisibility(r6)
            goto L_0x0d60
        L_0x0ddd:
            X.3oV r14 = r5.A0X
            r14.setVisibility(r6)
            X.3oV r7 = r5.A0Y
            r7.setVisibility(r6)
            r5.A0A = r8
            goto L_0x0c58
        L_0x0deb:
            r1 = r48
            r0 = r24
            X.2eQ.A04(r1, r0)
            r0 = r35
            X.2eQ.A04(r0, r3)
            X.2eQ.A04(r2, r3)
            r0 = r46
            X.2eQ.A04(r0, r3)
            r0 = r45
            X.2eQ.A04(r0, r3)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r0 = r5.Bkt()
            X.2eQ.A04(r0, r3)
            r0 = r44
            X.2eQ.A04(r0, r3)
            X.3oV r0 = r5.A0R
            X.AnonymousClass3ZI.A03(r0)
            X.AnonymousClass3ZI.A03(r14)
            X.AnonymousClass3ZI.A03(r7)
            X.3oV r0 = r5.A0M
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0T
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0U
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0N
            X.AnonymousClass3ZI.A03(r0)
            X.AnonymousClass3ZI.A03(r43)
            X.AnonymousClass3ZI.A03(r47)
            X.3oV r0 = r5.A0Z
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0P
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0O
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0K
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0S
            X.AnonymousClass3ZI.A03(r0)
            X.3oV r0 = r5.A0Q
            X.AnonymousClass3ZI.A03(r0)
            X.AnonymousClass3ZI.A03(r34)
            X.AnonymousClass3ZI.A03(r41)
            return
        L_0x0e5a:
            if (r17 == 0) goto L_0x0e61
            X.U7A r8 = new X.U7A
            r8.<init>()
        L_0x0e61:
            r0 = r46
            X.03v.A0B(r0, r8)
            boolean r0 = r41.CVM()
            if (r0 == 0) goto L_0x0e95
            X.0eM r0 = r5.A0b
            java.lang.Object r0 = r0.getValue()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.0kx r2 = new X.0kx
            r2.<init>(r0)
        L_0x0e79:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0e95
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0B(r1, r3)
            if (r17 == 0) goto L_0x0e93
            X.U7A r0 = new X.U7A
            r0.<init>()
        L_0x0e8f:
            X.03v.A0B(r1, r0)
            goto L_0x0e79
        L_0x0e93:
            r0 = 0
            goto L_0x0e8f
        L_0x0e95:
            boolean r0 = X.2eO.A01(r9, r13)
            if (r0 == 0) goto L_0x0eaa
            java.lang.Object r0 = r12.A0C
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r1 = r0.invoke(r9)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0 = r48
            r0.setContentDescription(r1)
        L_0x0eaa:
            X.2eQ.A03(r48)
            return
        L_0x0eae:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0eb6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ebe:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0ec4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0eca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0ed0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x0ed6:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0ede:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0ee4:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252643pR.A06(X.4DU, X.3Zn, X.3rl, X.3Zb, X.3W1, int):void");
    }
}
