package X;

import android.graphics.PointF;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.people.PeopleTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class LJJ {
    public static PeopleTag parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            PeopleTag peopleTag = new PeopleTag();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (PublicKeyCredentialControllerUtility.JSON_KEY_USER.equals(A17)) {
                    peopleTag.A00 = C63329KvC.parseFromJson(r4);
                } else if (AnonymousClass000.A00(1817).equals(A17)) {
                    peopleTag.A02 = r4.A0d();
                } else if ("sticker_overlay_tag".equals(A17)) {
                    peopleTag.A03 = r4.A0d();
                } else if ("categories".equals(A17)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r4.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r4, arrayList);
                        }
                    }
                    peopleTag.A01 = arrayList;
                } else if ("position".equals(A17)) {
                    peopleTag.A00 = C273894nM.A00(r4);
                }
                r4.A0z();
            }
            return peopleTag;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, PeopleTag peopleTag) {
        r3.A0c();
        if (peopleTag.A00 != null) {
            r3.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
            PeopleTag.UserInfo userInfo = peopleTag.A00;
            r3.A0c();
            String str = userInfo.A04;
            if (str != null) {
                r3.A0R(Dbf.A01(), str);
            }
            String str2 = userInfo.A03;
            if (str2 != null) {
                r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
            }
            String str3 = userInfo.A02;
            if (str3 != null) {
                r3.A0R("full_name", str3);
            }
            if (userInfo.A01 != null) {
                r3.A0q("profile_pic_url");
                16h.A01(r3, userInfo.A01);
            }
            r3.A0Z();
        }
        r3.A0S(AnonymousClass000.A00(1817), peopleTag.A02);
        r3.A0S("sticker_overlay_tag", peopleTag.A03);
        if (peopleTag.A01 != null) {
            16P.A03(r3, "categories");
            Iterator it = peopleTag.A01.iterator();
            while (it.hasNext()) {
                C41846B3n.A18(r3, it);
            }
            r3.A0Y();
        }
        PointF pointF = peopleTag.A00;
        if (pointF != null) {
            C273894nM.A01(pointF, r3, "position");
        }
        r3.A0Z();
    }
}
