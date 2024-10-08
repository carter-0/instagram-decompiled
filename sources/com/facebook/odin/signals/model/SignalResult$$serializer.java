package com.facebook.odin.signals.model;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass484;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C13990Tnq;
import X.C16705V2i;
import X.C20799WzB;
import X.C255453u9;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.C258663zR;
import X.C2590240b;
import X.C360578eo;
import X.VKO;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.model.OdinContext;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class SignalResult$$serializer implements C255533uI {
    public static final SignalResult$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    public final SignalResult deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = SignalResult.A09;
        String str = null;
        String str2 = null;
        Map map = null;
        Map map2 = null;
        OdinContext odinContext = null;
        Map map3 = null;
        long j = 0;
        int i = 0;
        String str3 = null;
        Map map4 = null;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new SignalResult(odinContext, str, str3, str2, map4, map, map2, map3, i, j);
                case 0:
                    str = ADI.AOA(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    map4 = (Map) C13988Tno.A0W(map4, serialDescriptor, ADI, r9, 2);
                    i |= 4;
                    break;
                case 3:
                    map = (Map) C13988Tno.A0W(map, serialDescriptor, ADI, r9, 3);
                    i |= 8;
                    break;
                case 4:
                    map2 = (Map) C13988Tno.A0W(map2, serialDescriptor, ADI, r9, 4);
                    i |= 16;
                    break;
                case 5:
                    map3 = (Map) C13988Tno.A0W(map3, serialDescriptor, ADI, r9, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = C13990Tnq.A0b(str2, serialDescriptor, ADI, 6);
                    i |= 64;
                    break;
                case 7:
                    j = ADI.AO2(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    odinContext = (OdinContext) ADI.AO4(odinContext, r9[8], serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SignalResult signalResult) {
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, signalResult);
        SerialDescriptor serialDescriptor = descriptor;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r9 = SignalResult.A09;
        if (ADJ.EsA(serialDescriptor, 0) || !0qQ.A0K(signalResult.A03, "")) {
            ADJ.ASC(signalResult.A03, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || signalResult.A04 != null) {
            ADJ.AS7(signalResult.A04, C255453u9.A01, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || !0qQ.A0K(signalResult.A06, 0Yt.A0E())) {
            ADJ.AS8(signalResult.A06, r9[2], serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || !0qQ.A0K(signalResult.A05, 0Yt.A0E())) {
            ADJ.AS8(signalResult.A05, r9[3], serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || !0qQ.A0K(signalResult.A08, 0Yt.A0E())) {
            ADJ.AS8(signalResult.A08, r9[4], serialDescriptor, 4);
        }
        if (ADJ.EsA(serialDescriptor, 5) || !0qQ.A0K(signalResult.A07, 0Yt.A0E())) {
            ADJ.AS8(signalResult.A07, r9[5], serialDescriptor, 5);
        }
        if (ADJ.EsA(serialDescriptor, 6) || signalResult.A02 != null) {
            ADJ.AS7(signalResult.A02, C255453u9.A01, serialDescriptor, 6);
        }
        if (ADJ.EsA(serialDescriptor, 7) || signalResult.A00 != 0) {
            ADJ.AS5(serialDescriptor, 7, signalResult.A00);
        }
        if (ADJ.EsA(serialDescriptor, 8) || signalResult.A01 != null) {
            ADJ.AS7(signalResult.A01, r9[8], serialDescriptor, 8);
        }
        ADJ.AST(serialDescriptor);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, com.facebook.odin.signals.model.SignalResult$$serializer] */
    static {
        ? obj = new Object();
        INSTANCE = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.odin.signals.model.SignalResult", obj, 9);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        r2.A01("longs", true);
        r2.A01("floats", true);
        r2.A01("strings", true);
        r2.A01("stringLists", true);
        r2.A01("error", true);
        r2.A01("timestampInMillis", true);
        r2.A01("odinContext", true);
        descriptor = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = SignalResult.A09;
        C255453u9 r2 = C255453u9.A01;
        return new C255463uA[]{r2, C360578eo.A00(r2), r1[2], r1[3], r1[4], r1[5], C360578eo.A00(r2), C258663zR.A00, C360578eo.A00(r1[8])};
    }

    public C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
