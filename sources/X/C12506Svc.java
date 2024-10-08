package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Svc  reason: case insensitive filesystem */
public final class C12506Svc implements C2818759x {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final /* synthetic */ C2818759x A01;
    public final /* synthetic */ 0sP A02;

    public C12506Svc(C2818759x r2, 0sP r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void A9U(AnonymousClass5A7 r4) {
        C12510Svg svg = new C12510Svg(1, r4, this.A02);
        this.A01.A9U(svg);
        this.A00.put(r4, svg);
    }

    public final void AOY(AnonymousClass5A7 r3) {
        AnonymousClass5A7 r1 = (AnonymousClass5A7) 0u4.A03(this.A00).remove(r3);
        if (r1 != null) {
            this.A01.AOY(r1);
        }
    }
}
