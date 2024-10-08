package X;

import java.util.Map;

/* renamed from: X.8dG  reason: invalid class name and case insensitive filesystem */
public final class C359648dG {
    public final /* bridge */ /* synthetic */ void A00(C359628dE r6, String str, String str2, Map map) {
        01e r2;
        0lg r22 = ((C359618dD) r6).A00;
        0qQ.A0B(r22, 0);
        C359858db r23 = (C359858db) r22.A01(C359858db.class, C359868dc.A00);
        String A0R = 002.A0R(C359728dO.A00(map, str, str2), "loading_screen_query");
        0qQ.A0B(A0R, 0);
        C359778dT r3 = r23.A02;
        synchronized (r3) {
            r2 = r23.A00;
            r2.A03(A0R);
        }
        String A0R2 = 002.A0R(C359728dO.A00(map, str, str2), "loaded_screen_query");
        0qQ.A0B(A0R2, 0);
        synchronized (r3) {
            r2.A03(A0R2);
        }
    }
}
