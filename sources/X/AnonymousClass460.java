package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.460  reason: invalid class name */
public final class AnonymousClass460 implements AnonymousClass461 {
    public final List A00 = new ArrayList();

    public final AnonymousClass467 BO4(String str) {
        List list = this.A00;
        synchronized (list) {
            list.add(str);
        }
        return AnonymousClass467.A00;
    }
}
