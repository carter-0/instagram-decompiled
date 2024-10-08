package X;

import com.facebook.maps.ttrc.common.MapboxTTRC;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.VgV  reason: case insensitive filesystem */
public final class C17816VgV {
    public int A00 = 0;
    public int A01 = 0;
    public Map A02;

    public final int A00(String str) {
        Map map = this.A02;
        if (map.get(str) != null) {
            return Pxg.A06(str, map);
        }
        0KC.A0C("MapboxTTRC", "Trying to get request number for a URL that's never been seen");
        return 999;
    }

    public C17816VgV() {
        HashMap hashMap = new HashMap();
        this.A02 = hashMap;
        hashMap.clear();
        MapboxTTRC.sStyleImageMissingCount = 1;
    }
}
