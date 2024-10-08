package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.common.dextricks.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.9vn  reason: invalid class name and case insensitive filesystem */
public abstract class C393039vn {
    public static File A00(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        File cacheDir = context.getCacheDir();
        AssetManager assets = context.getAssets();
        File file = new File(cacheDir, str2);
        try {
            InputStream open = assets.open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[Constants.LOAD_RESULT_NEED_REOPTIMIZATION];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.close();
                        open.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                open.close();
                throw th;
            }
        } catch (IOException e) {
            throw new IOException(002.A0R("Could not open ", str), e);
        }
    }
}
