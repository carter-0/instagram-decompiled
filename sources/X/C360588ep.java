package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8ep  reason: invalid class name and case insensitive filesystem */
public final class C360588ep implements C255463uA {
    public final C255463uA A00;
    public final SerialDescriptor A01;

    public final Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        if (decoder.AO3()) {
            return decoder.AO6(this.A00);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && 0qQ.A0K(this.A00, ((C360588ep) obj).A00));
    }

    public final void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        if (obj != null) {
            encoder.AS9(obj, this.A00);
        } else {
            encoder.AS6();
        }
    }

    public final SerialDescriptor getDescriptor() {
        return this.A01;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C360588ep(C255463uA r3) {
        this.A00 = r3;
        this.A01 = new C360598eq(r3.getDescriptor());
    }
}
