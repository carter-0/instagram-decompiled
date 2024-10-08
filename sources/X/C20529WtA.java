package X;

import com.shopify.checkout.models.DeliveryDetails;
import com.shopify.checkout.models.DeliveryInfo;
import com.shopify.checkout.models.DeliveryMethod;
import com.shopify.checkout.models.DeliveryMethodSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtA  reason: case insensitive filesystem */
public final /* synthetic */ class C20529WtA implements C255533uI {
    public static final C20529WtA A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        DeliveryMethod deliveryMethod = null;
        DeliveryDetails deliveryDetails = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new DeliveryInfo(deliveryDetails, deliveryMethod, i);
            } else if (ANp == 0) {
                deliveryMethod = (DeliveryMethod) ADI.AO5(deliveryMethod, DeliveryMethodSerializer.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                deliveryDetails = (DeliveryDetails) ADI.AO5(deliveryDetails, C20528Wt9.A00, serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WtA, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.models.DeliveryInfo", obj);
        A0k.A00("method");
        A0k.A00("details");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{DeliveryMethodSerializer.A00, C20528Wt9.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryInfo deliveryInfo = (DeliveryInfo) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, deliveryInfo);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(deliveryInfo.A01, DeliveryMethodSerializer.A00, serialDescriptor, 0);
        ADJ.AS8(deliveryInfo.A00, C20528Wt9.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
