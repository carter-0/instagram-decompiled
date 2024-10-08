package X;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6Rx  reason: invalid class name and case insensitive filesystem */
public final class C307896Rx {
    public static final C307906Ry A0G = new Object();
    public C307906Ry A00;
    public C276744tp A01;
    public final C276634te A02;
    public final C307786Rm A03;
    public final C307456Qe A04;
    public final AnonymousClass6SD A05;
    public final C229652no A06;
    public final C307916Rz A07 = new C307916Rz();
    public final C277014uI A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final WeakReference A0C;
    public final List A0D;
    public final Map A0E;
    public final Map A0F;

    public static C307896Rx A00(C276634te r13, C307896Rx r14, List list) {
        C307896Rx r0 = r14;
        List list2 = list;
        C276634te r1 = r13;
        C307786Rm r2 = r14.A03;
        C277014uI r7 = r14.A08;
        if (list == null) {
            list2 = r14.A0D;
        }
        Map map = r14.A0E;
        C307456Qe r4 = r14.A04;
        AnonymousClass6SD r5 = r14.A05;
        Map map2 = r14.A0F;
        C276744tp r8 = r0.A01;
        C229652no r6 = r0.A06;
        String str = r0.A0B;
        if (r1 == null) {
            r1 = r0.A02;
        }
        String str2 = r0.A0A;
        return new C307896Rx(r1, r2, (C307786Rm) r0.A0C.get(), r4, r5, r6, r7, r8, r0.A09, str, str2, list2, map, map2);
    }

    public static C307896Rx A01(C307786Rm r12, C277014uI r13, List list) {
        C229392nJ r0 = r12.A02;
        C276744tp A052 = C307476Qg.A05(r12);
        return new C307896Rx((C276634te) null, r12, (C307786Rm) null, (C307456Qe) null, (AnonymousClass6SD) null, r0.AgE().AgJ(), r13, A052, AnonymousClass05K.A01, C307476Qg.A07(r12), (String) null, list, (Map) null, (Map) null);
    }

    public C307896Rx(C276634te r3, C307786Rm r4, C307786Rm r5, C307456Qe r6, AnonymousClass6SD r7, C229652no r8, C277014uI r9, C276744tp r10, Integer num, String str, String str2, List list, Map map, Map map2) {
        C307906Ry r1 = A0G;
        if (r10 instanceof AnonymousClass6S1) {
            this.A01 = r10;
        } else {
            this.A01 = new AnonymousClass6S1(r10);
        }
        this.A00 = r1;
        if (list == null) {
            this.A0D = Collections.emptyList();
        } else {
            this.A0D = list;
        }
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = r9;
        this.A0E = map;
        this.A04 = r6;
        this.A05 = r7;
        this.A0F = map2;
        this.A06 = r8;
        this.A0B = str;
        this.A09 = num;
        this.A0C = new WeakReference(r5);
        C307916Rz r0 = this.A07;
        r0.A00.add(new Object());
        if (str2 == null) {
            this.A0A = Long.toString(new Random().nextLong());
        } else {
            this.A0A = str2;
        }
    }

    public static C307896Rx A02(C307896Rx r17, List list) {
        C307896Rx r3 = r17;
        List list2 = list;
        if (list2 == r3.A0D) {
            return r17;
        }
        C307786Rm r6 = r3.A03;
        C277014uI r11 = r3.A08;
        Map map = r3.A0E;
        C307456Qe r8 = r3.A04;
        AnonymousClass6SD r9 = r3.A05;
        Map map2 = r3.A0F;
        C276744tp r12 = r3.A01;
        C307896Rx r4 = new C307896Rx((C276634te) null, r6, (C307786Rm) null, r8, r9, r3.A06, r11, r12, r3.A09, r3.A0B, r3.A0A, list2, map, map2);
        C307916Rz r2 = r4.A07;
        CopyOnWriteArraySet copyOnWriteArraySet = r3.A07.A00;
        if (!copyOnWriteArraySet.isEmpty()) {
            r2.A00.addAll(copyOnWriteArraySet);
        }
        return r4;
    }
}
