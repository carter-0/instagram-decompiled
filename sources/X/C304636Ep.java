package X;

import java.util.List;

/* renamed from: X.6Ep  reason: invalid class name and case insensitive filesystem */
public abstract class C304636Ep {
    public static final int A00(List list, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((C3022362e) 00k.A0K(list)).A00) {
            0qQ.A0B(list, 0);
            return list.size() - 1;
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            C3022362e r1 = (C3022362e) list.get(i2);
            if (r1.A01 > f) {
                size = i2 - 1;
            } else if (r1.A00 > f) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public static final int A01(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C3022362e r1 = (C3022362e) list.get(i3);
            if (r1.A05 > i) {
                size = i3 - 1;
            } else if (r1.A04 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int A02(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            C3022362e r1 = (C3022362e) list.get(i3);
            if (r1.A03 > i) {
                size = i3 - 1;
            } else if (r1.A02 > i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void A03(List list, 0sP r6, long j) {
        int A01 = A01(list, C285965Tk.A01(j));
        int size = list.size();
        while (A01 < size) {
            C3022362e r2 = (C3022362e) list.get(A01);
            if (r2.A05 < C285965Tk.A00(j)) {
                if (r2.A05 != r2.A04) {
                    r6.invoke(r2);
                }
                A01++;
            } else {
                return;
            }
        }
    }
}
