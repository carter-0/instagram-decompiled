package X;

import com.instagram.wellbeing.livechat.LiveChatNonceList;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsw  reason: case insensitive filesystem */
public final /* synthetic */ class C20516Wsw implements C255533uI {
    public static final C20516Wsw A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r4 = LiveChatNonceList.A01;
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new LiveChatNonceList(arrayList, i);
            } else if (ANp == 0) {
                arrayList = (ArrayList) C13988Tno.A0W(arrayList, serialDescriptor, ADI, r4, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wsw, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0g = C13990Tnq.A0g("com.instagram.wellbeing.livechat.LiveChatNonceList", obj);
        A0g.A00("liveChatNonceList");
        A01 = A0g;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{LiveChatNonceList.A01[0]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LiveChatNonceList liveChatNonceList = (LiveChatNonceList) obj;
        AnonymousClass7TG.A1N(encoder, liveChatNonceList);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(liveChatNonceList.A00, LiveChatNonceList.A01[0], serialDescriptor, 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
