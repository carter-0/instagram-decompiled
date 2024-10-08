package X;

import android.os.Parcelable;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;

public final class AB5 {
    public static C384629hd parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C384629hd r1 = new C384629hd();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("text".equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r5);
                } else if ("friends".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            Parcelable.Creator creator = User.CREATOR;
                            User A00 = 1aC.A00(r5, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    r1.A02 = arrayList;
                } else if ("online_friends_count".equals(A17)) {
                    r1.A00 = AnonymousClass7TF.A0X(r5);
                } else {
                    1XY.A01(r5, r1, A17);
                }
                r5.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
