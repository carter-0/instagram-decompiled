package X;

import com.instagram.api.schemas.MetaGalleryAlbumType;
import java.io.IOException;
import java.util.ArrayList;

public abstract class CaU {
    public static AnonymousClass3I5 parseFromJson(16F r14) {
        String str;
        0qQ.A0B(r14, 0);
        try {
            if (r14.A11() != 16L.A0D) {
                r14.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            Integer num = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            MetaGalleryAlbumType metaGalleryAlbumType = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            while (r14.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r14);
                if ("body_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r14.A1P();
                    }
                } else if ("cta_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r14.A1P();
                    }
                } else if ("duration_ms".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r14);
                } else if ("header_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r14.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r14.A1P();
                    }
                } else if (AnonymousClass000.A00(1578).equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            BFW parseFromJson = CaT.parseFromJson(r14);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AnonymousClass000.A00(1587).equals(A17)) {
                    if (r14.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r14.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r14, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AnonymousClass000.A00(1597).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r14.A1P();
                    }
                    metaGalleryAlbumType = (MetaGalleryAlbumType) MetaGalleryAlbumType.A01.get(str);
                    if (metaGalleryAlbumType == null) {
                        metaGalleryAlbumType = MetaGalleryAlbumType.UNRECOGNIZED;
                    }
                } else if ("title_text".equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r14.A1P();
                    }
                } else if (AnonymousClass000.A00(1896).equals(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r14.A1P();
                    }
                } else if (C41845B3m.A1W(A17)) {
                    if (r14.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r14.A1P();
                    }
                }
                r14.A0z();
            }
            return new AnonymousClass3I5(metaGalleryAlbumType, num, str2, str3, str4, str5, str6, str7, str8, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
