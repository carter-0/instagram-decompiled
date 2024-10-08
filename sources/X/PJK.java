package X;

import android.os.Handler;

public final class PJK implements AnonymousClass6VI {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final AnonymousClass6VG A01;

    public final void DEU(long j) {
        Handler handler = this.A00;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new C73329Pao(this, j, false));
    }

    public final void Dom(boolean z, long j) {
        Handler handler = this.A00;
        handler.removeCallbacksAndMessages((Object) null);
        handler.post(new C73329Pao(this, j, true));
    }

    public final void onStart() {
    }

    public final void onCancel() {
        this.A00.removeCallbacksAndMessages((Object) null);
    }

    public PJK(AnonymousClass6VG r2) {
        this.A01 = r2;
    }
}
