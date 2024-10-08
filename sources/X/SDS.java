package X;

import android.content.Context;
import java.io.File;

public final class SDS {
    public final Context A00;

    public static final File A00(SDS sds, String str) {
        return AnonymousClass7TE.A0t(002.A0g(sds.A00.getApplicationInfo().nativeLibraryDir, File.separator, str));
    }

    public SDS(Context context) {
        this.A00 = context;
    }
}
