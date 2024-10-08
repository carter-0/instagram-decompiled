package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;

/* renamed from: X.VnR  reason: case insensitive filesystem */
public final class C18201VnR {
    public static C15632Ufy parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C15632Ufy ufy = new C15632Ufy();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE.equals(A17)) {
                    ufy.A00 = r3.A1D();
                } else if ("summary".equals(A17)) {
                    ufy.A06 = AnonymousClass7TG.A0l(r3);
                } else if (DevServerEntity.COLUMN_DESCRIPTION.equals(A17)) {
                    ufy.A02 = AnonymousClass7TG.A0l(r3);
                } else if ("debug_info".equals(A17)) {
                    ufy.A01 = AnonymousClass7TG.A0l(r3);
                } else if ("severity".equals(A17)) {
                    ufy.A05 = AnonymousClass7TG.A0l(r3);
                } else if (DialogModule.KEY_MESSAGE.equals(A17)) {
                    ufy.A03 = AnonymousClass7TG.A0l(r3);
                } else if ("is_silent".equals(A17)) {
                    ufy.A08 = r3.A0d();
                } else if ("requires_reauth".equals(A17)) {
                    ufy.A07 = r3.A0d();
                } else if ("is_transient".equals(A17)) {
                    ufy.A09 = r3.A0d();
                } else if ("query_path".equals(A17)) {
                    ufy.A04 = AnonymousClass7TG.A0l(r3);
                }
                r3.A0z();
            }
            return ufy;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
