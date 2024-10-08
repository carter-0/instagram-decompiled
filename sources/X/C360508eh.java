package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eh  reason: invalid class name and case insensitive filesystem */
public final class C360508eh implements C255463uA {
    public List A00 = 0sn.A00;
    public final Object A01;
    public final AnonymousClass0eM A02;

    public final Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C2590240b ADI = decoder.ADI(descriptor);
        int ANp = ADI.ANp(getDescriptor());
        if (ANp == -1) {
            ADI.AST(descriptor);
            return this.A01;
        }
        throw new IllegalArgumentException(002.A0O(AnonymousClass000.A00(2520), ANp));
    }

    public final void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        encoder.ADJ(getDescriptor()).AST(getDescriptor());
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public C360508eh(String str, Object obj) {
        this.A01 = obj;
        this.A02 = AnonymousClass0eN.A00(0eO.A03, new C360518ei(str, this));
    }
}
