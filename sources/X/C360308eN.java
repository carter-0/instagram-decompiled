package X;

/* renamed from: X.8eN  reason: invalid class name and case insensitive filesystem */
public final class C360308eN implements Comparable {
    public final int A00;

    public final int hashCode() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return 0qQ.A00(this.A00 ^ AnonymousClass972.MUTABLE_FLAG_MASK, ((C360308eN) obj).A00 ^ AnonymousClass972.MUTABLE_FLAG_MASK);
    }

    public final boolean equals(Object obj) {
        int i = this.A00;
        if (!(obj instanceof C360308eN) || i != ((C360308eN) obj).A00) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return String.valueOf(((long) this.A00) & 4294967295L);
    }

    public /* synthetic */ C360308eN(int i) {
        this.A00 = i;
    }
}
