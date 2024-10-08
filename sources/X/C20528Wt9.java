package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.Address;
import com.shopify.checkout.models.DeliveryDetails;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt9  reason: case insensitive filesystem */
public final /* synthetic */ class C20528Wt9 implements C255533uI {
    public static final C20528Wt9 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        Address address = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new DeliveryDetails(address, str, str2, i);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, serialDescriptor, ADI, 0);
                i |= 1;
            } else if (ANp == 1) {
                address = (Address) ADI.AO4(address, C20519Wsz.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wt9, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.shopify.checkout.models.DeliveryDetails", obj);
        A0l.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        A0l.A01("location", true);
        A0l.A01("additionalInfo", true);
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r3 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r3), C360578eo.A00(C20519Wsz.A00), C360578eo.A00(r3)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryDetails deliveryDetails = (DeliveryDetails) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, deliveryDetails);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        if (ADJ.EsA(serialDescriptor, 0) || deliveryDetails.A02 != null) {
            ADJ.AS7(deliveryDetails.A02, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || deliveryDetails.A00 != null) {
            ADJ.AS7(deliveryDetails.A00, C20519Wsz.A00, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || deliveryDetails.A01 != null) {
            ADJ.AS7(deliveryDetails.A01, C255453u9.A01, serialDescriptor, 2);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
