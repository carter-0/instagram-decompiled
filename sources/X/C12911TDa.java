package X;

import android.opengl.EGL14;

/* renamed from: X.TDa  reason: case insensitive filesystem */
public final class C12911TDa implements Runnable {
    public final /* synthetic */ SSF A00;

    public C12911TDa(SSF ssf) {
        this.A00 = ssf;
    }

    public final void run() {
        SSF ssf = this.A00;
        C344587s6 r2 = new C344587s6(C343747qj.A06, 3);
        r2.A09(EGL14.EGL_NO_CONTEXT, 1);
        ssf.A00 = r2;
        C11419SSu sSu = new C11419SSu();
        sSu.A00 = sSu.A00;
        ssf.A02 = sSu;
        SSF.A03(ssf);
    }
}
