package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.WUc  reason: case insensitive filesystem */
public final class C19320WUc implements C349047zV {
    public HandlerThread A00;
    public C17807VgK A01;
    public ALH A02;
    public final Context A03;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final boolean A07;
    public final boolean A08;

    public final synchronized void EyL() {
        if (this.A07) {
            this.A04.set(false);
            HandlerThread handlerThread = this.A00;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
        }
    }

    public static final void A00(C19320WUc wUc) {
        ALH alh = wUc.A02;
        if (alh != null) {
            alh.A03();
        }
        wUc.A02 = null;
        wUc.A05.set(false);
    }

    public final ALH B3D() {
        return this.A02;
    }

    public final void Exd() {
        HandlerThread handlerThread;
        if (this.A07) {
            HandlerThread handlerThread2 = this.A00;
            if (handlerThread2 == null) {
                handlerThread2 = Pxf.A0I(AnonymousClass000.A00(2298));
                this.A00 = handlerThread2;
            }
            if (!handlerThread2.isAlive() && (handlerThread = this.A00) != null) {
                handlerThread.start();
            }
            HandlerThread handlerThread3 = this.A00;
            if (handlerThread3 != null) {
                this.A04.set(true);
                new Handler(handlerThread3.getLooper()).post(new C20011WjW(this));
            }
        }
    }

    public final void cleanup() {
        if (!this.A07) {
            A00(this);
        } else {
            EyL();
        }
    }

    public final void finalize() {
        if (this.A08 && this.A05.get()) {
            A00(this);
        }
    }

    public C19320WUc(Context context, boolean z, boolean z2) {
        this.A03 = context;
        this.A07 = z;
        this.A08 = z2;
        if (!z) {
            this.A05.set(true);
            ALH alh = new ALH(this.A03, this.A07);
            this.A02 = alh;
            alh.onSurfaceCreated((GL10) null, (EGLConfig) null);
        }
    }
}
