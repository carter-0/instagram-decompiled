package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6hn  reason: invalid class name and case insensitive filesystem */
public final class C314186hn implements C252243on, AnonymousClass6Z1, C252293os {
    public float A00;
    public int A01;
    public int A02 = -1;
    public int A03;
    public ValueAnimator A04;
    public CountDownTimer A05;
    public View A06;
    public View A07;
    public IgSimpleImageView A08;
    public IgTextView A09;
    public AnonymousClass3TF A0A;
    public C255773uh A0B;
    public C255773uh A0C;
    public C309426Yf A0D;
    public GradientSpinner A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final float A0S;
    public final Context A0T;
    public final Handler A0U;
    public final View A0V;
    public final UserSession A0W;
    public final C234002wp A0X;
    public final C314156hk A0Y;
    public final C314176hm A0Z;
    public final C314166hl A0a;
    public final C313056fm A0b;
    public final C62320sa A0c;
    public final C62320sa A0d;
    public final boolean A0e;
    public final AnonymousClass3BQ A0f;
    public final C270414gh A0g;

    public C314186hn(Context context, View view, UserSession userSession, C234002wp r10, AnonymousClass3BQ r11, C314156hk r12, C314176hm r13, C314166hl r14, C313056fm r15, C270414gh r16, C62320sa r17, C62320sa r18) {
        0qQ.A0B(r15, 2);
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r11, 5);
        C270414gh r1 = r16;
        0qQ.A0B(r1, 6);
        this.A0V = view;
        this.A0b = r15;
        this.A0W = userSession;
        this.A0T = context;
        this.A0f = r11;
        this.A0g = r1;
        this.A0d = r17;
        this.A0c = r18;
        this.A0X = r10;
        this.A0Y = r12;
        this.A0a = r14;
        this.A0Z = r13;
        0Tu r5 = 0Tu.A06;
        this.A0e = 182.A06(r5, userSession, 36324840528359838L);
        this.A0U = new Handler(Looper.getMainLooper());
        this.A04 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.A00 = 1.0f;
        this.A0P = true;
        this.A0A = AnonymousClass3TF.IDLE;
        this.A0R = true;
        this.A03 = (int) 182.A00(r5, userSession, 37169265455137256L);
        this.A01 = -1;
        this.A0S = Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static final void A02(C314186hn r5) {
        r5.A0J = false;
        r5.A0H = false;
        r5.A02 = -1;
        r5.A0G = false;
        r5.A0R = true;
        r5.A0Q = false;
        r5.A0B = null;
        r5.A01 = -1;
        C309426Yf r0 = r5.A0D;
        if (r0 != null) {
            r0.A0K = -1;
        }
        r5.A04.cancel();
        r5.A00 = 1.0f;
        r5.A0K = true;
        r5.A0P = true;
        r5.A07 = null;
        ((C313046fl) r5.A0b).A04.A0V = false;
        r5.A0X.A00 = null;
        A03(r5);
        HQQ.A00 = true;
        HQQ.A01 = null;
    }

    public static final void A03(C314186hn r2) {
        if (r2.A0e) {
            ((C313046fl) r2.A0b).A04.A0T = false;
        }
    }

