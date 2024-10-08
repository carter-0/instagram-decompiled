package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.Metadata;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsO  reason: case insensitive filesystem */
public final class C20482WsO implements C255533uI {
    public static final C20482WsO A00;
    public static final /* synthetic */ C255543uJ A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r7 = A01;
        C2590240b ADI = decoder2.ADI(r7);
        C255463uA[] r11 = Metadata.A09;
        Integer num = null;
        Integer num2 = null;
        Map map = null;
        Set set = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r7);
            switch (ANp) {
                case -1:
                    ADI.AST(r7);
                    return new Metadata(num2, num, str, str2, str3, map, set, i2, i, z);
                case 0:
                    i = ADI.ANz(r7, 0);
                    i2 |= 1;
                    break;
                case 1:
                    str = ADI.AOA(r7, 1);
                    i2 |= 2;
                    break;
                case 2:
                    str2 = ADI.AOA(r7, 2);
                    i2 |= 4;
                    break;
                case 3:
                    str3 = ADI.AOA(r7, 3);
                    i2 |= 8;
                    break;
                case 4:
                    z = ADI.ANi(r7, 4);
                    i2 |= 16;
                    break;
                case 5:
                    set = (Set) ADI.AO4(set, r11[5], r7, 5);
                    i2 |= 32;
                    break;
                case 6:
                    map = (Map) ADI.AO4(map, r11[6], r7, 6);
                    i2 |= 64;
                    break;
                case 7:
                    num2 = (Integer) ADI.AO4(num2, C360278eK.A00, r7, 7);
                    i2 |= 128;
                    break;
                case 8:
                    num = (Integer) ADI.AO4(num, C360278eK.A00, r7, 8);
                    i2 |= 256;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WsO, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.facebook.flipper.plugins.uidebugger.model.Metadata", obj, 9);
        r2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        r2.A00("namespace");
        r2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r2.A00("mutable");
        r2.A01("possibleValues", true);
        r2.A01("customAttributes", true);
        r2.A00("minValue");
        r2.A00("maxValue");
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = Metadata.A09;
        C360278eK r2 = C360278eK.A00;
        C255453u9 r3 = C255453u9.A01;
        return new C255463uA[]{r2, r3, r3, r3, AnonymousClass40E.A00, C360578eo.A00(r1[5]), C360578eo.A00(r1[6]), C360578eo.A00(r2), C360578eo.A00(r2)};
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Metadata metadata = (Metadata) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, metadata);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r5 = Metadata.A09;
        ADJ.AS3(r3, 0, metadata.A00);
        ADJ.ASC(metadata.A05, r3, A1U ? 1 : 0);
        ADJ.ASC(metadata.A04, r3, 2);
        ADJ.ASC(metadata.A03, r3, 3);
        ADJ.ARt(r3, 4, metadata.A08);
        if (ADJ.EsA(r3, 5) || !0qQ.A0K(metadata.A07, 0sl.A00)) {
            ADJ.AS7(metadata.A07, r5[5], r3, 5);
        }
        if (ADJ.EsA(r3, 6) || metadata.A06 != null) {
            ADJ.AS7(metadata.A06, r5[6], r3, 6);
        }
        C360278eK r2 = C360278eK.A00;
        ADJ.AS7(metadata.A02, r2, r3, 7);
        ADJ.AS7(metadata.A01, r2, r3, 8);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
