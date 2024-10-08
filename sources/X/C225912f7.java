package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.common.io.Closeables;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.2f7  reason: invalid class name and case insensitive filesystem */
public final class C225912f7 extends 0ng {
    public final C225882f4 A00;
    public final String A01;
    public final /* synthetic */ 1NH A02;

    public final void run() {
        C227602jb r3;
        C227602jb r4 = null;
        try {
            1NH r7 = this.A02;
            C227082ic AX8 = 1NH.A00(r7).AX8(this.A01);
            if (AX8.A00 != null) {
                r3 = (C227602jb) AX8.A00();
                try {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = r3.A00.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read, Charset.forName(ReactWebViewManager.HTML_ENCODING)));
                    }
                    this.A00.onResult(r7.A00.E1p(sb.toString()));
                    r4 = r3;
                } catch (IOException e) {
                    e = e;
                    0wb.A03("JSONDiskSerializer_Cannot_Read_InputStream", "input stream cannot be read from IgDiskCache");
                    this.A00.DCn(e);
                    Closeables.A01(r3);
                } catch (NullPointerException e2) {
                    e = e2;
                    try {
                        0wb.A03("JSONDiskSerializer_Cannot_Parse", "input stream returned null");
                        this.A00.DCn(e);
                        Closeables.A01(r3);
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            } else {
                this.A00.onResult((Object) null);
            }
            Closeables.A01(r4);
        } catch (IOException e3) {
            e = e3;
            r3 = null;
            0wb.A03("JSONDiskSerializer_Cannot_Read_InputStream", "input stream cannot be read from IgDiskCache");
            this.A00.DCn(e);
            Closeables.A01(r3);
        } catch (NullPointerException e4) {
            e = e4;
            r3 = null;
            0wb.A03("JSONDiskSerializer_Cannot_Parse", "input stream returned null");
            this.A00.DCn(e);
            Closeables.A01(r3);
        } catch (Throwable th2) {
            th = th2;
            r3 = null;
            Closeables.A01(r3);
            throw th;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C225912f7(C225882f4 r2, 1NH r3, String str) {
        super(-14);
        this.A02 = r3;
        this.A01 = str;
        this.A00 = r2;
    }
}
