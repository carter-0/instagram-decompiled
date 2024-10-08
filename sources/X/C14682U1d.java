package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import com.instagram.android.R;

/* renamed from: X.U1d  reason: case insensitive filesystem */
public final class C14682U1d extends ShapeDrawable {
    public int A00 = R.dimen.abc_control_corner_material;
    public final boolean A01;
    public final Context A02;

    public final void draw(Canvas canvas) {
        int A0H;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        Rect clipBounds = canvas.getClipBounds();
        0qQ.A07(clipBounds);
        boolean z = this.A01;
        if (!z) {
            canvas.drawColor(this.A02.getColor(R.color.bright_foreground_disabled_material_dark));
        }
        Context context = this.A02;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        if (!z) {
            A0H = R.color.black_15_transparent;
        } else {
            A0H = 2Yu.A0H(context, R.attr.igds_color_photo_border);
        }
        AnonymousClass7TE.A1N(context, paint, A0H);
        try {
            C13988Tno.A0u(context.getResources(), paint, this.A00);
        } catch (Resources.NotFoundException e) {
            0wb.A01(0kg.A09, "SoldoutSlashDrawable", AnonymousClass7TF.A0m("Failed to find dimension resource: ", e));
        }
        canvas2.drawLine((float) clipBounds.left, (float) clipBounds.bottom, (float) clipBounds.right, (float) clipBounds.top, paint);
    }

    public C14682U1d(Context context) {
        this.A02 = context;
        this.A01 = false;
    }

    public C14682U1d(Context context, boolean z) {
        this.A02 = context;
        this.A01 = z;
    }
}
