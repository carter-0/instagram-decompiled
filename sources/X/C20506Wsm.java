package X;

import com.instagram.business.onelink.cache.BusinessAccountCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsm  reason: case insensitive filesystem */
public final /* synthetic */ class C20506Wsm implements C255533uI {
    public static final C20506Wsm A00;
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
                return new BusinessAccountCacheInfo(str, str2, i);
            } else if (ANp == 0) {
                str = C13988Tno.A0f(str, serialDescriptor, ADI, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = C13988Tno.A0f(str2, serialDescriptor, ADI, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Wsm, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ A0k = C13988Tno.A0k("com.instagram.business.onelink.cache.BusinessAccountCacheInfo", obj);
        A0k.A00("businessName");
        A0k.A00("businessId");
        A01 = A0k;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r0), C360578eo.A00(r0)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BusinessAccountCacheInfo businessAccountCacheInfo = (BusinessAccountCacheInfo) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, businessAccountCacheInfo);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255453u9 r1 = C255453u9.A01;
        ADJ.AS7(businessAccountCacheInfo.A01, r1, serialDescriptor, 0);
        ADJ.AS7(businessAccountCacheInfo.A00, r1, serialDescriptor, A1U ? 1 : 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
