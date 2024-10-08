package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class SF3 {
    public List A00;
    public final Integer A01;
    public final String A02;
    public final List A03;

    public static ArrayList A00(AnonymousClass385 r9, List list) {
        if (list == null) {
            return null;
        }
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SF3 sf3 = (SF3) it.next();
            AnonymousClass385 r4 = r9;
            A0m.add(new SSM(r4, sf3.A01, sf3.A02, sf3.A03, A00(r9, sf3.A00)));
        }
        return A0m;
    }

    public SF3(Integer num, String str, List list, List list2) {
        this.A02 = str;
        this.A01 = num;
        this.A03 = list;
        this.A00 = list2;
    }
}
