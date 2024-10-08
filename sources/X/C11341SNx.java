package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.SNx  reason: case insensitive filesystem */
public final class C11341SNx {
    public final C10156RnX A00;

    public final File A02(RGY rgy, InputStream inputStream, String str) {
        FileOutputStream A0t;
        File A0s = JTO.A0s(A00(this), A01(rgy, str, true));
        try {
            A0t = JTO.A0t(A0s);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    A0t.write(bArr, 0, read);
                } else {
                    A0t.flush();
                    A0t.close();
                    inputStream.close();
                    return A0s;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    public static File A00(C11341SNx sNx) {
        File A0s = JTO.A0s(sNx.A00.A00.getCacheDir(), "lottie_network_cache");
        if (A0s.isFile()) {
            A0s.delete();
        }
        Pxg.A1L(A0s);
        return A0s;
    }

    public static String A01(RGY rgy, String str, boolean z) {
        String str2;
        if (z) {
            str2 = 002.A0R(".temp", rgy.A00);
        } else {
            str2 = rgy.A00;
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder A1A = AnonymousClass7TE.A1A();
                for (byte valueOf : digest) {
                    A1A.append(String.format("%02x", new Object[]{Byte.valueOf(valueOf)}));
                }
                replaceAll = A1A.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return 002.A0g("lottie_cache_", replaceAll, str2);
    }

    public C11341SNx(C10156RnX rnX) {
        this.A00 = rnX;
    }
}
