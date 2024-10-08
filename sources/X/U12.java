package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public final class U12 extends Drawable {
    public static final C14755U7m A0I = new C14755U7m();
    public float A00;
    public float A01;
    public float A02;
    public C14090Tph A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Paint A0A;
    public final Paint A0B;
    public final RectF A0C = new RectF();
    public final RectF A0D = new RectF();
    public final Drawable A0E;
    public final Drawable A0F;
    public final Drawable A0G;
    public final Drawable A0H;

    public U12(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_bow_knot);
        0qQ.A0A(drawable);
        this.A0E = drawable;
        Drawable drawable2 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_bow_left);
        0qQ.A0A(drawable2);
        this.A0F = drawable2;
        Drawable drawable3 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_ribbon_horiz);
        0qQ.A0A(drawable3);
        this.A0G = drawable3;
        Drawable drawable4 = context.getDrawable(R.drawable.ig_msgr_power_ups_giftbox_ribbon_horiz);
        0qQ.A0A(drawable4);
        this.A0H = drawable4;
        this.A09 = context.getResources().getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A06 = context.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_subtitle_top_margin_material);
        this.A07 = context.getResources().getDimensionPixelOffset(R.dimen.clips_viewer_media_info_ufi_button_side_margin);
        this.A08 = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material);
        Paint paint = new Paint(1);
        AnonymousClass7TE.A1N(context, paint, R.color.msg_powerups_giftbox_lid);
        this.A0B = paint;
        Paint paint2 = new Paint(1);
        AnonymousClass7TE.A1N(context, paint2, R.color.msg_powerups_giftbox_lid_depth);
        this.A0A = paint2;
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        if (this.A04) {
            this.A04 = false;
            int A042 = AnonymousClass7TF.A04(this);
            int A052 = AnonymousClass7TF.A05(this);
            C13988Tno.A0v(this.A0C, this);
            this.A05 = true;
            Drawable drawable = this.A0E;
            int intrinsicWidth = A042 - (drawable.getIntrinsicWidth() / 2);
            int intrinsicHeight = (this.A06 + A052) - (drawable.getIntrinsicHeight() / 2);
            drawable.setBounds(intrinsicWidth, intrinsicHeight, drawable.getIntrinsicWidth() + intrinsicWidth, drawable.getIntrinsicHeight() + intrinsicHeight);
            Drawable drawable2 = this.A0F;
            int intrinsicWidth2 = (this.A07 + A042) - (drawable2.getIntrinsicWidth() / 2);
            int intrinsicHeight2 = (this.A08 + A052) - (drawable2.getIntrinsicHeight() / 2);
            drawable2.setBounds(intrinsicWidth2, intrinsicHeight2, drawable2.getIntrinsicWidth() + intrinsicWidth2, drawable2.getIntrinsicHeight() + intrinsicHeight2);
            int i = this.A09;
            int i2 = A052 - (i / 2);
            int i3 = i + i2;
            this.A0G.setBounds(getBounds().left, i2, getBounds().right, i3);
            int A062 = A042 - (JTP.A06(this) / 2);
            this.A0H.setBounds(A062, i2, JTP.A06(this) + A062, i3);
        }
        float f = this.A02;
        if (f > 0.0f) {
            if (this.A05) {
                RectF rectF = this.A0D;
                RectF rectF2 = this.A0C;
                float f2 = rectF2.left;
                float f3 = rectF2.bottom;
                rectF.set(f2, f3 - (this.A01 * 2.0f), rectF2.right, f3 + f);
                this.A05 = false;
            }
            RectF rectF3 = this.A0D;
            float f4 = this.A01;
            canvas.drawRoundRect(rectF3, f4, f4, this.A0A);
        }
        RectF rectF4 = this.A0C;
        float f5 = this.A01;
        canvas.drawRoundRect(rectF4, f5, f5, this.A0B);
        this.A0G.draw(canvas);
        int save = canvas.save();
        canvas.rotate(90.0f, (float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this));
        try {
            this.A0H.draw(canvas);
            canvas.restoreToCount(save);
            float A022 = C229632nm.A02(this.A00, -1.0f, 1.0f) * 15.0f;
            Drawable drawable3 = this.A0F;
            Rect A0X = AnonymousClass7TE.A0X(drawable3);
            float width = ((float) A0X.left) + (((float) A0X.width()) * 0.714f);
            float height = ((float) A0X.top) + (((float) A0X.height()) * 0.31f);
            int save2 = canvas.save();
            try {
                canvas.rotate(A022, width, height);
                drawable3.draw(canvas);
                canvas.restoreToCount(save2);
                save2 = canvas.save();
                canvas.scale(-1.0f, 1.0f, (float) AnonymousClass7TF.A04(this), (float) AnonymousClass7TF.A05(this));
                canvas.rotate(A022, width, height);
                drawable3.draw(canvas);
                canvas.restoreToCount(save2);
                this.A0E.draw(canvas);
            } catch (Throwable th) {
                canvas.restoreToCount(save2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(save);
            throw th2;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A04 = true;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
