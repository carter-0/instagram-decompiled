package X;

import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.9Gf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C376019Gf implements C255533uI {
    public static final C376019Gf A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new WhatsAppBusinessCacheInfo(str, str2, i, z3, z, z2);
            } else if (ANp == 0) {
                str = (String) ADI.AO4(str, C255453u9.A01, serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                z3 = ADI.ANi(serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                z = ADI.ANi(serialDescriptor, 3);
                i |= 8;
            } else if (ANp == 4) {
                z2 = ADI.ANi(serialDescriptor, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.3uI, X.9Gf] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo", obj, 5);
        r2.A01("linkedPhoneNumber", false);
        r2.A01("linkedAccountType", false);
        r2.A01("isRiskyTierAccountForCtwa", false);
        r2.A01("isWhatsAppNumberBanned", false);
        r2.A01("isBusinessVerificationEligible", false);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        C255463uA A002 = C360578eo.A00(r0);
        C255463uA A003 = C360578eo.A00(r0);
        AnonymousClass40E r02 = AnonymousClass40E.A00;
        return new C255463uA[]{A002, A003, r02, r02, r02};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = (WhatsAppBusinessCacheInfo) obj;
        0qQ.A0B(encoder, 0);
        0qQ.A0B(whatsAppBusinessCacheInfo, 1);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255453u9 r1 = C255453u9.A01;
        ADJ.AS7(whatsAppBusinessCacheInfo.A01, r1, serialDescriptor, 0);
        ADJ.AS7(whatsAppBusinessCacheInfo.A00, r1, serialDescriptor, 1);
        ADJ.ARt(serialDescriptor, 2, whatsAppBusinessCacheInfo.A03);
        ADJ.ARt(serialDescriptor, 3, whatsAppBusinessCacheInfo.A04);
        ADJ.ARt(serialDescriptor, 4, whatsAppBusinessCacheInfo.A02);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
