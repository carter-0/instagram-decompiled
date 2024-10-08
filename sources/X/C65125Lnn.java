package X;

import java.util.List;

/* renamed from: X.Lnn  reason: case insensitive filesystem */
public final class C65125Lnn implements AnonymousClass8QO {
    public final /* synthetic */ K5W A00;

    public final /* synthetic */ void DLn(AnonymousClass9SZ r1, int i) {
    }

    public final /* synthetic */ void DMA(int i, int i2) {
    }

    public final /* synthetic */ void DMJ(AnonymousClass9SZ r1, int i) {
    }

    public final /* synthetic */ void DMW() {
    }

    public final /* synthetic */ void DMZ(List list) {
    }

    public C65125Lnn(K5W k5w) {
        this.A00 = k5w;
    }

    public final void DMM(AnonymousClass9SZ r4, int i) {
        int A002;
        K5W k5w = this.A00;
        C66567MWv mWv = k5w.A0E;
        if (mWv != null) {
            int currentPosition = mWv.getCurrentPosition();
            if (currentPosition <= 0) {
                A002 = C60295Jit.A00(k5w.A0X) - 1;
            } else {
                A002 = C63161KsU.A00(k5w.A0T, currentPosition);
            }
            if (A002 != i) {
                K5W.A03(k5w, i - A002);
            }
        }
    }
}
