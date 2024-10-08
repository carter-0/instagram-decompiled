package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.8vL  reason: invalid class name and case insensitive filesystem */
public final class C369798vL extends Drawable implements AnonymousClass5MJ, C300645xY {
    public int A00;
    public AnonymousClass9XA A01;
    public StaticLayout A02;
    public final float A03;
    public final float A04;
    public final C3498682d A05;
    public final User A06;
    public final String A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final float A0B;
    public final int A0C;
    public final Drawable A0D;
    public final TextPaint A0E;
    public final C306386Ly A0F;
    public final C306386Ly A0G;

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        int save = canvas.save();
        float f = this.A08;
        float f2 = 1.0f / f;
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.scale(f2, f2);
        canvas.save();
        float f3 = this.A09;
        Drawable drawable = this.A0D;
        0qQ.A0A(drawable);
        canvas.translate(f3 - (((float) drawable.getIntrinsicWidth()) / 4.0f), f3 - (((float) drawable.getIntrinsicHeight()) / 4.0f));
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        C306386Ly r7 = this.A0G;
        float f4 = ((this.A03 * f) - f3) - ((float) r7.A06);
        canvas.translate(f3, f4);
        r7.draw(canvas);
        StaticLayout staticLayout = this.A02;
        if (staticLayout != null) {
            canvas.translate(0.0f, ((float) (-staticLayout.getHeight())) - this.A0B);
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.save();
        C306386Ly r2 = this.A0F;
        r2.A0M(1G0.A02((long) (this.A0C - this.A00)));
        canvas.translate((this.A0A - ((float) r2.A0A)) - f3, f3);
        r2.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        AnonymousClass9XA r22 = this.A01;
        if (r22 != null) {
            r22.A00(canvas, (f * ((float) bounds.left)) + f3 + ((float) r7.A0A), (f * ((float) bounds.top)) + f4, f2);
        }
    }

    public final int getDurationInMs() {
        return -1;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    public C369798vL(Context context, C3498682d r30, boolean z) {
        float f;
        int i;
        C3498682d r11 = r30;
        0qQ.A0B(r11, 3);
        this.A05 = r11;
        User user = r11.A04;
        if (user != null) {
            this.A06 = user;
            String str = r11.A06;
            if (str != null) {
                this.A07 = str;
                String username = user.getUsername();
                this.A0C = r11.A03;
                TextPaint textPaint = new TextPaint(1);
                this.A0E = textPaint;
                boolean z2 = r11.A08;
                float f2 = z2 ? 1.0f : 0.67f;
                this.A08 = f2;
                float f3 = (float) r11.A02;
                if (z2 || z) {
                    f = r11.A00;
                } else {
                    f = 0.5625f;
                }
                this.A03 = f3 / f;
                this.A04 = f3;
                float f4 = f2 * f3;
                this.A0A = f4;
                Context context2 = context;
                Resources resources = context2.getResources();
                float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
                float f5 = dimensionPixelSize;
                this.A09 = dimensionPixelSize;
                this.A0B = (float) resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                int color = context2.getColor(R.color.canvas_bottom_sheet_description_text_color);
                int color2 = context2.getColor(R.color.black_50_transparent);
                Typeface A022 = AnonymousClass0qo.A00(context2).A02(0qm.A13);
                textPaint.setTextSize(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                textPaint.setTypeface(A022);
                textPaint.setColor(color);
                textPaint.setShadowLayer(5.0f, 0.0f, 0.0f, color2);
                int i2 = (int) f3;
                C306386Ly r5 = new C306386Ly(context2, i2);
                this.A0G = r5;
                r5.A0M(username);
                r5.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                r5.A0F(color);
                r5.A0D(5.0f, 0.0f, 0.0f, color2);
                r5.A0N("…", 1, true);
                if (r11.A09 && !r11.A07 && user.A1j()) {
                    String string = context2.getString(2131976670);
                    0qQ.A07(string);
                    AnonymousClass9XA r15 = new AnonymousClass9XA(context2, string, i2);
                    this.A01 = r15;
                    float dimension = resources.getDimension(R.dimen.action_bar_item_spacing_right);
                    r15.A01.A0A(dimension);
                    r15.A02.A0A(dimension);
                    AnonymousClass9XA r152 = this.A01;
                    0qQ.A0A(r152);
                    int color3 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text_on_media));
                    r152.A01.A0F(color3);
                    r152.A02.A0F(color3);
                }
                float f6 = f4 - (2.0f * f5);
                int i3 = (int) f6;
                AnonymousClass9XA r0 = this.A01;
                if (r0 != null) {
                    i = r0.getIntrinsicWidth();
                } else {
                    i = 0;
                }
                r5.A0E(i3 - i);
                C306386Ly r153 = new C306386Ly(context2, i2);
                this.A0F = r153;
                r153.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
                r153.A0F(color);
                r153.A0I(A022);
                r153.A0D(5.0f, 0.0f, 0.0f, color2);
                Drawable drawable = context2.getDrawable(R.drawable.instagram_play_filled_32);
                this.A0D = drawable;
                0qQ.A0A(drawable);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                String str2 = r11.A05;
                0qQ.A07(str2);
                if (str2.length() != 0) {
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    0rN r20 = new 0rN(alignment, textPaint, (String) null, 0.0f, 1.0f, Math.round(f6), true);
                    String A023 = C252993q2.A02(r20, str2, "…", 2);
                    0qQ.A07(A023);
                    this.A02 = new StaticLayout(A023, textPaint, r20.A00, alignment, 1.0f, 0.0f, true);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C2802350v BzV() {
        return this.A05;
    }

    public final String C4F() {
        return 002.A0R("story-igtv-metadata-sticker-", this.A07);
    }

    public final int getIntrinsicHeight() {
        return Math.round(this.A03);
    }

    public final int getIntrinsicWidth() {
        return Math.round(this.A04);
    }

    public final void setAlpha(int i) {
        this.A0E.setAlpha(i);
        this.A0G.setAlpha(i);
        AnonymousClass9XA r0 = this.A01;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        Drawable drawable = this.A0D;
        0qQ.A0A(drawable);
        drawable.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0E.setColorFilter(colorFilter);
        this.A0G.setColorFilter(colorFilter);
        AnonymousClass9XA r0 = this.A01;
        if (r0 != null) {
            r0.setColorFilter(colorFilter);
        }
        Drawable drawable = this.A0D;
        0qQ.A0A(drawable);
        drawable.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void EXC(int i, int i2) {
        this.A00 = i;
    }
}
