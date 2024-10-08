package X;

import kotlin.Deprecated;

@Deprecated(message = "This should only be used for legacy results that likely should be migrated to [Dropped.Failure].")
/* renamed from: X.6BQ  reason: invalid class name */
public final class AnonymousClass6BQ extends AnonymousClass6BM {
    public final Exception A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BQ) {
                AnonymousClass6BQ r5 = (AnonymousClass6BQ) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode();
    }

    public AnonymousClass6BQ(Exception exc, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = exc;
    }
}
