package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7IE  reason: invalid class name */
public final class AnonymousClass7IE implements AnonymousClass7IF {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public final void EKH(C352218Cl r3, String str, int i) {
        0qQ.A0B(str, 2);
        this.A03.put(r3.A0h, str);
        this.A02.put(Integer.valueOf(i), r3);
    }

    public final void AHU() {
        this.A02.clear();
        this.A03.clear();
    }

    public final String BbS(int i) {
        C352218Cl r0 = (C352218Cl) this.A02.get(Integer.valueOf(i));
        if (r0 != null) {
            return BbT(r0.A0h);
        }
        return null;
    }

    public final String BbT(String str) {
        return (String) this.A03.get(str);
    }

    public final C352218Cl Bc1(int i) {
        return (C352218Cl) this.A02.get(Integer.valueOf(i));
    }
}
