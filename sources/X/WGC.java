package X;

import android.opengl.GLES20;
import android.view.Surface;

public final class WGC implements AnonymousClass8KU, C365188mg {
    public VU6 A00;
    public final WGB A01;
    public final Object A02;

    public final String BO5() {
        return "IgFrameBufferOutput";
    }

    public final void CMW(C365228mk r2, C365248mm r3) {
        0qQ.A0B(r2, 0);
        r2.AWV(this);
    }

    public final boolean AFP() {
        return AnonymousClass7TF.A1P(this.A01.AFP() ? 1 : 0);
    }

    public final C365468nA BHU() {
        return null;
    }

    public final int Bpb() {
        return 0;
    }

    public final AnonymousClass8KV CED() {
        AnonymousClass8KV r0 = AnonymousClass8KV.PREVIEW;
        0qQ.A07(r0);
        return r0;
    }

    public final void CMn(Surface surface, C344557s3 r3) {
        WGB wgb = this.A01;
        0qQ.A0A(r3);
        wgb.CMn(surface, r3);
    }

    public final /* synthetic */ boolean CdZ() {
        return false;
    }

    public final boolean ClU() {
        boolean ClU;
        Object obj = this.A02;
        0qQ.A0A(obj);
        synchronized (obj) {
            ClU = this.A01.ClU();
        }
        return ClU;
    }

    public final void Dpd() {
        C346337v0 r6;
        C369008tg r0 = this.A01.A02;
        if (r0 != null) {
            r6 = r0.A03;
        } else {
            r6 = null;
        }
        VU6 vu6 = this.A00;
        if (vu6 != null && r6 != null) {
            C17703VcY vcY = vu6.A01;
            if (vcY.A09.getAndSet(false)) {
                GLES20.glFinish();
                if (vu6.A00 == null) {
                    vu6.A00 = new AnonymousClass82T(vcY.A05.A07, vcY.A06);
                }
            }
            Object obj = vcY.A08;
            synchronized (obj) {
                if (vcY.A03) {
                    0wb.A03("IG-CameraCoreRenderer", "Skipped a frame");
                }
                WXO wxo = vcY.A07;
                if (!(wxo.getTexture() == r6 && wxo.A01 == r6.A00)) {
                    C365368mz r02 = vcY.A00;
                    0qQ.A0A(r02);
                    int i = r02.A02;
                    C365368mz r03 = vcY.A00;
                    0qQ.A0A(r03);
                    int i2 = r03.A01;
                    wxo.A03 = r6;
                    wxo.A01 = r6.A00;
                    wxo.A02 = i;
                    wxo.A00 = i2;
                }
                vcY.A03 = true;
                obj.notifyAll();
            }
        }
    }

    public final void destroy() {
        this.A01.release();
    }

    public final int getHeight() {
        return this.A01.A00;
    }

    public final int getWidth() {
        return this.A01.A01;
    }

    public final void release() {
        this.A01.release();
    }

    public final void setEnabled(boolean z) {
        this.A01.A06 = z;
    }

    public final void swapBuffers() {
        this.A01.swapBuffers();
        GLES20.glFlush();
    }

    public WGC(C365368mz r4, Object obj) {
        this.A01 = new WGB(r4.A02, r4.A01);
        this.A02 = obj;
    }
}
