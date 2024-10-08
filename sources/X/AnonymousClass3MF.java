package X;

import java.util.ArrayList;

/* renamed from: X.3MF  reason: invalid class name */
public abstract class AnonymousClass3MF extends 2d3 implements AnonymousClass3MG {
    public int A00 = 0;
    public 2d3[] A01 = new 2d3[4];

    public final void A0c(XU5 xu5, ArrayList arrayList, int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            2d3 r2 = this.A01[i2];
            ArrayList arrayList2 = xu5.A04;
            if (!arrayList2.contains(r2)) {
                arrayList2.add(r2);
            }
        }
        for (int i3 = 0; i3 < this.A00; i3++) {
            C21507XdZ.A00(this.A01[i3], xu5, arrayList, i);
        }
    }
}
