package X;

import android.graphics.SurfaceTexture;
import android.os.RemoteException;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;

/* renamed from: X.Aql  reason: case insensitive filesystem */
public final class C41249Aql implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C368618t1 A04;
    public final /* synthetic */ boolean A05;

    public C41249Aql(C368618t1 r1, int i, int i2, int i3, int i4, boolean z) {
        this.A04 = r1;
        this.A03 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A05 = z;
    }

    public final void run() {
        int i;
        C368618t1 r3 = this.A04;
        int i2 = r3.A01;
        int i3 = this.A03;
        if (!(i2 == i3 && r3.A00 == (i = this.A00))) {
            r3.A01 = i3;
            i = this.A00;
            r3.A00 = i;
            if (r3.A0H != null) {
                Surface surface = r3.A09;
                if (surface != null) {
                    surface.release();
                }
                r3.A09 = null;
                SurfaceTexture surfaceTexture = r3.A05;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                r3.A05 = null;
                C346337v0 r0 = r3.A0H;
                if (r0 != null) {
                    r0.A01();
                }
                r3.A0H = null;
            }
            C346327uz r1 = new C346327uz("CameraInput");
            r1.A03 = 36197;
            r1.A04 = r3.A01;
            r1.A02 = r3.A00;
            r1.A00 = 6408;
            r1.A08 = true;
            C346337v0 r02 = new C346337v0(r1);
            r3.A0H = r02;
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(r02.A00);
            r3.A05 = surfaceTexture2;
            surfaceTexture2.setDefaultBufferSize(i3, i);
            SurfaceTexture surfaceTexture3 = r3.A05;
            if (surfaceTexture3 != null) {
                surfaceTexture3.setOnFrameAvailableListener(r3.A0N);
            }
            r3.A09 = new Surface(r3.A05);
        }
        try {
            IAREngineServiceCallback iAREngineServiceCallback = r3.A0J;
            if (iAREngineServiceCallback != null) {
                iAREngineServiceCallback.EZu(r3.A09, i3, i);
            }
        } catch (RemoteException e) {
            0KC.A05(C368618t1.class, "SetInputSurface failed: ", e);
            r3.stopSelf();
        }
        AREngineController aREngineController = r3.A0C;
        if (aREngineController != null) {
            aREngineController.setupImageSourceFacet(i3, i, this.A02, this.A01, this.A05);
        }
    }
}
