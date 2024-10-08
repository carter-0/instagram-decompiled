package X;

import android.opengl.GLES20;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class WGB implements AnonymousClass8KU {
    public int A00;
    public int A01;
    public C369008tg A02;
    public C345937uK A03;
    public final AtomicBoolean A04 = JTQ.A0k();
    public final AtomicReference A05 = new AtomicReference((Object) null);
    public volatile boolean A06;

    public final C365468nA BHU() {
        return null;
    }

    public final String BO5() {
        return "FrameBufferOutput";
    }

    public final void CMn(Surface surface, C344557s3 r5) {
        C345937uK AMW = r5.AMW(1, 1);
        this.A03 = AMW;
        AMW.A05();
        this.A02 = new C369008tg(this.A01, this.A00);
        this.A04.set(false);
    }

    public final boolean AFP() {
        if (this.A02 == null || !this.A06) {
            return false;
        }
        return true;
    }

    public final AnonymousClass8KV CED() {
        return AnonymousClass8KV.PREVIEW;
    }

    public final /* synthetic */ boolean CdZ() {
        return false;
    }

    public final boolean ClU() {
        if (this.A02 == null) {
            return false;
        }
        boolean A052 = this.A03.A05();
        GLES20.glBindFramebuffer(36160, this.A02.A00);
        GLES20.glBindTexture(3553, this.A02.A03.A00);
        GLES20.glViewport(0, 0, this.A01, this.A00);
        return A052;
    }

    public final void Dpd() {
        this.A04.compareAndSet(false, true);
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final void release() {
        C369008tg r0 = this.A02;
        if (r0 != null) {
            r0.A01();
            this.A02 = null;
        }
        C345937uK r02 = this.A03;
        if (r02 != null) {
            r02.A02();
        }
    }

    public final void setEnabled(boolean z) {
        this.A06 = z;
    }

    public WGB(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Width and height must be > 0");
        }
        this.A01 = i;
        this.A00 = i2;
        this.A06 = true;
    }

    public final void CMW(C365228mk r1, C365248mm r2) {
        r1.AWV(this);
    }

    public final void destroy() {
        release();
    }

    public final void swapBuffers() {
        GLES20.glBindFramebuffer(36160, 0);
    }
}
