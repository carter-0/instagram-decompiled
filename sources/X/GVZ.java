package X;

import java.util.List;

public final class GVZ implements C270674h7 {
    public final /* synthetic */ C55878Hoz A00;
    public final /* synthetic */ C252683pV A01;

    public final void D3r(H3D h3d) {
        0qQ.A0B(h3d, 0);
        0ki.A00("AudioPageRepository-5", C58688Ivx.A00(this.A01, h3d, 44));
    }

    public final void D3s() {
    }

    public final void D3t(C52228GJt gJt) {
        0qQ.A0B(gJt, 0);
        0ki.A00("AudioPageRepository-3", C58688Ivx.A00(this.A01, gJt, 45));
    }

    public final void D3u(C52263GLe gLe) {
        0qQ.A0B(gLe, 0);
        C55878Hoz hoz = this.A00;
        AnonymousClass0eM r4 = hoz.A08;
        if (r4.getValue() == C294895nD.DEFER_STREAMING || r4.getValue() == C294895nD.CHUNK_STREAMING) {
            C298835u7 r6 = gLe.A01;
            if (((GVR) r6).A0D) {
                hoz.A00 = AnonymousClass05K.A0C;
            } else {
                hoz.A00 = AnonymousClass05K.A00;
                05G r3 = hoz.A01;
                if (DbX.A1b(r3)) {
                    05G r2 = hoz.A09;
                    C320416sL r1 = (C320416sL) r2.getValue();
                    if (r1 != null) {
                        r1.A02(((C298815u5) r6).BaP());
                    }
                    Object value = r2.getValue();
                    if (value != null) {
                        hoz.A00 = AnonymousClass05K.A01;
                        C51972G9s.A19((C320416sL) value);
                        AnonymousClass7TF.A1O(r3, false);
                    } else {
                        throw AnonymousClass7TE.A0z("Called fetch without initializing fetcher");
                    }
                }
            }
        }
        0ki.A00("AudioPageRepository-4", C58688Ivx.A00(this.A01, gLe, 46));
        C229352nF r22 = hoz.A04;
        String str = hoz.A07;
        List list = gLe.A09;
        r22.A03(((C298815u5) gLe.A01).BaP(), (C294895nD) r4.getValue(), str, list, gLe.A0D, true);
    }

    public GVZ(C55878Hoz hoz, C252683pV r2) {
        this.A01 = r2;
        this.A00 = hoz;
    }
}
