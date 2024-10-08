package X;

import com.shopify.checkout.models.Defaults;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt8  reason: case insensitive filesystem */
public final /* synthetic */ class C20527Wt8 implements C255533uI {
    public static final C20527Wt8 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r5 = Defaults.A04;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Defaults(str, str2, list, list2, i);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, serialDescriptor, ADI, 0);
                i |= 1;
            } else if (ANp == 1) {
                list = (List) ADI.AO4(list, r5[1], serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                list2 = (List) ADI.AO4(list2, r5[2], serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wt8, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.shopify.checkout.models.Defaults", obj);
        A0m.A01("email", true);
        A0m.A01("shippingAddresses", true);
        A0m.A01("paymentMethods", true);
        A0m.A01("levelOfPriorConsentGiven", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = Defaults.A04;
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r4), C360578eo.A00(r1[1]), C360578eo.A00(r1[2]), C360578eo.A00(r4)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Defaults defaults = (Defaults) obj;
        char A1U = AnonymousClass7TF.A1U(0, encoder, defaults);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = Defaults.A04;
        if (ADJ.EsA(serialDescriptor, 0) || defaults.A00 != null) {
            ADJ.AS7(defaults.A00, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U) || defaults.A03 != null) {
            ADJ.AS7(defaults.A03, r5[A1U], serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || defaults.A02 != null) {
            ADJ.AS7(defaults.A02, r5[2], serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || defaults.A01 != null) {
            ADJ.AS7(defaults.A01, C255453u9.A01, serialDescriptor, 3);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
