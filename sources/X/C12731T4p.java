package X;

import com.google.firebase.encoders.proto.Protobuf;

/* renamed from: X.T4p  reason: case insensitive filesystem */
public final class C12731T4p implements Protobuf {
    public final int A00;
    public final C8863RDe A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        C12731T4p t4p = (C12731T4p) ((Protobuf) obj);
        return this.A00 == t4p.A00 && this.A01.equals(t4p.A01);
    }

    public final Class annotationType() {
        return Protobuf.class;
    }

    public final int hashCode() {
        return (this.A00 ^ 14552422) + (this.A01.hashCode() ^ 2041407134);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("@com.google.firebase.encoders.proto.Protobuf");
        A16.append('(');
        A16.append("tag=");
        A16.append(this.A00);
        A16.append("intEncoding=");
        return AnonymousClass7TG.A0n(this.A01, A16);
    }

    public C12731T4p(C8863RDe rDe, int i) {
        this.A00 = i;
        this.A01 = rDe;
    }
}
