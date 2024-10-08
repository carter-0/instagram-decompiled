package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;

/* renamed from: X.Chq  reason: case insensitive filesystem */
public abstract class C44618Chq {
    public static C45374CvG parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C45374CvG cvG = new C45374CvG();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("is_exclusive".equals(A17)) {
                    cvG.A00 = AnonymousClass7TF.A0S(r4);
                } else if ("num_responders".equals(A17)) {
                    cvG.A01 = AnonymousClass7TF.A0X(r4);
                } else if (C41845B3m.A1A(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    cvG.A02 = A0l;
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    cvG.A03 = A0l2;
                }
                r4.A0z();
            }
            return cvG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
