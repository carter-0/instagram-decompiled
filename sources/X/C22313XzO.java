package X;

import java.math.BigInteger;
import java.nio.charset.Charset;

/* renamed from: X.XzO  reason: case insensitive filesystem */
public final class C22313XzO implements B1C {
    public static final byte[] A05 = new byte[0];
    public final C21980XoY A00;
    public final YAV A01;
    public final YAC A02;
    public final byte[] A03;
    public final byte[] A04;

    public static C21980XoY A00(XOZ xoz) {
        String str;
        if (xoz.equals(XOZ.A00)) {
            str = "HmacSha256";
        } else if (xoz.equals(XOZ.A01)) {
            str = "HmacSha384";
        } else if (xoz.equals(XOZ.A02)) {
            str = "HmacSha512";
        } else {
            throw AnonymousClass7TG.A0q("Unrecognized HPKE KDF identifier");
        }
        return new C21980XoY(str);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.YAV, java.lang.Object] */
    public static YAV A01(XOY xoy) {
        int i;
        if (xoy.equals(XOY.A00)) {
            i = 16;
        } else if (xoy.equals(XOY.A01)) {
            i = 32;
        } else if (xoy.equals(XOY.A02)) {
            return new Object();
        } else {
            throw AnonymousClass7TG.A0q("Unrecognized HPKE AEAD identifier");
        }
        return new C40228AWs(i);
    }

    public static YAC A02(XOa xOa) {
        C21244XQp xQp;
        C21980XoY xoY;
        C21244XQp xQp2;
        if (xOa.equals(XOa.A03)) {
            return new C22314XzP(new C21980XoY("HmacSha256"));
        }
        if (xOa.equals(XOa.A00)) {
            xQp = C21244XQp.NIST_P256;
        } else if (xOa.equals(XOa.A01)) {
            xQp = C21244XQp.NIST_P384;
        } else if (xOa.equals(XOa.A02)) {
            xQp = C21244XQp.NIST_P521;
        } else {
            throw AnonymousClass7TG.A0q("Unrecognized HPKE KEM identifier");
        }
        int ordinal = xQp.ordinal();
        if (ordinal == 0) {
            xoY = new C21980XoY("HmacSha256");
            xQp2 = C21244XQp.NIST_P256;
        } else if (ordinal != 1) {
            xoY = new C21980XoY("HmacSha512");
            xQp2 = C21244XQp.NIST_P521;
        } else {
            xoY = new C21980XoY("HmacSha384");
            xQp2 = C21244XQp.NIST_P384;
        }
        return new C22315XzQ(xoY, xQp2);
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.A03;
        YAC yac = this.A02;
        C21980XoY xoY = this.A00;
        YAV yav = this.A01;
        C21397Xa5 ARo = yac.ARo(bArr3);
        byte[] bArr4 = ARo.A00;
        byte[] bArr5 = ARo.A01;
        byte[] bArr6 = C21996Xq3.A03;
        byte[] A042 = C375459Dq.A04(C21996Xq3.A09, yac.BJp(), xoY.A01(), yav.AaA());
        byte[] bArr7 = C21996Xq3.A05;
        byte[] bArr8 = XYE.A00;
        byte[] A043 = C375459Dq.A04(bArr6, xoY.A02("psk_id_hash", bArr7, bArr8, A042), xoY.A02("info_hash", bArr7, bArr2, A042));
        byte[] A022 = xoY.A02("secret", bArr5, bArr8, A042);
        int BK7 = yav.BK7();
        byte[] A012 = C21996Xq3.A01(2, BK7);
        byte[] bArr9 = C21996Xq3.A0A;
        Charset charset = C3740397x.A00;
        byte[] A002 = C21980XoY.A00(xoY, A022, C375459Dq.A04(A012, bArr9, A042, "key".getBytes(charset), A043), BK7);
        byte[] A003 = C21980XoY.A00(xoY, A022, C375459Dq.A04(C21996Xq3.A01(2, 12), bArr9, A042, "base_nonce".getBytes(charset), A043), 12);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = bigInteger.shiftLeft(96).subtract(bigInteger);
        BigInteger bigInteger2 = BigInteger.ZERO;
        byte[] bArr10 = A05;
        byte[] A023 = C375459Dq.A02(A003, C21514Xdg.A01(bigInteger2, 12));
        if (bigInteger2.compareTo(subtract) < 0) {
            bigInteger2.add(bigInteger);
            byte[] A013 = C375459Dq.A01(yav.EKp(A002, A023, bArr, bArr10), bArr4);
            byte[] bArr11 = this.A04;
            if (bArr11.length != 0) {
                return C375459Dq.A01(A013, bArr11);
            }
            return A013;
        }
        throw AnonymousClass7TG.A0q("message limit reached");
    }

    public C22313XzO(C21980XoY xoY, YAV yav, YAC yac, C3740497y r5, C3740497y r6) {
        this.A03 = r5.A01();
        this.A02 = yac;
        this.A00 = xoY;
        this.A01 = yav;
        this.A04 = r6.A01();
    }
}
