package X;

import android.view.Surface;
import com.facebook.mediastreaming.opt.common.SurfaceHolder;
import com.facebook.mediastreaming.opt.source.SurfaceTextureHolder;
import com.facebook.mediastreaming.opt.source.video.AndroidVideoInput;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class WIZ implements AndroidVideoInput {
    public final List A00 = Pxf.A0v();
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    public final boolean enableCaptureRenderer() {
        return false;
    }

    public final C20826X0a getFrameSchedulerFactory() {
        return null;
    }

    public final void setOutputSurface(SurfaceTextureHolder surfaceTextureHolder, boolean z) {
    }

    public final void pauseOutputSurface(int i) {
        WKS wks = (WKS) C51968G9o.A10(this.A01, i);
        if (wks != null) {
            wks.A00();
        }
    }

    public final void removeErrorListener(Y9L y9l) {
        this.A00.remove(y9l);
    }

    public final void resumeOutputSurface(int i) {
        WKS wks = (WKS) C51968G9o.A10(this.A01, i);
        if (wks != null) {
            wks.A06 = false;
        }
    }

    public final void setErrorListener(Y9L y9l) {
        List list = this.A00;
        0qQ.A06(list);
        synchronized (list) {
            if (y9l != null) {
                JTR.A1T(y9l, list);
            }
        }
    }

    public final void setOutputSurface(int i, SurfaceHolder surfaceHolder) {
        VU4 vu4;
        C340397lC r0;
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i);
        WKS wks = (WKS) map.get(valueOf);
        if (surfaceHolder == null || surfaceHolder.getSurface() == null) {
            if (wks != null) {
                wks.A00();
                Surface surface = wks.A05;
                if (surface != null) {
                    surface.release();
                }
                wks.A00 = -1;
                wks.A01 = -1;
                return;
            } else if (surfaceHolder == null) {
                return;
            }
        }
        if (surfaceHolder.getSurface() != null) {
            Surface surface2 = surfaceHolder.getSurface();
            int width = surfaceHolder.getWidth();
            int height = surfaceHolder.getHeight();
            if (wks != null) {
                Surface surface3 = wks.A05;
                if (surface3 != null) {
                    surface3.release();
                }
                wks.A00 = -1;
                wks.A01 = -1;
                wks.A05 = surface2;
                wks.A01 = width;
                wks.A00 = height;
                C17295VPw vPw = wks.A02;
                if (!(vPw == null || (vu4 = vPw.A00.A00) == null)) {
                    W1D w1d = vu4.A01;
                    Map map2 = w1d.A0A;
                    C21028XAh xAh = vu4.A00;
                    AnonymousClass8KU r1 = (AnonymousClass8KU) map2.get(xAh);
                    if (!(r1 == null || (r0 = w1d.A08.A04.A04) == null)) {
                        r0.EEM(r1);
                    }
                    if (w1d.A06) {
                        W1D.A00(xAh, w1d);
                    }
                }
                if (wks.A06) {
                    wks.A06 = false;
                    return;
                }
                return;
            }
            map.put(valueOf, new WKS(surface2, width, height));
            Iterator it = this.A00.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void startRenderingToOutput() {
        Map map = this.A01;
        0qQ.A06(map);
        synchronized (map) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                ((WKS) A0v.next()).A06 = false;
            }
        }
    }

    public final void stopRenderingToOutput() {
        Map map = this.A01;
        0qQ.A06(map);
        synchronized (map) {
            Iterator A0v = AnonymousClass7TF.A0v(map);
            while (A0v.hasNext()) {
                ((WKS) A0v.next()).A00();
            }
        }
    }
}
