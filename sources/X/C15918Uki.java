package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Uki  reason: case insensitive filesystem */
public final class C15918Uki extends AnonymousClass91c {
    public final AccelerateInterpolator A00 = new AccelerateInterpolator(2.0f);
    public final OvershootInterpolator A01 = new OvershootInterpolator(2.0f);
    public final int A02 = Color.alpha(-1);
    public final C360728f3 A03 = C360728f3.BOUNCE_IN;
    public final ArrayList A04 = new ArrayList();

    public final void A0Z(Canvas canvas, Spannable spannable, TextPaint textPaint, 0rN r13, float f, float f2, int i) {
        int A022 = DbW.A02(0, canvas, spannable);
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            int A0W = i % A0W();
            float min = Math.min(((float) A0W()) * 0.13f, 650.0f);
            float max = Math.max(((float) A0W()) - (Math.min(((float) A0W()) * 0.13f, 650.0f) * 2.0f), 0.0f);
            float f3 = (float) A0W;
            float f4 = 1.0f;
            if (f3 <= min) {
                f4 = this.A01.getInterpolation(f3 / min);
            } else if (f3 > max) {
                if (f3 <= max + min) {
                    f4 = this.A00.getInterpolation(1.0f - ((f3 - max) / min));
                } else {
                    f4 = 0.0f;
                }
            }
            int i2 = this.A02;
            int min2 = Math.min(AnonymousClass7TE.A06((float) i2, f4), i2);
            canvas.save();
            float f5 = 0.0f;
            canvas.translate(0.0f, (-(this.A0b.getTextSize() * 0.25f)) / 2.0f);
            float height = ((float) staticLayout.getHeight()) / 2.0f;
            int i3 = C17143VJs.A00[this.A0E.ordinal()];
            if (i3 != 1) {
                f5 = (float) staticLayout.getWidth();
                if (i3 != A022) {
                    f5 /= 2.0f;
                }
            }
            canvas.scale(f4, f4, f5, height);
            C358848bZ r1 = (C358848bZ) C263324Kh.A00(spannable, C358848bZ.class);
            if (r1 != null) {
                r1.A03 = Integer.valueOf(min2);
            }
            Iterator A1G = AnonymousClass7TE.A1G(this.A04);
            while (A1G.hasNext()) {
                C19713WeF weF = (C19713WeF) AnonymousClass7TF.A0a(A1G);
                weF.A01.setAlpha(min2);
                weF.onPreDraw();
                weF.AQG(canvas);
            }
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    public final int getDurationInMs() {
        return 5000;
    }

    public final float A0U() {
        return ((float) this.A0A) * 0.1f;
    }

    public final float A0V() {
        return ((float) this.A06) * 0.1f;
    }

    public final C360728f3 A0X() {
        return this.A03;
    }

    public final void A0Y() {
        if (!TextUtils.isEmpty(this.A0F)) {
            Iterator A1G = AnonymousClass7TE.A1G(this.A04);
            while (A1G.hasNext()) {
                ((C19713WeF) AnonymousClass7TF.A0a(A1G)).A01.setAlpha(this.A02);
            }
            Spannable spannable = this.A0F;
            0qQ.A07(spannable);
            C358848bZ r1 = (C358848bZ) C263324Kh.A00(spannable, C358848bZ.class);
            if (r1 != null) {
                r1.A03 = Integer.valueOf(this.A02);
            }
        }
    }

    public C15918Uki(Context context, int i) {
        super(context, i);
    }

    public final void A0R() {
        super.A0R();
        ArrayList arrayList = this.A04;
        arrayList.clear();
        if (!TextUtils.isEmpty(this.A0F)) {
            Spannable spannable = this.A0F;
            0qQ.A07(spannable);
            018.A18(arrayList, C263324Kh.A06(spannable, C19713WeF.class));
        }
    }
}
