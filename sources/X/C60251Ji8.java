package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;

/* renamed from: X.Ji8  reason: case insensitive filesystem */
public final class C60251Ji8 extends 2YL {
    public L30 A00;
    public final LimitsPlusRepository A01;
    public final C55177HdT A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public C60251Ji8(LimitsPlusRepository limitsPlusRepository, C55177HdT hdT) {
        0qQ.A0B(limitsPlusRepository, 1);
        this.A01 = limitsPlusRepository;
        this.A02 = hdT;
        02z A10 = DbS.A10(new C60922Jtg(AnonymousClass05K.A00, 0, 0));
        this.A03 = A10;
        this.A04 = 10b.A03(A10);
    }

    public final void A01(int i) {
        Object value;
        Integer num;
        long j;
        05G r5 = this.A03;
        do {
            value = r5.getValue();
            C60922Jtg jtg = (C60922Jtg) value;
            num = jtg.A02;
            j = jtg.A01;
            0qQ.A0B(num, 0);
        } while (!r5.AIY(value, new C60922Jtg(num, i, j)));
    }

    public final void A00() {
        long j;
        Object value;
        Integer num;
        int i;
        C54166H1l h1l;
        long A0P = AnonymousClass7TE.A0P(JTU.A04());
        05G r7 = this.A03;
        Integer num2 = ((C60922Jtg) r7.getValue()).A02;
        Integer num3 = AnonymousClass05K.A00;
        long j2 = (long) ((C60922Jtg) r7.getValue()).A00;
        if (num2 == num3) {
            j = SandboxRepository.CACHE_TTL;
        } else {
            j = 604800;
        }
        long j3 = A0P + (j2 * j);
        do {
            value = r7.getValue();
            C60922Jtg jtg = (C60922Jtg) value;
            num = jtg.A02;
            i = jtg.A00;
            0qQ.A0B(num, 0);
        } while (!r7.AIY(value, new C60922Jtg(num, i, j3)));
        L30 l30 = this.A00;
        if (l30 != null && (h1l = l30.A00.A02) != null) {
            h1l.A00 = j3;
        }
    }
}
