package X;

/* renamed from: X.Ao6  reason: case insensitive filesystem */
public final class C41084Ao6 implements Runnable {
    public final /* synthetic */ C292555j9 A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public C41084Ao6(C292555j9 r1, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3W1 r2 = this.A01;
        if (!r2.A32) {
            r2.A32 = true;
            this.A00.A01.remove(Integer.valueOf(r2.hashCode()));
        }
    }
}
