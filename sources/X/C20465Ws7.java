package X;

import com.facebook.flipper.plugins.uidebugger.model.FrameScanEvent;
import com.facebook.flipper.plugins.uidebugger.model.Snapshot;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws7  reason: case insensitive filesystem */
public final class C20465Ws7 implements C255533uI {
    public static final C20465Ws7 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder2.ADI(r6);
        C255463uA[] r4 = FrameScanEvent.A04;
        List list = null;
        long j = 0;
        Snapshot snapshot = null;
        List list2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new FrameScanEvent(snapshot, list, list2, i, j);
            } else if (ANp == 0) {
                j = ADI.AO2(r6, 0);
                i |= 1;
            } else if (ANp == 1) {
                list = C13988Tno.A0j(list, r6, ADI, r4, 1);
                i |= 2;
            } else if (ANp == 2) {
                snapshot = (Snapshot) ADI.AO4(snapshot, C20486WsS.A00, r6, 2);
                i |= 4;
            } else if (ANp == 3) {
                list2 = (List) ADI.AO4(list2, r4[3], r6, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Ws7, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.flipper.plugins.uidebugger.model.FrameScanEvent", obj);
        A0m.A00("frameTime");
        A0m.A00("nodes");
        A0m.A00("snapshot");
        A0m.A00("frameworkEvents");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r4 = FrameScanEvent.A04;
        return new C255463uA[]{C258663zR.A00, r4[1], C360578eo.A00(C20486WsS.A00), C360578eo.A00(r4[3])};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FrameScanEvent frameScanEvent = (FrameScanEvent) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, frameScanEvent);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C255463uA[] r3 = FrameScanEvent.A04;
        ADJ.AS5(r5, 0, frameScanEvent.A00);
        ADJ.AS8(frameScanEvent.A03, r3[A1U], r5, A1U);
        ADJ.AS7(frameScanEvent.A01, C20486WsS.A00, r5, 2);
        ADJ.AS7(frameScanEvent.A02, r3[3], r5, 3);
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
