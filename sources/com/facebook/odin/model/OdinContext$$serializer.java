package com.facebook.odin.model;

import X.0qQ;
import X.AnonymousClass484;
import X.AnonymousClass7TF;
import X.C13988Tno;
import X.C16705V2i;
import X.C20799WzB;
import X.C255453u9;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.C2590240b;
import X.VKO;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class OdinContext$$serializer implements C255533uI {
    public static final OdinContext$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    public final OdinContext deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r6 = OdinContext.A06;
        String str = null;
        Type type = null;
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new OdinContext(type, str, map, map2, map3, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                type = (Type) C13988Tno.A0W(type, serialDescriptor, ADI, r6, 1);
                i |= 2;
            } else if (ANp == 2) {
                map = (Map) C13988Tno.A0W(map, serialDescriptor, ADI, r6, 2);
                i |= 4;
            } else if (ANp == 3) {
                map2 = (Map) C13988Tno.A0W(map2, serialDescriptor, ADI, r6, 3);
                i |= 8;
            } else if (ANp == 4) {
                map3 = (Map) C13988Tno.A0W(map3, serialDescriptor, ADI, r6, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, OdinContext odinContext) {
        char A1U = AnonymousClass7TF.A1U(0, encoder, odinContext);
        SerialDescriptor serialDescriptor = descriptor;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = OdinContext.A06;
        if (ADJ.EsA(serialDescriptor, 0) || !0qQ.A0K(odinContext.A01, "")) {
            ADJ.ASC(odinContext.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U) || odinContext.A00 != Type.SERVER_CONTEXT) {
            ADJ.AS8(odinContext.A00, r5[A1U], serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || !0qQ.A0K(odinContext.A03, new LinkedHashMap())) {
            ADJ.AS8(odinContext.A03, r5[2], serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || !0qQ.A0K(odinContext.A02, new LinkedHashMap())) {
            ADJ.AS8(odinContext.A02, r5[3], serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || !0qQ.A0K(odinContext.A04, new LinkedHashMap())) {
            ADJ.AS8(odinContext.A04, r5[4], serialDescriptor, 4);
        }
        ADJ.AST(serialDescriptor);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.odin.model.OdinContext$$serializer, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        INSTANCE = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.odin.model.OdinContext", obj, 5);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r2.A01("longMap", true);
        r2.A01("doubleMap", true);
        r2.A01("stringMap", true);
        descriptor = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r5 = OdinContext.A06;
        return new C255463uA[]{C255453u9.A01, r5[1], r5[2], r5[3], r5[4]};
    }

    public C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
