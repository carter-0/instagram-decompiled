package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.errors.CheckoutErrorPayload;
import com.shopify.checkout.models.errors.CheckoutErrorType;
import com.shopify.checkout.models.errors.CheckoutErrorTypeSerializer;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtL  reason: case insensitive filesystem */
public final /* synthetic */ class C20540WtL implements C255533uI {
    public static final C20540WtL A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        CheckoutErrorType checkoutErrorType = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new CheckoutErrorPayload(checkoutErrorType, errorGroup, str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                checkoutErrorType = (CheckoutErrorType) ADI.AO5(checkoutErrorType, CheckoutErrorTypeSerializer.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 2);
                i |= 4;
            } else if (ANp == 3) {
                errorGroup = (ErrorGroup) ADI.AO5(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WtL, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.errors.CheckoutErrorPayload", obj);
        A0m.A00("flowType");
        A0m.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0m.A00("reason");
        A0m.A00("group");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r3 = C255453u9.A01;
        return new C255463uA[]{r3, CheckoutErrorTypeSerializer.A00, C360578eo.A00(r3), ErrorGroupSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutErrorPayload checkoutErrorPayload = (CheckoutErrorPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, checkoutErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(checkoutErrorPayload.A02, serialDescriptor, 0);
        ADJ.AS8(checkoutErrorPayload.A00, CheckoutErrorTypeSerializer.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS7(checkoutErrorPayload.A03, C255453u9.A01, serialDescriptor, 2);
        ADJ.AS8(checkoutErrorPayload.A01, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
