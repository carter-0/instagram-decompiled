package X;

import android.net.Uri;
import java.io.File;

public final class WHA implements AnonymousClass2h0 {
    public static final WHA A00 = new WHA();

    public final /* bridge */ /* synthetic */ Object AJs(File file) {
        if (file == null) {
            return null;
        }
        return Uri.fromFile(file).getPath();
    }
}
