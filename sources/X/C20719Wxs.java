package X;

/* renamed from: X.Wxs  reason: case insensitive filesystem */
public final class C20719Wxs extends 0Yg implements 0sP {
    public static final C20719Wxs A00 = new C20719Wxs();

    public C20719Wxs() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        X9J x9j = (X9J) obj;
        StringBuilder A0l = C51975G9x.A0l(x9j);
        A0l.append(x9j.BJq());
        A0l.append('=');
        switch (x9j.CAF().ordinal()) {
            case 0:
                A0l.append(x9j.Agz());
                return A0l;
            case 1:
                A0l.append(x9j.BI6());
                return A0l;
            case 2:
                A0l.append(x9j.Ayk());
                return A0l;
            case 3:
                A0l.append('\"');
                A0l.append(x9j.C1u());
                A0l.append('\"');
                return A0l;
            case 4:
                Pxf.A1O(A0l, x9j.BOx());
                return A0l;
            case 5:
                A0l.append(x9j.BOX());
                return A0l;
            default:
                return A0l;
        }
    }
}
