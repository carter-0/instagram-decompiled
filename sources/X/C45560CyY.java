package X;

import com.instagram.user.model.FriendshipStatusImpl;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.CyY  reason: case insensitive filesystem */
public final class C45560CyY {
    public static C43798CDq parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r5 = new 1XQ();
            16L A11 = r8.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r7 = 16L.A09;
                if (A1J != r7) {
                    String A17 = AnonymousClass7TE.A17(r8);
                    if (AnonymousClass000.A00(611).equals(A17)) {
                        HashMap hashMap = null;
                        if (r8.A11() == r6) {
                            HashMap A1E = AnonymousClass7TE.A1E();
                            while (r8.A1J() != r7) {
                                String A1P = r8.A1P();
                                if (C41845B3m.A0W(r8) == 16L.A0G) {
                                    A1E.put(A1P, (Object) null);
                                } else {
                                    FriendshipStatusImpl parseFromJson = 1c0.parseFromJson(r8);
                                    if (parseFromJson != null) {
                                        A1E.put(A1P, parseFromJson);
                                    }
                                }
                            }
                            hashMap = A1E;
                        }
                        r5.A02 = hashMap;
                    } else if ("removal_in_progress".equals(A17)) {
                        r5.A01 = AnonymousClass7TF.A0S(r8);
                    } else {
                        1XY.A01(r8, r5, A17);
                    }
                    r8.A0z();
                } else {
                    HashMap hashMap2 = r5.A02;
                    0qQ.A0A(hashMap2);
                    r5.A00 = new C47139DrG(r5.A01, hashMap2);
                    return r5;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
