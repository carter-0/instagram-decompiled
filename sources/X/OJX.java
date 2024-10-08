package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public final class OJX {
    public final /* synthetic */ C72309P1a A00;

    public OJX(C72309P1a p1a) {
        this.A00 = p1a;
    }

    public final void A00(List list) {
        Integer num;
        C72309P1a p1a = this.A00;
        Integer num2 = p1a.A01;
        Integer num3 = AnonymousClass05K.A01;
        if (num2 == num3) {
            if (list == null || list.isEmpty()) {
                p1a.A01 = AnonymousClass05K.A00;
                p1a.CgL();
                return;
            }
        } else if (list == null) {
            return;
        }
        O6T o6t = p1a.A03;
        if (o6t != null) {
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            if (p1a.A01 == num3) {
                num = p1a.A04.A02;
                Integer num4 = AnonymousClass05K.A0Y;
                if (num != num4) {
                    p1a.A01 = AnonymousClass05K.A00;
                    0qQ.A0B(num4, 0);
                }
                0qQ.A0B(num, 0);
            } else {
                num = p1a.A00.A02;
                0qQ.A0B(num, 0);
            }
            0qQ.A0A(copyOf);
            C68488NKh nKh = o6t.A00;
            nKh.A0K.post(new C73193PYX(copyOf, nKh));
        }
    }
}
