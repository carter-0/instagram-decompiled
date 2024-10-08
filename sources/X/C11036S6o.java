package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.S6o  reason: case insensitive filesystem */
public final class C11036S6o {
    public final SF5 A00 = new SF5((Object) null);
    public final Map A01 = AnonymousClass7TE.A1E();

    public final Object A00() {
        int size;
        Object remove;
        SF5 sf5 = this.A00;
        SF5 sf52 = sf5;
        while (true) {
            sf5 = sf5.A01;
            if (sf5.equals(sf52)) {
                return null;
            }
            List list = sf5.A02;
            if (list != null && (size = list.size()) > 0 && (remove = sf5.A02.remove(size - 1)) != null) {
                return remove;
            }
            SF5 sf53 = sf5.A01;
            sf53.A00 = sf5.A00;
            sf5.A00.A01 = sf53;
            Map map = this.A01;
            Object obj = sf5.A03;
            map.remove(obj);
            ((C13533Tc5) obj).CsZ();
        }
    }

    public final Object A01(C13533Tc5 tc5) {
        int size;
        Map map = this.A01;
        SF5 sf5 = (SF5) map.get(tc5);
        if (sf5 == null) {
            sf5 = new SF5(tc5);
            map.put(tc5, sf5);
        } else {
            tc5.CsZ();
        }
        SF5 sf52 = sf5.A01;
        sf52.A00 = sf5.A00;
        sf5.A00.A01 = sf52;
        SF5 sf53 = this.A00;
        sf5.A01 = sf53;
        SF5 sf54 = sf53.A00;
        sf5.A00 = sf54;
        sf54.A01 = sf5;
        sf5.A01.A00 = sf5;
        List list = sf5.A02;
        if (list == null || (size = list.size()) <= 0) {
            return null;
        }
        return sf5.A02.remove(size - 1);
    }

    public final void A02(C13533Tc5 tc5, Object obj) {
        Map map = this.A01;
        SF5 sf5 = (SF5) map.get(tc5);
        if (sf5 == null) {
            sf5 = new SF5(tc5);
            SF5 sf52 = sf5.A01;
            sf52.A00 = sf5.A00;
            sf5.A00.A01 = sf52;
            SF5 sf53 = this.A00;
            sf5.A01 = sf53.A01;
            sf5.A00 = sf53;
            sf53.A01 = sf5;
            sf5.A01.A00 = sf5;
            map.put(tc5, sf5);
        } else {
            tc5.CsZ();
        }
        List list = sf5.A02;
        if (list == null) {
            list = AnonymousClass7TE.A1C();
            sf5.A02 = list;
        }
        list.add(obj);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("GroupedLinkedMap( ");
        SF5 sf5 = this.A00;
        boolean z = false;
        for (SF5 sf52 = sf5.A00; !sf52.equals(sf5); sf52 = sf52.A00) {
            z = true;
            A16.append('{');
            A16.append(sf52.A03);
            A16.append(':');
            A16.append(C51971G9r.A0H(sf52.A02));
            A16.append("}, ");
        }
        if (z) {
            A16.delete(A16.length() - 2, A16.length());
        }
        return AnonymousClass7TF.A0l(" )", A16);
    }
}
