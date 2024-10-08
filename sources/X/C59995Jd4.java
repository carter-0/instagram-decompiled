package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Jd4  reason: case insensitive filesystem */
public final class C59995Jd4 extends Drawable {
    public int A00;
    public long A01 = 2147483647L;
    public long A02;
    public C62320sa A03;
    public boolean A04 = true;
    public final Movie A05;
    public final int A06;
    public final Paint A07 = AnonymousClass7TE.A0V(2);

    public C59995Jd4(String str, int i) {
        this.A06 = i;
        this.A05 = Movie.decodeFile(str);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        0qQ.A0B(canvas, 0);
        if (!this.A04) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.A02 == 0) {
                this.A02 = uptimeMillis;
            }
            Movie movie = this.A05;
            if (movie == null || (i = movie.duration()) == 0) {
                i = IgNetworkConsentStorage.MAX_ENTRIES;
            }
            this.A00 = (int) ((uptimeMillis - this.A02) % ((long) i));
            A01(canvas);
            invalidateSelf();
            long uptimeMillis2 = SystemClock.uptimeMillis() - this.A02;
            if (movie != null) {
                i2 = movie.duration();
            } else {
                i2 = 0;
            }
            if (uptimeMillis2 >= ((long) i2) * this.A01) {
                this.A04 = true;
                C62320sa r0 = this.A03;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            }
            return;
        }
        A01(canvas);
    }

    @Deprecated
    public final int getOpacity() {
        return -3;
    }

    private final void A01(Canvas canvas) {
        Movie movie = this.A05;
        if (movie != null) {
            movie.setTime(this.A00);
        }
        canvas.save();
        canvas.scale(A00(), A00());
        if (movie != null) {
            movie.draw(canvas, ((float) getBounds().left) / A00(), ((float) getBounds().top) / A00(), this.A07);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        int i = this.A06;
        if (i > 0) {
            return i;
        }
        Movie movie = this.A05;
        if (movie != null) {
            return movie.height();
        }
        return 0;
    }

    public final int getIntrinsicWidth() {
        int i = this.A06;
        if (i > 0) {
            return i;
        }
        Movie movie = this.A05;
        if (movie != null) {
            return movie.width();
        }
        return 0;
    }

    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    private final float A00() {
        int i;
        float intrinsicWidth = (float) getIntrinsicWidth();
        Movie movie = this.A05;
        if (movie != null) {
            i = movie.width();
        } else {
            i = 1;
        }
        return intrinsicWidth / ((float) i);
    }
}
