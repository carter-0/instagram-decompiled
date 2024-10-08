package X;

import java.util.ArrayList;

/* renamed from: X.2d2  reason: invalid class name */
public abstract class AnonymousClass2d2 extends 2d3 {
    public ArrayList A00 = new ArrayList();

    public abstract void A0c();

    public void A0B() {
        this.A00.clear();
        AnonymousClass2d2.super.A0B();
    }

    public final void A0L(AnonymousClass2dE r4) {
        AnonymousClass2d2.super.A0L(r4);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            ((2d3) this.A00.get(i)).A0L(r4);
        }
    }
}
