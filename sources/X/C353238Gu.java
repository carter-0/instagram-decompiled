package X;

import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Gu  reason: invalid class name and case insensitive filesystem */
public final class C353238Gu {
    public static String A00;
    public static 0xa A01;
    public static final List A02 = new ArrayList();

    /* JADX INFO: finally extract failed */
    public static final 0xa A00() {
        if (A01 == null) {
            synchronized (C353238Gu.class) {
                if (A01 == null) {
                    if (Systrace.A0E(1)) {
                        0fS.A01("GalleryMetadataUtil.initSharedPreferences()", -638418311);
                    }
                    try {
                        A01 = 0xn.A01("GalleryThumbnailCachePreferences");
                        if (Systrace.A0E(1)) {
                            0fS.A00(-1839611795);
                        }
                    } catch (Throwable th) {
                        if (Systrace.A0E(1)) {
                            0fS.A00(-1041004367);
                        }
                        throw th;
                    }
                }
            }
        }
        return A01;
    }
}
