package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrz  reason: case insensitive filesystem */
public final class C20457Wrz implements C255533uI {
    public static final C20457Wrz A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder.ADI(r5);
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            if (ANp == -1) {
                ADI.AST(r5);
                return new WHL(str, i);
            } else if (ANp == 0) {
                str = ADI.AOA(r5, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wrz, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("Fb", obj);
        A0g.A00("iconName");
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WHL whl = (WHL) obj;
        AnonymousClass7TG.A1N(encoder, whl);
        C255543uJ r2 = A01;
        C13990Tnq.A1T(whl.A00, r2, encoder.ADJ(r2));
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
