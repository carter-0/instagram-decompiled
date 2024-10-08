package X;

import com.meta.flytrap.attachment.model.AttachmentCounter;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly")
/* renamed from: X.PeU  reason: case insensitive filesystem */
public final /* synthetic */ class C73538PeU implements C255533uI {
    public final SerialDescriptor A00;
    public final /* synthetic */ C255463uA A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = this.A00;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                return new AttachmentCounter(arrayList, i);
            } else if (ANp == 0) {
                arrayList = (ArrayList) ADI.AO5(arrayList, new AnonymousClass409(this.A01), serialDescriptor, 0);
                i |= 1;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{new AnonymousClass409(this.A01)};
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AttachmentCounter attachmentCounter = (AttachmentCounter) obj;
        AnonymousClass7TG.A1N(encoder, attachmentCounter);
        SerialDescriptor serialDescriptor = this.A00;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        C255463uA r1 = this.A01;
        SerialDescriptor serialDescriptor2 = AttachmentCounter.A01;
        ADJ.AS8(attachmentCounter.A00, new AnonymousClass409(r1), serialDescriptor, 0);
        ADJ.AST(serialDescriptor);
    }

    public final C255463uA[] typeParametersSerializers() {
        return new C255463uA[]{this.A01};
    }

    public C73538PeU() {
        C255543uJ r1 = new C255543uJ("com.meta.flytrap.attachment.model.AttachmentCounter", this, 1);
        r1.A00("stack");
        this.A00 = r1;
    }

    public C73538PeU(C255463uA r1) {
        this();
        this.A01 = r1;
    }
}
