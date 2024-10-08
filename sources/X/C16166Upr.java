package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.Upr  reason: case insensitive filesystem */
public final class C16166Upr extends AnonymousClass9XK implements C300645xY {
    public final Interpolator A00 = new DecelerateInterpolator(2.0f);
    public final C18614Vv7 A01;
    public final U17 A02;

    public final String C4F() {
        return C273654mx.A00(826);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A02.setBounds(rect);
    }

    public C16166Upr(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C19498Wak wak, int i) {
        super(context, musicOverlayStickerModel, wak, AnonymousClass6KJ.LYRICS_KARAOKE, 0.8f);
        this.A01 = new C18614Vv7(wak, 0, 0, 750);
        float A09 = (((float) (0nA.A09(context) * 50)) / 1080.0f) * 1.2f;
        U17 u17 = new U17(wak, A09, (int) (0.25f * A09));
        this.A02 = u17;
        if (u17.A08 != 4) {
            u17.A08 = 4;
            U17.A01(u17);
        }
        Typeface A022 = AnonymousClass0qo.A00(context).A02(0qm.A0z);
        TextPaint textPaint = u17.A0I;
        textPaint.setTypeface(A022);
        textPaint.setFakeBoldText(false);
        u17.A06 = C17039VFn.A00(textPaint);
        u17.invalidateSelf();
        textPaint.setTextSize(A09);
        u17.A06 = C17039VFn.A00(textPaint);
        u17.invalidateSelf();
        u17.A05(i);
        u17.A02 = 0.5f;
        u17.invalidateSelf();
        u17.A03 = 0.85f;
        u17.invalidateSelf();
    }

    public final void A01(Canvas canvas, int i) {
        float f;
        C18614Vv7 vv7 = this.A01;
        vv7.A02(i);
        int i2 = vv7.A01;
        Integer num = vv7.A02;
        if (num != null) {
            if (num == AnonymousClass05K.A01) {
                f = 0.0f;
            } else {
                f = vv7.A00;
                if (0.0f > f || f > 1.0f) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("KaraokeLyricsStickerDrawable: invalid progress ");
                    sb.append(f);
                    sb.append(" for frame time ");
                    sb.append(i);
                    throw new IllegalStateException(AnonymousClass7TF.A0l(" in drawFrame()", sb));
                }
            }
            float interpolation = this.A00.getInterpolation(f);
            U17 u17 = this.A02;
            u17.A04((int) 0mi.A02(interpolation, 0.0f, 1.0f, (float) u17.A03(i2), (float) u17.A03(i2 + 1)));
            u17.draw(canvas);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final int Aox() {
        U17 u17 = this.A02;
        return C13989Tnp.A0D(u17.A0I, u17.A07);
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        AnonymousClass6KJ r4 = this.A09;
        return new Af1(this.A08.A00, this.A01, (C40599Aen) null, r4, Aox());
    }

    public final void ESC(int i) {
        this.A02.A05(i);
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        U17 u17 = this.A02;
        return (u17.A06 * 12) + (u17.A0G * 2);
    }

    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
