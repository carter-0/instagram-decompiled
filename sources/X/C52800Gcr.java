package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;

/* renamed from: X.Gcr  reason: case insensitive filesystem */
public final class C52800Gcr extends Drawable implements Animator.AnimatorListener {
    public float A00 = 1.0f;
    public C306386Ly A01;
    public String A02;
    public boolean A03;
    public boolean A04 = true;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final RectF A08;
    public final OvershootInterpolator A09 = new OvershootInterpolator(1.1f);
    public final AnonymousClass0eM A0A = C58710IwJ.A01(this, 0);
    public final AnonymousClass0eM A0B;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        AnonymousClass0eM r3 = this.A0A;
        ((Drawable) r3.getValue()).draw(canvas);
        RectF rectF = this.A08;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        canvas.save();
        float f = this.A00;
        canvas.scale(f, f, centerX, centerY);
        canvas.translate((centerX - ((float) (this.A01.A0A / 2))) - ((float) (this.A06 / 2)), ((float) ((Drawable) r3.getValue()).getBounds().bottom) + ((float) this.A05));
        this.A01.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onAnimationCancel(Animator animator) {
        this.A03 = false;
    }

    public final void onAnimationEnd(Animator animator) {
        this.A04 = false;
        this.A03 = false;
    }

    public final void onAnimationRepeat(Animator animator) {
        this.A03 = true;
    }

    public final void onAnimationStart(Animator animator) {
        this.A03 = false;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static final C306386Ly A00(C52800Gcr gcr, CharSequence charSequence) {
        Spannable spannable = C306386Ly.A0d;
        Context context = gcr.A07;
        C306386Ly r3 = new C306386Ly(context, context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
        Context context2 = r3.A0Z;
        r3.A0A(context2.getResources().getDimension(R.dimen.account_group_management_row_text_size));
        r3.A0F(context2.getColor(2Yu.A0E(context2)));
        r3.A0L(new SpannableString(charSequence));
        return r3;
    }

    public /* synthetic */ C52800Gcr(Context context) {
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R.dimen.abc_edit_text_inset_top_material);
        this.A07 = context;
        this.A05 = dimensionPixelOffset;
        this.A06 = dimensionPixelOffset2;
        String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131969506);
        this.A02 = A0d;
        this.A01 = A00(this, A0d);
        this.A0B = C58710IwJ.A01(this, 1);
        this.A08 = AnonymousClass7TE.A0Y();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = this.A08;
        rectF.set((float) i, (float) i2, (float) i3, (float) i4);
        int max = Math.max(0, (i3 - i) - (this.A06 * 2));
        C306386Ly r1 = this.A01;
        if (r1.A07 != max) {
            r1.A0E(max);
        }
        int centerX = (int) rectF.centerX();
        int centerY = (int) rectF.centerY();
        AnonymousClass0eM r4 = this.A0A;
        int i5 = centerY - (((AnonymousClass6KL) r4.getValue()).A08 / 2);
        int intrinsicWidth = centerX - (((Drawable) r4.getValue()).getIntrinsicWidth() / 2);
        ((Drawable) r4.getValue()).setBounds(intrinsicWidth, i5, ((Drawable) r4.getValue()).getIntrinsicWidth() + intrinsicWidth, centerY + ((AnonymousClass6KL) r4.getValue()).A08);
    }
}
