package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import com.instagram.android.R;

/* renamed from: X.9q9  reason: invalid class name and case insensitive filesystem */
public final class C389759q9 extends AnonymousClass9WS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final RectF A03;
    public final RectF A04;
    public final C306386Ly A05;
    public final int A06;

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public C389759q9(Context context, String str, int i) {
        this.A06 = i;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_media_background);
        int color = context.getColor(2Yu.A0A(context));
        this.A02 = AnonymousClass7TE.A0B(resources);
        this.A00 = AnonymousClass7TE.A0F(resources);
        Paint paint = this.A00;
        AnonymousClass7TE.A1Q(paint);
        paint.setColor(A032);
        C306386Ly A0P = AnonymousClass7TF.A0P(context, dimensionPixelSize, i);
        AnonymousClass7TF.A11(resources, A0P, R.dimen.abc_text_size_menu_header_material);
        A0P.A0M(str);
        A0P.A0F(color);
        A0P.A0K(Layout.Alignment.ALIGN_CENTER);
        ABM.A00(context, A0P);
        this.A05 = A0P;
        int i2 = this.A02;
        int i3 = A0P.A06 + i2 + i2;
        this.A01 = i3;
        float f = (float) i;
        this.A04 = new RectF(0.0f, 0.0f, f, (float) i3);
        this.A03 = new RectF(0.0f, (float) this.A00, f, (float) this.A01);
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        canvas.save();
        AnonymousClass7TF.A13(canvas, A0L);
        RectF rectF = this.A04;
        float f = (float) this.A00;
        Paint paint = this.A00;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A03, paint);
        int i = this.A06;
        C306386Ly r2 = this.A05;
        AnonymousClass7TF.A15(canvas, r2, (float) ((i - r2.A0A) / 2), (float) this.A02);
    }
}
