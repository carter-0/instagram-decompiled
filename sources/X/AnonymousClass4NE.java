package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* renamed from: X.4NE  reason: invalid class name */
public final class AnonymousClass4NE implements AnonymousClass4NF, Handler.Callback {
    public final AnonymousClass4MX A00;
    public final Handler A01;

    public final boolean handleMessage(Message message) {
        AnonymousClass4MM r0;
        C257393xK r02;
        0qQ.A0B(message, 0);
        if (!(message.what != 1 || (r0 = (AnonymousClass4MM) ((AnonymousClass4MW) this.A00).A00.get()) == null || (r02 = r0.A0M) == null)) {
            r02.Dpp();
        }
        return true;
    }

    public final void DKe(SurfaceTexture surfaceTexture, Surface surface) {
        Message obtainMessage;
        Handler handler = this.A01;
        if (handler != null && (obtainMessage = handler.obtainMessage(2)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public final void Dpn(SurfaceTexture surfaceTexture, Surface surface) {
        this.A00.Dpb();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C257393xK r0;
        Message obtainMessage;
        Handler handler = this.A01;
        if (handler == null || (obtainMessage = handler.obtainMessage(1)) == null) {
            AnonymousClass4MM r02 = (AnonymousClass4MM) ((AnonymousClass4MW) this.A00).A00.get();
            if (r02 != null && (r0 = r02.A0M) != null) {
                r0.Dpp();
                return;
            }
            return;
        }
        obtainMessage.sendToTarget();
    }

    public AnonymousClass4NE(Looper looper, AnonymousClass4MX r3) {
        Handler handler;
        this.A00 = r3;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
    }

    public final void Dpm(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        0qQ.A07(0KF.A00(surface));
    }

    public final void E02(Surface surface) {
        0qQ.A07(Integer.toHexString(surface.hashCode()));
    }
}
