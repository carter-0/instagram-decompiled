package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.meta.flytrap.attachment.model.BugReportAttachment;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource;
import com.meta.flytrap.attachment.model.BugReportAttachmentMediaType;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeS  reason: case insensitive filesystem */
public final /* synthetic */ class C73536PeS implements C255533uI {
    public static final C73536PeS A00;
    public static final SerialDescriptor A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        Decoder decoder2 = decoder;
        0qQ.A0B(decoder2, 0);
        SerialDescriptor serialDescriptor = A01;
        C2590240b ADI = decoder2.ADI(serialDescriptor);
        C255463uA[] r9 = BugReportAttachment.A05;
        String str = null;
        String str2 = null;
        BugReportAttachmentMediaType bugReportAttachmentMediaType = null;
        BugReportAttachmentMediaSource bugReportAttachmentMediaSource = null;
        boolean z = false;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new BugReportAttachment(bugReportAttachmentMediaSource, bugReportAttachmentMediaType, str, str2, i, z);
            } else if (ANp == 0) {
                str = ADI.AOA(serialDescriptor, 0);
                i |= 1;
            } else if (ANp == 1) {
                str2 = ADI.AOA(serialDescriptor, 1);
                i |= 2;
            } else if (ANp == 2) {
                bugReportAttachmentMediaType = (BugReportAttachmentMediaType) ADI.AO5(bugReportAttachmentMediaType, r9[2], serialDescriptor, 2);
                i |= 4;
            } else if (ANp == 3) {
                bugReportAttachmentMediaSource = (BugReportAttachmentMediaSource) ADI.AO5(bugReportAttachmentMediaSource, r9[3], serialDescriptor, 3);
                i |= 8;
            } else if (ANp == 4) {
                z = ADI.ANi(serialDescriptor, 4);
                i |= 16;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.PeS, java.lang.Object, X.3uI] */
    static {
        ? obj = new Object();
        A00 = obj;
        C255543uJ r2 = new C255543uJ("com.meta.flytrap.attachment.model.BugReportAttachment", obj, 5);
        r2.A00("path");
        r2.A00("generatorName");
        r2.A00("mediaType");
        r2.A00("mediaSource");
        r2.A01(BaseJavaModule.METHOD_TYPE_ASYNC, true);
        A01 = r2;
    }

    public final C255463uA[] childSerializers() {
        C255463uA[] r1 = BugReportAttachment.A05;
        C255453u9 r3 = C255453u9.A01;
        return new C255463uA[]{r3, r3, r1[2], r1[3], AnonymousClass40E.A00};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        BugReportAttachment bugReportAttachment = (BugReportAttachment) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, bugReportAttachment);
        SerialDescriptor serialDescriptor = A01;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA[] r6 = BugReportAttachment.A05;
        ADJ.ASC(bugReportAttachment.A03, serialDescriptor, 0);
        ADJ.ASC(bugReportAttachment.A02, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS8(bugReportAttachment.A01, r6[2], serialDescriptor, 2);
        ADJ.AS8(bugReportAttachment.A00, r6[3], serialDescriptor, 3);
        if (ADJ.EsA(serialDescriptor, 4) || bugReportAttachment.A04 != A1U) {
            ADJ.ARt(serialDescriptor, 4, bugReportAttachment.A04);
        }
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
