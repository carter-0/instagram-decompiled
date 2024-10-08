package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJob;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsr  reason: case insensitive filesystem */
public final /* synthetic */ class C20511Wsr implements C255533uI {
    public static final C20511Wsr A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IgBgFetchJob(i2, i, j);
            } else if (ANp == 0) {
                i = ADI.ANz(serialDescriptor, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                j = ADI.AO2(serialDescriptor, 1);
                i2 |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wsr] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.instagram.jobscheduler.bgfetch.IgBgFetchJob", obj);
        A0k.A00("jobId");
        A0k.A00("earliestTimeToRun");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C360278eK.A00, C258663zR.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchJob igBgFetchJob = (IgBgFetchJob) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, igBgFetchJob);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS3(serialDescriptor, 0, igBgFetchJob.A00);
        ADJ.AS5(serialDescriptor, A1U ? 1 : 0, igBgFetchJob.A01);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
