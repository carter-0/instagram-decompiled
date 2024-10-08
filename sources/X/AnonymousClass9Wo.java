package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9Wo  reason: invalid class name */
public final class AnonymousClass9Wo extends Drawable implements Drawable.Callback, AnonymousClass1MK {
    public int A00;
    public Paint A01;
    public C59985Jcu A02;
    public float A03;
    public float A04;
    public long A05;
    public final float A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final C306386Ly A0D;
    public final C306386Ly A0E;
    public final boolean A0F;
    public final long A0G;
    public final Context A0H;
    public final Drawable A0I;
    public final Integer A0J;
    public final boolean A0K;

    public AnonymousClass9Wo(Context context, UserSession userSession, ImageUrl imageUrl, Integer num, String str, String str2, float f, int i, boolean z, boolean z2) {
        int i2;
        Drawable drawable;
        Bitmap bitmap;
        C262364Dk r6;
        C262364Dk r5;
        0qQ.A0B(context, 1);
        String str3 = str;
        AnonymousClass7TF.A1C(imageUrl, 2, str3);
        0qQ.A0B(userSession, 7);
        this.A0H = context;
        this.A0K = z2;
        this.A06 = f;
        this.A0J = num;
        0Tu r4 = 0Tu.A05;
        boolean A062 = 182.A06(r4, userSession, 36325201302926040L);
        this.A0F = A062;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.vinyl_sticker_size);
        this.A0A = dimensionPixelSize;
        if (A062) {
            i2 = AnonymousClass7TG.A03(context);
        } else {
            i2 = 0;
        }
        this.A0B = i2;
        this.A07 = context.getResources().getDimensionPixelSize(A062 ? R.dimen.ad_tag_max_width : R.dimen.vinyl_sticker_album_art_size);
        this.A08 = context.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A09 = AnonymousClass7TE.A0H(context.getResources());
        this.A0G = TimeUnit.SECONDS.toMillis((long) 182.A00(r4, userSession, 37169626232324601L));
        Drawable A002 = AnonymousClass2dd.A00(context.getResources(), A062 ? R.drawable.vinyl_music_sticker_vinyl_music_sticker_shine : R.drawable.vinyl_music_sticker_vinyl_music_dark_placeholder);
        A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        this.A0C = A002;
        if (A062) {
            drawable = AnonymousClass2dd.A00(context.getResources(), R.drawable.vinyl_music_sticker_vinyl_texture_full_opacity);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        } else {
            drawable = null;
        }
        this.A0I = drawable;
        this.A04 = 1.0f;
        this.A00 = -1;
        this.A05 = -1;
        if ((A002 instanceof C262364Dk) && (r5 = (C262364Dk) A002) != null) {
            r5.A01(new AZK(this, 6));
        }
        if ((drawable instanceof C262364Dk) && (r6 = (C262364Dk) drawable) != null) {
            r6.A01(new AZK(this, 7));
        }
        C306386Ly A0s = AnonymousClass7TE.A0s(context, dimensionPixelSize);
        this.A0E = A0s;
        A0s.setCallback(this);
        A0s.A0M(str3);
        AnonymousClass7TF.A11(context.getResources(), A0s, R.dimen.action_bar_item_spacing_right);
        int i3 = i;
        A0s.A0F(i3);
        Typeface typeface = Typeface.SANS_SERIF;
        A0s.A0J(typeface, 1);
        A0s.A0G(2, "…");
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, dimensionPixelSize);
        this.A0D = A0s2;
        A0s2.setCallback(this);
        A0s2.A0M(str2);
        AnonymousClass7TF.A11(context.getResources(), A0s2, R.dimen.action_bar_item_spacing_right);
        A0s2.A0F(i3);
        A0s2.A0J(typeface, 0);
        A0s2.A0G(2, "…");
        if (!z || 0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            1OO A0J2 = 1NK.A00().A0J(imageUrl, (String) null);
            A0J2.A02(this);
            A0J2.A01();
            return;
        }
        AnonymousClass3LX A0K2 = 1NK.A00().A0K(userSession, new SimpleImageUrl(imageUrl), "javaClass");
        if (A0K2 == null || (bitmap = A0K2.A01) == null) {
            A01();
            return;
        }
        int i4 = this.A07;
        this.A02 = A13.A00(bitmap, (Integer) null, (float) i4, i4, i4);
        invalidateSelf();
    }

    public final void CyF(C226952iF r5, AnonymousClass3LX r6) {
        0qQ.A0B(r6, 1);
        Bitmap bitmap = r6.A01;
        if (bitmap != null) {
            int i = this.A07;
            this.A02 = A13.A00(bitmap, (Integer) null, (float) i, i, i);
            invalidateSelf();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private final float A00() {
        long j;
        if (!this.A0K) {
            return 0.0f;
        }
        int i = this.A00;
        if (i == -1) {
            j = SystemClock.elapsedRealtime();
        } else {
            j = (long) i;
        }
        long j2 = j - this.A05;
        this.A05 = j;
        float f = this.A03 + ((((float) j2) / ((float) this.A0G)) * 360.0f);
        this.A03 = f;
        return f;
    }

    private final void A01() {
        Drawable drawable = this.A0H.getDrawable(R.drawable.default_album_art_icon);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        0qQ.A07(bitmap);
        int i = this.A07;
        this.A02 = A13.A00(bitmap, (Integer) null, (float) i, i, i);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        int i;
        float f;
        Canvas canvas2 = canvas;
        AnonymousClass7TF.A12(canvas2);
        float f2 = this.A04;
        canvas2.scale(f2, f2);
        if (this.A0F) {
            this.A0C.draw(canvas2);
            canvas2.save();
            float A002 = A00();
            i = this.A0A;
            float f3 = (float) i;
            f = f3 / 2.0f;
            canvas2.rotate(A002, f, f);
            Paint paint = this.A01;
            if (paint != null) {
                int i2 = this.A0B;
                float f4 = (float) i2;
                float f5 = (float) (i - i2);
                float f6 = (f3 - (f4 * 2.0f)) / 2.0f;
                canvas2.drawRoundRect(f4, f4, f5, f5, f6, f6, paint);
            }
        } else {
            canvas2.save();
            i = this.A0A;
            f = ((float) i) / 2.0f;
            canvas2.rotate(A00() + this.A06, f, f);
            this.A0C.draw(canvas2);
        }
        canvas2.restore();
        if (this.A02 != null) {
            canvas2.save();
            canvas2.rotate(A00(), f, f);
            float f7 = f - (((float) this.A07) / 2.0f);
            canvas2.translate(f7, f7);
            C59985Jcu jcu = this.A02;
            if (jcu == null) {
                0qQ.A0F("albumArtDrawable");
                throw AnonymousClass00P.createAndThrow();
            } else {
                jcu.draw(canvas2);
                canvas2.restore();
            }
        }
        if (this.A0J != AnonymousClass05K.A01) {
            canvas2.save();
            C306386Ly r4 = this.A0E;
            int i3 = i + this.A08;
            AnonymousClass7TF.A15(canvas2, r4, ((float) (i - r4.A0A)) / 2.0f, (float) i3);
            canvas2.save();
            C306386Ly r2 = this.A0D;
            AnonymousClass7TF.A15(canvas2, r2, ((float) (i - r2.A0A)) / 2.0f, (float) (i3 + r4.A06 + this.A09));
        }
        canvas2.restore();
        if (this.A0K) {
            invalidateSelf();
        }
    }

    public final int getIntrinsicHeight() {
        Integer num = this.A0J;
        Integer num2 = AnonymousClass05K.A01;
        int i = this.A0A;
        if (num != num2) {
            return i + this.A0E.A06 + this.A0D.A06 + this.A09 + this.A08;
        }
        return i;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A04 = Math.min(((float) (i3 - i)) / ((float) this.A0A), ((float) (i4 - i2)) / ((float) getIntrinsicHeight()));
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
        A01();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
