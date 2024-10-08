package X;

import android.opengl.GLES20;
import android.opengl.GLES30;

public final class A93 {
    public long A00;
    public B19 A01;
    public Long A02;
    public boolean A03;
    public final /* synthetic */ C40140ATg A04;

    public A93(C40140ATg aTg) {
        this.A04 = aTg;
    }

    public final void A00(int i, int i2) {
        if (this.A03 && this.A04.A02.A03.BYP() >= 3) {
            C349257zq.A03("WaitForGpuCompletion");
            Long l = this.A02;
            if (l != null) {
                GLES30.glClientWaitSync(l.longValue(), 1, 500000000);
                GLES30.glDeleteSync(this.A02.longValue());
                this.A02 = null;
            }
            this.A02 = Long.valueOf(GLES30.glFenceSync(37143, 0));
            GLES20.glFlush();
            C349257zq.A01();
        }
        B19 b19 = this.A01;
        if (b19 != null) {
            b19.DGw(this.A00, i, i2);
        }
    }
}
