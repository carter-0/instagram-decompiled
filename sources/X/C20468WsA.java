package X;

import com.facebook.flipper.plugins.uidebugger.model.InitEvent;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsA  reason: case insensitive filesystem */
public final class C20468WsA implements C255533uI {
    public static final C20468WsA A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r10 = A01;
        C2590240b ADI = decoder.ADI(r10);
        C255463uA[] r8 = InitEvent.A03;
        List list = null;
        List list2 = null;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r10);
            if (ANp == -1) {
                ADI.AST(r10);
                return new InitEvent(list, list2, i2, i);
            } else if (ANp == 0) {
                i = ADI.ANz(r10, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                list = C13988Tno.A0j(list, r10, ADI, r8, 1);
                i2 |= 2;
            } else if (ANp == 2) {
                list2 = C13988Tno.A0j(list2, r10, ADI, r8, 2);
                i2 |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WsA, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.facebook.flipper.plugins.uidebugger.model.InitEvent", obj);
        A0l.A00("rootId");
        A0l.A00("frameworkEventMetadata");
        A0l.A00("customActionGroups");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r3 = InitEvent.A03;
        return new C255463uA[]{C360278eK.A00, r3[1], r3[2]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InitEvent initEvent = (InitEvent) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, initEvent);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C255463uA[] r3 = InitEvent.A03;
        ADJ.AS3(r5, 0, initEvent.A00);
        ADJ.AS8(initEvent.A02, r3[A1U], r5, A1U);
        ADJ.AS8(initEvent.A01, r3[2], r5, 2);
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
