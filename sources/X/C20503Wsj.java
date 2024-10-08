package X;

import com.facebook.odin.model.Matrix;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsj  reason: case insensitive filesystem */
public final /* synthetic */ class C20503Wsj implements C255533uI {
    public static final C20503Wsj A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r4 = C15049ULf.A04;
        float[] fArr = null;
        float[] fArr2 = null;
        Matrix matrix = null;
        float[] fArr3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new C15049ULf(matrix, fArr, fArr2, fArr3, i);
            } else if (ANp == 0) {
                fArr = (float[]) ADI.AO5(fArr, C2591940t.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                fArr2 = (float[]) ADI.AO5(fArr2, C2591940t.A00, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                matrix = (Matrix) C13988Tno.A0W(matrix, serialDescriptor, ADI, r4, 2);
                i |= 4;
            } else if (ANp == 3) {
                fArr3 = (float[]) ADI.AO5(fArr3, C2591940t.A00, serialDescriptor, 3);
                i |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsj, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams.Layer", obj);
        A0m.A00("batchNormAlpha");
        A0m.A00("batchNormBeta");
        A0m.A00("weights");
        A0m.A00("bias");
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r2 = C15049ULf.A04;
        C2591940t r1 = C2591940t.A00;
        return new C255463uA[]{r1, r1, r2[2], r1};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C15049ULf uLf = (C15049ULf) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, uLf);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r1 = C15049ULf.A04;
        C2591940t r3 = C2591940t.A00;
        ADJ.AS8(uLf.A01, r3, serialDescriptor, 0);
        ADJ.AS8(uLf.A02, r3, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS8(uLf.A00, r1[2], serialDescriptor, 2);
        ADJ.AS8(uLf.A03, r3, serialDescriptor, 3);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
