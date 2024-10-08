package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.4Cv  reason: invalid class name */
public abstract class AnonymousClass4Cv {
    public static String A00(ByteBuffer byteBuffer) {
        String str;
        if (byteBuffer == null) {
            str = "Invalid ByteBuffer passed. Forcing C++ manager creation.";
        } else {
            Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
            int limit = byteBuffer.limit() - byteBuffer.position();
            byte[] bArr = new byte[limit];
            byteBuffer.get(bArr);
            if (limit == 32 || limit == 65) {
                int i = 0;
                do {
                    byte b = bArr[i];
                    if (b >= 97) {
                        if (b > 102) {
                        }
                    } else if (b >= 48) {
                        if (b > 57 && b != 58) {
                        }
                    }
                    i++;
                } while (i < limit);
                return new String(bArr, 0, limit, forName);
            }
            str = "Invalid schema hash in flatbuffer. Forcing C++ manager creation.";
        }
        0KC.A0D("FBConfigUtils", str);
        return null;
    }
}
