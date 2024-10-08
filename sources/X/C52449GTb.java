package X;

/* renamed from: X.GTb  reason: case insensitive filesystem */
public abstract class C52449GTb {
    public static final C58718IwR A00(AnonymousClass54O r3, AnonymousClass07V r4) {
        if (r4.A07().compareTo(07U.A02) > 0) {
            IHG ihg = new IHG(r3, 0);
            r4.A09(ihg);
            return new C58718IwR(r4, (AnonymousClass0hF) ihg, 21);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Cannot configure ");
        A1A.append(r3);
        A1A.append(" to disposeComposition at Lifecycle ON_DESTROY: ");
        A1A.append(r4);
        throw AnonymousClass7TE.A0z(AnonymousClass7TF.A0l("is already destroyed", A1A));
    }
}
