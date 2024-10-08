package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.H7p  reason: case insensitive filesystem */
public final class C54320H7p extends IgImageView {
    public final int A00;
    public final Paint A01;
    public final Path A02;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C54320H7p.super.onDraw(canvas);
        canvas.drawPath(this.A02, this.A01);
    }

    public C54320H7p(Context context, int i) {
        super(context);
        this.A00 = i;
        this.A02 = I7E.A02(i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) I7E.A00(context, R.dimen.audience_lists_text_in_badge_horizontal_margin_right));
        AnonymousClass7TE.A1N(context, paint, 2Yu.A0H(context, R.attr.igds_color_secondary_text_on_media));
        paint.setAlpha(155);
        this.A01 = paint;
    }
}
