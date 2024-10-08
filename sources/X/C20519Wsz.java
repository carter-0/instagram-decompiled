package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.shopify.checkout.models.Address;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.Wsz  reason: case insensitive filesystem */
public final /* synthetic */ class C20519Wsz implements C255533uI {
    public static final C20519Wsz A00;
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
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            switch (ANp) {
                case -1:
                    ADI.AST(serialDescriptor);
                    return new Address(str, str11, str9, str10, str8, str5, str7, str4, str3, str2, str6, i);
                case 0:
                    str = C13990Tnq.A0b(str, serialDescriptor, ADI, 0);
                    i |= 1;
                    break;
                case 1:
                    str11 = (String) ADI.AO4(str11, C255453u9.A01, serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str9 = (String) ADI.AO4(str9, C255453u9.A01, serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str10 = (String) ADI.AO4(str10, C255453u9.A01, serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str8 = (String) ADI.AO4(str8, C255453u9.A01, serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) ADI.AO4(str5, C255453u9.A01, serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) ADI.AO4(str7, C255453u9.A01, serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str4 = (String) ADI.AO4(str4, C255453u9.A01, serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str3 = (String) ADI.AO4(str3, C255453u9.A01, serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str2 = (String) ADI.AO4(str2, C255453u9.A01, serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str6 = C13990Tnq.A0b(str6, serialDescriptor, ADI, 10);
                    i |= 1024;
                    break;
                default:
                    throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Wsz, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.shopify.checkout.models.Address", obj, 11);
        r2.A01("referenceId", true);
        r2.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, true);
        r2.A01("firstName", true);
        r2.A01("lastName", true);
        r2.A01("postalCode", true);
        r2.A01("address1", true);
        r2.A01("address2", true);
        r2.A01(ServerW3CShippingAddressConstants.CITY, true);
        r2.A01("countryCode", true);
        r2.A01("zoneCode", true);
        r2.A01("phone", true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r0 = C255453u9.A01;
        return new C255463uA[]{C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0), C360578eo.A00(r0)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Address address = (Address) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, address);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        if (ADJ.EsA(serialDescriptor, 0) || address.A09 != null) {
            ADJ.AS7(address.A09, C255453u9.A01, serialDescriptor, 0);
        }
        if (ADJ.EsA(serialDescriptor, A1U ? 1 : 0) || address.A06 != null) {
            ADJ.AS7(address.A06, C255453u9.A01, serialDescriptor, A1U);
        }
        if (ADJ.EsA(serialDescriptor, 2) || address.A04 != null) {
            ADJ.AS7(address.A04, C255453u9.A01, serialDescriptor, 2);
        }
        if (ADJ.EsA(serialDescriptor, 3) || address.A05 != null) {
            ADJ.AS7(address.A05, C255453u9.A01, serialDescriptor, 3);
        }
        if (ADJ.EsA(serialDescriptor, 4) || address.A08 != null) {
            ADJ.AS7(address.A08, C255453u9.A01, serialDescriptor, 4);
        }
        if (ADJ.EsA(serialDescriptor, 5) || address.A00 != null) {
            ADJ.AS7(address.A00, C255453u9.A01, serialDescriptor, 5);
        }
        if (ADJ.EsA(serialDescriptor, 6) || address.A01 != null) {
            ADJ.AS7(address.A01, C255453u9.A01, serialDescriptor, 6);
        }
        if (ADJ.EsA(serialDescriptor, 7) || address.A02 != null) {
            ADJ.AS7(address.A02, C255453u9.A01, serialDescriptor, 7);
        }
        if (ADJ.EsA(serialDescriptor, 8) || address.A03 != null) {
            ADJ.AS7(address.A03, C255453u9.A01, serialDescriptor, 8);
        }
        if (ADJ.EsA(serialDescriptor, 9) || address.A0A != null) {
            ADJ.AS7(address.A0A, C255453u9.A01, serialDescriptor, 9);
        }
        if (ADJ.EsA(serialDescriptor, 10) || address.A07 != null) {
            ADJ.AS7(address.A07, C255453u9.A01, serialDescriptor, 10);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
