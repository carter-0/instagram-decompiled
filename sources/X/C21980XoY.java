package X;

import java.nio.charset.Charset;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.XoY  reason: case insensitive filesystem */
public final class C21980XoY {
    public final String A00;

    public static byte[] A00(C21980XoY xoY, byte[] bArr, byte[] bArr2, int i) {
        AnonymousClass9DU r0 = AnonymousClass9DU.A05;
        String str = xoY.A00;
        Mac mac = (Mac) r0.A00.BHw(str);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, str));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                int length = bArr4.length;
                if (length + i3 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, length);
                    i3 += length;
                    i2++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw AnonymousClass7TG.A0q("size too large");
        }
    }

    public final byte[] A01() {
        String str = this.A00;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    return C21996Xq3.A06;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    return C21996Xq3.A07;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    return C21996Xq3.A08;
                }
                break;
        }
        throw AnonymousClass7TG.A0q("Could not determine HPKE KDF ID");
    }

    public final byte[] A02(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        SecretKeySpec secretKeySpec;
        byte[] A04 = C375459Dq.A04(C21996Xq3.A0A, bArr3, str.getBytes(C3740397x.A00), bArr2);
        AnonymousClass9DU r0 = AnonymousClass9DU.A05;
        String str2 = this.A00;
        Mac mac = (Mac) r0.A00.BHw(str2);
        if (bArr.length == 0) {
            secretKeySpec = new SecretKeySpec(new byte[mac.getMacLength()], str2);
        } else {
            secretKeySpec = new SecretKeySpec(bArr, str2);
        }
        mac.init(secretKeySpec);
        return mac.doFinal(A04);
    }

    public final byte[] A03(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String A002 = C66579MXk.A00(167);
        byte[] bArr4 = C21996Xq3.A0A;
        Charset charset = C3740397x.A00;
        byte[] A04 = C375459Dq.A04(bArr4, bArr3, "eae_prk".getBytes(charset), bArr);
        AnonymousClass9DU r0 = AnonymousClass9DU.A05;
        String str = this.A00;
        Mac mac = (Mac) r0.A00.BHw(str);
        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        return A00(this, mac.doFinal(A04), C375459Dq.A04(C21996Xq3.A01(2, i), bArr4, bArr3, A002.getBytes(charset), bArr2), i);
    }

    public C21980XoY(String str) {
        this.A00 = str;
    }
}
