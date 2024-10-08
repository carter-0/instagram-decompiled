package X;

import com.facebook.common.locale.Country;
import com.facebookpay.expresscheckout.models.KnownData;
import com.facebookpay.shippingaddress.model.ShippingAddress;

/* renamed from: X.Re5  reason: case insensitive filesystem */
public abstract class C9625Re5 {
    public static final String A00(KnownData knownData, String str, boolean z, boolean z2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (str != null) {
            A1A.append(str);
        }
        ShippingAddress shippingAddress = knownData.A00;
        boolean z3 = true;
        if (shippingAddress != null) {
            String str2 = shippingAddress.A08;
            if (str2 != null) {
                if (!z) {
                    str2 = null;
                }
                if (str2 != null) {
                    if (AnonymousClass7TF.A1R(A1A.length())) {
                        A1A.append("\n");
                    }
                    A1A.append(str2);
                    if (!z2 && !(shippingAddress.A01 == null && shippingAddress.A07 == null && shippingAddress.A02 == null)) {
                        A1A.append(",\n");
                    }
                }
            }
            if (!z2) {
                String str3 = shippingAddress.A01;
                if (str3 != null) {
                    A1A.append(str3);
                }
                String str4 = shippingAddress.A07;
                if (str4 != null) {
                    if (str3 != null) {
                        A1A.append(", ");
                    }
                    A1A.append(str4);
                }
                String str5 = shippingAddress.A02;
                if (str5 != null) {
                    if (!(str3 == null && str4 == null)) {
                        A1A.append(", ");
                    }
                    try {
                        str5 = Country.A00((Country) null, str5).A00.getDisplayCountry();
                    } catch (IllegalArgumentException unused) {
                    }
                    A1A.append(str5);
                }
            }
        }
        if (A1A.length() <= 0) {
            z3 = false;
        }
        if (!z3) {
            knownData = null;
        }
        if (knownData != null) {
            return A1A.toString();
        }
        return null;
    }
}
