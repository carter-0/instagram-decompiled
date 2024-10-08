package X;

import java.io.File;

public final class OV8 {
    public static final C69814Nsb A01 = new Object();
    public static final File A02 = AnonymousClass1F2.A00().AXT((1LJ) null, 1647725639);
    public final String A00;

    public OV8(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final File A00() {
        File A0s = JTO.A0s(A02, 00p.A0g(this.A00, "/", "_", false));
        A0s.mkdirs();
        return A0s;
    }
}
