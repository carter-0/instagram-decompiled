package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3GA  reason: invalid class name */
public final class AnonymousClass3GA {
    public C262224Cq A00;
    public int A01;
    public final 1Ng A02;
    public final 1wn A03;
    public final UserSession A04;
    public final AnonymousClass3G9 A05;
    public final Map A06 = new HashMap();
    public final AnonymousClass2rI A07;
    public final Integer A08;

    public static final void A00(AnonymousClass3Q2 r5, AnonymousClass3GA r6) {
        if (r5 != null) {
            if ((!r5.A5V || r5.A0v()) && !r5.A67) {
                1Xj r0 = r5.A1C;
                if (r0 != null) {
                    AnonymousClass2rI r4 = r6.A07;
                    AnonymousClass2rW.A01((AnonymousClass2rW) r4.A00, 1Xi.A01(r0), 0, true);
                    r4.A0A(-1);
                } else {
                    0wb.A03("placing_unfinished_pendingmedia", "Feed pending media is being placed without a valid Media instance.");
                }
            }
            if (r5.A0w() || r5.A0v()) {
                if (182.A06(0Tu.A05, r6.A04, 36326438252590854L)) {
                    C262224Cq r3 = r6.A00;
                    if (r3 == null) {
                        0qQ.A0F("mediaPlacerScope");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) r5, (Object) r6, (AnonymousClass4D7) null, 19);
                    1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
                    return;
                }
            }
            A01(r5, r6);
        }
    }

    public static final void A01(AnonymousClass3Q2 r2, AnonymousClass3GA r3) {
        r3.A06.remove(r2.A35);
        A02(r3);
        if (1ua.A0F) {
            1ua.A0F = false;
        }
    }

    public static final void A02(AnonymousClass3GA r8) {
        UserSession userSession = r8.A04;
        ArrayList A052 = 28K.A00(userSession).A05(r8.A08);
        Iterator it = A052.iterator();
        while (it.hasNext()) {
            AnonymousClass3Q2 r5 = (AnonymousClass3Q2) it.next();
            if (r5.A1f == AnonymousClass3QD.CONFIGURED && r5.A0v == null) {
                C262224Cq r4 = r8.A00;
                if (r4 == null) {
                    0qQ.A0F("mediaPlacerScope");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) r5, (Object) r8, (AnonymousClass4D7) null, 20);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r4);
                28K.A00(userSession).A04(r5.A35, "Configured");
                28E.A00(userSession).A04();
                r8.A06.put(r5.A35, r5);
            }
        }
        Map map = r8.A06;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry value : map.entrySet()) {
            arrayList.add(value.getValue());
        }
        A052.addAll(arrayList);
        AnonymousClass2rI r1 = r8.A07;
        if (!A052.isEmpty() || !r1.A0e.isEmpty()) {
            List list = r1.A0e;
            list.clear();
            list.addAll(A052);
            r1.A0A(-1);
        }
        if (r8.A01 != A052.size()) {
            r8.A01 = A052.size();
        }
    }

    public AnonymousClass3GA(UserSession userSession, AnonymousClass2rI r3, AnonymousClass3G9 r4, Integer num) {
        this.A04 = userSession;
        this.A08 = num;
        this.A07 = r3;
        this.A05 = r4;
        this.A02 = AnonymousClass1Nd.A00(userSession);
        this.A03 = new AnonymousClass3GB(this);
    }
}
