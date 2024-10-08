package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;

/* renamed from: X.Nyp  reason: case insensitive filesystem */
public abstract class C70197Nyp {
    public static C66421mv parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C66421mv r0 = new C66421mv();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("prompt_type".equals(A17)) {
                    r0.A00 = r4.A1D();
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    r0.A03 = A0l;
                } else if ("prompt_id".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    r0.A02 = A0l2;
                } else if ("new_prompt_text".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    r0.A01 = A0l3;
                } else if ("trending_prompt_id".equals(A17)) {
                    r0.A04 = AnonymousClass7TG.A0l(r4);
                } else {
                    C66670Mad.A01(r4, r0, A17);
                }
                r4.A0z();
            }
            return r0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
