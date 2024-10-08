package X;

import com.instagram.api.schemas.SocialProofInfoImpl;
import java.io.IOException;

/* renamed from: X.54E  reason: invalid class name */
public abstract class AnonymousClass54E {
    public static SocialProofInfoImpl parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            Integer num = null;
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A0q = r3.A0q();
                r3.A1J();
                if ("numOfConversationsStartedWithBusiness".equals(A0q)) {
                    num = Integer.valueOf(r3.A1D());
                }
                r3.A0z();
            }
            return new SocialProofInfoImpl(num);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
