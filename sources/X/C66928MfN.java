package X;

import com.instagram.newsfeed.ui.InlineLinkUrn;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.MfN  reason: case insensitive filesystem */
public final /* synthetic */ class C66928MfN implements C255533uI {
    public static final C66928MfN A00;
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
                return new InlineLinkUrn(str, str2, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MfN, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.instagram.newsfeed.ui.InlineLinkUrn", obj, 2);
        r1.A00("text");
        r1.A00("url");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{r0, r0};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        InlineLinkUrn inlineLinkUrn = (InlineLinkUrn) obj;
        0qQ.A0B(encoder, 0);
        0qQ.A0B(inlineLinkUrn, 1);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(inlineLinkUrn.A01, serialDescriptor, 0);
        ADJ.ASC(inlineLinkUrn.A02, serialDescriptor, 1);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
