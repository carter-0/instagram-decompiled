package X;

import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.discovery.mediamap.model.MediaMapPinPreview;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VBf  reason: case insensitive filesystem */
public abstract class C16928VBf {
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, com.instagram.discovery.mediamap.model.MediaMapPin] */
    public static MediaMapPin parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("lat".equals(A17)) {
                    obj.A0A = Double.valueOf(r4.A0U());
                } else if ("lng".equals(A17)) {
                    obj.A0B = Double.valueOf(r4.A0U());
                } else if ("location".equals(A17)) {
                    obj.A09 = AnonymousClass41Q.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("media_id".equals(A17)) {
                        obj.A0D = AnonymousClass7TG.A0l(r4);
                    } else if ("thumbnail_url".equals(A17)) {
                        obj.A05 = 16h.A00(r4);
                    } else if ("page_info".equals(A17)) {
                        obj.A06 = C16925VBc.parseFromJson(r4);
                    } else if ("media_taken_at_seconds".equals(A17)) {
                        obj.A01 = r4.A0y();
                    } else if ("rank".equals(A17)) {
                        obj.A00 = r4.A1D();
                    } else if (AnonymousClass000.A00(740).equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r4.A1J() != 16L.A08) {
                                MediaMapPinPreview parseFromJson = C16927VBe.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0E = arrayList;
                    } else if ("formatted_media_count".equals(A17)) {
                        obj.A0C = AnonymousClass7TG.A0l(r4);
                    } else if ("thumbnail_override".equals(A17)) {
                        obj.A04 = 16h.A00(r4);
                    } else if ("story".equals(A17)) {
                        obj.A08 = AnonymousClass3HR.parseFromJson(r4);
                    } else if ("pin_type".equals(A17)) {
                        C16557Ux9 ux9 = (C16557Ux9) C16557Ux9.A01.get(r4.A1Q());
                        if (ux9 == null) {
                            ux9 = C16557Ux9.UNKNOWN;
                        }
                        obj.A07 = ux9;
                    } else if ("clip".equals(A17)) {
                        obj.A03 = C275974sH.parseFromJson(r4);
                    }
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
