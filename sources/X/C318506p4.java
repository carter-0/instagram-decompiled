package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.6p4  reason: invalid class name and case insensitive filesystem */
public final class C318506p4 {
    public static C318496p3 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r1 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("accounts".equals(A0q)) {
                    ArrayList arrayList = null;
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r5, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    r1.A00 = arrayList;
                } else {
                    1XY.A01(r5, r1, A0q);
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
