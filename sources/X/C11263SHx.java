package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SHx  reason: case insensitive filesystem */
public final class C11263SHx {
    public SU1 A00;
    public C10862RzN A01;
    public Q1G A02;
    public C10708Rwm A03;
    public Boolean A04;
    public HashMap A05 = AnonymousClass7TE.A1E();
    public boolean A06;
    public final Context A07;
    public final C7255Q1d A08;
    public final C13725Tfv A09;
    public final SJL A0A;
    public final C13589TdH A0B;
    public final C13590TdI A0C;
    public final C13780Tgv A0D;
    public final C13804ThT A0E;
    public final C10573RuS A0F;
    public final C13598TdQ A0G;
    public final List A0H;
    public final AtomicBoolean A0I;

    public static void A00(C11263SHx sHx, Throwable th, long j) {
        Throwable exc;
        C10708Rwm rwm = sHx.A03;
        if (th instanceof Exception) {
            exc = th;
        } else {
            exc = new Exception(th);
        }
        try {
            C11263SHx sHx2 = (C11263SHx) rwm.A03.A00;
            if (sHx2 != null) {
                sHx2.A01();
            }
        } catch (Exception e) {
            0kD.A09("ClipsDefaultCoverPhotoGenerator", "frameRetriever?.release() failed", e);
        } catch (Throwable th2) {
            rwm.A03.A00 = null;
            throw th2;
        }
        rwm.A03.A00 = null;
        0kD.A09("ClipsDefaultCoverPhotoGenerator", "generateDefaultCoverPhotoFromMediaComposition onFrameExtractionFailed", exc);
        11Z.A02(new C12996THd(rwm.A00, rwm.A01));
        if (sHx.A01.A07 != null) {
            if ((th instanceof ExecutionException) && th.getCause() != null) {
                th = th.getCause();
            }
            SJL sjl = new SJL();
            sjl.A04 = j;
            sHx.A01.A07.DDE(sjl, new Exception(th));
        }
        sHx.A04 = Boolean.FALSE;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Q1b, java.lang.Object] */
    public final void A01() {
        ? obj = new Object();
        Q1G q1g = this.A02;
        if (q1g != null) {
            try {
                q1g.AVT();
            } catch (Throwable th) {
                C7254Q1b.A00(obj, th);
            }
        }
        try {
            C10573RuS ruS = this.A0F;
            Surface surface = ruS.A01;
            if (surface != null) {
                surface.release();
                ruS.A01 = null;
            }
            SurfaceTexture surfaceTexture = ruS.A00;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                ruS.A00 = null;
            }
            C346337v0 r0 = ruS.A02;
            if (r0 != null) {
                r0.A01();
                ruS.A02 = null;
            }
            this.A05.clear();
        } catch (Throwable th2) {
            C7254Q1b.A00(obj, th2);
        }
        try {
            SU1 su1 = this.A00;
            if (su1 != null) {
                su1.A0A();
            }
        } catch (Throwable th3) {
            C7254Q1b.A00(obj, th3);
        }
        obj.A01();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.RuS, java.lang.Object] */
    public C11263SHx(Context context, C7255Q1d q1d, C13725Tfv tfv, SJL sjl, C13589TdH tdH, C13590TdI tdI, C13780Tgv tgv, C13804ThT thT, C10862RzN rzN, C13598TdQ tdQ, C10708Rwm rwm) {
        this.A0G = tdQ;
        this.A0C = tdI;
        this.A09 = tfv;
        this.A0D = tgv;
        this.A01 = rzN;
        this.A08 = q1d;
        this.A0A = sjl;
        this.A0B = tdH;
        this.A07 = context;
        this.A0H = AnonymousClass7TE.A1C();
        this.A0F = new Object();
        this.A0E = thT;
        this.A03 = rwm;
        this.A0I = new AtomicBoolean();
    }
}
