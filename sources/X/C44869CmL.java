package X;

import com.instagram.api.schemas.ACRType;
import com.instagram.model.reels.ReelType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CmL  reason: case insensitive filesystem */
public abstract class C44869CmL {
    public static AnonymousClass3HZ parseFromJson(16F r18) {
        String str;
        String str2;
        16F r3 = r18;
        0qQ.A0B(r3, 0);
        try {
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            ACRType aCRType = null;
            Long l = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Long l2 = null;
            1Xj r7 = null;
            Long l3 = null;
            ReelType reelType = null;
            ArrayList arrayList = null;
            String str7 = null;
            BI4 bi4 = null;
            String str8 = null;
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(493).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r3.A1P();
                    }
                    aCRType = C378199Ow.A00(str2);
                } else if ("acr_metadata_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r3);
                } else if ("action_text".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r3.A1P();
                    }
                } else if ("audio_cluster_id".equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1218).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r3.A1P();
                    }
                } else if (AnonymousClass000.A00(1219).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r3.A1P();
                    }
                } else if (C41845B3m.A17(A17)) {
                    l2 = AnonymousClass7TF.A0Z(r3);
                } else if ("preview_media".equals(A17)) {
                    r7 = 1Xj.A00(r3);
                } else if (AnonymousClass000.A00(756).equals(A17)) {
                    l3 = AnonymousClass7TF.A0Z(r3);
                } else if (AnonymousClass000.A00(757).equals(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r3.A1P();
                    }
                    reelType = AnonymousClass3HS.A00(str);
                } else if (AnonymousClass000.A00(1833).equals(A17)) {
                    if (r3.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r3.A1J() != 16L.A08) {
                            C41846B3n.A1D(r3, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1E(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str7 = null;
                    } else {
                        str7 = r3.A1P();
                    }
                } else if ("track_schema".equals(A17)) {
                    bi4 = C44548Cgi.parseFromJson(r3);
                } else if (C41845B3m.A1W(A17)) {
                    if (r3.A11() == 16L.A0G) {
                        str8 = null;
                    } else {
                        str8 = r3.A1P();
                    }
                }
                r3.A0z();
            }
            return new AnonymousClass3HZ(aCRType, bi4, r7, reelType, l, l2, l3, str3, str4, str5, str6, str7, str8, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
