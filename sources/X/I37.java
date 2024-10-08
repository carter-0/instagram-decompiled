package X;

import androidx.compose.ui.Modifier;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public abstract class I37 {
    public static final void A01(C286575Wy r10, Modifier modifier, int i, int i2, int i3, int i4) {
        int i5;
        Modifier modifier2 = modifier;
        r10.ExV(-1573093780);
        int i6 = i4;
        int i7 = i4 & 1;
        int i8 = i3;
        if (i7 != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = G9t.A0O(r10, modifier) | i3;
        } else {
            i5 = i3;
        }
        int i9 = i;
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= G9t.A06(r10, i);
        }
        int i10 = i2;
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= G9t.A07(r10, i2);
        }
        if ((i5 & 147) != 146 || !r10.Bwn()) {
            if (i7 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(912032205, "com.instagram.schools.management.components.GraduationDateRow (GraduationDateRow.kt:23)");
            }
            C52636GaA.A0F(r10, modifier2, new C52748Gc0(A00(i, i2), true), C304346Dc.A00(r10, 2131963125), (i5 << 3) & 112);
            if (0fL.A02()) {
                0fL.A00(-1289638779);
            }
        } else {
            r10.Evl();
        }
        C286625Xd ASQ = r10.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new C59127J7j(modifier2, i9, i10, i8, i6);
        }
    }

    public static final String A00(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return "";
        }
        String format = new SimpleDateFormat(AnonymousClass000.A00(2361), Locale.US).format(new GregorianCalendar(i2, i - 1, 1).getTime());
        0qQ.A07(format);
        return format;
    }

    public static final void A02(C286575Wy r24, Modifier modifier, Integer num, Integer num2, int i, int i2) {
        int i3;
        String A00;
        long j;
        Modifier modifier2 = modifier;
        C286575Wy r13 = r24;
        r13.ExV(-1170190639);
        int i4 = i2;
        int i5 = i2 & 1;
        int i6 = i;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = G9t.A0O(r13, modifier2) | i;
        } else {
            i3 = i6;
        }
        Integer num3 = num;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= G9t.A0P(r13, num3);
        }
        Integer num4 = num2;
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i6 & 384) == 0) {
            i3 |= G9t.A0Q(r13, num4);
        }
        if ((i3 & 147) != 146 || !r13.Bwn()) {
            if (i5 != 0) {
                modifier2 = Modifier.A00;
            }
            if (0fL.A02()) {
                0fL.A01(-1917265533, "com.instagram.schools.management.components.GraduationDateOnboardingRow (GraduationDateRow.kt:33)");
            }
            r13.ExS(-1940286632);
            if (num == null || num2 == null) {
                A00 = C304346Dc.A00(r13, 2131968805);
            } else {
                A00 = A00(num3.intValue(), num4.intValue());
            }
            C286565Wx A0H = C51965G9l.A0H(r13, false);
            if (num == null || num2 == null) {
                j = C51967G9n.A0a(r13, -19107722).A0t;
            } else {
                j = C51970G9q.A0L(r13, -19056200);
            }
            C286565Wx.A0L(A0H, false);
            C285245Qk r12 = Modifier.A00;
            AnonymousClass5RD A0Z = C51969G9p.A0Z(r13, 0);
            int A002 = C287425a7.A00(r13);
            AnonymousClass5RM A04 = C286565Wx.A04(A0H);
            Modifier A01 = C287435a8.A01(r13, r12);
            C51973G9u.A0y(r13, A0H);
            C51971G9r.A12(r13, A0Z, A04);
            0sL r6 = C287485aD.A02;
            if (A0H.A0K || !C51972G9s.A1Q(r13, A002)) {
                C51971G9r.A13(r13, r6, A002);
            }
            C51965G9l.A18(r13, A01);
            C52636GaA.A02(r13, modifier2, (AnonymousClass5RW) null, (AnonymousClass2DO) null, C57124IPn.A00, A00, (String) null, (i3 << 3) & 112, 129788, j, false);
            C51969G9p.A14(r13, C287205Zk.A08(C51966G9m.A0V(C287195Zj.A04(r12)), 0.5f), C51965G9l.A0A(r13));
            if (C51967G9n.A1R(r13)) {
                0fL.A00(-563182016);
            }
        } else {
            r13.Evl();
        }
        C286625Xd ASQ = r13.ASQ();
        if (ASQ != null) {
            ASQ.A06 = new JG6(i6, i4, 37, modifier2, num4, num3);
        }
    }
}
