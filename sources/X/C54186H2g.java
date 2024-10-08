package X;

import com.instagram.creator.agent.settings.keyword.KeywordRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.H2g  reason: case insensitive filesystem */
public final class C54186H2g extends AnonymousClass8ZF {
    public String A00;
    public String A01;
    public boolean A02 = true;
    public boolean A03 = true;
    public final KeywordRepository A04;
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;

    public C54186H2g(KeywordRepository keywordRepository) {
        this.A04 = keywordRepository;
        02z A10 = DbS.A10(new C53399GnW((C54617HLa) null, (Integer) null, (Integer) null, (DefaultConstructorMarker) null, (AnonymousClass62P) null, (AnonymousClass62P) null, 63, 2, false));
        this.A06 = A10;
        this.A08 = 10b.A03(A10);
        02z A012 = 106.A01(I1H.A00);
        this.A05 = A012;
        this.A07 = 10b.A03(A012);
    }

    public static final void A00(QP8 qp8, C54186H2g h2g) {
        Object value;
        C53399GnW gnW;
        AnonymousClass62P A002;
        Integer valueOf;
        AnonymousClass62P r10;
        C54617HLa hLa;
        boolean z;
        05G r2 = h2g.A06;
        do {
            value = r2.getValue();
            gnW = (C53399GnW) value;
            ArrayList A0S = 00k.A0S((Iterable) gnW.A05, AnonymousClass7TE.A1I(qp8));
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C51971G9r.A1O(((QP8) next).A02, next, A1F, A1C);
            }
            A002 = AnonymousClass62Q.A00(A1C);
            valueOf = Integer.valueOf(AnonymousClass7TG.A0A((Number) gnW.A01) + 1);
            r10 = (AnonymousClass62P) gnW.A03;
            hLa = (C54617HLa) gnW.A04;
            z = gnW.A06;
            AnonymousClass7TG.A1T(A002, r10, hLa);
        } while (!r2.AIY(value, new C53399GnW(hLa, valueOf, (Integer) gnW.A02, A002, r10, z)));
    }

    public static final void A01(QP8 qp8, C54186H2g h2g) {
        Object value;
        C53399GnW gnW;
        AnonymousClass62P A002;
        Integer valueOf;
        AnonymousClass62P r9;
        C54617HLa hLa;
        boolean z;
        05G r2 = h2g.A06;
        do {
            value = r2.getValue();
            gnW = (C53399GnW) value;
            ArrayList A0S = 00k.A0S((Iterable) gnW.A03, AnonymousClass7TE.A1I(qp8));
            HashSet A1F = AnonymousClass7TE.A1F();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = A0S.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C51971G9r.A1O(((QP8) next).A02, next, A1F, A1C);
            }
            A002 = AnonymousClass62Q.A00(A1C);
            valueOf = Integer.valueOf(AnonymousClass7TG.A0A((Number) gnW.A02) + 1);
            r9 = (AnonymousClass62P) gnW.A05;
            hLa = (C54617HLa) gnW.A04;
            z = gnW.A06;
            AnonymousClass7TG.A1T(r9, A002, hLa);
        } while (!r2.AIY(value, new C53399GnW(hLa, (Integer) gnW.A01, valueOf, r9, A002, z)));
    }

    public static final void A02(QP8 qp8, C54186H2g h2g) {
        Object value;
        C53399GnW gnW;
        AnonymousClass62P A002;
        int i;
        Integer valueOf;
        AnonymousClass62P r12;
        C54617HLa hLa;
        boolean z;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : (List) ((C53399GnW) h2g.A08.getValue()).A05) {
            DbY.A1T(((QP8) next).A02, qp8.A02, next, A1C);
        }
        AnonymousClass62P A003 = AnonymousClass62Q.A00(A1C);
        05G r5 = h2g.A06;
        do {
            value = r5.getValue();
            gnW = (C53399GnW) value;
            A002 = AnonymousClass62Q.A00(A003);
            Number number = (Number) gnW.A01;
            if (number != null) {
                i = number.intValue() - (DbS.A05(gnW.A05) - A003.size());
            } else {
                i = 0;
            }
            valueOf = Integer.valueOf(i);
            r12 = (AnonymousClass62P) gnW.A03;
            hLa = (C54617HLa) gnW.A04;
            z = gnW.A06;
            AnonymousClass7TG.A1T(A002, r12, hLa);
        } while (!r5.AIY(value, new C53399GnW(hLa, valueOf, (Integer) gnW.A02, A002, r12, z)));
    }

    public static final void A03(QP8 qp8, C54186H2g h2g) {
        QP8 qp82;
        Object value;
        AnonymousClass62P A002;
        Object obj;
        int i;
        Integer valueOf;
        AnonymousClass62P r14;
        C54617HLa hLa;
        boolean z;
        C54186H2g h2g2 = h2g;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = ((List) ((C53399GnW) h2g2.A08.getValue()).A03).iterator();
        while (true) {
            qp82 = qp8;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            DbY.A1T(((QP8) next).A02, qp8.A02, next, A1C);
        }
        AnonymousClass62P A003 = AnonymousClass62Q.A00(A1C);
        05G r3 = h2g2.A06;
        do {
            value = r3.getValue();
            C53399GnW gnW = (C53399GnW) value;
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            for (Object next2 : (List) gnW.A03) {
                DbY.A1T(((QP8) next2).A02, qp82.A02, next2, A1C2);
            }
            A002 = AnonymousClass62Q.A00(A1C2);
            obj = gnW.A01;
            Number number = (Number) obj;
            if (number != null) {
                i = number.intValue() - (DbS.A05(gnW.A05) - A003.size());
            } else {
                i = 0;
            }
            valueOf = Integer.valueOf(i);
            r14 = (AnonymousClass62P) gnW.A05;
            hLa = (C54617HLa) gnW.A04;
            z = gnW.A06;
            AnonymousClass7TG.A1T(r14, A002, hLa);
        } while (!r3.AIY(value, new C53399GnW(hLa, (Integer) obj, valueOf, r14, A002, z)));
    }
}
