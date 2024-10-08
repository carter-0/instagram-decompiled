package X;

import java.nio.ByteBuffer;
import java.util.Arrays;

public final class AWZ implements AnonymousClass98Q {
    public final C15230UWp A00;
    public final byte[] A01;

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
        byte[] A002 = AnonymousClass9B0.A00(12);
        allocate.put(A002);
        this.A00.A02(allocate, A002, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.A01;
        if (bArr3.length != 0) {
            return C375459Dq.A01(array, bArr3);
        }
        return array;
    }

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A01;
        int length = bArr3.length;
        if (length != 0) {
            if (C3740397x.A02(bArr3, bArr)) {
                bArr = Arrays.copyOfRange(bArr, length, bArr.length);
            } else {
                throw AnonymousClass7TG.A0q("Decryption failed (OutputPrefix mismatch).");
            }
        }
        int length2 = bArr.length;
        if (length2 >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.A00.A03(ByteBuffer.wrap(bArr, 12, length2 - 12), copyOf, bArr2);
        }
        throw AnonymousClass7TG.A0q("ciphertext too short");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.AH9, X.UWp] */
    public AWZ(byte[] bArr, byte[] bArr2) {
        this.A00 = new AH9(bArr);
        this.A01 = bArr2;
    }
}
