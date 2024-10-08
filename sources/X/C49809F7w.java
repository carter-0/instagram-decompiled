package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.F7w  reason: case insensitive filesystem */
public final class C49809F7w {
    public static DvP parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1B(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A00 = 1aC.A00(r3, true);
                } else {
                    1XY.A01(r3, r1, A17);
                }
                r3.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
