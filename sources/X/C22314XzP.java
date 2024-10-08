package X;

import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: X.XzP  reason: case insensitive filesystem */
public final class C22314XzP implements YAC {
    public final C21980XoY A00;

    public final C21397Xa5 ARo(byte[] bArr) {
        byte[] A002 = AnonymousClass9B0.A00(32);
        A002[0] = (byte) (A002[0] | 7);
        byte b = (byte) (A002[31] & 63);
        A002[31] = b;
        A002[31] = (byte) (b | 128);
        byte[] A01 = C18109Vld.A01(A002, bArr);
        byte[] A003 = C18109Vld.A00(A002);
        return new C21397Xa5(this.A00.A03(A01, C375459Dq.A01(bArr, A003), C375459Dq.A01(C21996Xq3.A0F, C21996Xq3.A0B), Mac.getInstance("HmacSha256").getMacLength()), A003);
    }

    public final byte[] BJp() {
        if (Arrays.equals(this.A00.A01(), C21996Xq3.A06)) {
            return C21996Xq3.A0F;
        }
        throw AnonymousClass7TG.A0q("Could not determine HPKE KEM ID");
    }

    public C22314XzP(C21980XoY xoY) {
        this.A00 = xoY;
    }
}
