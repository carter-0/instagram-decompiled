package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* renamed from: X.GGw  reason: case insensitive filesystem */
public abstract class C52154GGw {
    public static final ImageUrlBase A00(Context context, 1Xj r4) {
        List ByG;
        0qQ.A0B(r4, 0);
        ImageInfo BGO = r4.A0C.BGO();
        if (BGO != null && (ByG = BGO.ByG()) != null && AnonymousClass7TE.A1b(ByG)) {
            return O1D.A00((ExtendedImageUrl) ByG.get(0));
        }
        ExtendedImageUrl A1n = r4.A1n(context);
        if (A1n == null) {
            return r4.A1l();
        }
        return A1n;
    }
}
