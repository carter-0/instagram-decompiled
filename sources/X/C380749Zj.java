package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;

/* renamed from: X.9Zj  reason: invalid class name and case insensitive filesystem */
public final class C380749Zj extends C344467ru implements C345547th {
    public final C3496981j A00 = new C3496981j();
    public final Context A01;
    public final TextureView.SurfaceTextureListener A02 = new ALu(this, 0);
    public volatile int A03;
    public volatile int A04;
    public volatile TextureView A05;
    public volatile C346027uT A06;

    public final void A9s(C344337rh r4) {
        0qQ.A0B(r4, 0);
        if (this.A00.A01(r4)) {
            if (this.A05 != null) {
                r4.DZH(this.A05);
            }
            C346027uT r2 = this.A06;
            if (r2 != null) {
                r4.DZB(r2);
                int i = this.A04;
                int i2 = this.A03;
                if (i > 0 && i2 > 0) {
                    r4.DZD(r2, i, i2);
                }
            }
        }
    }

    public final synchronized void Bes(C40091AQw aQw) {
        IllegalStateException illegalStateException;
        TextureView textureView = this.A05;
        if (textureView == null) {
            illegalStateException = AnonymousClass7TE.A0z("Preview view is null");
        } else {
            try {
                Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), textureView.getHeight());
                if (bitmap != null) {
                    aQw.A00(bitmap, (C39669A4j) null);
                } else {
                    aQw.D0x(AnonymousClass7TE.A0z("Failed to acquire bitmap"));
                }
            } catch (Throwable th) {
                illegalStateException = new IllegalStateException("Failed to acquire bitmap", th);
            }
        }
        aQw.D0x(illegalStateException);
        return;
    }

    public final synchronized View Bf9() {
        TextureView textureView;
        textureView = this.A05;
        if (textureView == null) {
            textureView = new TextureView(this.A01);
            textureView.setSurfaceTextureListener(this.A02);
            this.A05 = textureView;
            for (C344337rh DZH : this.A00.A00) {
                DZH.DZH(this.A05);
            }
        }
        return textureView;
    }

    public final void EES(C344337rh r2) {
        0qQ.A0B(r2, 0);
        this.A00.A02(r2);
    }

    public final boolean CKQ() {
        return AnonymousClass7TF.A1V(this.A05);
    }

    public final void Egb(SurfaceTexture surfaceTexture, int i, int i2) {
        throw AnonymousClass7TE.A1B("setPreviewSurface() is not supported");
    }

    public final void Ege(View view) {
        throw AnonymousClass7TE.A1B("setPreviewView() is not supported");
    }

    public C380749Zj(C343837qt r3) {
        this.A00 = r3;
        r3.getClass();
        Context context = r3.getContext();
        0qQ.A07(context);
        this.A01 = context;
    }

    public final View AqN() {
        return Bf9();
    }
}
