package X;

/* renamed from: X.9Hs  reason: invalid class name and case insensitive filesystem */
public final class C376369Hs extends AnonymousClass0T0 {
    public static final C376369Hs A01 = new C376369Hs(0);
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C376369Hs) && this.A00 == ((C376369Hs) obj).A00);
    }

    public final String toString() {
        return 002.A0K("FeatureLimitComposerBlockInfo(expirationTimeSec=", ')', this.A00);
    }

    public final int hashCode() {
        long j = this.A00;
        return (int) (j ^ (j >>> 32));
    }

    public C376369Hs(long j) {
        this.A00 = j;
    }
}
