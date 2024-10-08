package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.util.jpeg.JpegBridge;
import com.instagram.util.jpeg.NativeImage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8mX  reason: invalid class name and case insensitive filesystem */
public final class C365108mX {
    public Map A00 = new HashMap();

    public final synchronized NativeImage A00(Rect rect, UserSession userSession, C364968mJ r8, String str) {
        NativeImage nativeImage;
        Map map = this.A00;
        C365118mY r0 = (C365118mY) map.get(str);
        if (r0 != null) {
            nativeImage = r0.A00;
        } else {
            NativeImage A002 = C365128mZ.A00(rect, r8, str);
            if (A002 == null && 182.A06(0Tu.A05, userSession, 36328959398395591L)) {
                int i = 0;
                while (true) {
                    A002 = C365128mZ.A00(rect, r8, str);
                    if (A002 != null || (i = i + 1) >= 3) {
                        break;
                    }
                }
            }
            A002.getClass();
            C365118mY r02 = new C365118mY(A002, this);
            C365118mY r1 = (C365118mY) map.get(str);
            if (r1 != null) {
                JpegBridge.releaseNativeBuffer(r02.A00.bufferId);
                nativeImage = r1.A00;
            } else {
                map.put(str, r02);
                nativeImage = r02.A00;
            }
        }
        return nativeImage;
    }

    public final synchronized void A01(String str) {
        Map map = this.A00;
        C365118mY r1 = (C365118mY) map.get(str);
        if (r1 != null && r1.A01.isEmpty()) {
            map.remove(str);
            JpegBridge.releaseNativeBuffer(r1.A00.bufferId);
        }
    }
}
