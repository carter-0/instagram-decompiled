package X;

import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import javax.crypto.Mac;

/* renamed from: X.XzQ  reason: case insensitive filesystem */
public final class C22315XzQ implements YAC {
    public final C21980XoY A00;
    public final C21244XQp A01;

    public final C21397Xa5 ARo(byte[] bArr) {
        C21244XQp xQp = this.A01;
        KeyPair A002 = C22024Xt8.A00(C22024Xt8.A01(xQp));
        C21245XQq xQq = C21245XQq.UNCOMPRESSED;
        ECParameterSpec A012 = C22024Xt8.A01(xQp);
        byte[] A05 = C22024Xt8.A05((ECPrivateKey) A002.getPrivate(), (ECPublicKey) C21056XCh.A0D(A012, C22024Xt8.A02(A012.getCurve(), bArr)));
        byte[] A04 = C22024Xt8.A04(xQq, ((ECPublicKey) A002.getPublic()).getW(), C22024Xt8.A01(xQp).getCurve());
        byte[] A013 = C375459Dq.A01(bArr, A04);
        byte[] A014 = C375459Dq.A01(BJp(), C21996Xq3.A0B);
        C21980XoY xoY = this.A00;
        return new C21397Xa5(xoY.A03(A05, A013, A014, Mac.getInstance(xoY.A00).getMacLength()), A04);
    }

    public final byte[] BJp() {
        int ordinal = this.A01.ordinal();
        if (ordinal == 0) {
            return C21996Xq3.A0C;
        }
        if (ordinal != 1) {
            return C21996Xq3.A0E;
        }
        return C21996Xq3.A0D;
    }

    public C22315XzQ(C21980XoY xoY, C21244XQp xQp) {
        this.A00 = xoY;
        this.A01 = xQp;
    }
}
