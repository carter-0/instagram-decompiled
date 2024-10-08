package X;

import com.facebook.neko.directinstall.digitalturbine.InstallationProgress;
import com.facebook.neko.directinstall.digitalturbine.InstallationProgressData;
import com.facebook.react.modules.intent.IntentModule;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.Wsh  reason: case insensitive filesystem */
public final class C20501Wsh implements C255533uI {
    public static final C20501Wsh A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r6 = A01;
        C2590240b ADI = decoder.ADI(r6);
        InstallationProgress installationProgress = null;
        String str = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r6);
            if (ANp == -1) {
                ADI.AST(r6);
                return new InstallationProgressData(installationProgress, str, d, i2, i);
            } else if (ANp == 0) {
                installationProgress = (InstallationProgress) ADI.AO5(installationProgress, C20500Wsg.A00, r6, 0);
                i2 |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(r6, 1);
                i2 |= 2;
            } else if (ANp == 2) {
                d = ADI.ANo(r6, 2);
                i2 |= 4;
            } else if (ANp == 3) {
                i = ADI.ANz(r6, 3);
                i2 |= 8;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsh, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0m = C13988Tno.A0m("com.facebook.neko.directinstall.digitalturbine.InstallationProgressData", obj);
        A0m.A00("data");
        A0m.A00("taskId");
        A0m.A01(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, true);
        A0m.A01("action", true);
        A01 = A0m;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C20500Wsg.A00, C255453u9.A01, C258703zV.A00, C360278eK.A00};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InstallationProgressData installationProgressData = (InstallationProgressData) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, installationProgressData);
        C255543uJ r5 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r5);
        C20500Wsg wsg = C20500Wsg.A00;
        InstallationProgress installationProgress = installationProgressData.A02;
        ADJ.AS8(installationProgress, wsg, r5, 0);
        ADJ.ASC(installationProgressData.A03, r5, A1U ? 1 : 0);
        if (ADJ.EsA(r5, 2) || Double.compare(installationProgressData.A00, installationProgress.A00.A00) != 0) {
            ADJ.ARx(r5, installationProgressData.A00, 2);
        }
        if (ADJ.EsA(r5, 3) || installationProgressData.A01 != installationProgress.A00.A01) {
            ADJ.AS3(r5, 3, installationProgressData.A01);
        }
        ADJ.AST(r5);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
