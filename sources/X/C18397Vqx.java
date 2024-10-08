package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: X.Vqx  reason: case insensitive filesystem */
public abstract class C18397Vqx {
    public static final Charset A00 = Charset.forName("US-ASCII");
    public static final Charset A01 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static void A00(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    A00(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException(AnonymousClass7TG.A0m(file2, "failed to delete file: ", new StringBuilder()));
                }
            }
            return;
        }
        throw new IOException(AnonymousClass7TG.A0m(file, "not a readable directory: ", new StringBuilder()));
    }
}
