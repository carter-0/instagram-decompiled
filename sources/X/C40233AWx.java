package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: X.AWx  reason: case insensitive filesystem */
public final class C40233AWx implements AnonymousClass9DT {
    public static final C3739197l A04 = C3739197l.A01;
    public final String A00;
    public final Key A01;
    public final int A02;
    public final ThreadLocal A03;

    public final byte[] AIg(byte[] bArr, int i) {
        if (i <= this.A02) {
            ThreadLocal threadLocal = this.A03;
            ((Mac) threadLocal.get()).update(bArr);
            return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r3.A02 = r0;
        r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        throw new java.security.NoSuchAlgorithmException(X.002.A0R("unknown Hmac algorithm: ", r4));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C40233AWx(java.lang.String r4, java.security.Key r5) {
        /*
            r3 = this;
            r3.<init>()
            X.AvR r1 = new X.AvR
            r1.<init>(r3)
            r3.A03 = r1
            X.97l r0 = A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0076
            r3.A00 = r4
            r3.A01 = r5
            byte[] r0 = r5.getEncoded()
            int r2 = r0.length
            r0 = 16
            if (r2 < r0) goto L_0x006e
            int r0 = r4.hashCode()
            switch(r0) {
                case -1823053428: goto L_0x005e;
                case 392315023: goto L_0x0053;
                case 392315118: goto L_0x0048;
                case 392316170: goto L_0x003d;
                case 392317873: goto L_0x0032;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.String r0 = "unknown Hmac algorithm: "
            java.lang.String r0 = X.002.A0R(r0, r4)
            java.security.NoSuchAlgorithmException r1 = new java.security.NoSuchAlgorithmException
            r1.<init>(r0)
            throw r1
        L_0x0032:
            java.lang.String r0 = "HMACSHA512"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 64
            goto L_0x0068
        L_0x003d:
            java.lang.String r0 = "HMACSHA384"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 48
            goto L_0x0068
        L_0x0048:
            java.lang.String r0 = "HMACSHA256"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 32
            goto L_0x0068
        L_0x0053:
            java.lang.String r0 = "HMACSHA224"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 28
            goto L_0x0068
        L_0x005e:
            java.lang.String r0 = "HMACSHA1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0026
            r0 = 20
        L_0x0068:
            r3.A02 = r0
            r1.get()
            return
        L_0x006e:
            java.lang.String r0 = "key size too small, need at least 16 bytes"
            java.security.InvalidAlgorithmParameterException r1 = new java.security.InvalidAlgorithmParameterException
            r1.<init>(r0)
            throw r1
        L_0x0076:
            java.lang.String r0 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            java.security.GeneralSecurityException r1 = X.AnonymousClass7TG.A0q(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40233AWx.<init>(java.lang.String, java.security.Key):void");
    }
}
