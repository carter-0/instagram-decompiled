package X;

import android.media.ImageReader;
import android.os.Build;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* renamed from: X.9Qb  reason: invalid class name and case insensitive filesystem */
public final class C378509Qb implements SurfaceHolder.Callback {
    public boolean A00;
    public final /* synthetic */ SurfaceView A01;
    public final /* synthetic */ AnonymousClass80G A02;

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        0qQ.A0B(surfaceHolder, 0);
        AnonymousClass80G r2 = this.A02;
        r2.A03 = i2;
        r2.A02 = i3;
        if (this.A00) {
            this.A00 = false;
        } else if (Build.VERSION.SDK_INT >= 34) {
            surfaceDestroyed(surfaceHolder);
        } else {
            r2.A0E.DpU(i2, i3);
            return;
        }
        AnonymousClass8KF r1 = r2.A0E;
        Surface surface = surfaceHolder.getSurface();
        0qQ.A07(surface);
        r1.DpX(surface, i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.A00 = true;
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Display display;
        this.A00 = false;
        AnonymousClass80G r3 = this.A02;
        r3.A0E.Dpb();
        if (Build.VERSION.SDK_INT >= 34) {
            SurfaceControl A002 = r3.A0B;
            if (A002 != null) {
                new SurfaceControl.Transaction().reparent(A002, (SurfaceControl) null).setBufferSize(A002, 0, 0).apply();
                A002.release();
            }
            r3.A0B = null;
            ImageReader imageReader = r3.A05;
            if (imageReader != null) {
                imageReader.close();
            }
            r3.A05 = null;
            if (r3.A0A && (display = this.A01.getDisplay()) != null) {
                display.unregisterHdrSdrRatioChangedListener(r3.A0F);
            }
        }
        r3.A06 = null;
    }

    public C378509Qb(SurfaceView surfaceView, AnonymousClass80G r2) {
        this.A02 = r2;
        this.A01 = surfaceView;
    }
}
