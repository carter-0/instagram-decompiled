package X;

import java.util.List;

/* renamed from: X.Ty1  reason: case insensitive filesystem */
public abstract class C14541Ty1 {
    public static final boolean A01(C276544tV r5) {
        C276544tV A07;
        0qQ.A0B(r5, 0);
        C276544tV A072 = r5.A07(132);
        if (A072 == null || A072.A04 != 13366 || (A07 = A072.A07(54)) == null) {
            return false;
        }
        boolean A0R = A07.A0R(35, false);
        String A0F = A07.A0F();
        if (A0F == null) {
            A0F = "start";
        }
        if (!A0R || !A0F.equals("start")) {
            return false;
        }
        return true;
    }

    public static final boolean A00(Tq8 tq8, int i) {
        List list;
        C14538Txy txy;
        if (tq8 == null || (list = tq8.A03) == null || (txy = (C14538Txy) list.get(i)) == null) {
            return false;
        }
        return A01(txy.A01);
    }
}
