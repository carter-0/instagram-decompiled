package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.api.schemas.StoryGroupMentionTappableData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Czr  reason: case insensitive filesystem */
public abstract class C45641Czr {
    public static StoryGroupMentionTappableData parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            String str3 = null;
            while (r11.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r11);
                if (C41845B3m.A1Z(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r11.A1P();
                    }
                } else if ("mentioned_users".equals(A17)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r11.A1J() != 16L.A08) {
                            C41846B3n.A1E(r11, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (C41845B3m.A1a(A17)) {
                    num = AnonymousClass7TF.A0X(r11);
                } else if (C41845B3m.A1A(A17)) {
                    if (r11.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (str2 == null && (r11 instanceof 0c9)) {
                AnonymousClass7TF.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r11, "StoryGroupMentionTappableData");
            } else if (arrayList != null || !(r11 instanceof 0c9)) {
                return new StoryGroupMentionTappableData(num, str, str2, str3, arrayList);
            } else {
                AnonymousClass7TF.A1L("mentioned_users", r11, "StoryGroupMentionTappableData");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, StoryGroupMentionTappableData storyGroupMentionTappableData) {
        r2.A0c();
        C41846B3n.A17(r2, storyGroupMentionTappableData.A01);
        C41846B3n.A0y(r2, storyGroupMentionTappableData.A02);
        List list = storyGroupMentionTappableData.A04;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(r2, "mentioned_users", list);
            while (A0s.hasNext()) {
                C41846B3n.A19(r2, A0s);
            }
            r2.A0Y();
        }
        C41846B3n.A0p(r2, storyGroupMentionTappableData.A00);
        C41846B3n.A0z(r2, storyGroupMentionTappableData.A03);
        r2.A0Z();
    }
}
