package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.SmY  reason: case insensitive filesystem */
public final class C12079SmY implements C13924TlS {
    public final Iterable A00;
    public final AtomicBoolean A01 = JTQ.A0k();

    public final void D5G(C11286SJe sJe) {
        0qQ.A0B(sJe, 0);
        if (!this.A01.getAndSet(true)) {
            for (C13816Thj D5G : this.A00) {
                D5G.D5G(sJe);
            }
        }
    }

    public final void DEM(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        String str3 = str;
        0qQ.A0B(str, 1);
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).DEM(exc, str3, str2, map, i, j, z);
            }
        }
    }

    public final void DEX(C8989RKf rKf) {
        0qQ.A0B(rKf, 0);
        if (!this.A01.getAndSet(true)) {
            for (C13816Thj DEX : this.A00) {
                DEX.DEX(rKf);
            }
        }
    }

    public final void Czl(long j) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).Czl(j);
            }
        }
    }

    public final void D0e() {
        if (!this.A01.getAndSet(true)) {
            for (C13816Thj D0e : this.A00) {
                D0e.D0e();
            }
        }
    }

    public final void DFh(String str, Map map) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).DFh(str, map);
            }
        }
    }

    public final void DFl(String str, Map map, boolean z) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).DFl(str, map, z);
            }
        }
    }

    public final void DaE(float f) {
        for (C13816Thj DaE : this.A00) {
            DaE.DaE(f);
        }
    }

    public final void Dj3(long j, boolean z) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).Dj3(j, z);
            }
        }
    }

    public final void Dj7(String str, Map map) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).Dj7(str, map);
            }
        }
    }

    public final void Dtg(S49 s49) {
        for (C13816Thj thj : this.A00) {
            if (thj instanceof C13924TlS) {
                ((C13924TlS) thj).Dtg(s49);
            }
        }
    }

    public final void onStart() {
        this.A01.set(false);
        for (C13816Thj onStart : this.A00) {
            onStart.onStart();
        }
    }

    public C12079SmY(Iterable iterable) {
        this.A00 = iterable;
    }
}
