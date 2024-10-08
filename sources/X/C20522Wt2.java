package X;

import com.shopify.checkout.models.CartInfo;
import com.shopify.checkout.models.Price;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wt2  reason: case insensitive filesystem */
public final /* synthetic */ class C20522Wt2 implements C255533uI {
    public static final C20522Wt2 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r8 = CartInfo.A03;
        String str = null;
        List list = null;
        Price price = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new CartInfo(price, str, list, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                list = C13988Tno.A0j(list, serialDescriptor, ADI, r8, 1);
                i |= 2;
            } else if (ANp == 2) {
                price = (Price) ADI.AO5(price, C20538WtJ.A00, serialDescriptor, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wt2, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.shopify.checkout.models.CartInfo", obj);
        A0l.A00("token");
        A0l.A00("lines");
        A0l.A00("price");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, CartInfo.A03[1], C20538WtJ.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        CartInfo cartInfo = (CartInfo) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, cartInfo);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r1 = CartInfo.A03;
        ADJ.ASC(cartInfo.A01, serialDescriptor, 0);
        ADJ.AS8(cartInfo.A02, r1[A1U], serialDescriptor, A1U);
        ADJ.AS8(cartInfo.A00, C20538WtJ.A00, serialDescriptor, 2);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
