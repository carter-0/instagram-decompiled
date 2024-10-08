package X;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.6QE  reason: invalid class name */
public final class AnonymousClass6QE {
    public static final AnonymousClass6QE A02 = new AnonymousClass6QE(((AnonymousClass6QH) 09i.A0A.A05(AnonymousClass6QG.A00).A01(AnonymousClass6QH.class, AnonymousClass6QI.A00)).A00);
    public final SecureRandom A00 = new SecureRandom();
    public final SecretKey A01;

    static {
        SecretKey secretKey = AnonymousClass6QF.A00;
    }

    public static final String A00(C13528Tc0 tc0, AnonymousClass6QE r12) {
        int i;
        SecretKey secretKey = AnonymousClass6QF.A00;
        if (!0qQ.A0K(tc0.Bph(), "file")) {
            return null;
        }
        try {
            byte[] bArr = new byte[12];
            r12.A00.nextBytes(bArr);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher instance = Cipher.getInstance(AnonymousClass000.A00(858));
            instance.init(1, r12.A01, ivParameterSpec);
            String obj = tc0.toString();
            Charset charset = AnonymousClass15Q.A05;
            byte[] bytes = obj.getBytes(charset);
            0qQ.A07(bytes);
            byte[] doFinal = instance.doFinal(bytes);
            byte[] bArr2 = new byte[2];
            0qQ.A0B(doFinal, 0);
            Object[] objArr = {bArr, doFinal};
            int i2 = 0;
            char c = 0;
            while (true) {
                Object obj2 = objArr[c];
                if (obj2 != null) {
                    byte[] bArr3 = (byte[]) obj2;
                    0qQ.A0B(bArr3, 0);
                    i = bArr3.length;
                } else {
                    i = 1;
                }
                i2 += i;
                if (c == 1) {
                    break;
                }
                c = 1;
            }
            byte[] bArr4 = new byte[i2];
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                Object obj3 = objArr[i3];
                if (obj3 != null) {
                    if (i4 < i3) {
                        int i6 = i3 - i4;
                        System.arraycopy(bArr2, i4, bArr4, i5, i6);
                        i5 += i6;
                    }
                    byte[] bArr5 = (byte[]) obj3;
                    0qQ.A0B(bArr5, 0);
                    int length = bArr5.length;
                    System.arraycopy(obj3, 0, bArr4, i5, length);
                    i5 += length;
                    i4 = i3 + 1;
                }
                if (i3 == 1) {
                    break;
                }
                i3 = 1;
            }
            if (i4 < 2) {
                System.arraycopy(bArr2, i4, bArr4, i5, 2 - i4);
            }
            byte[] encode = Base64.encode(bArr4, 11);
            0qQ.A07(encode);
            return 002.A0R("bkfileurl:", 00l.A0B(new String(encode, charset)).toString());
        } catch (Exception e) {
            throw new RuntimeException(002.A0R("Failed to encrypt file path URL: ", e.getMessage()));
        }
    }

    public AnonymousClass6QE(SecretKey secretKey) {
        this.A01 = secretKey;
    }
}
