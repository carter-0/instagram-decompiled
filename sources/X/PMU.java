package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.labelbutton.LabelButton;

public final class PMU implements C74361Ptb {
    public int A00 = -1;
    public int A01;
    public int A02;
    public C355148Ov A03;
    public C70515O9o A04;
    public OYY A05;
    public C68293N9g A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final Drawable A0D;
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;
    public final Drawable A0I;
    public final Handler A0J = AnonymousClass7TF.A0D();
    public final ViewGroup A0K;
    public final UserSession A0L;
    public final C71111Ocu A0M;
    public final Runnable A0N = new PXA(this);
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final AnonymousClass0eM A0W = C73900Plb.A00(this, 47);
    public final AnonymousClass0eM A0X = C73900Plb.A00(this, 48);
    public final AnonymousClass0eM A0Y = C73896PlX.A00(this, 0);
    public final AnonymousClass0eM A0Z = C73896PlX.A00(this, 2);
    public final AnonymousClass0eM A0a = C73896PlX.A00(this, 3);
    public final AnonymousClass0eM A0b = C73896PlX.A00(this, 4);
    public final AnonymousClass0eM A0c = AnonymousClass1YB.A00(C73863Pl0.A00);
    public final AnonymousClass0eM A0d = C73896PlX.A00(this, 6);
    public final AnonymousClass0eM A0e = C73896PlX.A00(this, 9);
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final AnonymousClass0eM A0i = C73896PlX.A00(this, 12);
    public final AnonymousClass0eM A0j = C73896PlX.A00(this, 14);
    public final AnonymousClass0eM A0k = C73896PlX.A00(this, 16);
    public final AnonymousClass0eM A0l = C73896PlX.A00(this, 17);
    public final AnonymousClass0eM A0m = C73896PlX.A00(this, 18);
    public final AnonymousClass0eM A0n = C73896PlX.A00(this, 19);
    public final AnonymousClass0eM A0o = C73896PlX.A00(this, 21);
    public final AnonymousClass0eM A0p = C73896PlX.A00(this, 23);
    public final AnonymousClass0eM A0q = C73896PlX.A00(this, 25);
    public final AnonymousClass0eM A0r = C73896PlX.A00(this, 27);
    public final AnonymousClass0eM A0s = C73896PlX.A00(this, 28);
    public final AnonymousClass0eM A0t = C73896PlX.A00(this, 29);

    public /* synthetic */ PMU(Context context, ViewGroup viewGroup, UserSession userSession, C71111Ocu ocu) {
        0qQ.A0B(ocu, 4);
        this.A0L = userSession;
        this.A0C = context;
        this.A0K = viewGroup;
        this.A0M = ocu;
        this.A0F = context.getDrawable(R.drawable.instagram_microphone_outline_44);
        this.A0I = context.getDrawable(R.drawable.instagram_video_chat_outline_44);
        this.A0E = context.getDrawable(R.drawable.instagram_microphone_off_outline_44);
        this.A0H = context.getDrawable(R.drawable.instagram_video_chat_off_outline_44);
        this.A0D = context.getDrawable(R.drawable.instagram_volume_off_outline_44);
        this.A0G = context.getDrawable(R.drawable.instagram_volume_outline_44);
        0eO r3 = 0eO.A02;
        this.A0g = AnonymousClass0eN.A00(r3, new MJ3(R.drawable.instagram_rotate_outline_44, 48, context));
        this.A0f = AnonymousClass0eN.A00(r3, new MJ3(R.drawable.instagram_dual_camera_pano_outline_24, 48, context));
        Context context2 = viewGroup.getContext();
        this.A0O = AnonymousClass7TE.A16(context2, 2131976532);
        this.A0P = AnonymousClass7TE.A16(context2, 2131976533);
        this.A0S = AnonymousClass7TE.A16(context2, 2131976538);
        this.A0T = AnonymousClass7TE.A16(context2, 2131976539);
        this.A0V = AnonymousClass7TE.A16(context2, 2131976445);
        this.A0U = AnonymousClass7TE.A16(context2, 2131976443);
        this.A0R = AnonymousClass7TE.A16(context2, 2131976446);
        this.A0Q = AnonymousClass7TE.A16(context2, 2131976444);
        this.A0h = C73896PlX.A00(this, 10);
        this.A0A = true;
        this.A0B = true;
    }

