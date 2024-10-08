package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.HashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsp  reason: case insensitive filesystem */
public final /* synthetic */ class C20509Wsp implements C255533uI {
    public static final C20509Wsp A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r8 = IgSignalsModelPrediction.A07;
        Map map = null;
        long j = 0;
        String str = null;
        C18751Vzm vzm = null;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        long j2 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new IgSignalsModelPrediction(vzm, str, map, d, i, j2, j, z);
                case 0:
                    d = ADI.ANo(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) C13988Tno.A0W(map, serialDescriptor, ADI, r8, 1);
                    i |= 2;
                    break;
                case 2:
                    z = ADI.ANi(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = C13990Tnq.A0b(str, serialDescriptor, ADI, 3);
                    i |= 8;
                    break;
                case 4:
                    vzm = (C18751Vzm) ADI.AO4(vzm, C20510Wsq.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    j2 = ADI.AO2(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j = ADI.AO2(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wsp, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.igsignals.core.IgSignalsModelPrediction", obj, 7);
        r2.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        r2.A01("probabilities", true);
        r2.A01("isSuccess", true);
        r2.A01("error", true);
        r2.A01("predictorMetadata", true);
        r2.A01("startTime", true);
        r2.A01("endTime", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = IgSignalsModelPrediction.A07;
        C258703zV r2 = C258703zV.A00;
        C255463uA r3 = r1[1];
        AnonymousClass40E r4 = AnonymousClass40E.A00;
        C255463uA A002 = C360578eo.A00(C255453u9.A01);
        C255463uA A003 = C360578eo.A00(C20510Wsq.A00);
        C258663zR r7 = C258663zR.A00;
        return new C255463uA[]{r2, r3, r4, A002, A003, r7, r7};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsModelPrediction igSignalsModelPrediction = (IgSignalsModelPrediction) obj;
        char A1U = AnonymousClass7TF.A1U(0, encoder, igSignalsModelPrediction);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r7 = IgSignalsModelPrediction.A07;
        if (ADJ.EsA(serialDescriptor, 0) || Double.compare(igSignalsModelPrediction.A03, -1.0d) != 0) {
            ADJ.ARx(serialDescriptor, igSignalsModelPrediction.A03, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U) || !0qQ.A0K(igSignalsModelPrediction.A05, new HashMap())) {
            ADJ.AS8(igSignalsModelPrediction.A05, r7[A1U], serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || igSignalsModelPrediction.A06 != A1U) {
            ADJ.ARt(serialDescriptor, 2, igSignalsModelPrediction.A06);
        }
        if (ADJ.EsA(serialDescriptor, 3) || igSignalsModelPrediction.A04 != null) {
            ADJ.AS7(igSignalsModelPrediction.A04, C255453u9.A01, serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || igSignalsModelPrediction.A02 != null) {
            ADJ.AS7(igSignalsModelPrediction.A02, C20510Wsq.A00, serialDescriptor, 4);
        }
        if (ADJ.EsA(serialDescriptor, 5) || igSignalsModelPrediction.A01 != -1) {
            ADJ.AS5(serialDescriptor, 5, igSignalsModelPrediction.A01);
        }
        if (ADJ.EsA(serialDescriptor, 6) || igSignalsModelPrediction.A00 != -1) {
            ADJ.AS5(serialDescriptor, 6, igSignalsModelPrediction.A00);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
