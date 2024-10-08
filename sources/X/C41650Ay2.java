package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ay2  reason: case insensitive filesystem */
public final class C41650Ay2 extends 0Yg implements C62320sa {
    public static final C41650Ay2 A00 = new C41650Ay2();

    public C41650Ay2() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        List A002 = AIS.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        int i = 0;
        for (Object next : A002) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            A0r.add(AnonymousClass7TE.A0r((String) next, i));
            i = i2;
        }
        return A0r.toArray(new C317486nL[0]);
    }
}
