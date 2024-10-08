package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Cf1  reason: case insensitive filesystem */
public abstract class C44443Cf1 {
    public static BHL parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num = null;
            String str = null;
            Boolean bool = null;
            String str2 = null;
            ArrayList arrayList = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("latest_slider_vote_time".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r8);
                } else if (C41845B3m.A1H(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (C41845B3m.A1V(A17)) {
                    bool = AnonymousClass7TF.A0S(r8);
                } else if ("slider_id".equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("voters".equals(A17)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r8.A1J() != 16L.A08) {
                            C42139BIu parseFromJson = D2J.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                r8.A0z();
            }
            return new BHL(bool, num, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
