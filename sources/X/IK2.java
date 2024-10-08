package X;

import android.graphics.Rect;

public final class IK2 implements AnonymousClass2WK {
    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        return C51975G9x.A1Y(obj, this);
    }

    public final 2WL Cfk(2WI r7, long j) {
        C244893bv r0;
        C244893bv r02;
        int A03 = C245073cH.A03(j);
        if (A03 == C245073cH.A01(j)) {
            r0 = C244883bu.A00;
        } else if (A03 == 0) {
            r0 = C244903bw.A00;
        } else {
            r0 = C54017Gxz.A00;
        }
        int i = r0.A01.A01;
        int A02 = C245073cH.A02(j);
        if (A02 == C245073cH.A00(j)) {
            r02 = C244883bu.A00;
        } else if (A02 == 0) {
            r02 = C244903bw.A00;
        } else {
            r02 = C54017Gxz.A00;
        }
        long A022 = C245333ch.A02(j, i, r02.A01.A01);
        return new 2WL(A022, new Rect(0, 0, C245143cO.A00(A022), C51968G9o.A02(A022)));
    }
}
