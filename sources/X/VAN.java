package X;

import com.instagram.api.schemas.XIGIGBoostCallToAction;
import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromotionMetric;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VAN {
    public static C19175WOh parseFromJson(16F r9) {
        String str;
        InstagramMediaProductType instagramMediaProductType;
        0qQ.A0B(r9, 0);
        try {
            C19175WOh wOh = new C19175WOh();
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                ArrayList arrayList = null;
                if ("draft_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l, 0);
                    wOh.A06 = A0l;
                } else if ("organic_media_igid".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l2, 0);
                    wOh.A0A = A0l2;
                } else if ("organic_media_fbid".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l3, 0);
                    wOh.A09 = A0l3;
                } else if ("thumbnail_url".equals(A17)) {
                    SimpleImageUrl A00 = 16h.A00(r9);
                    0qQ.A0B(A00, 0);
                    wOh.A04 = A00;
                } else if ("media_product_type".equals(A17)) {
                    String A1Q = r9.A1Q();
                    InstagramMediaProductType[] values = InstagramMediaProductType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            instagramMediaProductType = InstagramMediaProductType.DEFAULT_DO_NOT_USE;
                            break;
                        }
                        instagramMediaProductType = values[i];
                        if (00p.A0j(instagramMediaProductType.toString(), A1Q, true)) {
                            break;
                        }
                        i++;
                    }
                    wOh.A02 = instagramMediaProductType;
                } else if ("instagram_positions".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        ArrayList arrayList2 = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            if (r9.A11() == 16L.A0G) {
                                str = null;
                            } else {
                                str = r9.A1P();
                            }
                            arrayList2.add(V70.A00(str));
                        }
                        arrayList = arrayList2;
                    }
                    0qQ.A0B(arrayList, 0);
                    wOh.A0C = arrayList;
                } else if ("political_ad_byline_text".equals(A17)) {
                    wOh.A0B = AnonymousClass7TG.A0l(r9);
                } else if (AnonymousClass000.A00(1375).equals(A17)) {
                    wOh.A07 = AnonymousClass7TG.A0l(r9);
                } else if ("formatted_spent_budget".equals(A17)) {
                    wOh.A08 = AnonymousClass7TG.A0l(r9);
                } else if ("destination".equals(A17)) {
                    wOh.A01 = C16852V8h.A00(AnonymousClass7TG.A0l(r9));
                } else if ("call_to_action".equals(A17)) {
                    wOh.A00 = XIGIGBoostCallToAction.valueOf(r9.A1Q());
                } else if ("regulated_categories".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r9.A1J() != 16L.A08) {
                            arrayList.add(VAY.A00(r9.A1Q()));
                        }
                    }
                    wOh.A0D = arrayList;
                } else if ("audience_id".equals(A17)) {
                    C41846B3n.A1A(r9);
                } else if ("audience_name".equals(A17)) {
                    wOh.A05 = AnonymousClass7TG.A0l(r9);
                } else if ("metric".equals(A17)) {
                    PromotionMetric parseFromJson = VAT.parseFromJson(r9);
                    0qQ.A0B(parseFromJson, 0);
                    wOh.A03 = parseFromJson;
                }
                r9.A0z();
            }
            return wOh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
