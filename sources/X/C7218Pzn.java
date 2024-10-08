package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;

/* renamed from: X.Pzn  reason: case insensitive filesystem */
public final class C7218Pzn implements View.OnTouchListener, C252203oj, GestureDetector.OnGestureListener, C252213ok {
    public static final double A0e = Math.toRadians(20.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 1;
    public int A09 = 1;
    public MotionEvent A0A;
    public MotionEvent A0B;
    public C13677Tem A0C;
    public C273504mg A0D;
    public SHR A0E;
    public Integer A0F;
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
    public int A0S;
    public final GestureDetector A0T;
    public final View A0U;
    public final 2cs A0V;
    public final AnonymousClass3E6 A0W;
    public final C268594df A0X;
    public final C7221Pzq A0Y;
    public final boolean A0Z;
    public final int A0a;
    public final 0lg A0b;
    public final C295005nO A0c;
    public final C13679Teo A0d;

    public C7218Pzn(View view, 0lg r8, C268594df r9, C7221Pzq pzq, C13679Teo teo) {
        0qQ.A0B(view, 1);
        0qQ.A0B(r8, 4);
        this.A0U = view;
        this.A0X = r9;
        this.A0Y = pzq;
        this.A0b = r8;
        this.A0d = teo;
        Context context = view.getContext();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A0T = gestureDetector;
        2cs A022 = C61340me.A00().A02();
        A022.A06 = true;
        this.A0V = A022;
        this.A0P = true;
        this.A05 = 2;
        this.A02 = 0.5f;
        this.A0F = AnonymousClass05K.A04;
        this.A0Z = 182.A06(0Tu.A05, r8, 36321284291962090L);
        gestureDetector.setIsLongpressEnabled(false);
        0qQ.A07(context);
        this.A0a = r9.AhP(context);
        this.A0W = AnonymousClass3E4.A01(this, false, true);
        this.A0c = new PQI(this, 6);
        this.A0S = 150;
        int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.A0S = AnonymousClass7TF.A02(context, identifier);
        }
    }

    public final float A0E(int i) {
        if (i == 1) {
            return 0.0f;
        }
        if (i == 2) {
            return A02(this);
        }
        if (i == 3) {
            return A00(this);
        }
        if (i != 4) {
            return -1.0f;
        }
        return A01(this);
    }

