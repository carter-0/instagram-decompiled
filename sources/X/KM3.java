package X;

public final class KM3 extends AnonymousClass8RS implements AnonymousClass8RT {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof KM3) && this.A00 == ((KM3) obj).A00);
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("ThirdPartyMediaReplace(segmentIndex=", ')', this.A00);
    }

    public final int getSegmentIndex() {
        return this.A00;
    }

    public KM3(int i) {
        this.A00 = i;
    }
}
