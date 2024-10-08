package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.CXu  reason: case insensitive filesystem */
public abstract class C44155CXu {
    public static C42039BEr parseFromJson(16F r9) {
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            Integer num = null;
            ArrayList arrayList = null;
            Integer num2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if ("default_selected_donation_value".equals(A17)) {
                    num = AnonymousClass7TF.A0X(r9);
                } else if ("donation_amount_selector_values".equals(A17)) {
                    if (r9.A11() == 16L.A0C) {
                        arrayList = AnonymousClass7TE.A1C();
                        while (r9.A1J() != 16L.A08) {
                            Integer A0X = AnonymousClass7TF.A0X(r9);
                            if (A0X != null) {
                                arrayList.add(A0X);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("maximum_donation_amount".equals(A17)) {
                    num2 = AnonymousClass7TF.A0X(r9);
                } else if ("minimum_donation_amount".equals(A17)) {
                    num3 = AnonymousClass7TF.A0X(r9);
                } else if ("prefill_amount".equals(A17)) {
                    num4 = AnonymousClass7TF.A0X(r9);
                } else if ("user_currency".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                }
                r9.A0z();
            }
            return new C42039BEr(num, num2, num3, num4, str, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
