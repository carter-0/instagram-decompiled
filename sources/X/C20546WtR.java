package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.violations.InventoryErrorCode;
import com.shopify.checkout.models.errors.violations.InventoryErrorCodeSerializer;
import com.shopify.checkout.models.errors.violations.InventoryErrorPayload;
import com.shopify.checkout.models.errors.violations.ViolationErrorType;
import com.shopify.checkout.models.errors.violations.ViolationErrorTypeSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtR  reason: case insensitive filesystem */
public final /* synthetic */ class C20546WtR implements C255533uI {
    public static final C20546WtR A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        InventoryErrorCode inventoryErrorCode = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        ViolationErrorType violationErrorType = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new InventoryErrorPayload(errorGroup, inventoryErrorCode, violationErrorType, str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                inventoryErrorCode = (InventoryErrorCode) ADI.AO5(inventoryErrorCode, InventoryErrorCodeSerializer.A00, serialDescriptor, 1);
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

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WtR, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0U = C13992Tns.A0U("com.shopify.checkout.models.errors.violations.InventoryErrorPayload", obj, 5);
        A0U.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A01 = A0U;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{r4, InventoryErrorCodeSerializer.A00, C360578eo.A00(r4), ErrorGroupSerializer.A00, ViolationErrorTypeSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InventoryErrorPayload inventoryErrorPayload = (InventoryErrorPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, inventoryErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(inventoryErrorPayload.A03, serialDescriptor, 0);
        ADJ.AS8(inventoryErrorPayload.A01, InventoryErrorCodeSerializer.A00, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || inventoryErrorPayload.A04 != null) {
            ADJ.AS7(inventoryErrorPayload.A04, C255453u9.A01, serialDescriptor, 2);
        }
        ADJ.AS8(inventoryErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        ADJ.AS8(inventoryErrorPayload.A02, ViolationErrorTypeSerializer.A00, serialDescriptor, 4);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
