package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Ws8  reason: case insensitive filesystem */
public final class C20466Ws8 implements C255533uI {
    public static final C20466Ws8 A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r5 = A01;
        C2590240b ADI = decoder2.ADI(r5);
        C255463uA[] r10 = FrameworkEvent.A07;
        Long l = null;
        String str = null;
        Map map = null;
        long j = 0;
        int i = 0;
        int i2 = 0;
        String str2 = null;
        int i3 = 0;
        while (true) {
            int ANp = ADI.ANp(r5);
            switch (ANp) {
                case -1:
                    ADI.AST(r5);
                    return new FrameworkEvent(l, str2, str, map, i3, i, i2, j);
                case 0:
                    i = ADI.ANz(r5, 0);
                    i3 |= 1;
                    break;
                case 1:
                    i2 = ADI.ANz(r5, 1);
                    i3 |= 2;
                    break;
                case 2:
                    str2 = ADI.AOA(r5, 2);
                    i3 |= 4;
                    break;
                case 3:
                    j = ADI.AO2(r5, 3);
                    i3 |= 8;
                    break;
                case 4:
                    l = (Long) ADI.AO4(l, C258663zR.A00, r5, 4);
                    i3 |= 16;
                    break;
                case 5:
                    str = ADI.AOA(r5, 5);
                    i3 |= 32;
                    break;
                case 6:
                    map = (Map) C13988Tno.A0W(map, r5, ADI, r10, 6);
                    i3 |= 64;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Ws8, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.uidebugger.model.FrameworkEvent", obj, 7);
        r1.A00("treeId");
        r1.A00("nodeId");
        r1.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r1.A00("timestamp");
        r1.A00(TraceFieldType.Duration);
        r1.A00("thread");
        r1.A00("payload");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = FrameworkEvent.A07;
        C360278eK r2 = C360278eK.A00;
        C255453u9 r4 = C255453u9.A01;
        C258663zR r5 = C258663zR.A00;
        return new C255463uA[]{r2, r2, r4, r5, C360578eo.A00(r5), r4, r1[6]};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FrameworkEvent frameworkEvent = (FrameworkEvent) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, frameworkEvent);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r5 = FrameworkEvent.A07;
        ADJ.AS3(r3, 0, frameworkEvent.A01);
        ADJ.AS3(r3, A1U ? 1 : 0, frameworkEvent.A00);
        ADJ.ASC(frameworkEvent.A05, r3, 2);
        ADJ.AS5(r3, 3, frameworkEvent.A02);
        ADJ.AS7(frameworkEvent.A03, C258663zR.A00, r3, 4);
        ADJ.ASC(frameworkEvent.A04, r3, 5);
        ADJ.AS8(frameworkEvent.A06, r5[6], r3, 6);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
