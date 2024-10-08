package com.instagram.common.ui.widget.touchimageview;

import X.0qQ;
import X.2cp;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass37Q;
import X.AnonymousClass7TE;
import X.C317406nD;
import X.C61340me;
import X.C64879Ljf;
import X.C66556MWk;
import X.C71392co;
import X.JTO;
import X.JTP;
import X.JTT;
import X.L60;
import X.L9X;
import X.MQ4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class TouchImageView extends View implements GestureDetector.OnGestureListener, C317406nD, ScaleGestureDetector.OnScaleGestureListener {
    public static final C71392co A0Z = C71392co.A04(0.0d, 1.5d);
    public static final C71392co A0a = C71392co.A04(30.0d, 8.0d);
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Bitmap A05;
    public C66556MWk A06;
    public MQ4 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Rect A0I;
    public boolean A0J;
    public boolean A0K;
    public final Rect A0L;
    public final RectF A0M;
    public final 2cs A0N;
    public final 2cs A0O;
    public final 2cs A0P;
    public final Paint A0Q;
    public final PointF A0R;
    public final PointF A0S;
    public final RectF A0T;
    public final RectF A0U;
    public final RectF A0V;
    public final GestureDetector A0W;
    public final ScaleGestureDetector A0X;
    public final L60 A0Y;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void Cuk(2cp r16) {
        0qQ.A0B(r16, 0);
        if (this.A08) {
            RectF rectF = this.A0U;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            RectF rectF2 = this.A0T;
            float f5 = rectF2.left;
            float f6 = rectF2.top;
            float f7 = rectF2.right;
            float f8 = rectF2.bottom;
            double A032 = (double) JTO.A03(this.A0N);
            this.A0M.set((float) AnonymousClass37Q.A03(A032, (double) f, (double) f5), (float) AnonymousClass37Q.A03(A032, (double) f2, (double) f6), (float) AnonymousClass37Q.A03(A032, (double) f3, (double) f7), (float) AnonymousClass37Q.A03(A032, (double) f4, (double) f8));
            invalidate();
            return;
        }
        2cs r1 = this.A0O;
        if (!r1.A0C() || !this.A0P.A0C()) {
            this.A0M.offsetTo(JTO.A03(r1), JTO.A03(this.A0P));
            invalidate();
            if (!this.A0H) {
                A05(true);
            }
        }
    }

    public final void Cxs(2cp r1) {
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        if (this.A0B) {
            if (this.A0I == null || !getCropRect().equals(this.A0I)) {
                this.A0I = getCropRect();
            }
        } else if (this.A05 != null) {
            Rect rect = this.A0L;
            if (!rect.isEmpty() && !C66556MWk.A00(this).isEmpty()) {
                int i = -1;
                int i2 = 1;
                if (this.A0D) {
                    i2 = -1;
                }
                float f = (float) i2;
                if (!this.A0C) {
                    i = 1;
                }
                RectF rectF = this.A0M;
                canvas.scale(f, (float) i, rectF.centerX(), rectF.centerY());
                Bitmap bitmap = this.A05;
                0qQ.A0A(bitmap);
                canvas.drawBitmap(bitmap, rect, rectF, this.A0Q);
            }
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A03 = (float) Math.min(Math.max((double) f, -3000.0d), 3000.0d);
        this.A04 = (float) Math.min(Math.max((double) f2, -3000.0d), 3000.0d);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        PointF pointF = this.A0S;
        PointF pointF2 = this.A0R;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        pointF2.x = (float) ((int) scaleGestureDetector.getFocusX());
        pointF2.y = (float) ((int) scaleGestureDetector.getFocusY());
        float f = pointF2.x;
        float f2 = pointF2.y;
        A02(this.A0L, this.A0M, (scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan()) * getContentScale(), f, f2);
        invalidate();
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        if (!this.A0K) {
            return false;
        }
        this.A0E = true;
        JTP.A15(this, true);
        PointF pointF = this.A0S;
        pointF.x = (float) ((int) scaleGestureDetector.getFocusX());
        pointF.y = (float) ((int) scaleGestureDetector.getFocusY());
        PointF pointF2 = this.A0R;
        pointF2.x = (float) ((int) scaleGestureDetector.getFocusX());
        pointF2.y = (float) ((int) scaleGestureDetector.getFocusY());
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        JTP.A15(this, true);
        if (this.A0X.isInProgress()) {
            PointF pointF = this.A0S;
            float f3 = pointF.x;
            PointF pointF2 = this.A0R;
            f = f3 - pointF2.x;
            f2 = pointF.y - pointF2.y;
        } else if (!this.A0A) {
            this.A0A = true;
            f -= this.A00 - motionEvent2.getRawX();
            f2 -= this.A01 - motionEvent2.getRawY();
        }
        if (!this.A0E && this.A0F) {
            L60 l60 = this.A0Y;
            RectF A002 = C66556MWk.A00(this);
            RectF rectF = this.A0M;
            0qQ.A0B(A002, 0);
            0qQ.A0B(rectF, 1);
            l60.A00 = Math.min(Math.max(rectF.left / A002.width(), 0.0f), 1.0f);
            l60.A02 = Math.min(Math.max(rectF.top / A002.height(), 0.0f), 1.0f);
            l60.A01 = Math.min(Math.max((A002.width() - rectF.right) / A002.width(), 0.0f), 1.0f);
            float min = Math.min(Math.max((A002.height() - rectF.bottom) / A002.height(), 0.0f), 1.0f);
            float pow = (float) Math.pow((double) (1.0f - Math.max(l60.A00, l60.A01)), 4.0d);
            f *= pow;
            float pow2 = (float) Math.pow((double) (1.0f - Math.max(l60.A02, min)), 4.0d);
            f2 *= pow2;
            if (pow < 0.25f || pow2 < 0.25f) {
                if (!this.A0J && this.A0H) {
                    this.A0J = true;
                }
                this.A0M.offset(-f, -f2);
                invalidate();
                return true;
            }
        }
        this.A0J = false;
        this.A0M.offset(-f, -f2);
        invalidate();
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void setRenderState(L9X l9x) {
        0qQ.A0B(l9x, 0);
        setImageBitmap(l9x.A00);
        this.A0O.A01();
        this.A0P.A01();
        this.A0N.A01();
        RectF rectF = this.A0M;
        RectF rectF2 = l9x.A02;
        rectF.set(rectF2);
        RectF A002 = C66556MWk.A00(this);
        this.A0C = l9x.A04;
        this.A0D = l9x.A05;
        RectF rectF3 = l9x.A03;
        PointF pointF = new PointF(rectF3.centerX() - rectF2.left, rectF3.centerY() - rectF2.top);
        PointF pointF2 = this.A0R;
        pointF2.x = pointF.x;
        pointF2.y = pointF.y;
        float width = rectF2.width() / ((float) l9x.A01.width());
        float width2 = rectF3.width() / rectF3.height();
        float A003 = JTP.A00(AnonymousClass7TE.A02(this), this);
        if (AnonymousClass7TE.A00(width2, A003) / A003 < 0.1f) {
            width *= Math.min(A002.width() / rectF3.width(), A002.height() / rectF3.height());
        }
        A01(pointF.x, pointF.y, width);
        invalidate();
    }

    private final boolean A03() {
        C66556MWk mWk;
        if ((this.A0B || this.A05 != null) && !this.A0L.isEmpty() && (mWk = this.A06) != null && !mWk.AhY(this).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void A04() {
        if (!this.A09 && A03()) {
            this.A09 = true;
            RectF rectF = this.A0M;
            rectF.set(this.A0L);
            A01(rectF.centerX(), rectF.centerY(), A00());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r10 != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(boolean r13) {
        /*
            r12 = this;
            android.graphics.RectF r3 = r12.A0V
            android.graphics.RectF r5 = r12.A0M
            r3.set(r5)
            android.graphics.RectF r8 = X.C66556MWk.A00(r12)
            float r2 = r3.width()
            float r1 = r8.width()
            float r0 = r12.A02
            float r1 = r1 * r0
            r11 = 0
            r6 = 1
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1R(r0)
            boolean r0 = r3.contains(r8)
            if (r0 == 0) goto L_0x0027
            if (r10 != 0) goto L_0x0029
        L_0x0026:
            return
        L_0x0027:
            if (r10 == 0) goto L_0x003d
        L_0x0029:
            android.graphics.Rect r4 = r12.A0L
            float r2 = r12.A02
            float r0 = r12.A00()
            float r2 = r2 * r0
            float r1 = r8.centerX()
            float r0 = r8.centerY()
            A02(r4, r3, r2, r1, r0)
        L_0x003d:
            float r0 = r3.height()
            int r1 = java.lang.Math.round(r0)
            float r0 = r8.height()
            int r0 = java.lang.Math.round(r0)
            if (r1 < r0) goto L_0x0061
            float r0 = r3.width()
            int r1 = java.lang.Math.round(r0)
            float r0 = r8.width()
            int r0 = java.lang.Math.round(r0)
            if (r1 >= r0) goto L_0x0071
        L_0x0061:
            android.graphics.Rect r4 = r12.A0L
            float r2 = r12.A00()
            android.graphics.PointF r0 = r12.A0R
            float r1 = r0.x
            float r0 = r0.y
            A02(r4, r3, r2, r1, r0)
            r10 = 1
        L_0x0071:
            float r4 = r3.left
            int r2 = java.lang.Math.round(r4)
            float r1 = r8.left
            int r0 = java.lang.Math.round(r1)
            r7 = 0
            if (r2 <= r0) goto L_0x00ea
            float r1 = r1 - r4
            r3.offset(r1, r7)
            r9 = 1
        L_0x0085:
            float r4 = r3.right
            int r2 = java.lang.Math.round(r4)
            float r1 = r8.right
            int r0 = java.lang.Math.round(r1)
            if (r2 >= r0) goto L_0x0098
            float r1 = r1 - r4
            r3.offset(r1, r7)
            r9 = 1
        L_0x0098:
            float r4 = r3.top
            int r2 = java.lang.Math.round(r4)
            float r1 = r8.top
            int r0 = java.lang.Math.round(r1)
            if (r2 <= r0) goto L_0x00ab
            float r1 = r1 - r4
            r3.offset(r7, r1)
            r11 = 1
        L_0x00ab:
            float r4 = r3.bottom
            int r2 = java.lang.Math.round(r4)
            float r1 = r8.bottom
            int r0 = java.lang.Math.round(r1)
            if (r2 >= r0) goto L_0x00be
            float r1 = r1 - r4
            r3.offset(r7, r1)
            r11 = 1
        L_0x00be:
            if (r13 == 0) goto L_0x00e6
            boolean r0 = r12.A08
            if (r0 != 0) goto L_0x0026
            if (r10 == 0) goto L_0x00ec
            r12.A08 = r6
            X.2cs r0 = r12.A0O
            r0.A01()
            X.2cs r0 = r12.A0P
            r0.A01()
            X.2cs r2 = r12.A0N
            r2.A01()
            r0 = 0
            r2.A08(r0, r6)
            r2.A03()
            android.graphics.RectF r0 = r12.A0U
            r0.set(r5)
            android.graphics.RectF r5 = r12.A0T
        L_0x00e6:
            r5.set(r3)
            return
        L_0x00ea:
            r9 = 0
            goto L_0x0085
        L_0x00ec:
            if (r9 == 0) goto L_0x00fb
            X.2cs r2 = r12.A0O
            X.2co r0 = A0a
            r2.A09(r0)
            float r0 = r3.left
            double r0 = (double) r0
            r2.A06(r0)
        L_0x00fb:
            if (r11 == 0) goto L_0x0026
            X.2cs r2 = r12.A0P
            X.2co r0 = A0a
            r2.A09(r0)
            float r0 = r3.top
            double r0 = (double) r0
            r2.A06(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.ui.widget.touchimageview.TouchImageView.A05(boolean):void");
    }

    public final float getContentScale() {
        return this.A0M.width() / ((float) this.A0L.width());
    }

    public final float getContentTranslationX() {
        return this.A0M.left;
    }

    public final float getContentTranslationY() {
        return this.A0M.top;
    }

    public final Rect getCropRect() {
        RectF rectF = new RectF(this.A0M);
        RectF rectF2 = new RectF(C66556MWk.A00(this));
        float f = -rectF.left;
        float f2 = -rectF.top;
        rectF.offset(f, f2);
        rectF2.offset(f, f2);
        rectF.intersect(rectF2);
        float contentScale = getContentScale();
        return new Rect(JTO.A04(rectF.left, contentScale), JTO.A04(rectF.top, contentScale), JTO.A04(rectF.right, contentScale), JTO.A04(rectF.bottom, contentScale));
    }

    public final boolean getIgnoreImageBitmap() {
        return this.A0B;
    }

    public final Bitmap getImageBitmap() {
        return this.A05;
    }

    public final MQ4 getListener() {
        return null;
    }

    public final Rect getPreviousCropRect() {
        return this.A0I;
    }

    public final L9X getRenderState() {
        RectF rectF = this.A0M;
        RectF A002 = C66556MWk.A00(this);
        return new L9X(this.A05, this.A0L, rectF, A002, this.A0C, this.A0D);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.A05 = bitmap;
        this.A09 = false;
        this.A0C = false;
        this.A0D = false;
        if (bitmap == null) {
            this.A0M.setEmpty();
        } else {
            Rect rect = this.A0L;
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A05;
            0qQ.A0A(bitmap2);
            rect.set(0, 0, width, bitmap2.getHeight());
        }
        this.A0M.set(this.A0L);
        A04();
    }

    private final float A00() {
        float height = C66556MWk.A00(this).height();
        Rect rect = this.A0L;
        return Math.max(height / ((float) rect.height()), C66556MWk.A00(this).width() / ((float) rect.width()));
    }

    private final void A01(float f, float f2, float f3) {
        RectF A002 = C66556MWk.A00(this);
        RectF rectF = this.A0M;
        rectF.offsetTo(A002.centerX() - f, A002.centerY() - f2);
        invalidate();
        float max = Math.max(A00(), f3);
        float centerX = A002.centerX();
        float centerY = A002.centerY();
        Rect rect = this.A0L;
        A02(rect, rectF, max, centerX, centerY);
        invalidate();
        if (!rectF.contains(A002)) {
            float f4 = 1.0f;
            float width = f / rectF.width();
            float height = f2 / rectF.height();
            int round = Math.round(rectF.left);
            int round2 = Math.round(A002.left);
            if (round > round2) {
                f4 = Math.max((((float) (round - round2)) / width) / rectF.width(), 1.0f);
            }
            int round3 = Math.round(rectF.right);
            int round4 = Math.round(A002.right);
            if (round3 < round4) {
                f4 = Math.max((((float) (round4 - round3)) / (1.0f - width)) / rectF.width(), f4);
            }
            int round5 = Math.round(rectF.top);
            int round6 = Math.round(A002.top);
            if (round5 > round6) {
                f4 = Math.max((((float) (round5 - round6)) / height) / rectF.height(), f4);
            }
            int round7 = Math.round(rectF.bottom);
            int round8 = Math.round(A002.bottom);
            if (round7 < round8) {
                f4 = Math.max(Math.max((((float) (round8 - round7)) / (1.0f - height)) / rectF.height(), f4), f4);
            }
            A02(rect, rectF, f4 * getContentScale(), f, f2);
            invalidate();
            A05(false);
        }
    }

    public static final void A02(Rect rect, RectF rectF, float f, float f2, float f3) {
        float width = ((float) rect.width()) * f;
        float height = ((float) rect.height()) * f;
        float width2 = (f2 - (rectF.left - ((float) rect.left))) / rectF.width();
        float height2 = (f3 - (rectF.top - ((float) rect.top))) / rectF.height();
        rectF.left -= width2 * (width - rectF.width());
        float height3 = rectF.top - (height2 * (height - rectF.height()));
        rectF.top = height3;
        rectF.right = rectF.left + width;
        rectF.bottom = height3 + height;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A062 = AnonymousClass0fD.A06(-687530270);
        super.onSizeChanged(i, i2, i3, i4);
        this.A0N.A01();
        this.A0O.A01();
        this.A0P.A01();
        if (!A03()) {
            i5 = 1575468891;
        } else {
            A04();
            RectF rectF = this.A0M;
            rectF.offset((((float) i) / 2.0f) - (((float) i3) / 2.0f), (((float) i2) / 2.0f) - (((float) i4) / 2.0f));
            invalidate();
            A05(false);
            i5 = -1291197680;
        }
        AnonymousClass0fD.A0D(i5, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-1402862563);
        0qQ.A0B(motionEvent, 0);
        boolean z = false;
        if (!this.A0G) {
            AnonymousClass0fD.A0C(-941998414, A052);
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0H = true;
            this.A0A = false;
            this.A00 = motionEvent.getRawX();
            this.A01 = motionEvent.getRawY();
            this.A03 = 0.0f;
            this.A04 = 0.0f;
            this.A08 = false;
            2cs r5 = this.A0O;
            RectF rectF = this.A0M;
            r5.A08((double) rectF.left, true);
            this.A0P.A08((double) rectF.top, true);
            this.A0N.A08((double) getContentScale(), true);
        }
        boolean onTouchEvent = this.A0X.onTouchEvent(motionEvent);
        if (this.A0W.onTouchEvent(motionEvent) || onTouchEvent || super.onTouchEvent(motionEvent)) {
            z = true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0H = false;
            this.A0E = false;
            2cs r2 = this.A0O;
            C71392co r6 = A0Z;
            r2.A09(r6);
            RectF rectF2 = this.A0M;
            r2.A08((double) rectF2.left, true);
            r2.A07((double) this.A03);
            2cs r22 = this.A0P;
            r22.A09(r6);
            r22.A08((double) rectF2.top, true);
            r22.A07((double) this.A04);
            this.A0N.A08((double) getContentScale(), true);
            A05(true);
        }
        AnonymousClass0fD.A0C(240419877, A052);
        return z;
    }

    public final void setBoundsDelegate(C66556MWk mWk) {
        this.A06 = mWk;
    }

    public final void setIgnoreImageBitmap(boolean z) {
        this.A0B = z;
    }

    public final void setIsFlipped(boolean z) {
        this.A0C = z;
    }

    public final void setIsMirrored(boolean z) {
        this.A0D = z;
    }

    public final void setListener(MQ4 mq4) {
        this.A07 = mq4;
    }

    public final void setMaxScale(float f) {
        this.A02 = f;
    }

    public final void setPreviousCropRect(Rect rect) {
        this.A0I = rect;
    }

    public final void setScaleEnabled(boolean z) {
        this.A0K = z;
    }

    public final void setShouldSlipNearBounds(boolean z) {
        this.A0F = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.A0G = z;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.L60] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0W = new GestureDetector(context, this);
        this.A0X = new ScaleGestureDetector(context, this);
        this.A0L = AnonymousClass7TE.A0W();
        this.A0M = AnonymousClass7TE.A0Y();
        this.A0V = AnonymousClass7TE.A0Y();
        this.A0U = AnonymousClass7TE.A0Y();
        this.A0T = AnonymousClass7TE.A0Y();
        this.A0Q = AnonymousClass7TE.A0V(2);
        this.A0R = new PointF();
        this.A0S = new PointF();
        this.A0Y = new Object();
        this.A0K = true;
        this.A0F = true;
        this.A02 = Float.MAX_VALUE;
        2cp A002 = C61340me.A00();
        A002.A04.add(this);
        2cs A022 = A002.A02();
        C71392co r3 = A0Z;
        A022.A09(r3);
        A022.A02 = 0.5d;
        A022.A00 = 0.5d;
        this.A0O = A022;
        2cs A023 = A002.A02();
        A023.A02 = 0.5d;
        A023.A00 = 0.5d;
        A023.A09(r3);
        this.A0P = A023;
        2cs A024 = A002.A02();
        A024.A09(A0a);
        A024.A02 = 0.01d;
        A024.A00 = 0.01d;
        this.A0N = A024;
        this.A06 = new C64879Ljf();
    }

    public /* synthetic */ TouchImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
