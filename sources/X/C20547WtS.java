package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.WtS  reason: case insensitive filesystem */
public final /* synthetic */ class C20547WtS implements C255533uI {
    public static final C20547WtS A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        Long l = null;
        String str2 = null;
        Long l2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new C15052ULt(l, l2, str2, str, i, z2, z3, z);
                case 0:
                    l = (Long) ADI.AO4(l, C258663zR.A00, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = ADI.AOA(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    l2 = (Long) ADI.AO4(l2, C258663zR.A00, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = ADI.ANi(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = ADI.ANi(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z = ADI.ANi(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str = ADI.AOA(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.WtS] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("X.ULt", obj, 7);
        r2.A01("dwell", true);
        r2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r2.A01("videoDuration", true);
        r2.A01("isMultiAd", true);
        r2.A01("isCarouselAd", true);
        r2.A01("isMMC", true);
        r2.A00("clipType");
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C258663zR r0 = C258663zR.A00;
        C255463uA A002 = C360578eo.A00(r0);
        C255453u9 r2 = C255453u9.A01;
        C255463uA A003 = C360578eo.A00(r0);
        AnonymousClass40E r4 = AnonymousClass40E.A00;
        return new C255463uA[]{A002, r2, A003, r4, r4, r4, r2};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        C15052ULt uLt = (C15052ULt) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, uLt);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        if (ADJ.EsA(serialDescriptor, 0) || uLt.A00 != null) {
            ADJ.AS7(uLt.A00, C258663zR.A00, serialDescriptor, 0);
        }
        ADJ.ASC(uLt.A03, serialDescriptor, A1U ? 1 : 0);
        if (ADJ.EsA(serialDescriptor, 2) || uLt.A01 != null) {
            ADJ.AS7(uLt.A01, C258663zR.A00, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || uLt.A06) {
            ADJ.ARt(serialDescriptor, 3, uLt.A06);
        }
        if (ADJ.EsA(serialDescriptor, 4) || uLt.A04) {
            ADJ.ARt(serialDescriptor, 4, uLt.A04);
        }
        if (ADJ.EsA(serialDescriptor, 5) || uLt.A05) {
            ADJ.ARt(serialDescriptor, 5, uLt.A05);
        }
        ADJ.ASC(uLt.A02, serialDescriptor, 6);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
