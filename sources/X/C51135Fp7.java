package X;

/* renamed from: X.Fp7  reason: case insensitive filesystem */
public final class C51135Fp7 implements 1aV {
    public final /* synthetic */ G70 A00;

    public C51135Fp7(G70 g70) {
        this.A00 = g70;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        boolean A1a = DbX.A1a(obj);
        G70 g70 = this.A00;
        if (A1a) {
            if (g70 != null) {
                g70.onSuccess();
            }
        } else if (g70 != null) {
            g70.onFailure();
        }
    }
}
