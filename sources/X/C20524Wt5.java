package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutCompletedPayload;
import com.shopify.checkout.models.OrderDetails;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt5  reason: case insensitive filesystem */
public final /* synthetic */ class C20524Wt5 implements C255533uI {
    public static final C20524Wt5 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        OrderDetails orderDetails = null;
        String str2 = null;
        String str3 = null;
        CartInfo cartInfo = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new CheckoutCompletedPayload(cartInfo, orderDetails, str, str2, str3, str4, i);
                case 0:
                    str = ADI.AOA(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    orderDetails = (OrderDetails) ADI.AO5(orderDetails, C20535WtG.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str2 = ADI.AOA(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = ADI.AOA(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    cartInfo = (CartInfo) ADI.AO5(cartInfo, C20522Wt2.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = ADI.AOA(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.Wt5, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.shopify.checkout.models.CheckoutCompletedPayload", obj, 6);
        r1.A00("flowType");
        r1.A00("orderDetails");
        r1.A00("confirmationURL");
        r1.A00("orderId");
        r1.A00("cart");
        r1.A00("thankYouPageUrl");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, C20535WtG.A00, r0, r0, C20522Wt2.A00, r0};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutCompletedPayload checkoutCompletedPayload = (CheckoutCompletedPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, checkoutCompletedPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(checkoutCompletedPayload.A03, serialDescriptor, 0);
        ADJ.AS8(checkoutCompletedPayload.A01, C20535WtG.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.ASC(checkoutCompletedPayload.A02, serialDescriptor, 2);
        ADJ.ASC(checkoutCompletedPayload.A04, serialDescriptor, 3);
        ADJ.AS8(checkoutCompletedPayload.A00, C20522Wt2.A00, serialDescriptor, 4);
        ADJ.ASC(checkoutCompletedPayload.A05, serialDescriptor, 5);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
