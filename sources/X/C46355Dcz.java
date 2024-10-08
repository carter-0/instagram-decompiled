package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dcz  reason: case insensitive filesystem */
public final class C46355Dcz implements G7E {
    public String A00;
    public List A01;
    public final String A02;
    public final C62320sa A03;

    public final String AbI() {
        Object next;
        List<C61079JwH> list = (List) this.A03.invoke();
        if (0qQ.A0K(list, this.A01)) {
            return this.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C61079JwH jwH : list) {
            018.A16((Iterable) jwH.A00, A1C);
        }
        ArrayList<C46539Dgg> A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : A1C) {
            if (((C46539Dgg) next2).A03) {
                A1C2.add(next2);
            }
        }
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        for (C46539Dgg dgg : A1C2) {
            String str = dgg.A01;
            if (str != null) {
                A1C3.add(str);
            }
        }
        Iterator it = 00k.A0g(A1C3, new C51562Fw8(5)).iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            while (it.hasNext()) {
                next = 002.A0T((String) next, (String) it.next(), ',');
            }
        }
        String str2 = (String) next;
        this.A01 = list;
        this.A00 = str2;
        return str2;
    }

    public final String BcQ() {
        return this.A02;
    }

    public C46355Dcz(String str, C62320sa r2) {
        this.A03 = r2;
        this.A02 = str;
    }
}
