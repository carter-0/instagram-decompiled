package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.model.simpleplace.SimplePlace;
import java.io.IOException;

/* renamed from: X.Cnk  reason: case insensitive filesystem */
public abstract class C44950Cnk {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.model.simpleplace.SimplePlace, java.lang.Object] */
    public static SimplePlace parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    obj.A05 = AnonymousClass7TG.A0l(r4);
                } else if ("lat".equals(A0q)) {
                    obj.A01 = C41846B3n.A0e(r4);
                } else if ("lng".equals(A0q)) {
                    obj.A02 = C41846B3n.A0e(r4);
                } else if (C41845B3m.A19(A0q)) {
                    obj.A06 = AnonymousClass7TG.A0l(r4);
                } else if (ServerW3CShippingAddressConstants.CITY.equals(A0q)) {
                    obj.A04 = AnonymousClass7TG.A0l(r4);
                } else if ("category".equals(A0q)) {
                    obj.A03 = AnonymousClass7TG.A0l(r4);
                } else if ("linked_account".equals(A0q)) {
                    obj.A00 = C41845B3m.A0a(r4, false);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
