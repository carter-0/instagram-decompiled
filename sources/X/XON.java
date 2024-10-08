package X;

import android.os.Handler;
import java.util.LinkedHashMap;

public final class XON extends AnonymousClass5O2 {
    public long A00 = 0;
    public final XZA A01;
    public final LinkedHashMap A02 = AnonymousClass7TE.A1H();
    public final Handler A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XON(android.content.Context r16, android.os.Handler r17, X.C256873wU r18, X.AnonymousClass4PH r19, X.AnonymousClass2SB r20, X.XZA r21, X.C284785Nx r22, X.C256823wP r23, X.AnonymousClass4PC r24, long r25, boolean r27, boolean r28, boolean r29) {
        /*
            r15 = this;
            r0 = 0
            r11 = 0
            r14 = r29
            r3 = r16
            r2 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r1 = r27
            r15.A0N = r1
            r15.A0G = r0
            r0 = r28
            r15.A0M = r0
            r0 = 0
            r15.A00 = r0
            java.util.LinkedHashMap r0 = X.AnonymousClass7TE.A1H()
            r15.A02 = r0
            r15.A03 = r4
            r0 = r21
            r15.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XON.<init>(android.content.Context, android.os.Handler, X.3wU, X.4PH, X.2SB, X.XZA, X.5Nx, X.3wP, X.4PC, long, boolean, boolean, boolean):void");
    }

    public final void A0i(AnonymousClass4PQ r7) {
        long j;
        boolean A022 = 2BY.A02(2BQ.A07);
        LinkedHashMap linkedHashMap = this.A02;
        long j2 = r7.A01;
        Long valueOf = Long.valueOf(j2);
        if (A022) {
            j = j2 - this.A00;
        } else {
            j = r7.A00;
        }
        Pxe.A1X(valueOf, linkedHashMap, j);
        while (linkedHashMap.size() > 1000 && !linkedHashMap.isEmpty()) {
            linkedHashMap.remove(AnonymousClass7TE.A1J(AnonymousClass7TF.A0s(linkedHashMap)).getKey());
        }
        super.A0i(r7);
    }

    public final void A0N(C256683wB[] r1, long j, long j2) {
        super.A0N(r1, j, j2);
        this.A00 = j2;
    }

    public final void A0b(long j) {
        C18466VsG A002;
        super.A0b(j);
        LinkedHashMap linkedHashMap = this.A02;
        Long valueOf = Long.valueOf(j);
        Number number = (Number) linkedHashMap.get(valueOf);
        if (number != null) {
            j = number.longValue();
            linkedHashMap.remove(valueOf);
        }
        XZA xza = this.A01;
        if (xza != null && (A002 = xza.A00.A0D.A00(j)) != null) {
            this.A03.post(new Y2Z(A002, this));
        }
    }
}
