package X;

import com.facebook.flipper.plugins.uidebugger.model.Snapshot;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsS  reason: case insensitive filesystem */
public final class C20486WsS implements C255533uI {
    public static final C20486WsS A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder.ADI(r7);
        String str = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            if (ANp == -1) {
                ADI.AST(r7);
                return new Snapshot(str, i2, i);
            } else if (ANp == 0) {
                i = ADI.ANz(r7, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(r7, 1);
                i2 |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.WsS] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.facebook.flipper.plugins.uidebugger.model.Snapshot", obj);
        A0k.A00("nodeId");
        A0k.A00("data");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360278eK.A00, C255453u9.A01};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Snapshot snapshot = (Snapshot) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, snapshot);
        C255543uJ r2 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r2);
        ADJ.AS3(r2, 0, snapshot.A00);
        ADJ.ASC(snapshot.A01, r2, A1U ? 1 : 0);
        ADJ.AST(r2);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
