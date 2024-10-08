package X;

/* renamed from: X.VEt  reason: case insensitive filesystem */
public abstract class C17019VEt {
    public static final C16659Uyv A00(String str) {
        for (C16659Uyv uyv : C16659Uyv.values()) {
            if (0qQ.A0K(uyv.A00, str)) {
                return uyv;
            }
        }
        0wb.A03("ProductSourceType", 002.A0R("Unexpected product source type: ", str));
        return C16659Uyv.CATALOG;
    }
}
