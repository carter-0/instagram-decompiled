package X;

import java.io.Serializable;

/* renamed from: X.4fa  reason: invalid class name and case insensitive filesystem */
public final class C269724fa implements Serializable {
    public static final C269734fb[] A03 = new C269734fb[0];
    public static final C269744fc[] A04 = new C269744fc[0];
    public final C269734fb[] A00;
    public final C269734fb[] A01;
    public final C269744fc[] A02;

    public C269724fa(C269734fb[] r1, C269734fb[] r2, C269744fc[] r3) {
        this.A01 = r1 == null ? A03 : r1;
        this.A00 = r2 == null ? A03 : r2;
        this.A02 = r3 == null ? A04 : r3;
    }

    public C269724fa() {
        this((C269734fb[]) null, (C269734fb[]) null, (C269744fc[]) null);
    }
}
