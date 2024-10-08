package X;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import java.util.HashMap;

public abstract class OS3 {
    public static final C70858OOn A00 = new Object();

    public static HashMap A00(Context context) {
        HashMap A1E = AnonymousClass7TE.A1E();
        try {
            File filesDir = context.getFilesDir();
            if (filesDir != null) {
                int blockSize = new StatFs(filesDir.getPath()).getBlockSize();
                A1E.put("internal_total_space_in_mb", String.valueOf(filesDir.getTotalSpace() / 1048576));
                A1E.put("internal_usable_space_in_mb", String.valueOf(filesDir.getUsableSpace() / 1048576));
                C70858OOn oOn = A00;
                A1E.put("internal_used_in_mb", String.valueOf(C70858OOn.A00(oOn, filesDir, blockSize) / 1048576));
                A1E.put("internal_cache_used_in_mb", String.valueOf(C70858OOn.A00(oOn, context.getCacheDir(), blockSize) / 1048576));
                A1E.put("app_used_in_mb", String.valueOf(C70858OOn.A00(oOn, AnonymousClass7TE.A0t(context.getApplicationInfo().publicSourceDir), blockSize) / 1048576));
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                int blockSize2 = new StatFs(externalCacheDir.getPath()).getBlockSize();
                A1E.put("external_total_space_in_mb", String.valueOf(externalCacheDir.getTotalSpace() / 1048576));
                A1E.put("external_usable_space_in_mb", String.valueOf(externalCacheDir.getUsableSpace() / 1048576));
                A1E.put("external_file_used_in_mb", String.valueOf(C70858OOn.A00(A00, externalCacheDir, blockSize2) / 1048576));
                return A1E;
            }
        } catch (IllegalArgumentException e) {
            String simpleName = OS3.class.getSimpleName();
            0qQ.A07(simpleName);
            0wb.A06(simpleName, "Unable to get storage info", e);
        }
        return A1E;
    }
}
