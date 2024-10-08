package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.TextureView;

/* renamed from: X.6kZ  reason: invalid class name and case insensitive filesystem */
public final class C315796kZ implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01;
    public SurfaceTexture A02;
    public C315826kc A03;
    public C8836RBw A04;
    public C315766kW A05 = new C315816kb();
    public C315746kT A06;
    public Integer A07;
    public Integer A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Context A0I;
    public final TextureView.SurfaceTextureListener A0J;
    public final C315896kl A0K;
    public final C315786kY A0L;
    public final AnonymousClass0eM A0M = AnonymousClass0eN.A01(C315806ka.A00);
    public final float[] A0N = {0.0f, 0.0f, 0.0f, 0.0f};

    public final void A00() {
        boolean z;
        SurfaceTexture surfaceTexture = this.A02;
        if (surfaceTexture == null) {
            z = true;
        } else if (this.A04 == null) {
            double d = C8836RBw.A03;
            C8836RBw rBw = new C8836RBw(this.A0I, surfaceTexture, this, new C11247SHh(this.A03), this.A05, this.A01, this.A00);
            this.A04 = rBw;
            rBw.start();
            z = false;
        } else {
            return;
        }
        this.A0F = z;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        0qQ.A0B(surfaceTexture, 0);
        this.A0H = true;
        this.A02 = surfaceTexture;
        if (this.A0F) {
            A00();
            this.A0F = false;
        }
        if (this.A0C) {
            if (this.A02 == null) {
                this.A0C = true;
            } else {
                C8836RBw rBw = this.A04;
                if (rBw != null) {
                    rBw.A01();
                } else {
                    A00();
                }
            }
            this.A0C = false;
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        0qQ.A0B(surfaceTexture, 0);
        this.A0J.onSurfaceTextureUpdated(surfaceTexture);
    }

    public final void A01() {
        C8836RBw rBw = this.A04;
        if (rBw != null) {
            Handler handler = rBw.A02;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
            rBw.A0G = true;
            C8836RBw rBw2 = this.A04;
            if (rBw2 != null) {
                Handler handler2 = rBw2.A02;
                if (handler2 != null) {
                    handler2.sendEmptyMessage(2);
                }
                rBw2.A0G = true;
                this.A04 = null;
            }
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C8836RBw rBw = this.A04;
        if (rBw != null) {
            rBw.A01 = i;
            rBw.A00 = i2;
            Handler handler = rBw.A02;
            if (handler != null) {
                handler.sendEmptyMessage(4);
            }
        }
    }

    public C315796kZ(Context context, TextureView.SurfaceTextureListener surfaceTextureListener, C315786kY r6) {
        this.A0J = surfaceTextureListener;
        this.A0I = context.getApplicationContext();
        this.A03 = new C315826kc(context);
        this.A0L = r6;
        Object value = this.A0M.getValue();
        0qQ.A07(value);
        this.A0K = new C315896kl(context, new C315886kk((AnonymousClass0JP) value, new C315876kj(this)));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A01();
        this.A02 = null;
        return this.A0H;
    }
}
