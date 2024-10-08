package com.facebook.odin.model;

import X.0qQ;
import X.C16705V2i;
import X.C20799WzB;
import X.C255453u9;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.C2590240b;
import X.VKO;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class ExampleContext$$serializer implements C255533uI {
    public static final ExampleContext$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    public final ExampleContext deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = ExampleContext.A06;
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
                return new ExampleContext(type, str, map, map2, map3, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                type = (Type) ADI.AO5(type, r9[1], serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                map = (Map) ADI.AO5(map, r9[2], serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                map2 = (Map) ADI.AO5(map2, r9[3], serialDescriptor, 3);
                i |= 8;
            } else if (ANp == 4) {
                map3 = (Map) ADI.AO5(map3, r9[4], serialDescriptor, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (X.0qQ.A0K(r10.A03, new java.util.LinkedHashMap()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r3.AS8(r10.A03, r6[2], r2, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0049, code lost:
        if (r5 != false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (X.0qQ.A0K(r10.A02, new java.util.LinkedHashMap()) != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r3.AS8(r10.A02, r6[3], r2, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (r5 != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        if (X.0qQ.A0K(r10.A04, new java.util.LinkedHashMap()) != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        r3.AS8(r10.A04, r6[4], r2, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r3.AST(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        if (r10.A00 != com.facebook.odin.model.Type.SERVER_CONTEXT) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r5 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r3.AS8(r10.A00, r6[1], r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r5 != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.odin.model.ExampleContext r10) {
        /*
            r8 = this;
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r4 = 1
            X.0qQ.A0B(r10, r4)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = descriptor
            X.484 r3 = r9.ADJ(r2)
            X.3uA[] r6 = com.facebook.odin.model.ExampleContext.A06
            r0 = r3
            X.487 r0 = (X.AnonymousClass487) r0
            X.40P r0 = r0.A04
            boolean r5 = r0.A09
            if (r5 != 0) goto L_0x0023
            java.lang.String r1 = r10.A01
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007a
        L_0x0023:
            java.lang.String r0 = r10.A01
            r3.ASC(r0, r2, r7)
            if (r5 == 0) goto L_0x007a
        L_0x002a:
            r1 = r6[r4]
            com.facebook.odin.model.Type r0 = r10.A00
            r3.AS8(r0, r1, r2, r4)
        L_0x0031:
            r4 = 2
            if (r5 != 0) goto L_0x0041
            java.util.Map r1 = r10.A03
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0041:
            r1 = r6[r4]
            java.util.Map r0 = r10.A03
            r3.AS8(r0, r1, r2, r4)
        L_0x0048:
            r4 = 3
            if (r5 != 0) goto L_0x0058
            java.util.Map r1 = r10.A02
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x005f
        L_0x0058:
            r1 = r6[r4]
            java.util.Map r0 = r10.A02
            r3.AS8(r0, r1, r2, r4)
        L_0x005f:
            r4 = 4
            if (r5 != 0) goto L_0x006f
            java.util.Map r1 = r10.A04
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0076
        L_0x006f:
            r1 = r6[r4]
            java.util.Map r0 = r10.A04
            r3.AS8(r0, r1, r2, r4)
        L_0x0076:
            r3.AST(r2)
            return
        L_0x007a:
            com.facebook.odin.model.Type r1 = r10.A00
            com.facebook.odin.model.Type r0 = com.facebook.odin.model.Type.SERVER_CONTEXT
            if (r1 == r0) goto L_0x0031
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.model.ExampleContext$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.odin.model.ExampleContext):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.odin.model.ExampleContext$$serializer, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        INSTANCE = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.odin.model.ExampleContext", obj, 5);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, true);
        r2.A01("longMap", true);
        r2.A01("doubleMap", true);
        r2.A01("stringMap", true);
        descriptor = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r5 = ExampleContext.A06;
        return new C255463uA[]{C255453u9.A01, r5[1], r5[2], r5[3], r5[4]};
    }

    public C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
