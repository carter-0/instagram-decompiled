package X;

import com.shopify.checkout.models.CartLineImage;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt4  reason: case insensitive filesystem */
public final /* synthetic */ class C20523Wt4 implements C255533uI {
    public static final C20523Wt4 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new CartLineImage(str, str2, str3, str4, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str3 = ADI.AOA(serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                str4 = C13988Tno.A0f(str4, serialDescriptor, ADI, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wt4] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.CartLineImage", obj);
        A0m.A00("sm");
        A0m.A00("md");
        A0m.A00("lg");
        A0m.A01("altText", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{r1, r1, r1, C360578eo.A00(r1)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartLineImage cartLineImage = (CartLineImage) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, cartLineImage);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(cartLineImage.A03, serialDescriptor, 0);
        ADJ.ASC(cartLineImage.A02, serialDescriptor, A1U ? 1 : 0);
        ADJ.ASC(cartLineImage.A01, serialDescriptor, 2);
        if (ADJ.EsA(serialDescriptor, 3) || cartLineImage.A00 != null) {
            ADJ.AS7(cartLineImage.A00, C255453u9.A01, serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
