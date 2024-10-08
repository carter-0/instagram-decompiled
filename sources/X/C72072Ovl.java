package X;

/* renamed from: X.Ovl  reason: case insensitive filesystem */
public final class C72072Ovl implements AnonymousClass68Z {
    public static final C72072Ovl A00 = new C72072Ovl();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str;
        C69576NoK noK = (C69576NoK) obj;
        if (noK instanceof C68709NTv) {
            return new NU5(((C68709NTv) noK).A00);
        }
        if (noK instanceof C68710NTw) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("failed to load ");
            str = AnonymousClass7TF.A0i(((C68710NTw) noK).A00, A1A);
        } else {
            str = "unknown error";
        }
        return new NU2(str);
    }
}
