package X;

import java.util.List;

/* renamed from: X.Ayf  reason: case insensitive filesystem */
public final class C41688Ayf extends 0Yg implements 0sP {
    public static final C41688Ayf A00 = new C41688Ayf();

    public C41688Ayf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AHB ahb = (AHB) obj;
        0qQ.A0B(ahb, 0);
        String str = ahb.A01;
        List list = AGz.A01;
        boolean z = true;
        if (!0qQ.A0K(str, list.get(1)) && !0qQ.A0K(str, list.get(2))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
