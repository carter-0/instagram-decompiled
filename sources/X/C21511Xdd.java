package X;

/* renamed from: X.Xdd  reason: case insensitive filesystem */
public abstract class C21511Xdd {
    public static boolean A01(C13910TlA tlA) {
        C11389SRd A0P = Pxe.A0P(8);
        int i = C21960Xmp.A00(A0P, tlA).A00;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        tlA.E2F(A0P.A02, 0, 4);
        A0P.A0O(0);
        int A01 = A0P.A01();
        if (A01 == 1463899717) {
            return true;
        }
        STH.A02("WavHeaderReader", 002.A0O("Unsupported form type: ", A01));
        return false;
    }

    public static C21960Xmp A00(C11389SRd sRd, C13910TlA tlA, int i) {
        while (true) {
            C21960Xmp A00 = C21960Xmp.A00(sRd, tlA);
            int i2 = A00.A00;
            if (i2 == i) {
                return A00;
            }
            STH.A03("WavHeaderReader", 002.A0O("Ignoring unknown WAV chunk: ", i2));
            long j = A00.A01;
            long j2 = j + 8;
            if (j % 2 != 0) {
                j2++;
            }
            if (j2 <= 2147483647L) {
                tlA.Evk((int) j2);
            } else {
                throw new XQX(002.A0O("Chunk is too large (~2GB+) to skip; id: ", i2), (Throwable) null, 1, false);
            }
        }
    }
}
