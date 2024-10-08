package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gh0  reason: case insensitive filesystem */
public final class C53009Gh0 extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final UserSession A06;
    public final 1Xj A07;
    public final C62037KWw A08;
    public final C55685Hli A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;

    public C53009Gh0(UserSession userSession, 1Xj r6, C62037KWw kWw, C55685Hli hli, List list, List list2, List list3) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1M(list, list2, list3);
        0qQ.A0B(kWw, 7);
        this.A06 = userSession;
        this.A07 = r6;
        this.A09 = hli;
        this.A08 = kWw;
        02z A10 = DbS.A10(list);
        this.A0E = A10;
        this.A00 = C51971G9r.A0T(this, A10);
        02z A102 = DbS.A10(list2);
        this.A0A = A102;
        this.A01 = C51971G9r.A0T(this, A102);
        02z A103 = DbS.A10(list3);
        this.A0F = A103;
        this.A02 = C51971G9r.A0T(this, A103);
        02z A104 = C51970G9q.A10(true);
        this.A0D = A104;
        this.A05 = C51971G9r.A0T(this, A104);
        Boolean A0u = AnonymousClass7TE.A0u();
        02z A105 = DbS.A10(A0u);
        this.A0C = A105;
        this.A04 = C51971G9r.A0T(this, A105);
        02z A106 = DbS.A10(A0u);
        this.A0B = A106;
        this.A03 = C51971G9r.A0T(this, A106);
        ArrayList<Object> A1C = AnonymousClass7TE.A1C();
        for (Object next : list2) {
            if (next instanceof H3E) {
                A1C.add(next);
            }
        }
        for (Object A012 : A1C) {
            C58105ImR.A01(this, A012, C318116oQ.A00(this), 43);
        }
    }
}
