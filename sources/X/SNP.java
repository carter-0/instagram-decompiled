package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

public final class SNP {
    public final Signature A00;
    public final Cipher A01;
    public final Mac A02;

    public SNP(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public SNP(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public SNP(Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
