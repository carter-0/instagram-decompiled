package X;

import java.nio.ByteBuffer;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.XzN  reason: case insensitive filesystem */
public final class C22312XzN implements B1C {
    public static final C3742398r A06;
    public static final C3742398r A07;
    public static final byte[] A08 = new byte[0];
    public final YAD A00;
    public final XZE A01;
    public final C21245XQq A02;
    public final String A03;
    public final byte[] A04;
    public final byte[] A05;

    static {
        C3742198p r2 = new C3742198p();
        r2.A01(C21244XQp.NIST_P256, Xnm.A01);
        r2.A01(C21244XQp.NIST_P384, Xnm.A02);
        r2.A01(C21244XQp.NIST_P521, Xnm.A03);
        A06 = r2.A00();
        C3742198p r22 = new C3742198p();
        r22.A01(C21245XQq.UNCOMPRESSED, Xnj.A03);
        r22.A01(C21245XQq.COMPRESSED, Xnj.A01);
        r22.A01(C21245XQq.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, Xnj.A02);
        A07 = r22.A00();
    }

    public static YAD A00(AnonymousClass983 r2) {
        if (r2 instanceof C3743299a) {
            return new AX0((C3743299a) r2);
        }
        if (r2 instanceof AnonymousClass99S) {
            return new AX1((AnonymousClass99S) r2);
        }
        if (r2 instanceof AnonymousClass981) {
            return new AX2((AnonymousClass981) r2);
        }
        throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(r2, "Unsupported parameters for Ecies: ", AnonymousClass7TE.A1A()));
    }

    public static final String A01(Xnn xnn) {
        if (xnn.equals(Xnn.A01)) {
            return "HmacSha1";
        }
        if (xnn.equals(Xnn.A02)) {
            return "HmacSha224";
        }
        if (xnn.equals(Xnn.A03)) {
            return "HmacSha256";
        }
        if (xnn.equals(Xnn.A04)) {
            return "HmacSha384";
        }
        if (xnn.equals(Xnn.A05)) {
            return "HmacSha512";
        }
        throw AnonymousClass7TG.A0q(AnonymousClass7TG.A0m(xnn, "hash unsupported for EciesAeadHkdf: ", AnonymousClass7TE.A1A()));
    }

    public final byte[] ASD(byte[] bArr, byte[] bArr2) {
        byte[] ASE;
        XZE xze = this.A01;
        String str = this.A03;
        byte[] bArr3 = this.A04;
        YAD yad = this.A00;
        int C3c = yad.C3c();
        C21245XQq xQq = this.A02;
        ECPublicKey eCPublicKey = xze.A00;
        KeyPair A002 = C22024Xt8.A00(eCPublicKey.getParams());
        ECPublicKey eCPublicKey2 = (ECPublicKey) A002.getPublic();
        byte[] A052 = C22024Xt8.A05((ECPrivateKey) A002.getPrivate(), eCPublicKey);
        byte[] A042 = C22024Xt8.A04(xQq, eCPublicKey2.getW(), eCPublicKey2.getParams().getCurve());
        byte[] A012 = C375459Dq.A01(A052, A042);
        Mac mac = (Mac) AnonymousClass9DU.A05.A00.BHw(str);
        if (C3c <= mac.getMacLength() * 255) {
            if (bArr3.length == 0) {
                bArr3 = new byte[mac.getMacLength()];
            }
            mac.init(new SecretKeySpec(bArr3, str));
            byte[] bArr4 = new byte[C3c];
            mac.init(new SecretKeySpec(mac.doFinal(A012), str));
            byte[] bArr5 = new byte[0];
            int i = 1;
            int i2 = 0;
            while (true) {
                mac.update(bArr5);
                mac.update(bArr2);
                mac.update((byte) i);
                bArr5 = mac.doFinal();
                int length = bArr5.length;
                if (length + i2 >= C3c) {
                    break;
                }
                System.arraycopy(bArr5, 0, bArr4, i2, length);
                i2 += length;
                i++;
            }
            System.arraycopy(bArr5, 0, bArr4, i2, C3c - i2);
            C3740497y A003 = C3740497y.A00(A042);
            C21963Xms AaB = yad.AaB(C3740497y.A00(bArr4).A01());
            byte[] bArr6 = A08;
            AnonymousClass98Q r0 = AaB.A00;
            if (r0 != null) {
                ASE = r0.ASD(bArr, bArr6);
            } else {
                ASE = AaB.A01.ASE(bArr, bArr6);
            }
            byte[] A013 = A003.A01();
            ByteBuffer allocate = ByteBuffer.allocate(A013.length + ASE.length);
            allocate.put(A013);
            allocate.put(ASE);
            byte[] array = allocate.array();
            byte[] bArr7 = this.A05;
            if (bArr7.length != 0) {
                return C375459Dq.A01(array, bArr7);
            }
            return array;
        }
        throw AnonymousClass7TG.A0q("size too large");
    }

    public C22312XzN(YAD yad, C21245XQq xQq, String str, ECPublicKey eCPublicKey, byte[] bArr, byte[] bArr2) {
        C22029Xtj.A07(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.A01 = new XZE(eCPublicKey);
        this.A04 = bArr;
        this.A03 = str;
        this.A02 = xQq;
        this.A00 = yad;
        this.A05 = bArr2;
    }
}
