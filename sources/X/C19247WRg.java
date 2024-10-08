package X;

/* renamed from: X.WRg  reason: case insensitive filesystem */
public final class C19247WRg implements 1OW {
    public final void ENE(17Z r5, Object obj) {
        C19248WRh wRh = (C19248WRh) obj;
        r5.A0c();
        if (wRh.A00 != null) {
            16P.A03(r5, "products");
            for (VYE vye : wRh.A00) {
                if (vye != null) {
                    r5.A0c();
                    String str = vye.A03;
                    if (str != null) {
                        r5.A0R("product_id", str);
                    }
                    r5.A0P("quantity", vye.A00);
                    if (vye.A01 != null) {
                        r5.A0q("price");
                        C45675D1a.A00(r5, vye.A01);
                    }
                    String str2 = vye.A02;
                    if (str2 != null) {
                        r5.A0R("launch_date_unix_timestamp", str2);
                    }
                    r5.A0Z();
                }
            }
            r5.A0Y();
        }
        r5.A0Z();
    }

    public final /* bridge */ /* synthetic */ Object E1o(16F r2) {
        return C17012VEm.parseFromJson(r2);
    }
}
