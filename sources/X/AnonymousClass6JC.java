package X;

import java.util.Map;

/* renamed from: X.6JC  reason: invalid class name */
public final class AnonymousClass6JC {
    public boolean A00 = true;
    public final AnonymousClass5Y2 A01;
    public final Object A02;
    public final /* synthetic */ AnonymousClass6I1 A03;

    public AnonymousClass6JC(AnonymousClass6I1 r4, Object obj) {
        this.A03 = r4;
        this.A02 = obj;
        this.A01 = new AnonymousClass5Y1((Map) r4.A02.get(obj), new AnonymousClass9L6(r4, 37));
    }

    public final void A00(Map map) {
        if (this.A00) {
            Map E2c = this.A01.E2c();
            if (E2c.isEmpty()) {
                map.remove(this.A02);
            } else {
                map.put(this.A02, E2c);
            }
        }
    }
}
