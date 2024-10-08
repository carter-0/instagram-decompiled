package X;

/* renamed from: X.RdM  reason: case insensitive filesystem */
public abstract class C9582RdM {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        if (r7.length() == 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(com.facebook.smartcapture.logging.IdCaptureLogger r6, java.lang.String r7, java.security.PublicKey r8) {
        /*
            java.lang.String r5 = "Error in encrypting results"
            r4 = 0
            r3 = 0
            r2 = 1
            if (r7 == 0) goto L_0x000e
            int r1 = r7.length()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            r0 = 0
            if (r1 != 0) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            if (r0 != 0) goto L_0x002d
            if (r8 == 0) goto L_0x002d
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            r1.init(r2, r8)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            byte[] r0 = X.C66582MXn.A1a(r7)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            byte[] r0 = r1.doFinal(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            java.lang.String r4 = android.util.Base64.encodeToString(r0, r3)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0029 }
            return r4
        L_0x0029:
            r0 = move-exception
            r6.logError(r5, r0)
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9582RdM.A00(com.facebook.smartcapture.logging.IdCaptureLogger, java.lang.String, java.security.PublicKey):java.lang.String");
    }
}
