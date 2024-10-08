package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cuu  reason: case insensitive filesystem */
public final class C45352Cuu {
    public final ImmutableList A00;
    public final String A01;
    public final String A02;

    public C45352Cuu(CHI chi) {
        String str;
        ImmutableList immutableList;
        Object obj;
        List list;
        this.A02 = chi.A0F;
        C45428Cw8 cw8 = chi.A00;
        if (cw8 == null || cw8.A02 == null) {
            str = chi.A0C;
        } else {
            str = chi.A0B;
        }
        this.A01 = str;
        if (cw8 != null) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            for (C17739Vd8 vd8 : cw8.A08) {
                List list2 = cw8.A06;
                0qQ.A07(list2);
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (0qQ.A0K(((C45293Ctw) obj).A00, vd8.A06)) {
                        break;
                    }
                }
                C45293Ctw ctw = (C45293Ctw) obj;
                if (ctw == null || (list = ctw.A01) == null) {
                    list = 0sn.A00;
                }
                0qQ.A0A(vd8);
                List list3 = chi.A0G;
                0qQ.A07(list3);
                builder.add(new C17740Vd9(vd8, list, list3));
            }
            immutableList = builder.build();
        } else {
            immutableList = ImmutableList.of();
        }
        this.A00 = immutableList;
    }
}
