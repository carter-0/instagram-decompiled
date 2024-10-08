package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

public final class KWJ extends KHj {
    public final int A00;
    public final int A01;
    public final Drawable A02;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A02.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1N(this.A02);
    }

    public final int getIntrinsicHeight() {
        return this.A00;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public KWJ(Context context) {
        int A07 = JTR.A07(context);
        this.A00 = A07;
        C61679KHm kHm = new C61679KHm(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        kHm.setCallback(this);
        this.A02 = kHm;
        this.A01 = A07 / 2;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A00) / 2.0f;
        float f4 = f2 - f3;
        this.A02.setBounds((int) (f - f3), (int) f4, (int) (f + f3), (int) (f2 + f3));
    }
}
