package X;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

public final class A9M {
    public final C39731A6x A00;
    public final C39668A4i A01;
    public final C39732A6y A02;

    public final void A00() {
        C39732A6y a6y = this.A02;
        a6y.A01 = 0;
        a6y.A04 = 0;
        a6y.A02 = 0;
        a6y.A03 = 0;
        a6y.A00 = 0;
        C39731A6x a6x = this.A00;
        a6x.A04 = 0;
        a6x.A03 = 0;
        a6x.A00 = 0;
        a6x.A02 = 0;
        a6x.A01 = 0;
        C39668A4i a4i = this.A01;
        a4i.A00 = false;
        a4i.A01 = false;
    }

    public final void A01(byte[] bArr, int i) {
        short s;
        if (bArr != null && i != 0) {
            ShortBuffer asShortBuffer = ByteBuffer.wrap(bArr).asShortBuffer();
            int min = Math.min(i, bArr.length) / 2;
            for (int i2 = 0; i2 < min; i2++) {
                short s2 = asShortBuffer.get(i2);
                C39668A4i a4i = this.A01;
                C39731A6x a6x = this.A00;
                short abs = (short) Math.abs(s2);
                if (!a4i.A01 && s2 != 0) {
                    a4i.A01 = true;
                }
                if (!a4i.A00 && abs > 184) {
                    a4i.A00 = true;
                }
                short s3 = a6x.A03;
                if (s3 <= 32440 || ((s = a6x.A04) <= 32440 ? s >= -32440 || s2 >= -32440 : s2 <= 32440)) {
                    int i3 = a6x.A00;
                    if (i3 > 0) {
                        a6x.A02 += i3 + 1;
                        a6x.A00 = 0;
                    }
                } else {
                    a6x.A00++;
                }
                if ((a6x.A04 == 0 && abs > 2048) || (s2 == 0 && s3 > 2048)) {
                    a6x.A01++;
                }
                a6x.A04 = s2;
                a6x.A03 = abs;
            }
            C39732A6y a6y = this.A02;
            a6y.A01++;
            C39668A4i a4i2 = this.A01;
            if (!a4i2.A01) {
                a6y.A04++;
            }
            if (!a4i2.A00) {
                a6y.A02++;
            }
            a4i2.A00 = false;
            a4i2.A01 = false;
        }
    }

    public A9M(C39732A6y a6y) {
        this.A02 = a6y;
        C39731A6x a6x = new C39731A6x();
        this.A00 = a6x;
        C39668A4i a4i = new C39668A4i();
        this.A01 = a4i;
        a6x.A04 = 0;
        a6x.A03 = 0;
        a6x.A00 = 0;
        a6x.A02 = 0;
        a6x.A01 = 0;
        a4i.A00 = false;
        a4i.A01 = false;
    }
}
