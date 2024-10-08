package X;

import com.facebook.flipper.plugins.uidebugger.model.PerfStatsEvent;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsQ  reason: case insensitive filesystem */
public final class C20484WsQ implements C255533uI {
    public static final C20484WsQ A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r0 = A01;
        C2590240b ADI = decoder2.ADI(r0);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int ANp = ADI.ANp(r0);
            switch (ANp) {
                case -1:
                    ADI.AST(r0);
                    return new PerfStatsEvent(i, i2, i5, i4, i3, j4, j5, j6, j2, j7, j, j3, j8);
                case 0:
                    j4 = ADI.AO2(r0, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = ADI.ANz(r0, 1);
                    i |= 2;
                    break;
                case 2:
                    i5 = ADI.ANz(r0, 2);
                    i |= 4;
                    break;
                case 3:
                    j5 = ADI.AO2(r0, 3);
                    i |= 8;
                    break;
                case 4:
                    j6 = ADI.AO2(r0, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ADI.AO2(r0, 5);
                    i |= 32;
                    break;
                case 6:
                    j7 = ADI.AO2(r0, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ADI.AO2(r0, 7);
                    i |= 128;
                    break;
                case 8:
                    j3 = ADI.AO2(r0, 8);
                    i |= 256;
                    break;
                case 9:
                    j8 = ADI.AO2(r0, 9);
                    i |= 512;
                    break;
                case 10:
                    i4 = ADI.ANz(r0, 10);
                    i |= 1024;
                    break;
                case 11:
                    i3 = ADI.ANz(r0, 11);
                    i |= C249703kE.FLAG_MOVED;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WsQ, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.uidebugger.model.PerfStatsEvent", obj, 12);
        r1.A00("txId");
        r1.A00("nodesCount");
        r1.A00("frameworkEventsCount");
        r1.A00("start");
        r1.A00("traversalMS");
        r1.A00("snapshotMS");
        r1.A00("queuingMS");
        r1.A00("deferredComputationMS");
        r1.A00("serializationMS");
        r1.A00("socketMS");
        r1.A00("payloadSize");
        r1.A00("snapshotSize");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C258663zR r0 = C258663zR.A00;
        C360278eK r1 = C360278eK.A00;
        return new C255463uA[]{r0, r1, r1, r0, r0, r0, r0, r0, r0, r0, r1, r1};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        PerfStatsEvent perfStatsEvent = (PerfStatsEvent) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, perfStatsEvent);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        ADJ.AS5(r3, 0, perfStatsEvent.A0B);
        ADJ.AS3(r3, A1U ? 1 : 0, perfStatsEvent.A01);
        ADJ.AS3(r3, 2, perfStatsEvent.A00);
        ADJ.AS5(r3, 3, perfStatsEvent.A09);
        ADJ.AS5(r3, 4, perfStatsEvent.A0A);
        ADJ.AS5(r3, 5, perfStatsEvent.A07);
        ADJ.AS5(r3, 6, perfStatsEvent.A05);
        ADJ.AS5(r3, 7, perfStatsEvent.A04);
        ADJ.AS5(r3, 8, perfStatsEvent.A06);
        ADJ.AS5(r3, 9, perfStatsEvent.A08);
        ADJ.AS3(r3, 10, perfStatsEvent.A02);
        ADJ.AS3(r3, 11, perfStatsEvent.A03);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
