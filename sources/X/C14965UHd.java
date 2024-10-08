package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UHd  reason: case insensitive filesystem */
public final class C14965UHd extends AnonymousClass8KT implements C365188mg, C365198mh {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public RectF A04;
    public SurfaceTexture A05;
    public VLI A06;
    public C346337v0 A07;
    public WeakReference A08 = new WeakReference((Object) null);
    public boolean A09 = false;
    public Surface A0A;
    public final C16911VAo A0B;
    public final ThreadPoolExecutor A0C;

    public C14965UHd(C16911VAo vAo) {
        this.A0B = vAo;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 3, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.A0C = threadPoolExecutor;
        threadPoolExecutor.prestartCoreThread();
    }

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "DefaultPhotoOutput";
    }

    public final int Bpb() {
        return 1;
    }

    public final C344907sc Blr() {
        return new AVZ();
    }

    public final C344907sc Bls() {
        return new C40186AVa();
    }

    public final AnonymousClass8KV CED() {
        return AnonymousClass8KV.CAPTURE_IMAGE;
    }

    public final void CMW(C365228mk r4, C365248mm r5) {
        int i;
        C346337v0 r0 = new C346337v0(new C346327uz("DefaultPhotoOutput"));
        this.A07 = r0;
        SurfaceTexture surfaceTexture = new SurfaceTexture(r0.A00);
        this.A05 = surfaceTexture;
        Surface surface = new Surface(surfaceTexture);
        this.A0A = surface;
        r4.EzB(surface, this);
        int i2 = this.A02;
        if (i2 > 0 && (i = this.A01) > 0) {
            this.A03 = i2;
            this.A00 = i;
            SurfaceTexture surfaceTexture2 = this.A05;
            if (surfaceTexture2 != null) {
                surfaceTexture2.setDefaultBufferSize(i2, i);
            }
            C346337v0 r2 = this.A07;
            if (r2 != null) {
                r2.A00(this.A03, this.A00);
            }
            this.A09 = true;
        }
        this.A05.setDefaultBufferSize(this.A03, this.A00);
    }

    public final void Dpd() {
        int i;
        int i2;
        if (this.A09 || (i = this.A02) <= 0 || (i2 = this.A01) <= 0) {
            VLI vli = this.A06;
            if (vli != null) {
                this.A06 = null;
                RectF rectF = this.A04;
                if (rectF == null) {
                    rectF = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
                    this.A04 = rectF;
                }
                float f = rectF.left;
                float f2 = (float) this.A03;
                int i3 = (int) (f * f2);
                float f3 = rectF.top;
                float f4 = (float) this.A00;
                Rect rect = new Rect(i3, (int) (f3 * f4), (int) (rectF.right * f2), (int) (rectF.bottom * f4));
                int width = rect.width();
                int height = rect.height();
                try {
                    Buffer buffer = (Buffer) this.A08.get();
                    if (buffer == null) {
                        buffer = ByteBuffer.allocateDirect(rect.width() * rect.height() * 4);
                        this.A08 = new WeakReference(buffer);
                    }
                    buffer.rewind();
                    GLES20.glReadPixels(rect.left, rect.top, rect.width(), rect.height(), 6408, 5121, buffer);
                    C345907uH.A02("glReadPixels", new Object[0]);
                    this.A0C.execute(new C20332WpV(vli, this, buffer, width, height));
                } catch (Throwable th) {
                    0KC.A0F("PhotoOutput", "Unable to create ByteBuffer", th);
                    vli.A00.A00(new NullPointerException("Failed to get pixels from Surface"));
                }
            }
        } else {
            this.A03 = i;
            this.A00 = i2;
            SurfaceTexture surfaceTexture = this.A05;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(i, i2);
            }
            C346337v0 r2 = this.A07;
            if (r2 != null) {
                r2.A00(this.A03, this.A00);
            }
            this.A09 = true;
        }
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A03;
    }

    public final void release() {
        Surface surface = this.A0A;
        if (surface != null) {
            surface.release();
            this.A0A = null;
        }
        SurfaceTexture surfaceTexture = this.A05;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.A05 = null;
        }
        C346337v0 r0 = this.A07;
        if (r0 != null) {
            r0.A01();
            this.A07 = null;
        }
        super.release();
    }

    public final void destroy() {
        release();
    }
}
