package X;

/* renamed from: X.8Xb  reason: invalid class name and case insensitive filesystem */
public final class C357238Xb extends 2Cn {
    public final 2Cn A00;
    public final /* synthetic */ AnonymousClass8XZ A01;

    public C357238Xb(AnonymousClass8XZ r2, 2Cn r3) {
        0qQ.A0B(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    public final void onFail(Exception exc) {
        0qQ.A0B(exc, 0);
        this.A00.onFail(exc);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0qQ.A0B(obj, 0);
        this.A00.onSuccess(obj);
    }

    public final void onFinish() {
        this.A00.onFinish();
        this.A01.A04.clear();
    }

    public final void onStart() {
        this.A00.onStart();
    }
}
