package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SoB  reason: case insensitive filesystem */
public final class C12160SoB implements AnonymousClass40N {
    public final AnonymousClass0JP A00;
    public final C2604745u A01;

    public C12160SoB(AnonymousClass0JP r2, C2604745u r3) {
        0qQ.A0B(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final AnonymousClass40G E6Y(String str, int i) {
        0qQ.A0B(str, 0);
        AnonymousClass40G A002 = A00(str, i);
        try {
            Iterable<QOl> iterable = (Iterable) A002.A00;
            ArrayList A0r = AnonymousClass7TG.A0r(iterable);
            for (QOl qOl : iterable) {
                C66582MXn.A1N((String) qOl.A02, A0r);
            }
            return new AnonymousClass40G(A0r, A002.A01, A002.A02);
        } catch (NumberFormatException unused) {
            return new AnonymousClass40G(0sn.A00, "Number format exception when using toLong()", false);
        }
    }

    public final AnonymousClass40G E6Z(List list, int i) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            AnonymousClass40G E6Y = E6Y(A18, 0);
            if (!E6Y.A02) {
                return new AnonymousClass40G(0Yt.A0E(), E6Y.A01, false);
            }
            A1E.put(A18, E6Y.A00);
        }
        return Pxf.A0M(A1E);
    }

    public final void FNg(String str, long j, long j2) {
        List list;
        String obj = Long.valueOf(j).toString();
        AnonymousClass40G A002 = A00(str, 0);
        QOl qOl = new QOl(obj, this.A00.now(), j2);
        if (!A002.A02) {
            list = AnonymousClass7TE.A1I(qOl);
        } else {
            Object obj2 = A002.A00;
            ((AbstractCollection) obj2).add(qOl);
            list = (List) obj2;
        }
        A01(str, list);
    }

    private final AnonymousClass40G A00(String str, int i) {
        long now = this.A00.now();
        C2604745u r1 = this.A01;
        String str2 = str;
        0qQ.A0B(str2, 0);
        String A012 = r1.A01(002.A0R("sig_", str2));
        try {
            ArrayList A1C = AnonymousClass7TE.A1C();
            int i2 = 0;
            if (A012.length() != 0) {
                List A0R = 00l.A0R(A012, new String[]{";"}, 0);
                int A002 = C70002Hb.A00(0, C51966G9m.A06(A0R), 3);
                if (A002 >= 0) {
                    while (true) {
                        Object obj = A0R.get(i2);
                        long A0J = Pxg.A0J(A0R, i2 + 1);
                        long A0J2 = Pxg.A0J(A0R, i2 + 2);
                        if (now <= A0J + A0J2) {
                            A1C.add(new QOl(obj, A0J, A0J2));
                        }
                        if (i2 == A002) {
                            break;
                        }
                        i2 += 3;
                    }
                }
                if (A1C.size() > 1) {
                    01V.A1D(A1C, new C13113TLw(5));
                }
                if (i > 0) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    int size = A1C.size();
                    for (int max = Math.max(0, A1C.size() - i); max < size; max++) {
                        A1C2.add(A1C.get(max));
                    }
                    A1C = A1C2;
                }
            }
            return new AnonymousClass40G(A1C, (String) null, true);
        } catch (IndexOutOfBoundsException unused) {
            return new AnonymousClass40G(AnonymousClass7TE.A1C(), "signal fields not  3", false);
        }
    }

    private final void A01(String str, List list) {
        String A10;
        C2604745u r6 = this.A01;
        0qQ.A0B(str, 0);
        String A0R = 002.A0R("sig_", str);
        if (list.isEmpty()) {
            A10 = "";
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                QOl qOl = (QOl) it.next();
                A1A.append((String) qOl.A02);
                A1A.append(";");
                A1A.append(qOl.A00);
                A1A.append(";");
                A1A.append(qOl.A01);
                A1A.append(";");
            }
            A1A.deleteCharAt(A1A.length() - 1);
            A10 = DbT.A10(A1A);
        }
        r6.A06(A0R, A10);
    }

    public final void CfI(int i) {
        List A02 = this.A01.A02();
        ArrayList A0r = AnonymousClass7TG.A0r(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0r.add(00l.A0F("sig_", AnonymousClass7TE.A18(it)));
        }
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it2);
            A01(A18, (List) A00(A18, i).A00);
        }
    }

    public final void EDJ() {
        C2604745u r4 = this.A01;
        List A02 = r4.A02();
        ArrayList A0r = AnonymousClass7TG.A0r(A02);
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            A0r.add(00l.A0F("sig_", AnonymousClass7TE.A18(it)));
        }
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it2);
            0qQ.A0B(A18, 0);
            r4.A03(002.A0R("sig_", A18));
        }
    }
}
