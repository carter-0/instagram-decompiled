package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Arrays;

public final class SGc {
    public final String A00;

    public static final SGc A00(File file) {
        String str;
        Throwable cast;
        try {
            File A0s = JTO.A0s(file, "mobilelab_test_info");
            if (!A0s.exists() || !A0s.canRead()) {
                0KC.A0P("MobileLabTestInfo", "File %s does not exist or can not be read", new Object[]{A0s.getPath()});
                return new SGc((String) null);
            }
            try {
                Charset charset = AnonymousClass2RN.A05;
                charset.getClass();
                C227882kF r5 = C227852k8.A00;
                ArrayDeque arrayDeque = new ArrayDeque(4);
                try {
                    FileInputStream fileInputStream = new FileInputStream(A0s);
                    arrayDeque.addFirst(fileInputStream);
                    long size = fileInputStream.getChannel().size();
                    17k.A05(size, "expectedSize (%s) must be non-negative", Pxf.A1R((size > 0 ? 1 : (size == 0 ? 0 : -1))));
                    if (size <= 2147483639) {
                        int i = (int) size;
                        byte[] bArr = new byte[i];
                        int i2 = i;
                        while (true) {
                            if (i2 > 0) {
                                int i3 = i - i2;
                                int read = fileInputStream.read(bArr, i3, i2);
                                if (read == -1) {
                                    bArr = Arrays.copyOf(bArr, i3);
                                    break;
                                }
                                i2 -= read;
                            } else {
                                int read2 = fileInputStream.read();
                                if (read2 != -1) {
                                    ArrayDeque arrayDeque2 = new ArrayDeque(22);
                                    arrayDeque2.add(bArr);
                                    arrayDeque2.add(new byte[]{(byte) read2});
                                    bArr = 1W7.A01(fileInputStream, arrayDeque2, i + 1);
                                }
                            }
                        }
                        C227852k8.A00(r5, (Throwable) null, arrayDeque);
                        str = new String(bArr, charset);
                        return new SGc(str);
                    }
                    throw new OutOfMemoryError(002.A0A(size, " bytes is too large to fit in a byte array"));
                } catch (Throwable th) {
                    C227852k8.A00(r5, th, arrayDeque);
                    throw th;
                }
            } catch (IOException e) {
                0KC.A0G("MobileLabTestInfo", "Failed to read mobile lab test info.", e);
                str = "{}";
            }
        } catch (SecurityException e2) {
            0KC.A0G("MobileLabTestInfo", "Failed to check file existance.", e2);
            return new SGc((String) null);
        }
    }

    public final String A01() {
        return this.A00;
    }

    public SGc(String str) {
        this.A00 = str;
    }
}
