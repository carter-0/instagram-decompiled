package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.97S  reason: invalid class name */
public abstract class AnonymousClass97S {
    public static final AnonymousClass97U A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName("US-ASCII");
    public static final Charset A04 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final byte[] A05;

    static {
        byte[] bArr = new byte[0];
        A05 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        AnonymousClass97T r0 = new AnonymousClass97T(bArr, 0, 0);
        try {
            r0.A0G(0);
            A00 = r0;
        } catch (AnonymousClass9GO e) {
            throw new IllegalArgumentException(e);
        }
    }
}
