package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.phonenumber.model.CountryCodeData;

public final class T86 implements G6B {
    public final Callback A00;

    public T86(Callback callback) {
        this.A00 = callback;
    }

    public final void ESy(CountryCodeData countryCodeData) {
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("country", countryCodeData.A00);
        A0U.putString("countryCode", countryCodeData.A01);
        Pxh.A1E(this.A00, A0U);
    }
}
