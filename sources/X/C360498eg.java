package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.8eg  reason: invalid class name and case insensitive filesystem */
public final class C360498eg implements C255463uA {
    public static final C360498eg A01 = new C360498eg();
    public final /* synthetic */ C360508eh A00 = new C360508eh("X.0gF", C60340gF.A00);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        this.A00.deserialize(decoder);
        return C60340gF.A00;
    }

    public final SerialDescriptor getDescriptor() {
        return this.A00.getDescriptor();
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        0qQ.A0B(obj, 1);
        this.A00.serialize(encoder, obj);
    }
}
