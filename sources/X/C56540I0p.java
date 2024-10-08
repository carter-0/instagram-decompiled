package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.I0p  reason: case insensitive filesystem */
public final class C56540I0p {
    public final AnonymousClass2W3 A01(2T4 r11) {
        AnonymousClass2Ta r4;
        if (!(r11 == null || (r4 = r11.A02) == null || (r4 instanceof C245313cf))) {
            if (r4 instanceof AnonymousClass2TY) {
                AnonymousClass2TY r42 = (AnonymousClass2TY) r4;
                int size = r42.A04().A0s.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                AnonymousClass2W3 A02 = A02(r42, size, 0, 0, 0, 0);
                if (A02 != null) {
                    A02.A00 = true;
                    return A02;
                }
            } else {
                throw AnonymousClass7TE.A0z("Expected root to be a LithoLayoutResult");
            }
        }
        return null;
    }

    public final synchronized AnonymousClass2W3 A02(AnonymousClass2TY r13, int i, int i2, int i3, int i4, int i5) {
        AnonymousClass2W3 r4;
        Object obj;
        AnonymousClass2TY r5 = r13;
        2TR A04 = r13.A04();
        2V1 r1 = r13.A00;
        if (!(r13 instanceof C245313cf)) {
            int i6 = i;
            if (i < A04.A0s.size()) {
                String A0B = A04.A0B(i);
                AnonymousClass3XH r0 = r1.A03;
                if (r0 != null) {
                    obj = Integer.valueOf(r0.A00);
                } else {
                    obj = null;
                }
                StringBuilder A1A = AnonymousClass7TE.A1A();
                if (obj == null) {
                    obj = "notree";
                }
                A1A.append(obj);
                A1A.append(':');
                A1A.append(A0B);
                A1A.toString();
                r4 = new AnonymousClass2W3(r5, r13.A04(), i6, i2, i3, i4, i5);
                Set set = A04.A0h;
                if (set == null) {
                    set = AnonymousClass7TE.A1F();
                    A04.A0h = set;
                }
                set.add(r4);
            }
        }
        r4 = null;
        return r4;
    }

    public static final List A00(AnonymousClass2TY r12, int i, int i2) {
        01N A1H = 0jo.A1H();
        List list = r12.A03;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass2TY r6 = (AnonymousClass2TY) list.get(i3);
            int A06 = C51966G9m.A06(r6.A04().A0s);
            AnonymousClass2W3 A02 = AnonymousClass2W3.A08.A02(r6, C51970G9q.A07(A06, A06), r12.CGw(i3), r12.CHT(i3), i, i2);
            if (A02 != null) {
                A1H.add(A02);
            }
        }
        return 0jo.A1I(A1H);
    }
}
