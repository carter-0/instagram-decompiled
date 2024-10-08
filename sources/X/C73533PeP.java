package X;

import com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeP  reason: case insensitive filesystem */
public final /* synthetic */ class C73533PeP implements C255533uI {
    public static final C73533PeP A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new LauncherBasedSuggestedPrompt(str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.PeP, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.creation.genai.magicmod.data.LauncherBasedSuggestedPrompt", obj, 2);
        r2.A00("text");
        r2.A01("display", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{r1, C360578eo.A00(r1)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LauncherBasedSuggestedPrompt launcherBasedSuggestedPrompt = (LauncherBasedSuggestedPrompt) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, launcherBasedSuggestedPrompt);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(launcherBasedSuggestedPrompt.A01, serialDescriptor, 0);
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || launcherBasedSuggestedPrompt.A00 != null) {
            ADJ.AS7(launcherBasedSuggestedPrompt.A00, C255453u9.A01, serialDescriptor, A1U);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
