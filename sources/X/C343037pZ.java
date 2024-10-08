package X;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7pZ  reason: invalid class name and case insensitive filesystem */
public abstract class C343037pZ {
    public static final C343047pa A00 = new C343047pa(1920, 1080);
    public static final C343047pa A01 = new C343047pa(1280, 720);

    public static List A02(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        do {
            arrayList.add(new C343047pa(sizeArr[i].getWidth(), sizeArr[i].getHeight()));
            i++;
        } while (i < length);
        return Collections.unmodifiableList(arrayList);
    }

    public static ArrayList A00(List list, List list2) {
        HashSet hashSet;
        if (list.size() < list2.size()) {
            list = list2;
        } else {
            hashSet = new HashSet(list2);
        }
        int size = list.size();
        int size2 = hashSet.size();
        ArrayList arrayList = new ArrayList(size2);
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (hashSet.contains(obj)) {
                arrayList.add(obj);
                if (arrayList.size() == size2) {
                    break;
                }
            }
        }
        return arrayList;
    }

    public static List A01(C343047pa r7, List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            C343047pa r3 = (C343047pa) list.get(i);
            int i2 = r3.A02;
            int i3 = r7.A02;
            if ((i2 <= i3 && r3.A01 <= r7.A01) || (r3.A02 <= r7.A01 && r3.A01 <= i3)) {
                arrayList.add(r3);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
