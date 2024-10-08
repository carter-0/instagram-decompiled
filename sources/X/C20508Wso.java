package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.igsignals.core.IgSignalsFeature;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wso  reason: case insensitive filesystem */
public final /* synthetic */ class C20508Wso implements C255533uI {
    public static final C20508Wso A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new IgSignalsFeature(i, i2, str, d);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                i2 = ADI.ANz(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                d = ADI.ANo(serialDescriptor, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wso, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.instagram.igsignals.core.IgSignalsFeature", obj);
        A0l.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A0l.A00("identifier");
        A0l.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C255453u9.A01, C360278eK.A00, C258703zV.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        IgSignalsFeature igSignalsFeature = (IgSignalsFeature) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, igSignalsFeature);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(igSignalsFeature.A02, serialDescriptor, 0);
        ADJ.AS3(serialDescriptor, A1U ? 1 : 0, igSignalsFeature.A01);
        ADJ.ARx(serialDescriptor, igSignalsFeature.A00, 2);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
