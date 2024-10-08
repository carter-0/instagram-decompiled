package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.7zU  reason: invalid class name and case insensitive filesystem */
public final class C349037zU implements C349047zV {
    public ALH A00;
    public Thread A01;
    public final Context A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final boolean A06;
    public final boolean A07;

    public final synchronized ALH B3D() {
        return this.A00;
    }

    public final synchronized void Exd() {
        if (this.A06 && this.A01 == null) {
            this.A01 = new Thread(new C40857AkR(this), AnonymousClass000.A00(2298));
            this.A05.set(false);
            this.A04.set(false);
            Thread thread = this.A01;
            if (thread != null) {
                thread.start();
            }
        }
    }

    public final synchronized void EyL() {
        A00();
    }

    public final synchronized void cleanup() {
        if (!this.A06) {
            A01(this);
        } else {
            A00();
        }
    }

    private final void A00() {
        if (this.A06 && this.A01 != null) {
            AtomicBoolean atomicBoolean = this.A05;
            atomicBoolean.set(true);
            while (true) {
                AtomicBoolean atomicBoolean2 = this.A04;
                if (!atomicBoolean2.get()) {
                    Thread.sleep(10);
                } else {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    this.A01 = null;
                    return;
                }
            }
        }
    }

    public static final void A01(C349037zU r1) {
        ALH alh = r1.A00;
        if (alh != null) {
            alh.A03();
        }
        r1.A00 = null;
        r1.A03.set(false);
    }

    public final void finalize() {
        if (this.A07 && this.A03.get()) {
            A01(this);
        }
    }

    public C349037zU(Context context, boolean z, boolean z2) {
        this.A02 = context;
        this.A06 = z;
        this.A07 = z2;
        if (!z) {
            this.A00 = new ALH(this.A02, this.A06);
            this.A03.set(true);
            ALH alh = this.A00;
            if (alh != null) {
                alh.onSurfaceCreated((GL10) null, (EGLConfig) null);
            }
        }
    }
}
