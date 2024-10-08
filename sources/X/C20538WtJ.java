package X;

import com.shopify.checkout.models.Money;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtJ  reason: case insensitive filesystem */
public final /* synthetic */ class C20538WtJ implements C255533uI {
    public static final C20538WtJ A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = Price.A06;
        Money money = null;
        Money money2 = null;
        Money money3 = null;
        Boolean bool = null;
        Money money4 = null;
        List list = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new Price(money, money2, money3, money4, bool, list, i);
                case 0:
                    money = (Money) ADI.AO4(money, C20533WtE.A00, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    money2 = (Money) ADI.AO4(money2, C20533WtE.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    money3 = (Money) ADI.AO4(money3, C20533WtE.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) ADI.AO4(bool, AnonymousClass40E.A00, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    money4 = (Money) ADI.AO4(money4, C20533WtE.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) ADI.AO4(list, r9[5], serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WtJ, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.shopify.checkout.models.Price", obj, 6);
        r2.A01("total", true);
        r2.A01("subtotal", true);
        r2.A01("taxes", true);
        r2.A01("taxesIncluded", true);
        r2.A01("shipping", true);
        r2.A01("discounts", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r2 = Price.A06;
        C20533WtE wtE = C20533WtE.A00;
        return new C255463uA[]{C360578eo.A00(wtE), C360578eo.A00(wtE), C360578eo.A00(wtE), C360578eo.A00(AnonymousClass40E.A00), C360578eo.A00(wtE), C360578eo.A00(r2[5])};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Price price = (Price) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, price);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = Price.A06;
        if (ADJ.EsA(serialDescriptor, 0) || price.A03 != null) {
            ADJ.AS7(price.A03, C20533WtE.A00, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || price.A01 != null) {
            ADJ.AS7(price.A01, C20533WtE.A00, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || price.A02 != null) {
            ADJ.AS7(price.A02, C20533WtE.A00, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || price.A04 != null) {
            ADJ.AS7(price.A04, AnonymousClass40E.A00, serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || price.A00 != null) {
            ADJ.AS7(price.A00, C20533WtE.A00, serialDescriptor, 4);
        }
        if (ADJ.EsA(serialDescriptor, 5) || price.A05 != null) {
            ADJ.AS7(price.A05, r5[5], serialDescriptor, 5);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
