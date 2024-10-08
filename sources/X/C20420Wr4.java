package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Wr4  reason: case insensitive filesystem */
public final class C20420Wr4 implements 0sP {
    public final /* synthetic */ WF8 A00;
    public final /* synthetic */ W04 A01;
    public final /* synthetic */ C18073Vl1 A02;
    public final /* synthetic */ AtomicBoolean A03;
    public final /* synthetic */ 1IX A04;

    public C20420Wr4(WF8 wf8, W04 w04, C18073Vl1 vl1, AtomicBoolean atomicBoolean, 1IX r5) {
        this.A02 = vl1;
        this.A01 = w04;
        this.A03 = atomicBoolean;
        this.A04 = r5;
        this.A00 = wf8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A022 = DbU.A02((C62470KgL) obj, 0);
        if (A022 == 2) {
            C18073Vl1 vl1 = this.A02;
            if (vl1 != null) {
                vl1.A00("CDL_BRIDGE_INITIALIZED");
            }
            W04.A00(this.A00, vl1, this.A03, this.A04);
        } else if (A022 == 3 && this.A03.compareAndSet(false, true)) {
            1IX r2 = this.A04;
            if (r2.isActive()) {
                Throwable th = new Throwable("cdl voltron module download failed");
                0qQ.A0B(th, 0);
                r2.resumeWith(new 0eQ(th));
            }
        }
        return C60340gF.A00;
    }
}
