package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.shopify.checkout.models.errors.ErrorGroup;
import com.shopify.checkout.models.errors.ErrorGroupSerializer;
import com.shopify.checkout.models.errors.ParsableInternalErrorCode;
import com.shopify.checkout.models.errors.ParsableInternalErrorPayload;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtN  reason: case insensitive filesystem */
public final /* synthetic */ class C20542WtN implements C255533uI {
    public static final C20542WtN A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r5 = ParsableInternalErrorPayload.A04;
        ParsableInternalErrorCode parsableInternalErrorCode = null;
        String str = null;
        String str2 = null;
        ErrorGroup errorGroup = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new ParsableInternalErrorPayload(errorGroup, parsableInternalErrorCode, str, str2, i);
            } else if (ANp == 0) {
                parsableInternalErrorCode = (ParsableInternalErrorCode) C13988Tno.A0W(parsableInternalErrorCode, serialDescriptor, ADI, r5, 0);
                i |= 1;
            } else if (ANp == 1) {
                str = C13988Tno.A0f(str, serialDescriptor, ADI, 1);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WtN, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.errors.ParsableInternalErrorPayload", obj);
        A0m.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        A0m.A01("underlyingError", true);
        A0m.A01("reason", true);
        A0m.A01("group", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255463uA r3 = ParsableInternalErrorPayload.A04[0];
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r3, C360578eo.A00(r0), C360578eo.A00(r0), ErrorGroupSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ParsableInternalErrorPayload parsableInternalErrorPayload = (ParsableInternalErrorPayload) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, parsableInternalErrorPayload);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(parsableInternalErrorPayload.A01, ParsableInternalErrorPayload.A04[0], serialDescriptor, 0);
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || parsableInternalErrorPayload.A03 != null) {
            ADJ.AS7(parsableInternalErrorPayload.A03, C255453u9.A01, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || parsableInternalErrorPayload.A02 != null) {
            ADJ.AS7(parsableInternalErrorPayload.A02, C255453u9.A01, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || parsableInternalErrorPayload.A00 != ErrorGroup.Internal) {
            ADJ.AS8(parsableInternalErrorPayload.A00, ErrorGroupSerializer.A00, serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
