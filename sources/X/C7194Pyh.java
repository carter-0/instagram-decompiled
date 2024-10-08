package X;

import java.nio.charset.Charset;

/* renamed from: X.Pyh  reason: case insensitive filesystem */
public final class C7194Pyh implements C13831Ti3 {
    public final C7189Pyc A00;

    public final void FNm(int i, boolean z) {
        C7193Pyg pyg = (C7193Pyg) this.A00;
        C7193Pyg.A06(pyg, 11);
        pyg.A0H(i << 3);
        byte b = z ? (byte) 1 : 0;
        byte[] bArr = pyg.A03;
        int i2 = pyg.A00;
        pyg.A00 = i2 + 1;
        bArr[i2] = b;
        pyg.A01++;
    }

    public final void FNo(AnonymousClass5L9 r3, int i) {
        C7189Pyc pyc = this.A00;
        pyc.A07((i << 3) | 2);
        pyc.A0D(r3);
    }

    public final void FNt(AnonymousClass5L3 r4, Object obj, int i) {
        C7189Pyc pyc = this.A00;
        int i2 = i << 3;
        pyc.A07(i2 | 3);
        r4.FOE(pyc.A00, obj);
        pyc.A07(i2 | 4);
    }

    public final void FNy(AnonymousClass5L3 r6, Object obj, int i) {
        C7189Pyc pyc = this.A00;
        C284005Km r7 = (C284005Km) obj;
        pyc.A07((i << 3) | 2);
        C283995Kl r3 = (C283995Kl) r7;
        C283985Kk r2 = (C283985Kk) r3;
        int i2 = r2.memoizedSerializedSize;
        if (i2 == -1) {
            i2 = r6.Bsa(r3);
            r2.memoizedSerializedSize = i2;
        }
        pyc.A07(i2);
        r6.FOE(pyc.A00, r7);
    }

    public final void FO4(int i, int i2) {
        C7189Pyc pyc = this.A00;
        int A02 = Pxe.A02(i2);
        C7193Pyg pyg = (C7193Pyg) pyc;
        C7193Pyg.A06(pyg, 20);
        pyg.A0H(i << 3);
        pyg.A0H(A02);
    }

    public final void FO5(int i, long j) {
        this.A00.A0B(i, (j >> 63) ^ (j << 1));
    }

    public final void FOG(int i, int i2) {
        C7193Pyg pyg = (C7193Pyg) this.A00;
        C7193Pyg.A06(pyg, 20);
        pyg.A0H(i << 3);
        pyg.A0H(i2);
    }

    public C7194Pyh(C7189Pyc pyc) {
        Charset charset = C284045Ks.A03;
        this.A00 = pyc;
        pyc.A00 = this;
    }
}
