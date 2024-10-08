package X;

import android.media.MediaCodec;

/* renamed from: X.Rxi  reason: case insensitive filesystem */
public final class C10764Rxi {
    public byte[] A00;
    public byte[] A01;
    public int[] A02;
    public int[] A03;
    public final MediaCodec.CryptoInfo A04;
    public final C10342Rqf A05;

    public C10764Rxi() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A04 = cryptoInfo;
        this.A05 = new C10342Rqf(cryptoInfo);
    }
}
