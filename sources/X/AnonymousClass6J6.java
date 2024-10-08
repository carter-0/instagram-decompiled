package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6J6  reason: invalid class name */
public abstract class AnonymousClass6J6 {
    public static final List A00(AnonymousClass6H6 r8, AnonymousClass6J1 r9, AnonymousClass6HC r10) {
        2HY r0;
        C285045Pl r1 = r8.A00;
        if (r1.A00 == 0 && r10.isEmpty()) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        int i = r1.A00;
        if (i != 0) {
            Object[] objArr = r1.A02;
            AnonymousClass6H7 r3 = (AnonymousClass6H7) objArr[0];
            int i2 = r3.A01;
            if (i > 0) {
                int i3 = 0;
                do {
                    AnonymousClass6H7 r12 = (AnonymousClass6H7) objArr[i3];
                    if (r12.A01 < i2) {
                        i2 = r12.A01;
                    }
                    i3++;
                } while (i3 < i);
            }
            if (i2 >= 0) {
                int i4 = r3.A00;
                if (i > 0) {
                    int i5 = 0;
                    do {
                        AnonymousClass6H7 r13 = (AnonymousClass6H7) objArr[i5];
                        if (r13.A00 > i4) {
                            i4 = r13.A00;
                        }
                        i5++;
                    } while (i5 < i);
                }
                r0 = new 2HY(i2, Math.min(i4, r9.getItemCount() - 1));
            } else {
                throw new IllegalArgumentException("negative minIndex");
            }
        } else {
            r0 = 2HY.A00;
        }
        int size = r10.size();
        for (int i6 = 0; i6 < size; i6++) {
            AnonymousClass6JE r14 = (AnonymousClass6JE) ((AnonymousClass6JH) r10.get(i6));
            int A00 = AnonymousClass6J5.A00(r9, r14.A04, r14.A00.BI6());
            int i7 = r0.A00;
            if ((A00 > r0.A01 || i7 > A00) && A00 >= 0 && A00 < r9.getItemCount()) {
                arrayList.add(Integer.valueOf(A00));
            }
        }
        int i8 = r0.A00;
        int i9 = r0.A01;
        if (i8 > i9) {
            return arrayList;
        }
        while (true) {
            arrayList.add(Integer.valueOf(i8));
            if (i8 == i9) {
                return arrayList;
            }
            i8++;
        }
    }
}
