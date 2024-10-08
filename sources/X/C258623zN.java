package X;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3zN  reason: invalid class name and case insensitive filesystem */
public abstract class C258623zN extends C258633zO {
    public final C255463uA A00;
    public final C255463uA A01;

    public final void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        A01(obj);
        SerialDescriptor descriptor = getDescriptor();
        0qQ.A0B(descriptor, 1);
        AnonymousClass484 ADJ = encoder.ADJ(descriptor);
        Iterator A05 = A05(obj);
        int i = 0;
        while (A05.hasNext()) {
            Map.Entry entry = (Map.Entry) A05.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            ADJ.AS8(key, this.A00, descriptor, i);
            i = i2 + 1;
            ADJ.AS8(value, this.A01, descriptor, i2);
        }
        ADJ.AST(descriptor);
    }

    public final SerialDescriptor getDescriptor() {
        if (this instanceof AnonymousClass40T) {
            return ((AnonymousClass40T) this).A00;
        }
        return ((C258613zM) this).A00;
    }

    public C258623zN(C255463uA r1, C255463uA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
