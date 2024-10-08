package X;

/* renamed from: X.8Dq  reason: invalid class name and case insensitive filesystem */
public final class C352508Dq implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass2gO A00;
    public final /* synthetic */ AnonymousClass85G A01;

    public C352508Dq(AnonymousClass2gO r1, AnonymousClass85G r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        if (this.A01.A00.compareAndSet(true, false)) {
            this.A00.onChanged(obj);
        }
    }
}
