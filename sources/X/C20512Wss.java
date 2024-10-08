package X;

import com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wss  reason: case insensitive filesystem */
public final /* synthetic */ class C20512Wss implements C255533uI {
    public static final C20512Wss A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IgBgFetchJobRun(i2, i, j2, j3, j);
            } else if (ANp == 0) {
                i = ADI.ANz(serialDescriptor, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                j2 = ADI.AO2(serialDescriptor, 1);
                i2 |= 2;
            } else if (ANp == 2) {
                j3 = ADI.AO2(serialDescriptor, 2);
                i2 |= 4;
            } else if (ANp == 3) {
                j = ADI.AO2(serialDescriptor, 3);
                i2 |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.3uI, X.Wss] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.instagram.jobscheduler.bgfetch.IgBgFetchJobRun", obj);
        A0m.A00("jobId");
        A0m.A00("timeScheduled");
        A0m.A01("timeStarted", true);
        A0m.A01("timeCompleted", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        C360278eK r1 = C360278eK.A00;
        C258663zR r0 = C258663zR.A00;
        return new C255463uA[]{r1, r0, r0, r0};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgBgFetchJobRun igBgFetchJobRun = (IgBgFetchJobRun) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, igBgFetchJobRun);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS3(serialDescriptor, 0, igBgFetchJobRun.A02);
        ADJ.AS5(serialDescriptor, A1U ? 1 : 0, igBgFetchJobRun.A03);
        if (ADJ.EsA(serialDescriptor, 2) || igBgFetchJobRun.A01 != -1) {
            ADJ.AS5(serialDescriptor, 2, igBgFetchJobRun.A01);
        }
        if (ADJ.EsA(serialDescriptor, 3) || igBgFetchJobRun.A00 != -1) {
            ADJ.AS5(serialDescriptor, 3, igBgFetchJobRun.A00);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
