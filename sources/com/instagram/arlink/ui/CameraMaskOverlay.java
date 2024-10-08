package com.instagram.arlink.ui;

import X.0nA;
import X.2eL;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

public class CameraMaskOverlay extends ImageView {
    public View A00;
    public boolean A01;
    public final Paint A02 = new Paint();
    public final Path A03 = new Path();

    public final void onDraw(Canvas canvas) {
        Path path = this.A03;
        if (!path.isEmpty()) {
            if (this.A01) {
                canvas.drawPath(path, this.A02);
            }
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public void setCameraView(View view) {
        this.A00 = view;
    }

    public void setImageAlpha(int i) {
        this.A01 = AnonymousClass7TF.A1T(i, 255);
        this.A02.setColor(2eL.A06(-16777216, i));
        super.setImageAlpha(i);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-1657312850);
        super.onSizeChanged(i, i2, i3, i4);
        View view = this.A00;
        if (view != null) {
            RectF rectF = 0nA.A01;
            RectF rectF2 = new RectF();
            0nA.A0L(rectF2, view);
            if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                Path path = this.A03;
                path.reset();
                path.addOval(rectF2, Path.Direction.CW);
            }
            this.A02.setColor(-16777216);
        }
        AnonymousClass0fD.A0D(1157724998, A06);
    }

    public CameraMaskOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraMaskOverlay(Context context) {
        super(context);
    }
}
