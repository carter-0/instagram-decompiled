package X;

import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.43s  reason: invalid class name and case insensitive filesystem */
public final class C2599543s implements C2598643j {
    public final UserSession A00;
    public final 2Dm A01;

    public C2599543s(UserSession userSession, 2Dm r3) {
        0qQ.A0B(r3, 2);
        this.A00 = userSession;
        this.A01 = r3;
    }

    public final AnonymousClass6BN E4Y(AnonymousClass651 r13, AnonymousClass653 r14, List list, Map map, 0sL r17, 0sL r18, boolean z) {
        AnonymousClass1qK r5;
        Map map2 = map;
        0qQ.A0B(map2, 0);
        0qQ.A0B(r13, 1);
        0qQ.A0B(r14, 2);
        0sL r4 = r17;
        0qQ.A0B(r4, 5);
        String str = (String) map2.get(RealtimeProtocol.THREAD_ID);
        String str2 = (String) map2.get(RealtimeProtocol.ITEM_ID);
        if (str == null || str2 == null || !0qQ.A0K(r14.A00, "replace")) {
            return AnonymousClass6BO.A00;
        }
        2Eq r1 = (2Eq) r4.invoke(str, r13);
        if (r1 == null) {
            return C21215XPd.A00;
        }
        C70148Ny2.A00(this.A00, r13, str, (String) null);
        try {
            String str3 = C44677Civ.parseFromJson(16P.A00(r14.A02)).A00;
            2Dr r3 = this.A01;
            AnonymousClass48S A0P = r3.A0P(r1.BJy());
            if (A0P == null) {
                0wb.A03("Null thread entry", "Entry should exist before function call");
            } else {
                synchronized (A0P) {
                    C254703su A0J = A0P.A0J(str2);
                    if (A0J == null) {
                        0wj.A01.AEf("Message is missing from thread entry", 20134884).report();
                        r5 = null;
                    } else {
                        synchronized (A0J) {
                            1Xj r0 = A0J.A0s;
                            if (r0 != null && (r0.A0C.Br5() == null || !A0J.A0s.A0C.Br5().contains(str3))) {
                                1Xj r42 = A0J.A0s;
                                Object Br5 = r42.A0C.Br5();
                                if (Br5 == null) {
                                    Br5 = new ArrayList();
                                }
                                List A012 = 0u4.A01(Br5);
                                A012.add(str3);
                                r42.A0C.EjW(A012);
                                A0J.A2C = true;
                            }
                        }
                        r5 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A0J, (List) null, (List) null, Collections.singletonList(A0J), false);
                    }
                }
                if (r5 != null) {
                    r3.A06.A00(r5);
                    r3.A09.accept(r5);
                    if (z) {
                        2Dr.A0F(r3, A0P);
                    }
                }
            }
            return AnonymousClass6BL.A00;
        } catch (Exception e) {
            0wb.A01.Ew2("invalid_direct_seed_shared_album_format", "Invalid DirectSeedSharedAlbum format", e);
            return new AnonymousClass6BQ(e, "invalid_direct_seed_shared_album_format", "Invalid DirectSeedSharedAlbum format");
        }
    }
}