    public final boolean A06(C255773uh r4) {
        0qQ.A0B(r4, 0);
        if (!this.A0X.A07(r4.A0b)) {
            if (this.A0J) {
                this.A0C = r4;
                A04("scroll");
            }
            return false;
        }
        this.A0C = r4;
        this.A02 = ((C313046fl) this.A0b).A04.A08;
        return true;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void D7Q(C255773uh r2, C250973mM r3, C316026kz r4, C309426Yf r5) {
        0qQ.A0B(r2, 1);
        A00(r2);
    }

    public final /* synthetic */ void DLs(Reel reel) {
    }

    public final /* synthetic */ void DMq(int i) {
    }

    public final /* synthetic */ void DNx() {
    }

    public final /* synthetic */ void DNy() {
    }

    public final /* synthetic */ void DVL() {
    }

    public final /* synthetic */ void DVx(int i, int i2) {
    }

    public final /* synthetic */ void DW9(int i, int i2, boolean z) {
    }

    public final void DWT(String str) {
        0qQ.A0B(str, 0);
        if (this.A0X.A04() && this.A0J && str.equals("fragment_paused")) {
            A04("app_background");
        }
    }

    public final /* synthetic */ void Dfe() {
    }

    public final /* synthetic */ void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r4, AnonymousClass3TF r5) {
        0qQ.A0B(r4, 0);
        if (A05()) {
            this.A0A = r4;
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                A04("scroll");
            } else if (ordinal != 1) {
                C255773uh r2 = this.A0C;
                if (r2 != null && ((C313046fl) this.A0b).A04.A08 == this.A02) {
                    A00(r2);
                }
            } else {
                A01(this);
                this.A0F = false;
            }
        }
    }

    public final /* synthetic */ void DiL(int i) {
    }

    public final /* synthetic */ void DiM(int i, int i2) {
    }

    public final /* synthetic */ void DiO(int i, int i2) {
    }

    public final /* synthetic */ void DiP() {
    }

    public final /* synthetic */ void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final /* synthetic */ void DxL() {
    }

    public final /* synthetic */ void DxN() {
    }

    public final /* synthetic */ void DxU() {
    }

    public final /* synthetic */ void DyN(C255773uh r1, C316036l0 r2) {
    }

    public final /* synthetic */ void DzE(View view) {
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final void onDestroy() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x016f, code lost:
        r2 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a7, code lost:
        if (r10 != -1) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00(X.C255773uh r15) {
        /*
            r14 = this;
            X.2wp r3 = r14.A0X
            boolean r0 = r3.A04()
            if (r0 == 0) goto L_0x0186
            X.4gh r0 = r14.A0g
            X.6bG r0 = (X.C310566bG) r0
            X.6bN r0 = r0.A0B
            X.6Yf r0 = r0.Bz3(r15)
            r14.A0D = r0
            boolean r1 = r14.A06(r15)
            r0 = 0
            if (r1 == 0) goto L_0x01cf
            X.3BQ r2 = r14.A0f
            X.3BQ r1 = X.AnonymousClass3BQ.ADS_HISTORY
            if (r2 == r1) goto L_0x01cf
            r2 = 1
            r14.A0J = r2
            android.content.Context r7 = r14.A0T
            boolean r1 = X.C316216lI.A0B(r7)
            r4 = r1 ^ 1
            android.view.View r6 = r14.A0V
            r1 = 2131441916(0x7f0b38fc, float:1.8505857E38)
            if (r4 == 0) goto L_0x0036
            r1 = 2131441909(0x7f0b38f5, float:1.8505843E38)
        L_0x0036:
            android.view.View r1 = r6.findViewById(r1)
            if (r1 == 0) goto L_0x0216
            r1.setVisibility(r0)
            boolean r4 = r14.A0P
            if (r4 == 0) goto L_0x0059
            r3.A02()
            X.HQQ.A00 = r0
            X.6hl r8 = r14.A0a
            X.3uh r9 = r14.A0B
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            boolean r13 = r14.A0J
            int r12 = r14.A01
            java.lang.String r11 = "unknown"
            r8.A00(r9, r10, r11, r12, r13)
            r14.A0P = r0
        L_0x0059:
            r14.A07 = r1
            X.IAT r4 = new X.IAT
            r4.<init>(r14)
            X.AnonymousClass0fU.A00(r4, r1)
            X.1Xj r4 = r15.A0b
            r3.A00 = r4
            X.6Yf r4 = r14.A0D
            if (r4 == 0) goto L_0x006d
            r4.A0r = r2
        L_0x006d:
            r14.A0H = r0
            X.6fm r4 = r14.A0b
            X.6fl r4 = (X.C313046fl) r4
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r4.A04
            int r5 = r4.A08
            r14.A02 = r5
            r14.A0B = r15
            int r5 = r14.A01
            r9 = -1
            if (r5 != r9) goto L_0x008c
            int r8 = r3.A00(r15)
            r14.A01 = r8
            X.6Yf r5 = r14.A0D
            if (r5 == 0) goto L_0x008c
            r5.A0K = r8
        L_0x008c:
            boolean r5 = X.C316216lI.A0B(r7)
            r5 = r5 ^ 1
            r7 = 8
            if (r5 == 0) goto L_0x01aa
            r5 = 2131441915(0x7f0b38fb, float:1.8505855E38)
            android.view.View r5 = r6.findViewById(r5)
            r14.A06 = r5
            r5 = 2131441911(0x7f0b38f7, float:1.8505847E38)
            android.view.View r5 = r6.findViewById(r5)
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5
            r14.A09 = r5
            if (r5 == 0) goto L_0x00af
            r5.setVisibility(r0)
        L_0x00af:
            r5 = 2131441914(0x7f0b38fa, float:1.8505853E38)
            android.view.View r5 = r6.findViewById(r5)
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5
            r14.A08 = r5
            if (r5 == 0) goto L_0x00bf
            r5.setVisibility(r7)
        L_0x00bf:
            r5 = 2131430850(0x7f0b0dc2, float:1.8483413E38)
        L_0x00c2:
            android.view.View r5 = r6.findViewById(r5)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = (com.instagram.ui.widget.gradientspinner.GradientSpinner) r5
            r14.A0E = r5
            int r5 = r3.A00(r15)
            r14.A03 = r5
            r14.A0L = r0
            int r10 = r14.A01
            if (r10 != r5) goto L_0x0187
            boolean r5 = r14.A0R
            if (r5 == 0) goto L_0x0187
            X.6hl r6 = r14.A0a
            X.3uh r7 = r14.A0B
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            boolean r11 = r14.A0J
            java.lang.String r9 = "unknown"
            r6.A00(r7, r8, r9, r10, r11)
            r14.A0R = r0
        L_0x00e9:
            r14.A0K = r0
            r5 = 2
            float[] r6 = new float[r5]
            float r5 = r14.A00
            r6[r0] = r5
            r5 = 0
            r6[r2] = r5
            android.animation.ValueAnimator r7 = android.animation.ValueAnimator.ofFloat(r6)
            r14.A04 = r7
            float r2 = r14.A00
            int r0 = r3.A00(r15)
            float r0 = (float) r0
            float r2 = r2 * r0
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r6
            float r0 = r14.A0S
            float r2 = r2 / r0
            long r2 = (long) r2
            r7.setDuration(r2)
            android.animation.ValueAnimator r2 = r14.A04
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            android.animation.ValueAnimator r2 = r14.A04
            X.I7p r0 = new X.I7p
            r0.<init>(r14)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r0 = r14.A04
            r0.start()
            android.os.CountDownTimer r0 = r14.A05
            if (r0 == 0) goto L_0x012d
            r0.cancel()
        L_0x012d:
            float r2 = r14.A00
            int r0 = r14.A03
            float r0 = (float) r0
            float r2 = r2 * r0
            float r2 = r2 * r6
            long r2 = (long) r2
            X.Gcw r0 = new X.Gcw
            r0.<init>(r1, r14, r2)
            android.os.CountDownTimer r0 = r0.start()
            r14.A05 = r0
            X.6hk r7 = r14.A0Y
            int r6 = r14.A02
            int r1 = r4.A08
            android.view.View r0 = r14.A07
            if (r6 != r1) goto L_0x0186
            if (r0 == 0) goto L_0x0186
            X.6fm r0 = r7.A05
            int r2 = r6 + 1
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r3 = r0.A04
            android.view.View r1 = r3.A0D(r2)
            if (r1 == 0) goto L_0x0169
            float r0 = r1.getAlpha()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0169
            r7.A01 = r2
            r7.A00 = r6
            r1.setAlpha(r5)
        L_0x0169:
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x0186
            if (r6 == 0) goto L_0x0186
            int r2 = r6 + -1
            android.view.View r1 = r3.A0D(r2)
            if (r1 == 0) goto L_0x0186
            float r0 = r1.getAlpha()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0186
            r7.A02 = r2
            r7.A00 = r6
            r1.setAlpha(r5)
        L_0x0186:
            return
        L_0x0187:
            if (r10 != 0) goto L_0x01a7
            r14.A01 = r2
            r10 = 1
            X.6Yf r5 = r14.A0D
            if (r5 == 0) goto L_0x0192
            r5.A0K = r2
        L_0x0192:
            boolean r5 = r14.A0Q
            if (r5 == 0) goto L_0x00e9
            X.6hl r6 = r14.A0a
            X.3uh r7 = r14.A0B
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            boolean r11 = r14.A0J
            java.lang.String r9 = "unknown"
            r6.A00(r7, r8, r9, r10, r11)
            r14.A0Q = r0
            goto L_0x00e9
        L_0x01a7:
            if (r10 == r9) goto L_0x00e9
            goto L_0x0192
        L_0x01aa:
            r5 = 2131441918(0x7f0b38fe, float:1.8505861E38)
            android.view.View r5 = r6.findViewById(r5)
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5
            r14.A09 = r5
            if (r5 == 0) goto L_0x01ba
            r5.setVisibility(r0)
        L_0x01ba:
            r5 = 2131441921(0x7f0b3901, float:1.8505867E38)
            android.view.View r5 = r6.findViewById(r5)
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5
            r14.A08 = r5
            if (r5 == 0) goto L_0x01ca
            r5.setVisibility(r7)
        L_0x01ca:
            r5 = 2131430864(0x7f0b0dd0, float:1.848344E38)
            goto L_0x00c2
        L_0x01cf:
            boolean r1 = r14.A0J
            if (r1 == 0) goto L_0x01e0
            X.6hk r2 = r14.A0Y
            X.6fm r1 = r14.A0b
            X.6fl r1 = (X.C313046fl) r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r1.A04
            int r1 = r1.A08
            r2.A02(r1)
        L_0x01e0:
            boolean r1 = r14.A0I
            if (r1 == 0) goto L_0x020f
            X.6hk r5 = r14.A0Y
            X.6fm r1 = r14.A0b
            X.6fl r1 = (X.C313046fl) r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r1.A04
            int r2 = r4.A08
            X.6fm r1 = r5.A05
            int r2 = r2 + 1
            X.6fl r1 = (X.C313046fl) r1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r1.A04
            android.view.View r3 = r1.A0D(r2)
            if (r3 == 0) goto L_0x020a
            float r2 = r3.getAlpha()
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x020a
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r1)
        L_0x020a:
            int r1 = r4.A08
            r5.A02(r1)
        L_0x020f:
            X.6Yf r1 = r14.A0D
            if (r1 == 0) goto L_0x0186
            r1.A0r = r0
            return
        L_0x0216:
            r14.A0J = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314186hn.A00(X.3uh):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r2 != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C314186hn r7) {
        /*
            android.view.View r6 = r7.A07
            android.view.View r5 = r7.A06
            boolean r0 = r7.A0M
            r4 = 1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r7.A0O
            if (r0 != 0) goto L_0x0015
            boolean r2 = r7.A0e
            if (r2 == 0) goto L_0x004d
            boolean r0 = r7.A0N
            if (r0 == 0) goto L_0x004d
        L_0x0015:
            r1 = 1
        L_0x0016:
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            X.6fm r0 = r7.A0b
            X.6fl r0 = (X.C313046fl) r0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r0.A04
            int r1 = r0.A08
            int r0 = r7.A02
            if (r1 != r0) goto L_0x0042
            android.content.Context r0 = r7.A0T
            boolean r0 = X.C316216lI.A0B(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0043
            if (r5 == 0) goto L_0x0042
            android.os.Handler r3 = r7.A0U
            X.IhU r2 = new X.IhU
            r2.<init>(r5, r7)
        L_0x003b:
            r0 = 200(0xc8, double:9.9E-322)
            r3.postDelayed(r2, r0)
            r7.A0F = r4
        L_0x0042:
            return
        L_0x0043:
            if (r6 == 0) goto L_0x0042
            android.os.Handler r3 = r7.A0U
            X.IhU r2 = new X.IhU
            r2.<init>(r6, r7)
            goto L_0x003b
        L_0x004d:
            r1 = 0
            if (r2 == 0) goto L_0x0016
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314186hn.A01(X.6hn):void");
    }

    private final void A04(String str) {
        if (!this.A0K && !this.A0L) {
            this.A0Q = true;
            CountDownTimer countDownTimer = this.A05;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.A04.cancel();
            this.A0H = true;
            IgTextView igTextView = this.A09;
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            IgSimpleImageView igSimpleImageView = this.A08;
            if (igSimpleImageView != null) {
                igSimpleImageView.setVisibility(0);
            }
            this.A0K = true;
            String str2 = str;
            this.A0a.A00(this.A0B, AnonymousClass05K.A0N, str2, this.A01, this.A0J);
        }
    }

    public final boolean A05() {
        String str;
        1Xj r0;
        1Xj r02;
        if (this.A0X.A04() && this.A0J) {
            C255773uh r03 = this.A0C;
            String str2 = null;
            if (r03 == null || (r02 = r03.A0b) == null) {
                str = null;
            } else {
                str = r02.getId();
            }
            C255773uh r04 = this.A0B;
            if (!(r04 == null || (r0 = r04.A0b) == null)) {
                str2 = r0.getId();
            }
            if (!0qQ.A0K(str, str2) || this.A07 == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean BVb() {
        return false;
    }

    public final /* synthetic */ int BrB() {
        return 0;
    }

    public final /* synthetic */ boolean Bu3() {
        return false;
    }

    public final /* synthetic */ boolean Cau() {
        return false;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final /* synthetic */ boolean Dpr() {
        return false;
    }

    public final /* synthetic */ boolean Dq0() {
        return false;
    }

    public final /* synthetic */ boolean Dqd() {
        return false;
    }

    public final void onDestroyView() {
        if (A05()) {
            this.A0a.A00(this.A0B, AnonymousClass05K.A0j, "story_viewer_exit", this.A01, this.A0J);
            A02(this);
            this.A0U.removeCallbacksAndMessages((Object) null);
        }
    }
}
