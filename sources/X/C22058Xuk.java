package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* renamed from: X.Xuk  reason: case insensitive filesystem */
public final class C22058Xuk implements YBY {
    public C21984Xof A00;
    public C21984Xof A01;
    public C21984Xof A02;
    public C21984Xof A03;
    public ByteBuffer A04;
    public ByteBuffer A05;
    public ShortBuffer A06;

    public final void reset() {
        C21984Xof xof = C21984Xof.A04;
        this.A02 = xof;
        this.A03 = xof;
        this.A00 = xof;
        this.A01 = xof;
        ByteBuffer byteBuffer = YBY.A00;
        this.A04 = byteBuffer;
        this.A06 = byteBuffer.asShortBuffer();
        this.A05 = byteBuffer;
    }

    public C22058Xuk() {
        C21984Xof xof = C21984Xof.A04;
        this.A02 = xof;
        this.A03 = xof;
        this.A00 = xof;
        this.A01 = xof;
        ByteBuffer byteBuffer = YBY.A00;
        this.A04 = byteBuffer;
        this.A06 = byteBuffer.asShortBuffer();
        this.A05 = byteBuffer;
    }
}
