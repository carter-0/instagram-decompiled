package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.shopify.checkout.models.Address;
import java.util.Map;

public abstract class V68 {
    public static final Address A00(Map map) {
        return new Address(DbU.A0r("referenceId", map), DbU.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, map), DbU.A0r("firstName", map), DbU.A0r("lastName", map), DbU.A0r("postalCode", map), DbU.A0r("address1", map), DbU.A0r("address2", map), DbU.A0r(ServerW3CShippingAddressConstants.CITY, map), DbU.A0r("countryCode", map), DbU.A0r("zoneCode", map), DbU.A0r("phone", map));
    }
}
