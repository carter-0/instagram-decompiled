package X;

/* renamed from: X.5oT  reason: invalid class name and case insensitive filesystem */
public final class C295555oT extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C295555oT) {
                C295555oT r8 = (C295555oT) obj;
                if (!(this.A01 == r8.A01 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentFilterDictionaryClientAvailabilityEntity(dictionaryId=");
        sb.append(this.A01);
        sb.append(", clientId=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        long j = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A00;
    }

    public C295555oT(long j, int i) {
        this.A01 = j;
        this.A00 = i;
    }
}
