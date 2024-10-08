package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.instagram.android.R;

/* renamed from: X.9X5  reason: invalid class name */
public final class AnonymousClass9X5 extends Drawable implements AnonymousClass5MJ {
    public float A00;
    public int A01;
    public int A02;
    public Integer A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final Context A0A;
    public final Resources A0B;
    public final Rect A0C;
    public final TextPaint A0D;
    public final AnonymousClass61R A0E;
    public final String A0F;
    public final String A0G;
    public final 0eP A0H;

    public AnonymousClass9X5(Context context, String str, int i, int i2, int i3, long j) {
        this.A0A = context;
        this.A0F = str;
        this.A07 = i;
        this.A06 = i2;
        this.A09 = j;
        this.A08 = i3;
        Resources resources = context.getResources();
        this.A0B = resources;
        int dimension = (int) resources.getDimension(R.dimen.album_preview_add_item_circle_size);
        this.A05 = dimension;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_static_sticker_last_row_padding);
        int i4 = (i - dimension) / 2;
        int dimensionPixelSize2 = (((i2 - dimension) - dimensionPixelSize) - resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) / 2;
        int i5 = this.A05;
        Rect rect = new Rect(i4, dimensionPixelSize2, i4 + i5, i5 + dimensionPixelSize2);
        this.A0C = rect;
        AnonymousClass61R A002 = C303756Aq.A00(context, R.raw.clips_watermark);
        if (A002 != null) {
            A002.setBounds(rect);
            A002.A01(255);
        } else {
            0wb.A03("ClipsEndCardDrawable", "Failed to render clips end card when downloading video, because Keyframes drawable was null");
            A002 = null;
        }
        this.A0E = A002;
        this.A0G = 002.A0D(AnonymousClass7TF.A0k(str), '@');
        TextPaint textPaint = new TextPaint(1);
        textPaint.setAlpha(0);
        AnonymousClass7TE.A1N(context, textPaint, R.color.canvas_bottom_sheet_description_text_color);
        textPaint.setShadowLayer((float) AnonymousClass7TE.A0H(resources), 0.0f, 0.0f, AnonymousClass7TF.A03(context, R.attr.igds_color_shadow_on_media));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AnonymousClass7TE.A01(resources, R.dimen.abc_dialog_padding_top_material));
        textPaint.setTypeface(AnonymousClass7TG.A0O(context));
        this.A0D = textPaint;
        this.A0H = AnonymousClass7TE.A1L(Float.valueOf((float) (i / 2)), Float.valueOf((float) (rect.bottom + dimensionPixelSize)));
        this.A02 = (int) j;
        this.A03 = AnonymousClass05K.A00;
    }

    public final void EXC(int i, int i2) {
        if (((long) i) > this.A09) {
            this.A04 = i;
            int i3 = i - this.A02;
            this.A01 = i3;
            if (i3 >= C393749ww.A00(this.A03)) {
                this.A03 = AnonymousClass05K.A00(5)[(this.A03.intValue() + 1) % AnonymousClass05K.A00(5).length];
                this.A02 = i;
                this.A01 = 0;
            }
            this.A00 = 0mi.A00(((float) this.A01) / ((float) C393749ww.A00(this.A03)), 0.0f, 1.0f);
            invalidateSelf();
        }
    }

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        0qQ.A0B(canvas, 0);
        AnonymousClass61R r4 = this.A0E;
        if (r4 != null) {
            Matrix A0U = AnonymousClass7TE.A0U();
            int intValue = this.A03.intValue();
            float f2 = 1.1f;
            if (intValue != 0) {
                if (intValue != 1) {
                    f2 = 0.85f;
                    if (intValue == 2) {
                        i = AnonymousClass1GB.A01(248.0f);
                        f = ((0.85f - 1.0f) * this.A00) + 1.0f;
                        A0U.setScale(f, f, ((float) this.A07) / 2.0f, ((float) this.A06) / 2.0f);
                        canvas.setMatrix(A0U);
                    } else if (intValue != 3) {
                        i = AnonymousClass1GB.A01(248.0f);
                    }
                }
                i = AnonymousClass1GB.A01(248.0f);
                f = f2 + ((1.0f - f2) * this.A00);
                A0U.setScale(f, f, ((float) this.A07) / 2.0f, ((float) this.A06) / 2.0f);
                canvas.setMatrix(A0U);
            } else {
                float f3 = 1.0f + ((1.1f - 1.0f) * this.A00);
                A0U.setScale(f3, f3, ((float) this.A07) / 2.0f, ((float) this.A06) / 2.0f);
                canvas.setMatrix(A0U);
                i = 0;
            }
            canvas.drawARGB(192, 0, 0, 0);
            TextPaint textPaint = this.A0D;
            textPaint.setAlpha(i);
            r4.EL2(((float) ((((long) this.A04) - this.A09) + 370)) / ((float) this.A08));
            r4.draw(canvas);
            if (this.A03 != AnonymousClass05K.A00) {
                0eP r1 = this.A0H;
                canvas.drawText(this.A0G, AnonymousClass7TE.A04(r1.A00), AnonymousClass7TE.A04(r1.A01), textPaint);
            }
        }
    }

    public final int getDurationInMs() {
        return -1;
    }

    public final C2802350v BzV() {
        String str = this.A0F;
        int i = this.A07;
        int i2 = this.A06;
        long j = this.A09;
        int i3 = this.A08;
        0qQ.A0B(str, 1);
        C40603Aer aer = new C40603Aer();
        aer.A05 = str;
        aer.A04 = null;
        aer.A01 = i;
        aer.A00 = i2;
        aer.A03 = j;
        aer.A02 = i3;
        return aer;
    }

    public final int getIntrinsicHeight() {
        return this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A07;
    }

    public final int getOpacity() {
        AnonymousClass61R r0 = this.A0E;
        if (r0 != null) {
            return r0.getOpacity();
        }
        return -2;
    }

    public final void setAlpha(int i) {
        AnonymousClass61R r0 = this.A0E;
        if (r0 != null) {
            r0.A01(i);
        }
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
