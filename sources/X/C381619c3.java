package X;

/* renamed from: X.9c3  reason: invalid class name and case insensitive filesystem */
public final class C381619c3 extends AnonymousClass0T0 {
    public final long A00;
    public final String A01;

    public C381619c3(long j, String str) {
        0qQ.A0B(str, 2);
        this.A00 = j;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381619c3) {
                C381619c3 r8 = (C381619c3) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        return (((int) (j ^ (j >>> 32))) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ContentFilterDictionaryEntriesEntity(dictionaryId=");
        A1A.append(this.A00);
        A1A.append(", pattern=");
        A1A.append(this.A01);
        return AnonymousClass7TG.A0p(A1A);
    }
}
