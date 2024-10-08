package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.3zM  reason: invalid class name and case insensitive filesystem */
public final class C258613zM extends C258623zN {
    public final SerialDescriptor A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C258613zM(C255463uA r5, C255463uA r6) {
        super(r5, r6);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        SerialDescriptor descriptor = r5.getDescriptor();
        SerialDescriptor descriptor2 = r6.getDescriptor();
        0qQ.A0B(descriptor, 1);
        0qQ.A0B(descriptor2, 2);
        this.A00 = new C258693zU("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }
}
