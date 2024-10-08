package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.flipper.plugins.uidebugger.model.Bounds;
import com.facebook.flipper.plugins.uidebugger.model.BoxData;
import com.facebook.flipper.plugins.uidebugger.model.Node;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WsP  reason: case insensitive filesystem */
public final class C20483WsP implements C255533uI {
    public static final C20483WsP A00;
    public static final /* synthetic */ C255543uJ A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WsP, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r1 = new C255543uJ("com.facebook.flipper.plugins.uidebugger.model.Node", obj, 13);
        r1.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        r1.A00("parent");
        r1.A00("qualifiedName");
        r1.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r1.A00("boxData");
        r1.A00("attributes");
        r1.A00("inlineAttributes");
        r1.A00("hiddenAttributes");
        r1.A00("bounds");
        r1.A00("tags");
        r1.A00("children");
        r1.A00("activeChild");
        r1.A00("additionalDataCollection");
        A01 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = Node.A0D;
        C360278eK r2 = C360278eK.A00;
        C255463uA A002 = C360578eo.A00(r2);
        C255453u9 r4 = C255453u9.A01;
        return new C255463uA[]{r2, A002, r4, r4, C360578eo.A00(C20460Ws2.A00), r1[5], r1[6], C360578eo.A00(JsonObjectSerializer.A01), C20459Ws1.A00, r1[9], r1[10], C360578eo.A00(r2), C360578eo.A00(AnonymousClass40E.A00)};
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        C255543uJ r12 = A01;
        C2590240b ADI = decoder2.ADI(r12);
        C255463uA[] r10 = Node.A0D;
        List list = null;
        int i = 0;
        Map map = null;
        Integer num = null;
        JsonObject jsonObject = null;
        Map map2 = null;
        Boolean bool = null;
        Set set = null;
        Bounds bounds = null;
        BoxData boxData = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        int i2 = 0;
        while (true) {
            int ANp = ADI.ANp(r12);
            switch (ANp) {
                case -1:
                    ADI.AST(r12);
                    return new Node(bounds, boxData, bool, num2, num, str, str2, list, map2, map, set, jsonObject, i, i2);
                case 0:
                    i2 = ADI.ANz(r12, 0);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) ADI.AO4(num2, C360278eK.A00, r12, 1);
                    i |= 2;
                    break;
                case 2:
                    str = ADI.AOA(r12, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = ADI.AOA(r12, 3);
                    i |= 8;
                    break;
                case 4:
                    boxData = (BoxData) ADI.AO4(boxData, C20460Ws2.A00, r12, 4);
                    i |= 16;
                    break;
                case 5:
                    map2 = (Map) C13988Tno.A0W(map2, r12, ADI, r10, 5);
                    i |= 32;
                    break;
                case 6:
                    map = (Map) C13988Tno.A0W(map, r12, ADI, r10, 6);
                    i |= 64;
                    break;
                case 7:
                    jsonObject = (JsonObject) ADI.AO4(jsonObject, JsonObjectSerializer.A01, r12, 7);
                    i |= 128;
                    break;
                case 8:
                    bounds = (Bounds) ADI.AO5(bounds, C20459Ws1.A00, r12, 8);
                    i |= 256;
                    break;
                case 9:
                    set = (Set) C13988Tno.A0W(set, r12, ADI, r10, 9);
                    i |= 512;
                    break;
                case 10:
                    list = (List) C13988Tno.A0W(list, r12, ADI, r10, 10);
                    i |= 1024;
                    break;
                case 11:
                    num = (Integer) ADI.AO4(num, C360278eK.A00, r12, 11);
                    i |= C249703kE.FLAG_MOVED;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    bool = (Boolean) ADI.AO4(bool, AnonymousClass40E.A00, r12, 12);
                    i |= 4096;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Node node = (Node) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, node);
        C255543uJ r3 = A01;
        AnonymousClass484 ADJ = encoder.ADJ(r3);
        C255463uA[] r6 = Node.A0D;
        ADJ.AS3(r3, 0, node.A00);
        C360278eK r5 = C360278eK.A00;
        ADJ.AS7(node.A05, r5, r3, A1U ? 1 : 0);
        ADJ.ASC(node.A07, r3, 2);
        ADJ.ASC(node.A06, r3, 3);
        ADJ.AS7(node.A02, C20460Ws2.A00, r3, 4);
        ADJ.AS8(node.A09, r6[5], r3, 5);
        ADJ.AS8(node.A0A, r6[6], r3, 6);
        ADJ.AS7(node.A0C, JsonObjectSerializer.A01, r3, 7);
        ADJ.AS8(node.A01, C20459Ws1.A00, r3, 8);
        ADJ.AS8(node.A0B, r6[9], r3, 9);
        ADJ.AS8(node.A08, r6[10], r3, 10);
        ADJ.AS7(node.A04, r5, r3, 11);
        ADJ.AS7(node.A03, AnonymousClass40E.A00, r3, 12);
        ADJ.AST(r3);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
