package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public final class B71 {
    public static CFP parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("users".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r4.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r4.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r4, true);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    r1.A00 = arrayList;
                } else {
                    1XY.A01(r4, r1, A0q);
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
