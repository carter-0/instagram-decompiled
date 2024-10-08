package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.SmartReelType;
import com.instagram.model.reels.ReelType;
import java.io.IOException;

public abstract class CUO {
    public static C61092Jx3 parseFromJson(16F r16) {
        String str;
        String str2;
        String str3;
        16F r3 = r16;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            BDn bDn = null;
            ACRType aCRType = null;
            String str4 = null;
            String str5 = null;
            1Xj r10 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            SmartReelType smartReelType = null;
            ReelType reelType = null;
            BI4 bi4 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("acr_client_stitch_metadata".equals(A17)) {
                    bDn = CUJ.parseFromJson(r3);
                } else if (AnonymousClass000.A00(493).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                    aCRType = C378199Ow.A00(str3);
                } else if ("acr_metadata_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if ("audio_cluster_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if ("preview_media".equals(A17)) {
                    r10 = 1Xj.A00(r3);
                } else if ("preview_title_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if ("reels_collection_compound_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(756).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                } else if ("reels_collection_theme".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                    smartReelType = (SmartReelType) SmartReelType.A01.get(str2);
                    if (smartReelType == null) {
                        smartReelType = SmartReelType.UNRECOGNIZED;
                    }
                } else if (AnonymousClass000.A00(757).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    reelType = AnonymousClass3HS.A00(str);
                } else if ("track_schema".equals(A17)) {
                    bi4 = C44548Cgi.parseFromJson(r3);
                }
                r3.A0z();
            }
            if (str5 == null && (r3 instanceof 0c9)) {
                AnonymousClass7TF.A1L("audio_cluster_id", r3, "AcrMetadata");
            } else if (r10 != null || !(r3 instanceof 0c9)) {
                return new C61092Jx3(bDn, aCRType, smartReelType, bi4, r10, reelType, str4, str5, str6, str7, str8);
            } else {
                AnonymousClass7TF.A1L("preview_media", r3, "AcrMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
