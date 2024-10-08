package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.9k1  reason: invalid class name and case insensitive filesystem */
public final class C386079k1 extends C268694dq implements C339117j5 {
    public float A00;
    public float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final Drawable A09;
    public final ShapeDrawable A0A;
    public final ShapeDrawable A0B;
    public final ShapeDrawable A0C;

    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        float f = this.A00;
        if (f > 1.0f) {
            f = (f + 1.0f) / 2.0f;
        }
        canvas.save();
        canvas.scale(f, f, (float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this));
        Drawable drawable = this.A09;
        drawable.setAlpha((int) 0mi.A02(this.A00, 0.0f, 1.0f, 0.0f, 255.0f));
        drawable.draw(canvas);
        canvas.restore();
        float A0J = (this.A01 - ((float) AnonymousClass7TE.A0J(drawable))) - ((float) this.A02);
        ShapeDrawable shapeDrawable = this.A0A;
        float A0J2 = (float) AnonymousClass7TE.A0J(drawable);
        float f2 = (float) drawable.getBounds().top;
        float A0J3 = ((float) AnonymousClass7TE.A0J(drawable)) + ((float) this.A03);
        float A0J4 = ((float) AnonymousClass7TE.A0J(drawable)) + (A0J / 1.2f);
        if (A0J3 > A0J4) {
            A0J3 = A0J4;
        }
        A01(canvas2, shapeDrawable, A0J2, f2, A0J3, ((float) drawable.getBounds().top) + ((float) this.A04));
        float f3 = (float) drawable.getBounds().top;
        ShapeDrawable shapeDrawable2 = this.A0B;
        float A0J5 = (float) AnonymousClass7TE.A0J(drawable);
        float f4 = (float) drawable.getBounds().top;
        float A0J6 = ((float) AnonymousClass7TE.A0J(drawable)) + ((float) this.A05);
        float f5 = ((float) drawable.getBounds().top) + ((float) this.A06);
        float f6 = ((float) drawable.getBounds().top) - (f3 / 1.2f);
        if (f5 < f6) {
            f5 = f6;
        }
        A01(canvas2, shapeDrawable2, A0J5, f4, A0J6, f5);
        float A0J7 = (float) AnonymousClass7TE.A0J(drawable);
        ShapeDrawable shapeDrawable3 = this.A0C;
        float A0J8 = (float) AnonymousClass7TE.A0J(drawable);
        float f7 = (float) drawable.getBounds().top;
        float A0J9 = ((float) AnonymousClass7TE.A0J(drawable)) + ((float) this.A07);
        float A0J10 = ((float) AnonymousClass7TE.A0J(drawable)) - (A0J7 / 1.2f);
        if (A0J9 < A0J10) {
            A0J9 = A0J10;
        }
        A01(canvas2, shapeDrawable3, A0J8, f7, A0J9, ((float) drawable.getBounds().top) + ((float) this.A08));
    }

    public static final ShapeDrawable A00(Context context, int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.setIntrinsicWidth(i);
        shapeDrawable.setIntrinsicHeight(i);
        Paint paint = shapeDrawable.getPaint();
        AnonymousClass7TE.A1N(context, paint, i2);
        AnonymousClass7TE.A1Q(paint);
        paint.setAntiAlias(true);
        shapeDrawable.setBounds(new Rect(0, 0, i, i));
        return shapeDrawable;
    }

    private final void A01(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        float f5 = this.A00;
        float f6 = 1.0f - 0.0f;
        float f7 = f3 - f;
        float f8 = 0.0f;
        if (f6 != 0.0f) {
            f8 = (f5 - 0.0f) / f6;
        }
        float f9 = (f8 * f7) + f;
        float f10 = f4 - f2;
        float f11 = 0.0f;
        if (f6 != 0.0f) {
            f11 = (f5 - 0.0f) / f6;
        }
        drawable.setAlpha((int) 0mi.A02(f5, 0.0f, 1.0f, 0.0f, 255.0f));
        canvas.save();
        AnonymousClass7TF.A15(canvas, drawable, f9, (f11 * f10) + f2);
    }

    public final List A07() {
        return 0sr.A1M(new Drawable[]{this.A09, this.A0A, this.A0B, this.A0C});
    }

    public final void EOg(float f) {
        this.A00 = f;
        invalidateSelf();
    }

    public C386079k1(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.nux_sticker_nux_sticker);
        if (drawable != null) {
            AnonymousClass7TE.A1R(drawable, -1);
            this.A09 = drawable;
            int A072 = AnonymousClass7TG.A07(context);
            this.A02 = A072;
            this.A03 = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_text_button_min_width);
            this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            this.A05 = AnonymousClass7TH.A01(context);
            this.A06 = context.getResources().getDimensionPixelSize(R.dimen.album_rounded_corner_overlay_padding);
            this.A07 = context.getResources().getDimensionPixelSize(R.dimen.challenge_winner_v2_3_winner2_mention_margin_top);
            this.A08 = context.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
            this.A0A = A00(context, A072, R.color.activator_card_progress_bad);
            this.A0B = A00(context, A072, R.color.igds_creation_tools_pink);
            this.A0C = A00(context, A072, R.color.igds_creation_tools_purple);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        Drawable drawable = this.A09;
        float intrinsicHeight = ((float) drawable.getIntrinsicHeight()) / ((float) drawable.getIntrinsicWidth());
        float f = (float) (i3 - i);
        this.A01 = f;
        float f2 = 0.5f * f;
        float f3 = (f - f2) / 2.0f;
        float f4 = (((float) (i4 - i2)) - (f2 * intrinsicHeight)) / 2.0f;
        drawable.setBounds((int) (((float) i) + f3), (int) (((float) i2) + f4), (int) (((float) i3) - f3), (int) (((float) i4) - f4));
    }
}
