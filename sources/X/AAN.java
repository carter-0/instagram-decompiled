package X;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;

public abstract class AAN {
    public static void A00(16F r4, AbstractMap abstractMap) {
        C45456Cwn cwn = null;
        String A1P = r4.A1P();
        r4.A1J();
        if (r4.A11() == 16L.A0G || (cwn = C44609Chh.parseFromJson(r4)) != null) {
            abstractMap.put(A1P, cwn);
        }
    }

    public static C39895ADx parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C39895ADx aDx = new C39895ADx();
            16L A11 = r6.A11();
            16L r2 = 16L.A0D;
            if (A11 != r2) {
                r6.A0z();
                return null;
            }
            while (true) {
                16L A1J = r6.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return aDx;
                }
                String A17 = AnonymousClass7TE.A17(r6);
                if (Pxd.A00(90).equals(A17)) {
                    aDx.A00 = r6.A0y();
                } else {
                    HashMap hashMap = null;
                    if ("aml_face_models".equals(A17)) {
                        if (r6.A11() == r2) {
                            hashMap = AnonymousClass7TE.A1E();
                            while (r6.A1J() != r4) {
                                A00(r6, hashMap);
                            }
                        }
                        aDx.A03 = hashMap;
                    } else if ("segmentation_models".equals(A17)) {
                        if (r6.A11() == r2) {
                            hashMap = AnonymousClass7TE.A1E();
                            while (r6.A1J() != r4) {
                                A00(r6, hashMap);
                            }
                        }
                        aDx.A05 = hashMap;
                    } else {
                        if (!"segmentation_model_version".equals(A17)) {
                            if ("hair_segmentation_models".equals(A17)) {
                                if (r6.A11() == r2) {
                                    hashMap = AnonymousClass7TE.A1E();
                                    while (r6.A1J() != r4) {
                                        A00(r6, hashMap);
                                    }
                                }
                                aDx.A04 = hashMap;
                            } else if (!"hair_segmentation_model_version".equals(A17)) {
                                if ("body_tracking_models".equals(A17)) {
                                    if (r6.A11() == r2) {
                                        hashMap = AnonymousClass7TE.A1E();
                                        while (r6.A1J() != r4) {
                                            A00(r6, hashMap);
                                        }
                                    }
                                    aDx.A02 = hashMap;
                                } else if (!"body_tracking_model_version".equals(A17)) {
                                    if ("world_tracker_device_config".equals(A17)) {
                                        aDx.A01 = C393719wt.parseFromJson(r6);
                                    }
                                }
                            }
                        }
                        r6.A0y();
                    }
                }
                r6.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
