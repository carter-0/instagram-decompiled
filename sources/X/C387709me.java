package X;

import com.instagram.common.gallery.Medium;

/* renamed from: X.9me  reason: invalid class name and case insensitive filesystem */
public final class C387709me extends C391879tp {
    public final int A00;
    public final Medium A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C387709me) {
                C387709me r5 = (C387709me) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }

    public C387709me(Medium medium, int i) {
        this.A01 = medium;
        this.A00 = i;
    }
}
