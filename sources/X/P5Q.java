package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class P5Q implements AnonymousClass7B5 {
    public final int A00;
    public final Object A01;

    public P5Q(C327367Am r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final AnonymousClass7FW AXV(Context context, UserSession userSession, AnonymousClass9HC r36, AnonymousClass7LQ r37, AnonymousClass7L2 r38, 17i r39) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AnonymousClass9HC r9 = r36;
        AnonymousClass7LQ r10 = r37;
        AnonymousClass7L2 r11 = r38;
        if (this.A00 != 0) {
            return C327367Am.A08(context2, userSession2, r9, r10, r11);
        }
        AnonymousClass9HO r8 = ((C327367Am) this.A01).A0C;
        0qQ.A0B(context2, 0);
        C51974G9v.A1P(userSession2, r11, r10, r9);
        0qQ.A0B(r8, 5);
        AnonymousClass79c A04 = AnonymousClass79S.A04(context2, userSession2, r8, r9, r10, r11, AnonymousClass79T.A00.A04(userSession2, r10), r10.A0U, true);
        CharSequence charSequence = A04.A04;
        boolean z = A04.A0D;
        boolean z2 = A04.A0B;
        boolean z3 = A04.A0G;
        AnonymousClass7FE r112 = A04.A03;
        AnonymousClass7FT r102 = A04.A02;
        AnonymousClass5FV r92 = A04.A00;
        List list = A04.A08;
        String str = A04.A06;
        boolean z4 = A04.A0E;
        boolean z5 = A04.A0A;
        boolean z6 = A04.A09;
        C67065Mhg mhg = A04.A01;
        boolean z7 = A04.A0C;
        boolean z8 = z6;
        boolean z9 = z5;
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z2;
        boolean z13 = z;
        List list2 = list;
        return new AnonymousClass79c(r92, mhg, r102, r112, charSequence, str, A04.A07, list2, z13, z12, z11, z10, z9, false, z8, z7);
    }
}
