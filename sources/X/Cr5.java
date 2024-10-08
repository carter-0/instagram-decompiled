package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;

public abstract class Cr5 {
    public static C66531nv parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C66531nv r0 = new C66531nv();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID.equals(A17)) {
                    r0.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("full_name".equals(A17)) {
                    r0.A02 = AnonymousClass7TG.A0l(r3);
                } else if (Dbe.A01().equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r3);
                } else if ("block_operation_type".equals(A17)) {
                    r0.A00 = r3.A1D();
                } else if ("analytics_params".equals(A17)) {
                    r0.A01 = F8K.parseFromJson(r3);
                } else {
                    C66670Mad.A01(r3, r0, A17);
                }
                r3.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
