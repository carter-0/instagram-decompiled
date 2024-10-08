package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;
import java.util.Random;

/* renamed from: X.6mB  reason: invalid class name and case insensitive filesystem */
public final class C316766mB {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public IgFrameLayout A04;
    public IgFrameLayout A05;
    public IgSimpleImageView A06;
    public IgSimpleImageView A07;
    public IgTextView A08;
    public AnonymousClass5Gv A09;
    public AnonymousClass5Gv A0A;
    public boolean A0B;
    public boolean A0C;
    public float A0D;
    public final ValueAnimator A0E;
    public final ValueAnimator A0F;
    public final ValueAnimator A0G;
    public final Context A0H;
    public final Sensor A0I;
    public final SensorEventListener A0J;
    public final SensorManager A0K;
    public final View A0L;
    public final 1wn A0M;
    public final C252063oV A0N;
    public final Random A0O = new Random();
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final AnonymousClass0eM A0S;
    public final Handler A0T = new Handler(Looper.getMainLooper());
    public final AnonymousClass0eM A0U;

    public C316766mB(Context context, View view, C252063oV r8) {
        SensorManager sensorManager;
        this.A0H = context;
        this.A0N = r8;
        this.A0L = view;
        Object systemService = context.getSystemService("sensor");
        Sensor sensor = null;
        if (systemService instanceof SensorManager) {
            sensorManager = (SensorManager) systemService;
        } else {
            sensorManager = null;
        }
        this.A0K = sensorManager;
        this.A0I = sensorManager != null ? sensorManager.getDefaultSensor(1) : sensor;
        this.A0J = new C316776mC(this);
        this.A0M = new C316786mD(this);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C316796mE(this));
        this.A0E = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.9f, 1.1f});
        ofFloat2.addUpdateListener(new C316806mF(this));
        ofFloat2.setRepeatMode(2);
        ofFloat2.setRepeatCount(-1);
        this.A0F = ofFloat2;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat3.setDuration(1000);
        ofFloat3.addUpdateListener(new C316816mG(this));
        this.A0G = ofFloat3;
        this.A0S = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 44));
        this.A0U = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 43));
        this.A0Q = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 41));
        this.A0R = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 42));
        this.A0P = AnonymousClass0eN.A01(new AnonymousClass9LS(this, 40));
    }

    public final void A04(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        SensorManager sensorManager = this.A0K;
        if (sensorManager != null) {
            C60240fb.A00(this.A0J, sensorManager);
        }
        AnonymousClass1Nd.A00(userSession).A02(this.A0M, C317326n5.class);
        this.A0N.setVisibility(8);
        AnonymousClass5Gv r0 = this.A0A;
        if (r0 != null) {
            r0.A08(false);
        }
        this.A0A = null;
    }

    public static final int A00(C316766mB r0) {
        return ((Number) r0.A0U.getValue()).intValue();
    }

    private final void A01() {
        String str;
        this.A0T.removeCallbacksAndMessages((Object) null);
        IgSimpleImageView igSimpleImageView = this.A07;
        if (igSimpleImageView == null) {
            str = "stickerView";
        } else {
            igSimpleImageView.setTranslationX((float) ((((Number) this.A0S.getValue()).intValue() / 2) - (A00(this) / 2)));
            IgSimpleImageView igSimpleImageView2 = this.A06;
            if (igSimpleImageView2 != null) {
                igSimpleImageView2.setVisibility(8);
                this.A0D = 0.0f;
                this.A0B = false;
                IgSimpleImageView igSimpleImageView3 = this.A06;
                if (igSimpleImageView3 != null) {
                    igSimpleImageView3.setVisibility(8);
                    this.A0E.end();
                    this.A0F.end();
                    return;
                }
            }
            str = "heartView";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027d, code lost:
        r2 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0285, code lost:
        if (r2.hasNext() == false) goto L_0x02ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0287, code lost:
        r1 = (android.view.View) r2.next();
        r0 = r14.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028f, code lost:
        if (r0 == null) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0291, code lost:
        r0.removeView(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.common.session.UserSession r12, X.LwM r13, X.C316766mB r14) {
        /*
            X.3oV r0 = r14.A0N
            int r1 = r0.CFV()
            r0 = 8
            if (r1 == r0) goto L_0x02c7
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            java.lang.String r11 = "stickerView"
            if (r0 == 0) goto L_0x02b5
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L_0x02c7
            float r1 = r14.A00
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r2
            r4 = -1054867456(0xffffffffc1200000, float:-10.0)
            r0 = 1092616192(0x41200000, float:10.0)
            float r8 = X.C229632nm.A02(r1, r4, r0)
            float r0 = java.lang.Math.abs(r8)
            r3 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
            r8 = 0
        L_0x002f:
            boolean r0 = r14.A0B
            r5 = 0
            if (r0 == 0) goto L_0x006c
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r1 = r0.getX()
            int r0 = r14.A02
            float r6 = (float) r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a4
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r1 = r0.getX()
            int r0 = A00(r14)
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = r14.A02
            float r6 = (float) r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a4
            r14.A0B = r5
            android.animation.ValueAnimator r0 = r14.A0E
            r0.end()
            android.animation.ValueAnimator r0 = r14.A0F
            r0.end()
            android.animation.ValueAnimator r0 = r14.A0G
            r0.start()
            A03(r14)
        L_0x006c:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r6 = r0.getTranslationX()
            float r6 = r6 + r8
            X.0eM r4 = r14.A0S
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = A00(r14)
            int r1 = r1 - r0
            float r0 = (float) r1
            float r6 = X.C229632nm.A02(r6, r3, r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r0 = r0.getTranslationX()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            r0.setTranslationX(r6)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = A00(r14)
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00b9
        L_0x00b6:
            A03(r14)
        L_0x00b9:
            float r6 = java.lang.Math.abs(r8)
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x00ce
            com.instagram.common.ui.base.IgSimpleImageView r1 = r14.A07
            if (r1 == 0) goto L_0x02b5
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cb
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x00cb:
            r1.setScaleX(r2)
        L_0x00ce:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x029b
            float r2 = r14.A0D
            float r2 = r2 + r6
            r14.A0D = r2
            com.instagram.common.ui.base.IgSimpleImageView r1 = r14.A07
            if (r1 == 0) goto L_0x02b5
            r0 = 1112014848(0x42480000, float:50.0)
            float r2 = r2 / r0
            int r0 = (int) r2
            int r0 = r0 % 2
            int r0 = r0 + 1
            r1.setImageLevel(r0)
        L_0x00e6:
            boolean r0 = r14.A0C
            if (r0 == 0) goto L_0x02ba
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            java.lang.String r10 = "coinContainerView"
            if (r0 == 0) goto L_0x0218
            boolean r0 = r0.isLaidOut()
            if (r0 == 0) goto L_0x02ba
            long r6 = android.os.SystemClock.elapsedRealtime()
            long r0 = r14.A03
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0177
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r0 = r14.A01
            int r0 = r0 * 100
            long r0 = (long) r0
            r8 = 2500(0x9c4, double:1.235E-320)
            long r8 = r8 - r0
            r6 = 500(0x1f4, double:2.47E-321)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0114
            r8 = 500(0x1f4, double:2.47E-321)
        L_0x0114:
            long r2 = r2 + r8
            r14.A03 = r2
            android.content.Context r0 = r14.A0H
            com.instagram.common.ui.base.IgTextView r3 = new com.instagram.common.ui.base.IgTextView
            r3.<init>(r0)
            java.util.Random r2 = r14.A0O
            float r1 = r2.nextFloat()
            r0 = 1036831949(0x3dcccccd, float:0.1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0295
            java.lang.String r0 = "❤️"
        L_0x012d:
            r3.setText(r0)
            X.0eM r0 = r14.A0P
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            r3.setTextSize(r5, r0)
            r3.setIncludeFontPadding(r5)
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = A00(r14)
            int r1 = r1 - r0
            int r0 = r2.nextInt(r1)
            float r0 = (float) r0
            r3.setTranslationX(r0)
            r0 = 360(0x168, float:5.04E-43)
            int r0 = r2.nextInt(r0)
            float r0 = (float) r0
            r3.setRotation(r0)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1 = -2
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1, r2)
            r3.setLayoutParams(r0)
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            r0.addView(r3)
        L_0x0177:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            int r3 = r0.getChildCount()
            r2 = 0
        L_0x0185:
            if (r2 >= r3) goto L_0x027d
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            android.view.View r7 = r0.getChildAt(r2)
            boolean r0 = r7 instanceof com.instagram.common.ui.base.IgTextView
            if (r0 == 0) goto L_0x0266
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x0266
            java.lang.CharSequence r0 = r7.getText()
            java.lang.String r8 = r0.toString()
            float r1 = r7.getTranslationY()
            int r0 = r14.A01
            int r0 = r0 / 5
            int r0 = r0 + 5
            float r0 = (float) r0
            float r1 = r1 + r0
            r7.setTranslationY(r1)
            float r1 = r7.getRotation()
            r0 = 1084227584(0x40a00000, float:5.0)
            float r1 = r1 + r0
            r7.setRotation(r1)
            float r6 = r7.getTranslationY()
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            int r1 = r0.getHeight()
            int r0 = A00(r14)
            int r1 = r1 - r0
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x022d
            float r6 = r7.getTranslationX()
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r1 = r0.getTranslationX()
            X.0eM r0 = r14.A0P
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            float r0 = (float) r0
            float r1 = r1 - r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x022d
            float r6 = r7.getTranslationX()
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r1 = r0.getTranslationX()
            int r0 = A00(r14)
            float r0 = (float) r0
            float r1 = r1 + r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x022d
            java.lang.String r0 = "❤️"
            boolean r6 = X.0qQ.A0K(r8, r0)
            int r1 = r14.A01
            int r0 = r1 + 1
            if (r6 == 0) goto L_0x0210
            int r0 = r1 + 2
        L_0x0210:
            r14.A01 = r0
            com.instagram.common.ui.base.IgTextView r1 = r14.A08
            if (r1 != 0) goto L_0x0220
            java.lang.String r10 = "scoreView"
        L_0x0218:
            X.0qQ.A0F(r10)
        L_0x021b:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0220:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.setText(r0)
            A03(r14)
            r4.add(r7)
        L_0x022d:
            float r1 = r7.getTranslationY()
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            int r0 = r0.getHeight()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0266
            r14.A0C = r5
            A03(r14)
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            r0.removeAllViews()
            android.content.Context r3 = r14.A0H
            com.instagram.common.ui.base.IgFrameLayout r2 = r14.A05
            if (r2 != 0) goto L_0x0253
            java.lang.String r10 = "containerView"
            goto L_0x0218
        L_0x0253:
            r1 = 2131964409(0x7f1331f9, float:1.9565599E38)
            X.6jx r0 = new X.6jx
            r0.<init>((int) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r3, r2, r0)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 != 0) goto L_0x026a
            r10 = r11
            goto L_0x0218
        L_0x0266:
            int r2 = r2 + 1
            goto L_0x0185
        L_0x026a:
            r1.A03(r0)
            r1.A02()
            r1.A0A = r5
            r1.A0B = r5
            X.5Gv r0 = r1.A00()
            r14.A09 = r0
            r0.A06()
        L_0x027d:
            java.util.Iterator r2 = r4.iterator()
        L_0x0281:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ba
            java.lang.Object r1 = r2.next()
            android.view.View r1 = (android.view.View) r1
            com.instagram.common.ui.base.IgFrameLayout r0 = r14.A04
            if (r0 == 0) goto L_0x0218
            r0.removeView(r1)
            goto L_0x0281
        L_0x0295:
            X.KiQ r0 = r13.A00
            java.lang.String r0 = r0.A03
            goto L_0x012d
        L_0x029b:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            r0.setImageLevel(r5)
            goto L_0x00e6
        L_0x02a4:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r14.A07
            if (r0 == 0) goto L_0x02b5
            float r0 = r0.getX()
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b2
            r4 = 1092616192(0x41200000, float:10.0)
        L_0x02b2:
            r8 = r4
            goto L_0x006c
        L_0x02b5:
            X.0qQ.A0F(r11)
            goto L_0x021b
        L_0x02ba:
            android.os.Handler r3 = r14.A0T
            X.M99 r2 = new X.M99
            r2.<init>(r12, r13, r14)
            r0 = 16
            r3.postDelayed(r2, r0)
            return
        L_0x02c7:
            r14.A01()
            r14.A04(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316766mB.A02(com.instagram.common.session.UserSession, X.LwM, X.6mB):void");
    }

    public static final void A03(C316766mB r1) {
        IgSimpleImageView igSimpleImageView = r1.A07;
        if (igSimpleImageView == null) {
            0qQ.A0F("stickerView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igSimpleImageView.performHapticFeedback(1);
        }
    }

    public final void A05(UserSession userSession, C255773uh r10, boolean z, boolean z2) {
        C255783ui r0;
        String str;
        String str2;
        List Bkd = r10.Bkd(AnonymousClass3WT.INSTAPAL);
        LwM lwM = null;
        if (Bkd != null) {
            r0 = (C255783ui) 00k.A0J(Bkd);
            if (r0 != null) {
                lwM = r0.A0z;
            }
        } else {
            r0 = null;
        }
        if (!z || z2 || r0 == null || lwM == null) {
            A04(userSession);
            return;
        }
        C252063oV r5 = this.A0N;
        if (!r5.CVM()) {
            IgFrameLayout igFrameLayout = (IgFrameLayout) r5.getView();
            this.A05 = igFrameLayout;
            str = "containerView";
            if (igFrameLayout != null) {
                this.A07 = (IgSimpleImageView) igFrameLayout.requireViewById(R.id.sticker_view);
                IgFrameLayout igFrameLayout2 = this.A05;
                if (igFrameLayout2 != null) {
                    this.A06 = (IgSimpleImageView) igFrameLayout2.requireViewById(R.id.heart_view);
                    IgFrameLayout igFrameLayout3 = this.A05;
                    if (igFrameLayout3 != null) {
                        this.A04 = (IgFrameLayout) igFrameLayout3.requireViewById(R.id.coin_container);
                        IgFrameLayout igFrameLayout4 = this.A05;
                        if (igFrameLayout4 != null) {
                            this.A08 = igFrameLayout4.requireViewById(R.id.score_view);
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        SensorManager sensorManager = this.A0K;
        if (sensorManager != null) {
            C60240fb.A01(this.A0I, this.A0J, sensorManager, 3);
        }
        AnonymousClass1Nd.A00(userSession).A01(this.A0M, C317326n5.class);
        r5.setVisibility(0);
        IgSimpleImageView igSimpleImageView = this.A07;
        str = "stickerView";
        if (igSimpleImageView != null) {
            Context context = this.A0H;
            igSimpleImageView.setImageDrawable(context.getDrawable(lwM.A00.A00));
            IgSimpleImageView igSimpleImageView2 = this.A07;
            if (igSimpleImageView2 != null) {
                AnonymousClass0fU.A00(new LXB(lwM, this), igSimpleImageView2);
                AnonymousClass5Gv r02 = this.A0A;
                if (!((r02 != null && r02.A09()) || (str2 = lwM.A01) == null || str2.length() == 0)) {
                    IgFrameLayout igFrameLayout5 = this.A05;
                    if (igFrameLayout5 == null) {
                        str = "containerView";
                    } else {
                        AnonymousClass5Gt r1 = new AnonymousClass5Gt(context, igFrameLayout5, new C315476jx((CharSequence) str2));
                        IgSimpleImageView igSimpleImageView3 = this.A07;
                        if (igSimpleImageView3 != null) {
                            r1.A03(igSimpleImageView3);
                            r1.A02();
                            r1.A04 = new KSK(this);
                            this.A0A = r1.A00();
                            IgSimpleImageView igSimpleImageView4 = this.A07;
                            if (igSimpleImageView4 != null) {
                                igSimpleImageView4.postDelayed(new C65921M4k(this), 500);
                            }
                        }
                    }
                }
                A01();
                A02(userSession, lwM, this);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
