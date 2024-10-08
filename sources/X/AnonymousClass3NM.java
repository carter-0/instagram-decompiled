package X;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.View;
import java.util.List;

/* renamed from: X.3NM  reason: invalid class name */
public final class AnonymousClass3NM implements View.OnTouchListener, C252203oj {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final View A06;
    public final 2cs A07;
    public final AnonymousClass3NL A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B = true;
    public final float A0C;
    public final Rect A0D;
    public final GestureDetector A0E;
    public final View.OnAttachStateChangeListener A0F;
    public final AnonymousClass3NO A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public AnonymousClass3NM(AnonymousClass3NG r7) {
        this.A08 = r7.A04;
        View view = r7.A0D;
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new AnonymousClass3NN(this, r7), new Handler(Looper.getMainLooper()));
        this.A0E = gestureDetector;
        gestureDetector.setIsLongpressEnabled(r7.A06);
        this.A04 = r7.A02;
        this.A06 = view;
        this.A05 = view.getLayerType();
        this.A09 = r7.A0E;
        this.A0L = r7.A0C;
        this.A0D = new Rect();
        this.A0G = new AnonymousClass3NO(this);
        this.A0H = r7.A07;
        this.A0A = r7.A08;
        this.A0J = r7.A0A;
        this.A0K = r7.A0B;
        this.A0I = r7.A09;
        this.A0C = 0.7f;
        2cs A022 = C61340me.A00().A02();
        A022.A09(r7.A03);
        A022.A02 = r7.A01;
        A022.A00 = r7.A00;
        A022.A08(1.0d, true);
        A022.A01();
        A022.A0A(this);
        this.A07 = A022;
        AnonymousClass3NP r0 = new AnonymousClass3NP(this);
        this.A0F = r0;
        view.addOnAttachStateChangeListener(r0);
        view.setOnTouchListener(this);
        view.setClickable(false);
        view.setFocusable(true);
        03v.A0B(view, new AnonymousClass3NQ(r7));
    }

    public final void A02() {
        this.A00 = false;
        this.A03 = false;
        this.A07.A08(1.0d, true);
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass3NI) list.get(i)).Df1(this);
        }
    }

    public final void A03() {
        View view = this.A06;
        view.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        view.removeOnAttachStateChangeListener(this.A0F);
        view.setOnTouchListener((View.OnTouchListener) null);
    }

    public final void DmD(2cs r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r2 != 3) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r6.A0G.A01 != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r4 = 1
            X.0qQ.A0B(r8, r4)
            boolean r0 = r6.A01
            r3 = 0
            if (r0 == 0) goto L_0x000e
            return r5
        L_0x000e:
            X.3NL r1 = r6.A08
            boolean r0 = r1 instanceof X.C284715Nq
            if (r0 == 0) goto L_0x001b
            X.5Nq r1 = (X.C284715Nq) r1
            if (r1 == 0) goto L_0x001b
            r1.DsM(r8, r7)
        L_0x001b:
            int r0 = r8.getAction()
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x005d
            if (r2 == r4) goto L_0x002c
            r0 = 2
            if (r2 == r0) goto L_0x0052
            r0 = 3
            if (r2 == r0) goto L_0x002c
        L_0x002b:
            return r3
        L_0x002c:
            android.view.View r0 = r6.A06
            X.3NO r1 = r6.A0G
            r0.removeCallbacks(r1)
            boolean r0 = r6.A0L
            if (r0 == 0) goto L_0x0045
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0045
            if (r2 != r4) goto L_0x0042
            r6.A00 = r4
            r6.A01()
        L_0x0042:
            r1.run()
        L_0x0045:
            r1.A01 = r5
            android.view.MotionEvent r0 = r1.A00
            if (r0 == 0) goto L_0x004e
            r0.recycle()
        L_0x004e:
            r0 = 0
            r1.A00 = r0
            goto L_0x0058
        L_0x0052:
            X.3NO r0 = r6.A0G
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x002b
        L_0x0058:
            boolean r3 = A00(r8, r6)
            return r3
        L_0x005d:
            X.3NO r3 = r6.A0G
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r8)
            android.view.MotionEvent r0 = r3.A00
            if (r0 == 0) goto L_0x006a
            r0.recycle()
        L_0x006a:
            r3.A00 = r1
            android.view.View r2 = r6.A06
            r2.removeCallbacks(r3)
            boolean r0 = r6.A0L
            if (r0 == 0) goto L_0x007c
            r0 = 150(0x96, double:7.4E-322)
            r2.postOnAnimationDelayed(r3, r0)
        L_0x007a:
            r3 = 1
            return r3
        L_0x007c:
            r3.run()
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NM.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r7.A0A != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(android.view.MotionEvent r6, X.AnonymousClass3NM r7) {
        /*
            android.graphics.Rect r5 = r7.A0D
            float r0 = r6.getX()
            int r1 = (int) r0
            float r0 = r6.getY()
            int r0 = (int) r0
            boolean r4 = r5.contains(r1, r0)
            int r1 = r6.getAction()
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L_0x008e
            if (r1 == r3) goto L_0x0029
            r0 = 2
            if (r1 == r0) goto L_0x0087
            r0 = 3
            if (r1 != r0) goto L_0x0028
            r7.A04()
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
        L_0x0028:
            return r2
        L_0x0029:
            if (r4 == 0) goto L_0x0028
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0056
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x005a
            r7.A03 = r3
            X.2cs r0 = r7.A07
            X.2ct r0 = r0.A09
            double r4 = r0.A00
            float r1 = (float) r4
            float r0 = r7.A04
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0075
            X.3NL r1 = r7.A08
            if (r1 == 0) goto L_0x0059
            android.view.View r0 = r7.A06
            r1.Dqe(r0)
            r7.A03 = r2
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x0059
        L_0x0056:
            r7.A04()
        L_0x0059:
            return r3
        L_0x005a:
            boolean r0 = r7.A0J
            if (r0 == 0) goto L_0x0061
            r7.A03 = r3
            goto L_0x0056
        L_0x0061:
            boolean r0 = r7.A0K
            if (r0 == 0) goto L_0x0079
            r7.A00 = r3
            r7.A01()
            X.3NL r1 = r7.A08
            if (r1 == 0) goto L_0x0028
            android.view.View r0 = r7.A06
            boolean r2 = r1.Dqe(r0)
            return r2
        L_0x0075:
            r7.A01()
            return r3
        L_0x0079:
            r7.A04()
            X.3NL r1 = r7.A08
            if (r1 == 0) goto L_0x008c
            android.view.View r0 = r7.A06
            boolean r3 = r1.Dqe(r0)
            return r3
        L_0x0087:
            if (r4 != 0) goto L_0x00a1
            r7.A04()
        L_0x008c:
            r3 = 0
            return r3
        L_0x008e:
            android.view.View r0 = r7.A06
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r5.set(r2, r2, r1, r0)
            r7.A00 = r2
            r7.A03 = r2
            r7.A02 = r2
        L_0x00a1:
            r7.A01()
            android.view.GestureDetector r0 = r7.A0E
            r0.onTouchEvent(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3NM.A00(android.view.MotionEvent, X.3NM):boolean");
    }

    public final void A01() {
        2cs r2 = this.A07;
        r2.A06 = true;
        r2.A06((double) this.A04);
        if (this.A0I) {
            this.A06.setAlpha(this.A0C);
        }
    }

    public final void A04() {
        2cs r2 = this.A07;
        r2.A06 = false;
        r2.A06(1.0d);
        if (this.A0I) {
            this.A06.setAlpha(1.0f);
        }
    }

    public final void DmB(2cs r5) {
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass3NI) list.get(i)).Cyw(this);
        }
    }

    public final void DmC(2cs r5) {
        boolean z;
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass3NI) list.get(i)).Cyx(this);
        }
        if (this.A03) {
            AnonymousClass3NL r1 = this.A08;
            if (r1 != null) {
                r1.Dqe(this.A06);
                this.A03 = false;
                z = this.A0A;
            } else {
                return;
            }
        } else if (this.A00) {
            z = this.A0K;
        } else {
            return;
        }
        if (z) {
            A04();
        }
    }

    public final void DmE(2cs r7) {
        List list = this.A09;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass3NI) list.get(i)).Cyy(this);
        }
        2cs r4 = this.A07;
        float f = (float) r4.A09.A00;
        if (this.A00 && f <= this.A04) {
            r4.A06(1.0d);
            this.A00 = false;
        }
    }
}
