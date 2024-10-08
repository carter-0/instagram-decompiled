package X;

import com.instagram.wellbeing.upsells.constants.UnlikeData;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsx  reason: case insensitive filesystem */
public final /* synthetic */ class C20517Wsx implements C255533uI {
    public static final C20517Wsx A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new UnlikeData(i, str, str2, j);
            } else if (ANp == 0) {
                j = ADI.AO2(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsx, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.instagram.wellbeing.upsells.constants.UnlikeData", obj);
        A0l.A00("timestamp");
        A0l.A00("mediaId");
        A0l.A00("authorId");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C258663zR r2 = C258663zR.A00;
        C255453u9 r1 = C255453u9.A01;
        return new C255463uA[]{r2, r1, C360578eo.A00(r1)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        UnlikeData unlikeData = (UnlikeData) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, unlikeData);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS5(serialDescriptor, 0, unlikeData.A00);
        ADJ.ASC(unlikeData.A02, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS7(unlikeData.A01, C255453u9.A01, serialDescriptor, 2);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
