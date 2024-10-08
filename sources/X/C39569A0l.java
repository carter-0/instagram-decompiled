package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.A0l  reason: case insensitive filesystem */
public abstract class C39569A0l {
    public static C40602Aeq parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            C40602Aeq aeq = new C40602Aeq();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    aeq.A03 = A0l;
                } else if ("price".equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l2, 0);
                    aeq.A02 = A0l2;
                } else if ("coverImagePath".equals(A17)) {
                    String A0l3 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l3, 0);
                    aeq.A00 = A0l3;
                } else if ("variants".equals(A17)) {
                    String A0l4 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l4, 0);
                    aeq.A04 = A0l4;
                } else if ("currency".equals(A17)) {
                    String A0l5 = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l5, 0);
                    aeq.A01 = A0l5;
                }
                r4.A0z();
            }
            return aeq;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
