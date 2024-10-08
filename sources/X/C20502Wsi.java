package X;

import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsi  reason: case insensitive filesystem */
public final /* synthetic */ class C20502Wsi implements C255533uI {
    public static final C20502Wsi A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r11 = DynamicNNModelParams.A08;
        List list = null;
        List list2 = null;
        int[] iArr = null;
        List list3 = null;
        float[] fArr = null;
        float[] fArr2 = null;
        float[] fArr3 = null;
        String str = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new DynamicNNModelParams(str, list, list3, list2, fArr2, fArr3, fArr, iArr, i);
                case 0:
                    list = (List) C13988Tno.A0W(list, serialDescriptor, ADI, r11, 0);
                    i |= 1;
                    break;
                case 1:
                    fArr2 = (float[]) ADI.AO5(fArr2, C2591940t.A00, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    fArr3 = (float[]) ADI.AO5(fArr3, C2591940t.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str = ADI.AOA(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    fArr = (float[]) ADI.AO5(fArr, C2591940t.A00, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list3 = (List) C13988Tno.A0W(list3, serialDescriptor, ADI, r11, 5);
                    i |= 32;
                    break;
                case 6:
                    iArr = (int[]) ADI.AO5(iArr, C360298eM.A00, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    list2 = C13988Tno.A0j(list2, serialDescriptor, ADI, r11, 7);
                    i |= 128;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wsi, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams", obj, 8);
        r1.A00("featureIdList");
        r1.A00("meanVal");
        r1.A00("stdVal");
        r1.A00("normType");
        r1.A00("valRange");
        r1.A00("weights");
        r1.A00("networkArch");
        r1.A00("modelArch");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = DynamicNNModelParams.A08;
        C255463uA r2 = r1[0];
        C2591940t r3 = C2591940t.A00;
        return new C255463uA[]{r2, r3, r3, C255453u9.A01, r3, r1[5], C360298eM.A00, r1[7]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        DynamicNNModelParams dynamicNNModelParams = (DynamicNNModelParams) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, dynamicNNModelParams);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = DynamicNNModelParams.A08;
        ADJ.AS8(dynamicNNModelParams.A01, r5[0], serialDescriptor, 0);
        C2591940t r2 = C2591940t.A00;
        ADJ.AS8(dynamicNNModelParams.A04, r2, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS8(dynamicNNModelParams.A05, r2, serialDescriptor, 2);
        ADJ.ASC(dynamicNNModelParams.A00, serialDescriptor, 3);
        ADJ.AS8(dynamicNNModelParams.A06, r2, serialDescriptor, 4);
        ADJ.AS8(dynamicNNModelParams.A03, r5[5], serialDescriptor, 5);
        ADJ.AS8(dynamicNNModelParams.A07, C360298eM.A00, serialDescriptor, 6);
        ADJ.AS8(dynamicNNModelParams.A02, r5[7], serialDescriptor, 7);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
