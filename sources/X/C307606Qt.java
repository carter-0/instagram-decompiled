package X;

/* renamed from: X.6Qt  reason: invalid class name and case insensitive filesystem */
public final class C307606Qt extends C307596Qs {
    public final String A00;

    public C307606Qt(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C307606Qt) && 0qQ.A0K(this.A00, ((C307606Qt) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return 002.A0S("BloksPrebundledData(payloadFilePath=", this.A00, ')');
    }
}
