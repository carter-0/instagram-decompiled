package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.8UF  reason: invalid class name */
public final class AnonymousClass8UF {
    public C62565Khv A00;
    public final AIV A01;
    public final String A02;

    public AnonymousClass8UF(C62565Khv khv, Product product) {
        this.A01 = new AIV(product);
        this.A02 = null;
        this.A00 = khv;
    }

    public AnonymousClass8UF(List list) {
        this.A01 = new AIV(list);
        this.A02 = null;
    }

    public AnonymousClass8UF(User user) {
        this.A01 = new AIV(user);
        this.A02 = null;
    }

    public AnonymousClass8UF(Product product, String str) {
        0qQ.A0B(product, 1);
        this.A01 = new AIV(product);
        this.A02 = str;
    }

    public AnonymousClass8UF(ProductCollection productCollection, User user) {
        this.A01 = new AIV(productCollection, user);
        this.A02 = null;
    }
}
