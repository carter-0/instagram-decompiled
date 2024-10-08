package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public final class LOB {
    public List A00 = 0sn.A00;
    public Map A01 = 0Yt.A0E();
    public final int A02;
    public final C390879rz A03;
    public final 0sL A04;
    public final int A05;

    public final List A01() {
        ArrayList A0S = 00k.A0S(this.A01.values(), this.A00);
        ArrayList<C63771L6d> A1C = AnonymousClass7TE.A1C();
        Iterator it = A0S.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            PriorityQueue priorityQueue = ((C63771L6d) next).A00;
            if (!(priorityQueue instanceof Collection) || !priorityQueue.isEmpty()) {
                Iterator it2 = priorityQueue.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (JTO.A0W(it2).CeS()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                A1C.add(next);
            }
            if (priorityQueue.size() >= this.A05) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        for (C63771L6d l6d : A1C) {
            List A0a = 00k.A0a(l6d.A00);
            0eP A002 = C63278KuN.A00(A0a);
            String str = l6d.A01;
            String A012 = LTI.A01(A002);
            0sn r13 = 0sn.A00;
            A0r.add(new C60998Juu(this.A03, C62523KhF.A04, (C62511Kh1) null, (Boolean) null, str, A012, (String) null, A0a, r13, A002));
        }
        return A0r;
    }

    public LOB(C390879rz r2, 0sL r3, int i, int i2) {
        C51972G9s.A1B(r2, r3);
        this.A03 = r2;
        this.A05 = i;
        this.A02 = i2;
        this.A04 = r3;
    }

    public static final C63771L6d A00(LOB lob) {
        Calendar A0o = JTS.A0o();
        while (A0o.get(7) != 7) {
            A0o.add(5, -1);
        }
        long timeInMillis = A0o.getTimeInMillis();
        A0o.add(5, -5);
        return new C63771L6d((String) lob.A04.invoke(2131974732, (Object) null), AnonymousClass7TF.A0y(Long.valueOf(A0o.getTimeInMillis()), timeInMillis), lob.A02);
    }
}
