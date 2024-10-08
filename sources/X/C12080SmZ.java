package X;

import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.SmZ  reason: case insensitive filesystem */
public final class C12080SmZ implements C13924TlS {
    public final C13924TlS A00;
    public final ExecutorService A01;

    public final void D5G(C11286SJe sJe) {
        0qQ.A0B(sJe, 0);
        this.A01.execute(new C12971TGe(sJe, this));
    }

    public final void DEM(Exception exc, String str, String str2, Map map, int i, long j, boolean z) {
        0qQ.A0B(str, 1);
        this.A01.execute(new C13077TKi(this, exc, str, str2, map, i, j, z));
    }

    public final void DEX(C8989RKf rKf) {
        0qQ.A0B(rKf, 0);
        this.A01.execute(new C12972TGf(rKf, this));
    }

    public final void Czl(long j) {
        this.A01.execute(new C12970TGd(this, j));
    }

    public final void D0e() {
        this.A01.execute(new TD3(this));
    }

    public final void DFh(String str, Map map) {
        this.A01.execute(new C13036TIs(this, str, map));
    }

    public final void DFl(String str, Map map, boolean z) {
        this.A01.execute(new C13059TJp(this, str, map, z));
    }

    public final void DaE(float f) {
        this.A01.execute(new C12973TGg(this, f));
    }

    public final void Dj3(long j, boolean z) {
        this.A01.execute(new C13037TIt(this, j, z));
    }

    public final void Dj7(String str, Map map) {
        this.A01.execute(new C13038TIu(this, str, map));
    }

    public final void Dtg(S49 s49) {
        this.A01.execute(new C12974TGh(s49, this));
    }

    public final void onStart() {
        this.A01.execute(new TD4(this));
    }

    public C12080SmZ(C13924TlS tlS, ExecutorService executorService) {
        this.A00 = tlS;
        this.A01 = executorService;
    }
}
