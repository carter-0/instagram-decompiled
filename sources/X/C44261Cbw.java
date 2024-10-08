package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.ProductDetailsSellerBadgeContentImpl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* renamed from: X.Cbw  reason: case insensitive filesystem */
public abstract class C44261Cbw {
    public static ProductDetailsSellerBadgeContentImpl parseFromJson(16F r8) {
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                } else if (DialogModule.KEY_TITLE.equals(A17)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            if (str == null && (r8 instanceof 0c9)) {
                AnonymousClass7TF.A1L(DevServerEntity.COLUMN_DESCRIPTION, r8, "ProductDetailsSellerBadgeContentImpl");
            } else if (str2 != null || !(r8 instanceof 0c9)) {
                return new ProductDetailsSellerBadgeContentImpl(str, str2);
            } else {
                AnonymousClass7TF.A1L(DialogModule.KEY_TITLE, r8, "ProductDetailsSellerBadgeContentImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
