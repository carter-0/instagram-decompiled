package X;

import androidx.compose.ui.Alignment;

public final class IH6 implements C59529JNb {
    public long A00 = 0;
    public final JNV A01;
    public final Alignment A02;

    public final long AF5(C56558I1m i1m, AnonymousClass5Q8 r10, long j, long j2) {
        long E4j = this.A01.E4j();
        if (!C289325dP.A02(E4j)) {
            E4j = this.A00;
        }
        this.A00 = E4j;
        return C289165d8.A01(C289165d8.A01(AnonymousClass5TW.A00(i1m.A01, i1m.A03), AnonymousClass5TW.A01(E4j)), this.A02.AB3(r10, j2, 0));
    }

    public IH6(JNV jnv, Alignment alignment) {
        this.A02 = alignment;
        this.A01 = jnv;
    }
}
