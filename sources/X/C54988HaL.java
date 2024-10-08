package X;

/* renamed from: X.HaL  reason: case insensitive filesystem */
public abstract class C54988HaL {
    public static final void A00(C54689HOu hOu, 0wc r2, C254523sc r3) {
        0qQ.A0B(r2, 1);
        if (r3 != null) {
            0jB A01 = r3.A01();
            0Aj A0e = AnonymousClass7TE.A0e(r2, "instagram_ad_end_scene_dismissal");
            if (A0e.isSampled()) {
                String A1C = C51966G9m.A1C(C271774jZ.A5I, A01);
                if (A1C == null) {
                    A1C = "";
                }
                C51965G9l.A1I(A0e, A1C);
                C51965G9l.A1C(hOu, A0e);
                C51965G9l.A1L(A0e, C51966G9m.A1C(C271774jZ.A9L, A01));
                A0e.A9F("a_pk", C51966G9m.A13(C271774jZ.A0Z, A01));
                C51965G9l.A1D(A0e, C51966G9m.A13(C271774jZ.A0C, A01));
                C51965G9l.A1Q(A0e, C51966G9m.A1C(C271774jZ.A6p, A01));
                C51970G9q.A18(A0e, DbY.A04((Number) A01.A01(C271774jZ.A5K)));
                A0e.AAJ("delivery_flags", C51966G9m.A1C(C271774jZ.A26, A01));
                A0e.AAJ("follow_status", C51966G9m.A1C(C271774jZ.A2v, A01));
                C51965G9l.A1K(A0e, C51966G9m.A1C(C271774jZ.A60, A01));
                A0e.AAJ("inventory_source", C51966G9m.A1C(C271774jZ.A3q, A01));
                A0e.A9F("m_ix", C51966G9m.A13(C271774jZ.A3m, A01));
                A0e.AAJ("ranking_session_id", C51966G9m.A1C(C271774jZ.A6q, A01));
                DbX.A1L(A0e);
            }
        }
    }
}
