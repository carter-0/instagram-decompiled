package X;

import java.io.EOFException;

/* renamed from: X.SfC  reason: case insensitive filesystem */
public final class C11715SfC implements C13900TjN {
    public final byte[] A00 = new byte[4096];

    public final void AWO(SJM sjm) {
    }

    public final /* synthetic */ int EJe(C13506TbX tbX, int i, boolean z) {
        return EJk(tbX, i, 0, z);
    }

    public final void EJm(S4h s4h, int i, int i2, int i3, long j) {
    }

    public final int EJk(C13506TbX tbX, int i, int i2, boolean z) {
        int read = tbX.read(this.A00, 0, Math.min(4096, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final /* synthetic */ void EJf(C11389SRd sRd, int i) {
        sRd.A0P(i);
    }

    public final void EJg(C11389SRd sRd, int i, int i2) {
        sRd.A0P(i);
    }
}
