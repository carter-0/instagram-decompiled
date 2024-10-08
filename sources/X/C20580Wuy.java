package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.maps.ui.IgStaticMapView;
import java.util.HashMap;

/* renamed from: X.Wuy  reason: case insensitive filesystem */
public final class C20580Wuy extends HashMap {
    public final int A00;
    public final Object A01;

    public C20580Wuy(IgStaticMapView igStaticMapView) {
        this.A00 = 2;
        this.A01 = igStaticMapView;
        put("map_url", igStaticMapView.A05.toString());
        put("surface", igStaticMapView.A0I.A08);
    }

    public C20580Wuy(C14723U4m u4m, String str, int i, long j) {
        long j2;
        this.A00 = i;
        this.A01 = u4m;
        double d = C14723U4m.A0p;
        if (i != 0) {
            j2 = u4m.A0L;
        } else {
            j2 = u4m.A0I;
        }
        put(TraceFieldType.Duration, Long.valueOf(j - j2));
        put("surface", str == null ? "unknown" : str);
    }

    public C20580Wuy(UHJ uhj, String str) {
        this.A00 = 3;
        this.A01 = uhj;
        put("surface", str);
        Thread thread = UHJ.A06;
        put(Pxd.A00(77), Long.valueOf(uhj.A01.get()));
        put("cache_hit_count", Long.valueOf(uhj.A04.get()));
        put("cache_miss_count", Long.valueOf(uhj.A05.get()));
    }
}
