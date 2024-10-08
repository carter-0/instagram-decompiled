package X;

/* renamed from: X.MOf  reason: case insensitive filesystem */
public final class C66348MOf extends 0Yg implements 0sP {
    public static final C66348MOf A00 = new C66348MOf();

    public C66348MOf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C64185LSs lSs = (C64185LSs) obj;
        0qQ.A0B(lSs, 0);
        C66419MQz A06 = lSs.A06();
        boolean z = true;
        if (0qQ.A0K(A06, C50957Flk.A00) || 0qQ.A0K(A06, C65626Lx3.A00)) {
            z = false;
        } else if (!(A06 instanceof C65625Lx2) && !(A06 instanceof C65624Lx1) && !(A06 instanceof C61236JzU)) {
            throw AnonymousClass7TE.A1K();
        }
        return Boolean.valueOf(z);
    }
}
