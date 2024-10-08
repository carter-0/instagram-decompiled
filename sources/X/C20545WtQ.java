package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.violations.DeliveryErrorCode;
import com.shopify.checkout.models.errors.violations.DeliveryErrorCodeSerializer;
import com.shopify.checkout.models.errors.violations.DeliveryErrorPayload;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import com.shopify.checkout.models.errors.violations.ViolationErrorTypeSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtQ  reason: case insensitive filesystem */
public final /* synthetic */ class C20545WtQ implements C255533uI {
    public static final C20545WtQ A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        DeliveryErrorCode deliveryErrorCode = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        ViolationErrorType violationErrorType = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new DeliveryErrorPayload(errorGroup, deliveryErrorCode, violationErrorType, str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                deliveryErrorCode = (DeliveryErrorCode) ADI.AO5(deliveryErrorCode, DeliveryErrorCodeSerializer.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 2);
                i |= 4;
            } else if (ANp == 3) {
                errorGroup = (ErrorGroup) ADI.AO5(errorGroup, ErrorGroupSerializer.A00, serialDescriptor, 3);
                i |= 8;
            } else if (ANp == 4) {
                violationErrorType = (ViolationErrorType) ADI.AO5(violationErrorType, ViolationErrorTypeSerializer.A00, serialDescriptor, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WtQ, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0U = C13992Tns.A0U("com.shopify.checkout.models.errors.violations.DeliveryErrorPayload", obj, 5);
        A0U.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A01 = A0U;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{r4, DeliveryErrorCodeSerializer.A00, C360578eo.A00(r4), ErrorGroupSerializer.A00, ViolationErrorTypeSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DeliveryErrorPayload deliveryErrorPayload = (DeliveryErrorPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, deliveryErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(deliveryErrorPayload.A03, serialDescriptor, 0);
        ADJ.AS8(deliveryErrorPayload.A01, DeliveryErrorCodeSerializer.A00, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || deliveryErrorPayload.A04 != null) {
            ADJ.AS7(deliveryErrorPayload.A04, C255453u9.A01, serialDescriptor, 2);
        }
        ADJ.AS8(deliveryErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADJ.AS8(deliveryErrorPayload.A02, ViolationErrorTypeSerializer.A00, serialDescriptor, 4);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
