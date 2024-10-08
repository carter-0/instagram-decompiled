package X;

/* renamed from: X.Ovm  reason: case insensitive filesystem */
public final class C72073Ovm implements AnonymousClass68Z {
    public static final C72073Ovm A00 = new C72073Ovm();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        C69564No8 no8 = (C69564No8) obj;
        if (0qQ.A0K(no8, NEF.A00)) {
            return NU9.A00;
        }
        if (0qQ.A0K(no8, NEE.A00)) {
            str = "block store not available";
        } else if (no8 instanceof NEG) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("error when saving rc:  ");
            str = AnonymousClass7TF.A0i(((NEG) no8).A00, A1A);
        } else {
            str = "unknown error";
        }
        return new NU6(str);
    }
}
