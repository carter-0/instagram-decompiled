package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;
import java.util.HashMap;

public final class TSR extends HashMap {
    public final int A00;

    public TSR(int i) {
        this.A00 = i;
        if (i != 0) {
            for (RFZ rfz : RFZ.values()) {
                Pxh.A1I(rfz, this, rfz.A00);
            }
            return;
        }
        put("birthdate-day", "birthDateDay");
        put("birthdate-full", "birthDateFull");
        put("birthdate-month", "birthDateMonth");
        put("birthdate-year", "birthDateYear");
        put("cc-csc", "creditCardSecurityCode");
        put("cc-exp", "creditCardExpirationDate");
        put("cc-exp-day", "creditCardExpirationDay");
        put("cc-exp-month", "creditCardExpirationMonth");
        put("cc-exp-year", "creditCardExpirationYear");
        put("cc-number", "creditCardNumber");
        put("email", "emailAddress");
        put("gender", "gender");
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "personName");
        put("name-family", "personFamilyName");
        put("name-given", "personGivenName");
        put("name-middle", "personMiddleName");
        put("name-middle-initial", "personMiddleInitial");
        put("name-prefix", "personNamePrefix");
        put("name-suffix", "personNameSuffix");
        put("password", "password");
        put("password-new", "newPassword");
        put("postal-address", "postalAddress");
        put("postal-address-country", "addressCountry");
        put("postal-address-extended", "extendedAddress");
        put("postal-address-extended-postal-code", "extendedPostalCode");
        put("postal-address-locality", "addressLocality");
        put("postal-address-region", "addressRegion");
        put("postal-code", "postalCode");
        put("street-address", "streetAddress");
        put("sms-otp", "smsOTPCode");
        put("tel", "phoneNumber");
        put("tel-country-code", "phoneCountryCode");
        put("tel-national", "phoneNational");
        put("tel-device", "phoneNumberDevice");
        byte[] copyOfRange = Arrays.copyOfRange(C9886Riz.A00, 0, 8);
        for (int i2 = 0; i2 < copyOfRange.length; i2++) {
            copyOfRange[i2] = (byte) ((copyOfRange[i2] ^ 114) ^ 92);
        }
        String str = new String(copyOfRange);
        put(str, str);
        put("username-new", "newUsername");
    }
}
