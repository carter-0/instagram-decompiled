package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata;
import java.util.List;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wst  reason: case insensitive filesystem */
public final /* synthetic */ class C20513Wst implements C255533uI {
    public static final C20513Wst A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r4 = IgBgFetchMetadata.A03;
        List list = null;
        long j = 0;
        List list2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IgBgFetchMetadata(list, list2, i, j);
            } else if (ANp == 0) {
                j = ADI.AO2(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                list = C13988Tno.A0j(list, serialDescriptor, ADI, r4, 1);
                i |= 2;
            } else if (ANp == 2) {
                list2 = C13988Tno.A0j(list2, serialDescriptor, ADI, r4, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wst, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.instagram.jobscheduler.bgfetch.IgBgFetchMetadata", obj);
        A0l.A00("backgroundedTimestamp");
        A0l.A00("completedRuns");
        A0l.A00("pendingJobs");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r3 = IgBgFetchMetadata.A03;
        return new C255463uA[]{C258663zR.A00, r3[1], r3[2]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchMetadata igBgFetchMetadata = (IgBgFetchMetadata) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, igBgFetchMetadata);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r3 = IgBgFetchMetadata.A03;
        ADJ.AS5(serialDescriptor, 0, igBgFetchMetadata.A00);
        ADJ.AS8(igBgFetchMetadata.A01, r3[A1U], serialDescriptor, A1U);
        ADJ.AS8(igBgFetchMetadata.A02, r3[2], serialDescriptor, 2);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
