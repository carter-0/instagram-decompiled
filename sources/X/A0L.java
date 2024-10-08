package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

public abstract class A0L {
    public static C66111jb parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66111jb r1 = new C66111jb();
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
                } else if (AnonymousClass000.A00(5174).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r1.A01 = A0l2;
                } else if ("recipientId".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r1.A00 = A0l3;
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
