package com.instagram.ui.widget.framelayout;

import X.0qQ;
import X.AnonymousClass0fD;
import X.C242423Ua;
import X.C67961ye;
import X.C71382cm;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class MediaFrameLayout extends C67961ye implements C242423Ua {
    public float A00;
    public float A01;
    public Path A02;
    public boolean A03;
    public boolean A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void attachViewToParent(View view, int i, ViewGroup.LayoutParams layoutParams) {
        0qQ.A0B(view, 0);
        0qQ.A0B(layoutParams, 2);
        super.attachViewToParent(view, i, layoutParams);
    }

    public final void detachViewFromParent(View view) {
        0qQ.A0B(view, 0);
        super.detachViewFromParent(view);
    }

    public void dispatchDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Path path = this.A02;
        if (this.A04 && path != null) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    public void onMeasure(int i, int i2) {
        float f = this.A00;
        if (f != -1.0f && f > 0.0f) {
            boolean z = this.A03;
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            int size2 = View.MeasureSpec.getSize(i);
            if (!z && (mode == Integer.MIN_VALUE || mode == 1073741824)) {
                float f2 = (float) size;
                if (f2 < ((float) size2) / f) {
                    i = View.MeasureSpec.makeMeasureSpec((int) (f2 * f), SN3.MAX_SIGNED_POWER_OF_TWO);
                    i2 = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) size2) / f), SN3.MAX_SIGNED_POWER_OF_TWO);
            i = View.MeasureSpec.makeMeasureSpec(size2, SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        super.onMeasure(i, i2);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-1252753513);
        super.onSizeChanged(i, i2, i3, i4);
        if (this.A04) {
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
            float f = this.A01;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.A02 = path;
        }
        AnonymousClass0fD.A0D(-758044507, A06);
    }

    public final void setAspectRatio(float f) {
        this.A00 = f;
    }

    public final void setForFullWidth(boolean z) {
        this.A03 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1i);
        0qQ.A07(obtainStyledAttributes);
        this.A03 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MediaFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MediaFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
