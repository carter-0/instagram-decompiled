package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.Nsu  reason: case insensitive filesystem */
public abstract class C69833Nsu {
    public static C66701py parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            C66701py r0 = new C66701py();
            16L A11 = r9.A11();
            16L r6 = 16L.A0D;
            if (A11 != r6) {
                r9.A0z();
                return null;
            }
            while (true) {
                16L A1J = r9.A1J();
                16L r8 = 16L.A09;
                if (A1J == r8) {
                    return r0;
                }
                String A17 = AnonymousClass7TE.A17(r9);
                HashMap hashMap = null;
                if ("creator_ai_enabled_map".equals(A17)) {
                    if (r9.A11() == r6) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        while (r9.A1J() != r8) {
                            String A1P = r9.A1P();
                            r9.A1J();
                            if (r9.A11() == 16L.A0G) {
                                A1E.put(A1P, (Object) null);
                            } else {
                                Boolean A0S = AnonymousClass7TF.A0S(r9);
                                if (A0S != null) {
                                    A1E.put(A1P, A0S);
                                }
                            }
                        }
                        hashMap = A1E;
                    }
                    r0.A01 = hashMap;
                } else if (ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r9);
                    0qQ.A0B(A0l, 0);
                    r0.A00 = A0l;
                } else {
                    C66670Mad.A01(r9, r0, A17);
                }
                r9.A0z();
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
