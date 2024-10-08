package X;

import com.instagram.api.schemas.Estimate;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Vmc  reason: case insensitive filesystem */
public final class C18162Vmc {
    public static C15243UXd parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
            16L A11 = r8.A11();
            16L r5 = 16L.A0D;
            if (A11 != r5) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r7 = 16L.A09;
                if (A1J == r7) {
                    return r0;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                HashMap hashMap = null;
                if ("total_budget_with_offset_to_reach_estimate".equals(A17)) {
                    if (r8.A11() == r5) {
                        HashMap hashMap2 = new HashMap();
                        while (r8.A1J() != r7) {
                            String A1P = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                hashMap2.put(A1P, (Object) null);
                            } else {
                                Estimate parseFromJson = V7C.parseFromJson(r8);
                                if (parseFromJson != null) {
                                    hashMap2.put(A1P, parseFromJson);
                                }
                            }
                        }
                        hashMap = hashMap2;
                    }
                    r0.A02 = hashMap;
                } else if ("total_budget_with_offset_to_outcome_estimate".equals(A17)) {
                    if (r8.A11() == r5) {
                        HashMap hashMap3 = new HashMap();
                        while (r8.A1J() != r7) {
                            String A1P2 = r8.A1P();
                            r8.A1J();
                            if (r8.A11() == 16L.A0G) {
                                hashMap3.put(A1P2, (Object) null);
                            } else {
                                Estimate parseFromJson2 = V7C.parseFromJson(r8);
                                if (parseFromJson2 != null) {
                                    hashMap3.put(A1P2, parseFromJson2);
                                }
                            }
                        }
                        hashMap = hashMap3;
                    }
                    r0.A01 = hashMap;
                } else if ("error".equals(A17)) {
                    r0.A00 = C44284CcS.parseFromJson(r8);
                } else {
                    1XY.A01(r8, r0, A17);
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
