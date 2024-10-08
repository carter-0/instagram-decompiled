package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: X.Ree  reason: case insensitive filesystem */
public abstract class C9660Ree {
    public static Reader A00(16B r8, InputStream inputStream, byte[] bArr, int i, int i2) {
        boolean z;
        String str;
        16B r2 = r8;
        InputStream inputStream2 = inputStream;
        Integer num = r8.A00;
        int intValue = num.intValue();
        byte[] bArr2 = bArr;
        int i3 = i;
        int i4 = i2;
        switch (intValue) {
            case 3:
            case 4:
                if (3 - intValue != 0) {
                    z = false;
                } else {
                    z = true;
                }
                return new RD6(r2, inputStream2, bArr2, i4, i3, z);
            default:
                if (inputStream == null) {
                    inputStream2 = new ByteArrayInputStream(bArr, i2, i);
                } else if (i2 < i) {
                    inputStream2 = new C8852RCs(r8, inputStream, bArr, i2, i3);
                }
                switch (num.intValue()) {
                    case 1:
                        str = "UTF-16BE";
                        break;
                    case 2:
                        str = "UTF-16LE";
                        break;
                    case 3:
                        str = "UTF-32BE";
                        break;
                    case 4:
                        str = "UTF-32LE";
                        break;
                    default:
                        str = ReactWebViewManager.HTML_ENCODING;
                        break;
                }
                return new InputStreamReader(inputStream2, str);
        }
    }
}
