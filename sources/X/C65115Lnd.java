package X;

/* renamed from: X.Lnd  reason: case insensitive filesystem */
public final class C65115Lnd implements B24 {
    public final /* synthetic */ C63818L7z A00;
    public final /* synthetic */ C293505kq A01;

    public C65115Lnd(C63818L7z l7z, C293505kq r2) {
        this.A00 = l7z;
        this.A01 = r2;
    }

    public final void onFailure() {
        this.A00.A02.invoke(this.A01);
    }

    public final void onSuccess() {
        this.A00.A01.invoke();
    }
}
