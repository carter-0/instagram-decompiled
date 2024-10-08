package X;

import com.shopify.checkout.models.Authentication;
import com.shopify.checkout.models.CheckoutOptions;
import com.shopify.checkout.models.Defaults;
import com.shopify.checkout.models.ThemeOptions;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt6  reason: case insensitive filesystem */
public final /* synthetic */ class C20525Wt6 implements C255533uI {
    public static final C20525Wt6 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r5 = CheckoutOptions.A04;
        Defaults defaults = null;
        Authentication authentication = null;
        ThemeOptions themeOptions = null;
        int i = 0;
        boolean z = false;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new CheckoutOptions(authentication, defaults, themeOptions, i, z);
            } else if (ANp == 0) {
                defaults = (Defaults) ADI.AO4(defaults, C20527Wt8.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                authentication = (Authentication) ADI.AO5(authentication, C20520Wt0.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                z = ADI.ANi(serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                themeOptions = (ThemeOptions) C13988Tno.A0W(themeOptions, serialDescriptor, ADI, r5, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wt6] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.CheckoutOptions", obj);
        A0m.A01("defaults", true);
        A0m.A00("auth");
        A0m.A01("shouldInjectJS", true);
        A0m.A01("theme", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360578eo.A00(C20527Wt8.A00), C20520Wt0.A00, AnonymousClass40E.A00, CheckoutOptions.A04[3]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CheckoutOptions checkoutOptions = (CheckoutOptions) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, checkoutOptions);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = CheckoutOptions.A04;
        if (ADJ.EsA(serialDescriptor, 0) || checkoutOptions.A01 != null) {
            ADJ.AS7(checkoutOptions.A01, C20527Wt8.A00, serialDescriptor, 0);
        }
        ADJ.AS8(checkoutOptions.A00, C20520Wt0.A00, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || checkoutOptions.A03) {
            ADJ.ARt(serialDescriptor, 2, checkoutOptions.A03);
        }
        if (ADJ.EsA(serialDescriptor, 3) || checkoutOptions.A02 != ThemeOptions.LIGHT) {
            ADJ.AS8(checkoutOptions.A02, r5[3], serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
