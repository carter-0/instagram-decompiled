package X;

import java.util.Arrays;

public final class GQN {
    public long A00;
    public final GQO A01;
    public final GQO A02;

    public final void A01() {
        GQO gqo = this.A01;
        Arrays.fill(gqo.A05, 0, 20, (Object) null);
        gqo.A00 = 0;
        GQO gqo2 = this.A02;
        Arrays.fill(gqo2.A05, 0, 20, (Object) null);
        gqo2.A00 = 0;
        this.A00 = 0;
    }

    public final void A02(long j, long j2) {
        this.A01.A01(j, C289295dM.A01(j2));
        this.A02.A01(j, C289295dM.A02(j2));
    }

    public GQN() {
        Integer num = AnonymousClass05K.A00;
        this.A01 = new GQO(num, false);
        this.A02 = new GQO(num, false);
    }

    public final long A00(long j) {
        float A012 = C51971G9r.A01(j);
        if (A012 > 0.0f) {
            float A002 = C51972G9s.A00(j);
            if (A002 > 0.0f) {
                return GQF.A00(this.A01.A00(A012), this.A02.A00(A002));
            }
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("maximumVelocity should be a positive value. You specified=");
        StringBuilder A1A2 = AnonymousClass7TE.A1A();
        A1A2.append('(');
        A1A2.append(C51971G9r.A01(j));
        A1A2.append(", ");
        A1A2.append(C51972G9s.A00(j));
        I2E.A01(AnonymousClass7TF.A0i(AnonymousClass7TF.A0l(") px/sec", A1A2), A1A));
        throw AnonymousClass00P.createAndThrow();
    }
}
