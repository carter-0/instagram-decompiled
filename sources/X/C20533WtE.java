package X;

import com.shopify.checkout.models.Money;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtE  reason: case insensitive filesystem */
public final /* synthetic */ class C20533WtE implements C255533uI {
    public static final C20533WtE A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        float f = 0.0f;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Money(str, i, f);
            } else if (ANp == 0) {
                f = ADI.ANs(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.WtE, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.shopify.checkout.models.Money", obj);
        A0k.A00("amount");
        A0k.A00("currencyCode");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C2592140v.A00, C255453u9.A01};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Money money = (Money) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, money);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ARz(serialDescriptor, money.A00, 0);
        ADJ.ASC(money.A01, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
