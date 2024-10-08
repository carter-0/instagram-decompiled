package X;

import com.instagram.user.model.Product;
import com.instagram.user.model.ProductCollection;
import com.instagram.user.model.User;
import java.util.List;

public final class AIV {
    public final Product A00;
    public final ProductCollection A01;
    public final User A02;
    public final User A03;
    public final List A04;

    public AIV(ProductCollection productCollection, User user) {
        this.A00 = null;
        this.A04 = null;
        this.A03 = null;
        this.A01 = productCollection;
        this.A02 = user;
    }

    public final User A00() {
        User user;
        List list;
        Product product;
        Product product2 = this.A00;
        if ((product2 != null && (user = product2.A0B) != null) || (((list = this.A04) != null && (product = (Product) 00k.A0J(list)) != null && (user = product.A0B) != null) || (user = this.A03) != null || (user = this.A02) != null)) {
            return user;
        }
        throw AnonymousClass7TE.A0z("expected merchant");
    }

    public AIV(List list) {
        this.A00 = null;
        this.A04 = list;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public AIV(Product product) {
        this.A00 = product;
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public AIV(User user) {
        this.A00 = null;
        this.A04 = null;
        this.A03 = user;
        this.A01 = null;
        this.A02 = null;
    }
}
