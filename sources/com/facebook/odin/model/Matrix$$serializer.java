package com.facebook.odin.model;

import X.0qQ;
import X.AnonymousClass484;
import X.AnonymousClass7TG;
import X.C13988Tno;
import X.C13990Tnq;
import X.C16705V2i;
import X.C20799WzB;
import X.C255463uA;
import X.C255533uI;
import X.C255543uJ;
import X.C2590240b;
import X.VKO;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
public final /* synthetic */ class Matrix$$serializer implements C255533uI {
    public static final Matrix$$serializer INSTANCE;
    public static final SerialDescriptor descriptor;

    public final Matrix deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = descriptor;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r4 = Matrix.A01;
        float[][] fArr = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new Matrix(fArr, i);
            } else if (ANp == 0) {
                fArr = (float[][]) C13988Tno.A0W(fArr, serialDescriptor, ADI, r4, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.facebook.odin.model.Matrix$$serializer, X.3uI] */
    static {
        ? obj = new Object();
        INSTANCE = obj;
        C255543uJ A0g = C13990Tnq.A0g("com.facebook.odin.model.Matrix", obj);
        A0g.A00("matrixInternal");
        descriptor = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{Matrix.A01[0]};
    }

    public C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }

    public final void serialize(Encoder encoder, Matrix matrix) {
        AnonymousClass7TG.A1N(encoder, matrix);
        SerialDescriptor serialDescriptor = descriptor;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(matrix.A00, Matrix.A01[0], serialDescriptor, 0);
        ADJ.AST(serialDescriptor);
    }
}
