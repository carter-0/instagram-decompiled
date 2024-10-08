package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.Cos  reason: case insensitive filesystem */
public abstract class C45015Cos {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.CvV, java.lang.Object] */
    public static C45389CvV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (AnonymousClass000.A00(821).equals(A17)) {
                    C41846B3n.A1A(r3);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(1596).equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("display".equals(A17)) {
                    obj.A00 = C45013Coq.parseFromJson(r3);
                } else if ("sender".equals(A17)) {
                    obj.A01 = C45014Cor.parseFromJson(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
