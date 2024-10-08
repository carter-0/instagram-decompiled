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
import java.util.HashMap;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Example$$serializer implements C255533uI {
    public static final Example$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    public final Example deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r8 = Example.A04;
        String str = null;
        ExampleContext exampleContext = null;
        HashMap hashMap = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Example(exampleContext, str, hashMap, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                exampleContext = (ExampleContext) ADI.AO5(exampleContext, ExampleContext$$serializer.INSTANCE, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                hashMap = (HashMap) ADI.AO5(hashMap, r8[2], serialDescriptor, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (X.0qQ.A0K(r10.A02, new java.util.HashMap()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r4.AS8(r10.A02, r6[2], r3, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0048, code lost:
        r4.AST(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (X.0qQ.A0K(r10.A00, com.facebook.odin.model.ExampleContext.A05) == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r5 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        r4.AS8(r10.A00, com.facebook.odin.model.ExampleContext$$serializer.INSTANCE, r3, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
        if (r5 != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void serialize(kotlinx.serialization.encoding.Encoder r9, com.facebook.odin.model.Example r10) {
        /*
            r8 = this;
            r7 = 0
            X.0qQ.A0B(r9, r7)
            r2 = 1
            X.0qQ.A0B(r10, r2)
            kotlinx.serialization.descriptors.SerialDescriptor r3 = descriptor
            X.484 r4 = r9.ADJ(r3)
            X.3uA[] r6 = com.facebook.odin.model.Example.A04
            r0 = r4
            X.487 r0 = (X.AnonymousClass487) r0
            X.40P r0 = r0.A04
            boolean r5 = r0.A09
            if (r5 != 0) goto L_0x0023
            java.lang.String r1 = r10.A01
            java.lang.String r0 = "identity"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004c
        L_0x0023:
            java.lang.String r0 = r10.A01
            r4.ASC(r0, r3, r7)
            if (r5 == 0) goto L_0x004c
        L_0x002a:
            com.facebook.odin.model.ExampleContext$$serializer r1 = com.facebook.odin.model.ExampleContext$$serializer.INSTANCE
            com.facebook.odin.model.ExampleContext r0 = r10.A00
            r4.AS8(r0, r1, r3, r2)
        L_0x0031:
            r2 = 2
            if (r5 != 0) goto L_0x0041
            java.util.HashMap r1 = r10.A02
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0041:
            r1 = r6[r2]
            java.util.HashMap r0 = r10.A02
            r4.AS8(r0, r1, r3, r2)
        L_0x0048:
            r4.AST(r3)
            return
        L_0x004c:
            com.facebook.odin.model.ExampleContext r1 = r10.A00
            com.facebook.odin.model.ExampleContext r0 = com.facebook.odin.model.ExampleContext.A05
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0031
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.model.Example$$serializer.serialize(kotlinx.serialization.encoding.Encoder, com.facebook.odin.model.Example):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.odin.model.Example$$serializer, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        INSTANCE = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.odin.model.Example", obj, 3);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, true);
        r2.A01("exampleContext", true);
        r2.A01("features", true);
        descriptor = r2;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, ExampleContext$$serializer.INSTANCE, Example.A04[2]};
    }

    public C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
