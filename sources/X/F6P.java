package X;

import com.instagram.api.schemas.OneTapLinkedProfileInfoImpl;
import java.io.IOException;
import java.util.ArrayList;

public final class F6P {
    public static C47362Dvw parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C47362Dvw dvw = new C47362Dvw();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("login_nonce".equals(A17)) {
                    dvw.A00 = AnonymousClass7TG.A0l(r5);
                } else if ("device_based_login_enabled".equals(A17)) {
                    dvw.A02 = r5.A0d();
                } else if ("feta_linked_profiles_info".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r5.A1J() != 16L.A08) {
                            OneTapLinkedProfileInfoImpl parseFromJson = C48343Ed0.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    dvw.A01 = arrayList;
                } else {
                    1XY.A01(r5, dvw, A17);
                }
                r5.A0z();
            }
            return dvw;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
