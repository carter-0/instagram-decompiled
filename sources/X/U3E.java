package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public final class U3E extends View {
    public AnonymousClass5Gv A00;
    public String A01 = "";
    public int A02;
    public int A03;
    public Boolean A04;
    public final ViewParent A05;
    public final Paint A06;
    public final Paint A07;
    public final Path A08;
    public final RectF A09;
    public final float[] A0A;

    public final void onDraw(Canvas canvas) {
        Paint paint;
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        RectF rectF = this.A09;
        C13990Tnq.A0q(rectF, (float) getWidth(), getHeight());
        Path path = this.A08;
        path.reset();
        path.addRoundRect(rectF, this.A0A, Path.Direction.CW);
        if (AnonymousClass7TF.A1Y(this.A04, false)) {
            paint = this.A07;
        } else {
            paint = this.A06;
        }
        canvas.drawPath(path, paint);
    }

    public final void setTooltipText(String str) {
        0qQ.A0B(str, 0);
        this.A01 = str;
    }

    public final int getBaseColor() {
        return this.A02;
    }

    public final String getTooltipText() {
        return this.A01;
    }

    public final int getUnselectedColor() {
        return this.A03;
    }

    public final void setBarSelected(Boolean bool) {
        AnonymousClass5Gv r0;
        this.A04 = bool;
        invalidate();
        if (DbX.A1a(bool) && (r0 = this.A00) != null) {
            r0.A06();
        }
    }

    public final void setBaseColor(int i) {
        this.A02 = i;
        this.A06.setColor(i);
    }

    public final void setUnselectedColor(int i) {
        this.A03 = i;
        this.A07.setColor(i);
    }

    public U3E(Context context, ViewParent viewParent) {
        super(context);
        this.A05 = viewParent;
        Paint paint = new Paint();
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.A06 = paint;
        Paint paint2 = new Paint();
        paint2.setStyle(style);
        this.A07 = paint2;
        this.A08 = new Path();
        this.A09 = new RectF();
        float A0D = (float) AnonymousClass7TE.A0D(getResources());
        float[] fArr = new float[8];
        fArr[0] = A0D;
        C13989Tnp.A1U(fArr, A0D);
        fArr[4] = A0D;
        C51975G9x.A1L(fArr, A0D);
        this.A0A = fArr;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup;
        AnonymousClass5Gt r3;
        Activity activity;
        super.onLayout(z, i, i2, i3, i4);
        if (getWidth() > 0 && this.A00 == null) {
            Context context = getContext();
            if (!(context instanceof Activity) || (activity = (Activity) context) == null) {
                ViewParent viewParent = this.A05;
                if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
                    0qQ.A07(context);
                    r3 = new AnonymousClass5Gt(context, viewGroup, new C315476jx((CharSequence) this.A01));
                } else {
                    return;
                }
            } else {
                r3 = AnonymousClass7TG.A0f(activity, this.A01);
            }
            r3.A04(this, getWidth() / 2, -10, false);
            r3.A02();
            r3.A0B = false;
            this.A00 = r3.A00();
        }
    }
}
