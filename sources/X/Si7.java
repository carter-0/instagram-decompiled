package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class Si7 implements C13915TlH {
    public final /* bridge */ /* synthetic */ boolean ARr(C11856Shi shi, File file, Object obj) {
        try {
            SL7.A01(file, ((Q6Z) ((C13796ThF) obj).get()).A09.A00.A0E.A09.asReadOnlyBuffer());
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    public final Integer B1N(C11856Shi shi) {
        return AnonymousClass05K.A00;
    }
}
