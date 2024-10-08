package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4jn  reason: invalid class name and case insensitive filesystem */
public final class C271914jn {
    public static final C271914jn A00 = new Object();

    public final ArrayList A01(List list) {
        ArrayList arrayList = new ArrayList();
        char[] A002 = A00(list);
        int length = A002.length;
        for (int i = 0; i < length; i++) {
            if (A002[i] == '1') {
                arrayList.add(Integer.valueOf(i));
            }
        }
        return arrayList;
    }

    public static final char[] A00(List list) {
        Iterator it = list.iterator();
        String str = "";
        while (it.hasNext()) {
            String num = Integer.toString(((Number) it.next()).intValue(), 2);
            0qQ.A07(num);
            if (num.length() < 31) {
                num = 00l.A0H(num, 31);
            }
            str = 002.A0R(str, num);
        }
        char[] charArray = str.toCharArray();
        0qQ.A07(charArray);
        return charArray;
    }
}
