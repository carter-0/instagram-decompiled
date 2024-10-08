package X;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.LZj  reason: case insensitive filesystem */
public final class C64309LZj implements AnonymousClass07Y {
    public boolean A00;
    public final ComponentActivity A01;
    public final AnonymousClass3E6 A02;

    public C64309LZj(ComponentActivity componentActivity, 0sP r5) {
        0qQ.A0B(componentActivity, 1);
        this.A01 = componentActivity;
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, true);
        this.A02 = A012;
        A012.A9Y(new C64871LjX(r5, 10));
        componentActivity.getLifecycle().A09(this);
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public final void destroy() {
        this.A01.getLifecycle().A0A(this);
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void resume() {
        if (!this.A00) {
            this.A02.DmJ(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(07T.ON_START)
    public final void start() {
        if (!this.A00) {
            this.A02.DmJ(this.A01);
            this.A00 = true;
        }
    }

    @OnLifecycleEvent(07T.ON_PAUSE)
    public final void stopDetector() {
        if (this.A00) {
            this.A02.onStop();
            this.A00 = false;
        }
    }
}
