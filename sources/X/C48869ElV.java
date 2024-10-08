package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.ElV  reason: case insensitive filesystem */
public abstract class C48869ElV {
    public static C66281ld parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66281ld r1 = new C66281ld();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r1.A02 = A0l;
                } else if ("item_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A00 = A0l2;
                } else if (AnonymousClass000.A00(3706).equals(A17)) {
                    r1.A01 = AnonymousClass7TG.A0l(r4);
                } else if (AnonymousClass000.A00(314).equals(A17)) {
                    r1.A03 = r4.A0d();
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
