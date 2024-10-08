package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.PaintDrawable;
import com.instagram.android.R;

/* renamed from: X.Mhs  reason: case insensitive filesystem */
public final class C67077Mhs extends PaintDrawable {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;

    public C67077Mhs(Context context) {
        0qQ.A0B(context, 1);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Paint paint = getPaint();
        Rect A0X = AnonymousClass7TE.A0X(this);
        int centerX = A0X.centerX();
        int centerY = A0X.centerY();
        int i = this.A04;
        int height = (A0X.height() / 2) - i;
        if (this.A03) {
            paint.setColor(this.A01);
            int i2 = 0;
            do {
                double d = ((double) i2) * 0.5235987755982988d;
                double d2 = (double) height;
                canvas.drawCircle((float) ((int) (((double) centerX) + (Math.cos(d) * d2))), (float) ((int) (((double) centerY) + (d2 * Math.sin(d)))), (float) i, paint);
                i2++;
            } while (i2 < 12);
        }
        if (this.A02) {
            paint.setColor(this.A00);
            canvas.drawCircle((float) centerX, (float) centerY, (float) this.A05, paint);
        }
    }
}
