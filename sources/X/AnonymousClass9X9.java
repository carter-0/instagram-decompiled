package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9X9  reason: invalid class name */
public final class AnonymousClass9X9 extends Drawable implements AnonymousClass5MJ, C300645xY {
    public float A00;
    public int A01;
    public int A02;
    public final float A03;
    public final float A04 = 0.67f;
    public final float A05;
    public final int A06;
    public final AnonymousClass82f A07;
    public final C306386Ly A08;
    public final String A09;

    public final /* synthetic */ void EqG() {
    }

    public final int getOpacity() {
        return -3;
    }

    public final C2802350v BzV() {
        return this.A07;
    }

    public final String C4F() {
        return 002.A0R("story-reels-metadata-sticker-", this.A09);
    }

    public final int getDurationInMs() {
        return Math.min(this.A06, 15000);
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass1GB.A01(this.A03);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass1GB.A01(this.A05);
    }

    public final void setAlpha(int i) {
        this.A01 = i;
        this.A08.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter != null) {
            this.A08.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public /* synthetic */ AnonymousClass9X9(Context context, AnonymousClass82f r10) {
        0qQ.A0B(r10, 2);
        this.A07 = r10;
        this.A09 = r10.A0C;
        float f = (float) r10.A02;
        this.A05 = f;
        this.A03 = (float) r10.A01;
        this.A01 = 255;
        Resources resources = context.getResources();
        this.A00 = resources.getDimension(R.dimen.action_bar_item_spacing_right);
        int A092 = AnonymousClass7TE.A09(context);
        int A082 = AnonymousClass7TE.A08(context);
        Typeface A0N = AnonymousClass7TG.A0N(context);
        this.A02 = 0;
        this.A06 = r10.A06;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, (int) f);
        this.A08 = A0s;
        A0s.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
        A0s.A0F(A092);
        A0s.A0I(A0N);
        A0s.A0D(5.0f, 0.0f, 0.0f, A082);
        A0s.A0N = true;
    }

    public final void draw(Canvas canvas) {
        Rect A0L = AnonymousClass7TG.A0L(this, canvas);
        int save = canvas.save();
        float f = this.A04;
        float f2 = 1.0f / f;
        AnonymousClass7TF.A13(canvas, A0L);
        canvas.scale(f2, f2);
        float f3 = this.A05 * f;
        canvas.save();
        C306386Ly r2 = this.A08;
        r2.A0M(1G0.A02((long) (this.A06 - this.A02)));
        r2.setAlpha(this.A01);
        float f4 = f3 - ((float) r2.A0A);
        float f5 = this.A00;
        AnonymousClass7TF.A15(canvas, r2, f4 - f5, f5);
        canvas.restoreToCount(save);
    }

    public final void EXC(int i, int i2) {
        this.A02 = i;
    }
}
