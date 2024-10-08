package X;

import com.facebook.mediastreaming.opt.muxer.TempFileCreator;
import java.io.File;

public final class WIX implements TempFileCreator {
    public static final WIX A00 = new WIX();

    public final File createTempFile(String str, String str2, boolean z) {
        return new File(AnonymousClass457.A0B(AnonymousClass457.A0C((String) null, 0, false)));
    }
}
