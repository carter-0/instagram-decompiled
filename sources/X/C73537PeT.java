package X;

import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import libraries.zero.headers.ZeroHeadersEntry;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeT  reason: case insensitive filesystem */
public final /* synthetic */ class C73537PeT implements C255533uI {
    public static final SerialDescriptor A00;
    public static final C73537PeT A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A00;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new ZeroHeadersEntry(str, str2, i4, i3, i, i2);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i4 |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i4 |= 2;
            } else if (ANp == 2) {
                i3 = ADI.ANz(serialDescriptor, 2);
                i4 |= 4;
            } else if (ANp == 3) {
                i = ADI.ANz(serialDescriptor, 3);
                i4 |= 8;
            } else if (ANp == 4) {
                i2 = ADI.ANz(serialDescriptor, 4);
                i4 |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.PeT, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A01 = obj;
        C255543uJ r1 = new C255543uJ("libraries.zero.headers.ZeroHeadersEntry", obj, 5);
        r1.A00("encryptedMsisdn");
        r1.A00("maskedMsisdn");
        r1.A00("carrierId");
        r1.A00("createdAt");
        r1.A00("expiredAt");
        A00 = r1;
    }

    public final C255463uA[] childSerializers() {
        C255453u9 r1 = C255453u9.A01;
        C360278eK r0 = C360278eK.A00;
        return new C255463uA[]{r1, r1, r0, r0, r0};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        ZeroHeadersEntry zeroHeadersEntry = (ZeroHeadersEntry) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, zeroHeadersEntry);
        SerialDescriptor serialDescriptor = A00;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.ASC(zeroHeadersEntry.A03, serialDescriptor, 0);
        ADJ.ASC(zeroHeadersEntry.A04, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS3(serialDescriptor, 2, zeroHeadersEntry.A00);
        ADJ.AS3(serialDescriptor, 3, zeroHeadersEntry.A01);
        ADJ.AS3(serialDescriptor, 4, zeroHeadersEntry.A02);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
