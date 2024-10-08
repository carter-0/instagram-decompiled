package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.HandlerThread;
import android.view.TextureView;
import com.facebook.live.livestreaming.opengl.EglCore;
import com.instagram.ui.widget.textureview.CircularTextureView;

/* renamed from: X.VtI  reason: case insensitive filesystem */
public final class C18518VtI {
    public int A00;
    public SurfaceTexture A01;
    public EglCore A02;
    public C17313VQs A03;
    public C17974VjC A04;
    public Integer A05 = AnonymousClass05K.A01;
    public final C14692U1r A06;
    public final float[] A07 = new float[16];
    public volatile int A08;
    public volatile int A09;
    public volatile Rect A0A = new Rect();
    public volatile VXF A0B;
    public volatile boolean A0C = false;

    public static void A00(C18518VtI vtI) {
        VXF vxf = vtI.A0B;
        if (vxf != null) {
            CircularTextureView circularTextureView = vxf.A02;
            int i = vxf.A00;
            int i2 = vxf.A01;
            circularTextureView.A05 = false;
            TextureView.SurfaceTextureListener surfaceTextureListener = circularTextureView.A03;
            if (surfaceTextureListener != null && circularTextureView.A01()) {
                SurfaceTexture surfaceTexture = circularTextureView.getSurfaceTexture();
                surfaceTexture.getClass();
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
        C17974VjC vjC = vtI.A04;
        if (vjC != null) {
            vjC.A01();
            vtI.A04 = null;
        }
        SurfaceTexture surfaceTexture2 = vtI.A01;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            vtI.A01 = null;
        }
        C17313VQs vQs = vtI.A03;
        if (vQs != null) {
            if (vQs.A00 != null) {
                vQs.A00 = null;
            }
            vtI.A03 = null;
        }
        EglCore eglCore = vtI.A02;
        if (eglCore != null) {
            eglCore.A00();
            vtI.A02 = null;
        }
    }

    public C18518VtI() {
        HandlerThread A0I = Pxf.A0I("VideoRendererThread");
        A0I.start();
        this.A06 = new C14692U1r(A0I.getLooper(), this);
    }
}
