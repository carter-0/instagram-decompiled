package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9VW  reason: invalid class name */
public final class AnonymousClass9VW implements C242643Vh {
    public final List A00;

    public AnonymousClass9VW(AnonymousClass9IN r7) {
        0qQ.A0B(r7, 1);
        List<Object> list = (List) r7.A03;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object r3 : list) {
            A0r.add(new 0eP(new C242783Vx(new AnonymousClass9IN(r3, r7.A02, r7.A01)), 0));
        }
        this.A00 = A0r;
    }

    public final Object AvB() {
        return null;
    }

    public final /* synthetic */ void DPe(Object obj) {
    }

    public final /* synthetic */ boolean DPd(Object obj) {
        return true;
    }

    public final Iterable BVk(C376459Ib r2, AnonymousClass34Q r3, int i) {
        return this.A00;
    }
}
