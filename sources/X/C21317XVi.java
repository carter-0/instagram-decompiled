package X;

/* renamed from: X.XVi  reason: case insensitive filesystem */
public abstract class C21317XVi {
    public static C21195XOb A00(XOY xoy, XOZ xoz, XOa xOa, Xnl xnl) {
        if (xOa == null) {
            throw AnonymousClass7TG.A0q("HPKE KEM parameter is not set");
        } else if (xoz == null) {
            throw AnonymousClass7TG.A0q("HPKE KDF parameter is not set");
        } else if (xoy == null) {
            throw AnonymousClass7TG.A0q("HPKE AEAD parameter is not set");
        } else if (xnl != null) {
            return new C21195XOb(xoy, xoz, xOa, xnl);
        } else {
            throw AnonymousClass7TG.A0q("HPKE variant is not set");
        }
    }
}
