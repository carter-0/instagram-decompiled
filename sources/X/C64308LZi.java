package X;

import androidx.lifecycle.OnLifecycleEvent;

/* renamed from: X.LZi  reason: case insensitive filesystem */
public final class C64308LZi implements AnonymousClass07Y {
    public AnonymousClass07Z A00;
    public AnonymousClass4DS A01;
    public 2dZ A02;

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void attachActionBar() {
        2dZ r0;
        AnonymousClass4DS r1 = this.A01;
        if (r1 != null && (r0 = this.A02) != null) {
            r0.A0X(r1);
        }
    }

    @OnLifecycleEvent(07T.ON_DESTROY)
    public final void removeFragmentLifecycleObserver() {
        AnonymousClass07V lifecycle;
        AnonymousClass07Z r0 = this.A00;
        if (!(r0 == null || (lifecycle = r0.getLifecycle()) == null)) {
            lifecycle.A0A(this);
        }
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
    }
}
