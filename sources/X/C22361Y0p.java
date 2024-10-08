package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.Y0p  reason: case insensitive filesystem */
public final class C22361Y0p implements C308776Vo {
    public int A00 = 0;
    public AnonymousClass3CG A01 = null;
    public boolean A02 = false;
    public final Handler A03;
    public final C249863kU A04;

    public /* synthetic */ C22361Y0p(C249863kU r4) {
        Handler A0D = AnonymousClass7TF.A0D();
        this.A04 = r4;
        this.A03 = A0D;
    }

    public final void DDB() {
        C22392Y1y y1y = new C22392Y1y(this);
        if (!0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.A03.post(y1y);
        } else {
            y1y.run();
        }
    }

    public final void Dp0(int i) {
        C22414Y2w y2w = new C22414Y2w(this, i);
        if (!0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.A03.post(y2w);
        } else {
            y2w.run();
        }
    }
}
