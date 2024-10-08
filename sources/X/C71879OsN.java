package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OsN  reason: case insensitive filesystem */
public final class C71879OsN implements C74383Pty {
    public final /* synthetic */ C329027Hh A00;
    public final /* synthetic */ C74403PuJ A01;
    public final /* synthetic */ AtomicBoolean A02;

    public final /* synthetic */ void DCq(String str, int i, String str2) {
        0qQ.A0B(str, 1);
        this.A01.onError(str);
    }

    public C71879OsN(C329027Hh r1, C74403PuJ puJ, AtomicBoolean atomicBoolean) {
        this.A00 = r1;
        this.A02 = atomicBoolean;
        this.A01 = puJ;
    }

    public final void Dog(String str, boolean z) {
        this.A00.A00.post(new C73355PbE(this.A01, str, this.A02, z));
    }
}
