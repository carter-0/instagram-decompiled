package com.instagram.creation.photo.crop;

import X.0qQ;
import X.AnonymousClass81H;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CropHighlightView extends View {
    public AnonymousClass81H A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropHighlightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        AnonymousClass81H r0 = this.A00;
        if (r0 != null) {
            r0.A00(canvas);
        }
    }

    public final void setCropDimensions(RectF rectF) {
        0qQ.A0B(rectF, 0);
        AnonymousClass81H r1 = this.A00;
        if (r1 != null) {
            r1.A01(rectF, false, true);
        }
    }

    public final AnonymousClass81H getHighlightView() {
        return this.A00;
    }

    public final void setDarkenPaintColor(int i) {
        AnonymousClass81H r0 = this.A00;
        if (r0 != null) {
            r0.A04.setColor(r0.A03.getColor(i));
        }
    }

    public final void setHighlightView(AnonymousClass81H r1) {
        this.A00 = r1;
        invalidate();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CropHighlightView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
