package X;

import android.net.Uri;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3rU  reason: invalid class name and case insensitive filesystem */
public abstract class C253833rU {
    public static final SimpleImageUrl A01(File file) {
        Uri fromFile = Uri.fromFile(file);
        0qQ.A07(fromFile);
        return A00(fromFile, -1, -1);
    }

    public static final boolean A04(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (A02((ImageUrl) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(ImageUrl imageUrl) {
        String url;
        if (imageUrl == null || (url = imageUrl.getUrl()) == null || url.length() == 0) {
            return true;
        }
        return false;
    }

    public static final SimpleImageUrl A00(Uri uri, int i, int i2) {
        return new SimpleImageUrl(uri.toString(), i, i2);
    }

    public static final boolean A03(String str) {
        if (!0cp.A03(str).isOpaque() || 00p.A0k(str, "data:image/jpeg;base64,", false)) {
            return true;
        }
        return false;
    }
}
