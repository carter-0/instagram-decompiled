package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.94G  reason: invalid class name */
public final class AnonymousClass94G {
    public static AnonymousClass94F parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            AnonymousClass94F r1 = new AnonymousClass94F();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                ArrayList arrayList = null;
                if ("users".equals(A0q)) {
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
                    r1.A01 = arrayList;
                } else if ("surfaces".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C293645l7 parseFromJson = C294755my.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
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
