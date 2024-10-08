package X;

import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.Vp3  reason: case insensitive filesystem */
public abstract class C18283Vp3 {
    public static final C2590340d A00(Decoder decoder) {
        C2590340d r0;
        if ((decoder instanceof C2590340d) && (r0 = (C2590340d) decoder) != null) {
            return r0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        throw new IllegalStateException(AnonymousClass7TF.A0i(C51969G9p.A0x(decoder), sb));
    }

    public static final void A01(Encoder encoder) {
        if (!(encoder instanceof AnonymousClass483) || encoder == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
            throw new IllegalStateException(AnonymousClass7TF.A0i(C51969G9p.A0x(encoder), sb));
        }
    }
}
