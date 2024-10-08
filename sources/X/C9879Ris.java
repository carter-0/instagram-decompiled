package X;

/* renamed from: X.Ris  reason: case insensitive filesystem */
public abstract class C9879Ris {
    public static final String A00(AnonymousClass4D7 r3) {
        String str;
        if (r3 instanceof 1Ez) {
            return r3.toString();
        }
        try {
            StringBuilder A0d = JTQ.A0d(r3);
            A0d.append('@');
            str = AnonymousClass7TF.A0l(Pxf.A0h(r3), A0d);
        } catch (Throwable th) {
            str = JTO.A1B(th);
        }
        if (0eR.A00(str) != null) {
            str = 002.A0T(C66581MXm.A0y(r3), Pxf.A0h(r3), '@');
        }
        return str;
    }
}
