package X;

/* renamed from: X.XVh  reason: case insensitive filesystem */
public abstract class C21316XVh {
    public static C21196XOc A00(AnonymousClass983 r1, Xnm xnm, Xnn xnn, Xnj xnj, Xnk xnk, C3740497y r6) {
        if (xnm == null) {
            throw AnonymousClass7TG.A0q("Elliptic curve type is not set");
        } else if (xnn == null) {
            throw AnonymousClass7TG.A0q("Hash type is not set");
        } else if (r1 == null) {
            throw AnonymousClass7TG.A0q("DEM parameters are not set");
        } else if (xnk != null) {
            Xnm xnm2 = Xnm.A04;
            if (xnm != xnm2 && xnj == null) {
                throw AnonymousClass7TG.A0q("Point format is not set");
            } else if (xnm != xnm2 || xnj == null) {
                return new C21196XOc(r1, xnm, xnn, xnj, xnk, r6);
            } else {
                throw AnonymousClass7TG.A0q("For Curve25519 point format must not be set");
            }
        } else {
            throw AnonymousClass7TG.A0q(AnonymousClass000.A00(1056));
        }
    }
}
