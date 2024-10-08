package X;

import android.media.MediaFormat;

/* renamed from: X.4SB  reason: invalid class name */
public final class AnonymousClass4SB implements AnonymousClass4SC {
    public final /* synthetic */ AnonymousClass4P4 A00;

    public AnonymousClass4SB(AnonymousClass4P4 r1) {
        this.A00 = r1;
    }

    public final void DxT(MediaFormat mediaFormat, C256683wB r7, long j, long j2) {
        AnonymousClass4P4 r4 = this.A00;
        AnonymousClass4S8 r2 = r4.A05;
        synchronized (r2) {
            long[] jArr = r2.A02;
            int i = r2.A00;
            jArr[i] = j;
            r2.A01[i] = j2;
            r2.A03[i] = r7;
            r2.A00 = i + 1;
            r2.A00 = i % 30;
        }
        AnonymousClass4OI r3 = r4.A02;
        if (r3 != null && r4.A0Q.A20 && r3.A0K.A0G != null) {
            long j3 = j / 1000;
            for (AnonymousClass4SE r22 : r4.A0R) {
                r22.A00.A0v.DGr(r4.A02.A0K.A0G, j3);
            }
        }
    }
}
