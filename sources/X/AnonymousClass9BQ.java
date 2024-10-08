package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.9BQ  reason: invalid class name */
public final class AnonymousClass9BQ {
    public static AnonymousClass9BO parseFromJson(16F r5) {
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
                ArrayList arrayList = null;
                if ("child_accounts".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass9GU parseFromJson = AnonymousClass9GR.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    r1.A01 = arrayList;
                } else if ("main_accounts".equals(A0q)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass9GU parseFromJson2 = AnonymousClass9GR.parseFromJson(r5);
                            if (parseFromJson2 != null) {
                                arrayList.add(parseFromJson2);
                            }
                        }
                    }
                    r1.A02 = arrayList;
                } else if ("current_account".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    r1.A00 = 1aC.A00(r5, false);
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
