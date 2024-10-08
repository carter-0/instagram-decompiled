package X;

import android.util.Pair;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ajl  reason: case insensitive filesystem */
public final class C40815Ajl implements Runnable {
    public final /* synthetic */ C353438Hq A00;

    public C40815Ajl(C353438Hq r1) {
        this.A00 = r1;
    }

    public final void run() {
        C353438Hq r3 = this.A00;
        C352888Fl r4 = r3.A09;
        r4.A0Q();
        AnonymousClass9QA r7 = AnonymousClass9QA.A00;
        if (!r4.A0Y()) {
            AnonymousClass8E8 A002 = r4.A0z.A00();
            C3494580l A07 = A002.A03.A07(r7);
            LinkedHashSet A003 = A07.A00();
            0sn<Object> r0 = (List) C358218aY.A00.get(r7);
            if (r0 == null) {
                r0 = 0sn.A00;
            }
            for (Object remove : r0) {
                A003.remove(remove);
            }
            Set set = A07.A01;
            set.clear();
            set.addAll(A003);
            AnonymousClass8EA r02 = A002.A00;
            if (r02 != null) {
                Pair pair = new Pair(r7, A07);
                AnonymousClass8EL r1 = (AnonymousClass8EL) r02.A0D.get(pair.first);
                if (r1 != null) {
                    Object obj = pair.second;
                    0qQ.A06(obj);
                    r1.A08((C3494580l) obj);
                }
            }
        }
        C3498081w.A00(r4);
        r3.A0A.A00().CHo();
        AnonymousClass8DD r03 = r3.A0B;
        if (r03 != null) {
            AnonymousClass8DM r04 = r03.A0O;
            if (r04 != null) {
                r04.APJ();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
