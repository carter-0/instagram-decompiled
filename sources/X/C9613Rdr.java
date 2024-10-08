package X;

import com.facebook.common.dextricks.Constants;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* renamed from: X.Rdr  reason: case insensitive filesystem */
public abstract class C9613Rdr {
    public static void A00(FileOutputStream fileOutputStream, InputStream inputStream, String str) {
        if (inputStream != null) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(bArr, 0, read);
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                String A01 = 0JX.A01(instance.digest());
                if (!str.equals(A01)) {
                    throw new IOException(String.format(Locale.US, "App module actual hash %s does not match expected hash %s", new Object[]{A01, str}));
                }
            } catch (NoSuchAlgorithmException e) {
                throw C41845B3m.A0j(e);
            }
        } else {
            throw new IOException("Stream data is null");
        }
    }
}
