package X;

import java.util.List;

/* renamed from: X.4Jf  reason: invalid class name */
public final class AnonymousClass4Jf extends AnonymousClass0T0 implements AnonymousClass4Jg {
    public final List A00;

    public AnonymousClass4Jf(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass4Jf) && 0qQ.A0K(this.A00, ((AnonymousClass4Jf) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
