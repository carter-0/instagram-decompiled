package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import java.io.IOException;
import java.util.ArrayList;

public abstract class VH8 {
    public static C18622VvF parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C18622VvF vvF = new C18622VvF();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("merchant".equals(A17)) {
                    vvF.A05 = C41845B3m.A0a(r5, false);
                } else if ("shipping_information".equals(A17)) {
                    vvF.A04 = VH7.parseFromJson(r5);
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_ITEMS.equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                W0O parseFromJson = VHA.parseFromJson(r5);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        vvF.A06 = arrayList;
                    } else if (AnonymousClass000.A00(3781).equals(A17)) {
                        if (r5.A11() == 16L.A0C) {
                            arrayList = new ArrayList();
                            while (r5.A1J() != 16L.A08) {
                                MultiProductComponent parseFromJson2 = VF1.parseFromJson(r5);
                                if (parseFromJson2 != null) {
                                    arrayList.add(parseFromJson2);
                                }
                            }
                        }
                        vvF.A07 = arrayList;
                    } else if ("metadata".equals(A17)) {
                        vvF.A03 = VH6.parseFromJson(r5);
                    }
                }
                r5.A0z();
            }
            vvF.A01();
            return vvF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
