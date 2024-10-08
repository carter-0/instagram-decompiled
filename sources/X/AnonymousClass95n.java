package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.95n  reason: invalid class name */
public final class AnonymousClass95n {
    public final int A00;
    public final int A01;
    public final C3734795q A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public static AnonymousClass95n A00(Class cls, Object obj, Class... clsArr) {
        C3734595o r1 = new C3734595o(cls, clsArr);
        r1.A02 = new C3734695p(obj);
        return r1.A00();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        sb.append("}");
        return sb.toString();
    }

    public AnonymousClass95n(C3734795q r2, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A05 = Collections.unmodifiableSet(set3);
    }
}
