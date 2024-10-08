package X;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Voi  reason: case insensitive filesystem */
public abstract class C18268Voi {
    public static final ArrayList A01(String str) {
        ArrayList arrayList = new ArrayList();
        BreakIterator wordInstance = BreakIterator.getWordInstance();
        wordInstance.setText(str);
        int first = wordInstance.first();
        while (true) {
            int next = wordInstance.next();
            int i = first;
            first = next;
            if (next == -1) {
                return arrayList;
            }
            arrayList.add(new C17455VWi(C51967G9n.A0q(str, i, next)));
        }
    }

    public static final String A00(List list) {
        StringBuilder A0l = C51975G9x.A0l(list);
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            C17455VWi vWi = (C17455VWi) it.next();
            if ((!z || !vWi.A02) && (vWi.A00 || vWi.A02)) {
                z = vWi.A02;
                A0l.append(vWi.A01);
            }
        }
        return DbT.A10(A0l);
    }
}
