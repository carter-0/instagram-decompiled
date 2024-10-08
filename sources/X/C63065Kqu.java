package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Kqu  reason: case insensitive filesystem */
public abstract class C63065Kqu {
    public static final List A00(C307786Rm r14, List list, float f) {
        int A00;
        int A002;
        ArrayList A0p = AnonymousClass7TF.A0p(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C276544tV r4 = (C276544tV) it.next();
            List<C276544tV> A0M = r4.A0M(38);
            0qQ.A07(A0M);
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0M);
            for (C276544tV r5 : A0M) {
                float A02 = r5.A02(36, 0.0f);
                C276544tV A07 = r5.A07(35);
                if (A07 == null) {
                    A002 = -1;
                } else {
                    A002 = AnonymousClass6TP.A00(r14, A07, 0);
                }
                A0p2.add(new C63916LCc(A02, A002));
            }
            String A0F = r4.A0F();
            if (A0F == null) {
                A0F = "";
            }
            String A0E = r4.A0E();
            if (A0E == null) {
                A0E = "";
            }
            C276544tV A072 = r4.A07(140);
            if (A072 == null) {
                A00 = -1;
            } else {
                A00 = AnonymousClass6TP.A00(r14, A072, 0);
            }
            A0p.add(new C63832L8n(A0F, A0E, A0p2, f, A00));
        }
        return A0p;
    }
}
