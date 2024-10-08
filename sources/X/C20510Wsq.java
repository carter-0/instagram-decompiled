package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsq  reason: case insensitive filesystem */
public final /* synthetic */ class C20510Wsq implements C255533uI {
    public static final C20510Wsq A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        long j = 0;
        int i = 0;
        String str2 = null;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new C18751Vzm(i, str, str2, j);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                j = ADI.AO2(serialDescriptor, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsq, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.instagram.igsignals.core.IgSignalsPredictor.Metadata", obj);
        A0l.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A0l.A00("modelName");
        A0l.A00("modelVersion");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{r1, r1, C258663zR.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C18751Vzm vzm = (C18751Vzm) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, vzm);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(vzm.A02, serialDescriptor, 0);
        ADJ.ASC(vzm.A01, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS5(serialDescriptor, 2, vzm.A00);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
