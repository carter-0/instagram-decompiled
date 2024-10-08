package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7Us  reason: invalid class name and case insensitive filesystem */
public final class C332377Us {
    public final UserSession A00;
    public final 0nV A01;
    public final SafetyInterventionsDatabase A02;
    public final ConcurrentHashMap A03;
    public final C262224Cq A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 136 A0A;

    public final synchronized void A03(String str) {
        Set set;
        Object value;
        Set A0j;
        Map map = (Map) this.A08.getValue();
        if (str == null) {
            set = 00k.A0k(0Yv.A1F(map.values()));
        } else {
            set = (Set) map.get(str);
            if (set == null) {
                set = 0sl.A00;
            }
        }
        05G r3 = this.A09;
        do {
            value = r3.getValue();
            A0j = 00k.A0j((Set) value);
            A0j.removeAll(set);
        } while (!r3.AIY(value, 00k.A0k(A0j)));
        A02();
    }

    public final synchronized void A04(List list) {
        Object value;
        0qQ.A0B(list, 0);
        05G r2 = this.A09;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, 094.A00(list, (Set) value)));
        A02();
    }

    public /* synthetic */ C332377Us(UserSession userSession) {
        C332387Uu r5 = SafetyInterventionsDatabase.A00;
        Class<SafetyInterventionsDatabase> cls = SafetyInterventionsDatabase.class;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
        if (igRoomDatabase == null) {
            synchronized (r5) {
                igRoomDatabase = (IgRoomDatabase) userSession.A00(cls);
                if (igRoomDatabase == null) {
                    Context context = C60960kU.A00;
                    0qQ.A07(context);
                    1VA A002 = 1V9.A00(context, cls, 1V8.A00(userSession, r5));
                    1VC.A00(A002, 1019772572, 1381699147, false);
                    A002.A01();
                    igRoomDatabase = (IgRoomDatabase) A002.A00();
                    userSession.A04(cls, igRoomDatabase);
                }
            }
        }
        AnonymousClass12T r2 = AnonymousClass12T.A00;
        this.A00 = userSession;
        this.A02 = (SafetyInterventionsDatabase) igRoomDatabase;
        0nV AOJ = r2.AOJ(36726424, 3);
        this.A01 = AOJ;
        AnonymousClass19S A022 = 19E.A02(AOJ);
        this.A04 = A022;
        0sl r1 = 0sl.A00;
        this.A09 = 106.A01(r1);
        this.A08 = 106.A01(0Yt.A0E());
        this.A05 = 106.A01(r1);
        this.A07 = 106.A01(0Yt.A0E());
        this.A06 = 106.A01(0Yt.A0E());
        this.A0A = new 136();
        this.A03 = new ConcurrentHashMap();
        AnonymousClass9KE r22 = new AnonymousClass9KE(this, (AnonymousClass4D7) null, 0);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A022);
    }

    public static final Set A00(C332377Us r0, C67559Mpt mpt, Set set) {
        if (mpt == null) {
            return set;
        }
        0sl r02 = (Iterable) ((Map) r0.A07.getValue()).get(mpt);
        if (r02 == null) {
            r02 = 0sl.A00;
        }
        return 00k.A0l(set, 00k.A0k(r02));
    }

    public static final Set A01(C332377Us r0, C67555Mpp mpp, Set set) {
        if (mpp == null) {
            return set;
        }
        0sl r02 = (Iterable) ((Map) r0.A06.getValue()).get(mpp);
        if (r02 == null) {
            r02 = 0sl.A00;
        }
        return 00k.A0l(set, 00k.A0k(r02));
    }

    private final void A02() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (AnonymousClass9VE r8 : (Iterable) this.A09.getValue()) {
            for (AnonymousClass9VG r2 : r8.A07) {
                String str = r2.A00;
                if (str != null) {
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        linkedHashMap.put(str, obj);
                    }
                    ((Set) obj).add(r8);
                } else {
                    linkedHashSet.add(r8);
                }
                for (AnonymousClass9VD r3 : r2.A01) {
                    for (Object next : r3.A01) {
                        if (next != C67559Mpt.UNDEFINED) {
                            Object obj2 = linkedHashMap2.get(next);
                            if (obj2 == null) {
                                obj2 = new LinkedHashSet();
                                linkedHashMap2.put(next, obj2);
                            }
                            ((Set) obj2).add(r8);
                        }
                    }
                    C67555Mpp mpp = r3.A00;
                    if (mpp != C67555Mpp.UNDEFINED) {
                        Object obj3 = linkedHashMap3.get(mpp);
                        if (obj3 == null) {
                            obj3 = new LinkedHashSet();
                            linkedHashMap3.put(mpp, obj3);
                        }
                        ((Set) obj3).add(r8);
                    }
                }
            }
        }
        this.A08.Epw(linkedHashMap);
        this.A05.Epw(linkedHashSet);
        this.A07.Epw(linkedHashMap2);
        this.A06.Epw(linkedHashMap3);
    }
}
