package com.facebook.smartcapture.components;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C11408SSf;
import X.C51965G9l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;

public final class DarkenedFrameView extends View {
    public final float A00;
    public final float A01;
    public final Path A02 = C51965G9l.A0C();
    public final RectF A03 = AnonymousClass7TE.A0Y();
    public final RectF A04 = AnonymousClass7TE.A0Y();
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DarkenedFrameView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A05 = C11408SSf.A01(context, R.attr.sc_dark_shadow);
        Resources resources = getResources();
        this.A01 = resources.getDimension(R.dimen.abc_edit_text_inset_top_material);
        this.A00 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        canvas.clipOutPath(this.A02);
        canvas.drawColor(this.A05);
    }
}
