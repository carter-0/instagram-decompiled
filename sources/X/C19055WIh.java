package X;

/* renamed from: X.WIh  reason: case insensitive filesystem */
public final class C19055WIh implements X5z {
    public final /* synthetic */ X5z A00;
    public final /* synthetic */ C17473VXa A01;

    public C19055WIh(X5z x5z, C17473VXa vXa) {
        this.A01 = vXa;
        this.A00 = x5z;
    }

    public final void DoF(V40 v40) {
        this.A00.DoF(v40);
    }

    public final void onFailure(Throwable th) {
        this.A01.A01.A04();
        this.A00.onFailure(th);
    }
}
