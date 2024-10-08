package X;

import java.io.IOException;
import java.util.ArrayList;

public final class OQA {
    public static NHF parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            NHF nhf = new NHF();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("broadcast_chats".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            C70721OHq parseFromJson = C70155Ny9.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    nhf.A02 = arrayList;
                } else if ("cursor_timestamp_seconds".equals(A17)) {
                    nhf.A00 = AnonymousClass7TF.A0X(r5);
                } else if ("cursor_thread_id".equals(A17)) {
                    nhf.A01 = AnonymousClass7TG.A0l(r5);
                } else {
                    1XY.A01(r5, nhf, A17);
                }
                r5.A0z();
            }
            return nhf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
