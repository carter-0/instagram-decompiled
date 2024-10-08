package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWo  reason: case insensitive filesystem */
public final class C40224AWo implements AnonymousClass98U {
    public static final byte[] A04 = {0};
    public final int A00;
    public final AnonymousClass9DT A01;
    public final byte[] A02;
    public final byte[] A03;

    public final byte[] AIl(byte[] bArr) {
        byte[] AIg;
        byte[] bArr2 = this.A03;
        int length = bArr2.length;
        byte[][] bArr3 = new byte[2][];
        bArr3[0] = this.A02;
        if (length > 0) {
            AIg = this.A01.AIg(C375459Dq.A01(bArr2, bArr), this.A00);
        } else {
            AIg = this.A01.AIg(bArr, this.A00);
        }
        bArr3[1] = AIg;
        return C375459Dq.A04(bArr3);
    }

    public C40224AWo(AnonymousClass9DT r3, int i) {
        this.A01 = r3;
        this.A00 = i;
        this.A02 = new byte[0];
        this.A03 = new byte[0];
        if (i >= 10) {
            r3.AIg(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public C40224AWo(AnonymousClass998 r3) {
        byte[] bArr;
        C3739197l r0 = AnonymousClass9DS.A03;
        this.A01 = new AnonymousClass9DS(r3.A02.A02(C375049Ca.A00));
        AnonymousClass994 r1 = r3.A00;
        this.A00 = r1.A01;
        this.A02 = r3.A01.A01();
        if (r1.A02.equals(AnonymousClass992.A02)) {
            bArr = Arrays.copyOf(A04, 1);
        } else {
            bArr = new byte[0];
        }
        this.A03 = bArr;
    }

    public C40224AWo(AnonymousClass98Z r6) {
        byte[] bArr;
        C3739197l r0 = C40233AWx.A04;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HMAC");
        C3742798v r3 = r6.A00;
        this.A01 = new C40233AWx(AnonymousClass7TF.A0i(r3.A02, A1A), new SecretKeySpec(r6.A02.A02(C375049Ca.A00), "HMAC"));
        this.A00 = r3.A01;
        this.A02 = r6.A01.A01();
        if (r3.A03.equals(C3742298q.A02)) {
            bArr = Arrays.copyOf(A04, 1);
        } else {
            bArr = new byte[0];
        }
        this.A03 = bArr;
    }
}
