package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.HUc  reason: case insensitive filesystem */
public abstract class C54821HUc {
    public static final C53292Gle A00(C272054k1 r14, Double d, boolean z, boolean z2) {
        List C48;
        int seconds;
        C272034jz BdV = r14.BdV();
        if (BdV == null || (C48 = BdV.C48()) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(C48);
        Iterator it = C48.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = "";
            if (it.hasNext()) {
                Object next = it.next();
                int i3 = i2 + 1;
                if (i2 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C272014jx r1 = (C272014jx) next;
                String text = r1.getText();
                if (text != null) {
                    str = text;
                }
                A0r.add(new C53387GnJ(i2, str, AnonymousClass7TG.A0A(r1.Arb()), 1));
                i2 = i3;
            } else {
                String pollId = BdV.getPollId();
                if (pollId == null) {
                    pollId = str;
                }
                Integer CFI = BdV.CFI();
                AnonymousClass62P A00 = AnonymousClass62Q.A00(A0r);
                boolean A1a = DbX.A1a(BdV.CEx());
                Integer B2k = BdV.B2k();
                if (B2k != null) {
                    seconds = B2k.intValue();
                } else {
                    if (d != null) {
                        i = (int) d.doubleValue();
                    }
                    seconds = i + ((int) TimeUnit.DAYS.toSeconds(1));
                }
                return new C53292Gle(CFI, pollId, A00, seconds, z, A1a, z2);
            }
        }
    }
}
