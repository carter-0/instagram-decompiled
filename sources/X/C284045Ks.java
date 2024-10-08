package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.5Ks  reason: invalid class name and case insensitive filesystem */
public abstract class C284045Ks {
    public static final C284035Kr A00;
    public static final ByteBuffer A01;
    public static final Charset A02 = Charset.forName("ISO-8859-1");
    public static final Charset A03 = Charset.forName(ReactWebViewManager.HTML_ENCODING);
    public static final byte[] A04;

    static {
        byte[] bArr = new byte[0];
        A04 = bArr;
        A01 = ByteBuffer.wrap(bArr);
        AnonymousClass5Kt r0 = new AnonymousClass5Kt(bArr);
        try {
            r0.A07(0);
            A00 = r0;
        } catch (C289845eJ e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static C283985Kk A00(Object obj, Object obj2) {
        C283985Kk r2 = (C283985Kk) ((C284005Km) obj);
        PyY pyY = (PyY) r2.A03(AnonymousClass05K.A0Y);
        pyY.A02(r2);
        C284005Km r3 = (C284005Km) obj2;
        if (pyY.Avr().getClass().isInstance(r3)) {
            pyY.A02((C283985Kk) ((C283995Kl) r3));
            return pyY.A00();
        }
        throw new IllegalArgumentException(Pxd.A00(803));
    }
}
