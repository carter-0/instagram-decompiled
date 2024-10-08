package X;

import java.util.Collection;

public final class IXP implements AnonymousClass1Xo {
    public final /* synthetic */ H3R A00;

    public final void EjB(C243373Ym r1) {
    }

    public IXP(H3R h3r) {
        this.A00 = h3r;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.1qK, java.lang.Object, X.8Yi] */
    public final void AE7(0lg r5) {
        C243373Ym r1;
        if (r5 != null) {
            1Ng A002 = AnonymousClass1Nd.A00(r5);
            H3R h3r = this.A00;
            String id = h3r.A01.getId();
            if (h3r.A07) {
                r1 = C243373Ym.SAVED;
            } else {
                r1 = C243373Ym.NOT_SAVED;
            }
            ? obj = new Object();
            obj.A01 = id;
            obj.A00 = r1;
            A002.A00(obj);
        }
    }

    public final C243373Ym BpO() {
        if (this.A00.A07) {
            return C243373Ym.SAVED;
        }
        return C243373Ym.NOT_SAVED;
    }

    public final String BpP() {
        return this.A00.A01.getId();
    }

    public final Integer BpT() {
        return AnonymousClass05K.A0N;
    }

    public final boolean CbC() {
        return this.A00.A07;
    }

    public final Collection BpQ() {
        return AnonymousClass7TE.A1C();
    }
}
