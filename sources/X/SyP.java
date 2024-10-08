package X;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcz;

public final class SyP implements zzcz {
    public final int A00;
    public final RDO A01;

    public SyP(RDO rdo, int i) {
        this.A00 = i;
        this.A01 = rdo;
    }

    public final Class annotationType() {
        return zzcz.class;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzcz) {
                SyP syP = (SyP) ((zzcz) obj);
                if (this.A00 != syP.A00 || !this.A01.equals(syP.A01)) {
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
