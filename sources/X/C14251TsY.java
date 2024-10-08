package X;

import com.instagram.business.onelink.cache.FBPageCacheInfo;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.TsY  reason: case insensitive filesystem */
public final /* synthetic */ class C14251TsY implements C255533uI {
    public static final C14251TsY A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new FBPageCacheInfo(str2, str3, str4, str5, str, i, z);
                case 0:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = (String) ADI.AO4(str4, C255453u9.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str5 = (String) ADI.AO4(str5, C255453u9.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z = ADI.ANi(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) ADI.AO4(str, C255453u9.A01, serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.TsY, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.instagram.business.onelink.cache.FBPageCacheInfo", obj, 6);
        r2.A00("pageName");
        r2.A00("pageId");
        r2.A00("adsPageName");
        r2.A00("adsPageId");
        r2.A01("isBPLAndAdsPageConsistent", true);
        r2.A01("pageProfilePicUri", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), AnonymousClass40E.A00, C360578eo.A00(r0)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        FBPageCacheInfo fBPageCacheInfo = (FBPageCacheInfo) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, fBPageCacheInfo);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255453u9 r2 = C255453u9.A01;
        ADJ.AS7(fBPageCacheInfo.A03, r2, serialDescriptor, 0);
        ADJ.AS7(fBPageCacheInfo.A02, r2, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS7(fBPageCacheInfo.A01, r2, serialDescriptor, 2);
        ADJ.AS7(fBPageCacheInfo.A00, r2, serialDescriptor, 3);
        if (ADJ.EsA(serialDescriptor, 4) || fBPageCacheInfo.A05 != A1U) {
            ADJ.ARt(serialDescriptor, 4, fBPageCacheInfo.A05);
        }
        if (ADJ.EsA(serialDescriptor, 5) || fBPageCacheInfo.A04 != null) {
            ADJ.AS7(fBPageCacheInfo.A04, r2, serialDescriptor, 5);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
