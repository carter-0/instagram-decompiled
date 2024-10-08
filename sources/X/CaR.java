package X;

import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract /* synthetic */ class CaR {
    public static Map A00(AnonymousClass3I6 r5) {
        ArrayList arrayList;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r5.Ago() != null) {
            A1H.put("body_text", r5.Ago());
        }
        if (r5.getCtaText() != null) {
            A1H.put("cta_text", r5.getCtaText());
        }
        if (r5.AzO() != null) {
            A1H.put("duration_ms", r5.AzO());
        }
        if (r5.BCi() != null) {
            A1H.put("header_text", r5.BCi());
        }
        if (r5.getId() != null) {
            C41845B3m.A0x(r5.getId(), A1H);
        }
        String str = null;
        if (r5.BQM() != null) {
            List<C46252DSh> BQM = r5.BQM();
            if (BQM != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (C46252DSh dSh : BQM) {
                    if (dSh != null) {
                        arrayList.add(dSh.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            A1H.put(AnonymousClass000.A00(1578), arrayList);
        }
        if (r5.BR3() != null) {
            A1H.put(AnonymousClass000.A00(1587), r5.BR3());
        }
        if (r5.BSY() != null) {
            MetaGalleryAlbumType BSY = r5.BSY();
            if (BSY != null) {
                str = BSY.A00;
            }
            A1H.put(AnonymousClass000.A00(1597), str);
        }
        if (r5.C7x() != null) {
            A1H.put("title_text", r5.C7x());
        }
        if (r5.C8H() != null) {
            A1H.put(AnonymousClass000.A00(1896), r5.C8H());
        }
        if (r5.C9L() != null) {
            A1H.put("tracking_token", r5.C9L());
        }
        return 0Yt.A0B(A1H);
    }
}
