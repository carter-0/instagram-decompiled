package X;

import java.util.Arrays;

public final class AWY implements AnonymousClass98Q {
    public final AnonymousClass98Q A00;
    public final byte[] A01;

    public final byte[] AOH(byte[] bArr, byte[] bArr2) {
        AnonymousClass98Q r2;
        byte[] bArr3 = this.A01;
        if (bArr3.length == 0) {
            r2 = this.A00;
        } else if (C3740397x.A02(bArr3, bArr)) {
            r2 = this.A00;
            bArr = Arrays.copyOfRange(bArr, 5, bArr.length);
        } else {
            throw AnonymousClass7TG.A0q("wrong prefix");
        }
        return r2.AOH(bArr, bArr2);
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A01;
        int length = bArr3.length;
        byte[] ASD = this.A00.ASD(bArr, bArr2);
        if (length != 0) {
            return C375459Dq.A01(ASD, bArr3);
        }
        return ASD;
    }

    public AWY(AnonymousClass98Q r3, byte[] bArr) {
        this.A00 = r3;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.A01 = bArr;
            return;
        }
        throw AnonymousClass7TE.A0w("identifier has an invalid length");
    }
}
