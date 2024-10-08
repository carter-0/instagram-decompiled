package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.O0t  reason: case insensitive filesystem */
public abstract class C70289O0t {
    public static final String A00(Context context, List list, int i, boolean z) {
        int i2;
        Object obj;
        Object[] objArr;
        Object obj2;
        Object obj3;
        Object obj4;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66582MXn.A1O(A0r, it);
        }
        int size = A0r.size();
        String str = "";
        if (size == 0) {
            return str;
        }
        if (size == 1) {
            Object obj5 = str;
            if (A0r.size() > 0) {
                obj5 = A0r.get(0);
            }
            return (String) obj5;
        }
        if (z) {
            i2 = 2131962688;
            Object obj6 = str;
            if (A0r.size() > 0) {
                obj6 = A0r.get(0);
            }
            objArr = C51968G9o.A1Z(obj6, i);
        } else if (size == 2) {
            i2 = 2131962690;
            if (A0r.size() > 0) {
                obj4 = A0r.get(0);
            } else {
                obj4 = str;
            }
            Object obj7 = str;
            if (1 < A0r.size()) {
                obj7 = A0r.get(1);
            }
            objArr = new Object[]{obj4, obj7};
        } else if (size == 3) {
            i2 = 2131962689;
            if (A0r.size() > 0) {
                obj2 = A0r.get(0);
            } else {
                obj2 = str;
            }
            if (1 < A0r.size()) {
                obj3 = A0r.get(1);
            } else {
                obj3 = str;
            }
            Object obj8 = str;
            if (2 < A0r.size()) {
                obj8 = A0r.get(2);
            }
            objArr = new Object[]{obj2, obj3, obj8};
        } else {
            i2 = 2131962687;
            if (A0r.size() > 0) {
                obj = A0r.get(0);
            } else {
                obj = str;
            }
            Object obj9 = str;
            if (1 < A0r.size()) {
                obj9 = A0r.get(1);
            }
            objArr = new Object[]{obj, obj9, Integer.valueOf(i)};
        }
        String string = context.getString(i2, objArr);
        0qQ.A07(string);
        return string;
    }
}
