package X;

import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class OV7 {
    public static final C69371NkB A01 = C69371NkB.AES128GCM;
    public static final C69371NkB A02 = C69371NkB.AES256GCM;
    public final int A00;

    public final byte[] A00(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.A00) {
            int length2 = bArr2.length;
            C69371NkB nkB = A02;
            if (length2 == nkB.A01) {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(nkB.A02 * 8, bArr2);
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                instance.init(2, secretKeySpec, gCMParameterSpec);
                instance.updateAAD(bArr3);
                return instance.doFinal(bArr4);
            }
            throw new InvalidAlgorithmParameterException(002.A0O("Nonce has invalid length: ", length2));
        }
        throw new InvalidAlgorithmParameterException(002.A0O("Key has invalid length: ", length));
    }

    public OV7(int i) {
        if (i == A01.A00 || i == A02.A00) {
            this.A00 = i;
            return;
        }
        throw new Exception(002.A0O("Unsupported key length: ", i));
    }
}
