package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ot  reason: invalid class name and case insensitive filesystem */
public final class C241323Ot {
    public static 0wc A00;
    public static final C241323Ot A01 = new Object();

    public static final void A03(AnonymousClass9J8 r4, UserSession userSession, 1Xg r6) {
        0qQ.A0B(r4, 1);
        C241323Ot r3 = A01;
        List<1Xg> singletonList = Collections.singletonList(r6);
        0qQ.A07(singletonList);
        for (1Xg A06 : singletonList) {
            r3.A06(r4, userSession, A06, (Integer) null);
        }
    }

    public static final void A04(AnonymousClass9J8 r2, UserSession userSession, 1Xg r4, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 2);
        A01.A06(r2, userSession, r4, Integer.valueOf(i));
    }

    public static final void A07(AnonymousClass9J8 r8, UserSession userSession, List list, List list2) {
        Boolean bool;
        0qQ.A0B(userSession, 3);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            1Xg r3 = (1Xg) it.next();
            1Xj A02 = 1Xi.A02(r3.A05);
            if (A02 != null) {
                bool = Boolean.valueOf(A02.CcK());
            } else {
                bool = null;
            }
            boolean A08 = C228342lQ.A08(userSession, 1Au.A00(userSession));
            if (!list2.contains(r3) && (0qQ.A0K(bool, false) || (0qQ.A0K(bool, true) && !A08))) {
                arrayList.add(r3);
            }
        }
        if (!arrayList.isEmpty()) {
            C241323Ot r32 = A01;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                r32.A06(r8, userSession, (1Xg) it2.next(), (Integer) null);
            }
        }
    }

    public static final AnonymousClass9J8 A00(1FS r4) {
        return new AnonymousClass9J8(r4.A04, r4.A0A, r4.A09);
    }

    public static final 0wc A01(UserSession userSession) {
        0wc r0 = A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0kM r1 = new AnonymousClass0kM(userSession);
        r1.A01 = "feed_timeline";
        0wc A002 = r1.A00();
        A00 = A002;
        return A002;
    }

    public static final String A02(String str) {
        if (str == null) {
            return str;
        }
        int hashCode = str.hashCode();
        if (hashCode != -76555191) {
            if (hashCode != 1756132) {
                if (hashCode != 1037456052 || !str.equals("follow_hashtag_story")) {
                    return str;
                }
                return "hashtag_connected";
            } else if (str.equals("media_or_ad")) {
                return "user_connected";
            } else {
                return str;
            }
        } else if (str.equals("explore_story")) {
            return "explore_unconnected";
        } else {
            return str;
        }
    }

    public static final void A05(AnonymousClass9J8 r5, UserSession userSession, 1Xg r7, int i) {
        0wc A012 = A01(userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_feed_item_inserted");
        if (A002.isSampled()) {
            A002.AAJ(Dbf.A02(21, 10, 84), r5.A03);
            A002.AAJ("request_type", r5.A01.toString());
            A002.AAJ("feed_item_type", r7.A06.toString());
            A002.A9F("expected_position", Long.valueOf((long) i));
            1Xj A02 = 1Xi.A02(r7.A05);
            if (A02 != null) {
                String A30 = A02.A30();
                if (A30 != null) {
                    A002.A9F("media_id", 00y.A0n(10, A30));
                    List list = A02.A0e;
                    A002.AAJ("delivery_flags", C243413Yr.A00(list));
                    A002.A7p("is_ad", Boolean.valueOf(A02.CcK()));
                    A002.AAJ("inventory_source", A02(A02.A0C.BIl()));
                    if (list.contains(AnonymousClass3PG.NETWORK)) {
                        A002.AAJ(TraceFieldType.RequestID, r5.A02);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            A002.Cgf();
        }
    }

    private final void A06(AnonymousClass9J8 r6, UserSession userSession, 1Xg r8, Integer num) {
        0wc A012 = A01(userSession);
        0Aj A002 = A012.A00(A012.A00, "instagram_feed_item_removed");
        if (A002.isSampled()) {
            A002.AAJ(Dbf.A02(21, 10, 84), r6.A03);
            A002.AAJ(TraceFieldType.RequestID, r6.A02);
            A002.AAJ("request_type", r6.A01.toString());
            1Xj A02 = 1Xi.A02(r8.A05);
            if (A02 != null) {
                String A30 = A02.A30();
                if (A30 != null) {
                    A002.A9F("media_id", 00y.A0n(10, A30));
                    A002.A7p("is_ad", Boolean.valueOf(A02.CcK()));
                    A002.AAJ("delivery_flags", C243413Yr.A00(A02.A0e));
                    A002.AAJ("feed_item_type", r8.A06.toString());
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            if (num != null) {
                A002.A9F("expected_position", Long.valueOf((long) num.intValue()));
            }
            A002.Cgf();
        }
    }
}
