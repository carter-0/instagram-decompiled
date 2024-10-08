package X;

import com.shopify.checkout.models.InitPayload;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtC  reason: case insensitive filesystem */
public final /* synthetic */ class C20531WtC implements C255533uI {
    public static final C20531WtC A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new InitPayload(str, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WtC] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("com.shopify.checkout.models.InitPayload", obj);
        A0g.A00("paymentUrl");
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InitPayload initPayload = (InitPayload) obj;
        AnonymousClass7TG.A1N(encoder, initPayload);
        SerialDescriptor serialDescriptor = A01;
        C13990Tnq.A1T(initPayload.A00, serialDescriptor, encoder.ADJ(serialDescriptor));
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
