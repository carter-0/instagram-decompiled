package X;

import com.facebook.flipper.plugins.uidebugger.model.Color;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws3  reason: case insensitive filesystem */
public final class C20461Ws3 implements C255533uI {
    public static final C20461Ws3 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        int i = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new Color(i4, i, i3, i2, f);
            } else if (ANp == 0) {
                i = ADI.ANz(r6, 0);
                i4 |= 1;
            } else if (ANp == 1) {
                i3 = ADI.ANz(r6, 1);
                i4 |= 2;
            } else if (ANp == 2) {
                i2 = ADI.ANz(r6, 2);
                i4 |= 4;
            } else if (ANp == 3) {
                f = ADI.ANs(r6, 3);
                i4 |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Ws3] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.flipper.plugins.uidebugger.model.Color", obj);
        A0m.A00("r");
        A0m.A00("g");
        A0m.A00("b");
        A0m.A00("a");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C360278eK r1 = C360278eK.A00;
        return new C255463uA[]{r1, r1, r1, C2592140v.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Color color = (Color) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, color);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.AS3(r3, 0, color.A03);
        ADJ.AS3(r3, A1U ? 1 : 0, color.A02);
        ADJ.AS3(r3, 2, color.A01);
        ADJ.ARz(r3, color.A00, 3);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
