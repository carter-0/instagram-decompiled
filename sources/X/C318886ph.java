package X;

/* renamed from: X.6ph  reason: invalid class name and case insensitive filesystem */
public final class C318886ph implements AnonymousClass11X {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ C266474Za A01;

    public final String getName() {
        return "ReplayableCacheData";
    }

    public final int getRunnableId() {
        return 773867903;
    }

    public final void onCancel() {
    }

    public C318886ph(1P0 r1, C266474Za r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onFinish() {
        1P0 r1 = this.A00;
        r1.onFinish();
        r1.onSuccess(this.A01.A01);
    }

    public final void onStart() {
        this.A00.onStart();
    }

    public final void run() {
        this.A00.onSuccessInBackground(this.A01.A01);
    }
}
