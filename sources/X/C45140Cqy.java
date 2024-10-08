package X;

import com.instagram.model.upcomingeventsmetadata.UpcomingEventMediaImpl;
import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.UpcomingDropCampaignEventMetadataImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cqy  reason: case insensitive filesystem */
public abstract class C45140Cqy {
    public static UpcomingDropCampaignEventMetadataImpl parseFromJson(16F r15) {
        0qQ.A0B(r15, 0);
        try {
            if (r15.A11() != 16L.A0D) {
                r15.A0z();
                return null;
            }
            ProductCollectionImpl productCollectionImpl = null;
            UpcomingEventMediaImpl upcomingEventMediaImpl = null;
            String str = null;
            String str2 = null;
            User user = null;
            ArrayList arrayList = null;
            while (r15.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r15);
                if ("collection_metadata".equals(A17)) {
                    productCollectionImpl = C45710D2j.parseFromJson(r15);
                } else if ("cover_media".equals(A17)) {
                    upcomingEventMediaImpl = C45694D1t.parseFromJson(r15);
                } else if ("drop_campaign_id".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r15.A1P();
                    }
                } else if ("launch_type_subtitle".equals(A17)) {
                    if (r15.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r15.A1P();
                    }
                } else if ("merchant".equals(A17)) {
                    user = C41845B3m.A0a(r15, false);
                } else if ("products".equals(A17)) {
                    if (r15.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r15.A1J() != 16L.A08) {
                            C41846B3n.A1G(r15, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r15.A0z();
            }
            if (str == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("drop_campaign_id", r15, "UpcomingDropCampaignEventMetadataImpl");
            } else if (str2 == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("launch_type_subtitle", r15, "UpcomingDropCampaignEventMetadataImpl");
            } else if (user == null && (r15 instanceof 0c9)) {
                AnonymousClass7TF.A1L("merchant", r15, "UpcomingDropCampaignEventMetadataImpl");
            } else if (arrayList != null || !(r15 instanceof 0c9)) {
                return new UpcomingDropCampaignEventMetadataImpl(upcomingEventMediaImpl, productCollectionImpl, user, str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("products", r15, "UpcomingDropCampaignEventMetadataImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
