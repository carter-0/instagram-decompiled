package X;

import com.facebook.flipper.plugins.uidebugger.model.MetadataUpdateEvent;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.PeN  reason: case insensitive filesystem */
public final class C73531PeN implements C255533uI {
    public static final C73531PeN A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        C255463uA[] r4 = MetadataUpdateEvent.A01;
        Map map = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new MetadataUpdateEvent(map, i);
            } else if (ANp == 0) {
                map = (Map) ADI.AO5(map, r4[0], r6, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.PeN] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.uidebugger.model.MetadataUpdateEvent", obj, 1);
        r1.A01("attributeMetadata", true);
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{MetadataUpdateEvent.A01[0]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        MetadataUpdateEvent metadataUpdateEvent = (MetadataUpdateEvent) obj;
        AnonymousClass7TG.A1N(encoder, metadataUpdateEvent);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C255463uA[] r3 = MetadataUpdateEvent.A01;
        if (ADJ.EsA(r5, 0) || !0qQ.A0K(metadataUpdateEvent.A00, 0Yt.A0E())) {
            ADJ.AS8(metadataUpdateEvent.A00, r3[0], r5, 0);
        }
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
