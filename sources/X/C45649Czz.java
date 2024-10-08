package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Czz  reason: case insensitive filesystem */
public abstract class C45649Czz {
    public static BHP parseFromJson(16F r10) {
        0qQ.A0B(r10, 0);
        try {
            if (r10.A11() != 16L.A0D) {
                r10.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            Integer num = null;
            String str2 = null;
            while (r10.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r10);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r10.A1P();
                    }
                } else if ("mentioned_users".equals(A17)) {
                    if (r10.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r10.A1J() != 16L.A08) {
                            C41846B3n.A1E(r10, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("sticker_style".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r10);
                } else if (C41845B3m.A1A(A17)) {
                    if (r10.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r10.A1P();
                    }
                }
                r10.A0z();
            }
            if (str == null && (r10 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10, "StorySubscriptionShoutoutMentionTappableData");
            } else if (arrayList != null || !(r10 instanceof 0c9)) {
                return new BHP(num, str, str2, arrayList);
            } else {
                AnonymousClass7TF.A1L("mentioned_users", r10, "StorySubscriptionShoutoutMentionTappableData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BHP bhp) {
        r2.A0c();
        C41846B3n.A0y(r2, bhp.A01);
        List list = bhp.A03;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "mentioned_users", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r2, A0s);
            }
            r2.A0Y();
        }
        Integer num = bhp.A00;
        if (num != null) {
            r2.A0P("sticker_style", num.intValue());
        }
        C41846B3n.A0z(r2, bhp.A02);
        r2.A0Z();
    }
}
