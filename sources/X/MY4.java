package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.HashMap;

public enum MY4 {
    ROOT_PATH(0, 157877869, false),
    FILES_PATH(1, 1672668047, true),
    CACHE_PATH(2, 1377433890, true),
    EXTERNAL_PATH(3, 0, false),
    EXTERNAL_FILES_PATH(4, 0, false),
    EXTERNAL_CACHE_PATH(5, 0, false);
    
    public static final HashMap A03 = null;
    public static final File A04 = null;
    public final int A00;
    public final String A01;
    public final boolean A02;

    /* access modifiers changed from: public */
    static {
        A04 = AnonymousClass7TE.A0t("/");
        A03 = AnonymousClass7TE.A1E();
        for (MY4 my4 : values()) {
            A03.put(my4.A01, my4);
        }
    }

    public final File A00(Context context) {
        C69739NrO nrO = C69739NrO.$redex_init_class;
        switch (ordinal()) {
            case 0:
                return A04;
            case 1:
                return context.getFilesDir();
            case 2:
                return context.getCacheDir();
            case 3:
                return Environment.getExternalStorageDirectory();
            case 4:
                return context.getExternalFilesDir((String) null);
            case 5:
                return context.getExternalCacheDir();
            default:
                return null;
        }
    }

    /* access modifiers changed from: public */
    MY4(int i, int i2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = i2;
    }
}
