package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Vn2  reason: case insensitive filesystem */
public final class C18188Vn2 {
    public static C15250UXk parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C15250UXk uXk = new C15250UXk();
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("do_base_hashes_match".equals(A17)) {
                    uXk.A03 = r6.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("server_contact_hashes".equals(A17)) {
                        if (r6.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r6.A1J() != 16L.A08) {
                                C17336VRp parseFromJson = VB5.parseFromJson(r6);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        0qQ.A0B(arrayList, 0);
                        uXk.A02 = arrayList;
                    } else if (MYM.A00(51, 10, 106).equals(A17)) {
                        uXk.A01 = AnonymousClass7TG.A0l(r6);
                    } else if ("setting".equals(A17)) {
                        uXk.A00 = VB7.parseFromJson(r6);
                    } else {
                        1XY.A01(r6, uXk, A17);
                    }
                }
                r6.A0z();
            }
            return uXk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
