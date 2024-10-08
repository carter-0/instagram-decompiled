package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: X.5CO  reason: invalid class name */
public final class AnonymousClass5CO {
    public final UserSession A00;
    public final 1L5 A01;
    public final String A02;
    public final String A03;

    public final HashMap A02(String str, List list) {
        Collection<AnonymousClass9IV> values;
        0qQ.A0B(list, 0);
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        UserSession userSession = this.A00;
        HashMap hashMap4 = null;
        if (182.A06(0Tu.A05, userSession, 36325819777299706L)) {
            hashMap4 = new HashMap();
        }
        ArrayList<AnonymousClass9IV> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((AnonymousClass9IV) next).A00 instanceof C253533qw) {
                arrayList.add(next);
            }
        }
        for (AnonymousClass9IV r7 : arrayList) {
            int ordinal = ((C230472pg) ((AnonymousClass9J4) r7.A01).A01).ordinal();
            if (ordinal == 2 || ordinal == 3) {
                A01(r7, hashMap2, hashMap4);
            } else if (ordinal == 1) {
                A01(r7, hashMap3, hashMap4);
            }
        }
        if (!hashMap2.isEmpty()) {
            String str2 = this.A02;
            Collection values2 = hashMap2.values();
            0qQ.A07(values2);
            hashMap.put(str2, AnonymousClass5EX.A00(userSession, values2, true));
        }
        if (!hashMap3.isEmpty()) {
            String str3 = this.A03;
            Collection values3 = hashMap3.values();
            0qQ.A07(values3);
            hashMap.put(str3, AnonymousClass5EX.A00(userSession, values3, false));
        }
        if (!(str == null || hashMap4 == null || (values = hashMap4.values()) == null)) {
            for (AnonymousClass9IV r1 : values) {
                1L5 r0 = this.A01;
                if (r0 != null) {
                    r0.EGZ(r1, str);
                }
            }
        }
        return hashMap;
    }

    public static final AnonymousClass5EV A00(C253533qw r15) {
        String str = r15.A0F;
        ArrayList A1M = 0sr.A1M(new Long[]{Long.valueOf(r15.A0A)});
        long j = r15.A09;
        return new AnonymousClass5EV(str, r15.A0H, A1M, r15.A00, r15.A03, r15.A04, r15.A02, r15.A08, r15.A01, r15.A07, r15.A05, j);
    }

    private final void A01(AnonymousClass9IV r36, Map map, Map map2) {
        AnonymousClass9IV r1;
        long j;
        long j2;
        AnonymousClass9IV r4 = r36;
        C253513qu r7 = (C253513qu) r4.A00;
        0qQ.A0C(r7, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata.SeenStateSignalData");
        C253533qw r5 = (C253533qw) r7;
        String str = r5.A0E;
        Map map3 = map;
        Map map4 = map2;
        if (map3.containsKey(str)) {
            AnonymousClass5EW r0 = (AnonymousClass5EW) map3.get(str);
            if (r0 != null) {
                List list = r0.A06;
                ListIterator listIterator = list.listIterator();
                while (true) {
                    if (!listIterator.hasNext()) {
                        break;
                    }
                    AnonymousClass5EV r3 = (AnonymousClass5EV) listIterator.next();
                    if (0qQ.A0K(r5.A0F, r3.A09)) {
                        long j3 = r5.A0A;
                        List list2 = r3.A0B;
                        if (!list2.contains(-1L) || j3 == -1) {
                            if (!list2.contains(-1L) || j3 != -1) {
                                list2.add(Long.valueOf(j3));
                            }
                            long j4 = r5.A09;
                            long j5 = new long[]{r3.A00, j4}[0];
                            if (j4 > j5) {
                                j5 = j4;
                            }
                            r3.A00 = j5;
                        } else {
                            listIterator.remove();
                        }
                    }
                }
                list.add(A00(r5));
                if (map2 != null && (r1 = (AnonymousClass9IV) map4.get(str)) != null) {
                    if (r7 instanceof C253533qw) {
                        j = ((C253533qw) r7).A0A;
                    } else {
                        j = -1;
                    }
                    C253513qu r6 = (C253513qu) r1.A00;
                    if (r6 instanceof C253533qw) {
                        j2 = ((C253533qw) r6).A0A;
                    } else {
                        j2 = -1;
                    }
                    if (j > j2) {
                        map4.put(str, r4);
                    }
                    long A002 = r7.A00();
                    long A003 = r6.A00();
                    if (A002 > A003) {
                        A002 = A003;
                    }
                    AnonymousClass9IV r42 = (AnonymousClass9IV) map4.get(str);
                    if (r42 != null) {
                        C253513qu r02 = (C253513qu) r42.A00;
                        if (A002 != r02.A00()) {
                            C253533qw r03 = (C253533qw) r02;
                            AnonymousClass9J4 r13 = (AnonymousClass9J4) r42.A01;
                            String str2 = r03.A0E;
                            String str3 = r03.A0G;
                            String str4 = r03.A0F;
                            long j6 = r03.A0A;
                            float f = r03.A00;
                            int i = r03.A06;
                            int i2 = r03.A03;
                            int i3 = r03.A04;
                            int i4 = r03.A02;
                            int i5 = r03.A08;
                            int i6 = r03.A01;
                            int i7 = r03.A07;
                            String str5 = str2;
                            String str6 = r03.A0H;
                            C230472pg r15 = (C230472pg) r13.A01;
                            map4.put(str, new AnonymousClass9IV(r13, (C253513qu) new C253533qw(r15, str5, str3, str4, r03.A0C, r03.A0D, str6, f, i, i2, i3, i4, i5, i6, i7, r03.A05, j6, A002)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        int ordinal = r5.A0B.ordinal();
        String str7 = r5.A0G;
        ArrayList A1M = 0sr.A1M(new AnonymousClass5EV[]{A00(r5)});
        map3.put(str, new AnonymousClass5EW(str, str7, r5.A0C, r5.A0D, A1M, ordinal, r5.A06));
        if (map2 != null) {
            map4.put(str, r4);
        }
    }

    public AnonymousClass5CO(UserSession userSession, 1L5 r2, String str, String str2) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }
}
