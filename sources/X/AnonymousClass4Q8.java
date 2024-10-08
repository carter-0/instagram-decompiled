package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.4Q8  reason: invalid class name */
public final class AnonymousClass4Q8 extends C264434Pw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = Util.A06;

    public final ByteBuffer BZT() {
        int i;
        if (super.CSi() && (i = this.A00) > 0) {
            ByteBuffer A022 = A02(i);
            A022.put(this.A06, 0, this.A00);
            A022.flip();
            this.A00 = 0;
        }
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C264394Ps.A00;
        return byteBuffer;
    }

    public final boolean CSi() {
        if (!super.CSi() || this.A00 != 0) {
            return false;
        }
        return true;
    }

    public final void E5v(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A022 = A02(length);
                int max = Math.max(0, Math.min(length, this.A00));
                A022.put(this.A06, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i3));
                byteBuffer.limit(byteBuffer.position() + max2);
                A022.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - max2;
                int i5 = this.A00 - max;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A022.flip();
            }
        }
    }
}
