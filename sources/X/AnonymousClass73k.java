package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.73k  reason: invalid class name */
public abstract class AnonymousClass73k {
    public static final String A00(Context context, C331007Pc r15) {
        String str;
        int i;
        Object[] objArr;
        String str2;
        int i2;
        Object[] objArr2;
        int i3;
        Object[] objArr3;
        0qQ.A0B(context, 0);
        Set set = r15.A05;
        Set set2 = r15.A06;
        boolean z = r15.A0A;
        boolean z2 = r15.A0B;
        boolean z3 = r15.A07;
        boolean z4 = r15.A0D;
        boolean z5 = r15.A0C;
        int i4 = r15.A00;
        C3256373l r0 = C3256373l.A00;
        0qQ.A0B(set2, 2);
        0qQ.A0B(r0, 10);
        List<C376659Iv> A01 = AnonymousClass73m.A01(set);
        01V.A1D(new ArrayList(set2), AnonymousClass73m.A00);
        if (z3) {
            return AnonymousClass73m.A00(context, i4);
        }
        if (!z2) {
            set2.isEmpty();
            if (set != null && !set.isEmpty()) {
                return C66683Maq.A02(context, ((C376659Iv) A01.get(0)).A00);
            }
            str = context.getString(2131958523);
        } else {
            if (z) {
                if (!A01.isEmpty()) {
                    set2.isEmpty();
                }
                if (A01.isEmpty()) {
                    set2.isEmpty();
                }
                if (!(!A01.isEmpty()) || !set2.isEmpty()) {
                    return "";
                }
                i = 2131958525;
                objArr = new Object[1];
                ArrayList arrayList = new ArrayList(0Yv.A1E(A01, 10));
                for (C376659Iv r02 : A01) {
                    arrayList.add(r02.A02);
                }
                str2 = 00k.A0P(", ", "", "", arrayList, (0sP) null);
            } else {
                set2.isEmpty();
                if (A01.isEmpty()) {
                    return "";
                }
                int size = A01.size();
                str2 = ((C376659Iv) A01.get(0)).A02;
                if (size == 1) {
                    i = 2131958527;
                    objArr = new Object[1];
                } else {
                    if (!z4) {
                        if (size != 2) {
                            i2 = 2131958526;
                            objArr2 = new Object[]{str2, ((C376659Iv) A01.get(1)).A02, Integer.valueOf(size - 2)};
                            String string = context.getString(i2, objArr2);
                            0qQ.A07(string);
                            return string;
                        }
                        i3 = 2131958529;
                        objArr3 = new Object[]{str2, ((C376659Iv) A01.get(1)).A02};
                    } else if (z5) {
                        if (size != 2) {
                            i3 = 2131958526;
                            objArr3 = new Object[]{str2, ((C376659Iv) A01.get(1)).A02, Integer.valueOf(size - 2)};
                        }
                        i3 = 2131958529;
                        objArr3 = new Object[]{str2, ((C376659Iv) A01.get(1)).A02};
                    } else {
                        i2 = 2131958529;
                        objArr2 = new Object[]{str2, 002.A00('+', size - 1)};
                        String string2 = context.getString(i2, objArr2);
                        0qQ.A07(string2);
                        return string2;
                    }
                    String string3 = context.getString(i3, objArr3);
                    0qQ.A0A(string3);
                    return string3;
                }
            }
            objArr[0] = str2;
            str = context.getString(i, objArr);
        }
        0qQ.A07(str);
        return str;
    }
}
