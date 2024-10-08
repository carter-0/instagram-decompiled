package X;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.5M5  reason: invalid class name */
public final class AnonymousClass5M5 extends AnonymousClass0T0 {
    public int A00 = 0;
    public int A01 = 0;
    public final Set A02;

    public /* synthetic */ AnonymousClass5M5(Set set, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A02 = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5M5) {
                AnonymousClass5M5 r5 = (AnonymousClass5M5) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00 && 0qQ.A0K(this.A02, r5.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01 * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public AnonymousClass5M5() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.A02 = linkedHashSet;
    }
}
