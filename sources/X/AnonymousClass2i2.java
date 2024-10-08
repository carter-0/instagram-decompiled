package X;

import android.graphics.PointF;
import android.graphics.Rect;
import java.util.Map;

/* renamed from: X.2i2  reason: invalid class name */
public abstract class AnonymousClass2i2 {
    public static final Map A00 = 0se.A0M(new 0eP("component_tag", "vito2"));
    public static final Map A01 = 0Yt.A06(new 0eP[]{new 0eP("origin", "memory_bitmap"), new 0eP("origin_sub", "shortcut")});

    public static final AnonymousClass2i4 A00(C249903kY r9, 1TY r10, C226752hn r11) {
        Map map;
        AnonymousClass1U5 r0;
        PointF pointF;
        Map map2;
        C240503Ld r02;
        Map map3 = A00;
        Map map4 = A01;
        if (r10 != null) {
            map = r10.A04;
        } else {
            map = null;
        }
        Rect rect = r11.A01;
        C226732hl r03 = r11.A02;
        if (r03 != null) {
            r0 = r03.A01.A0E;
        } else {
            r0 = null;
        }
        String valueOf = String.valueOf(r0);
        C226732hl r04 = r11.A02;
        if (r04 != null) {
            pointF = r04.A01.A07;
        } else {
            pointF = null;
        }
        if (r9 == null || (r02 = (C240503Ld) r9.A05()) == null) {
            map2 = null;
        } else {
            map2 = r02.B3S();
        }
        return C226882i3.A00(pointF, rect, r11.A05, valueOf, map3, map4, map, (Map) null, map2);
    }
}
