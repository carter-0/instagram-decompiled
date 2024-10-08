package X;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: X.TPi  reason: case insensitive filesystem */
public final class C13202TPi implements C13970TmY {
    public int A00;
    public boolean A01;
    public final Inflater A02;
    public final YCT A03;

    public final long E6C(C13198TPe tPe, long j) {
        boolean z;
        if (j < 0) {
            throw Pxg.A0b("byteCount < 0: ", j);
        } else if (this.A01) {
            throw Pxh.A0a();
        } else if (j == 0) {
            return 0;
        } else {
            do {
                Inflater inflater = this.A02;
                z = false;
                if (inflater.needsInput()) {
                    int i = this.A00;
                    if (i != 0) {
                        int remaining = i - inflater.getRemaining();
                        this.A00 -= remaining;
                        this.A03.Evi((long) remaining);
                    }
                    if (inflater.getRemaining() == 0) {
                        YCT yct = this.A03;
                        if (yct.ATS()) {
                            z = true;
                        } else {
                            SRX srx = yct.AEA().A01;
                            int i2 = srx.A00;
                            int i3 = srx.A01;
                            int i4 = i2 - i3;
                            this.A00 = i4;
                            inflater.setInput(srx.A06, i3, i4);
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("?");
                    }
                }
                try {
                    SRX A09 = tPe.A09(1);
                    int i5 = A09.A00;
                    int inflate = inflater.inflate(A09.A06, i5, (int) Math.min(j, (long) (8192 - i5)));
                    if (inflate > 0) {
                        A09.A00 += inflate;
                        long j2 = (long) inflate;
                        tPe.A00 += j2;
                        return j2;
                    } else if (inflater.finished() || inflater.needsDictionary()) {
                        int i6 = this.A00;
                        if (i6 != 0) {
                            int remaining2 = i6 - inflater.getRemaining();
                            this.A00 -= remaining2;
                            this.A03.Evi((long) remaining2);
                        }
                        if (A09.A01 != A09.A00) {
                            return -1;
                        }
                        SRX.A01(tPe, A09);
                        return -1;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            } while (!z);
            throw new EOFException("source exhausted prematurely");
        }
    }

    public final C11291SJy Ezn() {
        return this.A03.Ezn();
    }

    public final void close() {
        if (!this.A01) {
            this.A02.end();
            this.A01 = true;
            this.A03.close();
        }
    }

    public C13202TPi(Inflater inflater, YCT yct) {
        this.A03 = yct;
        this.A02 = inflater;
    }
}
