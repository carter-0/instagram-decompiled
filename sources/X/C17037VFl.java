package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.VFl  reason: case insensitive filesystem */
public abstract class C17037VFl {
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.VcV] */
    public static C17700VcV parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C41845B3m.A1C(A17)) {
                    obj.A09 = AnonymousClass7TG.A0l(r3);
                } else if (C41845B3m.A1E(A17)) {
                    obj.A08 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17) || DialogModule.KEY_MESSAGE.equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("learn_more_action_title".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (C273654mx.A00(329).equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("learn_more_action_style".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("bottom_notice".equals(A17)) {
                    obj.A01 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(3932).equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if ("secondary_action_url".equals(A17)) {
                    obj.A07 = AnonymousClass7TG.A0l(r3);
                } else if ("hide_dismiss".equals(A17)) {
                    obj.A00 = AnonymousClass7TF.A0S(r3);
                } else if ("is_bloks".equals(A17)) {
                    obj.A0A = r3.A0d();
                } else if ("tag".equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
