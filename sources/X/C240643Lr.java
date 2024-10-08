package X;

import android.os.Handler;
import android.os.Looper;
import android.view.Window;

/* renamed from: X.3Lr  reason: invalid class name and case insensitive filesystem */
public final class C240643Lr {
    public AnonymousClass591 A00;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final Window.OnFrameMetricsAvailableListener A02 = new C240653Ls(this);
    public final Window A03;

    public final AnonymousClass9IY A00() {
        AnonymousClass591 r3 = this.A00;
        if (r3 != null) {
            this.A03.removeOnFrameMetricsAvailableListener(this.A02);
            AnonymousClass9IY r32 = new AnonymousClass9IY(r3.A03.A00(), r3.A05.A00(), r3.A00, r3.A02, r3.A01, 1);
            this.A00 = null;
            return r32;
        }
        this.A00 = null;
        return null;
    }

    public C240643Lr(Window window) {
        this.A03 = window;
    }
}
