package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import java.util.Map;

public final class LCk {
    public Map A00 = AnonymousClass7TE.A1E();
    public Map A01 = AnonymousClass7TE.A1E();

    public final void A00(AnonymousClass514 r3, SurfaceCropFilter surfaceCropFilter, String str) {
        Map map = this.A01;
        if (!map.containsKey(str) || !((Map) map.get(str)).containsKey(r3)) {
            if (!map.containsKey(str)) {
                map.put(str, AnonymousClass7TE.A1E());
            }
            Map map2 = (Map) map.get(str);
            if (map2 != null) {
                map2.put(r3, Float.valueOf(surfaceCropFilter.A00.A06.A06));
            }
        }
    }
}
