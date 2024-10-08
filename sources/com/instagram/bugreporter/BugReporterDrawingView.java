package com.instagram.bugreporter;

import X.0nA;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C51965G9l;
import X.C71382cm;
import X.JTO;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BugReporterDrawingView extends View {
    public float A00;
    public float A01;
    public Bitmap A02;
    public Bitmap A03;
    public Canvas A04;
    public Rect A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final Path A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        0qQ.A0B(canvas, 0);
        Rect rect = this.A05;
        if (rect == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (rect.width() > 0) {
            Rect rect2 = this.A05;
            if (rect2 == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            } else if (rect2.height() > 0 && (bitmap = this.A02) != null) {
                Rect rect3 = this.A05;
                if (rect3 != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, rect3, this.A06);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final void A01() {
        Bitmap bitmap = this.A02;
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
            this.A04 = null;
        }
        this.A08.reset();
    }

    public final void setUnderlayBitmap(Bitmap bitmap) {
        this.A03 = bitmap;
        A00();
    }

    private final void A00() {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int availableWidth = getAvailableWidth();
        int availableHeight = getAvailableHeight();
        Bitmap bitmap = this.A03;
        if (bitmap == null || availableWidth <= 0 || availableHeight <= 0) {
            paddingLeft = getPaddingLeft();
            paddingRight = getPaddingRight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        } else {
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.A03;
            if (bitmap2 != null) {
                float f = (float) width;
                float f2 = ((float) availableWidth) / f;
                float height = (float) bitmap2.getHeight();
                float f3 = ((float) availableHeight) / height;
                if (f2 > f3) {
                    f2 = f3;
                }
                int ceil = (int) Math.ceil((double) (f * f2));
                int i = (availableWidth - ceil) / 2;
                int ceil2 = (availableHeight - ((int) Math.ceil((double) (height * f2)))) / 2;
                paddingLeft = getPaddingLeft() + i;
                paddingRight = (getWidth() - getPaddingRight()) - i;
                paddingTop = getPaddingTop() + ceil2;
                paddingBottom = (getHeight() - getPaddingBottom()) - ceil2;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Rect rect = new Rect(paddingLeft, paddingTop, paddingRight, paddingBottom);
        this.A05 = rect;
        int width2 = rect.width();
        Rect rect2 = this.A05;
        if (rect2 != null) {
            int height2 = rect2.height();
            if (width2 <= 0 || height2 <= 0) {
                A01();
                return;
            }
            A01();
            Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
            this.A02 = createBitmap;
            if (createBitmap != null) {
                Canvas A0B = JTO.A0B(createBitmap);
                this.A04 = A0B;
                A0B.drawColor(0, PorterDuff.Mode.CLEAR);
                Bitmap bitmap3 = this.A03;
                if (bitmap3 != null) {
                    Rect rect3 = new Rect(0, 0, width2, height2);
                    Canvas canvas = this.A04;
                    if (canvas != null) {
                        canvas.drawBitmap(bitmap3, (Rect) null, rect3, this.A06);
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                Matrix A0U = AnonymousClass7TE.A0U();
                Rect rect4 = this.A05;
                if (rect4 != null) {
                    A0U.postTranslate(-((float) rect4.left), -((float) rect4.top));
                    Canvas canvas2 = this.A04;
                    if (canvas2 != null) {
                        canvas2.setMatrix(A0U);
                        return;
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    private final int getAvailableHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private final int getAvailableWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(115765338);
        A00();
        AnonymousClass0fD.A0D(816755891, A062);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r8v3, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            r0 = -765808055(0xffffffffd25ab249, float:-2.348235E11)
            int r1 = X.AnonymousClass0fD.A05(r0)
            r4 = 0
            X.0qQ.A0B(r11, r4)
            android.graphics.Rect r0 = r10.A05
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x0110
            int r0 = r0.width()
            r8 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x0109
            android.graphics.Rect r0 = r10.A05
            if (r0 == 0) goto L_0x00d4
            int r0 = r0.height()
            if (r0 <= 0) goto L_0x0109
            int r2 = r11.getActionMasked()
            if (r2 == 0) goto L_0x0094
            if (r2 == r3) goto L_0x00dc
            r0 = 2
            if (r2 == r0) goto L_0x0035
            r0 = 193783655(0xb8ce767, float:5.4274214E-32)
            X.AnonymousClass0fD.A0C(r0, r1)
            return r4
        L_0x0035:
            android.graphics.Path r6 = r10.A09
            r6.reset()
            float r2 = r10.A00
            float r0 = r10.A01
            r6.moveTo(r2, r0)
            int r7 = r11.getHistorySize()
        L_0x0045:
            if (r8 >= r7) goto L_0x0063
            float r5 = r11.getHistoricalX(r8)
            float r4 = r11.getHistoricalY(r8)
            float r3 = r10.A00
            float r5 = r5 + r3
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            float r0 = r10.A01
            float r4 = r4 + r0
            float r4 = r4 / r2
            r6.quadTo(r3, r0, r5, r4)
            r10.A00 = r5
            r10.A01 = r4
            int r8 = r8 + 1
            goto L_0x0045
        L_0x0063:
            float r5 = r11.getX()
            float r4 = r11.getY()
            float r3 = r10.A00
            float r5 = r5 + r3
            r2 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r2
            float r0 = r10.A01
            float r4 = r4 + r0
            float r4 = r4 / r2
            r6.quadTo(r3, r0, r5, r4)
            r10.A00 = r5
            r10.A01 = r4
            android.graphics.Path r0 = r10.A08
            r0.addPath(r6)
            android.graphics.Canvas r2 = r10.A04
            if (r2 == 0) goto L_0x008b
            android.graphics.Paint r0 = r10.A07
            r2.drawPath(r6, r0)
            goto L_0x0105
        L_0x008b:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r0 = 968171778(0x39b52102, float:3.4547603E-4)
            goto L_0x011f
        L_0x0094:
            X.02m r3 = X.C51965G9l.A0l()
            r2 = 391266213(0x17523fa5, float:6.793499E-25)
            r3.markerStart(r2, r4)
            r0 = 2
            r3.markerEnd(r2, r4, r0)
            float r0 = r11.getX()
            r10.A00 = r0
            float r4 = r11.getY()
            r10.A01 = r4
            android.graphics.Path r2 = r10.A08
            float r3 = r10.A00
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r3 + r0
            float r6 = r4 + r0
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r2.addRect(r3, r4, r5, r6, r7)
            android.graphics.Canvas r4 = r10.A04
            if (r4 == 0) goto L_0x00cc
            float r3 = r10.A00
            float r2 = r10.A01
            android.graphics.Paint r0 = r10.A07
            r4.drawPoint(r3, r2, r0)
            goto L_0x0105
        L_0x00cc:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r0 = -454054701(0xffffffffe4efacd3, float:-3.53698E22)
            goto L_0x011f
        L_0x00d4:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r0 = 2082926856(0x7c26f108, float:3.46724E36)
            goto L_0x011f
        L_0x00dc:
            android.graphics.Path r3 = r10.A08
            float r2 = r10.A00
            float r0 = r10.A01
            r3.moveTo(r2, r0)
            float r2 = r11.getX()
            float r0 = r11.getY()
            r3.lineTo(r2, r0)
            android.graphics.Canvas r2 = r10.A04
            if (r2 == 0) goto L_0x0118
            float r3 = r10.A00
            float r4 = r10.A01
            float r5 = r11.getX()
            float r6 = r11.getY()
            android.graphics.Paint r7 = r10.A07
            r2.drawLine(r3, r4, r5, r6, r7)
        L_0x0105:
            r10.invalidate()
            r8 = 1
        L_0x0109:
            r0 = -1432510161(0xffffffffaa9da12f, float:-2.8000646E-13)
            X.AnonymousClass0fD.A0C(r0, r1)
            return r8
        L_0x0110:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r0 = -1347218969(0xffffffffafb311e7, float:-3.257263E-10)
            goto L_0x011f
        L_0x0118:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r9)
            r0 = -1803735883(0xffffffff947d2cb5, float:-1.2782053E-26)
        L_0x011f:
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.bugreporter.BugReporterDrawingView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = C51965G9l.A0C();
        this.A09 = C51965G9l.A0C();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C71382cm.A09);
        0qQ.A07(obtainStyledAttributes);
        float dimension = obtainStyledAttributes.getDimension(1, 0nA.A04(context2, 12));
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint A0C = JTO.A0C();
        this.A07 = A0C;
        A0C.setAntiAlias(true);
        A0C.setColor(color);
        JTO.A1N(A0C);
        A0C.setStrokeJoin(Paint.Join.ROUND);
        A0C.setStrokeWidth(dimension);
        A0C.setStrokeCap(Paint.Cap.ROUND);
        Paint A0C2 = JTO.A0C();
        this.A06 = A0C2;
        A0C2.setAntiAlias(true);
        A0C2.setDither(true);
        A0C2.setFilterBitmap(true);
    }

    public /* synthetic */ BugReporterDrawingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BugReporterDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
