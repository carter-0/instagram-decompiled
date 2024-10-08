package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Cyo  reason: case insensitive filesystem */
public final class C45576Cyo {
    public static CER parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            1XQ r5 = new 1XQ();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("creator".equals(A17)) {
                    r5.A01 = C41845B3m.A0a(r6, false);
                } else {
                    ArrayList arrayList = null;
                    if (C41845B3m.A17(A17)) {
                        r5.A02 = AnonymousClass7TG.A0l(r6);
                    } else if ("mentioned_users".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r6.A1J() != 16L.A08) {
                                C47198Dsk parseFromJson = CYD.parseFromJson(r6);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        r5.A04 = arrayList;
                    } else if (C41845B3m.A1A(A17)) {
                        r5.A03 = AnonymousClass7TG.A0l(r6);
                    } else {
                        1XY.A01(r6, r5, A17);
                    }
                }
                r6.A0z();
            }
            User user = r5.A01;
            String str = r5.A02;
            0qQ.A0A(str);
            List list = r5.A04;
            0qQ.A0A(list);
            String str2 = r5.A03;
            0qQ.A0A(str2);
            r5.A00 = new C47197Dsj(user, str, str2, list);
            return r5;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
