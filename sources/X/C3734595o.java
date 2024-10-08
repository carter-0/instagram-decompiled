package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.95o  reason: invalid class name and case insensitive filesystem */
public final class C3734595o {
    public int A00;
    public int A01;
    public C3734795q A02;
    public Set A03;
    public final Set A04 = new HashSet();
    public final Set A05;

    public final AnonymousClass95n A00() {
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        if (z) {
            return new AnonymousClass95n(this.A02, new HashSet(this.A05), new HashSet(this.A04), this.A03, this.A00, this.A01);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void A02(C3735395y r3) {
        if (!this.A05.contains(r3.A02)) {
            this.A04.add(r3);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public C3734595o(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.A05 = hashSet;
        int i = 0;
        this.A00 = 0;
        this.A01 = 0;
        this.A03 = new HashSet();
        hashSet.add(cls);
        int length = clsArr.length;
        while (i < length) {
            if (clsArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(this.A05, clsArr);
    }

    public final void A01(C3734795q r1) {
        this.A02 = r1;
    }
}
