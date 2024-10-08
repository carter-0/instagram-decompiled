package X;

import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ebk  reason: case insensitive filesystem */
public abstract class C48265Ebk {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        Map A0E;
        String str;
        AnonymousClass6Tm r3 = r17;
        Object A01 = r3.A01();
        0qQ.A0C(A01, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        C276544tV r7 = (C276544tV) A01;
        List list = r3.A00;
        0sm r9 = (Map) list.get(1);
        if (r9 == null) {
            r9 = 0Yt.A0E();
        }
        C276544tV r1 = (C276544tV) list.get(2);
        0sn r8 = (List) list.get(3);
        if (r8 == null) {
            r8 = 0sn.A00;
        }
        C307786Rm r5 = (C307786Rm) Dba.A0V(r3, 4);
        C307896Rx r6 = r16;
        if (r1 != null) {
            A0E = C46611Dhr.A0B(r6, r1, 35);
        } else {
            A0E = 0Yt.A0E();
        }
        C331157Pu A07 = FH9.A07(r6);
        0lg A0A = C308206Td.A0A(r5);
        FragmentActivity A03 = C308206Td.A03(r5);
        if (A07 == null && (A07 = FH9.A05(A03, A0A)) == null) {
            1Kn.A02("BloksBottomSheetHelper", "Can't push bottom sheet outside controller");
            return null;
        }
        C229382nI A06 = C308206Td.A06(r6);
        C46615Dhv A00 = C46616Dhw.A00((C20880X2h) null, r5, r6, C46611Dhr.A02(r7));
        C46622Di2 A012 = FH9.A01(A06, A00, r5, r6, r7, r8, r9, A0E);
        A012.A0C = A07;
        C276544tV A002 = C49732F3x.A00(r8);
        try {
            str = C46611Dhr.A08(r7);
        } catch (IllegalArgumentException unused) {
            str = null;
        }
        A07.A0F(A012, FH9.A08(A03, A012, A00, r5, r6, A002, str));
        return null;
    }
}
