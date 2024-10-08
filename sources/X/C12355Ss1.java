package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;

/* renamed from: X.Ss1  reason: case insensitive filesystem */
public final class C12355Ss1 implements C13858Tid {
    public final C7334Q4k A00;
    public final /* synthetic */ C10429Rs5 A01;

    public C12355Ss1(Context context, Surface surface, C7232Q0d q0d, C11354SOn sOn, MediaComposition mediaComposition, C13781Tgw tgw, C10429Rs5 rs5, C10796RyI ryI, C9608Rdm rdm, C7334Q4k q4k) {
        C10429Rs5 rs52 = rs5;
        this.A01 = rs52;
        C7334Q4k q4k2 = q4k;
        this.A00 = q4k2;
        if (rs52.A00 == null) {
            Context context2 = context;
            C13781Tgw tgw2 = tgw;
            C13861Tih ALL = tgw2.ALL(context2, EGL14.EGL_NO_CONTEXT, EGL14.EGL_NO_DISPLAY, EGL14.EGL_NO_SURFACE, (C344557s3) null, (C345557ti) null, q0d, sOn, mediaComposition, q4k2, AnonymousClass05K.A00);
            rs52.A00 = ALL;
            C10796RyI ryI2 = ryI;
            if (ryI != null) {
                0qQ.A0B(ALL, 0);
                synchronized (ryI2.A02) {
                    ryI2.A00 = ALL;
                }
            }
            rs52.A00.CMP();
        }
        C13861Tih tih = rs52.A00;
        tih.getClass();
        tih.Ef8(surface, rdm, 0);
    }

    public final void A8G(MediaEffect mediaEffect, int i) {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.A8G(mediaEffect, i);
    }

    public final void AAZ(int i) {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.AAZ(i);
    }

    public final void APk(long j) {
        C349257zq.A03("TranscodeOutputSurfaceForJBMMR2.displayFrame()");
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.APj(0, j);
        C349257zq.A01();
    }

    public final void AQY(long j) {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.AQY(j);
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
        C13861Tih tih = this.A01.A00;
        if (tih != null) {
            tih.EDZ(mediaEffect, i);
        }
    }

    public final Bitmap EJv() {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        return tih.EK2(0);
    }

    public final void EMX(C344907sc r3) {
        C13861Tih tih = this.A01.A00;
        if (tih instanceof C344777sP) {
            ((C344777sP) tih).E4c(r3);
        }
    }

    public final void EMY(C344907sc r3, C345237tA r4) {
        C13861Tih tih = this.A01.A00;
        if (tih instanceof C344777sP) {
            ((C344777sP) tih).E4d(r3, r4);
        }
    }

    public final void EeS(B19 b19) {
        C13861Tih tih = this.A01.A00;
        if (tih != null) {
            tih.EeS(b19);
        }
    }

    public final void FKI(Surface surface) {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.Ef8(surface, (C9608Rdm) null, 0);
    }

    public final void FNK() {
        this.A01.A00.getClass();
    }

    public final void cancel() {
        C13861Tih tih = this.A01.A00;
        if (tih != null) {
            tih.cancel();
        }
    }

    public final void flush() {
        C13861Tih tih = this.A01.A00;
        tih.getClass();
        tih.flush();
    }

    public final void release() {
        C10429Rs5 rs5 = this.A01;
        C13861Tih tih = rs5.A00;
        if (tih != null) {
            tih.release();
        }
        rs5.A00 = null;
    }
}
