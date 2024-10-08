package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.ElX  reason: case insensitive filesystem */
public abstract class C48871ElX {
    public static C66431mz parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            C66431mz r1 = new C66431mz();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    0qQ.A0B(str, 0);
                    r1.A00 = str;
                } else if (AnonymousClass000.A00(680).equals(A17)) {
                    r1.A01 = r4.A0d();
                } else {
                    C66670Mad.A01(r4, r1, A17);
                }
                r4.A0z();
            }
            return r1;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