    public static View A01(PMU pmu) {
        return (View) pmu.A0m.getValue();
    }

    public static ViewPropertyAnimator A02(ViewPropertyAnimator viewPropertyAnimator, OK4 ok4, float f) {
        return viewPropertyAnimator.translationY(f).setInterpolator(ok4.A00).setDuration(300);
    }

    public static final void A03(Drawable drawable, View view) {
        if (view instanceof LabelButton) {
            ((LabelButton) view).setImageDrawable(drawable);
        } else if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(drawable);
        }
    }

    public static final void A04(View view) {
        LabelButton labelButton;
        if ((view instanceof LabelButton) && (labelButton = (LabelButton) view) != null) {
            labelButton.A01.setVisibility(8);
        }
    }

    public final OYY A08() {
        OYY oyy = this.A05;
        if (oyy != null) {
            return oyy;
        }
        0qQ.A0F("listener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09() {
        ViewPropertyAnimator animate;
        View A0c2 = AnonymousClass7TE.A0c(this.A0e);
        if (A0c2 instanceof LabelButton) {
            animate = ((LabelButton) A0c2).A00.animate();
        } else {
            animate = A0c2.animate();
        }
        animate.rotationBy(-180.0f).setDuration(300).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0494, code lost:
        r0 = java.lang.Integer.valueOf(r0);
        r17 = X.C226262fy.ABOVE_ANCHOR;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x049a, code lost:
        r20 = r0.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x04a0, code lost:
        if (r11 != X.AnonymousClass05K.A0j) goto L_0x04bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04a2, code lost:
        r0 = (long) X.182.A00(r2, r24, 37158850160099419L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x04ae, code lost:
        r10.postDelayed(new X.C73393Pbq(r10, r17, r6, r11, r20), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x04bf, code lost:
        r0 = 3000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0065, code lost:
        if (r5.A0F != false) goto L_0x0067;
     */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x027d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADN(X.C74270Pry r27) {
        /*
            r26 = this;
            r5 = r27
            X.N9g r5 = (X.C68293N9g) r5
            r4 = 0
            X.0qQ.A0B(r5, r4)
            r6 = r26
            r6.A06 = r5
            int r2 = r5.A01
            int r0 = r6.A02
            if (r2 != r0) goto L_0x0018
            int r1 = r5.A00
            int r0 = r6.A01
            if (r1 == r0) goto L_0x0052
        L_0x0018:
            r6.A02 = r2
            int r0 = r5.A00
            r6.A01 = r0
            android.view.ViewGroup r0 = r6.A0K
            android.content.Context r0 = r0.getContext()
            int r7 = X.AnonymousClass7TG.A03(r0)
            X.0eM r0 = r6.A0t
            android.view.View r3 = X.AnonymousClass7TH.A06(r0)
            int r2 = r3.getPaddingLeft()
            int r0 = r6.A02
            int r7 = r7 + r0
            int r1 = r3.getPaddingRight()
            int r0 = r3.getPaddingBottom()
            r3.setPadding(r2, r7, r1, r0)
            X.0eM r0 = r6.A0a
            android.view.View r2 = X.AnonymousClass7TH.A06(r0)
            X.0eM r0 = r6.A0b
            int r1 = X.DbX.A07(r0)
            int r0 = r6.A01
            int r1 = r1 + r0
            X.0nA.A0T(r2, r1)
        L_0x0052:
            X.0eM r0 = r6.A0m
            X.DbW.A1R(r0, r4)
            boolean r0 = r5.A0S
            r25 = r0
            r6.A09 = r0
            boolean r0 = r6.A0A
            r3 = 1
            if (r0 == 0) goto L_0x0067
            boolean r0 = r5.A0F
            r8 = 1
            if (r0 == 0) goto L_0x0068
        L_0x0067:
            r8 = 0
        L_0x0068:
            com.instagram.common.session.UserSession r0 = r6.A0L
            r24 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328418232515926(0x81108100003d56, double:3.037576200817264E-306)
            r7 = r24
            boolean r7 = X.182.A06(r2, r7, r0)
            if (r7 == 0) goto L_0x0099
            android.content.Context r9 = r6.A0C
            boolean r7 = r9 instanceof android.app.Activity
            if (r7 == 0) goto L_0x0099
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x0099
            android.view.Window r10 = r9.getWindow()
            if (r10 == 0) goto L_0x0099
            boolean r7 = r5.A0H
            r9 = r7 ^ 1
            X.C61290mR.A05(r10)
            android.view.View r7 = r10.getDecorView()
            X.2db.A07(r7, r10, r9)
        L_0x0099:
            boolean r7 = r5.A0H
            if (r7 != 0) goto L_0x050a
            boolean r7 = r5.A0C
            if (r7 != 0) goto L_0x050a
            X.0eM r7 = r6.A0c
            r23 = r7
            java.lang.Object r9 = r23.getValue()
            X.OK4 r9 = (X.OK4) r9
            X.0eM r7 = r6.A0t
            android.view.View r12 = X.AnonymousClass7TH.A06(r7)
            X.0eM r7 = r6.A0s
            r22 = r7
            android.view.View r10 = X.AnonymousClass7TE.A0c(r22)
            X.0qQ.A0B(r12, r4)
            X.0qQ.A0B(r10, r3)
            int r7 = r12.getVisibility()
            r13 = 1065353216(0x3f800000, float:1.0)
            r14 = 8
            r11 = 0
            if (r7 != r14) goto L_0x00eb
            if (r8 == 0) goto L_0x0505
            r12.setVisibility(r4)
            r12.setAlpha(r11)
            int r7 = r12.getMeasuredHeight()
            int r7 = -r7
            float r7 = (float) r7
            r12.setTranslationY(r7)
            android.view.ViewPropertyAnimator r7 = X.C66581MXm.A0C(r12, r13)
            android.view.ViewPropertyAnimator r7 = A02(r7, r9, r11)
            X.PXG r15 = new X.PXG
            r15.<init>(r12)
            X.C66580MXl.A1D(r7, r15)
        L_0x00eb:
            int r7 = r10.getVisibility()
            if (r7 != r14) goto L_0x0117
            if (r8 == 0) goto L_0x0500
            r10.setVisibility(r4)
            r10.setAlpha(r11)
            int r12 = r12.getMeasuredHeight()
            int r7 = r10.getMeasuredHeight()
            int r12 = r12 + r7
            float r7 = (float) r12
            float r7 = -r7
            r10.setTranslationY(r7)
            android.view.ViewPropertyAnimator r7 = X.C66581MXm.A0C(r10, r13)
            android.view.ViewPropertyAnimator r9 = A02(r7, r9, r11)
            X.PXH r7 = new X.PXH
            r7.<init>(r10)
            X.C66580MXl.A1D(r9, r7)
        L_0x0117:
            boolean r7 = r5.A0M
            java.lang.Object r10 = r23.getValue()
            X.OK4 r10 = (X.OK4) r10
            X.0eM r12 = r6.A0a
            android.view.View r9 = X.AnonymousClass7TH.A06(r12)
            if (r7 == 0) goto L_0x04fb
            X.0qQ.A0B(r9, r4)
            int r7 = r9.getVisibility()
            if (r7 != r14) goto L_0x0150
            if (r8 == 0) goto L_0x04f6
            r9.setVisibility(r4)
            r9.setAlpha(r11)
            int r7 = r9.getMeasuredHeight()
            float r7 = (float) r7
            r9.setTranslationY(r7)
            android.view.ViewPropertyAnimator r7 = X.C66581MXm.A0C(r9, r13)
            android.view.ViewPropertyAnimator r8 = A02(r7, r10, r11)
            X.PXE r7 = new X.PXE
            r7.<init>(r9)
            X.C66580MXl.A1D(r8, r7)
        L_0x0150:
            r7 = r24
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0168
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x0168
            android.os.Handler r8 = r6.A0J
            java.lang.Runnable r7 = r6.A0N
            r8.removeCallbacks(r7)
            r0 = 5000(0x1388, double:2.4703E-320)
            r8.postDelayed(r7, r0)
        L_0x0168:
            boolean r7 = r5.A0A
            X.0eM r0 = r6.A0o
            r21 = r0
            android.view.View r0 = X.AnonymousClass7TE.A0c(r21)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r0 = r1 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x0184
            X.2dQ r1 = (X.C71492dQ) r1
            if (r1 == 0) goto L_0x0184
            r0 = 1
            if (r7 == 0) goto L_0x0182
            r0 = 2
        L_0x0182:
            r1.A0X = r0
        L_0x0184:
            X.0eM r14 = r6.A0d
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            if (r7 == 0) goto L_0x04ea
            X.0eM r7 = r6.A0h
            int r0 = X.DbX.A07(r7)
            A05(r1, r0)
            X.0eM r9 = r6.A0W
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            int r0 = X.DbX.A07(r7)
        L_0x019f:
            A05(r1, r0)
            boolean r1 = r5.A0I
            android.view.View r0 = X.AnonymousClass7TE.A0c(r9)
            if (r1 == 0) goto L_0x04d6
            r0.setActivated(r3)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            android.graphics.drawable.Drawable r0 = r6.A0F
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            java.lang.String r0 = r6.A0O
        L_0x01bc:
            r1.setContentDescription(r0)
            boolean r1 = r5.A0J
            boolean r7 = r5.A08
            X.0eM r13 = r6.A0Y
            android.view.View r0 = X.AnonymousClass7TE.A0c(r13)
            r0.getAlpha()
            android.view.View r0 = X.AnonymousClass7TE.A0c(r14)
            if (r1 == 0) goto L_0x04c2
            r0.setActivated(r3)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            android.graphics.drawable.Drawable r0 = r6.A0I
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            java.lang.String r0 = r6.A0S
        L_0x01e4:
            r1.setContentDescription(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            r0 = r7 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x01fa
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x01fa:
            r1.setAlpha(r0)
            java.lang.Integer r11 = r5.A03
            if (r11 == 0) goto L_0x020e
            java.lang.Integer r0 = r6.A07
            if (r0 == r11) goto L_0x020e
            r6.A07 = r11
            int r0 = r11.intValue()
            switch(r0) {
                case 0: goto L_0x048b;
                case 1: goto L_0x0481;
                case 2: goto L_0x0467;
                case 3: goto L_0x0477;
                case 4: goto L_0x020e;
                case 5: goto L_0x045d;
                case 6: goto L_0x0453;
                case 7: goto L_0x0453;
                default: goto L_0x020e;
            }
        L_0x020e:
            boolean r8 = r5.A0L
            if (r8 == 0) goto L_0x0240
            boolean r0 = r5.A07
            boolean r7 = r5.A06
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            if (r0 == 0) goto L_0x0446
            android.graphics.drawable.Drawable r0 = r6.A0D
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            java.lang.String r0 = r6.A0R
        L_0x0227:
            r1.setContentDescription(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            r0 = r7 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r7 == 0) goto L_0x023d
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x023d:
            r1.setAlpha(r0)
        L_0x0240:
            boolean r10 = r5.A0Y
            if (r10 == 0) goto L_0x0282
            java.lang.Integer r0 = r5.A02
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x042a
            if (r0 == r3) goto L_0x0433
            r0 = 36316985029628646(0x81061b000112e6, double:3.0303457972735354E-306)
            r7 = r24
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x026a
            X.0eM r0 = r6.A0e
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            X.0eM r0 = r6.A0f
        L_0x0263:
            android.graphics.drawable.Drawable r0 = X.JTO.A0D(r0)
            A03(r0, r1)
        L_0x026a:
            X.0eM r1 = r6.A0e
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            boolean r2 = r5.A0Z
            r0.setEnabled(r2)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r1)
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x027f
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x027f:
            r1.setAlpha(r0)
        L_0x0282:
            java.lang.String r1 = r5.A04
            if (r1 == 0) goto L_0x041f
            int r0 = r1.length()
            if (r0 == 0) goto L_0x041f
            boolean r0 = r5.A0G
            if (r0 == 0) goto L_0x041f
            X.0eM r0 = r6.A0q
            X.C66582MXn.A1L(r1, r0)
            X.DbW.A1R(r0, r4)
        L_0x0298:
            java.lang.String r1 = r5.A05
            if (r1 == 0) goto L_0x0416
            boolean r0 = r5.A0F
            if (r0 != 0) goto L_0x0416
            r0 = r22
            X.C66582MXn.A1L(r1, r0)
            X.DbW.A1R(r0, r4)
        L_0x02a8:
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            int r0 = X.DbW.A01(r8)
            r1.setVisibility(r0)
            X.0eM r0 = r6.A0e
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            int r0 = X.DbW.A01(r10)
            r1.setVisibility(r0)
            X.0eM r0 = r6.A0r
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r5.A0U
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r2 = r6.A0j
            android.view.View r1 = X.AnonymousClass7TE.A0c(r2)
            boolean r0 = r5.A0P
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r0 = r6.A0i
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r5.A0O
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r0 = r6.A0p
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            int r0 = X.DbW.A01(r25)
            r1.setVisibility(r0)
            X.0eM r0 = r6.A0Z
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            boolean r0 = r5.A0T
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            boolean r0 = r5.A0N
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            boolean r0 = r5.A0K
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r21)
            boolean r0 = r5.A0B
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            X.0eM r7 = r6.A0k
            android.view.View r1 = X.AnonymousClass7TE.A0c(r7)
            boolean r0 = r5.A0Q
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            android.content.Context r0 = r6.A0C
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenWidthDp
            A06(r6, r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r7)
            boolean r0 = r5.A0E
            r1.setEnabled(r0)
            boolean r1 = r5.A0D
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            boolean r0 = r0.isEnabled()
            if (r1 == r0) goto L_0x036a
            android.view.View r0 = X.AnonymousClass7TE.A0c(r2)
            r0.setEnabled(r1)
        L_0x036a:
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x03f5
            X.0eM r3 = r6.A0n
            X.C66582MXn.A1P(r3, r4)
            android.view.View r0 = X.AnonymousClass7TE.A0c(r3)
            int r2 = r0.getHeight()
            r6.A00 = r2
            X.Ocu r1 = r6.A0M
            X.PN7 r0 = new X.PN7
            r0.<init>(r2)
            r1.A05(r0)
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x03d2
            java.lang.Object r8 = r23.getValue()
            X.OK4 r8 = (X.OK4) r8
            android.view.View r7 = X.AnonymousClass7TH.A06(r12)
            android.view.View r3 = X.C66581MXm.A0B(r3)
            r0 = 15
            X.Oej r2 = new X.Oej
            r2.<init>(r6, r0)
            X.0qQ.A0B(r7, r4)
            r3.setVisibility(r4)
            r1 = 0
            r3.setAlpha(r1)
            int r0 = r7.getMeasuredHeight()
            float r0 = (float) r0
            r3.setTranslationY(r0)
            android.view.ViewPropertyAnimator r0 = X.DbY.A0G(r3)
            android.view.ViewPropertyAnimator r1 = r0.translationY(r1)
            android.view.animation.AccelerateDecelerateInterpolator r0 = r8.A00
            android.view.ViewPropertyAnimator r0 = r1.setInterpolator(r0)
            android.view.ViewPropertyAnimator r0 = r0.setUpdateListener(r2)
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0D(r0)
            X.PXF r0 = new X.PXF
            r0.<init>(r3)
            X.C66580MXl.A1D(r1, r0)
            r6.A0B = r4
        L_0x03d2:
            X.0eM r2 = r6.A0X
            java.lang.Object r0 = r2.getValue()
            android.app.Dialog r0 = (android.app.Dialog) r0
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x03f4
            X.AnonymousClass7TF.A1N(r2)
            java.lang.Object r1 = r2.getValue()
            android.app.Dialog r1 = (android.app.Dialog) r1
            X.OgI r0 = new X.OgI
            r0.<init>(r6, r5)
            r1.setOnShowListener(r0)
            X.G9w.A1Y(r2)
        L_0x03f4:
            return
        L_0x03f5:
            r23.getValue()
            X.0eM r0 = r6.A0n
            android.view.View r4 = X.C66581MXm.A0B(r0)
            X.PX8 r2 = new X.PX8
            r2.<init>(r6)
            android.view.ViewPropertyAnimator r0 = X.C51972G9s.A0I(r4)
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0D(r0)
            X.PZi r0 = new X.PZi
            r0.<init>(r4, r2)
            X.C66580MXl.A1D(r1, r0)
            r6.A0B = r3
            goto L_0x03d2
        L_0x0416:
            java.lang.Object r0 = r22.getValue()
            X.C51969G9p.A1M(r0)
            goto L_0x02a8
        L_0x041f:
            X.0eM r0 = r6.A0q
            java.lang.Object r0 = r0.getValue()
            X.C51969G9p.A1M(r0)
            goto L_0x0298
        L_0x042a:
            X.0eM r2 = r6.A0e
            android.view.View r1 = X.AnonymousClass7TE.A0c(r2)
            java.lang.String r0 = r6.A0U
            goto L_0x043b
        L_0x0433:
            X.0eM r2 = r6.A0e
            android.view.View r1 = X.AnonymousClass7TE.A0c(r2)
            java.lang.String r0 = r6.A0V
        L_0x043b:
            r1.setContentDescription(r0)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r2)
            X.0eM r0 = r6.A0g
            goto L_0x0263
        L_0x0446:
            android.graphics.drawable.Drawable r0 = r6.A0G
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r13)
            java.lang.String r0 = r6.A0Q
            goto L_0x0227
        L_0x0453:
            X.0eM r0 = r6.A0e
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976550(0x7f136166, float:1.9590224E38)
            goto L_0x0494
        L_0x045d:
            X.0eM r0 = r6.A0j
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976583(0x7f136187, float:1.959029E38)
            goto L_0x0494
        L_0x0467:
            X.0eM r0 = r6.A0r
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976572(0x7f13617c, float:1.9590268E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2fy r17 = X.C226262fy.BELOW_ANCHOR
            goto L_0x049a
        L_0x0477:
            X.0eM r0 = r6.A0j
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976578(0x7f136182, float:1.959028E38)
            goto L_0x0494
        L_0x0481:
            X.0eM r0 = r6.A0j
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976546(0x7f136162, float:1.9590216E38)
            goto L_0x0494
        L_0x048b:
            X.0eM r0 = r6.A0j
            android.view.View r10 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131976547(0x7f136163, float:1.9590218E38)
        L_0x0494:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.2fy r17 = X.C226262fy.ABOVE_ANCHOR
        L_0x049a:
            int r20 = r0.intValue()
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            if (r11 != r0) goto L_0x04bf
            r0 = 37158850160099419(0x8403c7000e005b, double:3.562744695702038E-306)
            r7 = r24
            double r7 = X.182.A00(r2, r7, r0)
            long r0 = (long) r7
        L_0x04ae:
            X.Pbq r7 = new X.Pbq
            r15 = r7
            r16 = r10
            r18 = r6
            r19 = r11
            r15.<init>(r16, r17, r18, r19, r20)
            r10.postDelayed(r7, r0)
            goto L_0x020e
        L_0x04bf:
            r0 = 3000(0xbb8, double:1.482E-320)
            goto L_0x04ae
        L_0x04c2:
            r0.setActivated(r4)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            android.graphics.drawable.Drawable r0 = r6.A0H
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r14)
            java.lang.String r0 = r6.A0T
            goto L_0x01e4
        L_0x04d6:
            r0.setActivated(r4)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            android.graphics.drawable.Drawable r0 = r6.A0E
            A03(r0, r1)
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            java.lang.String r0 = r6.A0P
            goto L_0x01bc
        L_0x04ea:
            r0 = 0
            A05(r1, r4)
            X.0eM r9 = r6.A0W
            android.view.View r1 = X.AnonymousClass7TE.A0c(r9)
            goto L_0x019f
        L_0x04f6:
            r9.setVisibility(r4)
            goto L_0x0150
        L_0x04fb:
            r10.A00(r9, r8)
            goto L_0x0150
        L_0x0500:
            r10.setVisibility(r4)
            goto L_0x0117
        L_0x0505:
            r12.setVisibility(r4)
            goto L_0x00eb
        L_0x050a:
            X.0eM r0 = r6.A0c
            r23 = r0
            java.lang.Object r10 = r23.getValue()
            X.OK4 r10 = (X.OK4) r10
            X.0eM r0 = r6.A0t
            android.view.View r7 = X.AnonymousClass7TH.A06(r0)
            X.0eM r0 = r6.A0s
            r22 = r0
            android.view.View r9 = X.AnonymousClass7TE.A0c(r22)
            X.0qQ.A0B(r7, r4)
            X.0qQ.A0B(r9, r3)
            int r0 = r7.getVisibility()
            r12 = 8
            r11 = 0
            if (r0 != 0) goto L_0x054f
            if (r8 == 0) goto L_0x058d
            r7.setTranslationY(r11)
            X.C66580MXl.A1A(r7)
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0C(r7, r11)
            int r0 = r7.getMeasuredHeight()
            int r0 = -r0
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r1 = A02(r1, r10, r0)
            X.PXC r0 = new X.PXC
            r0.<init>(r7)
            X.C66580MXl.A1D(r1, r0)
        L_0x054f:
            int r0 = r9.getVisibility()
            if (r0 != 0) goto L_0x0578
            if (r8 == 0) goto L_0x0589
            int r7 = r7.getMeasuredHeight()
            int r0 = r9.getMeasuredHeight()
            int r7 = r7 + r0
            r9.setTranslationY(r11)
            X.C66580MXl.A1A(r9)
            android.view.ViewPropertyAnimator r1 = X.C66581MXm.A0C(r9, r11)
            int r0 = -r7
            float r0 = (float) r0
            android.view.ViewPropertyAnimator r1 = A02(r1, r10, r0)
            X.PXD r0 = new X.PXD
            r0.<init>(r9)
            X.C66580MXl.A1D(r1, r0)
        L_0x0578:
            java.lang.Object r1 = r23.getValue()
            X.OK4 r1 = (X.OK4) r1
            X.0eM r12 = r6.A0a
            android.view.View r0 = X.AnonymousClass7TH.A06(r12)
            r1.A00(r0, r8)
            goto L_0x0168
        L_0x0589:
            r9.setVisibility(r12)
            goto L_0x0578
        L_0x058d:
            r7.setVisibility(r12)
            goto L_0x054f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMU.ADN(X.Pry):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.View A00(android.view.View r3, X.C62320sa r4, X.C62320sa r5, int r6) {
        /*
            android.view.View r2 = r3.findViewById(r6)
            android.content.Context r1 = r3.getContext()
            r0 = 1
            boolean r0 = X.2eO.A01(r1, r0)
            if (r0 == 0) goto L_0x0012
            r0 = 0
            if (r5 == 0) goto L_0x0013
        L_0x0012:
            r0 = 1
        L_0x0013:
            X.0qQ.A0A(r2)
            X.O2G.A00(r2, r4, r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PMU.A00(android.view.View, X.0sa, X.0sa, int):android.view.View");
    }

    public static final void A05(View view, int i) {
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i2 = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        } else {
            i2 = 0;
        }
        if (i2 != i) {
            0nA.A0U(view, i);
        }
    }

    public static final void A06(PMU pmu, int i) {
        int i2;
        Context context;
        int i3;
        if (i < 320) {
            try {
                i2 = pmu.A0C.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            } catch (Resources.NotFoundException unused) {
                DbT.A1Q(0wj.A01, "Resource.NotFoundException when getting R.dimen.button_width_narrow", 20134884);
                context = pmu.A0C;
                i3 = 40;
            }
        } else {
            try {
                i2 = C66582MXn.A01(pmu.A0C);
            } catch (Resources.NotFoundException unused2) {
                DbT.A1Q(0wj.A01, "Resource.NotFoundException when getting R.dimen.button_width", 20134884);
                context = pmu.A0C;
                i3 = 48;
            }
        }
        A07(pmu.A0d, i2);
        A07(pmu.A0W, i2);
        ((LabelButton) pmu.A0j.getValue()).setSize(i2);
        A07(pmu.A0e, i2);
        A07(pmu.A0Y, i2);
        A07(pmu.A0k, i2);
        i2 = DbS.A02(context, i3);
        A07(pmu.A0d, i2);
        A07(pmu.A0W, i2);
        ((LabelButton) pmu.A0j.getValue()).setSize(i2);
        A07(pmu.A0e, i2);
        A07(pmu.A0Y, i2);
        A07(pmu.A0k, i2);
    }

    public static void A07(AnonymousClass0eM r1, int i) {
        View view = (View) r1.getValue();
        if (view instanceof LabelButton) {
            ((LabelButton) view).setSize(i);
        }
    }
}
