package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.4Hu  reason: invalid class name and case insensitive filesystem */
public abstract class C263114Hu {
    public static C263124Hv parseFromJson(16F r11) {
        0qQ.A0B(r11, 0);
        try {
            if (r11.A11() != 16L.A0D) {
                r11.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            while (r11.A1J() != 16L.A09) {
                String A0q = r11.A0q();
                r11.A1J();
                if ("default_selected_donation_value".equals(A0q)) {
                    num = Integer.valueOf(r11.A1D());
                } else if ("donation_amount_selector_values".equals(A0q)) {
                    if (r11.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r11.A1J() != 16L.A08) {
                            Integer valueOf = Integer.valueOf(r11.A1D());
                            if (valueOf != null) {
                                arrayList.add(valueOf);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("maximum_donation_amount".equals(A0q)) {
                    num2 = Integer.valueOf(r11.A1D());
                } else if ("minimum_donation_amount".equals(A0q)) {
                    num3 = Integer.valueOf(r11.A1D());
                } else if ("prefill_amount".equals(A0q)) {
                    num4 = Integer.valueOf(r11.A1D());
                } else if ("user_currency".equals(A0q)) {
                    if (r11.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r11.A1P();
                    }
                }
                r11.A0z();
            }
            if (arrayList != null || !(r11 instanceof 0c9)) {
                return new C263124Hv(num, num2, num3, num4, str, arrayList);
            }
            ((0c9) r11).A03.A00("donation_amount_selector_values", "FundraiserDonationAmountConfigImpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
