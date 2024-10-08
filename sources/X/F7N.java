package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.util.HashMap;

public final class F7N {
    public static EM1 parseFromJson(16F r8) {
        Integer num;
        int i;
        0qQ.A0B(r8, 0);
        try {
            1XQ r0 = new 1XQ();
            16L A11 = r8.A11();
            16L r7 = 16L.A0D;
            if (A11 != r7) {
                r8.A0z();
                return null;
            }
            while (true) {
                16L A1J = r8.A1J();
                16L r4 = 16L.A09;
                if (A1J == r4) {
                    return r0;
                }
                String A17 = AnonymousClass7TE.A17(r8);
                HashMap hashMap = null;
                if ("step_name".equals(A17)) {
                    r0.A07 = AnonymousClass7TG.A0l(r8);
                } else if ("step_data".equals(A17)) {
                    if (r8.A11() == r7) {
                        hashMap = AnonymousClass7TE.A1E();
                        while (r8.A1J() != r4) {
                            C41847B3o.A1M(r8, hashMap);
                        }
                    }
                    r0.A09 = hashMap;
                } else if ("action".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r8);
                } else if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    r0.A08 = AnonymousClass7TG.A0l(r8);
                } else if ("nonce_code".equals(A17)) {
                    r0.A06 = AnonymousClass7TG.A0l(r8);
                } else if ("bloks_action".equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r8);
                } else if ("cni".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r8);
                } else if ("actor_gateway_enrollment_id".equals(A17)) {
                    r0.A01 = AnonymousClass7TF.A0Z(r8);
                } else if ("flow_render_type".equals(A17)) {
                    int A1D = r8.A1D();
                    Integer[] A00 = AnonymousClass05K.A00(6);
                    int length = A00.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            num = A00[i2];
                            switch (num.intValue()) {
                                case 1:
                                    i = 1;
                                    break;
                                case 2:
                                    i = 2;
                                    break;
                                case 3:
                                    i = 3;
                                    break;
                                case 4:
                                    i = 7;
                                    break;
                                case 5:
                                    i = 18;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            if (i != A1D) {
                                i2++;
                            }
                        } else {
                            num = AnonymousClass05K.A0j;
                        }
                    }
                    r0.A00 = num;
                } else if ("challenge_context".equals(A17)) {
                    r0.A05 = AnonymousClass7TG.A0l(r8);
                } else {
                    FCB.A00(r8, r0, A17);
                }
                r8.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
