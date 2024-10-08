package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.business.promote.model.IGBoostPackage;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.KrP  reason: case insensitive filesystem */
public abstract class C63096KrP {
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.instagram.business.promote.model.IGBoostPackage] */
    public static IGBoostPackage parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (DialogModule.KEY_TITLE.equals(A17)) {
                    obj.A06 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    obj.A05 = AnonymousClass7TG.A0l(r3);
                } else if ("badge_content".equals(A17)) {
                    obj.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("badge_description".equals(A17)) {
                    obj.A04 = AnonymousClass7TG.A0l(r3);
                } else if (AnonymousClass000.A00(195).equals(A17)) {
                    obj.A00 = 16h.A00(r3);
                } else if (AnonymousClass000.A00(4731).equals(A17)) {
                    obj.A02 = AnonymousClass7TF.A0X(r3);
                } else if (AnonymousClass000.A00(581).equals(A17)) {
                    obj.A01 = AnonymousClass7TF.A0X(r3);
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
