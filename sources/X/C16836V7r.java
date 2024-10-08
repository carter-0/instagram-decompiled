package X;

import com.facebook.location.platform.api.Location;
import java.io.IOException;

/* renamed from: X.V7r  reason: case insensitive filesystem */
public abstract class C16836V7r {
    public static UNK parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            Integer num = null;
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            Integer num2 = null;
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (Location.SPEED.equals(A17)) {
                    num = AnonymousClass7TF.A0X(r4);
                } else {
                    num2 = C41847B3o.A13(r4, num2, A17, "startLagMs");
                }
                r4.A0z();
            }
            return new UNK(num, num2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
