package X;

/* renamed from: X.XDe  reason: case insensitive filesystem */
public final class C21066XDe implements 1aL, YAH {
    public C65051aA A00;
    public final YAl A01;

    public final void EHJ(long j) {
    }

    public final void DUK(Object obj) {
        this.A01.DUK(obj);
    }

    public final void Do4(C65051aA r2) {
        this.A00 = r2;
        this.A01.Do5(this);
    }

    public final void cancel() {
        this.A00.dispose();
    }

    public final void onComplete() {
        this.A01.onComplete();
    }

    public final void onError(Throwable th) {
        this.A01.onError(th);
    }

    public C21066XDe(YAl yAl) {
        this.A01 = yAl;
    }
}
