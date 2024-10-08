package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Jcs  reason: case insensitive filesystem */
public final class C59983Jcs extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public float A04;
    public float A05;
    public int A06;
    public final Paint A07;
    public final Paint A08;

    public C59983Jcs(Context context) {
        Resources A0A = AnonymousClass7TF.A0A(context);
        int dimensionPixelSize = A0A.getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A00 = dimensionPixelSize;
        this.A05 = ((float) dimensionPixelSize) / 2.0f;
        int A042 = JTP.A04(A0A);
        this.A01 = A042;
        this.A04 = ((float) A042) / 2.0f;
        this.A02 = A0A.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A06 = A0A.getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
        Paint A0C = JTO.A0C();
        this.A07 = A0C;
        A0C.setAntiAlias(true);
        AnonymousClass7TE.A1Q(A0C);
        A0C.setColor(-1);
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A08 = A0V;
        A0V.setColor(-16777216);
        A0V.setTextAlign(Paint.Align.CENTER);
        A0V.setTextSize((float) this.A06);
    }

    public final int getOpacity() {
        return -1;
    }

    public final int getIntrinsicHeight() {
        return this.A00 + this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A00 + this.A01;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
        this.A08.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
        this.A08.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        float f = this.A04;
        canvas.translate(f, f);
        float f2 = this.A05;
        canvas.drawCircle(f2, f2, f2, this.A07);
        String str = this.A03;
        if (str != null) {
            canvas.drawText(str, f2, (((float) this.A06) / 3.0f) + f2, this.A08);
        }
        canvas.restore();
    }
}
