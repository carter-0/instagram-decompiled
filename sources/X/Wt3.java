package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.shopify.checkout.models.CartLine;
import com.shopify.checkout.models.CartLineImage;
import com.shopify.checkout.models.Money;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Wt3 implements C255533uI {
    public static final Wt3 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = CartLine.A07;
        List list = null;
        Money money = null;
        String str = null;
        String str2 = null;
        CartLineImage cartLineImage = null;
        String str3 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new CartLine(cartLineImage, money, str, str2, str3, list, i2, i);
                case 0:
                    str = C13990Tnq.A0b(str, serialDescriptor, ADI, 0);
                    i2 |= 1;
                    break;
                case 1:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 1);
                    i2 |= 2;
                    break;
                case 2:
                    cartLineImage = (CartLineImage) ADI.AO4(cartLineImage, C20523Wt4.A00, serialDescriptor, 2);
                    i2 |= 4;
                    break;
                case 3:
                    i = ADI.ANz(serialDescriptor, 3);
                    i2 |= 8;
                    break;
                case 4:
                    str3 = ADI.AOA(serialDescriptor, 4);
                    i2 |= 16;
                    break;
                case 5:
                    money = (Money) ADI.AO5(money, C20533WtE.A00, serialDescriptor, 5);
                    i2 |= 32;
                    break;
                case 6:
                    list = (List) ADI.AO4(list, r9[6], serialDescriptor, 6);
                    i2 |= 64;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.Wt3] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.shopify.checkout.models.CartLine", obj, 7);
        r2.A01("merchandiseId", true);
        r2.A01("productId", true);
        r2.A01("image", true);
        r2.A00("quantity");
        r2.A00(DialogModule.KEY_TITLE);
        r2.A00("price");
        r2.A01("discounts", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = CartLine.A07;
        C255453u9 r6 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r6), C360578eo.A00(r6), C360578eo.A00(C20523Wt4.A00), C360278eK.A00, r6, C20533WtE.A00, C360578eo.A00(r1[6])};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartLine cartLine = (CartLine) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, cartLine);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = CartLine.A07;
        if (ADJ.EsA(serialDescriptor, 0) || cartLine.A03 != null) {
            ADJ.AS7(cartLine.A03, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || cartLine.A04 != null) {
            ADJ.AS7(cartLine.A04, C255453u9.A01, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || cartLine.A01 != null) {
            ADJ.AS7(cartLine.A01, C20523Wt4.A00, serialDescriptor, 2);
        }
        ADJ.AS3(serialDescriptor, 3, cartLine.A00);
        ADJ.ASC(cartLine.A05, serialDescriptor, 4);
        ADJ.AS8(cartLine.A02, C20533WtE.A00, serialDescriptor, 5);
        if (ADJ.EsA(serialDescriptor, 6) || cartLine.A06 != null) {
            ADJ.AS7(cartLine.A06, r5[6], serialDescriptor, 6);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
