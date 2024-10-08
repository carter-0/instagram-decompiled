package X;

import android.util.LruCache;
import java.util.Map;

public abstract class WHW implements AnonymousClass6QN {
    public final LruCache A00;
    public final C16818V6z A01;
    public final C20990X8g A02;
    public final VQB A03;

    public final String A02(AnonymousClass2i4 r3) {
        Object obj = null;
        if (r3 == null) {
            return null;
        }
        Map map = r3.A09;
        if (!(map == null && (map = r3.A0A) == null && (map = r3.A0B) == null)) {
            obj = map.get("custom_uri_key");
        }
        return C13988Tno.A0e(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a7, code lost:
        if (X.00p.A0k(r2, "/v/t", false) == true) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0110, code lost:
        if (r3 != null) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass2i4 r6, X.C17786Vfx r7, java.lang.String r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x013f
            X.Vtq r2 = X.C18538Vtq.A00
            int r1 = r6.A01
            java.lang.String r0 = "viewWidth"
            com.facebook.quicklog.MarkerEditor r4 = r7.A00
            r4.annotate(r0, r1)
            int r1 = r6.A00
            java.lang.String r0 = "viewHeight"
            r4.annotate(r0, r1)
            java.lang.Object r0 = r6.A06
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "scaleType"
            r7.A00(r0, r1)
            java.lang.Float r0 = r6.A03
            if (r0 == 0) goto L_0x002d
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.String r3 = "fpX"
            r4.annotate(r3, r0)
        L_0x002d:
            java.lang.Float r0 = r6.A04
            if (r0 == 0) goto L_0x003b
            float r0 = r0.floatValue()
            double r0 = (double) r0
            java.lang.String r3 = "fpY"
            r4.annotate(r3, r0)
        L_0x003b:
            java.util.Map r1 = r6.A09
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = "origin_sub"
            java.lang.String r3 = X.Pxf.A0j(r0, r1)
        L_0x0045:
            java.util.Map r1 = r6.A09
            if (r1 == 0) goto L_0x0057
            java.lang.String r0 = "origin"
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L_0x0059
        L_0x0057:
            java.lang.String r1 = "memory_bitmap"
        L_0x0059:
            java.lang.String r0 = "origin"
            r7.A00(r0, r1)
            java.lang.String r0 = "originSub"
            r7.A00(r0, r3)
            r2.A00(r6, r7)
            if (r8 == 0) goto L_0x00ae
            android.util.LruCache r0 = r5.A00
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.Object r0 = r0.get(r8)
            if (r0 == 0) goto L_0x0075
            r1 = r0
        L_0x0075:
            long r0 = X.AnonymousClass7TE.A0R(r1)
            java.lang.String r2 = "previousSuccessfulLoadCount"
            r4.annotate(r2, r0)
            r1 = 0
            java.util.Map r2 = r6.A09
            if (r2 != 0) goto L_0x008b
            java.util.Map r2 = r6.A0A
            if (r2 != 0) goto L_0x008b
            java.util.Map r2 = r6.A0B
            if (r2 == 0) goto L_0x0091
        L_0x008b:
            java.lang.String r0 = "uri_source"
            java.lang.Object r1 = r2.get(r0)
        L_0x0091:
            boolean r0 = r1 instanceof android.net.Uri
            if (r0 == 0) goto L_0x0138
            android.net.Uri r1 = (android.net.Uri) r1
            r3 = 1
            if (r1 == 0) goto L_0x0138
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x0138
            java.lang.String r1 = "/v/t"
            r0 = 0
            boolean r0 = X.00p.A0k(r2, r1, r0)
            if (r0 != r3) goto L_0x0138
        L_0x00a9:
            java.lang.String r0 = "isInternalCdnUrl"
            r4.annotate(r0, r3)
        L_0x00ae:
            java.util.Map r2 = r6.A0A
            if (r2 == 0) goto L_0x00f5
            r0 = 1451(0x5ab, float:2.033E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.Pxf.A0j(r0, r2)
            java.lang.String r0 = "format"
            r7.A00(r0, r1)
            java.lang.String r0 = "bitmap_config"
            java.lang.String r1 = X.Pxf.A0j(r0, r2)
            java.lang.String r0 = "bitmapConfig"
            r7.A00(r0, r1)
            java.lang.String r0 = "encoded_size"
            java.lang.String r1 = X.Pxf.A0j(r0, r2)
            java.lang.String r0 = "encodedSize"
            r7.A00(r0, r1)
            r0 = 1307(0x51b, float:1.831E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.Pxf.A0j(r0, r2)
            java.lang.String r0 = "encodedWidth"
            r7.A00(r0, r1)
            r0 = 1306(0x51a, float:1.83E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.Pxf.A0j(r0, r2)
            java.lang.String r0 = "encodedHeight"
            r7.A00(r0, r1)
        L_0x00f5:
            java.lang.String r0 = r6.A07
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "modifiedUrl"
            r7.A00(r0, r1)
            java.util.Map r1 = r6.A09
            if (r1 == 0) goto L_0x0112
            java.lang.String r0 = "image_source_extras"
            java.lang.Object r3 = r1.get(r0)
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x0112
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0114
        L_0x0112:
            java.util.Map r3 = r6.A0B
        L_0x0114:
            if (r3 == 0) goto L_0x013f
            java.util.Set r0 = X.C70393O4u.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x011c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            r0 = 2
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x011c
            java.lang.String r0 = r0.toString()
            r7.A00(r1, r0)
            goto L_0x011c
        L_0x0138:
            r3 = 0
            goto L_0x00a9
        L_0x013b:
            java.lang.String r3 = "shortcut"
            goto L_0x0045
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WHW.A03(X.2i4, X.Vfx, java.lang.String):void");
    }

    public WHW(LruCache lruCache, C19855Wga wga) {
        this.A00 = lruCache;
        this.A02 = wga;
        this.A03 = wga.BiT();
        this.A01 = ((C16404UuM) wga).A01;
    }
}
