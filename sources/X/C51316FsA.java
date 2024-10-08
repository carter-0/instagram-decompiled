package X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FsA  reason: case insensitive filesystem */
public final class C51316FsA implements Runnable {
    public final /* synthetic */ C47449E2v A00;

    public C51316FsA(C47449E2v e2v) {
        this.A00 = e2v;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A00.A00;
        if (fragmentActivity == null) {
            0qQ.A0F("activity");
            throw AnonymousClass00P.createAndThrow();
        } else {
            fragmentActivity.onBackPressed();
        }
    }
}
