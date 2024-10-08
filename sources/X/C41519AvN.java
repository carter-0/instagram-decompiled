package X;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.AvN  reason: case insensitive filesystem */
public final class C41519AvN extends ThreadLocal {
    public final /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) AnonymousClass9DU.A01.A00.BHw("AES/GCM-SIV/NoPadding");
            boolean z = false;
            try {
                byte[] bArr = C40212AWc.A05;
                cipher.init(2, new SecretKeySpec(C40212AWc.A04, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
                cipher.updateAAD(C40212AWc.A03);
                byte[] bArr2 = C40212AWc.A07;
                z = MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), C40212AWc.A06);
            } catch (GeneralSecurityException unused) {
            }
            if (!z) {
                return null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
