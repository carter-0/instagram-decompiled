package X;

import com.google.android.gms.internal.mlkit_vision_common.zzah;

public final class SyL implements zzah {
    public final int A00;
    public final RDN A01;

    public SyL(RDN rdn, int i) {
        this.A00 = i;
        this.A01 = rdn;
    }

    public final Class annotationType() {
        return zzah.class;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzah) {
                SyL syL = (SyL) ((zzah) obj);
                if (this.A00 != syL.A00 || !this.A01.equals(syL.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 ^ 14552422) + (this.A01.hashCode() ^ 2041407134);
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("@com.google.firebase.encoders.proto.Protobuf");
        A16.append("(tag=");
        A16.append(this.A00);
        A16.append("intEncoding=");
        return AnonymousClass7TG.A0n(this.A01, A16);
    }
}
