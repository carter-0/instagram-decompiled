package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import com.instagram.android.R;

/* renamed from: X.7Ec  reason: invalid class name and case insensitive filesystem */
public final class C328257Ec {
    public Drawable A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final Context A08;
    public final Paint A09;
    public final boolean A0A;

    public C328257Ec(Context context) {
        this.A08 = context;
        Paint paint = new Paint();
        this.A09 = paint;
        Paint paint2 = new Paint();
        this.A04 = paint2;
        Resources resources = context.getResources();
        paint.setAntiAlias(true);
        paint.setColor(2Yu.A0F(context, R.attr.forwardingAndReplyShortcutIconBackgroundColor));
        paint2.setAntiAlias(true);
        paint2.setColor(2Yu.A0F(context, R.attr.forwardingAndReplyShortcutIconBackgroundColor));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(resources.getDimension(R.dimen.abc_control_corner_material));
        this.A01 = resources.getDimension(R.dimen.ad4ad_button_bottom_margin);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.avatarStartSpacing, R.attr.containerMarginEnd});
        0qQ.A07(obtainStyledAttributes);
        this.A05 = obtainStyledAttributes.getDimension(0, 0.0f);
        this.A06 = obtainStyledAttributes.getDimension(1, 0.0f);
        this.A07 = resources.getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding) / 2.0f;
        this.A03 = resources.getDimension(R.dimen.account_discovery_bottom_gap);
        this.A02 = resources.getDimension(R.dimen.abc_dropdownitem_icon_width);
        this.A0A = 0mk.A02(context);
    }

    private final Drawable A00(Integer num) {
        ColorFilter porterDuffColorFilter;
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable;
        }
        Context context = this.A08;
        Integer num2 = AnonymousClass05K.A00;
        int i = R.drawable.instagram_reply_pano_outline_24;
        if (num == num2) {
            i = R.drawable.instagram_reply_outline_16;
        }
        Drawable drawable2 = context.getDrawable(i);
        if (drawable2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            int A0F = 2Yu.A0F(context, R.attr.glyphColorPrimary);
            if (i2 >= 29) {
                porterDuffColorFilter = new BlendModeColorFilter(A0F, BlendMode.SRC_IN);
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(A0F, PorterDuff.Mode.SRC_IN);
            }
            drawable2.setColorFilter(porterDuffColorFilter);
        } else {
            drawable2 = null;
        }
        this.A00 = drawable2;
        return drawable2;
    }

    public final void A01(Canvas canvas, Integer num, Integer num2, float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        Drawable drawable;
        float f7;
        float f8 = f2;
        Integer num3 = num;
        0qQ.A0B(num3, 5);
        float f9 = this.A03;
        if (f >= f9) {
            float f10 = f - f9;
            float f11 = this.A02;
            float min = Math.min(f10, f11) / 2.0f;
            Integer num4 = AnonymousClass05K.A00;
            boolean z = this.A0A;
            if (num3 == num4) {
                if (z) {
                    f7 = this.A06;
                } else {
                    f7 = this.A05;
                }
                f6 = f3 + f7 + min;
            } else {
                if (z) {
                    f5 = this.A05;
                } else {
                    f5 = this.A06;
                }
                f6 = (f4 - f5) - min;
            }
            float min2 = Math.min(f10 / f11, 1.0f);
            int i = (int) (255.0f * min2);
            Canvas canvas2 = canvas;
            Integer num5 = num2;
            if (min2 == 1.0f) {
                canvas2.drawCircle(f6, f8, this.A01, this.A09);
                drawable = A00(num5);
                if (drawable != null) {
                    float f12 = this.A07;
                    drawable.setBounds((int) (f6 - f12), (int) (f2 - f12), (int) (f6 + f12), (int) (f12 + f2));
                    drawable.setAlpha(i);
                }
                Paint paint = this.A04;
                paint.setAlpha(i);
                float f13 = this.A01;
                canvas2.drawArc(new RectF(f6 - f13, f2 - f13, f6 + f13, f2 + f13), 270.0f, 360.0f * min2, false, paint);
            }
            drawable = new ScaleDrawable(A00(num5), 17, min2, min2).getDrawable();
            if (drawable != null) {
                drawable.setAlpha(i);
                float f14 = this.A07 * min2;
                drawable.setBounds((int) (f6 - f14), (int) (f2 - f14), (int) (f6 + f14), (int) (f14 + f2));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            drawable.draw(canvas2);
            Paint paint2 = this.A04;
            paint2.setAlpha(i);
            float f132 = this.A01;
            canvas2.drawArc(new RectF(f6 - f132, f2 - f132, f6 + f132, f2 + f132), 270.0f, 360.0f * min2, false, paint2);
        }
    }
}
