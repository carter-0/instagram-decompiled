package X;

import java.util.List;

/* renamed from: X.Koy  reason: case insensitive filesystem */
public abstract class C62946Koy {
    public final int A00() {
        if (this instanceof C62434Kfk) {
            return 1;
        }
        return 0;
    }

    public final void A01(AnonymousClass9OY r19, C62933Kol kol) {
        C370038vj r0;
        C370058vl r02;
        0sn A1C;
        C2802350v A00;
        XCH A01;
        C366688pV r03;
        AnonymousClass9OY r3 = r19;
        C62933Kol kol2 = kol;
        if (this instanceof C62434Kfk) {
            C59777JXw jXw = C59777JXw.A00;
            JYK jyk = JYK.VIDEO;
            C59764JXc A002 = C59764JXc.A00(jyk);
            List list = r3.A0m;
            0qQ.A0B(list, 0);
            C59764JXc A003 = C59764JXc.A00(list);
            C370018vh r04 = r3.A0C;
            if (r04 != null) {
                r03 = r04.A01;
            } else {
                r03 = null;
            }
            C59764JXc A004 = C59764JXc.A00(r03);
            List list2 = r3.A0j;
            0qQ.A0B(list2, 0);
            C59764JXc A005 = C59764JXc.A00(list2);
            0sn r05 = r3.A0J.A02;
            if (r05 == null) {
                r05 = 0sn.A00;
            }
            C59764JXc A006 = C59764JXc.A00(r05);
            String A0b = AnonymousClass7TF.A0b();
            kol2.A03 = AnonymousClass7TE.A1I(JYI.A00(A002, A005, jXw, A006, A004, A003, new Jv8((C366688pV) null, (KN4) null, jyk, A0b, AnonymousClass7TF.A0q(A0b, 0), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C())));
            JYL jyl = JYL.VIDEO;
            0qQ.A0B(jyl, 0);
            kol2.A01 = jyl;
            return;
        }
        C370018vh r06 = r3.A0C;
        if (r06 != null && (r0 = r06.A02) != null && (r02 = r0.A04) != null) {
            List<A6D> list3 = r02.A03;
            if (list3 == null) {
                A1C = 0sn.A00;
            } else {
                A1C = AnonymousClass7TE.A1C();
                for (A6D a6d : list3) {
                    C310416b1 r32 = a6d.A01;
                    C369458un r2 = a6d.A02;
                    AnonymousClass513 r07 = a6d.A00;
                    if (!(r07 == null || (A00 = r07.A00()) == null || (A01 = C18686Vwk.A01(A00, r32, r2)) == null)) {
                        A1C.add(A01);
                    }
                }
            }
            kol2.A02 = A1C;
        }
    }
}
