package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.shopify.checkout.models.Discount;
import com.shopify.checkout.models.Money;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtB  reason: case insensitive filesystem */
public final /* synthetic */ class C20530WtB implements C255533uI {
    public static final C20530WtB A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        Money money = null;
        String str2 = null;
        String str3 = null;
        Float f = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Discount(money, f, str, str2, str3, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                money = (Money) ADI.AO5(money, C20533WtE.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = ADI.AOA(serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                str3 = C13988Tno.A0f(str3, serialDescriptor, ADI, 3);
                i |= 8;
            } else if (ANp == 4) {
                f = (Float) ADI.AO4(f, C2592140v.A00, serialDescriptor, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WtB, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.shopify.checkout.models.Discount", obj, 5);
        r2.A00(DialogModule.KEY_TITLE);
        r2.A00("amount");
        r2.A00("applicationType");
        r2.A01("valueType", true);
        r2.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        C255453u9 r3 = r0;
        return new C255463uA[]{r3, C20533WtE.A00, r3, C360578eo.A00(r0), C360578eo.A00(C2592140v.A00)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Discount discount = (Discount) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, discount);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(discount.A03, serialDescriptor, 0);
        ADJ.AS8(discount.A00, C20533WtE.A00, serialDescriptor, A1U ? 1 : 0);
        ADJ.ASC(discount.A02, serialDescriptor, 2);
        if (ADJ.EsA(serialDescriptor, 3) || discount.A04 != null) {
            ADJ.AS7(discount.A04, C255453u9.A01, serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || discount.A01 != null) {
            ADJ.AS7(discount.A01, C2592140v.A00, serialDescriptor, 4);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
