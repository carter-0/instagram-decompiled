package X;

import com.instagram.wellbeing.livechat.LiveChatNonce;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsv  reason: case insensitive filesystem */
public final /* synthetic */ class C20515Wsv implements C255533uI {
    public static final C20515Wsv A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new LiveChatNonce(str, str2, str3, i);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 1);
                i |= 2;
            } else if (ANp == 2) {
                str3 = C13988Tno.A0f(str3, serialDescriptor, ADI, 2);
                i |= 4;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.Wsv, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0l = C13988Tno.A0l("com.instagram.wellbeing.livechat.LiveChatNonce", obj);
        A0l.A00("userId");
        A0l.A00("nonce");
        A0l.A00("supportUid");
        A01 = A0l;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r2 = C255453u9.A01;
        return new C255463uA[]{r2, C360578eo.A00(r2), C360578eo.A00(r2)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        LiveChatNonce liveChatNonce = (LiveChatNonce) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, liveChatNonce);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(liveChatNonce.A02, serialDescriptor, 0);
        C255453u9 r2 = C255453u9.A01;
        ADJ.AS7(liveChatNonce.A00, r2, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS7(liveChatNonce.A01, r2, serialDescriptor, 2);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
