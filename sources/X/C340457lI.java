package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.PixelCopy;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* renamed from: X.7lI  reason: invalid class name and case insensitive filesystem */
public final class C340457lI implements C340467lJ {
    public SurfaceView A00;
    public C340547lR A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05;
    public final SurfaceHolder.Callback A06 = new C340487lL(this);
    public final View.OnAttachStateChangeListener A07 = new C340477lK(this);

    public final Bitmap Bex() {
        return null;
    }

    public final void Eea(C340337l6 r1) {
    }

    public final void Ep8(Matrix matrix) {
    }

    public final void EpA(boolean z) {
    }

    public final void release() {
        this.A02 = false;
        SurfaceView surfaceView = this.A00;
        if (surfaceView != null) {
            surfaceView.removeOnAttachStateChangeListener(this.A07);
            this.A00.getHolder().removeCallback(this.A06);
        }
    }

    public final int Ajr() {
        return this.A04;
    }

    public final int Ajs() {
        return this.A05;
    }

    public final void Bet(AnonymousClass8GD r5, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            try {
                i = this.A00.getWidth();
                i2 = this.A00.getHeight();
            } catch (Throwable th) {
                r5.A01(new IllegalStateException("Failed to acquire bitmap", th));
                return;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView = this.A00;
        PixelCopy.request(surfaceView, createBitmap, new C364058kn(createBitmap, r5), surfaceView.getHandler());
    }

    public final boolean CPC() {
        SurfaceView surfaceView = this.A00;
        if (surfaceView != null) {
            this.A02 = true;
            SurfaceHolder holder = surfaceView.getHolder();
            if (holder.getSurface() != null && holder.getSurface().isValid()) {
                this.A06.surfaceCreated(holder);
            }
        }
        return false;
    }

    public final boolean CVc() {
        C340547lR r1 = this.A01;
        if (r1.A0G || !this.A03 || !r1.A0E || !this.A00.isAttachedToWindow()) {
            return false;
        }
        return true;
    }

    public final void EQY(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    public final void EqU(View view) {
        if (view instanceof SurfaceView) {
            this.A02 = false;
            SurfaceView surfaceView = (SurfaceView) view;
            this.A00 = surfaceView;
            surfaceView.addOnAttachStateChangeListener(this.A07);
            this.A00.getHolder().addCallback(this.A06);
            return;
        }
        throw new IllegalArgumentException("Camera view must be a SurfaceView");
    }

    public final Context getContext() {
        return this.A00.getContext();
    }

    public final int getHeight() {
        if (this.A00.getHeight() > 0) {
            return this.A00.getHeight();
        }
        return this.A04;
    }

    public final View getView() {
        return this.A00;
    }

    public final int getWidth() {
        if (this.A00.getWidth() > 0) {
            return this.A00.getWidth();
        }
        return this.A05;
    }

    public C340457lI(View view, C340467lJ r3) {
        this.A05 = r3.Ajs();
        this.A04 = r3.Ajr();
        EqU(view);
    }

    public final void EQX(C340547lR r1) {
        this.A01 = r1;
    }

    public C340457lI() {
    }
}
