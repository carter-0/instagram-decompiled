package X;

import com.instagram.igsignals.core.IgSignalsExampleData;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsn  reason: case insensitive filesystem */
public final /* synthetic */ class C20507Wsn implements C255533uI {
    public static final C20507Wsn A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r3 = IgSignalsExampleData.A06;
        String str = null;
        long j = 0;
        int i = 0;
        List list = null;
        double d = 0.0d;
        List list2 = null;
        List list3 = null;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new IgSignalsExampleData(str, list2, list3, list, d, i, j);
                case 0:
                    str = ADI.AOA(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    d = ADI.ANo(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    list2 = (List) C13988Tno.A0W(list2, serialDescriptor, ADI, r3, 2);
                    i |= 4;
                    break;
                case 3:
                    j = ADI.AO2(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) ADI.AO4(list3, r3[4], serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    list = (List) C13988Tno.A0W(list, serialDescriptor, ADI, r3, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wsn, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.instagram.igsignals.core.IgSignalsExampleData", obj, 6);
        r1.A00("identifier");
        r1.A00("version");
        r1.A00("features");
        r1.A00("timestamp");
        r1.A00("labels");
        r1.A00("predictions");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = IgSignalsExampleData.A06;
        return new C255463uA[]{C255453u9.A01, C258703zV.A00, r1[2], C258663zR.A00, C360578eo.A00(r1[4]), r1[5]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsExampleData igSignalsExampleData = (IgSignalsExampleData) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, igSignalsExampleData);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r5 = IgSignalsExampleData.A06;
        ADJ.ASC(igSignalsExampleData.A02, serialDescriptor, 0);
        ADJ.ARx(serialDescriptor, igSignalsExampleData.A00, A1U ? 1 : 0);
        ADJ.AS8(igSignalsExampleData.A03, r5[2], serialDescriptor, 2);
        ADJ.AS5(serialDescriptor, 3, igSignalsExampleData.A01);
        ADJ.AS7(igSignalsExampleData.A04, r5[4], serialDescriptor, 4);
        ADJ.AS8(igSignalsExampleData.A05, r5[5], serialDescriptor, 5);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
