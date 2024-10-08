package X;

import com.facebook.flipper.plugins.bloksdebugger.Envolope;
import com.facebook.flipper.plugins.bloksdebugger.Event;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* renamed from: X.WtT  reason: case insensitive filesystem */
public final class C20548WtT implements C255533uI {
    public final /* synthetic */ C255543uJ A00;
    public final /* synthetic */ C255463uA A01;

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        C255543uJ r9 = this.A00;
        C2590240b ADI = decoder.ADI(r9);
        C255463uA[] r7 = Envolope.A02;
        Event event = null;
        long j = 0;
        int i = 0;
        while (true) {
            int ANp = ADI.ANp(r9);
            if (ANp == -1) {
                ADI.AST(r9);
                return new Envolope(event, i, j);
            } else if (ANp == 0) {
                j = ADI.AO2(r9, 0);
                i |= 1;
            } else if (ANp == 1) {
                event = (Event) C13988Tno.A0W(event, r9, ADI, r7, 1);
                i |= 2;
            } else {
                throw new C20799WzB(ANp);
            }
        }
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{C258663zR.A00, Envolope.A02[1]};
    }

    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        Envolope envolope = (Envolope) obj;
        int A1U = AnonymousClass7TF.A1U(0, encoder, envolope);
        C255543uJ r4 = this.A00;
        AnonymousClass484 ADJ = encoder.ADJ(r4);
        C255463uA[] r2 = Envolope.A02;
        ADJ.AS5(r4, 0, envolope.A00);
        ADJ.AS8(envolope.A01, r2[A1U], r4, A1U);
        ADJ.AST(r4);
    }

    public final C255463uA[] typeParametersSerializers() {
        return new C255463uA[]{this.A01};
    }

    @Deprecated(level = C16705V2i.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ C20548WtT(C255463uA r1) {
        this();
        this.A01 = r1;
    }

    public C20548WtT() {
        C255543uJ A0k = C13988Tno.A0k("com.facebook.flipper.plugins.bloksdebugger.Envolope", this);
        A0k.A00("t");
        A0k.A00("d");
        this.A00 = A0k;
    }
}
