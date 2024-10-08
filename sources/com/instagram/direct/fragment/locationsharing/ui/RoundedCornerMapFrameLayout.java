package com.instagram.direct.fragment.locationsharing.ui;

import X.0nA;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public final class RoundedCornerMapFrameLayout extends FrameLayout {
    public Path A00 = new Path();
    public final float A01 = 0nA.A00(AnonymousClass7TE.A0S(this), 12.0f);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        setWillNotDraw(false);
    }

    public final void draw(Canvas canvas) {
        int A0D = AnonymousClass7TG.A0D(canvas, -1959253627);
        canvas.save();
        canvas.clipPath(this.A00);
        super.draw(canvas);
        canvas.restore();
        AnonymousClass0fD.A0A(-534167924, A0D);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(1264662165);
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        Path path = new Path();
        this.A00 = path;
        float f = this.A01;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.A00.close();
        AnonymousClass0fD.A0D(2044779744, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        setWillNotDraw(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundedCornerMapFrameLayout(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        setWillNotDraw(false);
    }
}
