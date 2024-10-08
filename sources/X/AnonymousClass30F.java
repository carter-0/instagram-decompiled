package X;

import java.util.Map;

/* renamed from: X.30F  reason: invalid class name */
public final class AnonymousClass30F implements C250603lj {
    public final C234422xq A00;

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        Integer num;
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        Object obj = r9.A03;
        0qQ.A06(obj);
        1Xj r2 = (1Xj) obj;
        Object obj2 = r9.A04;
        0qQ.A06(obj2);
        AnonymousClass3W1 r6 = (AnonymousClass3W1) obj2;
        float CFe = r10.CFe(r9);
        int intValue = r10.CEk(r9).intValue();
        if (intValue == 1) {
            C234422xq r4 = this.A00;
            0qQ.A0B(r2, 0);
            AnonymousClass4P2 r3 = (AnonymousClass4P2) r4.A09.get(r2);
            if (r3 != null) {
                float f = r3.A00;
                if (CFe >= f || CFe >= r4.A07.A01) {
                    if (CFe >= f) {
                        C234422xq.A02(r2, r3.A03, r4, CFe);
                    }
                } else if (!r2.equals(r4.A00) || !r4.A08.isPlaying()) {
                    C234422xq.A01(r2, r3.A03, r4);
                } else {
                    C234422xq.A06(r4);
                }
                r3.A00 = CFe;
            }
        } else if (intValue == 0) {
            C234422xq r5 = this.A00;
            0qQ.A0B(r2, 0);
            0qQ.A0B(r6, 1);
            Map map = r5.A09;
            if (AnonymousClass3ZJ.A0D(r5.A06, r2)) {
                num = AnonymousClass05K.A0C;
            } else if (!r2.equals(r5.A00) || !r5.A08.isPlaying()) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            map.put(r2, new AnonymousClass4P2(r6, num, CFe));
            C234422xq.A02(r2, r6, r5, CFe);
        } else if (intValue == 2) {
            C234422xq r1 = this.A00;
            0qQ.A0B(r2, 0);
            r1.A09.remove(r2);
            if (r2.equals(r1.A00)) {
                C234422xq.A06(r1);
            }
        }
    }

    public AnonymousClass30F(C234422xq r1) {
        this.A00 = r1;
    }
}
