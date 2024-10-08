package X;

import com.instagram.user.model.Product;

/* renamed from: X.VAn  reason: case insensitive filesystem */
public abstract class C16910VAn {
    public static final String A00(Product product, boolean z) {
        Object[] objArr;
        String A00;
        if (product == null) {
            0kD.A07("ShoppingEffectUtil", "Attempting to get title of null product", (Throwable) null);
            return "";
        }
        if (z) {
            objArr = new Object[]{product.A0J};
            A00 = "%s";
        } else {
            objArr = new Object[]{product.A0J, product.A0L};
            A00 = AnonymousClass000.A00(1991);
        }
        return 0mp.A06(A00, objArr);
    }
}
