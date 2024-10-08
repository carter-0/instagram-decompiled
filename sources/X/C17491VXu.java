package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.instagram.android.R;

/* renamed from: X.VXu  reason: case insensitive filesystem */
public final class C17491VXu {
    public final Context A00;
    public final Paint A01;
    public final Paint A02;
    public final Rect A03 = new Rect();

    public C17491VXu(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        Paint paint = new Paint();
        paint.setColor(-1);
        C13988Tno.A0t(context.getResources(), paint, R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        this.A02 = paint;
        Paint paint2 = new Paint();
        paint2.setColor(1711276032);
        this.A01 = paint2;
    }
}
