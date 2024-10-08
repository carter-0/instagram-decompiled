package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class Pz4 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ String A02;

    public Pz4(Bitmap bitmap, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, String str) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = bitmap;
        this.A02 = str;
    }

    public final void run() {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = this.A00;
        String str = this.A02;
        if (!TextUtils.isEmpty(str)) {
            try {
                fileOutputStream = new FileOutputStream(new File(str));
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                0fO.A01(compressFormat, bitmap, 100);
                if (bitmap.compress(compressFormat, 100, fileOutputStream)) {
                    fileOutputStream.close();
                    return;
                } else {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                    throw new RuntimeException(002.A0R("Unable to compress bitmap for saving ", str));
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e);
                throw new RuntimeException(002.A0R("Unable to write bitmap to file ", str), e);
            } catch (Throwable th) {
                C9153RRe.A00(th, th);
            }
        } else {
            throw new IllegalArgumentException("path is empty");
        }
        throw th;
    }
}
