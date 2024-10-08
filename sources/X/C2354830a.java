package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.30a  reason: invalid class name and case insensitive filesystem */
public class C2354830a {
    public AnonymousClass30Y A00 = AnonymousClass30Y.A07;
    public List A01 = null;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C2354830a A00(C250603lj r2) {
        List list = this.A01;
        if (list == null) {
            list = new ArrayList();
            this.A01 = list;
        }
        list.add(r2);
        return this;
    }

    public AnonymousClass30Y A01() {
        return new AnonymousClass30Y(this);
    }

    public C2354830a(Object obj, Object obj2, String str) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = str;
    }

    public final void A02(AnonymousClass30Y r1) {
        this.A00 = r1;
    }
}
