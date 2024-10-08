package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.Xuj  reason: case insensitive filesystem */
public abstract class C22057Xuj implements YBY {
    public C21984Xof A00;
    public C21984Xof A01;
    public C21984Xof A02;
    public C21984Xof A03;
    public ByteBuffer A04;
    public ByteBuffer A05;

    public final void reset() {
        ByteBuffer byteBuffer = YBY.A00;
        this.A04 = byteBuffer;
        this.A00 = this.A02;
        this.A01 = this.A03;
        boolean z = this instanceof C21139XGg;
        if (!z || ((C21139XGg) this) != null) {
            this.A05 = byteBuffer;
            C21984Xof xof = C21984Xof.A04;
            this.A02 = xof;
            this.A03 = xof;
            this.A00 = xof;
            this.A01 = xof;
            if (this instanceof C21138XGf) {
                ((C21138XGf) this).A00 = Util.A07;
            } else if (z) {
                C21139XGg xGg = (C21139XGg) this;
                byte[] bArr = Util.A07;
                xGg.A01 = bArr;
                xGg.A00 = bArr;
            }
        } else {
            throw new NullPointerException("pendingOutputAudioFormat");
        }
    }

    public C22057Xuj() {
        ByteBuffer byteBuffer = YBY.A00;
        this.A05 = byteBuffer;
        this.A04 = byteBuffer;
        C21984Xof xof = C21984Xof.A04;
        this.A02 = xof;
        this.A03 = xof;
        this.A00 = xof;
        this.A01 = xof;
    }
}
