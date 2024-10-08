package X;

import android.view.ViewParent;

/* renamed from: X.54Q  reason: invalid class name */
public final class AnonymousClass54Q implements Runnable {
    public final /* synthetic */ AnonymousClass54P A00;

    public AnonymousClass54Q(AnonymousClass54P r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass54P r0 = this.A00;
        r0.A00 = true;
        C255913uv r02 = r0.A06;
        r02.setGestureInProgress(true);
        ViewParent parent = r02.getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        AnonymousClass2S0.A01.A06();
    }
}
