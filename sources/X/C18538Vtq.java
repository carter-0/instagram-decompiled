package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Vtq  reason: case insensitive filesystem */
public final class C18538Vtq {
    public static final C18538Vtq A00 = new Object();

    public final void A00(AnonymousClass2i4 r6, C17786Vfx vfx) {
        Map map = r6.A09;
        if (map != null) {
            vfx.A00("muxPrefetched", Pxf.A0j("started_as_prefetch", map));
            vfx.A00("muxEncodedCount", Pxf.A0j("multiplex_enc_cnt", map));
            vfx.A00("muxBitmapCount", Pxf.A0j("multiplex_bmp_cnt", map));
            String A0j = Pxf.A0j("last_scan_num", map);
            if (!"0".equals(A0j)) {
                vfx.A00("lastScanNum", A0j);
            }
            vfx.A00("mp_resolution_code", Pxf.A0j("mp_resolution_code", map));
            Object obj = map.get("mp_media_metadata");
            if (obj instanceof Map) {
                Iterator A0u = AnonymousClass7TF.A0u((Map) obj);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    vfx.A00(AnonymousClass7TG.A0m(A1J.getKey(), "mp_", new StringBuilder()), String.valueOf(A1J.getValue()));
                }
            }
        }
    }
}
