package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class Q6Y extends Drawable implements Animatable, Drawable.Callback {
    public static final List A0i = Arrays.asList(new String[]{"reduced motion", "reduced_motion", "reduced-motion", "reducedmotion"});
    public static final Executor A0j = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new TOU());
    public float A00;
    public int A01 = 255;
    public Bitmap A02;
    public Canvas A03;
    public Matrix A04;
    public Matrix A05;
    public Paint A06;
    public Rect A07;
    public Rect A08;
    public Rect A09;
    public RectF A0A;
    public RectF A0B;
    public RectF A0C;
    public C8864RDf A0D;
    public RLK A0E;
    public TZo A0F;
    public S7N A0G;
    public C8874RDq A0H = C8874RDq.AUTOMATIC;
    public RLL A0I;
    public C10766Rxk A0J;
    public SFI A0K;
    public C7492QGj A0L;
    public Integer A0M = AnonymousClass05K.A00;
    public String A0N;
    public String A0O;
    public Map A0P;
    public boolean A0Q = false;
    public boolean A0R = true;
    public boolean A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z = false;
    public boolean A0a = true;
    public boolean A0b = false;
    public final Q50 A0c;
    public final Runnable A0d;
    public final ArrayList A0e = AnonymousClass7TE.A1C();
    public final Semaphore A0f;
    public final ValueAnimator.AnimatorUpdateListener A0g;
    public final Matrix A0h = AnonymousClass7TE.A0U();

    public final int getOpacity() {
        return -3;
    }

    private void A00(Canvas canvas) {
        C7492QGj qGj = this.A0L;
        S7N s7n = this.A0G;
        if (qGj != null && s7n != null) {
            Matrix matrix = this.A0h;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(((float) bounds.width()) / ((float) s7n.A05.width()), ((float) bounds.height()) / ((float) s7n.A05.height()));
                matrix.preTranslate((float) bounds.left, (float) bounds.top);
            }
            qGj.AQI(canvas, matrix, this.A01);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00d2, code lost:
        if ((!((android.view.ViewGroup) r1).getClipChildren()) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.graphics.Canvas r9, X.Q6Y r10, X.C7492QGj r11) {
        /*
            X.S7N r0 = r10.A0G
            if (r0 == 0) goto L_0x0184
            android.graphics.Canvas r0 = r10.A03
            if (r0 != 0) goto L_0x0046
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r10.A03 = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A0C = r0
            android.graphics.Matrix r0 = X.AnonymousClass7TE.A0U()
            r10.A04 = r0
            android.graphics.Matrix r0 = X.AnonymousClass7TE.A0U()
            r10.A05 = r0
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r10.A07 = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A0A = r0
            X.Q6V r0 = new X.Q6V
            r0.<init>()
            r10.A06 = r0
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r10.A09 = r0
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r10.A08 = r0
            android.graphics.RectF r0 = X.AnonymousClass7TE.A0Y()
            r10.A0B = r0
        L_0x0046:
            android.graphics.Matrix r0 = r10.A04
            r9.getMatrix(r0)
            android.graphics.Rect r0 = r10.A07
            r9.getClipBounds(r0)
            android.graphics.Rect r5 = r10.A07
            android.graphics.RectF r4 = r10.A0A
            int r0 = r5.left
            float r3 = (float) r0
            int r0 = r5.top
            float r2 = (float) r0
            int r0 = r5.right
            float r1 = (float) r0
            int r0 = r5.bottom
            float r0 = (float) r0
            r4.set(r3, r2, r1, r0)
            android.graphics.Matrix r1 = r10.A04
            android.graphics.RectF r0 = r10.A0A
            r1.mapRect(r0)
            android.graphics.RectF r1 = r10.A0A
            android.graphics.Rect r0 = r10.A07
            A02(r0, r1)
            boolean r0 = r10.A0R
            r3 = 0
            android.graphics.RectF r4 = r10.A0C
            if (r0 == 0) goto L_0x018c
            int r0 = r10.getIntrinsicWidth()
            float r2 = (float) r0
            int r0 = r10.getIntrinsicHeight()
            float r1 = (float) r0
            r0 = 0
            r4.set(r0, r0, r2, r1)
        L_0x0086:
            android.graphics.Matrix r1 = r10.A04
            android.graphics.RectF r0 = r10.A0C
            r1.mapRect(r0)
            android.graphics.Rect r1 = r10.getBounds()
            int r0 = r1.width()
            float r4 = (float) r0
            int r0 = r10.getIntrinsicWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r1.height()
            float r2 = (float) r0
            int r0 = r10.getIntrinsicHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            android.graphics.RectF r7 = r10.A0C
            float r6 = r7.left
            float r6 = r6 * r4
            float r5 = r7.top
            float r5 = r5 * r2
            float r1 = r7.right
            float r1 = r1 * r4
            float r0 = r7.bottom
            float r0 = r0 * r2
            r7.set(r6, r5, r1, r0)
            android.graphics.drawable.Drawable$Callback r1 = r10.getCallback()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00d4
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00d4
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.getClipChildren()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00e7
        L_0x00d4:
            android.graphics.RectF r8 = r10.A0C
            android.graphics.Rect r7 = r10.A07
            int r0 = r7.left
            float r6 = (float) r0
            int r0 = r7.top
            float r5 = (float) r0
            int r0 = r7.right
            float r1 = (float) r0
            int r0 = r7.bottom
            float r0 = (float) r0
            r8.intersect(r6, r5, r1, r0)
        L_0x00e7:
            android.graphics.RectF r0 = r10.A0C
            float r0 = r0.width()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            android.graphics.RectF r0 = r10.A0C
            float r0 = r0.height()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            if (r5 <= 0) goto L_0x0184
            if (r6 <= 0) goto L_0x0184
            android.graphics.Bitmap r0 = r10.A02
            r7 = 1
            if (r0 == 0) goto L_0x0185
            int r0 = r0.getWidth()
            if (r0 < r5) goto L_0x0185
            android.graphics.Bitmap r0 = r10.A02
            int r0 = r0.getHeight()
            if (r0 < r6) goto L_0x0185
            android.graphics.Bitmap r0 = r10.A02
            int r0 = r0.getWidth()
            if (r0 > r5) goto L_0x0126
            android.graphics.Bitmap r0 = r10.A02
            int r0 = r0.getHeight()
            if (r0 <= r6) goto L_0x0138
        L_0x0126:
            android.graphics.Bitmap r0 = r10.A02
            X.0fO.A03(r0)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r3, r3, r5, r6)
        L_0x012f:
            r10.A02 = r0
            android.graphics.Canvas r1 = r10.A03
            r1.setBitmap(r0)
            r10.A0V = r7
        L_0x0138:
            boolean r0 = r10.A0V
            if (r0 == 0) goto L_0x0174
            android.graphics.Matrix r7 = r10.A0h
            android.graphics.Matrix r0 = r10.A04
            r7.set(r0)
            r7.preScale(r4, r2)
            android.graphics.RectF r2 = r10.A0C
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            r7.postTranslate(r1, r0)
            android.graphics.Bitmap r0 = r10.A02
            r0.eraseColor(r3)
            android.graphics.Canvas r1 = r10.A03
            int r0 = r10.A01
            r11.AQI(r1, r7, r0)
            android.graphics.Matrix r1 = r10.A04
            android.graphics.Matrix r0 = r10.A05
            r1.invert(r0)
            android.graphics.Matrix r2 = r10.A05
            android.graphics.RectF r1 = r10.A0B
            android.graphics.RectF r0 = r10.A0C
            r2.mapRect(r1, r0)
            android.graphics.RectF r1 = r10.A0B
            android.graphics.Rect r0 = r10.A08
            A02(r0, r1)
        L_0x0174:
            android.graphics.Rect r0 = r10.A09
            r0.set(r3, r3, r5, r6)
            android.graphics.Bitmap r3 = r10.A02
            android.graphics.Rect r2 = r10.A09
            android.graphics.Rect r1 = r10.A08
            android.graphics.Paint r0 = r10.A06
            r9.drawBitmap(r3, r2, r1, r0)
        L_0x0184:
            return
        L_0x0185:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            goto L_0x012f
        L_0x018c:
            r0 = 0
            r11.Aha(r0, r4, r3)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6Y.A01(android.graphics.Canvas, X.Q6Y, X.QGj):void");
    }

    public static void A02(Rect rect, RectF rectF) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    public static void A03(Q6Y q6y) {
        Q6Y q6y2 = q6y;
        S7N s7n = q6y2.A0G;
        if (s7n != null) {
            SNH snh = C11157SCn.A00;
            Rect rect = s7n.A05;
            List emptyList = Collections.emptyList();
            Integer num = AnonymousClass05K.A00;
            List emptyList2 = Collections.emptyList();
            Integer num2 = num;
            Integer num3 = num;
            C7492QGj qGj = new C7492QGj(s7n, q6y2, new S56(s7n, (QGY) null, (C7489QGe) null, (C10655Rvp) null, new C11816Sh2(), (C10157RnY) null, (C10723Rx1) null, num, num2, num3, "__container", (String) null, emptyList, emptyList2, Collections.emptyList(), 0.0f, 0.0f, (float) rect.width(), (float) rect.height(), 0, 0, 0, -1, -1, false), s7n.A08);
            q6y2.A0L = qGj;
            if (q6y2.A0X) {
                qGj.A0E(true);
            }
            q6y2.A0L.A01 = q6y2.A0R;
        }
    }

    public static void A04(Q6Y q6y) {
        boolean z;
        S7N s7n = q6y.A0G;
        if (s7n != null) {
            C8874RDq rDq = q6y.A0H;
            int i = s7n.A04;
            int ordinal = rDq.ordinal();
            if (ordinal == 1 || (ordinal != 2 && i <= 4)) {
                z = false;
            } else {
                z = true;
            }
            q6y.A0b = z;
        }
    }

    public final void A05() {
        Q50 q50 = this.A0c;
        if (q50.A08) {
            q50.cancel();
            if (!isVisible()) {
                this.A0M = AnonymousClass05K.A00;
            }
        }
        this.A0G = null;
        this.A0L = null;
        this.A0K = null;
        this.A00 = -3.4028235E38f;
        q50.A07 = null;
        q50.A03 = -2.14748365E9f;
        q50.A02 = 2.14748365E9f;
        invalidateSelf();
    }

    public final void A06() {
        this.A0e.clear();
        Q50 q50 = this.A0c;
        Choreographer.getInstance().removeFrameCallback(q50);
        q50.A08 = false;
        for (Animator.AnimatorPauseListener onAnimationPause : q50.A0C) {
            onAnimationPause.onAnimationPause(q50);
        }
        if (!isVisible()) {
            this.A0M = AnonymousClass05K.A00;
        }
    }

    public final void A07() {
        float A012;
        Integer num;
        float A022;
        if (this.A0L == null) {
            this.A0e.add(new C11771SgJ(this, 0));
            return;
        }
        A04(this);
        if (this.A0a || this.A0T || this.A0c.getRepeatCount() == 0) {
            if (isVisible()) {
                Q50 q50 = this.A0c;
                q50.A08 = true;
                boolean A1T = C51970G9q.A1T((q50.A04 > 0.0f ? 1 : (q50.A04 == 0.0f ? 0 : -1)));
                for (Animator.AnimatorListener onAnimationStart : q50.A0B) {
                    onAnimationStart.onAnimationStart(q50, A1T);
                }
                if (q50.A04 < 0.0f) {
                    A022 = q50.A01();
                } else {
                    A022 = q50.A02();
                }
                q50.A06((float) ((int) A022));
                q50.A06 = 0;
                q50.A05 = 0;
                q50.A05();
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            this.A0M = num;
        }
        if (!this.A0a && !this.A0T) {
            Iterator it = A0i.iterator();
            while (true) {
                if (it.hasNext()) {
                    C10521Rta A013 = this.A0G.A01(AnonymousClass7TE.A18(it));
                    if (A013 != null) {
                        A012 = A013.A01;
                        break;
                    }
                } else {
                    Q50 q502 = this.A0c;
                    if (q502.A04 < 0.0f) {
                        A012 = q502.A02();
                    } else {
                        A012 = q502.A01();
                    }
                }
            }
            A0C((int) A012);
            this.A0c.A03();
            if (!isVisible()) {
                this.A0M = AnonymousClass05K.A00;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[LOOP:0: B:18:0x0053->B:20:0x0059, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08() {
        /*
            r3 = this;
            X.QGj r0 = r3.A0L
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0e
            r1 = 1
            X.SgJ r0 = new X.SgJ
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            A04(r3)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0023
            X.Q50 r0 = r3.A0c
            int r0 = r0.getRepeatCount()
            if (r0 != 0) goto L_0x0077
        L_0x0023:
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L_0x0073
            X.Q50 r2 = r3.A0c
            r0 = 1
            r2.A08 = r0
            r2.A05()
            r0 = 0
            r2.A06 = r0
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L_0x0063
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A01()
        L_0x004a:
            r2.A06(r0)
        L_0x004d:
            java.util.Set r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r0.onAnimationResume(r2)
            goto L_0x0053
        L_0x0063:
            float r0 = r2.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A02()
            goto L_0x004a
        L_0x0070:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x0075
        L_0x0073:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x0075:
            r3.A0M = r0
        L_0x0077:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x000f
            X.Q50 r2 = r3.A0c
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            float r0 = r2.A02()
        L_0x008c:
            int r0 = (int) r0
            r3.A0C(r0)
            r2.A03()
            boolean r0 = r3.isVisible()
            if (r0 != 0) goto L_0x000f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A0M = r0
            return
        L_0x009e:
            float r0 = r2.A01()
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6Y.A08():void");
    }

    public final void A09(float f) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11773SgL(this, f, 0));
            return;
        }
        Q50 q50 = this.A0c;
        q50.A07(q50.A03, Pxh.A00(s7n.A00, s7n.A03, f));
    }

    public final void A0A(float f) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11773SgL(this, f, 2));
            return;
        }
        A0E((int) Pxh.A00(s7n.A00, s7n.A03, f));
    }

    public final void A0B(float f) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11773SgL(this, f, 1));
            return;
        }
        this.A0c.A06(Pxh.A00(s7n.A00, s7n.A03, f));
    }

    public final void A0C(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C11774SgM(this, i, 0));
        } else {
            this.A0c.A06((float) i);
        }
    }

    public final void A0D(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C11774SgM(this, i, 2));
            return;
        }
        Q50 q50 = this.A0c;
        q50.A07(q50.A03, ((float) i) + 0.99f);
    }

    public final void A0E(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C11774SgM(this, i, 1));
            return;
        }
        Q50 q50 = this.A0c;
        q50.A07((float) i, (float) ((int) q50.A02));
    }

    public final void A0F(int i, int i2) {
        if (this.A0G == null) {
            this.A0e.add(new C11772SgK(this, i, i2));
        } else {
            this.A0c.A07((float) i, ((float) i2) + 0.99f);
        }
    }

    public final void A0G(SPM spm, SIR sir, Object obj) {
        C7492QGj qGj = this.A0L;
        if (qGj == null) {
            this.A0e.add(new C11776SgO(this, spm, sir, obj));
            return;
        }
        if (spm == SPM.A02) {
            qGj.AAd(sir, obj);
        } else {
            C13688Tf5 tf5 = spm.A00;
            if (tf5 != null) {
                tf5.AAd(sir, obj);
            } else {
                ArrayList A1C = AnonymousClass7TE.A1C();
                qGj.EIb(spm, new SPM(new String[0]), A1C, 0);
                for (int i = 0; i < A1C.size(); i++) {
                    ((SPM) A1C.get(i)).A00.AAd(sir, obj);
                }
                if (!DbT.A1b(A1C)) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == C13881Tj4.A0S) {
            A0B(this.A0c.A00());
        }
    }

    public final void A0H(String str) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11775SgN(this, str, 2));
            return;
        }
        C10521Rta A012 = s7n.A01(str);
        if (A012 != null) {
            A0D((int) (A012.A01 + A012.A00));
            return;
        }
        throw Pxg.A0c("Cannot find marker with name ", str, ".");
    }

    public final void A0I(String str) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11775SgN(this, str, 1));
            return;
        }
        C10521Rta A012 = s7n.A01(str);
        if (A012 != null) {
            int i = (int) A012.A01;
            A0F(i, ((int) A012.A00) + i);
            return;
        }
        throw Pxg.A0c("Cannot find marker with name ", str, ".");
    }

    public final void A0J(String str) {
        S7N s7n = this.A0G;
        if (s7n == null) {
            this.A0e.add(new C11775SgN(this, str, 0));
            return;
        }
        C10521Rta A012 = s7n.A01(str);
        if (A012 != null) {
            A0E((int) A012.A01);
            return;
        }
        throw Pxg.A0c("Cannot find marker with name ", str, ".");
    }

    public final boolean A0K(S7N s7n) {
        float f;
        float f2;
        boolean z = false;
        if (this.A0G != s7n) {
            z = true;
            this.A0V = true;
            A05();
            this.A0G = s7n;
            A03(this);
            Q50 q50 = this.A0c;
            boolean A1a = DbW.A1a(q50.A07);
            q50.A07 = s7n;
            if (A1a) {
                f = Math.max(q50.A03, s7n.A03);
                f2 = Math.min(q50.A02, s7n.A00);
            } else {
                f = (float) ((int) s7n.A03);
                f2 = (float) ((int) s7n.A00);
            }
            q50.A07(f, f2);
            float f3 = q50.A00;
            q50.A00 = 0.0f;
            q50.A01 = 0.0f;
            q50.A06((float) ((int) f3));
            q50.A04();
            A0B(q50.getAnimatedFraction());
            ArrayList arrayList = this.A0e;
            Iterator A16 = Pxg.A16(arrayList);
            while (A16.hasNext()) {
                C13515Tbk tbk = (C13515Tbk) A16.next();
                if (tbk != null) {
                    tbk.EJU(s7n);
                }
                A16.remove();
            }
            arrayList.clear();
            s7n.A0D.A00 = this.A0Y;
            A04(this);
            Drawable.Callback callback = getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable((Drawable) null);
                imageView.setImageDrawable(this);
            }
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        C7492QGj qGj = this.A0L;
        if (qGj != null) {
            C8864RDf rDf = this.A0D;
            if (rDf == null) {
                rDf = C10110Rmm.A00;
            }
            boolean A1W = AnonymousClass7TF.A1W(rDf, C8864RDf.ENABLED);
            if (A1W) {
                try {
                    this.A0f.acquire();
                    S7N s7n = this.A0G;
                    if (s7n != null) {
                        float f = this.A00;
                        Q50 q50 = this.A0c;
                        float A002 = q50.A00();
                        this.A00 = A002;
                        if (AnonymousClass7TE.A00(A002, f) * s7n.A00() >= 50.0f) {
                            A0B(q50.A00());
                        }
                    }
                } catch (InterruptedException unused) {
                    if (!A1W) {
                        return;
                    }
                } catch (Throwable th) {
                    if (A1W) {
                        this.A0f.release();
                        if (qGj.A00 != this.A0c.A00()) {
                            A0j.execute(this.A0d);
                        }
                    }
                    throw th;
                }
            }
            if (this.A0Z) {
                try {
                    if (this.A0b) {
                        A01(canvas, this, qGj);
                    } else {
                        A00(canvas);
                    }
                } catch (Throwable unused2) {
                }
            } else if (this.A0b) {
                A01(canvas, this, qGj);
            } else {
                A00(canvas);
            }
            this.A0V = false;
            if (A1W) {
                this.A0f.release();
                if (qGj.A00 != this.A0c.A00()) {
                    A0j.execute(this.A0d);
                }
            }
        }
    }

    public final int getAlpha() {
        return this.A01;
    }

    public final int getIntrinsicHeight() {
        S7N s7n = this.A0G;
        if (s7n == null) {
            return -1;
        }
        return s7n.A05.height();
    }

    public final int getIntrinsicWidth() {
        S7N s7n = this.A0G;
        if (s7n == null) {
            return -1;
        }
        return s7n.A05.width();
    }

    public final void invalidateSelf() {
        if (!this.A0V) {
            this.A0V = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        Q50 q50 = this.A0c;
        if (q50 == null) {
            return false;
        }
        return q50.A08;
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        S85.A00("Use addColorFilter instead.");
    }

    public final void stop() {
        this.A0e.clear();
        this.A0c.A03();
        if (!isVisible()) {
            this.A0M = AnonymousClass05K.A00;
        }
    }

    public Q6Y() {
        Q50 q50 = new Q50();
        this.A0c = q50;
        C11435SUp sUp = new C11435SUp((Object) this, 0);
        this.A0g = sUp;
        this.A0f = new Semaphore(1);
        this.A0d = new C12857TAx(this);
        this.A00 = -3.4028235E38f;
        q50.addUpdateListener(sUp);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Integer num;
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            Integer num2 = this.A0M;
            if (num2 == AnonymousClass05K.A01) {
                A07();
            } else if (num2 == AnonymousClass05K.A0C) {
                A08();
                return visible;
            }
        } else {
            if (this.A0c.A08) {
                A06();
                num = AnonymousClass05K.A0C;
            } else if (!z3) {
                num = AnonymousClass05K.A00;
            }
            this.A0M = num;
            return visible;
        }
        return visible;
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            A07();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
