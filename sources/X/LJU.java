package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class LJU {
    public static final KV3 A00(JZC jzc) {
        String str;
        0qQ.A0B(jzc, 0);
        Integer num = jzc.A0G;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    return new KV3(jzc);
                case 2:
                    return new KV3(jzc);
                case 3:
                    return new KV3(jzc);
                case 4:
                    return new KV3(jzc);
                case 5:
                    return new KV3(jzc);
                case 6:
                    return new KV3(jzc);
                case 7:
                    return new KV3(jzc);
                case 8:
                    return new KV3(jzc);
            }
        }
        if (num != null) {
            str = C49008Enk.A00(num);
        } else {
            str = "null";
        }
        0wb.A03("AudioBrowserItem", 002.A0R("Unsupported music search result type ", str));
        return null;
    }

    public static final ArrayList A01(List list) {
        ArrayList<JZC> arrayList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JZC jzc = (JZC) it.next();
            if (jzc.A0G == AnonymousClass05K.A1I) {
                A1C.add(new KV3(jzc));
                C62925Kod kod = jzc.A0D;
                if (kod != null) {
                    List<DSN> list2 = ((C61095Jx6) kod.A00).A04;
                    if (list2 != null) {
                        arrayList = AnonymousClass7TG.A0r(list2);
                        for (DSN jzc2 : list2) {
                            arrayList.add(new JZC(jzc2));
                        }
                    } else {
                        arrayList = AnonymousClass7TE.A1C();
                    }
                    for (JZC A00 : arrayList) {
                        KV3 A002 = A00(A00);
                        if (A002 != null) {
                            A1C.add(A002);
                        }
                    }
                }
            } else {
                KV3 A003 = A00(jzc);
                if (A003 != null) {
                    A1C.add(A003);
                }
            }
        }
        return A1C;
    }
}
