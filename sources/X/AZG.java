package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.ViewGroup;

public final class AZG implements B2X {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public SurfaceTexture A04;
    public TextureView A05;
    public AnonymousClass8HZ A06;
    public boolean A07;
    public final Context A08;
    public final C355308Pm A09;

    public final void DAp(Canvas canvas, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        SurfaceTexture surfaceTexture;
        AnonymousClass8HZ r3;
        int i3;
        int i4;
        TextureView textureView = this.A05;
        if (textureView == null) {
            textureView = new TextureView(this.A08);
            textureView.setOutlineProvider(new U3s(this, 4));
            textureView.setClipToOutline(true);
            this.A09.addView(textureView, 0);
            textureView.setTranslationX(-this.A00);
            textureView.setSurfaceTextureListener(new ALu(this, 3));
            textureView.setVisibility(8);
            this.A05 = textureView;
        }
        textureView.setVisibility(0);
        TextureView textureView2 = this.A05;
        if (textureView2 == null || (layoutParams = textureView2.getLayoutParams()) == null) {
            throw AnonymousClass7TE.A0y();
        } else if (layoutParams.height != i2 || layoutParams.width != i) {
            layoutParams.width = i;
            layoutParams.height = i2;
            TextureView textureView3 = this.A05;
            if (textureView3 != null) {
                textureView3.setLayoutParams(layoutParams);
            }
            this.A07 = true;
        } else if (this.A07 && (surfaceTexture = this.A04) != null && (r3 = this.A06) != null && (i3 = this.A03) != 0 && (i4 = this.A02) != 0) {
            this.A07 = false;
            r3.EFD(surfaceTexture, this.A01, i3, i4);
        }
    }

    public final void FLw(int i, int i2, int i3) {
        int i4;
        int i5;
        this.A01 = i;
        SurfaceTexture surfaceTexture = this.A04;
        if (surfaceTexture != null) {
            AnonymousClass8HZ r3 = this.A06;
            if (r3 != null && (i4 = this.A03) != 0 && (i5 = this.A02) != 0) {
                this.A07 = false;
                r3.EFD(surfaceTexture, i, i4, i5);
                return;
            }
            return;
        }
        this.A07 = true;
    }

    public final void reset() {
        TextureView textureView = this.A05;
        if (textureView != null) {
            this.A09.removeView(textureView);
            this.A05 = null;
        }
    }

    public AZG(Context context, C355308Pm r2) {
        this.A08 = context;
        this.A09 = r2;
    }
}
