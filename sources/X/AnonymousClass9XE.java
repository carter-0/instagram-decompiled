package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.9XE  reason: invalid class name */
public final class AnonymousClass9XE extends Drawable implements C268714ds, C41779B0i {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Context A05;
    public final Resources A06;
    public final Rect A07;
    public final TextPaint A08;
    public final AnonymousClass61R A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final 0eP A0D;

    public AnonymousClass9XE(Context context, Integer num, String str, int i, int i2, int i3, long j) {
        this.A05 = context;
        this.A0B = str;
        this.A02 = i;
        this.A01 = i2;
        this.A04 = j;
        this.A03 = i3;
        this.A0A = num;
        Resources resources = context.getResources();
        this.A06 = resources;
        int dimension = (int) resources.getDimension(R.dimen.album_preview_add_item_circle_size);
        this.A00 = dimension;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        int i4 = (i - dimension) / 2;
        int dimensionPixelSize2 = (((i2 - dimension) - dimensionPixelSize) - resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) / 2;
        int i5 = this.A00;
        Rect rect = new Rect(i4, dimensionPixelSize2, i4 + i5, i5 + dimensionPixelSize2);
        this.A07 = rect;
        AnonymousClass61R A002 = C303756Aq.A00(context, R.raw.clips_watermark);
        if (A002 != null) {
            A002.setBounds(rect);
            A002.A01(255);
        } else {
            0wb.A03("ClipsEndCardDrawable", "Failed to render clips end card when downloading video, because Keyframes drawable was null");
            A002 = null;
        }
        this.A09 = A002;
        this.A0C = 002.A0D(AnonymousClass7TF.A0k(str), '@');
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        AnonymousClass7TE.A1N(context, textPaint, R.color.canvas_bottom_sheet_description_text_color);
        textPaint.setShadowLayer((float) AnonymousClass7TE.A0H(resources), 0.0f, 0.0f, AnonymousClass7TF.A03(context, R.attr.igds_color_shadow_on_media));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AnonymousClass7TE.A01(resources, R.dimen.abc_dialog_padding_top_material));
        textPaint.setTypeface(AnonymousClass7TG.A0O(context));
        this.A08 = textPaint;
        this.A0D = AnonymousClass7TE.A1L(Float.valueOf((float) (i / 2)), Float.valueOf((float) (rect.bottom + dimensionPixelSize)));
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        AnonymousClass61R r2 = this.A09;
        if (r2 != null) {
            if (this.A0A == AnonymousClass05K.A00) {
                canvas.drawARGB(192, 0, 0, 0);
            }
            r2.EL2(0.75f);
            r2.draw(canvas);
            TextPaint textPaint = this.A08;
            textPaint.setAlpha(AnonymousClass1GB.A01(248.0f));
            0eP r1 = this.A0D;
            canvas.drawText(this.A0C, AnonymousClass7TE.A04(r1.A00), AnonymousClass7TE.A04(r1.A01), textPaint);
        }
    }

    public final C2802350v BzV() {
        String str = this.A0B;
        int i = this.A02;
        int i2 = this.A01;
        long j = this.A04;
        int i3 = this.A03;
        Integer num = this.A0A;
        AnonymousClass7TF.A1E(str, 1, num);
        C40604Aes aes = new C40604Aes();
        aes.A06 = str;
        aes.A05 = null;
        aes.A01 = i;
        aes.A00 = i2;
        aes.A03 = j;
        aes.A02 = i3;
        aes.A04 = num;
        return aes;
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A02;
    }

    public final int getOpacity() {
        AnonymousClass61R r0 = this.A09;
        if (r0 != null) {
            return r0.getOpacity();
        }
        return -2;
    }

    public final void setAlpha(int i) {
        AnonymousClass61R r0 = this.A09;
        if (r0 != null) {
            r0.A01(i);
        }
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
