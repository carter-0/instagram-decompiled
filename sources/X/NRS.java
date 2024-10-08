package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class NRS extends 0ng {
    public final /* synthetic */ OI7 A00;

    public final void run() {
        Integer num;
        Boolean bool;
        OI7 oi7 = this.A00;
        List list = oi7.A09;
        list.size();
        ArrayList<C68979NcA> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof C68979NcA) {
                A1C.add(next);
            }
        }
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        for (C68979NcA ncA : A1C) {
            ((List) JTS.A0h(ncA.A00.BJy(), A1H)).add(ncA.A01);
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : list) {
            if (next2 instanceof C68978Nc9) {
                A1C2.add(next2);
            }
        }
        ArrayList<C68978Nc9> A1C3 = AnonymousClass7TE.A1C();
        for (Object next3 : A1C2) {
            C68978Nc9 nc9 = (C68978Nc9) next3;
            Iterable iterable = (Iterable) A1H.get(nc9.A01.BJy());
            if (iterable == null || !00k.A0u(iterable, nc9.A00.A0f())) {
                A1C3.add(next3);
            }
        }
        LinkedHashMap A1H2 = AnonymousClass7TE.A1H();
        for (C68978Nc9 nc92 : A1C3) {
            ((List) JTS.A0h(nc92.A01.BJy(), A1H2)).add(nc92.A00);
        }
        ArrayList<C68978Nc9> A1C4 = AnonymousClass7TE.A1C();
        for (Object next4 : A1C3) {
            if (((C68978Nc9) next4).A00.A01 > 0) {
                A1C4.add(next4);
            }
        }
        LinkedHashMap A1H3 = AnonymousClass7TE.A1H();
        for (C68978Nc9 nc93 : A1C4) {
            AnonymousClass2Ep r1 = nc93.A01;
            ((List) JTS.A0h(r1.BJy(), A1H3)).add(oi7.A05.Bm7(r1.BJy(), nc93.A00.A0f()));
        }
        LinkedHashMap A0o = C51975G9x.A0o(A1H3);
        Iterator A0s = AnonymousClass7TF.A0s(A1H3);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            A0o.put(A1J.getKey(), 0Yv.A1F((Iterable) A1J.getValue()));
        }
        2Dr r6 = oi7.A05;
        2Dr r3 = r6;
        synchronized (r3) {
            HashSet A1F = AnonymousClass7TE.A1F();
            A1F.addAll(A1H2.keySet());
            A1F.addAll(A1H.keySet());
            HashMap A1E = AnonymousClass7TE.A1E();
            HashMap A1E2 = AnonymousClass7TE.A1E();
            Iterator it = A1F.iterator();
            while (it.hasNext()) {
                DirectThreadKey directThreadKey = (DirectThreadKey) it.next();
                AnonymousClass48S A0P = r3.A0P(directThreadKey);
                if (A0P != null) {
                    ArrayList A1C5 = AnonymousClass7TE.A1C();
                    ArrayList A1C6 = AnonymousClass7TE.A1C();
                    List list2 = (List) A1H2.get(directThreadKey);
                    if (list2 != null) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            C254703su A0a = C66580MXl.A0a(it2);
                            2FR r12 = r3.A0G;
                            AnonymousClass3U9 r0 = A0P.A0I;
                            0qQ.A07(r0);
                            if (!r12.A00(A0a, r0)) {
                                C254703su A0G = A0P.A0G(A0a, true);
                                0qQ.A07(A0G);
                                if (A0G == A0a) {
                                    A1C5.add(A0G);
                                } else {
                                    A1C6.add(A0G);
                                }
                            }
                        }
                    }
                    ArrayList A1C7 = AnonymousClass7TE.A1C();
                    List list3 = (List) A1H.get(directThreadKey);
                    if (list3 != null) {
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            String A18 = AnonymousClass7TE.A18(it3);
                            C254703su A0K = A0P.A0K(A18);
                            2FW r15 = null;
                            if (A0K == null) {
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(AnonymousClass7TF.A1Q(A0K.A1j(AnonymousClass0t1.A01.A01(r3.A0A)) ? 1 : 0));
                                r15 = A0K.A10;
                            }
                            A1C7.add(new AnonymousClass9VM(r15, bool, AnonymousClass05K.A00, A18));
                            A0P.A0V(A18);
                        }
                    }
                    if (DbT.A1b(A1C6)) {
                        2Dr.A0H(r3, AnonymousClass3t7.A00(directThreadKey), A1C6, A0P.A0I.C6a());
                    }
                    UserSession userSession = r3.A0A;
                    String str = directThreadKey.A00;
                    if (str == null) {
                        str = "";
                    }
                    AnonymousClass7OQ.A02(userSession, directThreadKey, str, A1C5);
                    if (A1C5.isEmpty()) {
                        num = AnonymousClass05K.A0C;
                    } else {
                        num = AnonymousClass05K.A01;
                    }
                    2Kb r23 = new 2Kb(directThreadKey, num, A1C5, A1C7, A1C6, true);
                    r3.A06.A00(r23);
                    r3.A09.accept(r23);
                    ArrayList A1C8 = AnonymousClass7TE.A1C();
                    ArrayList A1C9 = AnonymousClass7TE.A1C();
                    A1C8.addAll(A1C5);
                    A1C8.addAll(A1C6);
                    if (list3 != null) {
                        A1C9.addAll(list3);
                    }
                    if (!182.A06(0Tu.A05, userSession, 36318892003302090L) || !A0P.A0X()) {
                        A1E.put(directThreadKey, A1C8);
                        A1E2.put(directThreadKey, A1C9);
                    } else {
                        r3.EKE(directThreadKey);
                    }
                }
            }
            if (!A1E.isEmpty() || !A1E2.isEmpty()) {
                r3.A0C.A0R(2EN.A05);
                r3.A0H.A0I(A1E, A1E2);
            }
        }
        Iterator A0s2 = AnonymousClass7TF.A0s(A0o);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            Object key = A1J2.getKey();
            0qQ.A07(key);
            AnonymousClass3U9 B33 = r6.B33((DirectThreadKey) key);
            if (B33 != null) {
                C331247Qd.A00(oi7.A01, B33, r6, (Collection) A1J2.getValue());
            }
        }
        list.clear();
        oi7.A00 = false;
        list.size();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRS(OI7 oi7) {
        super(1623504567, 4, false, true);
        this.A00 = oi7;
    }
}
