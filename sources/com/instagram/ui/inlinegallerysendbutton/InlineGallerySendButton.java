package com.instagram.ui.inlinegallerysendbutton;

import X.0nA;
import X.0qQ;
import X.2cs;
import X.AnonymousClass0fD;
import X.AnonymousClass37O;
import X.AnonymousClass37Q;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C20855X1h;
import X.C252203oj;
import X.C71382cm;
import X.C71392co;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class InlineGallerySendButton extends View implements C252203oj {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public Bitmap A0C;
    public C20855X1h A0D;
    public final 2cs A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Path A0K;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0K = new Path();
        this.A07 = 1.0f;
        this.A06 = 1.0f;
        this.A08 = 255;
        this.A09 = -1;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A1c, 0, 0);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A0A = obtainStyledAttributes.getColor(5, -7829368);
            this.A0B = obtainStyledAttributes.getColor(7, -1);
            this.A05 = obtainStyledAttributes.getDimension(6, 10.0f);
            int color = obtainStyledAttributes.getColor(1, -16777216);
            this.A02 = obtainStyledAttributes.getDimension(2, 0.0f);
            this.A03 = obtainStyledAttributes.getDimension(3, 0.0f);
            this.A04 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.A01 = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.A0G = paint;
            C13988Tno.A0p(this.A0A, paint);
            Paint paint2 = new Paint(paint);
            this.A0H = paint2;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            paint2.setColor(this.A0B);
            paint2.setStrokeWidth(this.A05);
            Paint paint3 = new Paint(1);
            this.A0I = paint3;
            paint3.setColor(color);
            paint3.setStrokeCap(Paint.Cap.ROUND);
            paint3.setStrokeJoin(Paint.Join.MITER);
            paint3.setStrokeWidth(this.A04);
            paint3.setStyle(style);
            int color2 = context.getColor(R.color.black_40_transparent);
            Paint paint4 = new Paint(1);
            this.A0J = paint4;
            paint4.setShadowLayer(0nA.A04(context, 4), 0.0f, 0.0f, color2);
            Paint paint5 = new Paint(1);
            this.A0F = paint5;
            paint5.setColorFilter(AnonymousClass37O.A00(-16777216));
            2cs A0J2 = AnonymousClass7TF.A0J();
            A0J2.A09(C71392co.A04(80.0d, 7.0d));
            this.A0E = A0J2;
            setClickable(false);
            setFocusable(true);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r12) {
        0qQ.A0B(r12, 0);
        float f = (float) r12.A09.A00;
        this.A07 = f;
        this.A06 = 1.0f;
        int A042 = (int) AnonymousClass37Q.A04((double) f, 1.0d, (double) this.A00, 0.0d, 255.0d);
        this.A08 = A042;
        this.A08 = (int) Math.min(Math.max((double) A042, 0.0d), 255.0d);
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        float min = ((float) Math.min(getWidth(), getHeight())) / 2.0f;
        float f = this.A07 * min;
        float f2 = (min - this.A05) * this.A06;
        if (this.A0C == null) {
            Bitmap createBitmap = Bitmap.createBitmap(canvas2.getWidth(), canvas2.getHeight(), Bitmap.Config.ALPHA_8);
            this.A0C = createBitmap;
            0qQ.A0A(createBitmap);
            new Canvas(createBitmap).drawCircle(((float) canvas2.getWidth()) / 2.0f, ((float) canvas2.getHeight()) / 2.0f, (float) Math.floor((double) f2), this.A0J);
        }
        Bitmap bitmap = this.A0C;
        0qQ.A0A(bitmap);
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, this.A0F);
        if (f != f2) {
            canvas2.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f, this.A0H);
        }
        canvas2.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, f2, this.A0G);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f3 = this.A03;
        float f4 = width - (f3 / 2.0f);
        float f5 = f4 + f3;
        float f6 = this.A01;
        canvas2.rotate(f6, width, height);
        canvas2.save();
        canvas2.translate(0.0f, -(height - f4));
        canvas2.rotate(45.0f, width, height);
        Path path = this.A0K;
        float f7 = this.A02;
        path.moveTo(f7 + width, height);
        path.lineTo(width, height);
        path.lineTo(width, f7 + height);
        Paint paint = this.A0I;
        paint.setAlpha(this.A08);
        canvas2.drawPath(path, paint);
        canvas2.restore();
        canvas2.drawLine(width, f4 + this.A04, width, f5, paint);
        canvas2.rotate(-f6, width, height);
    }

    private final void setPressedAlpha(boolean z) {
        Paint paint = this.A0G;
        int i = this.A0A;
        if (z) {
            C13988Tno.A0o((float) Color.alpha(i), 0.6f, paint);
            C13988Tno.A0o((float) Color.alpha(this.A0B), 0.6f, this.A0H);
        } else {
            paint.setColor(i);
            this.A0H.setColor(this.A0B);
        }
        invalidate();
    }

    public final void setListener(C20855X1h x1h) {
        this.A0D = x1h;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-2076428331);
        super.onAttachedToWindow();
        this.A0E.A0A(this);
        AnonymousClass0fD.A0D(1414504619, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1356301481);
        super.onDetachedFromWindow();
        this.A0E.A0B(this);
        AnonymousClass0fD.A0D(1723865941, A062);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1721702696);
        float A012 = C13988Tno.A01(Math.min(getWidth(), getHeight()));
        this.A00 = (A012 - this.A05) / A012;
        AnonymousClass0fD.A0D(-1354363551, A062);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r7 != 6) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            r0 = 1223254815(0x48e9631f, float:477976.97)
            int r3 = X.AnonymousClass0fD.A05(r0)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x002c
            int r7 = r9.getActionMasked()
            int r0 = r9.getActionIndex()
            int r6 = r9.getPointerId(r0)
            r5 = -1
            r2 = 1
            if (r7 == 0) goto L_0x0033
            r1 = 6
            if (r7 == r2) goto L_0x005d
            r0 = 3
            if (r7 == r0) goto L_0x005d
            r0 = 5
            if (r7 == r0) goto L_0x0033
            if (r7 == r1) goto L_0x005d
        L_0x002c:
            r0 = 648130266(0x26a1aeda, float:1.1219013E-15)
        L_0x002f:
            X.AnonymousClass0fD.A0C(r0, r3)
            return r4
        L_0x0033:
            int r0 = r8.A09
            if (r0 != r5) goto L_0x0040
            r8.A09 = r6
            r8.setPressedAlpha(r2)
            r0 = -811670847(0xffffffffcf9ee2c1, float:-5.3313213E9)
            goto L_0x006b
        L_0x0040:
            if (r0 != r6) goto L_0x0059
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = X.C51968G9o.A1Z(r0, r6)
            java.lang.String r1 = "InlineGallerySendButton"
            r0 = 1395(0x573, float:1.955E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0KC.A0P(r1, r0, r2)
            r0 = 1214000182(0x485c2c36, float:225456.84)
            goto L_0x002f
        L_0x0059:
            r0 = -1683737073(0xffffffff9ba4360f, float:-2.7166459E-22)
            goto L_0x002f
        L_0x005d:
            int r0 = r8.A09
            if (r6 != r0) goto L_0x0064
            r8.setPressedAlpha(r4)
        L_0x0064:
            if (r7 == r1) goto L_0x0068
            r8.A09 = r5
        L_0x0068:
            r0 = -1623944975(0xffffffff9f3490f1, float:-3.8236375E-20)
        L_0x006b:
            X.AnonymousClass0fD.A0C(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.inlinegallerysendbutton.InlineGallerySendButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void DmC(2cs r1) {
        invalidate();
    }

    public /* synthetic */ InlineGallerySendButton(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineGallerySendButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
