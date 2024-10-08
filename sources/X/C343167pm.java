package X;

import android.media.ImageReader;
import android.os.Handler;
import android.view.Surface;

/* renamed from: X.7pm  reason: invalid class name and case insensitive filesystem */
public final class C343167pm implements C343177pn {
    public ImageReader A00;
    public final int A01;
    public final ImageReader.OnImageAvailableListener A02 = new C378589Qk(this);
    public volatile C364098kr A03;

    public final int BG6() {
        return this.A01;
    }

    public final void CMQ(int i, int i2, int i3) {
        this.A00 = ImageReader.newInstance(i, i2, this.A01, 1);
    }

    public final void E3x(Handler handler, C364098kr r4) {
        if (this.A00 != null) {
            this.A03 = r4;
            this.A00.setOnImageAvailableListener(this.A02, handler);
        }
    }

    public final Surface getSurface() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            return imageReader.getSurface();
        }
        return null;
    }

    public final boolean isEnabled() {
        if (this.A00 != null) {
            return true;
        }
        return false;
    }

    public final void release() {
        ImageReader imageReader = this.A00;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
            this.A00.close();
            this.A00 = null;
        }
        this.A03 = null;
    }

    public C343167pm(int i) {
        this.A01 = i;
    }
}
