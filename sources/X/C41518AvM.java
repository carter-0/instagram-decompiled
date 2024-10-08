package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AvM  reason: case insensitive filesystem */
public final class C41518AvM extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("ChaCha20-Poly1305");
            ThreadLocal threadLocal = C40211AWb.A02;
            boolean z = false;
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(C40211AWb.A05);
                byte[] bArr = C40211AWb.A04;
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                byte[] bArr2 = C40211AWb.A03;
                if (cipher.doFinal(bArr2).length == 0) {
                    cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                    if (cipher.doFinal(bArr2).length == 0) {
                        z = true;
                    }
                }
            } catch (GeneralSecurityException unused) {
            }
            if (!z) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException unused2) {
            return null;
        }
    }
}
