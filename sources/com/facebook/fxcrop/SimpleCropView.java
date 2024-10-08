package com.facebook.fxcrop;

import X.0fO;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C12083Smc;
import X.C51965G9l;
import X.RVN;
import X.RVO;
import X.SOG;
import X.SS4;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class SimpleCropView extends ImageView implements View.OnTouchListener {
    public static final float A0C = ((float) RVO.A00(24));
    public static final float A0D = ((float) RVO.A00(3));
    public static final float A0E = ((float) RVO.A00(1));
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public Paint A05;
    public Paint A06;
    public Paint A07;
    public Uri A08 = null;
    public Integer A09 = AnonymousClass05K.A00;
    public Bitmap A0A = null;
    public final RectF A0B = AnonymousClass7TE.A0Y();

    public void setImageUri(Uri uri) {
        this.A08 = uri;
        SOG.A06.A01(getContext(), uri, new C12083Smc(this), "LOAD_SMALL_BITMAP_FOR_EDITING_PREVIEW", false, false);
    }

    private void setBitmapToView(Bitmap bitmap) {
        if (bitmap != null && bitmap.getWidth() != 0 && bitmap.getHeight() != 0 && this.A04 != 0 && this.A03 != 0) {
            this.A0A = bitmap;
            setImageBitmap(bitmap);
            getLayoutParams().height = (this.A04 * bitmap.getHeight()) / bitmap.getWidth();
            requestLayout();
        }
    }

    public final void A02() {
        this.A02 = (this.A02 + 90) % 360;
        int i = this.A04;
        float f = ((float) i) / ((float) this.A03);
        RectF rectF = this.A0B;
        float f2 = ((float) (i - 1)) - (rectF.top * f);
        float f3 = rectF.left * f;
        rectF.set((f2 - (rectF.width() * f)) + 1.0f, f3, f2, ((rectF.height() * f) + f3) - 1.0f);
        Bitmap bitmap = this.A0A;
        if (bitmap != null) {
            setBitmapToView(RVN.A00(bitmap, 90));
        }
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        Path A0C2 = C51965G9l.A0C();
        A0C2.setFillType(Path.FillType.WINDING);
        A0C2.addRect(0.0f, 0.0f, (float) this.A04, (float) this.A03, Path.Direction.CW);
        RectF rectF = this.A0B;
        A0C2.addRect(rectF, Path.Direction.CCW);
        canvas2.drawPath(A0C2, this.A07);
        float width = rectF.width() * 0.333f;
        float height = rectF.height() * 0.333f;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = 0;
        do {
            f += width;
            f2 += height;
            canvas2.drawLine(f, rectF.top, f, rectF.bottom, this.A06);
            canvas2.drawLine(rectF.left, f2, rectF.right, f2, this.A06);
            i++;
        } while (i < 2);
        canvas2.drawRect(rectF, this.A06);
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = A0C;
        canvas2.drawLine(f3, f4, f3, f4 + f5, this.A05);
        float f6 = rectF.left;
        float f7 = rectF.top;
        canvas2.drawLine(f6, f7, f6 + f5, f7, this.A05);
        float f8 = rectF.right;
        float f9 = rectF.top;
        canvas2.drawLine(f8, f9, f8, f9 + f5, this.A05);
        float f10 = rectF.right;
        float f11 = rectF.top;
        canvas2.drawLine(f10, f11, f10 - f5, f11, this.A05);
        float f12 = rectF.left;
        float f13 = rectF.bottom;
        canvas2.drawLine(f12, f13, f12, f13 - f5, this.A05);
        float f14 = rectF.left;
        float f15 = rectF.bottom;
        canvas2.drawLine(f14, f15, f14 + f5, f15, this.A05);
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        canvas2.drawLine(f16, f17, f16, f17 - f5, this.A05);
        float f18 = rectF.right;
        float f19 = rectF.bottom;
        canvas2.drawLine(f18, f19, f18 - f5, f19, this.A05);
    }

    public SimpleCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        setOnTouchListener(this);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A07 = A0V;
        A0V.setStyle(Paint.Style.FILL);
        this.A07.setColor(-16777216);
        this.A07.setAlpha(127);
        Paint A0V2 = AnonymousClass7TE.A0V(1);
        this.A06 = A0V2;
        Paint.Style style = Paint.Style.STROKE;
        A0V2.setStyle(style);
        this.A06.setStrokeCap(Paint.Cap.SQUARE);
        this.A06.setColor(-1);
        this.A06.setAlpha(127);
        this.A06.setStrokeWidth(A0E);
        Paint A0V3 = AnonymousClass7TE.A0V(1);
        this.A05 = A0V3;
        A0V3.setStyle(style);
        this.A05.setStrokeCap(Paint.Cap.ROUND);
        this.A05.setColor(-1);
        this.A05.setStrokeWidth(A0D);
    }

    public static void A01(Bitmap bitmap, SimpleCropView simpleCropView) {
        int width;
        int width2 = bitmap.getWidth();
        int i = simpleCropView.A04;
        if (width2 > i && (width = (bitmap.getWidth() * i) / bitmap.getHeight()) > 0 && i > 0) {
            Bitmap A002 = 0fO.A00(bitmap, width, i, false);
            bitmap.recycle();
            bitmap = A002;
        }
        int i2 = SS4.A00;
        simpleCropView.A02 = i2;
        if (i2 > 0) {
            bitmap = RVN.A00(bitmap, i2);
        }
        RectF rectF = SS4.A01;
        if (rectF != null) {
            simpleCropView.A0B.set(rectF);
        } else {
            int height = (simpleCropView.A04 * bitmap.getHeight()) / bitmap.getWidth();
            if (bitmap.getHeight() >= bitmap.getWidth()) {
                int i3 = simpleCropView.A04;
                simpleCropView.A0B.set(0.0f, (float) ((height - i3) / 2), (float) i3, (float) ((height + i3) / 2));
            } else {
                RectF rectF2 = simpleCropView.A0B;
                int i4 = simpleCropView.A04;
                rectF2.set((float) ((i4 - height) / 2), 0.0f, (float) ((i4 + height) / 2), (float) height);
            }
        }
        simpleCropView.setBitmapToView(bitmap);
    }

    public final void onMeasure(int i, int i2) {
        this.A04 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A03 = size;
        setMeasuredDimension(this.A04, size);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x019f, code lost:
        if (r13 <= ((r1 + A0C) + 50.0f)) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bb, code lost:
        if (r13 <= (r1 + 50.0f)) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01bd, code lost:
        r0 = X.AnonymousClass05K.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01d4, code lost:
        if (r13 <= (r1 + 50.0f)) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01eb, code lost:
        if (r13 <= (r1 + 50.0f)) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ed, code lost:
        r0 = X.AnonymousClass05K.A0j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x021e, code lost:
        if (r13 <= (r1 + 50.0f)) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0165, code lost:
        if (r13 <= ((r1 + A0C) + 50.0f)) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x017e, code lost:
        if (r13 <= (r1 + 50.0f)) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0180, code lost:
        r0 = X.AnonymousClass05K.A0N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            r18 = this;
            int r1 = r20.getAction()
            r2 = 1
            r3 = r18
            if (r1 == 0) goto L_0x0113
            r0 = 2
            if (r1 == r0) goto L_0x0012
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A09 = r0
            r0 = 0
            return r0
        L_0x0012:
            float r11 = r20.getX()
            float r10 = r20.getY()
            float r0 = r3.A00
            float r17 = r11 - r0
            float r0 = r3.A01
            float r16 = r10 - r0
            float r1 = java.lang.Math.abs(r17)
            float r0 = java.lang.Math.abs(r16)
            float r13 = java.lang.Math.max(r1, r0)
            r15 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x0039
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x0039:
            java.lang.Integer r12 = r3.A09
            int r1 = r12.intValue()
            if (r1 == r2) goto L_0x00ff
            r0 = 3
            if (r1 == r0) goto L_0x00ea
            r0 = 4
            if (r1 == r0) goto L_0x00d8
            r0 = 5
            if (r1 == r0) goto L_0x00c4
            r0 = 6
            if (r1 != r0) goto L_0x009b
            float r0 = r17 * r16
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            android.graphics.RectF r9 = r3.A0B
            float r8 = r9.left
            float r6 = r9.top
            float r5 = r9.right
            float r13 = r13 * r7
            float r5 = r5 + r13
            float r7 = r9.bottom
            float r7 = r7 + r13
        L_0x0060:
            float r14 = r5 - r8
            float r14 = r14 + r15
            float r13 = r7 - r6
            float r13 = r13 + r15
            r1 = 1127481344(0x43340000, float:180.0)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            boolean r12 = X.AnonymousClass7TF.A1W(r12, r0)
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
            if (r12 == 0) goto L_0x0083
            float r14 = r14 + r4
            float r5 = r14 - r15
        L_0x0083:
            r8 = 0
        L_0x0084:
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009c
            if (r12 == 0) goto L_0x0091
            float r13 = r13 + r4
            float r7 = r13 - r15
        L_0x0091:
            r9.set(r8, r4, r5, r7)
            r3.A00 = r11
            r3.A01 = r10
            r3.invalidate()
        L_0x009b:
            return r2
        L_0x009c:
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            int r1 = r3.A03
            float r0 = (float) r1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00af
            int r1 = r1 - r2
            float r7 = (float) r1
            if (r12 == 0) goto L_0x00af
            float r4 = r7 - r13
            float r4 = r4 + r15
            goto L_0x0091
        L_0x00af:
            r4 = r6
            goto L_0x0091
        L_0x00b1:
            int r0 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0084
            int r1 = r3.A04
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0084
            int r1 = r1 - r2
            float r5 = (float) r1
            if (r12 == 0) goto L_0x0084
            float r8 = r5 - r14
            float r8 = r8 + r15
            goto L_0x0084
        L_0x00c4:
            float r0 = r17 * r16
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            android.graphics.RectF r9 = r3.A0B
            float r8 = r9.left
            float r13 = r13 * r7
            float r8 = r8 + r13
            float r6 = r9.top
            float r5 = r9.right
            float r7 = r9.bottom
            float r7 = r7 - r13
            goto L_0x0060
        L_0x00d8:
            float r0 = r17 * r16
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x009b
            android.graphics.RectF r9 = r3.A0B
            float r8 = r9.left
            float r6 = r9.top
            float r13 = r13 * r7
            float r6 = r6 - r13
            float r5 = r9.right
            float r5 = r5 + r13
            goto L_0x00fb
        L_0x00ea:
            float r0 = r17 * r16
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x009b
            android.graphics.RectF r9 = r3.A0B
            float r8 = r9.left
            float r13 = r13 * r7
            float r8 = r8 + r13
            float r6 = r9.top
            float r6 = r6 + r13
            float r5 = r9.right
        L_0x00fb:
            float r7 = r9.bottom
            goto L_0x0060
        L_0x00ff:
            android.graphics.RectF r9 = r3.A0B
            float r8 = r9.left
            float r8 = r8 + r17
            float r6 = r9.top
            float r6 = r6 + r16
            float r5 = r9.right
            float r5 = r5 + r17
            float r7 = r9.bottom
            float r7 = r7 + r16
            goto L_0x0060
        L_0x0113:
            float r0 = r20.getX()
            r3.A00 = r0
            float r0 = r20.getY()
            r3.A01 = r0
            float r14 = r20.getX()
            float r13 = r20.getY()
            android.graphics.RectF r4 = r3.A0B
            float r6 = r4.left
            r12 = 1112014848(0x42480000, float:50.0)
            float r11 = r6 + r12
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            float r0 = r4.right
            float r0 = r0 - r12
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x014d
            float r0 = r4.top
            float r0 = r0 + r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x014d
            float r0 = r4.bottom
            float r0 = r0 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x014d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x014a:
            r3.A09 = r0
            return r2
        L_0x014d:
            float r10 = r6 - r12
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0167
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0167
            float r1 = r4.top
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0167
            float r0 = A0C
            float r1 = r1 + r0
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0180
        L_0x0167:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0183
            float r0 = A0C
            float r0 = r0 + r6
            float r0 = r0 + r12
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0183
            float r1 = r4.top
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0183
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0183
        L_0x0180:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x014a
        L_0x0183:
            float r5 = r4.right
            float r9 = r5 - r12
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x01a1
            float r0 = r5 + r12
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01a1
            float r1 = r4.top
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01a1
            float r0 = A0C
            float r1 = r1 + r0
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bd
        L_0x01a1:
            float r8 = A0C
            float r7 = r5 - r8
            float r7 = r7 - r12
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x01c0
            float r0 = r5 + r12
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x01c0
            float r1 = r4.top
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01c0
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01c0
        L_0x01bd:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x014a
        L_0x01c0:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01d6
            int r0 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x01d6
            float r1 = r4.bottom
            float r0 = r1 - r8
            float r0 = r0 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01d6
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ed
        L_0x01d6:
            int r0 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x01f1
            float r6 = r6 + r8
            float r6 = r6 + r12
            int r0 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x01f1
            float r1 = r4.bottom
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01f1
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x01f1
        L_0x01ed:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x014a
        L_0x01f1:
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x020a
            float r0 = r5 + r12
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x020a
            float r0 = r4.bottom
            float r0 = r0 - r8
            float r0 = r0 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x020a
            float r0 = r4.top
            float r0 = r0 + r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0220
        L_0x020a:
            int r0 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0224
            float r5 = r5 + r12
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0224
            float r1 = r4.bottom
            float r0 = r1 - r12
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0224
            float r1 = r1 + r12
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0224
        L_0x0220:
            java.lang.Integer r0 = X.AnonymousClass05K.A0u
            goto L_0x014a
        L_0x0224:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x014a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fxcrop.SimpleCropView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public SimpleCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public SimpleCropView(Context context) {
        super(context);
        A00();
    }
}
