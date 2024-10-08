package X;

import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.CheckoutStatePayload;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt7  reason: case insensitive filesystem */
public final /* synthetic */ class C20526Wt7 implements C255533uI {
    public static final C20526Wt7 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r8 = CheckoutStatePayload.A04;
        String str = null;
        CartInfo cartInfo = null;
        BuyerInfo buyerInfo = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new CheckoutStatePayload(buyerInfo, cartInfo, str, list, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                cartInfo = (CartInfo) ADI.AO5(cartInfo, C20522Wt2.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                buyerInfo = (BuyerInfo) ADI.AO4(buyerInfo, C20521Wt1.A00, serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                list = (List) ADI.AO4(list, r8[3], serialDescriptor, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wt7, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.CheckoutStatePayload", obj);
        A0m.A00("flowType");
        A0m.A00("cart");
        A0m.A01("buyer", true);
        A0m.A01("deliveries", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, C20522Wt2.A00, C360578eo.A00(C20521Wt1.A00), C360578eo.A00(CheckoutStatePayload.A04[3])};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutStatePayload checkoutStatePayload = (CheckoutStatePayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, checkoutStatePayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = CheckoutStatePayload.A04;
        ADJ.ASC(checkoutStatePayload.A02, serialDescriptor, 0);
        ADJ.AS8(checkoutStatePayload.A01, C20522Wt2.A00, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || checkoutStatePayload.A00 != null) {
            ADJ.AS7(checkoutStatePayload.A00, C20521Wt1.A00, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || checkoutStatePayload.A03 != null) {
            ADJ.AS7(checkoutStatePayload.A03, r5[3], serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
