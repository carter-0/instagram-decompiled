package com.instagram.ui.widget.textureview;

import X.17k;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C14692U1r;
import X.C18518VtI;
import X.Pxe;
import X.VXF;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

public class CircularTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public float A00;
    public float A01;
    public Rect A02;
    public TextureView.SurfaceTextureListener A03;
    public C18518VtI A04;
    public boolean A05;

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C18518VtI vtI = this.A04;
        if (vtI != null) {
            C14692U1r u1r = vtI.A06;
            u1r.sendMessageAtFrontOfQueue(u1r.obtainMessage(3));
            this.A04 = null;
        }
        this.A05 = false;
        return true;
    }

    public void setIsMirrored(boolean z) {
        C18518VtI vtI = this.A04;
        vtI.getClass();
        vtI.A0C = z;
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.A03 = surfaceTextureListener;
    }

    public CircularTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = false;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        setOpaque(false);
    }

    private void A00(SurfaceTexture surfaceTexture, int i, int i2) {
        17k.A0E(AnonymousClass7TF.A1S(i, i2));
        C18518VtI vtI = new C18518VtI();
        this.A04 = vtI;
        vtI.A05 = AnonymousClass05K.A0Y;
        vtI.A09 = i;
        vtI.A08 = i2;
        vtI.A0A = new Rect(0, 0, vtI.A09, vtI.A08);
        this.A04.A0B = new VXF(this, i, i2);
        C18518VtI vtI2 = this.A04;
        Pxe.A1N(vtI2.A06, new Surface(surfaceTexture), 1);
    }

    public final boolean A01() {
        C18518VtI vtI;
        if (!super.isAvailable() || !this.A05 || (vtI = this.A04) == null || vtI.A01 == null) {
            return false;
        }
        return true;
    }

    public SurfaceTexture getSurfaceTexture() {
        if (!A01()) {
            return null;
        }
        C18518VtI vtI = this.A04;
        vtI.getClass();
        return vtI.A01;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-769432212);
        super.onAttachedToWindow();
        if (super.isAvailable()) {
            SurfaceTexture surfaceTexture = super.getSurfaceTexture();
            surfaceTexture.getClass();
            A00(surfaceTexture, super.getWidth(), super.getHeight());
        } else {
            super.setSurfaceTextureListener(this);
        }
        AnonymousClass0fD.A0D(1823821905, A06);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        A00(surfaceTexture, i, i2);
    }

    public CircularTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularTextureView(Context context) {
        this(context, (AttributeSet) null);
    }
}
