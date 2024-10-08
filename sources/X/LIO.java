package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LIO {
    public static final List A01(Iterable iterable) {
        0qQ.A0B(iterable, 0);
        ArrayList A0r = AnonymousClass7TG.A0r(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AnonymousClass51M A00 = A00(JTO.A0g(it).A0E());
            A00.A0Q = true;
            A0r.add(A00);
        }
        return A0r;
    }

    public static final AnonymousClass51M A00(String str) {
        try {
            return AnonymousClass51L.parseFromJson(16P.A00(str));
        } catch (IOException unused) {
            throw new RuntimeException();
        }
    }
}
