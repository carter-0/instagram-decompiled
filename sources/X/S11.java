package X;

import java.security.MessageDigest;

public final class S11 {
    public final 02U A00 = new C11608SdB(new 0l2(10), new C12003SkM(this, 2), C9912RjR.A00);
    public final C11037S6p A01 = new C11037S6p(1000);

    public final String A00(C13892TjF tjF) {
        String str;
        C11037S6p s6p = this.A01;
        synchronized (s6p) {
            str = (String) s6p.A00(tjF);
        }
        if (str == null) {
            02U r7 = this.A00;
            Object A7A = r7.A7A();
            C9217RTu.A00(A7A);
            C12004SkN skN = (C12004SkN) A7A;
            try {
                MessageDigest messageDigest = skN.A00;
                tjF.FK7(messageDigest);
                byte[] digest = messageDigest.digest();
                char[] cArr = C11424STg.A01;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b = digest[i] & 255;
                        int i2 = i * 2;
                        char[] cArr2 = C11424STg.A00;
                        cArr[i2] = cArr2[b >>> 4];
                        Pxe.A1a(cArr2, cArr, b, i2 + 1);
                    }
                    str = new String(cArr);
                }
                r7.ECR(skN);
            } catch (Throwable th) {
                r7.ECR(skN);
                throw th;
            }
        }
        synchronized (s6p) {
            s6p.A03(tjF, str);
        }
        return str;
    }
}
