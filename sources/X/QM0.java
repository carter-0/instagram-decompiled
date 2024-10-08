package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.HandlerThread;
import android.view.Surface;

public final class QM0 extends SIX implements C13815Thi, SurfaceTexture.OnFrameAvailableListener {
    public SurfaceTexture A00;
    public HandlerThread A01;
    public boolean A02;
    public final int A03;
    public final Object A04 = Pxe.A0p();

    public final void AQa(long j) {
    }

    public final void Elt(boolean z) {
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        Object obj = this.A04;
        synchronized (obj) {
            if (this.A02) {
                0wb.A03("VideoOverlayDecoderOutputSurface", "mFrameAvailable already set, frame could be dropped");
            }
            this.A02 = true;
            obj.notifyAll();
        }
    }

    public QM0() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        GLES20.glBindTexture(36197, i);
        C7242Q0o.A01("glBindTexture mTextureID");
        Pxk.A0L();
        C7242Q0o.A01("glTexParameter");
        this.A03 = i;
        SIX.A00("before createSurfaceTexture");
        this.A00 = new SurfaceTexture(i);
        if (EGL14.eglGetError() != 12288) {
            0wb.A03("VideoOverlayDecoderOutputSurface", "EGL Error after creating a SurfaceTexture");
        }
        HandlerThread A0I = Pxf.A0I("output-surface-cb-runner");
        this.A01 = A0I;
        A0I.start();
        Pxh.A16(this, this.A00, this.A01);
        this.A03 = new Surface(this.A00);
    }

    public final void ACz() {
        long currentTimeMillis = System.currentTimeMillis() + 1000;
        Object obj = this.A04;
        synchronized (obj) {
            while (true) {
                if (this.A02) {
                    break;
                }
                try {
                    obj.wait(1000);
                    if (!this.A02 && System.currentTimeMillis() >= currentTimeMillis) {
                        break;
                    }
                } catch (InterruptedException e) {
                    throw C41845B3m.A0j(e);
                }
            }
            this.A02 = false;
        }
        SIX.A00("before updateTexImage");
        SurfaceTexture surfaceTexture = this.A00;
        surfaceTexture.getClass();
        surfaceTexture.updateTexImage();
    }

    public final void release() {
        super.release();
        this.A00 = null;
        HandlerThread handlerThread = this.A01;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.A01 = null;
        }
    }
}
