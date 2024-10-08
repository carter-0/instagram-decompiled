package X;

import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WqR  reason: case insensitive filesystem */
public final class C20385WqR implements Iterator, C62650uo {
    public int A00;
    public final /* synthetic */ SerialDescriptor A01;

    public C20385WqR(SerialDescriptor serialDescriptor) {
        this.A01 = serialDescriptor;
        this.A00 = serialDescriptor.B0a();
    }

    public final boolean hasNext() {
        return AnonymousClass7TF.A1R(this.A00);
    }

    public final /* bridge */ /* synthetic */ Object next() {
        SerialDescriptor serialDescriptor = this.A01;
        int B0a = serialDescriptor.B0a();
        int i = this.A00;
        this.A00 = i - 1;
        return serialDescriptor.B0V(B0a - i);
    }

    public final void remove() {
        throw Pxh.A0s();
    }
}
