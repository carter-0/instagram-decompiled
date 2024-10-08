package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

public final class F82 {
    public static DvR parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (C41845B3m.A1B(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    User A00 = 1aC.A00(r4, true);
                    0qQ.A0B(A00, 0);
                    r1.A00 = A00;
                } else {
                    1XY.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
