package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;

public final class SIO {
    public C266724aF A00;
    public MediaEffect A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SIO sio = (SIO) obj;
            if (!this.A00.equals(sio.A00) || !this.A01.equals(sio.A01)) {
                return false;
            }
        }
        return true;
    }

    public static void A00(C266724aF r1, MediaEffect mediaEffect, C266764aJ r3) {
        r3.A03(new SIO(r1, mediaEffect));
    }

    public final int hashCode() {
        return Pxf.A0A(this.A00, this.A01);
    }

    public SIO(C266724aF r1, MediaEffect mediaEffect) {
        this.A00 = r1;
        this.A01 = mediaEffect;
    }
}
