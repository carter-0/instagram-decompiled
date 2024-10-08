package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsu  reason: case insensitive filesystem */
public final /* synthetic */ class C20514Wsu implements C255533uI {
    public static final C20514Wsu A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        IgBgFetchJob igBgFetchJob = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IgBgFetchPendingJob(igBgFetchJob, i, j);
            } else if (ANp == 0) {
                igBgFetchJob = (IgBgFetchJob) ADI.AO5(igBgFetchJob, C20511Wsr.A00, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                j = ADI.AO2(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wsu] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.instagram.jobscheduler.bgfetch.IgBgFetchPendingJob", obj);
        A0k.A00("job");
        A0k.A00("timeScheduled");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20511Wsr.A00, C258663zR.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchPendingJob igBgFetchPendingJob = (IgBgFetchPendingJob) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, igBgFetchPendingJob);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(igBgFetchPendingJob.A01, C20511Wsr.A00, serialDescriptor, 0);
        ADJ.AS5(serialDescriptor, A1U ? 1 : 0, igBgFetchPendingJob.A00);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
