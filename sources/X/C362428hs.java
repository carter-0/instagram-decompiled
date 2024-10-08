package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8hs  reason: invalid class name and case insensitive filesystem */
public final class C362428hs implements C320536sX {
    public Map A00 = new HashMap();
    public final AnonymousClass2t9 A01;

    public final C296915qr B9q(int i) {
        C232262tL r1 = (C232262tL) this.A01.A04(i);
        if (this.A00.containsKey(r1)) {
            return (C296915qr) this.A00.get(r1);
        }
        if (r1 instanceof C296945qu) {
            return ((C296945qu) r1).B9p();
        }
        throw new IllegalStateException(002.A0O("No GridSpec at position: ", i));
    }

    public C362428hs(AnonymousClass2t9 r2) {
        this.A01 = r2;
    }
}
