package X;

import com.facebook.location.platform.api.Location;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ContextualAdResponseExtrasImpl;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cjz  reason: case insensitive filesystem */
public abstract class C44731Cjz {
    public static BBS parseFromJson(16F r13) {
        0qQ.A0B(r13, 0);
        try {
            if (r13.A11() != 16L.A0D) {
                r13.A0z();
                return null;
            }
            ArrayList arrayList = null;
            C233492vo r6 = null;
            String str = null;
            String str2 = null;
            ContextualAdResponseExtrasImpl contextualAdResponseExtrasImpl = null;
            ArrayList arrayList2 = null;
            Boolean bool = null;
            C42049BFc bFc = null;
            Long l = null;
            ContextualAdResponseOrganicInfoImpl contextualAdResponseOrganicInfoImpl = null;
            while (r13.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r13);
                if ("category_hash_list".equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            C41847B3o.A1L(r13, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("client_gap_rules".equals(A17)) {
                    r6 = C250043ko.parseFromJson(r13);
                } else if ("container_module".equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r13.A1P();
                    }
                } else if (C273654mx.A00(628).equals(A17)) {
                    if (r13.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r13.A1P();
                    }
                } else if (Location.EXTRAS.equals(A17)) {
                    contextualAdResponseExtrasImpl = HTY.parseFromJson(r13);
                } else if (DialogModule.KEY_ITEMS.equals(A17)) {
                    if (r13.A11() == 16L.A0C) {
                        arrayList2 = AnonymousClass7TE.A1C();
                        while (r13.A1J() != 16L.A08) {
                            arrayList2.add(1Xg.A00(r13));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (C41845B3m.A1V(A17)) {
                    bool = AnonymousClass7TF.A0S(r13);
                } else if ("multi_ads_info".equals(A17)) {
                    bFc = C44223Cak.parseFromJson(r13);
                } else if ("next_max_id".equals(A17)) {
                    l = AnonymousClass7TF.A0Z(r13);
                } else if (AnonymousClass000.A00(1656).equals(A17)) {
                    contextualAdResponseOrganicInfoImpl = CWK.parseFromJson(r13);
                }
                r13.A0z();
            }
            return new BBS(contextualAdResponseExtrasImpl, contextualAdResponseOrganicInfoImpl, bFc, r6, bool, l, str, str2, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
