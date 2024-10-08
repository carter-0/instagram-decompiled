package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ILu  reason: case insensitive filesystem */
public final class C57028ILu implements C229372nH {
    public List A00 = 0sn.A00;
    public final /* synthetic */ C55878Hoz A01;
    public final /* synthetic */ C252683pV A02;

    public final void D3p(C267324bN r1, Integer num, int i) {
    }

    public final void D3q(C276114sa r3, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 0);
        ArrayList A0U = 00k.A0U(this.A00);
        if (z) {
            A0U.clear();
        }
        A0U.addAll(list);
        this.A00 = A0U;
        C320416sL r0 = (C320416sL) this.A01.A09.getValue();
        if (r0 != null) {
            r0.A02(r3);
        }
        0ki.A00("AudioPageRepository-1", C58688Ivx.A00(this.A02, this, 42));
    }

    public final void D3v(C276114sa r3, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 0);
        this.A00 = 00k.A0a(list);
        C320416sL r0 = (C320416sL) this.A01.A09.getValue();
        if (r0 != null) {
            r0.A02(r3);
        }
        0ki.A00("AudioPAgeRepository-2", C58688Ivx.A00(this.A02, this, 43));
    }

    public C57028ILu(C55878Hoz hoz, C252683pV r3) {
        this.A01 = hoz;
        this.A02 = r3;
    }
}
