package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hug  reason: case insensitive filesystem */
public final class C56213Hug {
    public static C54047GyW parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            1XQ r4 = new 1XQ();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("bulk_action_error_message".equals(A17)) {
                    r4.A02 = AnonymousClass7TG.A0l(r5);
                } else if ("error_media_id_list".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            AnonymousClass7TG.A1F(r5, arrayList);
                        }
                    }
                    r4.A03 = arrayList;
                } else if ("media".equals(A17)) {
                    r4.A01 = 1Xj.A00(r5);
                } else {
                    1XY.A01(r5, r4, A17);
                }
                r5.A0z();
            }
            r4.A00 = new C53265GlD(r4.A01, r4.A02, r4.A03);
            return r4;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
