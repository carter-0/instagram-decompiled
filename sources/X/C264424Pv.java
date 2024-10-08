package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;

/* renamed from: X.4Pv  reason: invalid class name and case insensitive filesystem */
public final class C264424Pv extends C264434Pw {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;

    public C264424Pv() {
        byte[] bArr = Util.A06;
        this.A07 = bArr;
        this.A08 = bArr;
    }

    public static void A00(C264424Pv r2, byte[] bArr, int i) {
        ByteBuffer A022 = r2.A02(i);
        A022.put(bArr, 0, i);
        A022.flip();
        if (i > 0) {
            r2.A06 = true;
        }
    }

    private void A01(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        int i2 = this.A02;
        int min = Math.min(remaining, i2);
        int i3 = i2 - min;
        System.arraycopy(bArr, i - i3, this.A08, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.A08, i3, min);
    }

    public final void E5v(ByteBuffer byteBuffer) {
        int limit;
        int position;
        int i;
        int limit2;
        long j;
        int i2;
        int limit3;
        while (byteBuffer.hasRemaining() && !this.A01.hasRemaining()) {
            int i3 = this.A03;
            if (i3 != 0) {
                limit = byteBuffer.limit();
                int position2 = byteBuffer.position();
                if (i3 != 1) {
                    while (true) {
                        if (position2 >= byteBuffer.limit()) {
                            limit3 = byteBuffer.limit();
                            break;
                        } else if (Math.abs(byteBuffer.getShort(position2)) > 1024) {
                            int i4 = this.A00;
                            limit3 = i4 * (position2 / i4);
                            break;
                        } else {
                            position2 += 2;
                        }
                    }
                    byteBuffer.limit(limit3);
                    this.A04 += (long) (byteBuffer.remaining() / this.A00);
                    A01(byteBuffer, this.A08, this.A02);
                    if (limit3 < limit) {
                        A00(this, this.A08, this.A02);
                        i = 0;
                    }
                } else {
                    while (true) {
                        if (position2 >= byteBuffer.limit()) {
                            limit2 = byteBuffer.limit();
                            break;
                        } else if (Math.abs(byteBuffer.getShort(position2)) > 1024) {
                            int i5 = this.A00;
                            limit2 = i5 * (position2 / i5);
                            break;
                        } else {
                            position2 += 2;
                        }
                    }
                    int position3 = limit2 - byteBuffer.position();
                    byte[] bArr = this.A07;
                    int length = bArr.length;
                    int i6 = this.A01;
                    int i7 = length - i6;
                    if (limit2 >= limit || position3 >= i7) {
                        int min = Math.min(position3, i7);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.A07, this.A01, min);
                        int i8 = this.A01 + min;
                        this.A01 = i8;
                        byte[] bArr2 = this.A07;
                        if (i8 == bArr2.length) {
                            i = 2;
                            if (this.A06) {
                                A00(this, bArr2, this.A02);
                                j = this.A04;
                                i8 = this.A01;
                                i2 = this.A02 * 2;
                            } else {
                                j = this.A04;
                                i2 = this.A02;
                            }
                            this.A04 = j + ((long) ((i8 - i2) / this.A00));
                            A01(byteBuffer, this.A07, i8);
                            this.A01 = 0;
                        }
                        byteBuffer.limit(limit);
                    } else {
                        A00(this, bArr, i6);
                        this.A01 = 0;
                        this.A03 = 0;
                    }
                }
            } else {
                limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.A07.length));
                int limit4 = byteBuffer.limit();
                while (true) {
                    limit4 -= 2;
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit4)) > 1024) {
                            int i9 = this.A00;
                            position = ((limit4 / i9) * i9) + i9;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    i = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    ByteBuffer A022 = A02(remaining);
                    A022.put(byteBuffer);
                    A022.flip();
                    if (remaining > 0) {
                        this.A06 = true;
                    }
                    byteBuffer.limit(limit);
                }
            }
            this.A03 = i;
            byteBuffer.limit(limit);
        }
    }
}
