package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.DummySurface;

public final class Q7v extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public TLB A01;
    public DummySurface A02;
    public Error A03;
    public RuntimeException A04;

    public Q7v() {
        super("dummySurface");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                this.A01.getClass();
                this.A01.A01(i2);
                SurfaceTexture surfaceTexture = this.A01.A00;
                surfaceTexture.getClass();
                this.A02 = new DummySurface(surfaceTexture, this);
                synchronized (this) {
                    notify();
                }
                return true;
            } catch (RuntimeException e) {
                2AG.A05("DummySurface", "Failed to initialize dummy surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                2AG.A05("DummySurface", "Failed to initialize dummy surface", e2);
                this.A03 = e2;
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Throwable th) {
                th = th;
                synchronized (this) {
                    try {
                        notify();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    throw th;
                }
            }
        } else if (i == 2) {
            try {
                this.A01.getClass();
                this.A01.A00();
            } catch (Throwable th3) {
                quit();
                throw th3;
            }
            quit();
            return true;
        }
        return true;
    }
}
