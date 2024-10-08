package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.NzE  reason: case insensitive filesystem */
public abstract class C70222NzE {
    public static AnonymousClass1d9 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            AnonymousClass1d9 r1 = new AnonymousClass1d9();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("sender".equals(A17)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A00 = 1aC.A00(r4, false);
                } else {
                    C66893Meb.A01(r4, r1, A17);
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
