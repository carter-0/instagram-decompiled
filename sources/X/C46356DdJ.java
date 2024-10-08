package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DdJ  reason: case insensitive filesystem */
public final class C46356DdJ implements AnonymousClass0lh {
    public long A00 = System.currentTimeMillis();
    public List A01 = 0sn.A00;
    public Map A02 = AnonymousClass7TE.A1H();
    public AnonymousClass62P A03 = AnonymousClass62M.A01;
    public boolean A04;
    public final C46516DgJ A05;

    public C46356DdJ(C46516DgJ dgJ) {
        0qQ.A0B(dgJ, 2);
        this.A05 = dgJ;
    }

    public final List A02() {
        List<C61079JwH> list = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C61079JwH jwH : list) {
            ArrayList arrayList = new ArrayList();
            for (C46539Dgg dgg : (List) jwH.A00) {
                String str = dgg.A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            018.A16(arrayList, A1C);
        }
        return A1C;
    }

    public final List A03() {
        Map map = this.A02;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            ArrayList arrayList = new ArrayList();
            for (C46539Dgg dgg : (List) ((Map.Entry) A0u.next()).getValue()) {
                String str = dgg.A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            018.A16(arrayList, A1C);
        }
        return A1C;
    }

    public final void onSessionWillEnd() {
        this.A02.clear();
    }

    public final String A00() {
        List A032 = A03();
        if (A032.isEmpty()) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A032) {
            if (((String) next).length() > 0) {
                A1C.add(next);
            }
        }
        return DbT.A0z(",", A1C, (0sP) null);
    }

    public final List A01() {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (C61079JwH jwH : this.A01) {
            for (C46539Dgg dgg : (List) jwH.A00) {
                if (dgg.A03) {
                    Object obj = A1H.get(jwH);
                    if (obj == null) {
                        obj = new ArrayList();
                        A1H.put(jwH, obj);
                    }
                    ((List) obj).add(dgg);
                }
            }
        }
        Collection<List> values = A1H.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (List<C46539Dgg> it : values) {
            ArrayList arrayList = new ArrayList();
            for (C46539Dgg dgg2 : it) {
                String str = dgg2.A01;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            018.A16(arrayList, A1C);
        }
        return A1C;
    }
}
