package X;

/* renamed from: X.Pni  reason: case insensitive filesystem */
public final class C74017Pni extends 0Yg implements 0sP {
    public static final C74017Pni A00 = new C74017Pni();

    public C74017Pni() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C254703su r4 = (C254703su) obj;
        StringBuilder A0l = C51975G9x.A0l(r4);
        String A0f = r4.A0f();
        if (A0f == null) {
            A0f = "";
        }
        A0l.append(A0f);
        A0l.append(':');
        A0l.append(r4.C7c());
        return A0l.toString();
    }
}
