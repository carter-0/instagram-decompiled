package X;

import androidx.compose.ui.Alignment;

public final class IH5 implements C59529JNb {
    public final long A00;
    public final Alignment A01;

    public final long AF5(C56558I1m i1m, AnonymousClass5Q8 r25, long j, long j2) {
        Alignment alignment = this.A01;
        C56558I1m i1m2 = i1m;
        int i = i1m2.A02;
        int i2 = i1m2.A01;
        int i3 = i1m2.A00;
        int i4 = i1m2.A03;
        AnonymousClass5Q8 r14 = r25;
        long AB3 = alignment.AB3(r14, 0, C289155d7.A00(i - i2, i3 - i4));
        long AB32 = alignment.AB3(r14, 0, j2);
        long j3 = (((long) (-((int) (AB32 & 4294967295L)))) & 4294967295L) | (((long) (-((int) (AB32 >> 32)))) << 32);
        long j4 = this.A00;
        int i5 = (int) (j4 >> 32);
        int i6 = -1;
        if (r14 == AnonymousClass5Q8.Ltr) {
            i6 = 1;
        }
        return C289165d8.A01(C289165d8.A01(C289165d8.A01(AnonymousClass5TW.A00(i2, i4), AB3), j3), AnonymousClass5TW.A00(i5 * i6, (int) (j4 & 4294967295L)));
    }

    public IH5(Alignment alignment, long j) {
        this.A01 = alignment;
        this.A00 = j;
    }
}
