package X;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.SAj  reason: case insensitive filesystem */
public abstract class C11108SAj {
    public static final byte[] A01(InputStream inputStream) {
        0qQ.A0B(inputStream, 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        A00(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        0qQ.A07(byteArray);
        return byteArray;
    }

    public static final void A00(InputStream inputStream, OutputStream outputStream) {
        0qQ.A0B(inputStream, 0);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }
}
