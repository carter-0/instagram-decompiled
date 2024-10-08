package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.instagram.common.session.UserSession;

/* renamed from: X.3z4  reason: invalid class name */
public final class AnonymousClass3z4 extends C252633pQ {
    public final Activity A00;
    public final Context A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C227072ib A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public static final void A00(View view) {
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            Animation animation = view.getAnimation();
            view.clearAnimation();
            if (animate != null) {
                animate.cancel();
            }
            if (animation != null) {
                animation.cancel();
            }
        }
    }

    public static final void A01(View view, C247003fc r2, AnonymousClass3z4 r3, C247453gM r4, boolean z) {
        AnonymousClass0fU.A00(new C271534jA(r2, r3, r4, z), view);
        view.setOnLongClickListener(new C271544jB(r4));
        view.setOnTouchListener(new C271554jC(r4));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnonymousClass3z4(Activity activity, Context context, UserSession userSession, AnonymousClass4DU r7, boolean z, boolean z2) {
        super(context);
        C227072ib A002 = AnonymousClass3YZ.A00(userSession);
        0qQ.A0B(activity, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(A002, 7);
        this.A00 = activity;
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = z;
        this.A03 = r7;
        this.A07 = z2;
        this.A04 = A002;
        this.A06 = 182.A06(0Tu.A05, userSession, 36324406733058127L);
    }

    /* JADX WARNING: type inference failed for: r12v32, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r12v44, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0444, code lost:
        if (r6 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x045b, code lost:
        if (r2 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0471, code lost:
        if (r2 != null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C254013rn r32, X.C247453gM r33, X.AnonymousClass3W1 r34) {
        /*
            r31 = this;
            r0 = -1629763386(0xffffffff9edbc8c6, float:-2.3270565E-20)
            int r18 = X.AnonymousClass0fD.A03(r0)
            r0 = 0
            r8 = r33
            X.0qQ.A0B(r8, r0)
            r0 = 1
            r7 = r34
            X.0qQ.A0B(r7, r0)
            r0 = 2
            r9 = r32
            X.0qQ.A0B(r9, r0)
            X.3W1 r2 = r9.A0B
            if (r2 == 0) goto L_0x003e
            if (r2 == r7) goto L_0x003e
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r9.A0N
            r2.A0W(r0)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r1 = r9.A0O
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.ref.WeakReference r0 = r2.A1d
            if (r0 == 0) goto L_0x003e
            java.lang.Object r0 = r0.get()
            if (r0 != r1) goto L_0x003e
            r1 = 0
            r2.A1d = r1
            X.30k r0 = r2.A0u
            if (r0 == 0) goto L_0x003e
            r0.A04(r1)
        L_0x003e:
            r10 = r31
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x004a
            android.view.View r1 = r9.A0D
            r0 = 4
            X.2eQ.A04(r1, r0)
        L_0x004a:
            r9.A0B = r7
            r9.A0A = r8
            android.app.Activity r0 = r10.A00
            r30 = r0
            r9.A00 = r0
            android.view.ViewStub r3 = r9.A0F
            if (r3 == 0) goto L_0x007b
            boolean r0 = r8.A0N
            if (r0 != 0) goto L_0x0060
            boolean r0 = r8.A0J
            if (r0 == 0) goto L_0x0487
        L_0x0060:
            android.view.ViewGroup r2 = r9.A0E
            if (r2 == 0) goto L_0x0487
            X.3fn r0 = r8.A05
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0484
            android.content.Context r1 = r10.A01
            r0 = 20
            float r0 = X.0nA.A04(r1, r0)
        L_0x0072:
            int r0 = (int) r0
            X.0nA.A0e(r2, r0)
            r0 = 49
        L_0x0078:
            X.0nA.A0W(r3, r0)
        L_0x007b:
            boolean r12 = r8.A0R
            if (r12 == 0) goto L_0x0475
            com.instagram.common.ui.base.IgTextView r2 = r9.A05
            if (r2 == 0) goto L_0x008c
            r0 = 0
            r2.setVisibility(r0)
            java.lang.String r0 = r8.A0C
            r2.setText(r0)
        L_0x008c:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0471
            if (r2 == 0) goto L_0x00aa
            android.content.Context r1 = r10.A01
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
        L_0x00a2:
            X.537 r0 = new X.537
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00aa:
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x045f
            com.instagram.common.ui.base.IgTextView r2 = r9.A03
            if (r2 == 0) goto L_0x00bb
            r0 = 0
            r2.setVisibility(r0)
            java.lang.String r0 = r8.A0B
            r2.setText(r0)
        L_0x00bb:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x045b
            if (r2 == 0) goto L_0x00d9
            android.content.Context r1 = r10.A01
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r2.setTextColor(r0)
        L_0x00d1:
            X.59h r0 = new X.59h
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00d9:
            boolean r0 = r8.A0S
            com.instagram.common.ui.base.IgTextView r6 = r9.A06
            if (r0 == 0) goto L_0x0448
            r2 = 0
            if (r6 == 0) goto L_0x00ea
            r6.setVisibility(r2)
            java.lang.String r0 = r8.A0D
            r6.setText(r0)
        L_0x00ea:
            boolean r0 = r10.A06
            if (r0 == 0) goto L_0x0444
            if (r6 == 0) goto L_0x0105
            android.content.Context r1 = r10.A01
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            int r0 = X.2Yu.A0H(r1, r0)
            int r0 = r1.getColor(r0)
            r6.setTextColor(r0)
        L_0x0100:
            X.3fc r0 = X.C247003fc.A03
            A01(r6, r0, r10, r8, r2)
        L_0x0105:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r5 = r9.A0N
            r5.A05()
            r7.A0U(r5)
            boolean r1 = r8.A0G
            r5.setSelected(r1)
            android.content.Context r4 = r10.A01
            r0 = 2131964931(0x7f133403, float:1.9566658E38)
            if (r1 == 0) goto L_0x011c
            r0 = 2131964944(0x7f133410, float:1.9566684E38)
        L_0x011c:
            java.lang.String r0 = r4.getString(r0)
            r5.setContentDescription(r0)
            boolean r0 = r10.A06
            r17 = r0
            if (r0 == 0) goto L_0x0142
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r1 = r4.getColor(r0)
            r0 = 2130969921(0x7f040541, float:1.7548538E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r5.A04(r1, r0)
        L_0x0142:
            X.9IT r3 = r8.A00
            java.lang.Object r2 = r3.A01
            X.0sL r2 = (X.0sL) r2
            X.3fv r11 = r8.A06
            java.lang.Object r0 = r2.invoke(r4, r11)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r5.setBackground(r0)
            X.4j8 r0 = new X.4j8
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r5)
            if (r12 == 0) goto L_0x0179
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            boolean r0 = r1 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto L_0x0179
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x0179
            int r12 = r1.getMarginStart()
            int r1 = r5.getPaddingStart()
            r0 = 0
            X.0nA.A0d(r5, r0)
            int r12 = r12 + r1
            X.0nA.A0Z(r5, r12)
        L_0x0179:
            com.instagram.common.ui.base.IgSimpleImageView r14 = r9.A0H
            boolean r0 = r8.A0F
            r1 = 0
            if (r0 == 0) goto L_0x043d
            r14.setVisibility(r1)
            X.4j9 r0 = new X.4j9
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r14)
            if (r17 == 0) goto L_0x019b
            r0 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r0 = X.2Yu.A0H(r4, r0)
            int r0 = r4.getColor(r0)
            r14.setColorFilter(r0)
        L_0x019b:
            java.lang.Object r0 = r2.invoke(r4, r11)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r14.setBackground(r0)
            java.lang.Object r13 = r3.A0C
            X.0sP r13 = (X.0sP) r13
            r12 = 15
            X.9LP r0 = new X.9LP
            r0.<init>(r14, r12)
            r13.invoke(r0)
        L_0x01b2:
            boolean r0 = r8.A0M
            r15 = r0
            r0 = 8
            if (r15 == 0) goto L_0x042f
            X.3fc r13 = r8.A03
            X.3fc r12 = X.C247003fc.SHARE_BUTTON
            if (r13 != r12) goto L_0x042f
            androidx.constraintlayout.widget.ConstraintLayout r12 = r9.A01
            if (r12 != 0) goto L_0x025f
            android.view.ViewStub r12 = r9.A0G
            android.view.View r14 = r12.inflate()
            java.lang.String r13 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r14, r13)
            androidx.constraintlayout.widget.ConstraintLayout r14 = (androidx.constraintlayout.widget.ConstraintLayout) r14
            r9.A01 = r14
            X.0qQ.A0C(r14, r13)
            r12 = 2131427724(0x7f0b018c, float:1.8477072E38)
            android.view.View r12 = r14.requireViewById(r12)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = (com.instagram.direct.inbox.notes.ui.NoteBubbleView) r12
            r9.A09 = r12
            if (r12 == 0) goto L_0x01e5
            r12.setCreationLayoutForContentNotesShare(r1)
        L_0x01e5:
            X.FGK r14 = X.FGK.A00
            com.instagram.common.session.UserSession r12 = r10.A02
            r21 = r12
            boolean r12 = r14.A03(r12)
            androidx.constraintlayout.widget.ConstraintLayout r14 = r9.A01
            X.0qQ.A0C(r14, r13)
            if (r12 == 0) goto L_0x03fa
            r12 = 2131430719(0x7f0b0d3f, float:1.8483147E38)
            android.view.View r12 = r14.requireViewById(r12)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r12
            r9.A0C = r12
            androidx.constraintlayout.widget.ConstraintLayout r14 = r9.A01
            X.0qQ.A0C(r14, r13)
            r12 = 2131430720(0x7f0b0d40, float:1.8483149E38)
            android.view.View r12 = r14.requireViewById(r12)
            com.instagram.common.ui.widget.imageview.IgImageView r12 = (com.instagram.common.ui.widget.imageview.IgImageView) r12
            r9.A08 = r12
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r9.A07
            if (r12 == 0) goto L_0x0218
            r12.setVisibility(r0)
        L_0x0218:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = r9.A0C
            if (r12 == 0) goto L_0x021f
            r12.setVisibility(r1)
        L_0x021f:
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r9.A08
            if (r12 == 0) goto L_0x0226
            r12.setVisibility(r1)
        L_0x0226:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = r9.A0C
            r20 = r12
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r9.A08
            r19 = r12
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r12 = r9.A09
            r16 = r12
            com.instagram.common.typedurl.ImageUrl r12 = r8.A02
            r14 = r12
            boolean r13 = r8.A0I
            r25 = 24
            r26 = 32
            X.4DU r12 = r10.A03
            boolean r28 = X.C249223jK.A04(r21)
            boolean r29 = X.C249223jK.A05(r21)
            r22 = r19
            r23 = r16
            r24 = r20
            r27 = r13
            r19 = r4
            r20 = r12
            r21 = r14
            X.C69829Nsq.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r13 = r9.A09
            if (r13 == 0) goto L_0x025f
            r12 = -1061158912(0xffffffffc0c00000, float:-6.0)
            r13.setRotation(r12)
        L_0x025f:
            androidx.constraintlayout.widget.ConstraintLayout r13 = r9.A01
            if (r13 == 0) goto L_0x026b
            X.ANo r12 = new X.ANo
            r12.<init>(r10, r8)
            X.AnonymousClass0fU.A00(r12, r13)
        L_0x026b:
            com.instagram.common.ui.base.IgSimpleImageView r13 = r9.A0I
            if (r15 == 0) goto L_0x03e3
            r13.setVisibility(r1)
            r12 = 2131973092(0x7f1353e4, float:1.958321E38)
            java.lang.String r12 = r4.getString(r12)
            r13.setContentDescription(r12)
            java.lang.Object r12 = r2.invoke(r4, r11)
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            r13.setBackground(r12)
            if (r17 == 0) goto L_0x0295
            r12 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r12 = X.2Yu.A0H(r4, r12)
            int r12 = r4.getColor(r12)
            r13.setColorFilter(r12)
        L_0x0295:
            X.3fc r12 = X.C247003fc.A03
            A01(r13, r12, r10, r8, r1)
            java.lang.Object r14 = r3.A06
            X.0sP r14 = (X.0sP) r14
            r15 = 17
            X.9LP r12 = new X.9LP
            r12.<init>(r13, r15)
            r14.invoke(r12)
            X.3fc r14 = r8.A03
            X.3fc r12 = X.C247003fc.SHARE_BUTTON
            boolean r12 = r14.equals(r12)
            if (r12 == 0) goto L_0x02eb
            androidx.constraintlayout.widget.ConstraintLayout r12 = r9.A01
            r16 = r12
            if (r12 == 0) goto L_0x02eb
            com.instagram.common.session.UserSession r12 = r10.A02
            r23 = r12
            com.instagram.common.ui.base.IgTextView r12 = r9.A04
            r25 = r12
            X.4DU r12 = r10.A03
            r22 = r12
            X.3ZH r12 = r8.A07
            X.3ZG r12 = r12.A00
            java.lang.String r27 = r12.getId()
            if (r27 != 0) goto L_0x02d0
            java.lang.String r27 = ""
        L_0x02d0:
            X.HmN r15 = new X.HmN
            r15.<init>(r13, r10, r8)
            android.view.ViewTreeObserver r14 = r13.getViewTreeObserver()
            X.FPj r12 = new X.FPj
            r19 = r12
            r20 = r13
            r21 = r16
            r24 = r6
            r26 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r14.addOnGlobalLayoutListener(r12)
        L_0x02eb:
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r12 = r9.A0O
            android.view.View r6 = r9.A0D
            boolean r13 = r8.A0K
            if (r13 == 0) goto L_0x03da
            r12.A05()
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            r14.<init>(r12)
            r7.A1d = r14
            X.30k r13 = r7.A0u
            if (r13 == 0) goto L_0x0304
            r13.A04(r14)
        L_0x0304:
            r12.setVisibility(r1)
            boolean r14 = r8.A0L
            r12.setSelected(r14)
            r13 = 2131952388(0x7f130304, float:1.9541217E38)
            if (r14 == 0) goto L_0x0314
            r13 = 2131972043(0x7f134fcb, float:1.9581082E38)
        L_0x0314:
            java.lang.String r13 = r4.getString(r13)
            r12.setContentDescription(r13)
            java.lang.Object r2 = r2.invoke(r4, r11)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r12.setBackground(r2)
            if (r17 == 0) goto L_0x033f
            r2 = 2130970273(0x7f0406a1, float:1.7549251E38)
            int r2 = X.2Yu.A0H(r4, r2)
            int r11 = r4.getColor(r2)
            r2 = 2130969923(0x7f040543, float:1.7548542E38)
            int r2 = X.2Yu.A0H(r4, r2)
            int r2 = r4.getColor(r2)
            r12.A04(r11, r2)
        L_0x033f:
            X.4jD r2 = new X.4jD
            r2.<init>(r8)
            X.AnonymousClass0fU.A00(r2, r12)
            boolean r2 = r8.A0H
            if (r2 != 0) goto L_0x0353
            X.4jE r2 = new X.4jE
            r2.<init>(r8)
            r12.setOnLongClickListener(r2)
        L_0x0353:
            boolean r11 = r8.A0P
            X.3oV r2 = r9.A0J
            if (r11 == 0) goto L_0x03c1
            r2.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r9.A02
            if (r0 == 0) goto L_0x0363
            r0.setVisibility(r1)
        L_0x0363:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r9.A02
            if (r1 == 0) goto L_0x036f
            X.AMy r0 = new X.AMy
            r0.<init>(r8)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x036f:
            X.3z5 r2 = r9.A0K
            X.3fn r1 = r8.A05
            com.instagram.common.session.UserSession r11 = r10.A02
            boolean r0 = r10.A07
            r19 = r30
            r20 = r4
            r21 = r11
            r22 = r2
            r23 = r1
            r24 = r7
            r25 = r0
            X.C271274ia.A00(r19, r20, r21, r22, r23, r24, r25)
            boolean r0 = r8.A0O
            if (r0 == 0) goto L_0x0393
            X.3z0 r1 = r9.A0M
            X.3g4 r0 = r8.A08
            X.C271284ib.A00(r0, r1, r7)
        L_0x0393:
            X.3v9 r13 = r9.A0L
            X.9J3 r9 = r8.A01
            X.4DU r0 = r10.A03
            java.lang.String r2 = r0.getModuleName()
            X.3ZH r0 = r8.A07
            X.1Xj r1 = r0.A01
            java.lang.String r0 = r9.A03
            int r0 = X.C256073vB.A00(r4, r11, r1, r2, r0)
            X.C256083vC.A00(r9, r13, r7, r0)
            java.lang.Object r0 = r3.A0A
            X.0sK r0 = (X.0sK) r0
            r0.invoke(r6, r5, r12)
            java.lang.Object r0 = r3.A08
            X.0sa r0 = (X.C62320sa) r0
            r0.invoke()
            r1 = -245358858(0xfffffffff1601ef6, float:-1.10979315E30)
            r0 = r18
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x03c1:
            int r1 = r2.CFV()
            if (r1 != 0) goto L_0x036f
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r9.A02
            if (r1 == 0) goto L_0x03d1
            r1.setVisibility(r0)
        L_0x03d1:
            com.instagram.common.ui.base.IgSimpleImageView r1 = r9.A02
            if (r1 == 0) goto L_0x036f
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x036f
        L_0x03da:
            r12.setVisibility(r0)
            r2 = 0
            r12.setOnClickListener(r2)
            goto L_0x0353
        L_0x03e3:
            r13.setVisibility(r0)
            r6 = 0
            r13.setOnTouchListener(r6)
            r13.setOnClickListener(r6)
            r13.setOnLongClickListener(r6)
            A00(r13)
            androidx.constraintlayout.widget.ConstraintLayout r6 = r9.A01
            A00(r6)
            goto L_0x02eb
        L_0x03fa:
            r12 = 2131428426(0x7f0b044a, float:1.8478496E38)
            android.view.View r14 = r14.requireViewById(r12)
            com.instagram.common.ui.widget.imageview.CircularImageView r14 = (com.instagram.common.ui.widget.imageview.CircularImageView) r14
            r9.A07 = r14
            if (r14 == 0) goto L_0x0418
            X.0eE r13 = X.AnonymousClass0t1.A01
            r12 = r21
            com.instagram.user.model.User r12 = r13.A01(r12)
            com.instagram.common.typedurl.ImageUrl r13 = r12.Bh3()
            X.4DU r12 = r10.A03
            r14.setUrl(r13, r12)
        L_0x0418:
            com.instagram.common.ui.widget.imageview.CircularImageView r12 = r9.A07
            if (r12 == 0) goto L_0x041f
            r12.setVisibility(r1)
        L_0x041f:
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r12 = r9.A0C
            if (r12 == 0) goto L_0x0426
            r12.setVisibility(r0)
        L_0x0426:
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r9.A08
            if (r12 == 0) goto L_0x025f
            r12.setVisibility(r0)
            goto L_0x025f
        L_0x042f:
            androidx.constraintlayout.widget.ConstraintLayout r12 = r9.A01
            A00(r12)
            androidx.constraintlayout.widget.ConstraintLayout r12 = r9.A01
            if (r12 == 0) goto L_0x026b
            r12.setVisibility(r0)
            goto L_0x026b
        L_0x043d:
            r0 = 8
            r14.setVisibility(r0)
            goto L_0x01b2
        L_0x0444:
            if (r6 == 0) goto L_0x0105
            goto L_0x0100
        L_0x0448:
            if (r6 == 0) goto L_0x0105
            r0 = 8
            r6.setVisibility(r0)
            r0 = 0
            r6.setOnTouchListener(r0)
            r6.setOnClickListener(r0)
            r6.setOnLongClickListener(r0)
            goto L_0x0105
        L_0x045b:
            if (r2 == 0) goto L_0x00d9
            goto L_0x00d1
        L_0x045f:
            com.instagram.common.ui.base.IgTextView r1 = r9.A03
            if (r1 == 0) goto L_0x00d9
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setOnClickListener(r0)
            r1.setOnLongClickListener(r0)
            goto L_0x00d9
        L_0x0471:
            if (r2 == 0) goto L_0x00aa
            goto L_0x00a2
        L_0x0475:
            com.instagram.common.ui.base.IgTextView r1 = r9.A05
            if (r1 == 0) goto L_0x00aa
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x00aa
        L_0x0484:
            r0 = 0
            goto L_0x0072
        L_0x0487:
            r0 = 17
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3z4.A06(X.3rn, X.3gM, X.3W1):void");
    }
}
