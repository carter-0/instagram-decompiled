package X;

import android.media.MediaCodec;

/* renamed from: X.4PT  reason: invalid class name */
public final class AnonymousClass4PT {
    public byte[] A00;
    public byte[] A01;
    public int[] A02;
    public int[] A03;
    public final MediaCodec.CryptoInfo A04;
    public final AnonymousClass4PV A05;

    public AnonymousClass4PT() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A04 = cryptoInfo;
        this.A05 = new AnonymousClass4PV(cryptoInfo);
    }
}
