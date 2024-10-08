package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.7pQ  reason: invalid class name and case insensitive filesystem */
public final class C342947pQ implements C340467lJ {
    public int A00;
    public int A01;
    public C340547lR A02;
    public C340337l6 A03;
    public int A04;
    public int A05;
    public TextureView A06;
    public boolean A07 = true;
    public final TextureView.SurfaceTextureListener A08 = new C342967pS(this);
    public final View.OnAttachStateChangeListener A09 = new C342957pR(this);

    public final void Bet(AnonymousClass8GD r1, int i, int i2) {
    }

    public final Bitmap Bex() {
        try {
            Bitmap bitmap = this.A06.getBitmap();
            if (bitmap == null) {
                return null;
            }
            if (this.A02.A0L == C340277l0.CAMERA1 || !this.A07) {
                return bitmap;
            }
            int width = getWidth();
            int height = getHeight();
            Matrix transform = this.A06.getTransform((Matrix) null);
            0fO.A03(bitmap);
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, transform, true);
        } catch (OutOfMemoryError | RuntimeException unused) {
            return null;
        }
    }

    public final int Ajr() {
        return this.A04;
    }

    public final int Ajs() {
        return this.A05;
    }

    public final boolean CPC() {
        TextureView textureView = this.A06;
        if (textureView == null) {
            return false;
        }
        if (textureView.isAvailable()) {
            if (this.A01 == 0 || this.A00 == 0) {
                this.A01 = getWidth();
                this.A00 = getHeight();
                C340547lR r0 = this.A02;
                r0.A0R.A00(r0.A0S).Dh6(this.A06.getSurfaceTexture(), this.A01, this.A00);
            }
            return true;
        }
        this.A06.requestLayout();
        return false;
    }

    public final boolean CVc() {
        if (this.A02.A0G || !this.A06.isAvailable() || !this.A02.A0E || !this.A06.isAttachedToWindow()) {
            return false;
        }
        return true;
    }

    public final void EQY(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }

    public final void Ep8(Matrix matrix) {
        if (this.A07) {
            this.A06.setTransform(matrix);
        }
    }

    public final void EqU(View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            this.A06 = textureView;
            textureView.addOnAttachStateChangeListener(this.A09);
            this.A06.setSurfaceTextureListener(this.A08);
            return;
        }
        throw new IllegalArgumentException("Camera view must be a TextureView");
    }

    public final Context getContext() {
        return this.A06.getContext();
    }

    public final int getHeight() {
        if (this.A06.getHeight() > 0) {
            return this.A06.getHeight();
        }
        return this.A04;
    }

    public final View getView() {
        return this.A06;
    }

    public final int getWidth() {
        if (this.A06.getWidth() > 0) {
            return this.A06.getWidth();
        }
        return this.A05;
    }

    public final void release() {
        TextureView textureView = this.A06;
        if (textureView != null) {
            textureView.removeOnAttachStateChangeListener(this.A09);
            this.A06.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
        }
    }

    public C342947pQ(View view, C340467lJ r3) {
        this.A05 = r3.Ajs();
        this.A04 = r3.Ajr();
        EqU(view);
    }

    public final void EQX(C340547lR r1) {
        this.A02 = r1;
    }

    public final void Eea(C340337l6 r1) {
        this.A03 = r1;
    }

    public final void EpA(boolean z) {
        this.A07 = z;
    }

    public C342947pQ() {
    }
}
