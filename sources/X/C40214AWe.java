package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AWe  reason: case insensitive filesystem */
public final class C40214AWe implements AnonymousClass98Q {
    public final int A00;
    public final AnonymousClass98U A01;
    public final AGp A02;
    public final byte[] A03;

    public static C40214AWe A00(AnonymousClass99M r7) {
        ThreadLocal threadLocal = AGp.A04;
        C375079Cd r0 = r7.A02;
        C375049Ca r6 = C375049Ca.A00;
        byte[] A022 = r0.A02(r6);
        AnonymousClass99S r5 = r7.A00;
        AGp aGp = new AGp(A022, r5.A02);
        C3739197l r02 = C40233AWx.A04;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("HMAC");
        C40233AWx aWx = new C40233AWx(AnonymousClass7TF.A0i(r5.A04, A1A), new SecretKeySpec(r7.A03.A02(r6), "HMAC"));
        int i = r5.A03;
        return new C40214AWe(new C40224AWo(aWx, i), aGp, r7.A01.A01(), i);
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr2;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        int i = this.A00;
        byte[] bArr5 = this.A03;
        int length2 = bArr5.length;
        if (length < i + length2) {
            throw AnonymousClass7TG.A0q("Decryption failed (ciphertext too short).");
        } else if (C3740397x.A02(bArr5, bArr4)) {
            int i2 = length - i;
            byte[] copyOfRange = Arrays.copyOfRange(bArr4, length2, i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, i2, length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            }
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(((long) bArr3.length) * 8);
            byte[] copyOf = Arrays.copyOf(allocate.array(), 8);
            if (MessageDigest.isEqual(((C40224AWo) this.A01).AIl(C375459Dq.A04(bArr3, copyOfRange, copyOf)), copyOfRange2)) {
                AGp aGp = this.A02;
                int length3 = copyOfRange.length;
                int i3 = aGp.A00;
                if (length3 >= i3) {
                    byte[] bArr6 = new byte[i3];
                    System.arraycopy(copyOfRange, 0, bArr6, 0, i3);
                    int i4 = length3 - i3;
                    byte[] bArr7 = new byte[i4];
                    AGp.A00(aGp, copyOfRange, bArr7, bArr6, i3, i4, 0, false);
                    return bArr7;
                }
                throw AnonymousClass7TG.A0q("ciphertext too short");
            }
            throw AnonymousClass7TG.A0q("invalid MAC");
        } else {
            throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        AGp aGp = this.A02;
        byte[] bArr3 = bArr;
        int length = bArr.length;
        int i = aGp.A00;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr4 = new byte[(length + i)];
            byte[] A002 = AnonymousClass9B0.A00(i);
            System.arraycopy(A002, 0, bArr4, 0, i);
            AGp.A00(aGp, bArr3, bArr4, A002, 0, length, i, true);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putLong(((long) bArr2.length) * 8);
            return C375459Dq.A04(this.A03, bArr4, this.A01.AIl(C375459Dq.A04(bArr2, bArr4, Arrays.copyOf(allocate.array(), 8))));
        }
        throw AnonymousClass7TG.A0q(002.A0O("plaintext length can not exceed ", i2));
    }

    public C40214AWe(AnonymousClass98U r1, AGp aGp, byte[] bArr, int i) {
        this.A02 = aGp;
        this.A01 = r1;
        this.A00 = i;
        this.A03 = bArr;
    }
}
