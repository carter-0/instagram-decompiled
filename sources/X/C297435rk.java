package X;

import javax.crypto.Mac;

/* renamed from: X.5rk  reason: invalid class name and case insensitive filesystem */
public final class C297435rk extends 2RP {
    public boolean A00;
    public final Mac A01;

    public final void A00(byte b) {
        17k.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(b);
    }

    public final void A01(byte[] bArr) {
        17k.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(bArr);
    }

    public final void A02(byte[] bArr, int i, int i2) {
        17k.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A01.update(bArr, i, i2);
    }

    public C297435rk(Mac mac) {
        this.A01 = mac;
    }
}
