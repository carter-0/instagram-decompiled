package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.OrderDetails;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtG  reason: case insensitive filesystem */
public final /* synthetic */ class C20535WtG implements C255533uI {
    public static final C20535WtG A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r10 = OrderDetails.A08;
        String str = null;
        Address address = null;
        List list = null;
        Address address2 = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        CartInfo cartInfo = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new OrderDetails(address2, address, cartInfo, str, str2, str3, list2, list, i);
                case 0:
                    str = ADI.AOA(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    cartInfo = (CartInfo) ADI.AO5(cartInfo, C20522Wt2.A00, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    address2 = (Address) ADI.AO4(address2, C20519Wsz.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) C13988Tno.A0W(list2, serialDescriptor, ADI, r10, 5);
                    i |= 32;
                    break;
                case 6:
                    list = (List) ADI.AO4(list, r10[6], serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    address = (Address) ADI.AO4(address, C20519Wsz.A00, serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.WtG, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.shopify.checkout.models.OrderDetails", obj, 8);
        r2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r2.A01("email", true);
        r2.A01("phone", true);
        r2.A00("cart");
        r2.A01("billingAddress", true);
        r2.A00("paymentMethods");
        r2.A01("deliveries", true);
        r2.A01("shippingAddress", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r2 = OrderDetails.A08;
        C255453u9 r3 = C255453u9.A01;
        C255463uA A002 = C360578eo.A00(r3);
        C255463uA A003 = C360578eo.A00(r3);
        C20522Wt2 wt2 = C20522Wt2.A00;
        C20519Wsz wsz = C20519Wsz.A00;
        return new C255463uA[]{r3, A002, A003, wt2, C360578eo.A00(wsz), r2[5], C360578eo.A00(r2[6]), C360578eo.A00(wsz)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        OrderDetails orderDetails = (OrderDetails) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, orderDetails);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = OrderDetails.A08;
        ADJ.ASC(orderDetails.A04, serialDescriptor, 0);
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || orderDetails.A03 != null) {
            ADJ.AS7(orderDetails.A03, C255453u9.A01, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || orderDetails.A05 != null) {
            ADJ.AS7(orderDetails.A05, C255453u9.A01, serialDescriptor, 2);
        }
        ADJ.AS8(orderDetails.A02, C20522Wt2.A00, serialDescriptor, 3);
        if (ADJ.EsA(serialDescriptor, 4) || orderDetails.A00 != null) {
            ADJ.AS7(orderDetails.A00, C20519Wsz.A00, serialDescriptor, 4);
        }
        ADJ.AS8(orderDetails.A07, r5[5], serialDescriptor, 5);
        if (ADJ.EsA(serialDescriptor, 6) || orderDetails.A06 != null) {
            ADJ.AS7(orderDetails.A06, r5[6], serialDescriptor, 6);
        }
        if (ADJ.EsA(serialDescriptor, 7) || orderDetails.A01 != null) {
            ADJ.AS7(orderDetails.A01, C20519Wsz.A00, serialDescriptor, 7);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
