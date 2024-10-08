package X;

import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws1  reason: case insensitive filesystem */
public final class C20459Ws1 implements C255533uI {
    public static final C20459Ws1 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new Bounds(i5, i, i4, i3, i2);
            } else if (ANp == 0) {
                i = ADI.ANz(r6, 0);
                i5 |= 1;
            } else if (ANp == 1) {
                i4 = ADI.ANz(r6, 1);
                i5 |= 2;
            } else if (ANp == 2) {
                i3 = ADI.ANz(r6, 2);
                i5 |= 4;
            } else if (ANp == 3) {
                i2 = ADI.ANz(r6, 3);
                i5 |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Ws1, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.flipper.plugins.uidebugger.model.Bounds", obj);
        A0m.A00("x");
        A0m.A00("y");
        A0m.A00(IgReactMediaPickerNativeModule.WIDTH);
        A0m.A00(IgReactMediaPickerNativeModule.HEIGHT);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C360278eK r0 = C360278eK.A00;
        return new C255463uA[]{r0, r0, r0, r0};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Bounds bounds = (Bounds) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, bounds);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.AS3(r3, 0, bounds.A02);
        ADJ.AS3(r3, A1U ? 1 : 0, bounds.A03);
        ADJ.AS3(r3, 2, bounds.A01);
        ADJ.AS3(r3, 3, bounds.A00);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
