package X;

import android.content.Context;
import com.instagram.feed.media.CreativeConfigIntf;

/* renamed from: X.6Xc  reason: invalid class name and case insensitive filesystem */
public abstract class C309146Xc {
    public static final boolean A00(Context context, CreativeConfigIntf creativeConfigIntf) {
        boolean z = false;
        if (creativeConfigIntf != null) {
            z = true;
            if (!C284745Nt.A0B(creativeConfigIntf, C306106Ku.DUAL) || !C3495180r.A01(context)) {
                return C284745Nt.A0B(creativeConfigIntf, C306106Ku.LAYOUT, C306106Ku.BOOMERANG, C306106Ku.SUPERZOOM_V3, C306106Ku.SUPERZOOM, C306106Ku.FOCUS);
            }
        }
        return z;
    }
}
