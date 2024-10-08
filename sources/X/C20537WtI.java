package X;

import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.PaymentMethod;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtI  reason: case insensitive filesystem */
public final /* synthetic */ class C20537WtI implements C255533uI {
    public static final C20537WtI A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Address address = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new PaymentMethod(address, str, str2, str3, str4, str5, i);
                case 0:
                    str = ADI.AOA(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = ADI.AOA(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = ADI.AOA(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = ADI.AOA(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = ADI.AOA(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    address = (Address) ADI.AO5(address, C20519Wsz.A00, serialDescriptor, 5);
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

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WtI, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.shopify.checkout.models.PaymentMethod", obj, 6);
        r1.A00("referenceId");
        r1.A00("cardType");
        r1.A00("lastFourDigits");
        r1.A00("expirationMonth");
        r1.A00("expirationYear");
        r1.A00("billingAddress");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, r0, r0, r0, r0, C20519Wsz.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, paymentMethod);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(paymentMethod.A05, serialDescriptor, 0);
        ADJ.ASC(paymentMethod.A01, serialDescriptor, A1U ? 1 : 0);
        ADJ.ASC(paymentMethod.A04, serialDescriptor, 2);
        ADJ.ASC(paymentMethod.A02, serialDescriptor, 3);
        ADJ.ASC(paymentMethod.A03, serialDescriptor, 4);
        ADJ.AS8(paymentMethod.A00, C20519Wsz.A00, serialDescriptor, 5);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
