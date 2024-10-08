package X;

import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;

public abstract class VHA {
    public static W0O parseFromJson(16F r6) {
        0qQ.A0B(r6, 0);
        try {
            C17985VjN vjN = null;
            if (r6.A11() != 16L.A0D) {
                r6.A0z();
                return null;
            }
            Integer num = null;
            Integer num2 = null;
            while (r6.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r6);
                if ("item".equals(A17)) {
                    vjN = VH9.parseFromJson(r6);
                } else if ("quantity".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r6);
                } else {
                    num2 = C41847B3o.A13(r6, num2, A17, "last_updated_time");
                }
                r6.A0z();
            }
            W0O w0o = new W0O();
            if (vjN != null) {
                w0o.A02 = vjN;
            }
            if (num != null) {
                w0o.A01 = num.intValue();
            }
            if (num2 != null) {
                w0o.A00 = num2.intValue();
            }
            C17985VjN vjN2 = w0o.A02;
            ProductDetailsProductItemDict productDetailsProductItemDict = vjN2.A01;
            if (productDetailsProductItemDict == null) {
                return w0o;
            }
            vjN2.A00 = new ProductTile(new Product((TaggingFeedSessionInformation) null, productDetailsProductItemDict));
            w0o.A02.A01 = null;
            return w0o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