    public final void A0H(Integer num, boolean z) {
        A09(this, 3);
        this.A0F = num;
        if (!z) {
            JTP.A1K(this.A0V, A00(this));
        }
        this.A0V.A06((double) A00(this));
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r6) {
        0qQ.A0B(r6, 0);
        C268594df r4 = this.A0X;
        View C4U = r4.C4U();
        if (C4U != null) {
            int A052 = A05(this) - ((int) r6.A09.A00);
            C4U.setTranslationY((float) A052);
            r4.onBottomSheetPositionChanged(A052, this.A07);
            this.A0Y.A01(A052, this.A07);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A04 = 0.0f;
        this.A0M = true;
        this.A0H = false;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A0O = false;
        this.A00 = motionEvent.getRawX();
        this.A01 = motionEvent.getRawY();
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        0qQ.A0B(motionEvent2, 1);
        C273504mg r0 = this.A0D;
        if (r0 != null && r0.doNotFlingWhenDismissLocked()) {
            if (motionEvent != null) {
                f3 = motionEvent.getY();
            } else {
                f3 = Float.MAX_VALUE;
            }
            if (f3 < motionEvent2.getY()) {
                return true;
            }
        }
        this.A04 = f2;
        this.A03 = f;
        this.A0B = motionEvent;
        this.A0A = motionEvent2;
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0293, code lost:
        if (r10 != 4) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02bf, code lost:
        if (r10 != 3) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02c2, code lost:
        if (r11 == 1) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r8 >= ((1.0f - ((float) X.182.A00(X.0Tu.A06, r1.A00, 37166009870582171L))) * ((float) X.AnonymousClass0nB.A00(r6)))) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0435, code lost:
        if (r0.doNotDismissOnDraggingDown() == true) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c5, code lost:
        if (A0F() == 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (((float) r2.A09.A00) == ((float) r2.A01)) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03bc  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x03ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            r20 = this;
            r9 = 1
            r5 = r22
            X.0qQ.A0B(r5, r9)
            r7 = r20
            boolean r0 = r7.A0L
            if (r0 != 0) goto L_0x000d
            return r9
        L_0x000d:
            X.SHR r4 = r7.A0E
            r19 = 0
            if (r4 == 0) goto L_0x0021
            X.2cs r2 = r7.A0V
            X.2ct r0 = r2.A09
            double r0 = r0.A00
            float r3 = (float) r0
            double r1 = r2.A01
            float r0 = (float) r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
        L_0x0021:
            int r1 = r7.A09
            r0 = 2
            if (r1 == r0) goto L_0x005f
            if (r4 == 0) goto L_0x0033
            float r1 = r7.A00
            float r0 = r7.A01
            boolean r0 = r4.A01(r1, r0)
            if (r0 != r9) goto L_0x0033
        L_0x0032:
            return r19
        L_0x0033:
            int r1 = r7.A09
            r0 = 4
            if (r1 != r0) goto L_0x005f
            X.SHR r1 = r7.A0E
            if (r1 == 0) goto L_0x005f
            float r8 = r7.A01
            android.view.View r0 = r7.A0U
            android.content.Context r6 = X.AnonymousClass7TE.A0S(r0)
            r4 = 1065353216(0x3f800000, float:1.0)
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A06
            r0 = 37166009870582171(0x840a4a000e019b, double:3.5672725254411706E-306)
            double r1 = X.182.A00(r2, r3, r0)
            float r0 = (float) r1
            float r4 = r4 - r0
            int r0 = X.AnonymousClass0nB.A00(r6)
            float r0 = (float) r0
            float r4 = r4 * r0
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0032
        L_0x005f:
            android.view.GestureDetector r0 = r7.A0T
            boolean r19 = r0.onTouchEvent(r5)
            A08(r5, r7)
            int r1 = r5.getActionMasked()
            if (r1 == r9) goto L_0x0072
            r0 = 3
            if (r1 == r0) goto L_0x0072
            return r19
        L_0x0072:
            android.view.MotionEvent r3 = r7.A0B
            android.view.MotionEvent r2 = r7.A0A
            float r1 = r7.A03
            float r0 = r7.A04
            X.GlP r6 = new X.GlP
            r10 = r6
            r11 = r2
            r12 = r3
            r13 = r1
            r14 = r0
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            X.2cs r5 = r7.A0V
            boolean r0 = r5.A0C()
            if (r0 == 0) goto L_0x0032
            boolean r0 = A0D(r7)
            r18 = 0
            if (r0 == 0) goto L_0x009b
            float r0 = r6.A01
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a7
        L_0x009b:
            int r0 = r7.A0F()
            if (r0 != 0) goto L_0x00d7
            float r0 = r6.A01
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 < 0) goto L_0x00d7
        L_0x00a7:
            r7.DmC(r5)
            boolean r0 = A0D(r7)
            r8 = 2
            r11 = 1
            if (r0 == 0) goto L_0x00c1
            A09(r7, r8)
            X.Pzq r2 = r7.A0Y
            r1 = 14
            X.Jw3 r0 = new X.Jw3
            r0.<init>((java.lang.Object) r6, (int) r9, (int) r8, (int) r1)
            r2.A02(r0)
        L_0x00c1:
            int r0 = r7.A0F()
            if (r0 != 0) goto L_0x0032
        L_0x00c7:
            A09(r7, r11)
        L_0x00ca:
            X.Pzq r3 = r7.A0Y
            r0 = 14
            X.Jw3 r1 = new X.Jw3
            r1.<init>((java.lang.Object) r6, (int) r8, (int) r11, (int) r0)
        L_0x00d3:
            r3.A02(r1)
            return r19
        L_0x00d7:
            X.4mg r1 = r7.A0D
            r0 = 1163575296(0x455ac000, float:3500.0)
            if (r1 == 0) goto L_0x01fe
            float r1 = r1.getSwipeUpFlingVelocity()
        L_0x00e2:
            X.4mg r8 = r7.A0D
            if (r8 == 0) goto L_0x00ea
            float r0 = r8.getSwipeDownFlingVelocity()
        L_0x00ea:
            float r2 = r6.A01
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x01f2
            boolean r0 = r7.A0Z
            if (r0 == 0) goto L_0x0160
            r1 = 2
        L_0x00f5:
            r0 = 2
            int r4 = r7.A09
            if (r1 != r0) goto L_0x014f
            r1 = r4
            if (r4 == r0) goto L_0x014a
            r0 = 3
            r3 = 4
            if (r4 == r0) goto L_0x0134
            if (r4 != r3) goto L_0x010b
            if (r8 == 0) goto L_0x0132
            boolean r0 = r8.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x0132
        L_0x010b:
            java.lang.Object r0 = r6.A03
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x0130
            float r0 = r0.getY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0119:
            java.lang.Integer r0 = A07(r7, r0)
            r7.A0F = r0
            A09(r7, r1)
            float r9 = r7.A0E(r1)
        L_0x0126:
            double r2 = (double) r2
            double r0 = -r2
            r5.A07(r0)
            double r0 = (double) r9
            r5.A06(r0)
            return r19
        L_0x0130:
            r0 = 0
            goto L_0x0119
        L_0x0132:
            r1 = 1
            goto L_0x010b
        L_0x0134:
            boolean r0 = A0B(r7)
            if (r0 != 0) goto L_0x013b
            r3 = 1
        L_0x013b:
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x0148
            boolean r0 = r0.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x0148
            if (r3 != r9) goto L_0x0148
            goto L_0x010b
        L_0x0148:
            r1 = r3
            goto L_0x010b
        L_0x014a:
            int r1 = r7.A03()
            goto L_0x010b
        L_0x014f:
            r1 = 2
            r0 = 3
            if (r4 == r0) goto L_0x010b
            r0 = 4
            if (r4 == r0) goto L_0x0158
            r1 = r4
            goto L_0x010b
        L_0x0158:
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x010b
            r1 = 3
            goto L_0x010b
        L_0x0160:
            java.lang.Object r0 = r6.A04
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x01de
            float r0 = r0.getRawY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x016e:
            java.lang.Integer r0 = A07(r7, r0)
            r7.A0F = r0
            boolean r0 = A0B(r7)
            r1 = 3
            r4 = 2
            r3 = 4
            if (r0 == 0) goto L_0x01aa
            int r8 = r7.A09
            if (r8 == r1) goto L_0x018d
            if (r8 != r3) goto L_0x01a1
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r0.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x01a1
        L_0x018d:
            A09(r7, r3)
            float r9 = A01(r7)
            X.Pzq r8 = r7.A0Y
            r0 = 14
            X.Jw3 r7 = new X.Jw3
            r7.<init>((java.lang.Object) r6, (int) r4, (int) r3, (int) r0)
        L_0x019d:
            r8.A02(r7)
            goto L_0x0126
        L_0x01a1:
            if (r8 != r4) goto L_0x01aa
            int r0 = r7.A03()
            if (r0 != r3) goto L_0x01aa
            goto L_0x018d
        L_0x01aa:
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x01b8
            boolean r0 = r0.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x01b8
            int r0 = r7.A09
            if (r0 != r9) goto L_0x01c2
        L_0x01b8:
            int r0 = r7.A09
            if (r0 != r4) goto L_0x01d3
            int r0 = r7.A03()
            if (r0 != r1) goto L_0x01d3
        L_0x01c2:
            float r9 = A00(r7)
            A09(r7, r1)
            X.Pzq r8 = r7.A0Y
            r0 = 14
            X.Jw3 r7 = new X.Jw3
            r7.<init>((java.lang.Object) r6, (int) r4, (int) r1, (int) r0)
            goto L_0x019d
        L_0x01d3:
            boolean r0 = A0B(r7)
            if (r0 == 0) goto L_0x01e0
            int r0 = r7.A09
            if (r0 != r1) goto L_0x01e0
            goto L_0x018d
        L_0x01de:
            r0 = 0
            goto L_0x016e
        L_0x01e0:
            A09(r7, r9)
            X.Pzq r3 = r7.A0Y
            r1 = 14
            X.Jw3 r0 = new X.Jw3
            r0.<init>((java.lang.Object) r6, (int) r4, (int) r9, (int) r1)
            r3.A02(r0)
            r9 = 0
            goto L_0x0126
        L_0x01f2:
            float r0 = -r1
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r0 = r7.A0Z
            if (r1 >= 0) goto L_0x0246
            if (r0 == 0) goto L_0x0203
            r1 = 1
            goto L_0x00f5
        L_0x01fe:
            r1 = 1163575296(0x455ac000, float:3500.0)
            goto L_0x00e2
        L_0x0203:
            double r2 = (double) r2
            double r0 = -r2
            r5.A07(r0)
            java.lang.Object r0 = r6.A04
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x0239
            float r0 = r0.getRawY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0216:
            java.lang.Integer r0 = A07(r7, r0)
            r7.A0F = r0
            boolean r0 = A0B(r7)
            r8 = 1
            if (r0 == 0) goto L_0x023b
            int r1 = r7.A09
            r0 = 4
            if (r1 != r0) goto L_0x023b
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x023b
            float r0 = A00(r7)
            double r0 = (double) r0
            r5.A06(r0)
            r11 = 3
            goto L_0x00c7
        L_0x0239:
            r0 = 0
            goto L_0x0216
        L_0x023b:
            float r0 = A02(r7)
            double r0 = (double) r0
            r5.A06(r0)
            r11 = 2
            goto L_0x00c7
        L_0x0246:
            if (r0 == 0) goto L_0x033a
            java.lang.Object r1 = r6.A04
            android.view.MotionEvent r1 = (android.view.MotionEvent) r1
            if (r1 == 0) goto L_0x0337
            float r3 = r1.getRawY()
        L_0x0252:
            java.lang.Object r0 = r6.A03
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x0334
            float r0 = r0.getRawY()
        L_0x025c:
            float r3 = r3 - r0
            r10 = 1
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            boolean r8 = X.AnonymousClass7TF.A1R(r0)
            int r3 = r7.A0F()
            int r0 = r7.A09
            r4 = 2
            if (r0 != r4) goto L_0x02d8
            int r0 = r7.A05
            if (r0 == 0) goto L_0x02d8
            if (r0 == r4) goto L_0x02d8
            int r12 = r7.A0F()
            int r10 = r7.A05
            r11 = 1
            if (r10 != r9) goto L_0x02c8
            int r0 = r7.A04(r4, r9, r8)
            if (r12 < r0) goto L_0x0283
            r11 = 2
        L_0x0283:
            int r10 = r7.A09
            r8 = 0
            r4 = 2
            if (r10 == r11) goto L_0x0295
            if (r11 == r4) goto L_0x02c6
            r3 = 4
            r0 = 3
            if (r11 != r0) goto L_0x02b9
            if (r10 == r9) goto L_0x02c6
            if (r10 == r4) goto L_0x02c4
            if (r10 == r3) goto L_0x02c6
        L_0x0295:
            if (r1 == 0) goto L_0x02b7
            float r0 = r1.getRawY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x029f:
            java.lang.Integer r0 = A07(r7, r0)
            r7.A0F = r0
            A09(r7, r11)
            float r4 = r7.A0E(r11)
            double r2 = (double) r2
            double r0 = -r2
            r5.A07(r0)
            double r0 = (double) r4
            r5.A06(r0)
            goto L_0x00ca
        L_0x02b7:
            r0 = 0
            goto L_0x029f
        L_0x02b9:
            if (r11 != r3) goto L_0x02c2
            if (r10 == r9) goto L_0x02c6
            if (r10 == r4) goto L_0x02c4
            if (r10 == r0) goto L_0x02c4
            goto L_0x0295
        L_0x02c2:
            if (r11 != r9) goto L_0x0295
        L_0x02c4:
            r8 = 2
            goto L_0x0295
        L_0x02c6:
            r8 = 1
            goto L_0x0295
        L_0x02c8:
            int r3 = r7.A04(r4, r10, r8)
            int r0 = r7.A04(r10, r9, r8)
            if (r12 >= r0) goto L_0x02d4
            r10 = 1
            goto L_0x0319
        L_0x02d4:
            if (r12 <= r3) goto L_0x0319
            r10 = 2
            goto L_0x0319
        L_0x02d8:
            boolean r0 = A0B(r7)
            r11 = 4
            if (r0 == 0) goto L_0x02f3
            float r12 = (float) r3
            float r0 = A01(r7)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02f3
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x0312
            boolean r0 = r0.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x0312
            goto L_0x0283
        L_0x02f3:
            float r12 = (float) r3
            float r0 = A00(r7)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x031c
            boolean r0 = A0B(r7)
            if (r0 == 0) goto L_0x0303
            r10 = 4
        L_0x0303:
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x030a
            r4 = 3
        L_0x030a:
            int r0 = r7.A04(r4, r10, r8)
            if (r3 < r0) goto L_0x0319
            r10 = r4
            goto L_0x0319
        L_0x0312:
            int r0 = r7.A04(r11, r9, r8)
            if (r3 < r0) goto L_0x0319
            r10 = 4
        L_0x0319:
            r11 = r10
            goto L_0x0283
        L_0x031c:
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x0332
            boolean r0 = A0B(r7)
            if (r0 == 0) goto L_0x0332
        L_0x0328:
            int r0 = r7.A04(r4, r11, r8)
            if (r3 >= r0) goto L_0x032f
            r4 = r11
        L_0x032f:
            r11 = r4
            goto L_0x0283
        L_0x0332:
            r11 = 3
            goto L_0x0328
        L_0x0334:
            r0 = 0
            goto L_0x025c
        L_0x0337:
            r3 = 0
            goto L_0x0252
        L_0x033a:
            int r15 = r7.A0F()
            float r0 = A00(r7)
            double r3 = (double) r0
            X.4mg r0 = r7.A0D
            r10 = 0
            if (r0 == 0) goto L_0x03eb
            double r16 = r0.getSwipeUpDistanceAdjustment()
        L_0x034d:
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x03e7
            double r13 = r0.getDragUpReleaseRatio()
        L_0x0355:
            java.lang.Object r12 = r6.A04
            android.view.MotionEvent r12 = (android.view.MotionEvent) r12
            if (r12 == 0) goto L_0x03e4
            float r1 = r12.getRawY()
        L_0x035f:
            java.lang.Object r0 = r6.A03
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            if (r0 == 0) goto L_0x03e2
            float r0 = r0.getRawY()
        L_0x0369:
            float r1 = r1 - r0
            r2 = 0
            int r0 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            boolean r18 = X.AnonymousClass7TF.A1R(r0)
            int r0 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r11 = 4
            r8 = 2
            if (r0 != 0) goto L_0x03bf
            int r0 = r7.A09
            if (r0 == r8) goto L_0x03bf
            float r0 = r7.A0E(r0)
            double r0 = (double) r0
            double r0 = r0 + r16
        L_0x0386:
            float r10 = (float) r0
        L_0x0387:
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x03bc
            double r0 = r0.getSwipeDownDistanceAdjustment()
        L_0x038f:
            if (r12 == 0) goto L_0x03ba
            float r12 = r12.getRawY()
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
        L_0x0399:
            java.lang.Integer r12 = A07(r7, r12)
            r7.A0F = r12
            float r12 = (float) r15
            int r10 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x03ef
            float r0 = A02(r7)
            double r0 = (double) r0
            r5.A06(r0)
            A09(r7, r8)
            X.Pzq r3 = r7.A0Y
            r0 = 14
            X.Jw3 r1 = new X.Jw3
            r1.<init>((java.lang.Object) r6, (int) r9, (int) r8, (int) r0)
            goto L_0x00d3
        L_0x03ba:
            r12 = 0
            goto L_0x0399
        L_0x03bc:
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x038f
        L_0x03bf:
            boolean r0 = r7.A0A()
            if (r0 == 0) goto L_0x03d1
            int r0 = r7.A09
            if (r0 != r11) goto L_0x03d1
            float r10 = A02(r7)
            r0 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r0
            goto L_0x0387
        L_0x03d1:
            int r0 = A05(r7)
            double r0 = (double) r0
            double r0 = r0 - r3
            if (r18 == 0) goto L_0x03df
            r16 = r13
        L_0x03db:
            double r0 = r0 * r16
            double r0 = r0 + r3
            goto L_0x0386
        L_0x03df:
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x03db
        L_0x03e2:
            r0 = 0
            goto L_0x0369
        L_0x03e4:
            r1 = 0
            goto L_0x035f
        L_0x03e7:
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x0355
        L_0x03eb:
            r16 = 0
            goto L_0x034d
        L_0x03ef:
            boolean r16 = A0B(r7)
            r10 = 3
            if (r16 == 0) goto L_0x041e
            float r3 = A01(r7)
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x046e
            X.4mg r3 = r7.A0D
            if (r3 == 0) goto L_0x046e
            boolean r3 = r3.doNotDismissOnDraggingDown()
            if (r3 != r9) goto L_0x046e
            float r0 = A01(r7)
            double r0 = (double) r0
            r5.A06(r0)
            A09(r7, r11)
            X.Pzq r3 = r7.A0Y
        L_0x0415:
            r0 = 14
            X.Jw3 r1 = new X.Jw3
            r1.<init>((java.lang.Object) r6, (int) r2, (int) r11, (int) r0)
            goto L_0x00d3
        L_0x041e:
            r12 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 != 0) goto L_0x044e
            double r0 = (double) r15
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r3 / r14
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x0440
            X.4mg r0 = r7.A0D
            if (r0 == 0) goto L_0x04d0
            boolean r0 = r0.doNotDismissOnDraggingDown()
            if (r0 != r9) goto L_0x04d0
        L_0x0437:
            r5.A06(r3)
            A09(r7, r10)
            X.Pzq r3 = r7.A0Y
            goto L_0x04b2
        L_0x0440:
            r11 = 1
            int r0 = r7.A09
            if (r0 != r8) goto L_0x0437
            int r0 = r7.A05
            if (r0 != r9) goto L_0x0437
            r5.A04()
            goto L_0x00c7
        L_0x044e:
            int r2 = r7.A09
            float r2 = r7.A0E(r2)
            double r2 = (double) r2
            double r2 = r2 * r0
            double r0 = (double) r15
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x04d0
            int r0 = r7.A09
            float r0 = r7.A0E(r0)
            double r0 = (double) r0
            r5.A06(r0)
            X.Pzq r3 = r7.A0Y
            r2 = 2
            if (r18 == 0) goto L_0x046b
            r2 = 1
        L_0x046b:
            int r10 = r7.A09
            goto L_0x04b2
        L_0x046e:
            float r3 = A01(r7)
            float r2 = r7.A02
            float r3 = r3 * r2
            int r2 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x04d0
            float r4 = A01(r7)
            float r3 = A00(r7)
            float r2 = A01(r7)
            float r3 = r3 - r2
            if (r18 == 0) goto L_0x04bb
            float r2 = (float) r13
        L_0x0489:
            float r3 = r3 * r2
            float r4 = r4 + r3
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x04bd
            int r0 = r7.A09
            if (r0 != r11) goto L_0x0499
            boolean r0 = r7.A0A()
            if (r0 != 0) goto L_0x04bd
        L_0x0499:
            int r0 = r7.A09
            if (r0 != r8) goto L_0x04a1
            int r0 = r7.A05
            if (r0 == r11) goto L_0x04bd
        L_0x04a1:
            float r0 = A00(r7)
            double r0 = (double) r0
            r5.A06(r0)
            A09(r7, r10)
            X.Pzq r3 = r7.A0Y
            r2 = 2
            if (r18 == 0) goto L_0x04b2
            r2 = 1
        L_0x04b2:
            r0 = 14
            X.Jw3 r1 = new X.Jw3
            r1.<init>((java.lang.Object) r6, (int) r2, (int) r10, (int) r0)
            goto L_0x00d3
        L_0x04bb:
            float r2 = (float) r0
            goto L_0x0489
        L_0x04bd:
            float r0 = A01(r7)
            double r0 = (double) r0
            r5.A06(r0)
            A09(r7, r11)
            X.Pzq r3 = r7.A0Y
            r2 = 2
            if (r18 == 0) goto L_0x0415
            r2 = 1
            goto L_0x0415
        L_0x04d0:
            r5.A04()
            r11 = 1
            goto L_0x00c7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Pzn.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r0.isInMultiWindowMode() != false) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float A01(X.C7218Pzn r4) {
        /*
            X.4df r3 = r4.A0X
            boolean r1 = r3 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            int r0 = A05(r4)
            float r2 = (float) r0
            if (r1 == 0) goto L_0x004c
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.bottomsheet.MultiAnchorBottomSheetContents"
            X.0qQ.A0C(r3, r0)
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r3 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r3
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0022
            android.content.res.Configuration r0 = X.Pxf.A0G(r0)
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L_0x0034
        L_0x0022:
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x003b
            android.app.Activity r0 = r3.getRootActivity()
            if (r0 == 0) goto L_0x0051
            boolean r0 = r0.isInMultiWindowMode()
            if (r0 == 0) goto L_0x003b
        L_0x0034:
            X.7Pr r1 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r3)
            r0 = 0
            r1.A01 = r0
        L_0x003b:
            boolean r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A0K(r3)
            if (r0 == 0) goto L_0x0049
            X.7Pr r0 = com.instagram.igds.components.bottomsheet.BottomSheetFragment.A00(r3)
            float r0 = r0.A01
        L_0x0047:
            float r2 = r2 * r0
            return r2
        L_0x0049:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0047
        L_0x004c:
            float r0 = r3.CoU()
            goto L_0x0047
        L_0x0051:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Pzn.A01(X.Pzn):float");
    }

    private final int A03() {
        C268594df r1 = this.A0X;
        if (!(r1 instanceof BottomSheetFragment)) {
            return 1;
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.MultiAnchorBottomSheetContents");
        int i = BottomSheetFragment.A00((BottomSheetFragment) r1).A07;
        if (i != 0) {
            return i;
        }
        if (!A0A() && Math.floor((double) A00(this)) != Math.floor((double) A02(this))) {
            return 3;
        }
        if (A0B(this)) {
            return 4;
        }
        return 1;
    }

    public static final int A05(C7218Pzn pzn) {
        int Abe;
        C13677Tem tem = pzn.A0C;
        if (tem != null && (Abe = tem.Abe()) > 0) {
            return Abe;
        }
        View C4U = pzn.A0X.C4U();
        if (C4U != null) {
            return C4U.getHeight();
        }
        return 0;
    }

    public static final int A06(C7218Pzn pzn) {
        C273504mg r2 = pzn.A0D;
        int C8P = pzn.A0X.C8P();
        if (r2 != null) {
            return C8P + r2.getExtraDragSpace();
        }
        return C8P;
    }

    public static final Integer A07(C7218Pzn pzn, Float f) {
        if (f == null) {
            return AnonymousClass05K.A01;
        }
        if (pzn.A0J(f.floatValue())) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0C;
    }

    public static final void A08(MotionEvent motionEvent, C7218Pzn pzn) {
        if (!pzn.A0H) {
            float rawX = pzn.A00 - motionEvent.getRawX();
            float rawY = pzn.A01 - motionEvent.getRawY();
            if (Math.hypot((double) rawX, (double) rawY) > ((double) pzn.A0a) && Math.atan((double) Math.abs(rawY / rawX)) >= A0e) {
                pzn.A0H = true;
            }
        }
    }

    public static final void A09(C7218Pzn pzn, int i) {
        int i2 = pzn.A09;
        if (i != i2) {
            pzn.A08 = i2;
            pzn.A09 = i;
            pzn.A0Y.A02.A06 = i2;
        }
    }

    private final boolean A0A() {
        C268594df r1 = this.A0X;
        if (r1 instanceof BottomSheetFragment) {
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.MultiAnchorBottomSheetContents");
            if (!BottomSheetFragment.A00((BottomSheetFragment) r1).A0r) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0B(C7218Pzn pzn) {
        C268594df r1 = pzn.A0X;
        if (r1 instanceof BottomSheetFragment) {
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.ui.bottomsheet.MultiAnchorBottomSheetContents");
            if (!BottomSheetFragment.A00((BottomSheetFragment) r1).A0s) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0C(C7218Pzn pzn) {
        if ((pzn.A07 == 0 || pzn.A0X.AB6()) && pzn.A0X.CPc()) {
            return true;
        }
        return false;
    }

    public final int A0F() {
        View C4U = this.A0X.C4U();
        if (C4U != null) {
            return A05(this) - ((int) C4U.getTranslationY());
        }
        return (int) this.A0V.A09.A00;
    }

    public final void A0G() {
        this.A0V.A0D.clear();
        AnonymousClass3E6 r0 = this.A0W;
        r0.EEH(this);
        r0.onStop();
        C268594df r1 = this.A0X;
        r1.onBottomSheetClosed();
        if (!this.A0N) {
            View C4U = r1.C4U();
            if (C4U instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) C4U;
                viewGroup.setVisibility(4);
                if (!182.A06(0Tu.A05, this.A0b, 36321284292158700L)) {
                    viewGroup.removeAllViews();
                }
            }
        }
        C13679Teo teo = this.A0d;
        if (teo != null) {
            teo.Cyo();
        }
        A09(this, 1);
    }

    public final boolean A0J(float f) {
        float f2;
        View C4U = this.A0X.C4U();
        if (C4U != null) {
            f2 = C4U.getTranslationY();
        } else {
            f2 = 0.0f;
        }
        return Dba.A1U((f > (f2 + ((float) A06(this))) ? 1 : (f == (f2 + ((float) A06(this))) ? 0 : -1)));
    }

    public final void DMr(int i, boolean z) {
        C295005nO izr;
        C268594df r1 = this.A0X;
        if (!r1.Erf()) {
            this.A07 = i;
        } else if (r1.CPc()) {
            this.A07 = i;
            if (i <= this.A0S) {
                r1.DMt();
            } else {
                r1.DMu(i);
            }
            View C4U = r1.C4U();
            if (C4U != null) {
                C4U.post(new Q0E(this));
            }
        } else {
            View view = this.A0U;
            C71392co r0 = C315596kB.A02;
            C294975nL A002 = C294975nL.A00(view);
            A002.A0G();
            if (i == 0) {
                izr = this.A0c;
            } else {
                izr = new IZR(i, 1, this);
            }
            A002.A05 = izr;
            C294975nL A0A2 = A002.A0A();
            A0A2.A0K(-((float) i));
            A0A2.A0H();
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.A0M) {
            this.A0M = false;
            return true;
        } else if (!this.A0H || this.A0I) {
            return true;
        } else {
            C273504mg r2 = this.A0D;
            if (r2 != null && r2.doNotDragWhenDismissLocked()) {
                if (((float) Math.min(Math.max((double) (((float) A0F()) + f2 + ((float) r2.dragLockBouncePx())), 0.0d), (double) A02(this))) <= ((float) A05(this)) * this.A0X.CoU()) {
                    return true;
                }
            }
            float A0F2 = (float) A0F();
            float min = (float) Math.min(Math.max((double) (f2 + A0F2), 0.0d), (double) A02(this));
            if (A0F2 == min) {
                return true;
            }
            if (!this.A0X.AB6()) {
                0nA.A0N(this.A0U);
            }
            JTP.A1K(this.A0V, min);
            return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        AnonymousClass37F r0 = this.A0Y.A02;
        View.OnClickListener onClickListener = r0.A08;
        if (onClickListener == null) {
            return false;
        }
        onClickListener.onClick(AnonymousClass37F.A01(r0));
        return false;
    }

    public static final float A00(C7218Pzn pzn) {
        return ((float) A05(pzn)) * pzn.A0X.CMx();
    }

    public static final float A02(C7218Pzn pzn) {
        return ((float) A05(pzn)) * pzn.A0X.Cmb();
    }

    private final int A04(int i, int i2, boolean z) {
        C273504mg r0;
        int A0E2 = (int) A0E(i);
        int A0E3 = (int) A0E(i2);
        double d = 0.5d;
        if (z && (r0 = this.A0D) != null) {
            d = r0.getDragUpReleaseRatio();
        }
        return (int) (((double) A0E3) + (((double) (A0E2 - A0E3)) * d));
    }

    public static final boolean A0D(C7218Pzn pzn) {
        return AnonymousClass7TF.A1Q((((double) pzn.A0F()) > Math.floor((double) A02(pzn)) ? 1 : (((double) pzn.A0F()) == Math.floor((double) A02(pzn)) ? 0 : -1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(boolean r7) {
        /*
            r6 = this;
            boolean r0 = A0C(r6)
            if (r0 == 0) goto L_0x0042
            X.2cs r4 = r6.A0V
            X.2ct r0 = r4.A09
            double r2 = r0.A00
            float r0 = A02(r6)
            double r0 = (double) r0
            double r1 = java.lang.Math.min(r2, r0)
            boolean r0 = r4.A0C()
            r4.A08(r1, r0)
            r5 = 2
            r1 = 3
            if (r7 != 0) goto L_0x0043
            int r0 = r6.A09
            if (r0 == r1) goto L_0x0043
            if (r0 != r5) goto L_0x002e
            float r0 = A02(r6)
        L_0x002a:
            double r0 = (double) r0
            r4.A06(r0)
        L_0x002e:
            double r3 = r4.A01
            float r0 = A02(r6)
            double r1 = (double) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003f
            boolean r0 = r6.A0G
            r5 = 3
            if (r0 == 0) goto L_0x003f
            r5 = 4
        L_0x003f:
            A09(r6, r5)
        L_0x0042:
            return
        L_0x0043:
            float r0 = A00(r6)
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7218Pzn.A0I(boolean):void");
    }

    public final void DmC(2cs r10) {
        int height;
        int height2;
        if (A0F() == 0) {
            this.A0Y.A00();
            if (this.A0P) {
                this.A0V.A0B(this);
            } else {
                0nA.A0N(this.A0U);
            }
        } else if (this.A09 == 3) {
            C7221Pzq pzq = this.A0Y;
            Integer num = this.A0F;
            0qQ.A0B(num, 0);
            AnonymousClass37F r3 = pzq.A02;
            for (C262944Gp r5 : r3.A0z) {
                C268594df r7 = pzq.A01;
                View C4U = r7.C4U();
                if (C4U == null) {
                    height = 0;
                } else {
                    height = (int) (((float) C4U.getHeight()) * (1.0f - r7.CMx()));
                }
                r5.Cv6((float) height);
                View C4U2 = r7.C4U();
                if (C4U2 == null) {
                    height2 = 0;
                } else {
                    height2 = (int) (((float) C4U2.getHeight()) * (1.0f - r7.CMx()));
                }
                r5.Cv7(num, (float) height2);
            }
            C10312RqA rqA = r3.A0C;
            if (rqA != null) {
                rqA.A00.FMM(REW.HALF_SHEET, C9856RiV.A00(num));
            }
            r3.A0C();
        } else if (A0D(this)) {
            C7221Pzq pzq2 = this.A0Y;
            Integer num2 = this.A0F;
            0qQ.A0B(num2, 0);
            AnonymousClass37F r32 = pzq2.A02;
            for (C262944Gp DHB : r32.A0z) {
                DHB.DHB(num2);
            }
            C10312RqA rqA2 = r32.A0C;
            if (rqA2 != null) {
                rqA2.A00.FMM(REW.FULL_SCREEN, C9856RiV.A00(num2));
            }
            if (r32.A0O) {
                AnonymousClass37F.A02(r32).CNi((View.OnTouchListener) null);
            }
        } else if (this.A09 == 4) {
            this.A0Y.A03(this.A0F);
        }
        this.A0F = AnonymousClass05K.A04;
    }
}
