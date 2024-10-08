package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.google.android.exoplayer2.video.PlaceholderSurface;

public final class Q7w extends HandlerThread implements Handler.Callback {
    public Handler A00;
    public TLB A01;
    public PlaceholderSurface A02;
    public Error A03;
    public RuntimeException A04;

    public Q7w() {
        super("ExoPlayer:PlaceholderSurface");
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
                this.A02 = new PlaceholderSurface(surfaceTexture, this, AnonymousClass7TF.A1P(i2));
                synchronized (this) {
                    notify();
                }
                return true;
            } catch (RuntimeException e) {
                2AG.A05("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.A04 = e;
                synchronized (this) {
                    notify();
                }
            } catch (RJi e2) {
                2AG.A05("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.A04 = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                    return true;
                }
            } catch (Error e3) {
                2AG.A05("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.A03 = e3;
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
