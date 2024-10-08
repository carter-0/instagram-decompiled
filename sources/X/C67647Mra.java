package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.Mra  reason: case insensitive filesystem */
public final class C67647Mra extends Drawable {
    public int A00;
    public Paint A01;
    public RectF A02;
    public int A03 = -1;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final C306386Ly A0B;
    public final C306386Ly A0C;
    public final Context A0D;
    public final Resources A0E;
    public final String A0F;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        A00();
        canvas.save();
        Rect A0X = AnonymousClass7TE.A0X(this);
        canvas.translate((float) A0X.left, (float) A0X.top);
        RectF rectF = this.A02;
        float f = (float) this.A04;
        Paint paint = this.A01;
        if (paint == null) {
            0qQ.A0F("backgroundPaint");
            throw AnonymousClass00P.createAndThrow();
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.save();
        float f2 = (float) (this.A06 + this.A07 + this.A08);
        int i = this.A05;
        C306386Ly r4 = this.A0B;
        int i2 = r4.A06;
        int i3 = this.A09;
        C306386Ly r2 = this.A0C;
        canvas.translate(f2, ((float) (i - ((i2 + i3) + r2.A06))) / 2.0f);
        r4.draw(canvas);
        canvas.translate(0.0f, (float) (r4.A06 + i3));
        r2.draw(canvas);
        canvas.restore();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
    }

    private final void A00() {
        String str = this.A0F;
        if (0qQ.A0K(str, C273654mx.A00(3156))) {
            this.A0B.A0F(-1);
            this.A0C.A0F(-1);
            this.A03 = this.A0D.getColor(R.color.sticker_subtle_light_background);
        } else if (0qQ.A0K(str, C273654mx.A00(3155))) {
            this.A0B.A0F(-16777216);
            this.A0C.A0F(-7829368);
            this.A03 = -1;
        }
        Paint A0C2 = JTO.A0C();
        A0C2.setColor(this.A03);
        this.A01 = A0C2;
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.A01;
        if (paint == null) {
            0qQ.A0F("backgroundPaint");
            throw AnonymousClass00P.createAndThrow();
        }
        paint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C67647Mra(Context context, String str, int i) {
        boolean A1Z = DbW.A1Z(str);
        this.A0D = context;
        this.A0F = str;
        Resources resources = context.getResources();
        this.A0E = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_button_settings_height);
        this.A05 = dimensionPixelSize;
        this.A04 = resources.getDimensionPixelSize(R.dimen.accent_edge_thickness);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = dimensionPixelSize2;
        int A0C2 = AnonymousClass7TE.A0C(resources);
        this.A06 = A0C2;
        int A0F2 = AnonymousClass7TE.A0F(resources);
        this.A08 = A0F2;
        this.A09 = AnonymousClass7TE.A0H(resources);
        int i2 = A0C2 + dimensionPixelSize2 + A0F2 + A0F2;
        this.A0A = i2;
        int i3 = i - i2;
        C306386Ly r4 = new C306386Ly(context, i3);
        r4.A0A(AnonymousClass7TE.A01(resources, R.dimen.action_bar_item_spacing_right));
        r4.A0J(Typeface.SANS_SERIF, A1Z ? 1 : 0);
        r4.A0G(A1Z, "…");
        this.A0B = r4;
        C306386Ly r2 = new C306386Ly(context, i3);
        r2.A0A(AnonymousClass7TE.A01(resources, R.dimen.action_bar_item_spacing_right));
        r2.A0J(Typeface.SANS_SERIF, 0);
        r2.A0G(A1Z, "…");
        this.A0C = r2;
        int i4 = i2 + dimensionPixelSize2 + r4.A0A;
        this.A00 = i4;
        this.A02 = new RectF(0.0f, 0.0f, (float) i4, (float) dimensionPixelSize);
        A00();
    }

    public final void setAlpha(int i) {
        invalidateSelf();
    }
}
