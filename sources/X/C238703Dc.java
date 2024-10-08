package X;

/* renamed from: X.3Dc  reason: invalid class name and case insensitive filesystem */
public final class C238703Dc extends C252233om {
    public final /* synthetic */ AnonymousClass3DZ A00;

    public C238703Dc(AnonymousClass3DZ r1) {
        this.A00 = r1;
    }

    public final void onDestroyView() {
        AnonymousClass3DZ r2 = this.A00;
        r2.A00.unregisterLifecycleListener(this);
        r2.A01.removeFragmentVisibilityListener(r2.A02);
    }

    public final void onPause() {
        this.A00.A02();
    }

    public final void onResume() {
        this.A00.A01();
    }
}
