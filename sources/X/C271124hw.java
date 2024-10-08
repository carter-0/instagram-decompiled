package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public final class C271124hw implements C255533uI {
    public final /* synthetic */ C255463uA A00;

    public C271124hw(C255463uA r1) {
        this.A00 = r1;
    }

    public final C255463uA[] childSerializers() {
        return new C255463uA[]{this.A00};
    }

    public final Object deserialize(Decoder decoder) {
        throw new IllegalStateException("unsupported");
    }

    public final SerialDescriptor getDescriptor() {
        throw new IllegalStateException("unsupported");
    }

    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("unsupported");
    }

    public final C255463uA[] typeParametersSerializers() {
        return VKO.A00;
    }
}
