package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.BuyerInfo;
import com.shopify.checkout.models.PaymentMethod;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt1  reason: case insensitive filesystem */
public final /* synthetic */ class C20521Wt1 implements C255533uI {
    public static final C20521Wt1 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        PaymentMethod paymentMethod = null;
        Address address = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new BuyerInfo(address, paymentMethod, str, i, z);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, serialDescriptor, ADI, 0);
                i |= 1;
            } else if (ANp == 1) {
                z = ADI.ANi(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                paymentMethod = (PaymentMethod) ADI.AO4(paymentMethod, C20537WtI.A00, serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                address = (Address) ADI.AO4(address, C20519Wsz.A00, serialDescriptor, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wt1, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.BuyerInfo", obj);
        A0m.A01("email", true);
        A0m.A01("acceptsMarketing", true);
        A0m.A01("selectedPaymentMethod", true);
        A0m.A01("selectedShippingAddress", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360578eo.A00(C255453u9.A01), AnonymousClass40E.A00, C360578eo.A00(C20537WtI.A00), C360578eo.A00(C20519Wsz.A00)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BuyerInfo buyerInfo = (BuyerInfo) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, buyerInfo);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        if (ADJ.EsA(serialDescriptor, 0) || buyerInfo.A02 != null) {
            ADJ.AS7(buyerInfo.A02, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || buyerInfo.A03) {
            ADJ.ARt(serialDescriptor, A1U, buyerInfo.A03);
        }
        if (ADJ.EsA(serialDescriptor, 2) || buyerInfo.A01 != null) {
            ADJ.AS7(buyerInfo.A01, C20537WtI.A00, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || buyerInfo.A00 != null) {
            ADJ.AS7(buyerInfo.A00, C20519Wsz.A00, serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
