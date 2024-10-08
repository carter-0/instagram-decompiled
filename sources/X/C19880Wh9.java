package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.Wh9  reason: case insensitive filesystem */
public final class C19880Wh9 implements Iterable, C62650uo {
    public final /* synthetic */ SerialDescriptor A00;

    public C19880Wh9(SerialDescriptor serialDescriptor) {
        this.A00 = serialDescriptor;
    }

    public final Iterator iterator() {
        return new C20385WqR(this.A00);
    }
}
