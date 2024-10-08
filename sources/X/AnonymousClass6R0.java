package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6R0  reason: invalid class name */
public final class AnonymousClass6R0 {
    public final Object A00 = new Object();
    public final List A01 = new ArrayList(1);

    public final AnonymousClass6SK A00(AnonymousClass6RF r4) {
        AnonymousClass6RI r2 = new AnonymousClass6RI(r4, new AnonymousClass9LG(this, 9));
        synchronized (this.A00) {
            this.A01.add(r2);
        }
        return new AnonymousClass6SK(r2);
    }

    public final void A01(Object obj) {
        List<AnonymousClass6RI> A0a;
        synchronized (this.A00) {
            A0a = 00k.A0a(this.A01);
        }
        for (AnonymousClass6RI r0 : A0a) {
            AnonymousClass6RF r02 = r0.A01;
            if (r02 != null) {
                r02.Dlc(obj);
            }
        }
    }
}
