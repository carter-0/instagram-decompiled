package X;

import com.instagram.model.androidlink.AndroidLinkImpl;
import java.io.IOException;

/* renamed from: X.54o  reason: invalid class name and case insensitive filesystem */
public abstract class C2808754o {
    public static C2808854p parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            AndroidLinkImpl androidLinkImpl = null;
            Integer num = null;
            String str = null;
            String str2 = null;
            while (r7.A1J() != 16L.A09) {
                String A0q = r7.A0q();
                r7.A1J();
                if ("android_link".equals(A0q)) {
                    androidLinkImpl = C250113kv.parseFromJson(r7);
                } else if ("secondary_cta_destination".equals(A0q)) {
                    num = Integer.valueOf(r7.A1D());
                } else if ("secondary_cta_hint_text".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r7.A1P();
                    }
                } else if ("secondary_cta_title".equals(A0q)) {
                    if (r7.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r7.A1P();
                    }
                }
                r7.A0z();
            }
            return new C2808854p(androidLinkImpl, num, str, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
