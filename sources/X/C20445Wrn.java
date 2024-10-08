package X;

import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wrn  reason: case insensitive filesystem */
public final class C20445Wrn implements C255533uI {
    public static final C20445Wrn A00;
    public static final /* synthetic */ C255543uJ A01;

    public final C255463uA[] childSerializers() {
        return new C255463uA[0];
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r3 = A01;
        C2590240b ADI = decoder.ADI(r3);
        int ANp = ADI.ANp(r3);
        if (ANp == -1) {
            ADI.AST(r3);
            return new Object();
        }
        throw new C20799WzB(ANp);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wrn, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        A01 = new C255543uJ("com.facebook.flipper.plugins.bloksdebugger.ClientState", obj, 0);
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass7TG.A1N(encoder, obj);
        C255543uJ r1 = A01;
        encoder.ADJ(r1).AST(r1);
    }
}
