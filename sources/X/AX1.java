package X;

import java.util.Arrays;

public final class AX1 implements YAD {
    public final /* synthetic */ AnonymousClass99S A00;

    public AX1(AnonymousClass99S r1) {
        this.A00 = r1;
    }

    public final C21963Xms AaB(byte[] bArr) {
        AnonymousClass99S r5 = this.A00;
        int i = r5.A00;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        int i2 = r5.A01;
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, i + i2);
        C375049Ca r0 = C375049Ca.A00;
        C375079Cd A01 = C375079Cd.A01(r0, copyOfRange);
        C375079Cd A012 = C375079Cd.A01(r0, copyOfRange2);
        if (i != A01.A00.A00.length) {
            throw AnonymousClass7TG.A0q("AES key size mismatch");
        } else if (i2 != A012.A00.A00.length) {
            throw AnonymousClass7TG.A0q("HMAC key size mismatch");
        } else if (!r5.A00()) {
            return new C21963Xms((AnonymousClass98Q) C40214AWe.A00(new AnonymousClass99M(r5, C393219w5.A00(r5, (Integer) null), A01, A012, (Integer) null)));
        } else {
            throw AnonymousClass7TG.A0q("Cannot create key without ID requirement with parameters with ID requirement");
        }
    }

    public final int C3c() {
        AnonymousClass99S r0 = this.A00;
        return r0.A00 + r0.A01;
    }
}
