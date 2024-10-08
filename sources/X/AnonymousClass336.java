package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.336  reason: invalid class name */
public final class AnonymousClass336 implements AnonymousClass4DV {
    public final Fragment A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3Ar, java.lang.Object] */
    public final C238133Ar getScrollingViewProxy() {
        AnonymousClass4DV r1 = this.A00;
        if (r1.mView == null) {
            return new Object();
        }
        C238133Ar scrollingViewProxy = r1.getScrollingViewProxy();
        0qQ.A0A(scrollingViewProxy);
        return scrollingViewProxy;
    }

    public AnonymousClass336(Fragment fragment) {
        this.A00 = fragment;
    }
}
