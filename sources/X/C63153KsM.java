package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.KsM  reason: case insensitive filesystem */
public abstract class C63153KsM {
    public static final UOC A00(C347017w8 r10) {
        AnonymousClass5MM r1;
        Drawable A04 = r10.A04();
        if (!(A04 instanceof AnonymousClass5MM) || (r1 = (AnonymousClass5MM) A04) == null) {
            return null;
        }
        UOC A05 = r1.A05();
        int A042 = r1.A04();
        C306576Mr A06 = r1.A06();
        List list = A05.A07;
        int i = A05.A01;
        C16609Uy5 uy5 = A05.A02;
        Integer num = A05.A09;
        String str = A05.A06;
        boolean z = A05.A08;
        Integer num2 = A05.A05;
        Integer num3 = A05.A04;
        DbY.A1S(list, uy5);
        0qQ.A0B(A06, 4);
        return new UOC(uy5, A06, num, num2, num3, str, list, i, A042, z);
    }
}
