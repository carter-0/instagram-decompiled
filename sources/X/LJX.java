package X;

import android.os.Parcelable;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.user.model.User;
import java.io.IOException;

public abstract class LJX {
    public static BrandedContentTag parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            BrandedContentTag brandedContentTag = new BrandedContentTag();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("sponsor_id".equals(A17)) {
                    brandedContentTag.A01 = AnonymousClass7TG.A0l(r4);
                } else if (Dbm.A01().equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    brandedContentTag.A02 = A0l;
                } else if ("permission".equals(A17)) {
                    brandedContentTag.A04 = r4.A0d();
                } else if ("sponsor".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    brandedContentTag.A00 = 1aC.A00(r4, false);
                } else if ("is_pending".equals(A17)) {
                    brandedContentTag.A03 = r4.A0d();
                }
                r4.A0z();
            }
            return brandedContentTag;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, BrandedContentTag brandedContentTag) {
        r2.A0c();
        String str = brandedContentTag.A01;
        if (str != null) {
            r2.A0R("sponsor_id", str);
        }
        String str2 = brandedContentTag.A02;
        if (str2 != null) {
            r2.A0R(Dbm.A01(), str2);
        }
        r2.A0S("permission", brandedContentTag.A04);
        if (brandedContentTag.A00 != null) {
            r2.A0q("sponsor");
            User user = brandedContentTag.A00;
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        r2.A0S("is_pending", brandedContentTag.A03);
        r2.A0Z();
    }
}
