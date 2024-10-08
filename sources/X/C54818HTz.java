package X;

import com.instagram.api.schemas.MidCardReelsChainCtaType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HTz  reason: case insensitive filesystem */
public abstract class C54818HTz {
    public static C53459Gor parseFromJson(16F r7) {
        String str;
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            String str2 = null;
            String str3 = null;
            ArrayList arrayList = null;
            MidCardReelsChainCtaType midCardReelsChainCtaType = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("chain_primary_title".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                } else if ("chain_secondary_title".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r7.A1P();
                    }
                } else if ("prioritized_media_ids".equals(A17)) {
                    if (r7.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r7.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("reels_viewer_cta_type".equals(A17)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                    midCardReelsChainCtaType = (MidCardReelsChainCtaType) MidCardReelsChainCtaType.A01.get(str);
                    if (midCardReelsChainCtaType == null) {
                        midCardReelsChainCtaType = MidCardReelsChainCtaType.UNRECOGNIZED;
                    }
                }
                r7.A0z();
            }
            return new C53459Gor(midCardReelsChainCtaType, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
