package X;

import java.util.Arrays;

/* renamed from: X.9OG  reason: invalid class name */
public final class AnonymousClass9OG {
    public final String A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && (obj instanceof AnonymousClass9OG) && 0qQ.A0K(this.A00, ((AnonymousClass9OG) obj).A00));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, false, getClass()});
    }

    public AnonymousClass9OG(String str) {
        this.A00 = str;
    }
}
