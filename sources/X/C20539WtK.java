package X;

import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.shopify.checkout.models.ProgressButton;
import com.shopify.checkout.models.ProgressButtonStage;
import com.shopify.checkout.models.ProgressButtonStageSerializer;
import com.shopify.checkout.models.ProgressButtonState;
import com.shopify.checkout.models.ProgressButtonStateSerializer;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtK  reason: case insensitive filesystem */
public final /* synthetic */ class C20539WtK implements C255533uI {
    public static final C20539WtK A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        ProgressButtonState progressButtonState = null;
        ProgressButtonStage progressButtonStage = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new ProgressButton(progressButtonStage, progressButtonState, i);
            } else if (ANp == 0) {
                progressButtonState = (ProgressButtonState) ADI.AO5(progressButtonState, ProgressButtonStateSerializer.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                progressButtonStage = (ProgressButtonStage) ADI.AO5(progressButtonStage, ProgressButtonStageSerializer.A00, serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WtK, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.models.ProgressButton", obj);
        A0k.A00(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        A0k.A00("stage");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{ProgressButtonStateSerializer.A00, ProgressButtonStageSerializer.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ProgressButton progressButton = (ProgressButton) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, progressButton);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(progressButton.A01, ProgressButtonStateSerializer.A00, serialDescriptor, 0);
        ADJ.AS8(progressButton.A00, ProgressButtonStageSerializer.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
