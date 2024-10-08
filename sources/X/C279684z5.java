package X;

import com.instagram.trust.noncemanager.NonceUserMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.4z5  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C279684z5 implements C255533uI {
    public static final C279684z5 A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        C255463uA[] r4 = NonceUserMap.A01;
        Map map = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new NonceUserMap(map, i);
            } else if (ANp == 0) {
                map = (Map) ADI.AO5(map, r4[0], serialDescriptor, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4z5, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.trust.noncemanager.NonceUserMap", obj, 1);
        r2.A01("nonceUserMap", false);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{NonceUserMap.A01[0]};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        NonceUserMap nonceUserMap = (NonceUserMap) obj;
        0qQ.A0B(encoder, 0);
        0qQ.A0B(nonceUserMap, 1);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(nonceUserMap.A00, NonceUserMap.A01[0], serialDescriptor, 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
