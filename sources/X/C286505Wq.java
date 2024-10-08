package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5Wq  reason: invalid class name and case insensitive filesystem */
public final class C286505Wq implements Iterable, C62650uo {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 0yC A04;
    public ArrayList A05 = new ArrayList();
    public HashMap A06;
    public boolean A07;
    public int[] A08 = new int[0];
    public Object[] A09 = new Object[0];

    public final AnonymousClass5X3 A00() {
        if (!this.A07) {
            this.A01++;
            return new AnonymousClass5X3(this);
        }
        throw new IllegalStateException("Cannot read while a writer is pending");
    }

    public final AnonymousClass5X4 A01() {
        String str;
        if (!(!this.A07)) {
            str = "Cannot start a writer when another writer is pending";
        } else if (this.A01 <= 0) {
            this.A07 = true;
            this.A03++;
            return new AnonymousClass5X4(this);
        } else {
            str = "Cannot start a writer when a reader is pending";
        }
        AnonymousClass5XN.A03(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final Iterator iterator() {
        return new C22435Y3r(this, 0, this.A00);
    }
}
